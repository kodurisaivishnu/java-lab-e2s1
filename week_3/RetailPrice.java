import java.util.*;
import java.lang.*;
class product_prices
{
    double product_prices[]={0,99.90,20.20,6.87,45.50,40.49};
// since product 0 not exist 0   p1    p2   p3   p4     p5  ...p-->product
    String product_name[]={null,"book","moms magic","pencil","Maza","Drink"};
    int qty[]={0,5,5,5,5,5};
}

public class RetailPrice {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      
        int id,qty;
        product_prices pr=new product_prices();
        double total_retail_price=0;
        while(true)
        {
            System.out.print("Enter product_id (1-5): ");
            id=sc.nextInt();
            if(pr.qty[id]<=0)
            {
                System.out.println("out of stock "+id);
                continue;
            }
            System.out.println("Qty:");
            qty=sc.nextInt();
            switch(id)
            {
                case 0: return;
                case 1: {
            
                    total_retail_price=total_retail_price+qty*pr.product_prices[id]; 
                    pr.qty[id]=pr.qty[id]-qty;
                    break;
                }
                case 2:{
                    
                    total_retail_price=total_retail_price+qty*pr.product_prices[id]; 
                    pr.qty[id]=pr.qty[id]-qty;  //reduse the qty
                    break;
                }
                case 3:{
                    
                    total_retail_price=total_retail_price+qty*pr.product_prices[id];
                     pr.qty[id]=pr.qty[id]-qty;
                     break;
                }
                case 4:{
                    
                    total_retail_price=total_retail_price+qty*pr.product_prices[id];
                     pr.qty[id]=pr.qty[id]-qty;
                     break;
                }
                case 5:{
                       total_retail_price=total_retail_price+qty*pr.product_prices[id];
                       pr.qty[id]=pr.qty[id]-qty;
                       break;
                    }
                default:{
                        System.out.println("Invalid Entry");
                    }
            }
                System.out.println(total_retail_price);
                
        }
            
            // System.out.println(total_retail_price);
    }
        

    
}

