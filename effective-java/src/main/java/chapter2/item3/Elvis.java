package chapter2.item3;

/**
 * Created by Administrator on 2017/2/8.
 */
//最简洁的单例模式
//无偿地提供了序列化机制，绝对防止多次实例化
public enum Elvis {
    INSTANCE;
    public void leaveTheBuilding(){
        System.out.println("This is enum method leaveTheBuilding");
    }
}
