package FundamentalJava.DemoMethodsandVariableTypes;

public class Methods
{
    public void noreturntype()
    {
        int Myage=55;
        System.out.println("my age is "+Myage);
    }
    public String usingreturntype()
    {
        return "MANOJ";
    }
    public static void main(String[] args)
    {
        System.out.println("WELCOME");
        Methods obj1=new Methods();//object creation
        obj1.noreturntype();
        obj1.usingreturntype();

    }
}
