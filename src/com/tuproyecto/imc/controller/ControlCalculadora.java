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
 * @author DAM2
 */
public class ControlCalculadora {

    
    
        private final ModelCalculadora modelo;
        private final VistaCalculadora vista;
        private float altura;
        private float peso;
        
        
        public ControlCalculadora(ModelCalculadora modelo , VistaCalculadora vista){
            this.modelo=modelo;
            this.vista=vista;
            iniciarEvento();
        }
        
        public void sacarResultado(Usuario user ){
            double imc;
            
            imc = modelo.calcular(user.getPeso(),user.getAltura());
            //metodos definidos en vista
            vista.setjTextFieldResultIMC(String.format("%.2f", imc));//.2 redondea 2 decimales f num decimal
            vista.setjtextFieldClasificacion(modelo.clasificar(imc));
            
            this.vista.getjTextFieldALtura().getText().replace(',', '.');
            this.vista.getjTextFieldPeso().getText().replace(',', '.');
            
            if(this.modelo.clasificar(imc)== "Bajo Peso"){
                this.vista.getjTextFieldClasificacion().setForeground(Color.GREEN);
            }else{
                if(this.modelo.clasificar(imc)== "Peso Normal"){
                    this.vista.getjTextFieldClasificacion().setForeground(Color.ORANGE);
                }else{
                    if(this.modelo.clasificar(imc)== "Sobrepeso"){
                        this.vista.getjTextFieldClasificacion().setForeground(Color.ORANGE);
                    }else{
                        if(this.modelo.clasificar(imc)== "Obesidad"){
                            this.vista.getjTextFieldClasificacion().setForeground(Color.RED);
                        }
                    }
                }
            
            }
        }
        
        
        
        public void iniciarEvento(){
            vista.getjButtonCalcular().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        
                        altura = Float.parseFloat(vista.getjTextFieldALtura().getText());
                    }catch(NumberFormatException ne){
                        JOptionPane.showMessageDialog(vista,"Introduzca altura "
                                + "valida(numeros decimales)","Datos incorrectos ",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    try{
                        peso = Float.parseFloat(vista.getjTextFieldPeso().getText());
                    }catch(NumberFormatException ne){
                         JOptionPane.showMessageDialog(vista,"Introduzca altura "
                                + "valida(numeros decimales)","Datos incorrectos ",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    
                    sacarResultado(new Usuario(peso,altura));
                }
            });
        }
        
        
        
}      
        
      

