import java.util.Scanner;

public class Maximum {
    public static Integer FindMax(Integer x,Integer y,Integer z){

        Integer max=(x.compareTo(y)>0)?x:y;
        return (max.compareTo(z)>0)?max:z;
    }

    public static float FindMax(Float x,Float y,Float z){

        Float max=(x.compareTo(y)>0)?x:y;
        return (max.compareTo(z)>0)?max:z;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Integer Values");

        /*
        Test Case 1: Max at 1st position
         */
        Integer max1=FindMax(30,20,10);
        System.out.println("TestCase1:Max at 1st position:Max value "+max1);

        /*
        Test Case 2: Max at 2st position
         */
        Integer max2=FindMax(20,70,10);
        System.out.println("TestCase2:Max at 2st position:Max value "+max2);

        /*
        Test Case 3: Max at 3rd position
         */
        Integer max3=FindMax(30,20,45);
        System.out.println("TestCase1:Max at 3st position:Max value "+max3);

        System.out.println("Float values");



        /*
        Test Case 1: Max at 1st position
         */
        Float max1_float=FindMax(30.6f,20.3f,10.1f);
        System.out.println("TestCase1:Max at 1st position:Max value "+max1_float);

        /*
        Test Case 2: Max at 2st position
         */
        Float max2_float=FindMax(20.6f,70.5f,10.1f);
        System.out.println("TestCase2:Max at 2st position:Max value "+max2_float);

        /*
        Test Case 3: Max at 3rd position
         */
        Float max3_float=FindMax(30.7f,20.1f,45.13f);
        System.out.println("TestCase1:Max at 3st position:Max value "+max3_float);
    }
}
