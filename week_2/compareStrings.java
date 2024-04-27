import java.util.*;
// import java.lang.*;

class compareStrings {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        //string array
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" String: ");
            arr[i]=sc.next();
            sc.nextLine();
        }
        sc.close();
        System.out.print("Enterd String: ");
        for(String x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<n;j++)
            {   
                // String b=arr[j];
                if(arr[j].compareTo(arr[j-1])<0)
                {
                    String t=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.print("Sorted Strings: ");
        for(String x:arr)
        {
            System.out.print(x+" ");
        }
    }
}