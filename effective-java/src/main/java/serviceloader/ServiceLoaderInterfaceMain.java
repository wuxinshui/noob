package serviceloader;

import java.util.Iterator;
import java.util.ServiceLoader;

public class ServiceLoaderInterfaceMain {
    public static void main(String[] args) {
        ServiceLoader<ServiceLoaderInterface> loaderInterfaces=ServiceLoader.load(ServiceLoaderInterface.class);
        System.out.println("foreach print load impl...");
        loaderInterfaces.stream().forEach(o->{
            System.out.println(o.toString());
        });
        System.out.println("iterator print load impl...");
        Iterator iterator= loaderInterfaces.iterator();
        while (iterator.hasNext()){
            ServiceLoaderInterface loaderInterface= (ServiceLoaderInterface) iterator.next();
            System.out.println(loaderInterface.toString());
        }
    }
}
