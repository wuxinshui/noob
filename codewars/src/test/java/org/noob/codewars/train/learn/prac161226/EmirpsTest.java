package org.noob.codewars.train.learn.prac161226;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


/**
 * Copyright [2016$] [Wuxinshui]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Created by wuxinshui on 2016/12/27.
 */
public class EmirpsTest {
    @Test
    public void reverse() throws Exception {
        long l=10l;
        System.out.println(Emirps.reverse(l));
    }

    @Test
    public void sort() throws Exception {
        Long[] longs={23l,37l,11l,47l};
        Emirps.sort(longs);
        System.out.println(Arrays.toString(longs));
    }

    @Test
    public void isPrimeNum() throws Exception {
        long l=15l;
        System.out.println(Emirps.isPrimeNum(l));
    }

    @Test
    public void sum() throws Exception {
        Long[] longs={23l,37l,11l,47l};
        System.out.println(Emirps.sum(longs));
    }

}