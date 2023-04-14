/*****************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues   *
 *         Leticia Hernandez Reyes                   *
 *         Reyder Javier Tineo Tineo                 * 
 *         Jonathan Alexis Zavaleta cruz             *
 *Fecha de creacion:12/04/2023                       *
 *Fecha de actualizacion:14/04/2/2023                *
 *Descripcion:se calcula el volumen del ccubo        *
 *****************************************************/
package Figura;

public class Cubo extends Figura3D{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	double calcularVolumen() {
		return  Math.pow(lado, 3);
	}

	
	
	
	

}
