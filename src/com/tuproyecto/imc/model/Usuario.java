/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuproyecto.imc.model;

/**
 *
 * @author Felipe Jimenez
 */
public class Usuario {
    private float peso;
    private float altura;
    
    public Usuario(float peso, float altura){
        this.peso=peso;
        this.altura=altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
