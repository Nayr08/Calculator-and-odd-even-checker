/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package case1case2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Case1case2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do{
        System.out.println(" ----MENU---- ");
        System.out.println(" Type 1 for Calculator ");
        System.out.println(" Type 2 for odd/even checker ");    
        System.out.println(" ENTER: ");
        
        Scanner input=new Scanner(System.in);
        int choose;
        
        choose=input.nextInt();
        
        switch (choose){
            case 1 -> {
             do{
                 
                System.out.println(" ---CALCULATOR--- ");
                System.out.println(" Choose operation you want to use: ");
                System.out.println(" Type 1 for ADDITION");
                System.out.println(" Type 2 for SUBTRACTION");
                System.out.println(" Type 3 for MULTIPLICATION");
                System.out.println(" Type 4 for DIVISION");
                
                int operation;
                operation=input.nextInt();
                
                 switch (operation) {
                     case 1:
                         {
                             System.out.println(" ADDITION ");
                             System.out.println(" Enter first value: ");
                             double n=input.nextInt();
                             System.out.println(" Enter second value: ");
                             double n1=input.nextInt();
                             double answer=(n+n1);
                             System.out.println(" = "+ answer );
                             System.out.println(" Done calcuating...");
                             System.out.println(" Type 1 to continue using calculator ");
                             System.out.println(" Type 2 to go back to menu or exit application ");
                             break;
                         }
                     case 2:
                         {
                             System.out.println(" SUBTRACTION ");
                             System.out.println(" Enter first value: ");
                             double n=input.nextInt();
                             System.out.println(" Enter second value: ");
                             double n1=input.nextInt();
                             double answer=(n-n1);
                             System.out.println(" = "+ answer );
                             System.out.println(" Done calcuating...");
                             System.out.println(" Type 1 to continue using calculator ");
                             System.out.println(" Type 2 to go back to menu or exit application ");
                             break;
                         }
                     case 3:
                         {
                             System.out.println(" MULTIPLICATION ");
                             System.out.println(" Enter first value: ");
                             double n=input.nextInt();
                             System.out.println(" Enter second value: ");
                             double n1=input.nextInt();
                             double answer=(n*n1);
                             System.out.println(" = "+ answer );
                             System.out.println(" Done calcuating...");
                             System.out.println(" Type 1 to continue using calculator ");
                             System.out.println(" Type 2 to go back to menu or exit application ");
                             break;
                         }
                     case 4:
                         {
                             System.out.println(" DIVISION ");
                             System.out.println(" Enter first value: ");
                             double n=input.nextInt();
                             System.out.println(" Enter second value: ");
                             double n1=input.nextInt();
                             double answer=(n/n1);
                             System.out.println(" = "+ answer );
                             System.out.println(" Done calcuating...");
                             System.out.println(" Type 1 to continue using calculator ");
                             System.out.println(" Type 2 to go back to menu or exit application ");
                             break;
                         }
                     default:
                         break;
                 }
                  choose=input.nextInt();
                
                }while (choose==1);
                    
                }
            case 2 ->{
                
            do{
                
                System.out.println("  ---ODD/EVEN CHECKER--- ");
                System.out.println(" Enter the number: ");
                double n;
                n=input.nextInt();
                if (n%2==0){
                    System.out.println(n +" is even ");
                }
                else if (n%2==1){
                    System.out.println(n +" is odd");
                }
                System.out.println(" Type 1 to use odd/checker again ");
                System.out.println(" Type 2 to go back to menu or exit application");
                
                choose=input.nextInt();
                
                
            }while (choose==1);
            
            
             }
            
        }
                System.out.println(" Type 1 to go to MENU  ");
                System.out.println(" Type 2 to exit application  ");

                        int menu;
                        menu=input.nextInt();
                     if (menu==2){
                         break;
                     }
     
       
        
            }while (true);
    }
}
         
        
    
    
    
    
       
    

        
    
    

