package java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/8/28 16:12
 */
public class ListBeanSort {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student(42, "Ricky"), new Student(24, "Dan"), new Student(30, "Cusy"));

        //升序排列
        students = students.parallelStream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());

        System.out.println("升排列。。。。。。。。。");
        students.parallelStream().forEach(o -> {
            System.out.println(o);
        });

        //降序排列
        students = students.parallelStream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        System.out.println("降序排列。。。。。。。。。");
        students.parallelStream().forEach(System.out::println);
    }


    static class Student {
        private int age;
        private String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
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
