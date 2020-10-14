package chk.j8.lambda_exp;

public class Without_Lambda {

    GI_Draw gi_draw;
    FI_Draw fi_draw;

    public Without_Lambda() {

        gi_draw = new GI_Draw() {

            @Override
            public void draw() {
                System.out.println("GI:Drawing...");
            }
        };

        gi_draw.draw();


        fi_draw = new FI_Draw() {

            @Override
            public void draw() {
                System.out.println("FI:Drawing...");
            }
        };

        fi_draw.draw();
    }
}
