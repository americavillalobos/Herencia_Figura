/***************************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues             *
 *         Leticia Hernandez Reyes                             *
 *         Reyder Javier Tineo Tineo                           * 
 *         Jonathan Alexis Zavaleta cruz                       *
 *Fecha de creacion:12/04/2023                                 * 
 *Fecha de actualizacion:14/04/2/2023                          *
 *Descripcion:se calcula el area y perimetro  del hexagono     *
 ***************************************************************/
package Figura;

public class Hexagono extends Poligonos {

	private double lado;
	private double perimetro = 6 * lado;
	private double apotema = lado * Math.sqrt(3) / 2;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
		this.perimetro = 6 * lado;
		this.apotema = lado * Math.sqrt(3) / 2;
	}

	@Override
	double calcularArea() {
		return perimetro * apotema / 2;
	}

	@Override
	double calcularPerimetro() {
		return perimetro;
	}

	@Override
	double calcularApotema() {
		return apotema;
	}
}
