package aulasjava.Aula03;

import aulasjava.Aula04.Pomodoro;
import aulasjava.Aula04.PrimeiraInterface;
import aulasjava.Aula04.SegundaInterface;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Aula03 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
//        leitor.match();
//        leitor.useDelimiter(",");
//        while (leitor.hasNextInt()) {
//            int numero = leitor.nextInt();
//            System.out.println("Números: " + numero);
//            leitor.skip(",");
//        } 
        // useJOptPane();
        //new PrimeiraInterface();
       // new SegundaInterface().setVisible(true);
        new Pomodoro().setVisible(true);
    }

    public static void useJOptPane() {
        System.out.println("Informe Seu Nome: ");
        String nome = JOptionPane.showInputDialog(null, "Escreva seu nome", "Preencha o Campo", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Você é estudante? ");
        Boolean matriculado = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Você está matriculado?", "Preencha o Campo", JOptionPane.INFORMATION_MESSAGE));

        System.out.println("Digite a média das notas: ");
        Double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Média do Semestre", "Preencha o Campo", JOptionPane.INFORMATION_MESSAGE));

        System.out.println("Quantos anos você tem? ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua Idade", "Preencha o Campo", JOptionPane.INFORMATION_MESSAGE));

        int confirm = JOptionPane.showConfirmDialog(null, "Deseja confirmar o cadastro?", "Conclusão de Cadastro", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Usuario ' " + nome + " ' Cadastrado", "Cadastro efetuado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro de autenticação", "Cadastro Interrompido", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void lerInfoUsuario() {
        // Simulando DATABASE
        int vagas = 5;
        String nomeAlunos[] = new String[vagas];
        Boolean matriculado[] = new Boolean[vagas];
        Double mediaAlunos[] = new Double[vagas];
        Integer idadeAlunos[] = new Integer[vagas];

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
