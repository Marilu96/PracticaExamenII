/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class MetodosLibro {

   ArrayList <ObjetoLibro> listaLibro;
   String arreglo[]= new String [3];

    public MetodosLibro() 
    {
        listaLibro = new ArrayList <ObjetoLibro>();
    }
    
     
    
    public void agregarLibro(String arreglo[])
    {
        listaLibro.add(new ObjetoLibro(arreglo[0], arreglo[1], Integer.parseInt(arreglo[2])));
    }
    
    public boolean consultarLibro(String codigo)
    {   
        boolean existencia = false;
        for (int i = 0; i < listaLibro.size(); i++) 
        {
            if(listaLibro.get(i).getCodigo().equalsIgnoreCase(codigo))
              {
                    arreglo[0]=listaLibro.get(i).getCodigo();
                    arreglo[1]= listaLibro.get(i).getNombre();
                    arreglo[2]= ""+listaLibro.get(i).getAno();
                    
                    existencia = true;
                    
               }
              
        }
        return existencia;
    } 
    
    public String [] regresarArregloLibro()
    {
        return arreglo;
    }
    public void modificarLibro(String arreglo[])
    {
        for (int i = 0; i < listaLibro.size(); i++) {
        
            if(listaLibro.get(i).getCodigo().equalsIgnoreCase(arreglo[0]))
            {
                listaLibro.get(i).setNombre(arreglo[1]);
                listaLibro.get(i).setAno(Integer.parseInt(arreglo[2]));
           
            }
        }
    
    }
    
    public void eliminarLibro(String codigo)
    {
        for (int i = 0; i < listaLibro.size(); i++) {
            
                if(listaLibro.get(i).getCodigo().equalsIgnoreCase(codigo))
                {
                    listaLibro.remove(i);
                }
        }
    
    }
    
    
}
