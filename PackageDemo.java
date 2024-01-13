import Marvellous.Maths;
import Marvellous.Infosystems.Arithmetic;
class PackageDemo
{
    public static void main(String Args[])
    {
        Maths mobj=new Maths();
        int iRet=0;
        iRet=mobj.Addition(10,11);
        System.out.println("Additio is "+iRet);
        iRet=mobj.Substraction(10,11);
        System.out.println("Substraction is "+iRet);
    }
}