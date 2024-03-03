import java.util.Scanner;

public class Ativ8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vector = new int[2];
        int result = 0;

        System.out.println("Menu:");
        System.out.println("Escolha que operacao voce gostaria de fazer:");
        System.out.println("[1]Soma\n[2]Subtracao\n[3]Multiplicacao\n[4]Divisao");

        int input = scan.nextInt();

        for (int i = 0; i < 2; i++){
            System.out.println("Digite o valor " + (i+1) + ":");
            vector[i] = scan.nextInt();
        }
        
        switch (input) {
            case 1:
                for (int i = 0; i < vector.length; i++) {
                    result += vector[i];
                }
                System.out.println("Resultado da soma: " + result);
                break;
            case 2:
                result = vector[0] - vector[1];
                System.out.println("Resultado da subtracao: " + result);
                break;
            case 3:
                for (int i = 0; i < vector.length; i++) {
                    result = result * vector[i];
                }
                
                System.out.println("Resultado da multiplicacao: " + result);
                
                break;
            case 4:
                    if (vector[1] == 0){
                        System.out.println("Divisão por 0 nao ocorrida!");
                        break;
                    }
                    result = vector[0] / vector[1];
                
                System.out.println("Resultado da divisao: " + result);
                
                break;
            default:
                System.out.println("Opcao errada. Tente novamente");
                break;
        }

        scan.close();
    }

    
}
