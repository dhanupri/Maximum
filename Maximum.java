import java.util.Scanner;

public class Maximum {
    public static Integer FindMax(Integer x,Integer y,Integer z){

        Integer max=(x.compareTo(y)>0)?x:y;
        return (max.compareTo(z)>0)?max:z;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

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
    }
}
