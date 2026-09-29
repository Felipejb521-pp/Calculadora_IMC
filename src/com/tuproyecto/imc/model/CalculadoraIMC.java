/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuproyecto.imc.model;

/**
 *
 * @author felipe jimenez
 */
public class CalculadoraIMC {
     public double calcular(double peso, double altura){
         double imc;
         
         imc = peso / (altura * altura);
         return imc;
     }
     
     public String clasificar(double imc){
         String cadena;
         
         cadena="";
         if(imc<18.5){
             cadena = "Bajo Peso";
         }else{
             if(imc>=18.5 && imc<= 24.9){
                 cadena = "Peso NOrmal";
             }else{
                if(imc>=25 && imc <= 29.9){
                    cadena = "Sobrepeso";
                }else{
                    if(imc>=30){
                        cadena = "Obesidad";
                    }
                }
            }
         }
         return cadena;
     }
}
