
class Marvellous
{
    public int i;
    public int j;

    public Marvellous()
    {
        System.out.println("Inside default constructor");
    }
    public Marvellous(int a,int b)
    {
        System.out.println("Inside parametrised constructor");
    }
}
public class ClassDemo 
{
    public static void main(String args[])
    {
        System.out.println("Inside main");
        Marvellous mobj1 =new Marvellous();
        Marvellous mobj2=new Marvellous(11,21);

        System.out.println(mobj2.i);
        System.out.println(mobj2.j);
        
    }
}
