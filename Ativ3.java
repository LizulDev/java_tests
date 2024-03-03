import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        int value;
        
        System.out.println("Digite um valor de 1 a 10 para a tabuada:");
        value = reader.nextInt();
        
        System.out.println("Tabuada do " + value + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(value + " * " + i + " = " + (value*i) + ".");
        }
        reader.close();
    }
}
