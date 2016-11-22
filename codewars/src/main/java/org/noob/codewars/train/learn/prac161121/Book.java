package org.noob.codewars.train.learn.prac161121;

/**
 * Created with IntelliJ IDEA.
 * User: FujiRen
 * Date: 2016/11/21
 * Time: 18:13
 * To change this template use File | Settings | File Templates.
 */
public abstract class Book {
    String title;
    String author;

    Book(String t, String a){
        title=t;
        author=a;
    }

    abstract void display();
}
