package org.noob.codewars.train.learn.prac2016.prac160319;

/**
 * Created with IntelliJ IDEA.
 * User: FujiRen
 * Date: 2016/11/23
 * Time: 14:34
 * To change this template use File | Settings | File Templates.
 */
public class ForFor {


    public static void main(String[] args) {
        positiveTriangle();
        System.out.println();
        System.out.println("===========================");
        System.out.println();
        invertedTriangle();
        System.out.println("===========================");
        System.out.println();
        multiply();
    }

    /**
     * 正三角形
     */
    public static void positiveTriangle(){
        int length=6;
        for (int i=1;i<=length;i++){
            for (int k=0;k<length-i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * 倒三角形
     */
    public static void invertedTriangle(){
        int length=6;
        for (int i=1;i<=length;i++){
            for (int k=length-1;k>=length-i;k--){
                System.out.print(" ");
            }
            for (int j=length;j>=i;j--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void  multiply(){

        for (int i=1;i<=9;i++){
            for (int j=1;j<=9;j++){
                System.out.print(i+" * "+j+" = "+(i*j)+"  ");
            }
            System.out.println();
        }
    }




    public void switchFor(){
        int a='v';
        switch (a){
            case 1:
                System.out.println("1a");
                break;
            case 2:
                System.out.println("2a");
                break;
            case 3:
                System.out.println("3a");
                break;
            case 10:
                System.out.println("10a");
                break;
            default:
                System.out.println("aa");
        }
    }
}
