class FinalizeDemo4
{
   public static void main(String args[])
   {
        try
        {
        Employee aobj=new Employee("Amit",78000,28,"Karve Road pune");
        Employee aobj2=(Employee)aobj.clone();
        aobj1.Display();
        aobj2.Display();
        }
        catch(CloneNotSupportedException obj)
        {
            System.out.println("inside catch..");
        }
   }
}

class Employee implements Cloneable
{

    public String Name;
    public int Salary;
    public int Age;
    public String Address;
    Employee(String str,int amount,int A,String addr)
    {
        this.Name=str;
        this.Salary=amount;
        this.Age=A;
        this.Address=addr;
    }
    public Object clone() throws Exception
    {
        return super.clone();
    }
    void Display()
    {
        System.out.println("Employee name: "+this.Name);
        System.out.println("Employee Age: "+this.Age);
        System.out.println("Employee Salary: "+this.Salary);
        System.out.println("Employee Address: "+this.Address);
    }
   
}

