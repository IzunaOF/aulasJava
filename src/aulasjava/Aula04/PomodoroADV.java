package aulasjava.Aula04;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class PomodoroADV extends javax.swing.JFrame {
    
    private final int focusTime = 25;
    private final int smallBreakTime = 5;
    private final int longBreakTime = 20;
    private final int roundsTime = 3;
    
    public PomodoroADV() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        timer = new javax.swing.JPanel();
        play = new javax.swing.JLabel();
        startTime = new javax.swing.JTextField();
        startTimeLabel = new javax.swing.JLabel();
        focusTimer = new javax.swing.JLabel();
        settingsButton = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        onFocusValue = new javax.swing.JSlider();
        StayFocusLabelName = new javax.swing.JLabel();
        focusLabel = new javax.swing.JLabel();
        SBName = new javax.swing.JLabel();
        smallBreak = new javax.swing.JSlider();
        smallBreakLabel = new javax.swing.JLabel();
        LBName = new javax.swing.JLabel();
        longBreak = new javax.swing.JSlider();
        longBreakLabel = new javax.swing.JLabel();
        rounds = new javax.swing.JSlider();
        roundsLabelName = new javax.swing.JLabel();
        roundsLabel = new javax.swing.JLabel();
        applyButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setToolTipText("");
        main.setLayout(new java.awt.CardLayout());

        timer.setBackground(new java.awt.Color(204, 204, 255));

        play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/play.png"))); // NOI18N
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        startTime.setBackground(new java.awt.Color(102, 102, 255));
        startTime.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        startTime.setForeground(new java.awt.Color(255, 255, 255));
        startTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        startTime.setText("10");
        startTime.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        startTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeActionPerformed(evt);
            }
        });

        startTimeLabel.setText("Start time");

        focusTimer.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        focusTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        focusTimer.setText("Stay on focus");

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/engrenagem.png"))); // NOI18N
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });

        timerLabel.setFont(new java.awt.Font("Edwardian Script ITC", 1, 96)); // NOI18N
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("00:00");

        javax.swing.GroupLayout timerLayout = new javax.swing.GroupLayout(timer);
        timer.setLayout(timerLayout);
        timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(startTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(focusTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(settingsButton)
                .addGap(23, 23, 23))
        );
        timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(settingsButton)
                .addGap(10, 10, 10)
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(focusTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        main.add(timer, "timer");

        settings.setBackground(new java.awt.Color(255, 255, 204));
        settings.setPreferredSize(new java.awt.Dimension(382, 456));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/claro.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        onFocusValue.setMaximum(60);
        onFocusValue.setMinimum(1);
        onFocusValue.setValue(10);
        onFocusValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onFocusValueStateChanged(evt);
            }
        });

        StayFocusLabelName.setText("Stay on Focus");

        focusLabel.setText("10:00");

        SBName.setText("Small Break");

        smallBreak.setMaximum(15);
        smallBreak.setMinimum(1);
        smallBreak.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                smallBreakStateChanged(evt);
            }
        });

        smallBreakLabel.setText("10:00");

        LBName.setText("Long Break");

        longBreak.setMaximum(30);
        longBreak.setMinimum(1);
        longBreak.setValue(20);
        longBreak.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                longBreakStateChanged(evt);
            }
        });

        longBreakLabel.setText("10:00");

        rounds.setMaximum(10);
        rounds.setMinimum(1);
        rounds.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                roundsStateChanged(evt);
            }
        });

        roundsLabelName.setText("Rounds");

        roundsLabel.setText("10:00");

        applyButton.setText("APLICAR");

        resetButton.setText("RESETAR");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(settingsLayout.createSequentialGroup()
                            .addComponent(roundsLabelName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundsLabel))
                        .addComponent(rounds, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(settingsLayout.createSequentialGroup()
                            .addComponent(LBName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(longBreakLabel))
                        .addComponent(longBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(settingsLayout.createSequentialGroup()
                            .addComponent(SBName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(smallBreakLabel))
                        .addComponent(smallBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(settingsLayout.createSequentialGroup()
                            .addComponent(StayFocusLabelName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(focusLabel))
                        .addComponent(onFocusValue, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(applyButton)
                        .addGap(31, 31, 31))))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StayFocusLabelName)
                    .addComponent(focusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onFocusValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SBName)
                    .addComponent(smallBreakLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smallBreak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBName)
                    .addComponent(longBreakLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(longBreak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundsLabelName)
                    .addComponent(roundsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(applyButton))
                .addGap(37, 37, 37))
        );

        main.add(settings, "settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        main.getAccessibleContext().setAccessibleName("Main");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTimeActionPerformed

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        // TODO add your handling code here:
        changeCard("settings");
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        changeCard("timer");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void onFocusValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onFocusValueStateChanged
        // TODO add your handling code here:
        setSliderStatus(onFocusValue, focusLabel);
    }//GEN-LAST:event_onFocusValueStateChanged

    private void smallBreakStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_smallBreakStateChanged
        // TODO add your handling code here:
        setSliderStatus(smallBreak, smallBreakLabel);
    }//GEN-LAST:event_smallBreakStateChanged

    private void longBreakStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_longBreakStateChanged
        // TODO add your handling code here:
        setSliderStatus(longBreak, longBreakLabel);
    }//GEN-LAST:event_longBreakStateChanged

    private void roundsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_roundsStateChanged
        // TODO add your handling code here:
        setSliderStatus(rounds, roundsLabel);
    }//GEN-LAST:event_roundsStateChanged

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        this.onFocusValue.setValue(focusTime);
        this.smallBreak.setValue(smallBreakTime);
        this.longBreak.setValue(longBreakTime);
        this.rounds.setValue(roundsTime);
    }//GEN-LAST:event_resetButtonActionPerformed
    
    private void setSliderStatus(JSlider slider, JLabel label) {
        label.setText(String.format("%02d:%02d", slider.getValue(), 00));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBName;
    private javax.swing.JLabel SBName;
    private javax.swing.JLabel StayFocusLabelName;
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel focusLabel;
    private javax.swing.JLabel focusTimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider longBreak;
    private javax.swing.JLabel longBreakLabel;
    private javax.swing.JPanel main;
    private javax.swing.JSlider onFocusValue;
    private javax.swing.JLabel play;
    private javax.swing.JButton resetButton;
    private javax.swing.JSlider rounds;
    private javax.swing.JLabel roundsLabel;
    private javax.swing.JLabel roundsLabelName;
    private javax.swing.JPanel settings;
    private javax.swing.JLabel settingsButton;
    private javax.swing.JSlider smallBreak;
    private javax.swing.JLabel smallBreakLabel;
    private javax.swing.JTextField startTime;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JPanel timer;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
    private void changeCard(String cardName) {
        CardLayout cardLayout = (CardLayout) this.main.getLayout();
        cardLayout.show(this.main, cardName);
    }
}
