package gestionealbergo;

import java.util.Vector;

abstract public class Camera{
	private String numero;
	private Vector<Prenotazione> prenotazioni;

	public Camera(String numero){
		this.numero = numero;
		prenotazioni=new Vector<Prenotazione>(1,1);
	}

	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public void addPrenotazione (Prenotazione prenotazione){
		this.prenotazioni.addElement(prenotazione);
	}

	@Override
	public String toString(){
		return "Camera [numero=" + numero + ", prenotazioni=" + prenotazioni + "]";
	}
}