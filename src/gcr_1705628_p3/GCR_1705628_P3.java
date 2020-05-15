/*
 * NAME: Raghad zohair .. ID: 1705628 .. section number: GCR .. course number: CPCS202 .
 * EMAIL: ryahya0010@stu.kau.edu.sa
 * Program and Assignment 3: Uber Fare Calculator.
 * Due: Sunday, November 30th , 2017 .
 */
package gcr_1705628_p3;

import java.util.Scanner;

/**
 *
 * @author Raghad
 */
public class GCR_1705628_P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variable       
        int firstMenu=0, choice, time, rating, farex=0, farexl=0, fareb=0, 
            estx=0, estxl=0, estb=0, ratex=0, ratexl=0, rateb=0 ;
        double distance, minix=8, minixl=12, minib=20;       
        String massege ="Please provide the information about your journey:";
                
        while(true){
            //table of main menu
            System.out.println("----------------------------------------------------");
            System.out.println("###        Welcome to Uber Fare Calculator       ###");
            System.out.println("----------------------------------------------------");
            System.out.println("|"+1+"  :  Get fare information about available rides  |");
            System.out.println("|"+2+"  :  Get a Fare Estimate for your Journey        |");
            System.out.println("|"+3+"  :  Submit Rating of your Ride                  |");
            System.out.println("|"+4+"  :  Exit                                        |");
            System.out.println("----------------------------------------------------");
            System.out.print("> Please enter your choice... (1-4):");
            choice = input.nextInt();
            if(choice>4||choice<1){
                System.out.println("\t\tInvalid Choice!! Please Try again");            
                  continue;
            }
            System.out.println();
            //display summary
            if(choice==4){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("###                               SUMMARY                             ###");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("| Ride        | # of Fare Info. | # Fare Est. | # of Submitted Ratings. |");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("| UberX       |               "+farex+" |           "+estx+" |\t\t\t      "+ratex+" |");
                System.out.println("| UberXL      |               "+farexl+" |           "+estxl+" |\t\t\t      "+ratexl+" |");
                System.out.println("| UberXBlack  |               "+fareb+" |           "+estb+" |\t\t\t      "+rateb+" |");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("  Thank you for using Uber Fare Calculation System!");
                System.exit(0);
            }
                while(true){
                // table of rides menu
                if(choice==1 || choice==2 || choice==3){
                System.out.println("-------------------------------------");
                System.out.println("***             RIDES             ***");
                System.out.println("-------------------------------------");
                System.out.println("| X or x : UberX                    |\n"+
                                    "| L or l : UberXL                   |\n"+
                                    "| B or b : UberBlack                |\n"+
                                    "| R or r : Return to Main Menu      |");
                System.out.println("-------------------------------------");               
                System.out.print("> Please enter your choice...");
                }
                input.nextLine();
                char choice2 = input.next().charAt(0);
                if(choice2 == 'r'|| choice2 == 'R'){
                    break;
                }
                if(!(choice2 =='x'||choice2 =='X' || choice2 =='L'||choice2 =='l' || choice2=='B'||choice2 =='b')){
                        System.out.println("\t\tInvalid Choice!! Please Try again");
                          continue;
                }
                if((choice==1)&&(choice2=='x'||choice2=='X'))
                    farex++;
                if((choice==1)&&(choice2=='l'||choice2=='L'))
                    farexl++;
                if((choice==1)&&(choice2=='b'||choice2=='B'))
                    fareb++;
                System.out.println(); 
                    while(true){
                        // table of options menu
                        if(choice==1){
                        if(choice2 =='x'||choice2 =='X' || choice2 =='L'||choice2 =='l' || choice2=='B'||choice2 =='b'){
                        System.out.println("-------------------------------------");
                        System.out.println("***            OPTIONS            ***");
                        System.out.println("-------------------------------------");
                        System.out.println("| B or b:  Base fare                |");
                        System.out.println("| M or m:  Cost per minute          |");
                        System.out.println("| K or k:  Cost per km              |");
                        System.out.println("| S or s:  Service fee              |");
                        System.out.println("| C or c:  Cancellation fee         |");
                        System.out.println("| F or f:  Minimum fee              |");
                        System.out.println("| R or r:  Previous Menu            |");
                        System.out.println("-------------------------------------");
                        System.out.print("> Please enter your choice...");
                        input.nextLine();
                        char choice3 = input.next().charAt(0);
                        if(choice3 =='r' || choice3=='R'){
                            break;
                        }
                        if(!(choice3 =='B'||choice3 =='b' || choice3 =='M'||choice3 =='m' || choice3=='K'||choice3 =='k' 
                                || choice3=='S'||choice3=='s' || choice3=='C'||choice3=='c' || choice3=='F'||choice3=='f'))
                            System.out.println("\t\tInvalid Choice!! Please Try again");
                                                            
                        System.out.println();
                          
                        if(choice2=='x'||choice2=='X'){                            
                            if(choice3=='b'||choice3=='B')
                                System.out.println("Base fare for UberX is 3.2SR");
                            if(choice3=='m'||choice3=='M')
                                System.out.println("Cost per minute for UberX is 0.25SR"); 
                            if(choice3=='k'||choice3=='K')
                                System.out.println("Cost per km for UberX is 0.9SR");
                            if(choice3=='s'||choice3=='S')
                                System.out.println("Service fee for UberX is 0RS");
                            if(choice3=='c'||choice3=='C')
                                System.out.println("Cancellation fee for UberX is 8RS");
                            if(choice3=='f'||choice3=='F')
                                System.out.println("Minimum fee for UberX is 8RS");                           
                        }                       
                        if(choice2=='l'||choice2=='L'){                            
                            if(choice3=='b'||choice3=='B')
                                System.out.println("Base fare for UberXL is 5.5RS"); 
                            if(choice3=='m'||choice3=='M')
                                System.out.println("Cost per minute for UberXL is 0.4RS");
                            if(choice3=='k'||choice3=='K')                               
                                System.out.println("Cost per km for UberXL is 1.25RS");
                            if(choice3=='s'||choice3=='S')
                                System.out.println("Service fee for UberXL is 0RS");
                            if(choice3=='c'||choice3=='C')                               
                                System.out.println("Cancellation fee for UberXL is 12RS");
                            if(choice3=='f'||choice3=='F')
                                System.out.println("Minimum fee for UberXL is 12RS");
                        }
                        if(choice2=='b'||choice2=='B'){                           
                            if(choice3=='b'||choice3=='B')
                                System.out.println("Base fare for UberBlack is 9.5RS"); 
                            if(choice3=='m'||choice3=='M')
                                System.out.println("Cost per minute for UberBlack is 0.85RS");
                            if(choice3=='k'||choice3=='K')
                                System.out.println("Cost per km for UberBlack is 1.8RS");
                            if(choice3=='s'||choice3=='S')
                                System.out.println("Service fee for UberBlack is 1.3RS");
                            if(choice3=='c'||choice3=='C')
                                System.out.println("Cancellation fee for UberBlack is 20RS");
                            if(choice3=='f'||choice3=='F')
                                System.out.println("Minimum fee for UberBlack is 20RS");
                        }                                                                           
                        }
                        }                        
                        if(choice==2){
                           if(choice2=='x'||choice2=='X'){
                                estx++;
                                System.out.println(massege);
                                System.out.println("------------------------------------------------------");
                                System.out.print("Ride time in minutes: ");
                                time = input.nextInt();
                                System.out.print("Ride distance in KM(s): ");
                                distance = input.nextDouble();
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                double totalX = 3.2+(time*0.25)+(distance*0.9)+0;
                                if(totalX<minix)
                                    System.out.printf(" > Expected ride fare: %.2fSR  <",minix);
                                else {
                                System.out.printf(" > Expected ride fare: %.2fSR  <",totalX);
                                }
                                System.out.println();
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println();
                                  break;                                  
                           }
                           if(choice2=='l'||choice2=='L'){
                                estxl++;
                                System.out.println(massege);
                                System.out.println("------------------------------------------------------");
                                System.out.print("Ride time in minutes: ");
                                time = input.nextInt();
                                System.out.print("Ride distance in KM(s): ");
                                distance = input.nextDouble();
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                double totalXl = 5.5+(time*0.4)+(distance*1.25)+0;
                                if(totalXl<minixl)
                                    System.out.printf(" > Expected ride fare: %.2fSR  <",minixl);
                                else{
                                System.out.printf(" > Expected ride fare: %.2fSR  <",totalXl);
                                }
                                System.out.println();
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");                               
                                System.out.println();
                                  break;
                           }
                           if(choice2=='b'||choice2=='B'){
                                estb++;
                                System.out.println(massege);
                                System.out.println("------------------------------------------------------");
                                System.out.print("Ride time in minutes: ");
                                time = input.nextInt();
                                System.out.print("Ride distance in KM(s): ");
                                distance = input.nextDouble();
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                double totalBlack = 9.5+(time*0.85)+(distance*1.8)+1.3 ;
                                if(totalBlack<minib)
                                    System.out.printf(" > Expected ride fare: %.2fSR  <",minib);
                                else{
                                System.out.printf(" > Expected ride fare: %.2fSR  <",totalBlack);
                                }
                                System.out.println();
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println();
                                  break;
                           }
                        }
                        
                        // table of rating menue
                        if(choice==3){
                            if(choice2=='x'||choice2=='X')
                                ratex++;
                            if(choice2=='l'||choice2=='L')
                                ratexl++;
                            if(choice2=='b'||choice2=='B')
                                rateb++;
                            System.out.println("-------------------------------------");
                            System.out.println("***             RATING            ***");
                            System.out.println("-------------------------------------");
                            System.out.println("| 1 Poor                            |");
                            System.out.println("| 2 Borderline                      |");
                            System.out.println("| 3 Satisfactory                    |");
                            System.out.println("| 4 Good                            |");
                            System.out.println("| 5 Outstanding                     |");
                            System.out.println("-------------------------------------");
                            System.out.print(" > Please enter your choice... (1-5): ");
                            rating = input.nextInt();
                            if(rating<1 || rating>5){
                                System.out.println("\t\tInvalid Choice!! Please Try again");
                                System.out.println();
                                    continue;
                            }
                            System.out.println();
                            System.out.println("Thank you for your rating!");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println(" You give rating > "+rating+" <");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println();
                                break;                                
                            
                        }
                    }                             
                }                                                              
        firstMenu=4;
        }           
    }             
}  

