package scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @Author: yoyo
 * @Description: Run Javascript from Java <link>https://javapapers.com/core-java/run-javascript-from-java/</>
 * Java 8 Features <link>https://javapapers.com/java/java-8-features/</link>
 * @Date: Created in 2019/9/4 10:38
 */
public class JavaJavaScript {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        engine.eval("var x = 10;");
        engine.eval("var y = 20;");
        engine.eval("var z = x + y;");
        engine.eval("print (z);");
    }
}
