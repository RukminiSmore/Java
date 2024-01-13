import java.util.*;
class Array4
{

    public static void main(String args[])
    {
       Scanner sobj=new Scanner(System.in);
       int m;
       System.out.println("Enter the number of rows for jagged array");
       m=sobj.nextInt();
       int Arr[][]=new int[m][];

       System.out.println("enter the number of columns for each rows og jagged array");
       for(int i=0;i<m;i++)
       {
        Arr[i]=new int[sobj.nextInt()];
       }
       System.out.println("enter the elements");
       for(int i=0;i<Arr.length;i++)
       {
        for(int j=0;j<Arr[j].length;j++)
        {
            Arr[i][j]=sobj.nextInt();
        }
       }
       System.out.println("elements of 2d jagged array");
       for(int i=0;i<Arr.length;i++)
       {
        for(int j=0;j<Arr[j].length;j++)
        {
            System.out.println("Arr[i][j] "+" ");
        }
        System.out.println();
       }
    }



}