package chk.j8.lambda_exp;

public class With_Lambda_01 {

    GI_Draw gi_draw;
    FI_Draw fi_draw;

    public With_Lambda_01() {

        gi_draw = () -> {
            System.out.println("GI:Drawing...");
        };

        gi_draw.draw();

        fi_draw = () -> {
            System.out.println("FI:Drawing...");
        };
        fi_draw.draw();
    }
}
