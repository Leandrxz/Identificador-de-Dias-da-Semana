package exercicio.pkg13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
           
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um numero de 1 a 7: ");

        
        int dia = leitor.nextInt();
        
         switch (dia){
        case 1:
            System.out.print("O dia Digitado e domingo");
            break;
        case 2:
            System.out.print("O dia Digitado e Segunda");
            break;
        case 3:
            System.out.print("O dia Digitado e Terca");
            break;
        case 4:
            System.out.print("O dia Digitado e Quarta");
            break;
        case 5:
            System.out.print("O dia Digitado e Quinta");
            break;
        case 6:
            System.out.print("O dia Digitado e Sexta");
            break; 
        case 7:
            System.out.print("O dia Digitado e Sabado");
            break;
        default:
            System.out.print("Opcao invalida");
            break;
          
    }

    }
    
}
