package collections.list.arrayList;

/**
 * @Description:
 * @Author:Wuxinshui
 * @Date:2017/7/20 14:59
 */
public class ArrayListConcurrentTest {
	public static void main(String[] args) {
		ArrayListConcurrent concurrent = new ArrayListConcurrent();

		//线程1
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("进入Runner1运行状态——————————" + i);
					concurrent.test("Runner1",1);
				}
			}
		});

		//线程2
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("进入Runner2运行状态——————————" + i);
					concurrent.test("Runner2",4);
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}
