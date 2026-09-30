/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tuproyecto.imc.controller;

import com.tuproyecto.imc.model.ModelCalculadora;
import com.tuproyecto.imc.view.VistaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DAM2
 */
public class ControlCalculadora {

    
    public static void main(String[] args) {
        private final ModelCalculadora modelo;
        private final VistaCalculadora vista;
        
        public ControlCalculadora(ModelCalculadora modelo , VistaCalculadora vista){
            this.modelo=modelo;
            this.vista=vista;
            iniciarEvento();
        }
        
        public void iniciarEvento(){
            vista.getjButtonCalcular().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            });
        }
        
    }
    
}
