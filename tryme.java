/*
Listen as i said that do while loop is not a infinite loop its nothing like that where evr its written its bull shit

in do while loop at first number enters in the dp loop and it executes and it doesnot check anything after exiting it goes to the while part
to check whether the number entered is matching it or not if it does it will agaain execute whatever you provide in dowhile loop answer or output
 for 1 time is guranteed and after that it will check

 and in while loop it first checks then prints it

//        int n = 1;
//        do{
//            System.out.println("hello world"); // for this do loop it will print print hello world for once because first print then check.
//        }while(n!=1);
//       
          while (n!=1)
//        {
//            System.out.println("hello world");  // will print once coz first check then print
           }  

*///


package com.tridib;

import java.util.Scanner;

public class tryme {

    public int add(int a, int b)
    {int sum=a+b;
    return sum;}

    public int sub(int a, int b)
    {int diff=a-b;
    return diff;
    }
    public int div(int a, int b)
    {int quo=a/b;
    return quo;}

    public int mul(int a, int b)
    {int ans=a*b;
    return ans;
    }
    public int mod(int a, int b)
    {int ans=a%b;
        return ans;}
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int ans;
        // char ex;   //bullshit
        
        tryme obj =new tryme();
        char op;   /*instead of accesing the character inside you have to intialise it as globally beacuse when you were 
                     intialising it inside the do loop after checking it wasnt able to find for the character thats y it wasnt executing further */
        
       do{
        System.out.println("Enter the opertaor or you press x if you want to exit");
        op = in.next().charAt(0);     //taking operator input
        if ( op == 'x' || op == 'X')   /* checking if the operator inputed is x or not if it does it will break from the loop 
                                          u havent breaked it so it wasn't coming out of the loop */ 
        {
            break;
        }
        
               /*initilising the numbers to be input should be inside coz everytime it enters the loop it
               it will ask the user to enter something! u have initialised it outside so it wasn't
               asking for inputs any further */
        else                                                     
        {                                                            
        System.out.println("Enter the 1st number");                
        int a =in.nextInt();
        System.out.println("Enter the 2nd number");
        int b = in.nextInt();     
          
            if(op=='+')
            {
                ans = obj.add(a, b);
                System.out.println(ans);
            }
            else if(op=='-') {
                ans = obj.sub(a, b);
                System.out.println(ans);
            }
            else if(op=='/')
              {
                  if(b==0)
                      System.out.println("UNDIFINED");
                  else {
                      ans = obj.div(a, b);
                      System.out.println(ans);
                  }
              }

            else if(op=='*') {
                ans = obj.mul(a, b);
                System.out.println(ans);
            }
            else if(op=='%') {
                ans = obj.mod(a, b);
                System.out.println(ans);
            }
        //    System.out.println("Press 'X' to exit or enter to continue.");  //bullshit
        //    ex= in.next().charAt(0);     //// this is not required you are just checking that its x or not so check with the operator user inputs
           
        }

        } while(op!='x'||op!='X');   /*as i said about the do loop it will first print then check so now it will check whether the inputed 
                                     operator is x or not  if it is loop will stop and if it isn't loop will continue*/
    

    }
}

/*Tip : Try using while loops in such cases program ka complextity and length dono kamta hai */
