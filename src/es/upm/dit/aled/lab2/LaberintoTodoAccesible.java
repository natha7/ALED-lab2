package es.upm.dit.aled.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase para mejorar la generacion de laberintos que se resuelven en Laberinto
 * 
 * @author Miguel A. de Miguel
 *
 * es.upm.dit.aled.lab2.Laberinto
 */
public class LaberintoTodoAccesible extends Laberinto {
    
    /**
     * Constructor para crear un nuevo laberinto. Este constructor inicializa el laberinto y lo genera
     * 
     * @param n numero de filas y columnas del laberinto cuadrado
     */
	public LaberintoTodoAccesible(int n) {
		super(n);
	}

    public boolean compruebaAccesibilidad() {
        // TODO
        return false;
    }
	
    protected void aisla(int x, int y) {
    	// TODO
    }
    
    /**
     * Prueba de ejecucion controlando la acesibilidad de todo el laberinto
     * 
     * @param numFilasColumnas tamano del laberinto
     * @return falso si todo el labrinto no es accesible
     */
    public static boolean ejecutaConControlAccesibilidad(int numFilasColumnas) {
        LaberintoTodoAccesible laberinto = new LaberintoTodoAccesible(numFilasColumnas);
        StdDraw.show(0);
        laberinto.dibuja();
        if (!laberinto.compruebaAccesibilidad())
        		return false;
        laberinto.resolver();
        return true;
    }
    /**
     * Prueba de ejecucion controlando la acesibilidad de todo el laberinto, y aislando 
     * el punto central
     * 
     * @param numFilasColumnas tamano del labrinto
     * @return falso si todo el labrinto no es accesible
     */
    public static boolean ejecutaConControlAccesibilidadYAislado(int numFilasColumnas) {
        LaberintoTodoAccesible laberinto = new LaberintoTodoAccesible(numFilasColumnas);
        laberinto.aisla(numFilasColumnas/2,numFilasColumnas/2);
        StdDraw.show(0);
        laberinto.dibuja();
        if (!laberinto.compruebaAccesibilidad())
        		return false;
        laberinto.resolver();
        return true;
    }

    /**
     * Punto de entrada al programa
     * 
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        if (LaberintoTodoAccesible.ejecutaConControlAccesibilidad(N))
        	System.out.println("Todas las posiciones son accesibles");
        else System.out.println("Hay posiciones no accesibles");
        /*
        if (LaberintoTodoAccesible.ejecutaConControlAccesibilidadYAislado(N))
        	System.out.println("Todas las posiciones son accesibles");
        else System.out.println("Hay posiciones no accesibles");
        */
    }
}
