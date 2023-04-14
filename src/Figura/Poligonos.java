/***************************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues             *
 *         Leticia Hernandez Reyes                             *
 *         Reyder Javier Tineo Tineo                           * 
 *         Jonathan Alexis Zavaleta cruz                       *
 *Fecha de creacion:12/04/2023                                 * 
 *Fecha de actualizacion:14/04/2/2023                          *
 *Descripcion:clase hija de Figura 2D                          *
 ***************************************************************/
package Figura;

public class Poligonos extends Figura2D {
 private String segmentos;
 private String lineas;
public String getSegmentos() {
	return segmentos;
}
public void setSegmentos(String segmentos) {
	this.segmentos = segmentos;
}
public String getLineas() {
	return lineas;
}
public void setLineas(String lineas) {
	this.lineas = lineas;
} 
 
@Override
double calcularArea() {
	return 0;
}

@Override
double calcularPerimetro() {
	return 0;
}

double calcularApotema() {
	return 0;
}


}
