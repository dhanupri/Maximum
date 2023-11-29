import java.util.Scanner;

public class Maximum <E  extends Comparable<E>>{

    private  E x;
    private E y;
    private E z;

    Maximum(E x,E y,E z){
        this.x=x;
        this.y=y;
        this.z=z;

    }
    public E  FindMax(){
        return Maximum.FindMax(x,y,z);
    }
    public static <E extends Comparable> E FindMax(E x,E y,E z){

       E max=(x.compareTo(y)>0)?x:y;
        E max1=(max.compareTo(z)>0)?max:z;
        return max1;
    }

    public static  <E>void display(E x,E y,E z,E max){
        System.out.println("max of "+x+","+y+","+z+" is:"+max);


    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Integer Values");


         /*
        Test Case 1: Max at 1st position
         */
         Maximum.display(30,20,10,Maximum.FindMax(30,20,10));


        /*
        Test Case 2: Max at 2st position
         */
        Maximum.display(20,70,10,Maximum.FindMax(20,70,10));


        /*
        Test Case 3: Max at 3rd position
         */
        Maximum.display(30,20,45,Maximum.FindMax(30,20,45));


        System.out.println("Float values");

        /*
        Test Case 1: Max at 1st position
         */
        Maximum.display(30.6f,20.3f,10.1f,Maximum.FindMax(30.6f,20.3f,10.1f));


        /*
        Test Case 2: Max at 2st position
         */
       Maximum.display(20.6f,70.5f,10.1f,Maximum.FindMax(20.6f,70.5f,10.1f));


        /*
        Test Case 3: Max at 3rd position
         */
       Maximum.display(30.7f,20.1f,45.13f,Maximum.FindMax(30.7f,20.1f,45.13f));


        System.out.println("String value");

        /*
        Test Case 1: Max at 1st position
         */
        Maximum.display("Peach","Apple","Banana",Maximum.FindMax("Peach","Apple","Banana"));


        /*
        Test Case 2: Max at 2st position
         */
        Maximum.display("Red","Yellow","Blue",Maximum.FindMax("Red","Yellow","Blue"));


        /*
        Test Case 3: Max at 3rd position
         */
       Maximum.display("hello","hi","world",Maximum.FindMax("hello","hi","world"));




    }
}
