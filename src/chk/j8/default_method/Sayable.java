package chk.j8.default_method;

public interface Sayable {

    // Default method
    default void say() {
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void sayMore(String msg);

    // Static method
    static void sayLouder(String msg) {
        System.out.println(msg);
    }
}