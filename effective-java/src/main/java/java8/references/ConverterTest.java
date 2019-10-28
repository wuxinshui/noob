package java8.references;

public class ConverterTest {
    public static void main(String[] args) {
        Converter<String,Integer> converter=(from)->Integer.valueOf(from);
        Integer convertered=converter.converter("1");
        System.out.println(convertered.getClass());
        System.out.println(convertered);


        Converter<String,Integer> converter1=Integer::valueOf;
        System.out.println(converter1.converter("3"));
    }
}
