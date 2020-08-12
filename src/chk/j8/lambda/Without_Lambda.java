package chk.j8.lambda;

public class Without_Lambda {

    public Without_Lambda() {

        DrawOldInterface draw = new DrawOldInterface() {
            @Override
            public void draw() {
                System.out.println("Drawing it.");
            }
        };

        draw.draw();
    }
}
