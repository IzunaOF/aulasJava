package aulasjava.Aula03;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args){
        
        // Simulando DATABASE
        int vagas = 5;
        String nomeAlunos[] = new String[vagas];
        Boolean matriculado[] = new Boolean[vagas];
        Double mediaAlunos[] = new Double[vagas];
        Integer idadeAlunos[] = new Integer[vagas];
        
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vagas; i++) {
         System.out.println("Informe Seu Nome: ");
         nomeAlunos[i] = leitor.nextLine();
         
         System.out.println("Você é estudante? ");
         matriculado[i] = leitor.nextBoolean();
         
         System.out.println("Digite a média das notas: ");
         mediaAlunos[i] = leitor.nextDouble();
         
         System.out.println("Quantos anos você tem? ");
         idadeAlunos[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < vagas; i++) {
            System.out.println("O Aluno" + nomeAlunos[i] + " teve média de " + mediaAlunos[i]);
            System.out.println("Idade: " + idadeAlunos[i] + "Matriculado: " + matriculado[i]);
        }
    }
}