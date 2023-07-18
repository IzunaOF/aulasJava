package aulasjava.Aula04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraInterface {

    public  PrimeiraInterface(){ 
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(400,300);
        janela.setVisible(true);
        
        //janela.setLayout(new BorderLayout());
        
       // janela.setLayout(new GridLayout(15, 15));
         janela.setLayout(null);
         JLabel texto = new JLabel("Texto Teste");
         JTextField input = new JTextField();
        JButton botao = new JButton("Adicionar botão");
        
        botao.setBounds(100, 100, 100, 30);
        botao.addActionListener(new ActionListener(){
            int top = 190;
            int left = 100;
            int width = 100;
            int height = 30;
            public void actionPerformed(ActionEvent e){
                janela.add(new JButton("adicionado")).setBounds(left, top, width, height);
                top += 35;
            }
        });
        texto.setBounds(100, 130, 100, 30);
        input.setBounds(100, 160, 100, 30);
        
        //janela.add(botao, BorderLayout.SOUTH);
        janela.add(texto);
        janela.add(botao);
        janela.add(input);
        
    } 
}
