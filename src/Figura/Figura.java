/*****************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues   *
 *         Leticia Hernandez Reyes                   *
 *         Reyder Javier Tineo Tineo                 * 
 *         Jonathan Alexis Zavaleta cruz             *
 *Fecha de creacion:12/04/2023                       *
 *Fecha de actualizacion:14/04/2/2023                *
 *Descripcion:clase padre                            *
 *****************************************************/
package Figura;

public class Figura {
	private String nombre;
	private String color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	 double calcularArea() {
		return 0;
	}
	  double calcularPerimetro() {
		return 0;
	}
	  double calcularVolumen() {
			return 0;
	}
}

