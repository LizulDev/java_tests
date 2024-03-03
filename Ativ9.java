import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Ativ9 {
    private static final double HOTDOG_PRICE = 11.70;
    private static final double BAURU_SIMPLE_PRICE = 6.30;
    private static final double BAURU_WITH_EGG_PRICE = 7.60;
    private static final double HAMBURGER_PRICE = 15.40;
    private static final double SODA_PRICE = 5.00;
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String getOut = "s"; 
        
        int [] menuFoods = new int[5];
        
        double [] results = new double[5];
        double totalSum = 0;

        do {
            System.out.println("Menu: ");
            System.out.println("[100]Cachorro Quente - R$ 11,70\n[101]Bauru Simples - R$ 6,30\n" + 
                        "[102]Bauru com ovo - R$7,60\n[103]Hamburguer - R$15,40\n[105]Refrigerante - R$5,00");

            String numberChosen = reader.nextLine();
            switch (numberChosen) {
                case "100":
                    menuFoods[0]++;
                    break;
                case "101":
                    menuFoods[1]++;
                    break;
                case "102":
                    menuFoods[2]++;
                    break;
                case "103":
                    menuFoods[3]++;
                    break;
                case "105":
                    menuFoods[4]++;
                    break;
            
                default:
                    System.out.println("Opcao incorreta");
                    break;
                }    
                System.out.println("Deseja continuar? s/n");
                getOut = reader.nextLine();
        } while (getOut.equals("s"));
        
        results[0] = multiplyValues(menuFoods[0], HOTDOG_PRICE);
        results[1] = multiplyValues(menuFoods[1], BAURU_SIMPLE_PRICE);
        results[2] = multiplyValues(menuFoods[2], BAURU_WITH_EGG_PRICE);
        results[3] = multiplyValues(menuFoods[3], HAMBURGER_PRICE);
        results[4] = multiplyValues(menuFoods[4], SODA_PRICE);

        for (int j = 0; j < results.length; j++) {
            totalSum += results[j];
        }

        displayResults(menuFoods, totalSum);
        
        reader.close();
    }   

    private static double multiplyValues(int menuFoods, final double CONSTANT){
        return menuFoods * CONSTANT;
    }

    private static void displayResults(int [] menuFoods, double totalSum){
        String [] itemNames = {"Cachorro Quente", "Bauru Simples", "Bauru com ovos", "Hamburger", "Refrigerante"};
        System.out.println("Itens pedidos:");
        for (int i = 0; i < menuFoods.length; i++) {
            System.out.println(itemNames[i] + " - " + menuFoods[i] + " unidades");
        }
        System.out.println("O valor total da compra eh: " + totalSum);
    }
}
