package chk.j8.default_method;

public class DefaultMethodDemo {

    public DefaultMethodDemo() {

        DefaultMethods dm = new DefaultMethods();
        dm.say();                       // calling default method
        dm.sayMore("Work is worship");      // calling abstract method
        Sayable.sayLouder("Helloooo...");   // calling static method
    }
}





