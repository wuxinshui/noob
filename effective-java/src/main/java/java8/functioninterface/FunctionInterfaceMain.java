package java8.functioninterface;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/7/3 14:01
 */
public class FunctionInterfaceMain {
    public static void main(String[] args) {
        FunctionInterfaceMain main = new FunctionInterfaceMain();
        main.haveFunctionInterface((s) -> System.out.println(s));
        main.noFunctionInterface((s) -> System.out.println(s));
    }

    public void haveFunctionInterface(HaveFunctionInterface text) {
        text.print("aaaaaaaaaaaaa");
    }

    public void noFunctionInterface(NoFunctionInterface text) {
        text.print("aaaaaaaaaaaaa");
    }
}
