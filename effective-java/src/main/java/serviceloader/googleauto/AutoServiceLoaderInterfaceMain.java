package serviceloader.googleauto;


import com.google.auto.service.AutoService;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 不需要有：META-INF/services/serviceloader.AutoServiceInterface
 *
 * @author DELL
 */
@AutoService({AutoServiceLoaderImpl1.class,AutoServiceLoaderImpl2.class})
public class AutoServiceLoaderInterfaceMain {
    public static void main(String[] args) {
        ServiceLoader<AutoServiceInterface> loaderInterfaces = ServiceLoader.load(AutoServiceInterface.class);
        System.out.println("foreach print load impl...");
        loaderInterfaces.stream().forEach(o -> {
            System.out.println(o.toString());
        });
        System.out.println("iterator print load impl...");
        Iterator iterator = loaderInterfaces.iterator();
        while (iterator.hasNext()) {
            AutoServiceInterface loaderInterface = (AutoServiceInterface) iterator.next();
            System.out.println(loaderInterface.toString());
        }
    }
}
