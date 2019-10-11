package org.noob.codewars.train.xiaomage.sg20190710;

import java.util.HashSet;
import java.util.Set;

/**
 * 2019.07.10 期
 * https://segmentfault.com/q/1010000019716098
 *
 * 以上程序输出内容是？
 *
 * (a) true
 * (b) false
 * (c) 程序编译错误
 * (d) 以上都不是
 */
public class Name {
    private String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(new Name("Mickey", "Mouse"));
        System.out.println(s.contains(new Name("Mickey", "Mouse")));
    }
    //没有重写equals()方法，走的是Object的equals()，和 == 一样。比较的是地址值
    public boolean equals(Name o) {
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        //Name name = (Name) o;
        return first.equals(o.first) && last.equals(o.last);

    }


    //@Override
    //public boolean equals(Object o) {
    //    //if (this == o) return true;
    //    //if (o == null || getClass() != o.getClass()) return false;
    //    Name name = (Name) o;
    //    return first.equals(name.first) && last.equals(name.last);
    //}

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }
}
