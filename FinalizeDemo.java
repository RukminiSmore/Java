class FinalizeDemo
{
   public static void main(String args[])
   {
        Employee eobj=new Employee("Amit",78000,28,"Karve Road pune");
        eobj.Display();
        //eobj=null;
        System.gc();
   }
}

class Employee
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
    void Display()
    {
        System.out.println("Employee name: "+this.Name);
        System.out.println("Employee Age: "+this.Age);
        System.out.println("Employee Salary: "+this.Salary);
        System.out.println("Employee Address: "+this.Address);
    }
    protected void finalize()
    {
       System.out.println("inside the finalize...");
}
}

class 