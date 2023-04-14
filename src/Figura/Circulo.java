package Figura;

public class Circulo extends Figura2D {
 private double radio;

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}
 
@Override
double calcularArea() {
	return  Math.PI * Math.pow(radio, 2);
}

@Override
double calcularPerimetro() {
	return 2 * Math.PI * radio;
}


}
