package FundamentalJava.DemoMethodsandVariableTypes;

public class DemoVariables
{
    public void localvariable()
    {
        String AccountHolderName="Manojkumar";//local variable
        System.out.println("Holder name is"+AccountHolderName);
    }

    public static void main(String[] args)
    {
        Long AccountNo=9789586765545l;//Instance Variable
        System.out.println("My account no is "+AccountNo);
        DemoVariables local=new DemoVariables();
        local.localvariable();
    }
}
