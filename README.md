# Calculadora de IMC
 
Aplicación de escritorio en **Java (Swing)** que calcula el **Índice de Masa Corporal (IMC)** a partir del peso y la altura del usuario y muestra su **clasificación** (por ejemplo, *Obesidad*). Está desarrollada con la arquitectura **MVC (Modelo-Vista-Controlador)** y creada con **NetBeans**.
 
## Funcionalidades
 
- Cálculo del IMC a partir de peso (kg) y altura (m).
- Clasificación automática según el resultado.
- Color del texto de la clasificación según el nivel.
- Admite decimales con coma o con punto (`1,75` o `1.75`).
- Validación de datos: si se introduce un valor no numérico, se muestra un aviso de error.
## Clasificación del IMC
 
| IMC | Clasificación | Color |
|---|---|---|
| Menor de 18,5 | Bajo Peso | Verde |
| De 18,5 a 24,9 | Peso Normal | Naranja |
| De 25 a 29,9 | Sobrepeso | Naranja |
| 30 o más | Obesidad | Rojo |
 
El IMC se calcula con la fórmula:
 
```
IMC = peso / (altura × altura)
```
 
## Estructura del proyecto
 
```
src/
└── com/tuproyecto/imc/
    ├── model/
    │   ├── Usuario.java
    │   └── ModelCalculadora.java
    ├── view/
    │   └── VistaCalculadora.java
    ├── controller/
    │   └── ControlCalculadora.java
    └── main/
        └── CalculadoraIMC.java
