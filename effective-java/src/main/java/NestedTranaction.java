/**
 * @Description:
 * @Author:Wuxinshui
 * @Date:2017/6/26 11:20
 * <p>
 * 嵌套事务
 */
//TODO write blog about 嵌套事务
public class NestedTranaction {

	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			print1("s2", "s2");
			print2("s3");
			print3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void print1(String s1, String s2) throws Exception {
		try {
			System.out.println(s1 + s2);
			throw new Exception();
//			return s1 + s2;
		} catch (Exception e) {
			e.printStackTrace();
//			throw e;
		}
	}

	public static void print2(String s3) throws Exception {
		try {
			System.out.println(s3);
			throw new Exception();
//			return s3;
		} catch (Exception e) {
			e.printStackTrace();
//			throw e;
		}
	}

	public static void print3() {
		System.out.println("print3");
	}
}
