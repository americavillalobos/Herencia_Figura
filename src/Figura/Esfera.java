/*****************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues   *
 *         Leticia Hernandez Reyes                   *
 *         Reyder Javier Tineo Tineo                 * 
 *         Jonathan Alexis Zavaleta cruz             *
 *Fecha de creacion:12/04/2023                       *
 *Fecha de actualizacion:14/04/2/2023                *
 *Descripcion:se calcula el volumen del esfera       *
 *****************************************************/
package Figura;

public class Esfera extends Figura3D {
  private double radio;

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}

@Override
double calcularVolumen() {
	return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
}

  
  
	
}
