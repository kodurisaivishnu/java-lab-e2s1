import java.util.Scanner;

public class matAdd {
    static void printMatrix(int m[][])
    {
        for(int x[]:m)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    static void addMatrix(int a[][],int b[][])
    {
        //result array
        int r[][]=new int [a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                r[i][j]=0;
                r[i][j]=a[i][j]+b[i][j];
            }
        }
        printMatrix(r);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter r1 and c1: ");
        r1=sc.nextInt();
        c1=sc.nextInt();

        System.out.println("Enter r2 and c2: ");
        r2=sc.nextInt();
        c2=sc.nextInt();

        if(r1==r2 && c1==c2)
        {
            int a[][]=new int [r1][c1];
            int b[][]=new int [r2][c2];
            System.out.println("Enter matrix A: ");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter matrix B: ");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            sc.close();
            System.out.println("Entered Matrix A: ");
            printMatrix(a);
            System.out.println("Entered Matrix B: ");
            printMatrix(b);
            System.out.println("Result: ");
            addMatrix(a,b);
        }
        else
        {
            System.out.println("Addition is not possible");
        }
    }
}