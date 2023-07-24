package aulasjava.Aula04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Pomodoro extends javax.swing.JFrame {

    private int tempoRestante = 0;
    private int tempoInicial = 25;
    private Timer timer;
    int i = 0;

    public Pomodoro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startBtn = new javax.swing.JButton();
        tempoDecorrido = new javax.swing.JLabel();
        value = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        startBtn.setText("START");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        tempoDecorrido.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        tempoDecorrido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tempoDecorrido.setText("00:00");

        value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value.setText("25");
        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tempoDecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(tempoDecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tempoDecorrido.getAccessibleContext().setAccessibleName("00:00");
        value.getAccessibleContext().setAccessibleName("25");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // TODO add your handling code here:
        tempoInicial = Integer.parseInt(value.getText());
        tempoRestante = tempoInicial * 60; // tempor em segundos

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizaTempo();
            }
        });
        timer.start();
    }//GEN-LAST:event_startBtnActionPerformed

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueActionPerformed

    private void atualizaTempo() {
        int minutos = tempoRestante / 60;
        int segundos = tempoRestante % 60;

        String formatted = String.format("%02d:%02d", minutos, segundos);

        this.tempoDecorrido.setText(formatted);

        tempoRestante--;

        if (tempoRestante == 0) {
            timer.stop();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton startBtn;
    private javax.swing.JLabel tempoDecorrido;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
