package chk.j8.util;

import chk.j8.lambda_exp.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public interface  CommonUtil {

    public static final String singlePatternRegEx = "[a-zA-Z]";

      static List<Employee> getEmployeeList() {

        List<Employee> listEmployee = new ArrayList<Employee>();
        listEmployee.add(new Employee("aaa", 10));
        listEmployee.add(new Employee("bbb", 100));
        listEmployee.add(new Employee("ccc", 5));
        listEmployee.add(new Employee("ddd", 1));

        return listEmployee;
    }

    static List<Integer> getNumberList() {

        List<Integer> integers = Arrays.asList(10, 1, 5, 50, 2, 100);

        return integers;
    }

    public static char getCharInput() {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        return ch;
    }
}
