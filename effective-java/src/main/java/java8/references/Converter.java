package java8.references;

public interface Converter<F,T> {
   T converter(F from);
}
