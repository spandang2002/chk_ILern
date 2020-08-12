package chk.j8.lambda;

public class With_Lambda_05 {

    int result;
    OldInterfaceWithMultipleParameters oldInterfaceWithMultipleParameters;

    public With_Lambda_05() {

        oldInterfaceWithMultipleParameters = (a, b) -> {
            return a + b;
        };

        result = oldInterfaceWithMultipleParameters.takeStringReturnString(10, 20);
        System.out.println("Result : " + result);

        oldInterfaceWithMultipleParameters = (int a, int b) -> {
            return a + b;
        };

        result = oldInterfaceWithMultipleParameters.takeStringReturnString(100, 200);
        System.out.println("Result : " + result);


        oldInterfaceWithMultipleParameters = (int a, int b) ->  a - b;

        result = oldInterfaceWithMultipleParameters.takeStringReturnString(100, 200);
        System.out.println("Result : " + result);

    }
}
