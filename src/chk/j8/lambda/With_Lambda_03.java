package chk.j8.lambda;

public class With_Lambda_03 {

    public String getString()
    {

        OldInterfaceReturnString oldInterfaceReturnString = ()-> {
          return  "chk1";
        };

        System.out.println(oldInterfaceReturnString.returnString());
        return oldInterfaceReturnString.returnString();
    }

}
