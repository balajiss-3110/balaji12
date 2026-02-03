import java.lang.*;
import java.util.*;
class ladder{
public static void main(String args[]){
     Scanner obj= new Scanner(System.in);

     System.out.println("Enter the HRmark");
      int HR=obj.nextInt();

      System.out.println("Enter the APmark");
      int AP=obj.nextInt();

       if(AP>70 && AP7<=100){
            
           if(HR>=60 && HR<=100){
              System.out.println("You are selected for salary discussion round");
                
                  int salary= HR+AP;
                    if(salary>=180 && salary <=250){
                      System.out.println("your salary is 25k");
                                  }
                       else if(salary>=130 && salary<180){
                              System.out.println("your salaty is  15k");
                              }
                               else if(salary>=150 && salary<150){
                              System.out.println("your salaty is  10k");
                              }
}
}


}
}