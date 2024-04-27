import java.util.Scanner;

 class bubbleSort {
    public static void swap(int arr[],int a,int b)
    {
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public static void main(String sai[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elenments: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        sc.close();
    }
}
