import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class lists
{
    public static int RandnrGenerator(){
        Random random = new Random();
        return(random.nextInt(100));
    }

    public static void main(String args[])
    {
        List numbers2 = new LinkedList();

        List evennumbers = new LinkedList();

        List dividable3numbs = new LinkedList();

        List dividable5numbs = new LinkedList();

        List remainingnumbs = new LinkedList();


        int maxvalue = 0;

        int minvalue1 = 101;

        int minvalue2 =101;



        // To be separated, here the list is generated, the minimal two numbers are found and the largerst one
        // make into generate list class, find max class, find sum 2 minimum values.
        // When putting in classes, also think about taking the instatiation of the minimum and maximun values.

        for (int i = 0; i < 10; i++){
            
            numbers2.add(RandnrGenerator());

            int num = (Integer)numbers2.get(i);

            


            if(num > maxvalue){
                maxvalue = num;
            }

            if(num < minvalue1){
                minvalue2 = minvalue1;
                minvalue1 = num;
            }

            else if (num < minvalue2){
                minvalue2 = num;
            }

            
           
        }



        //Put all of this in one class, also think about the instatiation of the lists

        for (int i = 0; i < 10; i++){
            int num = (Integer)numbers2.get(i);

            if(num % 2 == 0){
                evennumbers.add(num);
            }

            if(num % 3 == 0){
                dividable3numbs.add(num);
            }

            if(num % 5 == 0){
                dividable5numbs.add(num);
            }

            if(num % 2 != 0 && num % 3 != 0 && num%5 !=0){
                remainingnumbs.add(num);
            }

        }
        int a =1;


        //Bubblesort, still to put all the different "functions" in different classes so it looks more tidy
        for (int i = 0; i < numbers2.size(); i++){
            System.out.println("OUTER!!!!!!!!!!!!!!!!!!!!!!!!!");
            for(int j = 0; j < (numbers2.size() - i); j++){  
                System.out.println("inner");

            }
            //int num = (Integer)numbers2.get(i);
            //int num2 = (Integer)numbers2.get(i+1);
            //System.out.println("num" + a);
            //a = a+1;
            //System.out.println(num);
            
            //System.out.println(num);

        }
           
        System.out.println("The generated random nr list is: " + numbers2.toString());

        System.out.println("The even numbers are: " + evennumbers.toString());

        System.out.println("The numbers dividable by 3 are: " + dividable3numbs.toString());

        System.out.println("The numbers dividable by 5 are: " + dividable5numbs.toString());

        System.out.println("The numbers undividable by 2,3 and 5 are: " + remainingnumbs.toString());

        System.out.println("The biggestnr from this list is:" + maxvalue);

        System.out.println("The smallestnr from this list are:" + minvalue1 + " and "+minvalue2);
        
        int totalmin = minvalue1 + minvalue2; 

        System.out.println("These values added up together are:" + totalmin);
        System.out.println("size test : " + numbers2.size());

        
         }
}