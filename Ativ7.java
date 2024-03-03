import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        double sum = 0;
        int counter = 0;
        double average = 0;
        
        
        do{
            System.out.println("Insira um valor maior que 0");
            number = reader.nextInt();
           
            if (number > 0){
                sum += number;
                counter++;
            }
        } while(number != 0);
        
        average = (double)(sum / counter);
        System.out.println("A media dos valores é " + average
        + ".\r\nE a quantidade de numeros inseridos foram " + counter + ".");
        
        reader.close();
    }
}
