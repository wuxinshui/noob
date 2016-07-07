package org.noob.thinking.chapter5.forEnum;

public class EnumTest {
	private Money mon;

	public enum Money {
		ONE, TOWE, TEN, FIFTY, HUANDRED
	}

	public EnumTest(Money mons) {
		this.mon = mons;
	}
	
	public void describe(){
		switch(mon){
		case ONE:
			System.out.println("This is "+mon);
			break;
		case TOWE:
			System.out.println("This is "+mon);
			break;
		case TEN:
			System.out.println("This is "+mon);
			break;
		case FIFTY:
			System.out.println("This is "+mon);
			break;
		case HUANDRED:
			System.out.println("This is "+mon);
			break;
		}
	}

	public static void main(String[] args) {
		for (Money mo : Money.values()) {
			//System.out.println(mo.compareTo(Money.ONE));
			System.out.print(mo+" "+mo.ordinal() + " " + mo.name());
			System.out.println();
		}
		
		EnumTest emt=new EnumTest(Money.FIFTY);
		emt.describe();
	}
}
