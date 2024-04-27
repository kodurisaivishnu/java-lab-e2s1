import java.util.Scanner;
 class primeFactors 
 {
    static void printPrimeFactors(int n)
    {
        for(int i=2;n>1;i++)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        printPrimeFactors(n);
    }
}