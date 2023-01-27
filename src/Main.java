import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int numAleatorio = (int) (Math.random()*500);
        int numeroIntentos=0;
        System.out.println(numAleatorio);
        Scanner sr = new Scanner(System.in);

        do{

            try{
                System.out.println("Intenta adivinar el numero:");
                num=sr.nextInt();
                numeroIntentos+=1;
            }catch (InputMismatchException e){
                System.out.println("El valor introducido tiene que ser un entero");
                sr.nextLine();
            }
            if(num<numAleatorio){
                System.out.println("El numero es major");
            }else if(num>numAleatorio){
                System.out.println("El número es menor");
            }else if(num==numAleatorio){
                System.out.println("Felicidades lo has adivinado : " +num);
                System.out.println("Tu numero de intentos a sido : " +numeroIntentos);
            }
        }while (num!=numAleatorio);

    }

}