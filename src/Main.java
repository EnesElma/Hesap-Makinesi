
public class Main extends javax.swing.JFrame {
    private String yazi="0";
    private int birinci_Sayi=0,ikinci_Sayi=0;
    private String islem="0";
    
    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yazi_alani = new javax.swing.JLabel();
        oneT = new javax.swing.JButton();
        twoT = new javax.swing.JButton();
        threeT = new javax.swing.JButton();
        fiveT = new javax.swing.JButton();
        sixT = new javax.swing.JButton();
        fourT = new javax.swing.JButton();
        eightT = new javax.swing.JButton();
        virgul = new javax.swing.JButton();
        sevenT = new javax.swing.JButton();
        zeroT = new javax.swing.JButton();
        bolu = new javax.swing.JButton();
        cikar = new javax.swing.JButton();
        carpi = new javax.swing.JButton();
        topla = new javax.swing.JButton();
        nineT = new javax.swing.JButton();
        arti_eksi = new javax.swing.JButton();
        esittir = new javax.swing.JButton();
        kopmle_sil = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        yazi_alani.setBackground(new java.awt.Color(255, 0, 0));
        yazi_alani.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        yazi_alani.setForeground(new java.awt.Color(51, 255, 0));
        yazi_alani.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yazi_alani.setText("0");
        yazi_alani.setToolTipText("");
        yazi_alani.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        yazi_alani.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        oneT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        oneT.setText("1");
        oneT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTActionPerformed(evt);
            }
        });

        twoT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        twoT.setText("2");
        twoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTActionPerformed(evt);
            }
        });

        threeT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        threeT.setText("3");
        threeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeTActionPerformed(evt);
            }
        });

        fiveT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fiveT.setText("5");
        fiveT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveTActionPerformed(evt);
            }
        });

        sixT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sixT.setText("6");
        sixT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixTActionPerformed(evt);
            }
        });

        fourT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fourT.setText("4");
        fourT.setToolTipText("");
        fourT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourTActionPerformed(evt);
            }
        });

        eightT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        eightT.setText("8");
        eightT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightTActionPerformed(evt);
            }
        });

        virgul.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        virgul.setText(",");

        sevenT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sevenT.setText("7");
        sevenT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenTActionPerformed(evt);
            }
        });

        zeroT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        zeroT.setText("0");
        zeroT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroTActionPerformed(evt);
            }
        });

        bolu.setBackground(new java.awt.Color(153, 255, 255));
        bolu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bolu.setForeground(new java.awt.Color(102, 255, 102));
        bolu.setText("/");
        bolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boluActionPerformed(evt);
            }
        });

        cikar.setBackground(new java.awt.Color(153, 255, 255));
        cikar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cikar.setForeground(new java.awt.Color(102, 255, 102));
        cikar.setText("-");
        cikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikarActionPerformed(evt);
            }
        });

        carpi.setBackground(new java.awt.Color(153, 255, 255));
        carpi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        carpi.setForeground(new java.awt.Color(102, 255, 102));
        carpi.setText("x");
        carpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpiActionPerformed(evt);
            }
        });

        topla.setBackground(new java.awt.Color(153, 255, 255));
        topla.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topla.setForeground(new java.awt.Color(102, 255, 102));
        topla.setText("+");
        topla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplaActionPerformed(evt);
            }
        });

        nineT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nineT.setText("9");
        nineT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineTActionPerformed(evt);
            }
        });

        arti_eksi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        arti_eksi.setText("-/+");

        esittir.setBackground(new java.awt.Color(153, 255, 255));
        esittir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        esittir.setForeground(new java.awt.Color(102, 255, 102));
        esittir.setText("=");
        esittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esittirActionPerformed(evt);
            }
        });

        kopmle_sil.setBackground(new java.awt.Color(153, 255, 255));
        kopmle_sil.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        kopmle_sil.setForeground(new java.awt.Color(102, 255, 102));
        kopmle_sil.setText("CE");

        sil.setBackground(new java.awt.Color(153, 255, 255));
        sil.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sil.setForeground(new java.awt.Color(102, 255, 102));
        sil.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fourT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fiveT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sixT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sevenT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(arti_eksi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(zeroT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(virgul, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(eightT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nineT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(oneT, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(twoT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(kopmle_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(threeT, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carpi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(esittir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(yazi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yazi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(kopmle_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(oneT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twoT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(threeT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bolu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carpi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(topla, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(virgul, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arti_eksi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esittir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //1 tuşu
    private void oneTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTActionPerformed
        if(yazi.equals("0"))   yazi="1";        
        else   yazi=yazi+"1";    
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_oneTActionPerformed

    private void twoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTActionPerformed
        if(yazi.equals("0"))   yazi="2";        
        else   yazi=yazi+"2";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_twoTActionPerformed

    private void threeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeTActionPerformed
        if(yazi.equals("0"))   yazi="3";        
        else   yazi=yazi+"3";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_threeTActionPerformed

    private void fourTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourTActionPerformed
        if(yazi.equals("0"))   yazi="4";        
        else   yazi=yazi+"4";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_fourTActionPerformed

    private void fiveTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveTActionPerformed
        if(yazi.equals("0"))   yazi="5";        
        else   yazi=yazi+"5";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_fiveTActionPerformed

    private void sixTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixTActionPerformed
        if(yazi.equals("0"))   yazi="6";        
        else   yazi=yazi+"6";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_sixTActionPerformed

    private void sevenTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenTActionPerformed
        if(yazi.equals("0"))   yazi="7";        
        else   yazi=yazi+"7";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_sevenTActionPerformed

    private void eightTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightTActionPerformed
        if(yazi.equals("0"))   yazi="8";        
        else   yazi=yazi+"8";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_eightTActionPerformed

    private void nineTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineTActionPerformed
        if(yazi.equals("0"))   yazi="9";        
        else   yazi=yazi+"9";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_nineTActionPerformed

    private void zeroTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroTActionPerformed
        if(yazi.equals("0"))   yazi="0";        
        else   yazi=yazi+"0";
        yazi_alani.setText(yazi);
    }//GEN-LAST:event_zeroTActionPerformed

    private void toplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplaActionPerformed
        birinci_Sayi=Integer.valueOf(yazi);
        islem="+";
        yazi="0";
        yazi_alani.setText("+");
    }//GEN-LAST:event_toplaActionPerformed

    private void cikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikarActionPerformed
        birinci_Sayi=Integer.valueOf(yazi);
        islem="-";
        yazi="0";
        yazi_alani.setText("-");
    }//GEN-LAST:event_cikarActionPerformed

    private void carpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpiActionPerformed
        birinci_Sayi=Integer.valueOf(yazi);
        islem="x";
        yazi="0";
        yazi_alani.setText("x");
    }//GEN-LAST:event_carpiActionPerformed

    private void boluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boluActionPerformed
        birinci_Sayi=Integer.valueOf(yazi);
        islem="/";
        yazi="0";
        yazi_alani.setText("/");
    }//GEN-LAST:event_boluActionPerformed

    private void esittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esittirActionPerformed
        if(islem.equals("0")){
            yazi_alani.setText(yazi);
        }
        else{
            ikinci_Sayi=Integer.valueOf(yazi);
            switch (islem) {
                case "+":
                    yazi=String.valueOf(birinci_Sayi + ikinci_Sayi);
                    yazi_alani.setText(yazi);
                    break;
                case "-":
                    yazi=String.valueOf(birinci_Sayi - ikinci_Sayi);
                    yazi_alani.setText(yazi);
                    break;
                case "x":
                    yazi=String.valueOf(birinci_Sayi * ikinci_Sayi);
                    yazi_alani.setText(yazi);
                    break;
                case "/":
                    if(ikinci_Sayi==0){
                        yazi_alani.setText("ERROR");
                        break;
                    }
                    yazi=String.valueOf(birinci_Sayi / ikinci_Sayi);
                    yazi_alani.setText(yazi);
                    break;
                default:
                    break;
            }
        }
        islem="0";
        birinci_Sayi=0;
        ikinci_Sayi=0;
        yazi="0";
        
        
    }//GEN-LAST:event_esittirActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arti_eksi;
    private javax.swing.JButton bolu;
    private javax.swing.JButton carpi;
    private javax.swing.JButton cikar;
    private javax.swing.JButton eightT;
    private javax.swing.JButton esittir;
    private javax.swing.JButton fiveT;
    private javax.swing.JButton fourT;
    private javax.swing.JButton kopmle_sil;
    private javax.swing.JButton nineT;
    private javax.swing.JButton oneT;
    private javax.swing.JButton sevenT;
    private javax.swing.JButton sil;
    private javax.swing.JButton sixT;
    private javax.swing.JButton threeT;
    private javax.swing.JButton topla;
    private javax.swing.JButton twoT;
    private javax.swing.JButton virgul;
    private javax.swing.JLabel yazi_alani;
    private javax.swing.JButton zeroT;
    // End of variables declaration//GEN-END:variables
}
