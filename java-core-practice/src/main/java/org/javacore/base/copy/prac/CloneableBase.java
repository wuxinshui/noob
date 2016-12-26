package org.javacore.base.copy.prac;

import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.Converter;

import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
*  Copyright [2016/12/26] [Wuxinshui]
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

/**
 * Created by FujiRen on 2016/12/22.
 */
public class CloneableBase implements ICloneable {
    private static ConcurrentMap<Class<?>, BeanCopier> beanCopiers = new ConcurrentHashMap<Class<?>, BeanCopier>();

    @Override
    public Object clone()
    {
        try
        {
            Object clone = this.getClass().newInstance();

            BeanCopier copier = _createCopier(this.getClass());

            copier.copy(this, clone, new Converter()
            {
                @Override
                public Object convert(Object pojo, Class fieldType, Object fieldName)
                {
                    return _clone(pojo);
                }
            });

            return clone;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    private static Object _clone(Object bean)
    {
        if (bean == null)
        {
            return null;
        }
        else if (bean instanceof ICloneable)
        {
            return ((ICloneable) bean).clone();
        }
        else
        {

            if (bean.getClass().isArray() && !bean.getClass().getComponentType().equals(byte.class))
            {
                int length = Array.getLength(bean);
                Object clone = Array.newInstance(bean.getClass().getComponentType(), length);
                for (int i = 0; i < length; i++)
                {
                    Array.set(clone, i, _clone(Array.get(bean, i)));
                }
                return clone;
            }
            else
            {
                return bean;
            }
        }
    }

    private static BeanCopier _createCopier(Class<?> clz)
    {
        if (beanCopiers.containsKey(clz))
            return beanCopiers.get(clz);
        beanCopiers.putIfAbsent(clz, BeanCopier.create(clz, clz, true));
        return beanCopiers.get(clz);

    }
}
