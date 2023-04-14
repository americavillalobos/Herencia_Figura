/***************************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues             *
 *         Leticia Hernandez Reyes                             *
 *         Reyder Javier Tineo Tineo                           * 
 *         Jonathan Alexis Zavaleta cruz                       *
 *Fecha de creacion:12/04/2023                                 * 
 *Fecha de actualizacion:14/04/2/2023                          *
 *Descripcion:se calcula el area y perimetro  del rombo        *
 ***************************************************************/
package Figura;

public class Rombo extends Figura2D {
 private double d1;
 private double d2;
public double getD1() {
	return d1;
}
public void setD1(double d1) {
	this.d1 = d1;
}
public double getD2() {
	return d2;
}
public void setD2(double d2) {
	this.d2 = d2;
}
 
@Override
double calcularArea() {
	return (d1 * d2) / 2;
}

@Override
double calcularPerimetro() {
	return 4 * Math.sqrt((d1 * d1 + d2 * d2) / 4);
}
}
