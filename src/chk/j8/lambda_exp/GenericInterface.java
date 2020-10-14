package chk.j8.lambda_exp;

/***
 * GI:Generic Interface
 * @FunctionalInterface is not valid as there are many abstract method available so commenting it out.
 */
// @FunctionalInterface
public interface GenericInterface {

    public void draw();

    public String getString();

    public String takeStringReturnString(String data);

    public int getIntWithMultipleParameters(int data1, int data2);
}
