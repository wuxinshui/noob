package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BlockQueue
 * @author: [Wuxinshui]
 * @CreateDate: 2017/7/25 18:25
 * @UpdateUser: [FujiRen]
 * @UpdateDate: 2017/7/25 18:25
 * @UpdateRemark: [说明本次修改内容]
 * @Description:  阻塞队列。方法pop()从队列中获取第一个数据，并返回，如果队列为空，则等待一个有效的对象；
 * 方法put()将一个对象保存到队列中，并通知一个在等待中的pop()方法。
 * 为了有效控制线程间的协作，需要配合使用synchronized以及notify()和wait()等方法。
 * @version: [V1.0]
 */
public class BlockQueue {
	List list = new ArrayList<>();

	public static void main(String[] args) {
		BlockQueue synchronizedThreadTest=new BlockQueue();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					synchronizedThreadTest.pop();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronizedThreadTest.put("ss");
			}
		}).start();
	}

	private synchronized Object pop() throws InterruptedException {
		//如果队列为空则等待
		while (list.size() == 0) {
			this.wait();
		}
		//队列不为空，则返回一个对象
		if (list.size() > 0) {
			return list.remove(0);
		} else {
			return null;
		}
	}

	private synchronized void put(Object o) {
		//增加对象到队列中
		list.add(o);
		//通知一个pop()方法，可以取得数据
		this.notify();
	}
}
