package org.noob.codewars.train.learn.prac161121;

/**
 * Created with IntelliJ IDEA.
 * User: FujiRen
 * Date: 2016/11/21
 * Time: 18:31
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        String title="Java编程思想";
        String author="aa";
        int price=46;

        Book myBook=new MyBook(title,author,price);
        myBook.display();

    }
}
