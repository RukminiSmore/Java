
class abstractDemo
{
    public static void main(String args[])
    {
        // Demo obj=new Demo();
        Hello hobj=new Hello();
        hobj.fun();
        hobj.gun();
    }
}
abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Constructor\n");
        this.A=0; 
        this.B=0;

    }
    abstract void fun(); //virtual void fun ()=0;
    void gun()    //concrete
    {
        System.out.println("Inside gun of demo");
    }
}
class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside hello constructor");
    }
    public void fun()
    {
        System.out.println("Inside fun of hello");
    }
}