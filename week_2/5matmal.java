import java.util.*;
import java.lang.*;
class matmal {
    static void matrix_multiply_with(int r1,int c1,int r2,int c2)
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int [r1][c1];
        int b[][]=new int [r1][c1];
        int r[][]=new int [r1][c2];
        System.out.println("Enter matrix A Elements:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix B Elements:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enterd Matrix A: ");
        for(int x[]:a)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("Enterd Matrix B: ");
        for(int x[]:b)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplicatin of A*B: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                r[i][j]=0;
                for(int k=0;k<r2;k++)
                {
                    r[i][j]=r[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(int x[]:r)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r1 and c1 :");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter r2 and c2: ");
        r2=sc.nextInt();
        c2=sc.nextInt();
        if(c1==r2)
        {
            matrix_multiply_with(r1,c1,r2,c2);
        }
        else{
            System.out.println("Multiplication is not possible");
        }
    }
}
