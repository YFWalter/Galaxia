package juego;

import java.awt.event.KeyEvent;
import java.util.Random;

import Entrada.KeyBoard;
import gui.GUI;

public class Juego {
	private Malo malos[];
	private Jugador jugador;
	
	public Juego(GUI gui){
		
		malos = new Malo[4];
		
		jugador = new Jugador(20,200,230 );
		gui.add(jugador.getGrafico(0));
		
		int x_temp = 200;
		int y_temp = 30;
		
		for(int i = 0; i < malos.length; i++){			
				malos[i] = new Malo(10, x_temp,y_temp);			 
				gui.add(malos[i].getGrafico(i));
				y_temp +=30;
			
		}
	}
	
	public void mover(){
			for(int i = 0 ; i < malos.length ; i++) {
				if( i % 2 == 0 )				
					malos[i].mover(3);
				else
					malos[i].mover(2);
			}
	}
	
	public void mover(int dir){		
		int direccion = 0;
		
		switch (dir){
		/*
			case KeyEvent.VK_UP : //Arriba
				direccion = 0;
				break;
			case KeyEvent.VK_DOWN : //Abajo
				direccion = 1;
				break;
		*/		
			case KeyEvent.VK_LEFT : //Izquierda
				direccion = 2;
				break;
			case KeyEvent.VK_RIGHT : //Derecha
				direccion = 3;
				break;
		}
		
		jugador.mover(direccion);
	}

}