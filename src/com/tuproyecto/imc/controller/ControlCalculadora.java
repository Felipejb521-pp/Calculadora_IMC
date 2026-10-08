/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tuproyecto.imc.controller;

import com.tuproyecto.imc.model.ModelCalculadora;
import com.tuproyecto.imc.model.Usuario;
import com.tuproyecto.imc.view.VistaCalculadora;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Jimenez
 */
public class ControlCalculadora {

    
    
        private final ModelCalculadora modelo;
        private final VistaCalculadora vista;
        private float altura;
        private float peso;
        
        
        public ControlCalculadora(ModelCalculadora modelo , VistaCalculadora vista){
            this.modelo=modelo;
            this.vista=vista;
            
        }
        
        public void sacarResultado(Usuario user ){
            double imc;
            Color color;
            
            imc = modelo.calcular(user.getPeso(),user.getAltura());
            //Metodos definidos en vista
            vista.setjTextFieldResultIMC(String.format("%.2f", imc));//.2 redondea 2 decimales f num decimal
            vista.setjtextFieldClasificacion(modelo.clasificar(imc));
             
            //Color de las letras según clasificación
            if(this.modelo.clasificar(imc).equals("Bajo Peso")){
                this.vista.getjTextFieldClasificacion().setForeground(Color.GREEN);
            }else{
                if(this.modelo.clasificar(imc).equals("Peso Normal")){
                    this.vista.getjTextFieldClasificacion().setForeground(Color.ORANGE);
                }else{
                    if(this.modelo.clasificar(imc).equals("Sobrepeso")){
                        this.vista.getjTextFieldClasificacion().setForeground(Color.ORANGE);
                    }else{
                        if(this.modelo.clasificar(imc).equals("Obesidad")){
                            this.vista.getjTextFieldClasificacion().setForeground(Color.RED);
                        }
                    }
                }
            
            }
            
        }
        
        public void iniciarEvento(){
    vista.getjButtonCalcular().addActionListener(new ActionListener() {
        @Override
        //Evento cuando pulso el boton de calcular
        public void actionPerformed(ActionEvent e) {
            boolean datosValidos = true;

            try{
                //Para transformar ',' en '.' y que así los acepte
                altura = Float.parseFloat(vista.getjTextFieldALtura().getText().trim().replace(',', '.'));
            }catch(NumberFormatException ne){
                datosValidos = false;
                JOptionPane.showMessageDialog(vista,"Introduzca una altura "
                        + "válida (números decimales)","Datos incorrectos",
                        JOptionPane.ERROR_MESSAGE);
            }
            try{
                peso = Float.parseFloat(vista.getjTextFieldPeso().getText().trim().replace(',', '.'));
            }catch(NumberFormatException ne){
                datosValidos = false;
                JOptionPane.showMessageDialog(vista,"Introduzca un peso "
                        + "válido (números decimales)","Datos incorrectos",
                        JOptionPane.ERROR_MESSAGE);
            }

            if(datosValidos){
                sacarResultado(new Usuario(peso,altura));
            }
        }
    });
}
        
        
        
}      
        
      

