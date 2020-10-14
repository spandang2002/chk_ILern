package chk.j8.method_ref;

import chk.j8.util.CommonUtil;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class MethodRefUtil {

    public static int staticMethodReference1() {

        System.out.println("staticMethodReference");
        List<Integer> integerList = CommonUtil.getNumberList();

        Optional<Integer> max = integerList.stream().reduce(Math::max);
        max.ifPresent(System.out::println);

        return max.get();
    }


    public static int staticMethodReference2() {

        BiFunction<Integer, Integer, Integer> product = MethodRefUtil::multiply;
        int pr = product.apply(11, 5);
        System.out.println("Product of given number is: "+pr);
        return pr;
    }



    public static int multiply(int a, int b){
        return a*b;
    }
}
