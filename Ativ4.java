import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int counter = 0;
        System.out.println("Digite um numero qualquer:");
        int number = reader.nextInt();
        
        while (counter <= number){
            System.out.println(counter);
            counter++;
        }
        reader.close();
    }
}
