/***************************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues             *
 *         Leticia Hernandez Reyes                             *
 *         Reyder Javier Tineo Tineo                           * 
 *         Jonathan Alexis Zavaleta cruz                       *
 *Fecha de creacion:12/04/2023                                 * 
 *Fecha de actualizacion:14/04/2/2023                          *
 *Descripcion:se calcula el area y perimetro  del romboide     *
 ***************************************************************/
package Figura;

public class Romboide extends Poligonos {
	private double altura;
	private double base;
	private double lado;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	double calcularArea() {
		return base * altura;
	}
	@Override
	double calcularPerimetro() {
	return  2 * (base + lado);	
	}

	

}
