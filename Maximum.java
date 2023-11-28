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

        Integer x1=10;
        Integer y1=20;
        Integer z1=30;
        Float x2=45.5f;
        Float y2=40.5f;
        Float z2=41.5f;
        String x3="hello";
        String y3="world";
        String z3="hi";
        
        System.out.println("Integer values");

        Maximum.FindMax(x1,y1,z1);

        System.out.println("Float values");

        Maximum.FindMax(x2,y2,z2);

        System.out.println("String values");

        Maximum.FindMax(x3,y3,z3);



    }
}
