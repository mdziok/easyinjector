package easyinjector;

import java.util.HashMap;
import java.util.Map;

public class EasyInjector {
    private Map<Class<?>, Class<?>> bindings;

    public EasyInjector(){
        bindings = new HashMap<Class<?>, Class<?>>();
    }

    public void bind(Class<?> ifc, Class<?> cls){
        bindings.put(ifc, cls);
    }

    //TODO
    public <T> T getObjectInstance(Class<T> tClass) {
        return (T) new Object();
    }

}

