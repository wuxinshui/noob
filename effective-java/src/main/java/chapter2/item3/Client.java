package chapter2.item3;

import java.io.*;

/**
 * Created by Administrator on 2017/2/8.
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(Elvis.INSTANCE);
        Elvis elvis=Elvis.INSTANCE;
        elvis.leaveTheBuilding();

        //序列化和反序列化
        FileOutputStream fos=new FileOutputStream("elvis.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(elvis);
		oos.flush();

		FileInputStream fis=new FileInputStream("elvis.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		 Elvis elvis1= (Elvis) ois.readObject();

		System.out.println("序列化前的对象和序列化后的对象比较："+(elvis==elvis1));

    }
}
