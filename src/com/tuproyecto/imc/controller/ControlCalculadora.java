/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tuproyecto.imc.controller;

import com.tuproyecto.imc.model.ModelCalculadora;
import com.tuproyecto.imc.model.Usuario;
import com.tuproyecto.imc.view.VistaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            vista.getjButtonCalcular().setText(String.format("%.2f",imc));
                    
        }
        
        public void iniciarEvento(){
            vista.getjButtonCalcular().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    altura = Float.parseFloat(vista.getjTextFieldALtura().getText());
                    peso = Float.parseFloat(vista.getjTextFieldPeso().getText());
                    sacarResultado(new Usuario(peso,altura));
                }
            });
        }
        
        
        
}      
        
      

