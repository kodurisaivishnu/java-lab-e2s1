import java.util.*;
public class SaveQnic {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        int t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values: ");
        for(int i=0;t<5;i++)
        {
            arr[t]=sc.nextInt();
            for(int j=0;j<t;j++)
            {
                if(arr[t]==arr[j])
                {
                    System.out.println("Duplicate Entery in valid");
                    t--;
                }
            }
            t++;
        }
        sc.close();
        System.out.print("Array set: ");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
