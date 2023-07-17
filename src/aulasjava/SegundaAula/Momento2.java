
package aulasJava;

import java.util.ArrayList;

public class Momento2 {

    public static void main(String[] args) {
        char[] respostas = {'M', 'N', 'V', 'N', 'V'};

        for (char opt : respostas) {
            switch (opt) {
                case 'M':
                    System.out.println("Bom dia!");
                    break;
                case 'V':
                    System.out.println("Bom Tarde!");
                    break;
                case 'N':
                    System.out.println("Bom Noite!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        double[] meuVetor = {12, 11, 17, 54.5, 54.3, 37, 74, 97};
        bubbleSort(meuVetor, true);
    }

    static void bubbleSort(double[] vetor, boolean cresc) {
        double[] vetorAux = vetor.clone();
        double aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
                if (vetorAux[i] < vetorAux[j]) {
                    aux = vetorAux[i];
                    vetorAux[i] = vetorAux[j];
                    vetorAux[j] = aux;
                }
            }
        }
        
        if(!cresc){
            vetor = vetorAux;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
