public class FinalizeDemo5 {
    public static void main(String args[])  
    {
        try{
        Employee aobj = new Employee("Amit", 78000, 28, "Karve Road Pune");
        Employee aobj2 = (Employee)aobj.clone();
        aobj.Display();
        aobj2.Display();  
        }
        catch(CloneNotSupportedException obj)
        {
            System.out.println("Inside catch");
        }      
    }
}
class Employee implements Cloneable
{
    public String Name;
    public String Address;
    public int Salary;
    public int Age;

    Employee(String str, int amount, int A, String addr)
    {
        this.Name=str;
        this.Salary=amount;
        this.Age=A;
        this.Address=addr;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    void Display()
    {   
        System.out.println("Employee Name= "+this.Name);
        System.out.println("Employee Salary= "+this.Salary);
        System.out.println("Employee Age= "+this.Age);
        System.out.println("Employee Adress= "+this.Address);
    }
    
}
