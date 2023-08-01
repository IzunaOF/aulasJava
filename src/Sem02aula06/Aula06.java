package Sem02aula06;

import javax.swing.JOptionPane;

public class Aula06 {

    public static void main(String[] args) {
        //Exercicio 01 - Faça um Programa que peça a Idade e a Altura de 5 pessoas
        // Armazene cada inforrmação no meu respectivo vetor
        //Imprima a idade e a altura na ordem inversa a ordem lida

        String str = "O mundo da voltas";
        JOptionPane.showMessageDialog(null, transformCamelCase(str));
        // pegarDados();
    }

    public static String transformCamelCase(String str) {
        String nStr[] = str.split(" ");

        String result = nStr[0].toLowerCase();
        for (int i = 1; i < nStr.length; i++) {
            result += nStr[i].substring(0, 1).toUpperCase().concat(nStr[i].substring(1).toLowerCase());
        }
        return result;
    }

    static void pegarDados() {

        /*Double cadastros[][] = new Double[5][2];

        int cadastrados = 0;
        int rows = 0;

        while (cadastrados < cadastros.length) {
            double idade = Double.parseDouble(JOptionPane.showInputDialog("Qual sua Idade?"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua Altura?"));

            cadastros[rows][0] = idade;
            cadastros[rows][1] = altura;

            rows++;
            System.out.println("Proximo Cadastro");

            cadastrados++;
        }

        for (int i = cadastros.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println("- -");
            }
            System.out.print("Idade: " + cadastros[i][0]);
            System.out.print("Altura: " + cadastros[i][1]);
        }*/
        Pessoa cadastro[] = new Pessoa[5];

        int index = 0;
        while (index < cadastro.length) {

            String nome = JOptionPane.showInputDialog("Nome da Pessoa?");
            double idade = Double.parseDouble(JOptionPane.showInputDialog("Qual sua Idade?"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua Altura?").replace(',', '.'));

            cadastro[index] = new Pessoa(idade, altura, nome);
            index++;
            System.out.println("Proximo Cadastro");
        }

        String data = "";
        for (int i = cadastro.length - 1; i >= 0; i--) {
            data += (i + 1) + "º Nome: " + cadastro[i].getName() + " : " + "Idade: " + cadastro[i].getAge() + " : Altura: " + cadastro[i].getHeight() + ";\n";
        }
        JOptionPane.showMessageDialog(null, data);
    }
}
