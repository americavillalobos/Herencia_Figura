/*****************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues   *
 *         Leticia Hernandez Reyes                   *
 *         Reyder Javier Tineo Tineo                 * 
 *         Jonathan Alexis Zavaleta cruz             *
 *Fecha de creacion:12/04/2023                       *
 *Fecha de actualizacion:14/04/2/2023                *
 *Descripcion:se calcula el volumen del cilindro     *
 *****************************************************/
package Figura;

public class Cilindro extends Figura3D {
	private double radio;
	private double altura;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	double calcularVolumen() {
		return Math.PI * Math.pow(radio, 2) * altura;
	}
	
	
	
	

}
