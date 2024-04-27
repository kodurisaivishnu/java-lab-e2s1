import java.util.Scanner;
 class binarySearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Eneter Target Element: ");
        int t=sc.nextInt();
        int start=0;
        int end=a.length-1;
        // int mid=(start+end)/2;
        while(start<=end)
        {
           int mid=(start+end)/2;
           if(t==a[mid])
           {
                System.out.println(t+" Found at index "+mid); break;
           }
           else if(t>a[mid])
           {
            start=mid+1;
            
           }
           else if(t<a[mid])
           {
            end=mid-1;
           }
        }
    }
}
