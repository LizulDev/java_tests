
package exercicios_ava;

import java.util.Scanner;

public class Ativ6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Escolha um valor entre 0 e 100");
        int value = reader.nextInt();
        
        System.out.println("Valores pares entre " + value + " e 100: ");
        
        if (value % 2 == 0){
            for (int index = value; index <= 100; index+=2){
                System.out.println(index);
            }
        } else {
            value++;
            for (int index = value; index <= 100; index+=2){
                System.out.println(index);
            }
        }
        reader.close();        
    }
    
    
    
}
