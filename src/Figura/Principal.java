/*****************************************************
 * Autores:America Yaridsaida Villalobos Rodrigues   *
 *         Leticia Hernandez Reyes                   *
 *         Reyder Javier Tineo Tineo                 * 
 *         Jonathan Alexis Zavaleta cruz             *
 *Fecha de creacion:12/04/2023                       *
 *Fecha de actualizacion:14/04/2/2023                *
 *Descripcion:Principal tiene el menu                *
 *****************************************************/
package Figura;

import java.util.Scanner;

public class Principal {
	
	
	
	static Cubo cubo = new Cubo();
	static Cilindro cilindro = new Cilindro();
	static Esfera esfera = new Esfera();

	static Circulo circulo = new Circulo();
	static Rombo rombo = new Rombo();

	static Cuadrado cuadrado = new Cuadrado();
	static Hexagono hexagono = new Hexagono();
	static Pentagono pentagono = new Pentagono();
	static Romboide romboide = new Romboide();

	public static void main(String[] args) {
		boolean salir = false;
		//Creamos la clase scaner
	    Scanner sc = new Scanner(System.in);

	    
		
	while(!salir) {
		
		

	    //Pedimos un numero de 1-12
	    System.out.println("ingrese su opcion a elegir:");
	    System.out.println("Figuras 2d:");
	    System.out.println("1.-Cuadrado");
	    System.out.println("2.-Rombo");
	    System.out.println("3.-Romboide");
	    System.out.println("4.-Pentagono");
	    System.out.println("5.-Hexagono");
	    System.out.println("6.-Circulo");
	    System.out.println("Figuras 3d");
	    System.out.println("7.-Cubo");
	    System.out.println("8.-Esfera");
	    System.out.println("9.-Cilindro");
	    System.out.println("10.-Salir");
	    
	    int opcion = sc.nextInt();//guardamos el valor de la opcion elegida
	    


	        switch (opcion) { 
	            case 1:
	            	System.out.println("Ingrese el lado del cuadrado:");
	                double lado = sc.nextDouble();
	                cuadrado.setLado(lado);
	        		System.out.println("El Area del cuadrado es " + cuadrado.calcularArea());
	        		System.out.println("El Perimetro del cuadrado es " + cuadrado.calcularPerimetro());
	        		System.out.println();
	                break;
	            case 2:
	            	System.out.println("Ingrese el d1 del rombo:");
	                double d1 = sc.nextDouble();
	                rombo.setD1(d1);
	            	System.out.println("Ingrese el d2 del rombo:");
	                double d2 = sc.nextDouble();
	                rombo.setD2(d2);
	        		System.out.println("El Area del rombo es " + rombo.calcularArea());
	        		System.out.println("El Perimetro del rombo es " + rombo.calcularPerimetro());
	        		System.out.println();
	                break;
	            case 3:
	            	System.out.println("Ingrese el lado del romboide:");
	                double lado2 = sc.nextDouble();
	                romboide.setLado(lado2);
	            	System.out.println("Ingrese la base del romboide:");
	                double base = sc.nextDouble();
	                romboide.setBase(base);
	            	System.out.println("Ingrese la altura del romboide: ");
	                double altura = sc.nextDouble();
	                romboide.setAltura(altura);
	        		System.out.println("El Area del romboide es " + romboide.calcularArea());
	        		System.out.println("El Perimetro del romboide es " + romboide.calcularPerimetro());

	                break;
	            case 4:
	            	System.out.println("Ingrese el lado del pentagono:");
	                double lado3 = sc.nextDouble();
	                pentagono.setLado(lado3);
	        		System.out.println("El Area del pentagono es " + pentagono.calcularArea());
	        		System.out.println("El Perimetro del pentagon es " + pentagono.calcularPerimetro());
	        		System.out.println();
	   	         
	                break;
	            case 5:
	            	System.out.println("Ingrese el lado del hexagono:");
	                double lado4 = sc.nextDouble();
	                hexagono.setLado(lado4);
	        		System.out.println("El Area del hexagono es " + hexagono.calcularArea());
	        		System.out.println("El Perimetro del hexagono es " + hexagono.calcularPerimetro());
	        		System.out.println();
	   	         
	                break;
	            case 6:
	            	System.out.println("Ingrese el radio del circulo:");
	                double radio = sc.nextDouble();
	                circulo.setRadio(radio);
	        		System.out.println("El Area del circulo es " + circulo.calcularArea());
	        		System.out.println("El Perimetro del circulo es " + circulo.calcularPerimetro());
	        		System.out.println();
	                break;
	            case 7:	
	            	System.out.println("Ingrese el lado del cubo:");
	                double lado5 = sc.nextDouble();
	                cubo.setLado(lado5);
	        		System.out.println("El Volumen del cubo es " + cubo.calcularVolumen());
	        		System.out.println();
	   	         
	                break;
	            case 8:
	            	System.out.println("Ingrese el lado de la esfera:");
	                double radio2 = sc.nextDouble();
	                esfera.setRadio(radio2);
	        		System.out.println("El Volumen del esfera es " + esfera.calcularVolumen());
	        		System.out.println();
	   	         
	                break;
	            case 9:
	            	System.out.println("Ingrese el lado del cilindro:");
	                double radio3 = sc.nextDouble();
	                cuadrado.setLado(radio3);
	            	System.out.println("Ingrese el lado del cilindro:");
	                double altura2 = sc.nextDouble();
	                cuadrado.setLado(altura2);
	        		System.out.println("El Volumen del cilindro es " + cilindro.calcularVolumen());
	        		System.out.println();
	   	         
	                break;
	            case 10:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción ingresada no es válida.");
                    break;
            }
        }

		sc.close();
       System.out.println();
    }
}





