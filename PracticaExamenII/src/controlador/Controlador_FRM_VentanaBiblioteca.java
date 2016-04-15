/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_VentanaBiblioteca;
import vista.FRM_VentanaLibro;

/**
 *
 * @author Usuario
 */
public class Controlador_FRM_VentanaBiblioteca implements ActionListener{
    
    FRM_VentanaBiblioteca frm_VentanaBiblioteca;
    FRM_VentanaLibro frm_VentanaLibro;

    public Controlador_FRM_VentanaBiblioteca() {
        frm_VentanaLibro = new FRM_VentanaLibro();
    }
    
    
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Salir"))
        {
            System.exit(0);
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Registrar libro"))
        {
            frm_VentanaLibro.setVisible(true);
        }
    }
}
