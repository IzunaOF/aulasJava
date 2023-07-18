package aulasJava.SegundaAula;

public class Begin {

    public static void main(String[] args) {
        String[] letras = {"A", "a", "z", "t", "e", "y", "u"};
        String[] vogais = {"a", "e", "i", "o", "u"};

        for (String letra : letras) {
            for (String vogal : vogais) {

                String character = letra.toLowerCase();

                if (character.equals(vogal)) {
                    System.out.println("A letra " + letra + " é uma vogal");
                    System.out.println("A proxima letra no alfabeto é " + getChar(letra));
                    break;
                } else {
                    System.out.println("A letra " + letra + " é uma consoante");
                    System.out.println("A proxima letra no alfabeto é " + getChar(letra));
                    break;
                }

            }

        }

        double[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double valorSomado = soma(nums);

        System.out.println("O valor total do vetor de números somado é " + valorSomado);
    }

     static char getChar(String letra) {
        char character = ' ';
        for (int i = 0; i < 127; i++) {
            if (letra.charAt(0) == i) {
                character = (char) (i + 1);
                break;
            }
        }
        return character;
    }

    static double soma(double[] vetor) {
        double result = 0;
        for (int i = 0; i < vetor.length; i++) {
            result += vetor[i];
        }
        return result;
    }
}
