import java.util.*;
class ExceptionDemo3

{
    public static void main(String arg[])
    {     
        Demo dobj=new Demo();
        dobj.Divison();
    }
}

class Demo
{
    public void Divison()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter first number:");
        int iNo1=sobj.nextInt();

        System.out.println("Enter second number:");
        int iNo2=sobj.nextInt();

        int iAns=0;
        iAns=iNo1/iNo2;
        
        System.out.println("Divison is: "+iAns);
        
    }
}


