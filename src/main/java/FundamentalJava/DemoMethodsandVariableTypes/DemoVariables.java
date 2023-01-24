package FundamentalJava.DemoMethodsandVariableTypes;

public class DemoVariables
{
   static String IFSCCODE="IDE0E8123";//Static Variable
    String BranchName="Elachipalayam";
    public void localvariable()
    {
        String AccountHolderName="Manojkumar";//local variable
        System.out.println("Holder name is"+AccountHolderName);
    }
    public void GlobalAccess()
    {
        System.out.println("My branch name is : "+BranchName);//Global Variable
    }

    public static void Sample()
    {
        System.out.println("Thank You");
    }
    public static void main(String[] args)
    {
        Long AccountNo=9789586765545l;//Instance Variable
        System.out.println("My account no is "+AccountNo);
        DemoVariables local=new DemoVariables();
        local.localvariable();
        local.GlobalAccess();
        Sample();
        System.out.println("my Bank IFSC code is :"+IFSCCODE);
    }
}
