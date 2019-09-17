package serviceloader.googleauto;

import com.google.auto.service.AutoService;

@AutoService({AutoServiceInterface.class})
public class AutoServiceLoaderImpl2 implements AutoServiceInterface {
    @Override
    public void print() {
        System.out.println("service loader test impl 2");
    }
}
