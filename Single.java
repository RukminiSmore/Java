class Single
{
    public static void main(String A[])
    {
        Derived dobj=new Derived();
        dobj.fun();
        dobj.gun();
        
    }
}
class Base 
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void fun()
    {
        System.out.println("base fun");
    }

}
class Derived extends Base
{
    public int X,Y;
    public Derived()
    {
         System.out.println("Derived constructor");
    }
     public void gun()
    {
        System.out.println("base gun");
    }

}
