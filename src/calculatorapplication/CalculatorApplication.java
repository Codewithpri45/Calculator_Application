
package calculatorapplication;

import java.util.Scanner;


public class CalculatorApplication {

    
    public static void main(String[] args) {
       
   CalculatorApplication ca = new CalculatorApplication();
   Scanner sc = new Scanner(System.in);
   
   
        System.out.println("WellCome To Calculator Aplication - By SHARMA JI");
        
        do {
            
            System.out.println(" Choose An Operation :- +,-,*,/,%");
            System.out.println(" Enter Your Choice:- ");
            System.out.print(" ->");
            String input= sc.next();
            char ch = input.charAt(0);
            if(input.length()!=1){
                System.out.println(" Wrong Input , Please Try Again !");
            }else{
                ca.chooseOperation(ch);
             }
            
                boolean exit = ca.exitProgram();
                if (exit) {
                    break;
                }
            
            
        }while(true);
        
        System.out.println(" Thanks For Using Our Calculator !");
    }
    
    public  boolean exitProgram(){
        
        Scanner sc = new Scanner(System.in);
        int times=0;
        int retry =5;
        for (times=0;times<retry;times++){
            System.err.println(" Do Want To Continue ? (y/n)");
            String exitInput= sc.next();
            char ch1 = exitInput.charAt(0);
            if(exitInput.length()==1&& ( ch1=='n'||ch1=='N')){
                return true;
            }else if( exitInput.length()==1 && (ch1=='y' || ch1=='Y' )){
                return false;
            }else{
                System.out.println(" Wrong Input Please Try Again !");
            }
        }
        if(times>=retry){
            System.out.println(" Sorry You Have Crossed Your Limits !");
            return true;
        }
        return false;
    }
    
    public int getInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.print("  Enter A Number :- ");
        int num = sc.nextInt();
        return num;
    }
    
    
    public void chooseOperation(char  ch){
        
        switch (ch) {
            
            case '+': 
                     int num1 = getInteger();
                     int num2 = getInteger();
                     System.out.println(" Addition of Numbers is : "+ (num1+num2));
                     break;
            case '-': 
                     int num3 = getInteger();
                     int num4 = getInteger();
                     System.out.println(" Substraction of Numbers is : "+ (num3-num4));
                     break;
            case '*': 
                     int num5 = getInteger();
                     int num6 = getInteger();
                     System.out.println(" Multiplication of Numbers is : "+ (num5*num6));
                     break;
            case '/': 
                     int num7= getInteger();
                     int num8 = getInteger();
                     if(num8==0){
                         System.out.println(" Divide By Zero Error !");
                     break;
                     }
                     else{
                         System.out.println(" Division of Numbers is : "+ (num7/num8));
                         break;
                     }
            case '%': 
                     int num9 = getInteger();
                     int num10 = getInteger();
                     if(num10==0){
                         System.out.println(" Divide By Zero Error !");
                         break;
                     }
                     else{
                       System.out.println(" Modulas of Numbers is : "+ (num9%num10));
                       break;
                     }
                
            default:
                System.out.println("  Unknown Operation");
        }
        
        
    }
    
}
