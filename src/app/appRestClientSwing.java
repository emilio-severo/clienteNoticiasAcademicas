/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import br.edu.ifsul.bage.clientrest.RequestContentType;
import br.edu.ifsul.bage.clientrest.RestClient;
import br.edu.ifsul.bage.clientrest.RestClientInterface;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Noticia;

/**
 *
 * @author emilio
 */
public class appRestClientSwing extends javax.swing.JFrame {

    RestClientInterface<Noticia> cliente;
    List<Noticia> noticias;
    Noticia noticia;
    URL url;

    public appRestClientSwing() {
        initComponents();
        noticia = new Noticia();
        try {
            url = new URL("http://localhost:8080/noticiasAcademicas/servicos/noticias/");
        } catch (MalformedURLException ex) {
            Logger.getLogger(appRestClientSwing.class.getName()).log(Level.SEVERE, null, ex);
        }
        carregarNoticias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTabela = new javax.swing.JScrollPane();
        tbNoticias = new javax.swing.JTable();
        lbData = new javax.swing.JLabel();
        edData = new javax.swing.JFormattedTextField();
        btFiltrar = new javax.swing.JButton();
        lbNoticia = new javax.swing.JLabel();
        edNoticia = new javax.swing.JTextField();
        brFechar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btTodos = new javax.swing.JButton();
        btURL = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente de Notícias (REST WebService)");

        tbNoticias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Hora", "Notícia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbNoticias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNoticiasMouseClicked(evt);
            }
        });
        spTabela.setViewportView(tbNoticias);

        lbData.setText("Data:");

        btFiltrar.setText("Filtrar");
        btFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltrarActionPerformed(evt);
            }
        });

        lbNoticia.setText("Notícia");

        brFechar.setText("Fechar");
        brFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brFecharActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btTodos.setText("Todos");
        btTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTodosActionPerformed(evt);
            }
        });

        btURL.setText("Configurar URL");
        btURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btURLActionPerformed(evt);
            }
        });

        jButton1.setText("Nova");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edData, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btTodos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edNoticia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNoticia)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(spTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btURL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brFechar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbNoticia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNoticia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brFechar)
                            .addComponent(btExcluir)
                            .addComponent(btSalvar)
                            .addComponent(jButton1))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btURL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(spTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btFiltrar)
                        .addComponent(btTodos))
                    .addComponent(lbData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edData, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {edData, lbData});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_brFecharActionPerformed

    private void btTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTodosActionPerformed
        carregarNoticias();
        edData.setText("");
    }//GEN-LAST:event_btTodosActionPerformed

    private void tbNoticiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNoticiasMouseClicked
        int linha = tbNoticias.getSelectedRow();
        noticia = new Noticia();
        noticia.setId(Integer.valueOf(tbNoticias.getValueAt(linha, 0).toString()));
        try {
            noticia.setData(new SimpleDateFormat("dd/MM/yyyy").parse(tbNoticias.getValueAt(linha, 1).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(appRestClientSwing.class.getName()).log(Level.SEVERE, null, ex);
        }
        noticia.setHora(tbNoticias.getValueAt(linha, 2).toString());
        noticia.setNoticia(tbNoticias.getValueAt(linha, 3).toString());
        edNoticia.setText(noticia.getNoticia());
    }//GEN-LAST:event_tbNoticiasMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        //RestClientInterface<Noticia> cliente = new RestClient<>(url + "deleteNoticia/" + noticia.getId(), RequestContentType.JSON);
        cliente = RestClient.open(url + "deleteNoticia/" + noticia.getId(), RequestContentType.JSON);        
        cliente.delete();
        cliente.close();
        carregarNoticias();
        novaNoticia();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (noticia.getId() == 0) {
            noticia = new Noticia(edNoticia.getText());
            //cliente = new RestClient<>(url + "postNoticia", RequestContentType.JSON);
            cliente = RestClient.open(url + "postNoticia", RequestContentType.JSON);
            cliente.post(noticia);            
        } else {
            noticia.setNoticia(edNoticia.getText());
            //cliente = new RestClient<>(url + "putNoticia", RequestContentType.JSON);
            cliente = RestClient.open(url + "putNoticia", RequestContentType.JSON);
            cliente.put(noticia);
        }
        cliente.close();
        carregarNoticias();
        novaNoticia();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrarActionPerformed
        if (!edData.getText().equals("")) {
            try {
                //cliente = new RestClient<>(url + "pordata/" + URLEncoder.encode(edData.getText(), "UTF-8"), RequestContentType.JSON, Noticia[].class);
                cliente = RestClient.open(url + "pordata/" + URLEncoder.encode(edData.getText(), "UTF-8"), RequestContentType.JSON);                
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(appRestClientSwing.class.getName()).log(Level.SEVERE, null, ex);
            }
            cliente.setType(Noticia[].class);
            noticias = cliente.get();
            cliente.close();
        }
        montaTabela();
    }//GEN-LAST:event_btFiltrarActionPerformed

    private void btURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btURLActionPerformed
        String nova_url = JOptionPane.showInputDialog(this, "Informe a URL do serviço: ", url);
        try {
            url = new URL(nova_url != null?nova_url:url.toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(appRestClientSwing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btURLActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        novaNoticia();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void novaNoticia() {
        noticia = new Noticia();
        edNoticia.setText("");
        edNoticia.requestFocus();
    }

    private void carregarNoticias() {
        //cliente = new RestClient(url + "todas", RequestContentType.JSON, Noticia[].class);
        cliente = RestClient.open(url + "todas", RequestContentType.JSON);
        cliente.setType(Noticia[].class);
        noticias = cliente.get();
        cliente.close();
        montaTabela();
    }

    private void montaTabela() {
        DefaultTableModel dtm = (DefaultTableModel) tbNoticias.getModel();
        dtm.setNumRows(0);
        for (Noticia noticia : noticias) {
            dtm.addRow(new Object[]{noticia.getId(), new SimpleDateFormat("dd/MM/yyyy").format(noticia.getData()), noticia.getHora(), noticia.getNoticia()});
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(appRestClientSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appRestClientSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appRestClientSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appRestClientSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appRestClientSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brFechar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFiltrar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btTodos;
    private javax.swing.JButton btURL;
    private javax.swing.JFormattedTextField edData;
    private javax.swing.JTextField edNoticia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNoticia;
    private javax.swing.JScrollPane spTabela;
    private javax.swing.JTable tbNoticias;
    // End of variables declaration//GEN-END:variables

}
