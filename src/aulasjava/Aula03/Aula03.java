package aulasjava.Aula03;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args){
        
         Scanner leitor = new Scanner(System.in);
         System.out.println("Informe Seu Nome: ");
         String nome = leitor.nextLine();
         
         System.out.println("Você é estudante? ");
         Boolean estudante = leitor.nextBoolean();
         
         System.out.println("Digite a média das notas: ");
         Double media = leitor.nextDouble();
         
         System.out.println("Quantos anos você tem? ");
         Integer idade = leitor.nextInt();
         //JOptionPane.showMessageDialog(null, "Bem Vindo " + nome);
         System.out.println("Olá " + nome);
    }
}
