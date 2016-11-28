package interaface_bindings_test;


import org.junit.Test;
import easyinjector.EasyInjector;
import static org.junit.Assert.assertEquals;

public class InterfaceBindingTestCase {


    @Test
    public void testSimpleInjection(){
        EasyInjector injector = new EasyInjector();
        injector.bind(FooB.class, B.class);
        assertEquals(injector.getObjectInstance(B.class).getClass(), FooB.class);
    }


    public class FooB implements B{
        public FooB(){}
    }

    private interface B{

    }

}
