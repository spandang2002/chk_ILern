package chk.j8.lambda;

public class With_Lambda_01 {

    int width = 10;
    public With_Lambda_01() {

        DrawOldInterface drawOldInterface= ()->{
            System.out.println("drawing : "+width);
        };

        drawOldInterface.draw();
    }
}
