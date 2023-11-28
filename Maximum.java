import java.util.Scanner;

public class Maximum {
    public static <E extends Comparable> void  FindMax(E x,E y,E z){

       E max=(x.compareTo(y)>0)?x:y;
        E max1=(max.compareTo(z)>0)?max:z;
        System.out.println(max1);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Integer Values");

       
         /*
        Test Case 1: Max at 1st position
         */
        Maximum.FindMax(30,20,10);
        System.out.println("TestCase1:Max at 1st position:Max value ");

        /*
        Test Case 2: Max at 2st position
         */
        Maximum.FindMax(20,70,10);
        System.out.println("TestCase2:Max at 2st position:Max value ");

        /*
        Test Case 3: Max at 3rd position
         */
        Maximum.FindMax(30,20,45);
        System.out.println("TestCase1:Max at 3st position:Max value ");

        System.out.println("Float values");

        /*
        Test Case 1: Max at 1st position
         */
        Maximum.FindMax(30.6f,20.3f,10.1f);
        System.out.println("TestCase1:Max at 1st position:Max value ");

        /*
        Test Case 2: Max at 2st position
         */
       Maximum.FindMax(20.6f,70.5f,10.1f);
        System.out.println("TestCase2:Max at 2st position:Max value ");

        /*
        Test Case 3: Max at 3rd position
         */
       Maximum.FindMax(30.7f,20.1f,45.13f);
        System.out.println("TestCase1:Max at 3st position:Max value ");

        System.out.println("String value");

        /*
        Test Case 1: Max at 1st position
         */
        Maximum.FindMax("Peach","Apple","Banana");
        System.out.println("TestCase1:Max at 1st position:Max value ");

        /*
        Test Case 2: Max at 2st position
         */
        Maximum.FindMax("Red","Yellow","Blue");
        System.out.println("TestCase2:Max at 2st position:Max value ");

        /*
        Test Case 3: Max at 3rd position
         */
       Maximum.FindMax("hello","hi","world");
        System.out.println("TestCase1:Max at 3st position:Max value ");



    }
}
