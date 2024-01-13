class  Hieararchal
{
    public static void main(String A[])
    {
        
        Derived dobj1=new Derived();
        DerivedX dobj2=new DerivedX();
        /*dobj1.fun();
        dobj1.gun();
        dobj.sun();*/
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
        System.out.println("derived gun");
    }

}
class DerivedX extends Base
{
    public int R,S; 
    public DerivedX()
    {
        System.out.println("DerivedX constructor");
    }
    public void sun()
    {
        System.out.println("DerivedX sun");
    }
}
