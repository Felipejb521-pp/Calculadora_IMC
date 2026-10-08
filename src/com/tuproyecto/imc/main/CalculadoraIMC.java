/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tuproyecto.imc.main;

import com.tuproyecto.imc.controller.ControlCalculadora;
import com.tuproyecto.imc.model.ModelCalculadora;
import com.tuproyecto.imc.view.VistaCalculadora;
import javax.swing.JFrame;

/**
 *
 * @author Felipe Jimenez
 */
public class CalculadoraIMC {

    
    public static void main(String[] args) {
        ModelCalculadora modelo;
        VistaCalculadora vista;
        ControlCalculadora control;
        JFrame ventana;
        
        modelo = new ModelCalculadora();
        vista = new VistaCalculadora();
        control = new ControlCalculadora(modelo,vista);
        
        //sin Jframe solo con panel no enseña
        ventana = new JFrame("Calculadora IMC");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(vista);
        
        //ventanita centrada
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
    }
    
}
