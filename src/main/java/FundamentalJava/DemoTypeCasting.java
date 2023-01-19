package FundamentalJava;

public class DemoTypeCasting
{
    public static void main(String[] args)
    {
        //widening
        int height=169;
        double convertheight=height;
        System.out.println("my height is "+height+ " Converted original "+convertheight);

        char myinitial='a';
        int ascino=myinitial;
        System.out.println("my initial is :"+myinitial+ " M asci no is "+ascino);

        //narrowing
        int value=38;
        char changecharcter=(char)value;
        System.out.println("my value is "+value+ " this value charcter is "+changecharcter);

    }
}
