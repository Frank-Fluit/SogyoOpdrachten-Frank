import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class lists
{

   
    public static LinkedList Listgenerator(){

        LinkedList<Integer> randlist = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++){

            Random random = new Random();

            randlist.add(random.nextInt(100));

        }
        return(randlist);

    }

    
    public static int Maxcheck(LinkedList<Integer> inputlist){

        int maxvalue = 0;

        for (int i = 0; i < 10; i++){
            int num = inputlist.get(i);

            if(num > maxvalue){
               maxvalue = num;
            }
        }
        return(maxvalue);
    }


 
    public static int sumof2min(LinkedList<Integer> inputlist){

        int minvalue1 = 101;
        int minvalue2 = 101;

        for (int i = 0; i < 10; i++){
            int num = inputlist.get(i);

            if(num < minvalue1){
                minvalue2 = minvalue1;
                minvalue1 = num;
            }

            else if (num < minvalue2){
                minvalue2 = num;
            }

        }

        int sum2min = minvalue1 + minvalue2;

        return(sum2min);

    }

    public static LinkedList<Integer> Evennumlist(LinkedList<Integer> inputlist){

        LinkedList<Integer> evennums = new LinkedList<Integer>();


        for (int i = 0; i <10; i++){

            int num = inputlist.get(i);

            if(num % 2 == 0){

                evennums.add(num);
            }
        }

        return(evennums);
    }

  
    public static LinkedList<Integer> Dividableby3(LinkedList<Integer> inputlist){

        LinkedList<Integer> dividby3 = new LinkedList<Integer>();


        for (int i = 0; i <10; i++){

            int num = inputlist.get(i);

            if(num % 3 == 0){

                dividby3.add(num);
            }
        }

        return(dividby3);
    }


    public static LinkedList<Integer> Dividableby5(LinkedList<Integer> inputlist){

        LinkedList<Integer> dividby5 = new LinkedList<Integer>();


        for (int i = 0; i <10; i++){

            int num = inputlist.get(i);

            if(num % 5 == 0){

                dividby5.add(num);
            }
        }
        return(dividby5);
    }

 
    public static LinkedList<Integer> Undividable(LinkedList<Integer> inputlist){

        LinkedList<Integer> undivid = new LinkedList<Integer>();


        for (int i = 0; i <10; i++){

            int num = inputlist.get(i);

            if(num % 2 != 0 && num % 3 != 0 && num%5 !=0){

                undivid.add(num);
            }          
        }
        return(undivid);
    }

    

    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (list.get(j) > list.get(j + 1)) {
                    
                    int temp = list.get(j);

                    list.set(j, list.get(j + 1));

                    list.set(j + 1, temp);

                    swapped = true;

                }
            }

            
            if (!swapped) {
                break;
            }
        }
    }
    

    
  
    public static void main(String args[])
    {

        LinkedList<Integer> list1 = Listgenerator();

        System.out.println("this is the generated list" + list1);

        System.out.println("max nr in list is: " + Maxcheck(list1));

        System.out.println("sum of the two min in list is: " + sumof2min(list1));

        System.out.println("The even nrs are: " + Evennumlist(list1));

        System.out.println("The nrs dividable by 3 are: " + Dividableby3(list1));

        System.out.println("The nrs dividable by 5 are: " + Dividableby5(list1));

        System.out.println("The nrs undividable by 2,3 and 5 are: " + Undividable(list1));

        ArrayList<Integer> list1asarray = new ArrayList<>(list1);
        
        bubbleSort(list1asarray);

        System.out.println("Sorted list: " + list1asarray);
                
            }        
        }
    
    
    
    
    
    
    
    
