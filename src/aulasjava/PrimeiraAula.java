package aulasJava;

import javax.swing.JOptionPane;

public class PrimeiraAula {

    public static void main(String[] args) {

        // entendendo os tipos de variáveis
        String nome = "Sérgio";
        double altura = 1.72;
        double peso = 81.5;
        boolean estaMatriculado = true;
        int dataNascimento = 1998;
        // exibindo resultados
        int resultadoIdade = pegarIdade(dataNascimento);
        JOptionPane.showMessageDialog(null, nome + " " + resultadoIdade + " anos de idade");
        System.out.println(resultadoIdade);
        // estrutura de rotina
        if (resultadoIdade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de Idade");
        }
        // estruturas de vetores
        String[] frutas = new String[5];
        frutas[0] = "Laranja";
        frutas[1] = "Maçã";
        frutas[2] = "Abacate";
        frutas[3] = "Kiwi";
        frutas[4] = "Banana";
        // analisando estruturas de reptição
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        /*
        for(int i = 0; i < frutas.length; i++){
        System.out.println(frutas[i]);
        }
         */
        short index = 0;
        while (index < frutas.length) {
            System.out.println(frutas[index] + " Gerado pelo WHILE");
            index++;
        }
        index = 0;
        do {
            System.out.println(frutas[index] + " Gerado no DO WHILE");
            index++;
        } while (index < frutas.length - 3);
        // utilizando classes do  tipo primitivo
        Integer variavelEnvolucra = 10;
        Double duplo = 2.10;
    }

    // inicializando métodos internos
    protected static int pegarIdade(int anoNascimento) {
        return 2023 - anoNascimento;
    }
}
