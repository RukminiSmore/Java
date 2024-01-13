public class FinalizeDemo6 {
    public static void main(String args[])  
    {
        
        Employee aobj = new Employee("Amit", 78000, 28, "Karve Road Pune");
          System.out.println(aobj); //it cass toString method internally
    }
}
class Employee 
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
    void Display()
    {   
        System.out.println("Employee Name= "+this.Name);
        System.out.println("Employee Salary= "+this.Salary);
        System.out.println("Employee Age= "+this.Age);
        System.out.println("Employee Adress= "+this.Address);
    }
    public String toString()
    {
        return Name+ "  "+Salary+" "+Age+" "+Address;
    }
}
