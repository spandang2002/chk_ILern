package chk.j8.lambda_exp;

public class With_Lambda_05 {

    int result;
    GI_WithMultipleParameters oldInterfaceWithMultipleParameters;
    FI_WithMultipleParameters fi_withMultipleParameters;

    public With_Lambda_05() {


        oldInterfaceWithMultipleParameters = (int a, int b) -> {
            return a + b;
        };
        result = oldInterfaceWithMultipleParameters.getIntWithMultipleParameters(100, 200);
        System.out.println("Result : " + result);


        oldInterfaceWithMultipleParameters = (a, b) -> {
            return a + b;
        };
        result = oldInterfaceWithMultipleParameters.getIntWithMultipleParameters(10, 20);
        System.out.println("Result : " + result);


        oldInterfaceWithMultipleParameters = (int a, int b) -> a - b;
        result = oldInterfaceWithMultipleParameters.getIntWithMultipleParameters(100, 200);
        System.out.println("Result : " + result);


        fi_withMultipleParameters = (int a, int b) -> {
            return a + b;
        };
        result = fi_withMultipleParameters.getIntWithMultipleParameters(10, 20);
        System.out.println("Result : " + result);


        fi_withMultipleParameters = (a, b) -> {
            return a + b;
        };
        result = fi_withMultipleParameters.getIntWithMultipleParameters(10, 20);
        System.out.println("Result : " + result);


        fi_withMultipleParameters = (a, b) -> a + b;
        result = fi_withMultipleParameters.getIntWithMultipleParameters(10, 20);
        System.out.println("Result : " + result);
    }
}
