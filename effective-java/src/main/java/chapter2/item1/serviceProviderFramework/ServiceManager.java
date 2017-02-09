package chapter2.item1.serviceProviderFramework;

/**
 * Copyright [2017$] [Wuxinshui]
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

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wuxinshui on 2017/2/6.
 * 服务管理类
 */
//Noninstantiable class for service registration and access
public class ServiceManager {

	//Prevents instantiation
	//阻止实例化，只能通过服务访问API来获取实例
	private ServiceManager() {
	}

	//Maps service names to services
	private static final Map<String, ServiceProvider> providers = new ConcurrentHashMap<>();

	public static final String DEFAULT_PROVIDER_NAME = "def";

	//ServiceProvider registration API
	public static void registDefaultProvider(ServiceProvider p) {
		registProvider(DEFAULT_PROVIDER_NAME, p);
	}

	public static void registProvider(String name, ServiceProvider p) {
		providers.put(name, p);
	}

	//ServiceInterface access API
	public static ServiceInterface newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

	public static ServiceInterface newInstance(String name) {
		ServiceProvider p = providers.get(name);
		if (null == p) {
			throw new IllegalArgumentException("No provider registered with name " + name);
		}
		return p.newService();
	}
}
