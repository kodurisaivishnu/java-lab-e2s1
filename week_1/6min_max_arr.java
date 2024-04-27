public class min_max_arr {
    public static void main(String... args)
    {
        int arr[]={1,2,3,4,5};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:arr)
        {
            if(x<min)
            {
                min=x;
            }
            if(x>max)
            {
                max=x;
            }
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>max)
        //     {
        //         max=arr[i];
        //     }
        //     if(arr[i]<min)
        //     {
        //         min=arr[i];
        //     }
        // }
        System.out.println("Min value :"+min);
        System.out.println("Min value :"+max);
    }
}
