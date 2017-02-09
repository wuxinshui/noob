package chapter2.item3;

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

import java.io.*;

/**
 * Created by wuxinshui on 2017/2/9.
 */
public class SerSingletonTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerSingleton serSingleton=null;
		SerSingleton serSingleton1=SerSingleton.getInstance();
		//先将实例串行化到文件
		FileOutputStream fos=new FileOutputStream("object.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(serSingleton1);
		oos.flush();
		//从文件读出原有的单例类
		FileInputStream fis=new FileInputStream("object.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		 serSingleton=(SerSingleton)ois.readObject();
		System.out.println(serSingleton.getClass());
		System.out.println(serSingleton==serSingleton1);
	}
}
