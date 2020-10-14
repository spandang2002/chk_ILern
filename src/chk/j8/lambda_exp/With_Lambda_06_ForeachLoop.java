package chk.j8.lambda_exp;

import java.util.ArrayList;
import java.util.List;

public class With_Lambda_06_ForeachLoop {


    public With_Lambda_06_ForeachLoop() {

        List<String> aList = new ArrayList<String>();
        aList.add("Lambda Expression");
        aList.add("With");
        aList.add("Generic Interface");
        aList.add("And");
        aList.add("Functional Interface");

        aList.forEach(val-> System.out.println("Data : "+val));
    }
}
