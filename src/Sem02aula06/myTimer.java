package Sem02aula06;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public class myTimer {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Escreva sua data de anscimento em dias/mes/ano");
        getUrAge(JOptionPane.showInputDialog("Ano de nascimento: "));
    }

    public static void getUrAge(String input) {
        Calendar date = Calendar.getInstance();

        String[] birth = input.split("/");

        date.set(Integer.parseInt(birth[2]), Integer.parseInt(birth[1]) - 1, Integer.parseInt(birth[0]));
        JOptionPane.showMessageDialog(null, date.getTime());
    }
}
