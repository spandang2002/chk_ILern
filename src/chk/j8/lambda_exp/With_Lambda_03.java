package chk.j8.lambda_exp;

public class With_Lambda_03 {

    GI_ReturnString gi_returnString;
    FI_ReturnString fi_returnString = () -> {
        return "FI:chk2";
    };

    public String getString() {

        gi_returnString = () -> {
            return "GI:chk1";
        };
        System.out.println(gi_returnString.getString());

        gi_returnString = () -> "GI:chk2";
        System.out.println(gi_returnString.getString());

        // This will also work.
        // return gi_returnString.returnString();


        fi_returnString = () -> {
            return "FI:chk3";
        };
        System.out.println(fi_returnString.getString());

        fi_returnString = () -> "FI:chk4";
        System.out.println(fi_returnString.getString());

        // This will also work.
        // return fi_returnString.returnString();

        return null;
    }
}
