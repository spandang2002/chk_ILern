package chk.j8.lambda;

public class With_Lambda_04 {

    public With_Lambda_04() {

        OldInterfaceTakeSingleStringReturnString test1 = (var1) -> {
            return "checking:" + var1;
        };

        String ress = test1.takeStringReturnString("test1");
        System.out.println(ress);

        test1 = var2 -> {
            return "checking:" + var2;
        };

        ress = test1.takeStringReturnString("test2");
        System.out.println(ress);
    }
}
