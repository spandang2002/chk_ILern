package chk.j8;

import chk.j8.default_method.DefaultMethodDemo;
import chk.j8.default_method.DefaultMethodsAndMultipleInheritance;
//import chk.j8.lambda.lambda_exp.*;
import chk.j8.lambda_exp.*;
import chk.j8.method_ref.MethodRefUtil;
import chk.j8.util.CommonUtil;

public class Main4All_ILearn {

    public static void main(String[] args) {


        while (true) {
            System.out.println("a -> Lambda Expression...");
            System.out.println("b -> Method References...");
            System.out.println("c -> Stream...");
            System.out.println("d -> Default Method...");
            System.out.println("e -> ...");
            System.out.println("0 -> Exit...");
            char ch = CommonUtil.getCharInput();

            switch (ch) {
                case 'a':
                case 'A': {
                    lambdaExpression_ILearn();
                    break;
                }
                case 'b':
                case 'B': {
                    methodReferences_ILearn();
                }
                case 'c':
                case 'C': {
                    stream_ILearn();
                }
                case 'd':
                case 'D': {
                    defaultMethod_ILearn();
                }
                case '0': {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid Input...");
                }
            }
        }
    }

    /***
     * Java provides a facility to create default methods inside the interface.
     * Methods which are defined inside the interface and tagged with default are known as default methods.
     * These methods are non-abstract methods.
     *
     * Default methods enable you to add new functionality to the interfaces of your libraries and
     * ensure binary compatibility with code written for older versions of those interfaces.
     *
     * Why default methods were needed in java 8?
     * This is a good candidate for your next interview question.
     * Simplest answer is to enable the functionality of lambda expression in java.
     * Lambda expression are essentially of type of functional interface.
     * To support lambda expressions seamlessly, all core classes have to be modified. But these core classes like java.util.List are implemented not only in JDK classes, but also in thousands of client code as well.
     * Any incompatible change in core classes will back fire for sure and will not be accepted at all.
     *
     * In other word...
     *
     * The default methods were introduced to provide backward compatibility
     * so that existing interfaces can use the lambda expressions without implementing the methods in the implementation class.
     * Default methods are also known as defender methods or virtual extension methods.
     *
     * Default methods break this deadlock and allow adding support for functional interface in core classes.
     * Let’s see an example. Below is a method which has been added to java.lang.Iterable.
     */
    private static void defaultMethod_ILearn() {

        new DefaultMethodDemo();

        new DefaultMethodsAndMultipleInheritance();
    }

    /***
     *
     */
    private static void stream_ILearn() {

    }

    /***
     * Java provides a new feature called method reference in Java 8.
     * Method reference is used to refer method of functional interface.
     * It is compact and easy form of lambda expression.
     * Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.
     * In this tutorial, we are explaining method reference concept in detail.
     *
     * There are following types of method references in java:
     *
     * 1. Reference to a static method.
     * 2. Reference to an instance method.
     * 3. Reference to a constructor.
     */
    private static void methodReferences_ILearn() {

        MethodRefUtil.staticMethodReference1();
        MethodRefUtil.staticMethodReference2();


    }

    /***
     * A lambda expression is an anonymous function.
     * A function that doesn’t have a name and doesn’t belong to any class.
     * The concept of lambda expression was first introduced in LISP programming language.
     *
     * It provides a clear and concise way to represent one method interface using an expression.
     * It is very useful in collection library.
     * It helps to iterate, filter and extract data from collection.
     *
     * Java lambda expression is treated as a function, so compiler does not create .class file.
     *
     * Why use Lambda Expression
     * 1. To provide the implementation of Functional interface.
     * 2. Less coding.
     *
     * Java lambda expression is consisted of three components.
     * 1) Argument-list: It can be empty or non-empty as well.
     * 2) Arrow-token: It is used to link arguments-list and body of expression.
     * 3) Body: It contains expressions and statements for lambda expression.
     */
    public static void lambdaExpression_ILearn() {

        new Without_Lambda();
        new With_Lambda_01();
        new With_Lambda_02();
        /*
            A lambda expression can have zero or any number of arguments. Let's see the examples:
         */
        new With_Lambda_03().getString();
        new With_Lambda_04();
        new With_Lambda_05();
        new With_Lambda_06_ForeachLoop();
        new With_Lambda_07_CreatingThread();
        new With_Lambda_08_Comparator();
        new With_Lambda_09_FilterCollectionData();
        new With_Lambda_10_EventListener();
    }
}
