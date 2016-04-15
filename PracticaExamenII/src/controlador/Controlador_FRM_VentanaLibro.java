/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MetodosLibro;
import vista.FRM_VentanaLibro;

/**
 *
 * @author Usuario
 */
public class Controlador_FRM_VentanaLibro implements ActionListener{
    
    FRM_VentanaLibro frm_VentanaLibro;
    MetodosLibro metodosLibro;
    public Controlador_FRM_VentanaLibro( FRM_VentanaLibro frm_VentanaLibro)
    {
        this.frm_VentanaLibro=frm_VentanaLibro;
        metodosLibro = new MetodosLibro();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Consultar"))
        {
            buscar();
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            metodosLibro.agregarLibro(frm_VentanaLibro.devolverInformacion());
            System.out.println("Agregado con exito!");
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            metodosLibro.modificarLibro(frm_VentanaLibro.devolverInformacion());
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            metodosLibro.eliminarLibro(frm_VentanaLibro.devolverCodigo());
        }
    }
    
    public void buscar()
    {
        if(metodosLibro.consultarLibro(frm_VentanaLibro.devolverCodigo()))
        {
            frm_VentanaLibro.mostrarInformacion(metodosLibro.regresarArregloLibro());
        }
        else
        {
            JOptionPane.showMessageDialog(frm_VentanaLibro, "no encontrado");

        }
    
    }
}
