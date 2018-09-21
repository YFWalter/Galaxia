package gui;

import juego.Juego;

public class ContadorTiempo extends Thread {

	private Juego elJuego;

	ContadorTiempo(Juego j) {
		this.elJuego = j;
	}

	public void run() {
		boolean corriendo=true;

		while(corriendo){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.mover();
		}
	}
}