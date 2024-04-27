import java.util.Scanner;

public class linearSearch {
    public static void main(String[] ksv)
    {
        int arr[]={10,9,8,7,6,5,4,3,2,1,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target to find: ");
        int t=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(t==arr[i])
            {
                System.out.println("targrt element at: "+i);
            }
        }
    }
}
