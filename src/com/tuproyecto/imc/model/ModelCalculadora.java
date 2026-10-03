/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuproyecto.imc.model;

/**
 *
 * @author felipe jimenez
 */
public class ModelCalculadora {
     public double calcular(float  peso, float altura){
         float imc;
         
         imc = peso / (altura * altura);
         return imc;
     }
     
     public String clasificar(double imc){
         String cadena;
         
         cadena="";
         if(imc<18.5){
             cadena = "Bajo Peso";
         }else{
             if( imc< 25){
                 cadena = "Peso Normal";
             }else{
                if( imc < 30){
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
