 import java.util.Scanner;//interface
interface A 
{ public void availability();
}
class menu implements A
{ menu()
   {
       System.out.println("     FOOD SERVING SYSTEM     ");
   }
    public void availability()
    {   System.out.println("THE AVAILABLE ORDERS ARE");
        System.out.println("SNO ITEMS");
        System.out.println("1.  PIZZA");
        System.out.println("2.  BURGER");
        System.out.println("3.  APPLE JUICE");
        System.out.println("4.  ORANGE JUICE");
        System.out.println("5.  FRIED RICE");
    }
}
class food extends menu//inheritance
{ 
     Scanner s=new Scanner(System.in);
     public void type()//overloading
  { System.out.println("THE AVAILABLE BURGERS ARE");
    System.out.println("STUFFED BEAN BURGER");
    System.out.println("POTATO CORN BURGER");
    int choicep=s.nextInt();
  }  
}
class food1 extends menu{
 public void type() 
  {  System.out.println("1.PEPPY PANNER");
     System.out.println("2.DOUBLE CHEESE");
      System.out.println("3.DELUXE VEGGE");
       System.out.println("Enter your choice");
       
       
  }
}
class pprice {
    final int PEPPY_PANNER=100;
    final int DOUBLE_CHEESE=200;
    final int DELUXE_VEGGE=250;
    public void price(String p)
    { System.out.println("1.PEPPY PANNER ="+PEPPY_PANNER);
      System.out.println("2.DOUBLE CHEESE ="+DOUBLE_CHEESE);
       System.out.println("3.DELUXE VEGGE ="+DELUXE_VEGGE);
    }   

 final int STUFFEDBEAN_BURGER=400;
    final int POTATOCORN_BURGER=300;
     public void price()
   {  System.out.println("STUFFED BEAN BURGER ="+STUFFEDBEAN_BURGER);
      System.out.println("POTATO CORN BURGER ="+POTATOCORN_BURGER);
   }
}
class bill extends pprice
{   int sum1=0;int sum2=0;int sum3=0;
    public void calculate(int c)
     {   if(c==1)
           {sum1=c*PEPPY_PANNER;
           }
        if(c==2)
           {sum2=c*DOUBLE_CHEESE;
           }
        if(c==3)
           {sum3=c*DELUXE_VEGGE;
           }
        
        }
}   
public class L extends pprice {
 
    int sum1=0;
     int sum2=0;
     
    void pizza(int n,int m){
        switch(n){
            case 1:{
            sum1= m*PEPPY_PANNER;
            break;
        }
            case 2:{
            sum1=m*DOUBLE_CHEESE;
            break;
        }
            case 3:{
            sum1=m*DELUXE_VEGGE;
            break;
        }
    }
    }
    void burger(int n,int m)
    {
        switch(n){
            case 1:{
                sum2=m*STUFFEDBEAN_BURGER;
                break;
            }
            case 2:{
                sum2=m*POTATOCORN_BURGER;
                break;
            }
        }
    }
    void bill(int n,int m,int p)
    {
        int total_amount=sum1+sum2+n+m+p;
        System.out.println("**********************TOTAL COST**************************");
        System.out.println(+total_amount);
    }
   public static void main(String[] args)
   {  Scanner s=new Scanner(System.in);
      JavaApplication3 fs=new JavaApplication3();
      menu m=new menu();
      m.availability();
      food f=new food();
      food1 f1=new food1();
      System.out.println("your order please!!");
      int itemno;int count1;int count2;int count3;int count4;int count5;
       System.out.println("Enter the no of items ");
      int nitems=s.nextInt();
     int sum3=0;
     int sum4=0;
     int sum5=0;
     while(nitems>0)
     {    System.out.println("Select the item");
         itemno=s.nextInt();
      switch(itemno)
      { case 1:
         { System.out.println("PIZZA");
           System.out.println("enter for which pizza do you need");
           f1.type();
           int choicep =s.nextInt();
           pprice p=new pprice();
           p.price("pizza");
           System.out.println("enter no of pizza");
           count1=s.nextInt();
           fs.pizza(choicep,count1);
           break;
           }
      
         
           
         case 2:
         { System.out.println("BURGER");
           System.out.println("enter for which BURGER do you need");
           f.type();
          // bprice b=new bprice();
          int choicep =s.nextInt();
           pprice p=new pprice();
           p.price();
           System.out.println("enter no of pizza");
           count2=s.nextInt();
           fs.burger(choicep,count2);
           break;
         }  
         case 3:
         { System.out.println("APPLE JUICE Rs 150");
           System.out.println("enter no of apple juice");
           count3=s.nextInt();
           sum3=count3*150;
           break;
         }
         case 4:
             { System.out.println("ORANGE JUICE Rs 100");
               System.out.println("enter no of orange juice");
               System.out.println("");
               count4=s.nextInt();
               sum4=count4*100;
               break;
         }
         case 5:
         { System.out.println("FRIED RICE Rs 200");
           System.out.println("enter no of fried rice");
           count5=s.nextInt();
           sum5=count5*200;
           break;
         }
      }
      nitems--;
     }
     fs.bill(sum3,sum4,sum5);
   }  
   
 
  
}
     
             





 
 import java.util.Scanner;//interface
interface A 
{ public void availability();
}
class menu implements A
{ menu()
   {
       System.out.println("     FOOD SERVING SYSTEM     ");
   }
    public void availability()
    {   System.out.println("THE AVAILABLE ORDERS ARE");
        System.out.println("SNO ITEMS");
        System.out.println("1.  PIZZA");
        System.out.println("2.  BURGER");
        System.out.println("3.  APPLE JUICE");
        System.out.println("4.  ORANGE JUICE");
        System.out.println("5.  FRIED RICE");
    }
}
class food extends menu//inheritance
{ 
     Scanner s=new Scanner(System.in);
     public void type()//overloading
  { System.out.println("THE AVAILABLE BURGERS ARE");
    System.out.println("STUFFED BEAN BURGER");
    System.out.println("POTATO CORN BURGER");
    int choicep=s.nextInt();
  }  
}
class food1 extends menu{
 public void type() 
  {  System.out.println("1.PEPPY PANNER");
     System.out.println("2.DOUBLE CHEESE");
      System.out.println("3.DELUXE VEGGE");
       System.out.println("Enter your choice");
       
       
  }
}
class pprice {
    final int PEPPY_PANNER=100;
    final int DOUBLE_CHEESE=200;
    final int DELUXE_VEGGE=250;
    public void price(String p)
    { System.out.println("1.PEPPY PANNER ="+PEPPY_PANNER);
      System.out.println("2.DOUBLE CHEESE ="+DOUBLE_CHEESE);
       System.out.println("3.DELUXE VEGGE ="+DELUXE_VEGGE);
    }   

 final int STUFFEDBEAN_BURGER=400;
    final int POTATOCORN_BURGER=300;
     public void price()
   {  System.out.println("STUFFED BEAN BURGER ="+STUFFEDBEAN_BURGER);
      System.out.println("POTATO CORN BURGER ="+POTATOCORN_BURGER);
   }
}
class bill extends pprice
{   int sum1=0;int sum2=0;int sum3=0;
    public void calculate(int c)
     {   if(c==1)
           {sum1=c*PEPPY_PANNER;
           }
        if(c==2)
           {sum2=c*DOUBLE_CHEESE;
           }
        if(c==3)
           {sum3=c*DELUXE_VEGGE;
           }
        
        }
}   
public class JavaApplication3 extends pprice {
 
    int sum1=0;
     int sum2=0;
     
    void pizza(int n,int m){
        switch(n){
            case 1:{
            sum1= m*PEPPY_PANNER;
            break;
        }
            case 2:{
            sum1=m*DOUBLE_CHEESE;
            break;
        }
            case 3:{
            sum1=m*DELUXE_VEGGE;
            break;
        }
    }
    }
    void burger(int n,int m)
    {
        switch(n){
            case 1:{
                sum2=m*STUFFEDBEAN_BURGER;
                break;
            }
            case 2:{
                sum2=m*POTATOCORN_BURGER;
                break;
            }
        }
    }
    void bill(int n,int m,int p)
    {
        int total_amount=sum1+sum2+n+m+p;
        System.out.println("**********************TOTAL COST**************************");
        System.out.println(+total_amount);
    }
   public static void main(String[] args)
   {  Scanner s=new Scanner(System.in);
      JavaApplication3 fs=new JavaApplication3();
      menu m=new menu();
      m.availability();
      food f=new food();
      food1 f1=new food1();
      System.out.println("your order please!!");
      int itemno;int count1;int count2;int count3;int count4;int count5;
       System.out.println("Enter the no of items ");
      int nitems=s.nextInt();
     int sum3=0;
     int sum4=0;
     int sum5=0;
     while(nitems>0)
     {    System.out.println("Select the item");
         itemno=s.nextInt();
      switch(itemno)
      { case 1:
         { System.out.println("PIZZA");
           System.out.println("enter for which pizza do you need");
           f1.type();
           int choicep =s.nextInt();
           pprice p=new pprice();
           p.price("pizza");
           System.out.println("enter no of pizza");
           count1=s.nextInt();
           fs.pizza(choicep,count1);
           break;
           }
      
         
           
         case 2:
         { System.out.println("BURGER");
           System.out.println("enter for which BURGER do you need");
           f.type();
          // bprice b=new bprice();
          int choicep =s.nextInt();
           pprice p=new pprice();
           p.price();
           System.out.println("enter no of pizza");
           count2=s.nextInt();
           fs.burger(choicep,count2);
           break;
         }  
         case 3:
         { System.out.println("APPLE JUICE Rs 150");
           System.out.println("enter no of apple juice");
           count3=s.nextInt();
           sum3=count3*150;
           break;
         }
         case 4:
             { System.out.println("ORANGE JUICE Rs 100");
               System.out.println("enter no of orange juice");
               System.out.println("");
               count4=s.nextInt();
               sum4=count4*100;
               break;
         }
         case 5:
         { System.out.println("FRIED RICE Rs 200");
           System.out.println("enter no of fried rice");
           count5=s.nextInt();
           sum5=count5*200;
           break;
         }
      }
      nitems--;
     }
     fs.bill(sum3,sum4,sum5);
   }  
   
 
  
}
     
             





 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
