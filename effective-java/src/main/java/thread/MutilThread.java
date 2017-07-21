package thread;

/**
 * @Description:
 * @Author:FujiRen
 * @Date:2017/7/20 15:11
 * <p>
 * <p>
 * 1.start（）方法来启动线程，真正实现了多线程运行。这时无需等待run方法体代码执行完毕，可以直接继续执行下面的代码；通过调用Thread类的start()方法来启动一个线程， 这时此线程是处于就绪状态， 并没有运行。 然后通过此Thread类调用方法run()来完成其运行操作的， 这里方法run()称为线程体，它包含了要执行的这个线程的内容， Run方法运行结束， 此线程终止。然后CPU再调度其它线程。
 * 2.run（）方法当作普通方法的方式调用。程序还是要顺序执行，要等待run方法体执行完毕后，才可继续执行下面的代码； 程序中只有主线程——这一个线程， 其程序执行路径还是只有一条， 这样就没有达到写线程的目的。
 * 记住：多线程就是分时利用CPU，宏观上让所有线程一起执行 ，也叫并发
 */
public class MutilThread {
	public static void main(String[] args) {
		Runner1 runner1 = new Runner1();
		Runner2 runner2 = new Runner2();
//      Thread(Runnable target) 分配新的 Thread 对象。
		Thread thread1 = new Thread(runner1);
		Thread thread2 = new Thread(runner2);
		//start()能实现多线程并发执行
		//thread1.start();
		//thread2.start();
		//多线程顺序执行
		thread1.run();
		thread2.run();
	}
}

class Runner1 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("进入Runner1运行状态——————————" + i);
		}
	}
}

class Runner2 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("进入Runner2运行状态==========" + i);
		}
	}
}
