package java8.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/7/25 16:40
 */
public class OpTest {

    private static User testOptionalList() {
        List<String> names = Stream.of("1", "2", "3", "4").collect(Collectors.toList());

        User user = new User();
        Optional.ofNullable(user.getNames()).orElse(names).addAll(names);
        System.out.println("-----1 " + user.getNames());
        user.setNames(Stream.of("A").collect(Collectors.toList()));
        Optional.ofNullable(user.getNames()).ifPresent(o -> o.addAll(names));
        System.out.println("-----2 " + user.getNames());
        return user;
    }

    public static void main(String[] args) {
        //test1();

        System.out.println(testOptionalList());
        ;

    }

    private static void test1() {
        //List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> list = null;
        //System.out.println(Optional.ofNullable(list).orElse(List.of(0)));
        //System.out.println(Optional.ofNullable(list).orElseGet(() -> List.of(0)));
        //System.out.println(Optional.ofNullable(list).orElseThrow(RuntimeException::new));
        //System.out.println(Optional.ofNullable(list).ifPresent(o->o.parallelStream().findAny().ifPresent(u->u.toString())));

        //System.out.println(Optional.of(list).orElse(List.of(0)));
        //System.out.println(Optional.of(list).orElseGet(() -> List.of(0)));
        //System.out.println(Optional.of(list).orElseThrow(RuntimeException::new));
    }

    static class User {
        private List<String> names;

        public List<String> getNames() {
            return names;
        }

        public void setNames(List<String> names) {
            this.names = names;
        }

        @Override
        public String toString() {
            return "User{" +
                    "names=" + names +
                    '}';
        }
    }

}
