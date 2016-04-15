/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_VentanaLibro;

/**
 *
 * @author Usuario
 */
public class FRM_VentanaLibro extends javax.swing.JFrame {

   Controlador_FRM_VentanaLibro controlador;
   
    public FRM_VentanaLibro() {
        initComponents();
        controlador = new Controlador_FRM_VentanaLibro(this);
        this.panelBotones1.agregarEventos(controlador);
        this.panelInformacionLibro1.agregarEventos(controlador);
    }
    
    public String devolverCodigo()
    {
       return this.panelInformacionLibro1.devolverCodigo();
    }
    
    public String [] devolverInformacion()
    {
        return this.panelInformacionLibro1.devolverInformacion();
    }
    
    public void mostrarInformacion(String arreglo[])
    {
        this.panelInformacionLibro1.mostrarInformacion(arreglo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInformacionLibro1 = new vista.PanelInformacionLibro();
        panelBotones1 = new vista.PanelBotones();
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("¡¡¡BIENVENIDO!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panelInformacionLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInformacionLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private vista.PanelBotones panelBotones1;
    private vista.PanelInformacionLibro panelInformacionLibro1;
    // End of variables declaration//GEN-END:variables
}
