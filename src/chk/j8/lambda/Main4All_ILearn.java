package chk.j8.lambda;

import chk.j8.lambda.lambda_exp.*;

public class Main4All_ILearn {

    public static void main(String[] args) {

        lambdaExpression_ILearn();
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
    }
}
