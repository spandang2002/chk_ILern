package chk.j8.lambda.lambda_exp;

public class With_Lambda_04 {

    String ress;
    GI_ReturnStringTakeSingleString gi_takeSingleStringReturnString;
    FI_ReturnStringTakeSingleString fi_takeSingleStringReturnString;


    public With_Lambda_04() {

        gi_takeSingleStringReturnString = (String var1) -> {
            return "GI-chk:" + var1;
        };
        ress = gi_takeSingleStringReturnString.takeStringReturnString("test1");
        System.out.println(ress);


        gi_takeSingleStringReturnString = (var1) -> {
            return "GI-chk:" + var1;
        };
        ress = gi_takeSingleStringReturnString.takeStringReturnString("test2");
        System.out.println(ress);


        gi_takeSingleStringReturnString = var2 -> {
            return "GI-chk:" + var2;
        };
        ress = gi_takeSingleStringReturnString.takeStringReturnString("test3");
        System.out.println(ress);


        gi_takeSingleStringReturnString = var2 -> "GI-chk:" + var2;
        ress = gi_takeSingleStringReturnString.takeStringReturnString("test4");
        System.out.println(ress);


        fi_takeSingleStringReturnString = (String var1) -> {
            return "FI-chk:" + var1;
        };
        ress = fi_takeSingleStringReturnString.takeStringReturnString("test5");
        System.out.println(ress);


        fi_takeSingleStringReturnString = (var1) -> {
            return "FI-chk:" + var1;
        };
        ress = fi_takeSingleStringReturnString.takeStringReturnString("test6");
        System.out.println(ress);


        fi_takeSingleStringReturnString = var2 -> {
            return "FI-chk:" + var2;
        };
        ress = fi_takeSingleStringReturnString.takeStringReturnString("test7");
        System.out.println(ress);


        fi_takeSingleStringReturnString = var2 -> "FI-chk:" + var2;
        ress = fi_takeSingleStringReturnString.takeStringReturnString("test8");
        System.out.println(ress);
    }
}
