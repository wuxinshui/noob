package chapter8.item47;

import java.util.Random;

/**
 * <p>RandomTest</p>
 *
 * @author wuxinshui
 */
public class RandomTest {
    public static void main(String[] args) {
        //随机数会重复
        for (int i = 0; i < 20; i++) {
            System.out.println(random(4));;
        }

        int n=2*(Integer.MAX_VALUE/3);
        int low=0;
        for (int i = 0; i < 1000000; i++) {
            if (random(n)<n/2){
                low++;
            }
        }
        System.out.println(low);

    }

    private static int random(int n){
        Random random=new Random();
        return Math.abs(random.nextInt())%n;
    }


}
