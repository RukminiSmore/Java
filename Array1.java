class Array1
{

    public static void main(String args[])
    {
        //1
        int Arr1[]={11,21,51,101};  // static way of creating array
        // 2
        int Arr2[]=new int [4]; //dynamic way
        Arr2[0]=11;
        Arr2[1]=21;
        Arr2[2]=51;
        Arr2[3]=101;

        System.out.println("Length of array is : "+Arr1.length);

        int iCnt=0;
        for(iCnt=0;iCnt<Arr1.length;iCnt++)
        {
            System.out.println(Arr1[iCnt]);
        }

    }

}