package chk.j8.lambda_exp;

@FunctionalInterface
public interface FI_Draw {

    public void draw();

    /***
     *
     * since default methods are not abstract you’re free to add default methods to your functional interface as many as you like.
     *
     * Another important point to remember is that
     * if an interface declares an abstract method
     * overriding one of the public methods of java.lang.Object,
     * that also does not count toward the interface’s abstract method count
     * since any implementation of the interface will have an implementation from java.lang.Object or elsewhere.
     * for example, below is perfectly valid functional interface.
     */

    @Override
    public String toString();                //Overridden from Object class

    @Override
    public boolean equals(Object obj);        //Overridden from Object class
}
