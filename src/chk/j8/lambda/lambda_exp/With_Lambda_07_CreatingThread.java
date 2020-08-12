package chk.j8.lambda.lambda_exp;

public class With_Lambda_07_CreatingThread {

    public With_Lambda_07_CreatingThread() {

        threadCodeWithoutLambda();
        threadCodeWithLambda();
    }

    private void threadCodeWithLambda() {

        Runnable runnable1 = () -> System.out.println("threadCodeWithLambda1:running");
        runnable1.run();

        Runnable runnable2 = () -> {
            System.out.println("threadCodeWithLambda2:running");
        };
        runnable2.run();
    }

    private void threadCodeWithoutLambda() {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("threadCodeWithoutLambda1:running...");
            }
        };
        runnable1.run();

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("threadCodeWithoutLambda2:running...");
            }
        };
        runnable2.run();
    }
}
