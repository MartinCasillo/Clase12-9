
import java.util.Scanner;

public class Comparar {
    public static void main(String[] args){
        comparar(num1(),num2());
    }

    public static int num1(){

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = scan1.nextInt();
        return numero1;
    }

    public static int num2() {
        System.out.println("Ingrese un segundo numero");
        Scanner scan2 = new Scanner(System.in);
        int numero2 = scan2.nextInt();
        return numero2;
    }

    public static void comparar(int numero1,int numero2){
        if(numero1 < numero2){
            System.out.println( numero1 + " Es mayor que " + numero2);
        }else if(numero1 > numero2){
            System.out.println(numero1 + " Es menor que " + numero2);
        }else{
            System.out.println(numero1 + " Y " + numero2 + " Son iguales");
        }
    }
}





