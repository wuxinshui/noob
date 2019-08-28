package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/8/28 16:12
 */
public class ListBeanSort {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student(12,"Ricky"),new Student(24,"Dan"),new Student(30,"Cusy"));

        students.parallelStream().sorted(Comparator.comparing(Student::getAge));

        System.out.println(students);
    }


   static class Student {
        private int age;
        private String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
