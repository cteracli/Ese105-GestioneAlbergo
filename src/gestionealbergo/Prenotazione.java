package gestionealbergo;

import java.time.LocalDateTime;

public class Prenotazione {
	private String richieste;
	private int numeroNotti;
	private LocalDateTime arrivoIl;
	private LocalDateTime effettuatoIl;
	private LocalDateTime clienteArrivaIl;
	private Cliente cliente;
	private Camera camera;
	
	public Prenotazione(String richieste, int numeroNotti, LocalDateTime arrivoIl, LocalDateTime effettuatoIl,LocalDateTime clienteArrivaIl) {
		this.richieste = richieste;
		this.numeroNotti = numeroNotti;
		this.arrivoIl = arrivoIl;
		this.effettuatoIl = effettuatoIl;
		this.clienteArrivaIl = clienteArrivaIl;
	}
	
	
	public String getRichieste(){
		return richieste;
	}
	public int getNumeroNotti(){
		return numeroNotti;
	}
	public LocalDateTime getArrivoIl(){
		return arrivoIl;
	}
	public LocalDateTime getEffettuatoIl(){
		return effettuatoIl;
	}
	public LocalDateTime getClienteArrivaIl(){
		return clienteArrivaIl;
	}
	public Cliente getCliente(){
		return cliente;
	}
	public Camera getCamera(){
		return camera;
	}
	
	public void setRichieste(String richieste){
		this.richieste = richieste;
	}
	public void setNumeroNotti(int numeroNotti){
		this.numeroNotti = numeroNotti;
	}
	public void setArrivoIl(LocalDateTime arrivoIl){
		this.arrivoIl = arrivoIl;
	}
	public void setEffettuatoIl(LocalDateTime effettuatoIl){
		this.effettuatoIl = effettuatoIl;
	}
	public void setClienteArrivaIl(LocalDateTime clienteArrivaIl){
		this.clienteArrivaIl = clienteArrivaIl;
	}
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	public void setCamera(Camera camera){
		this.camera = camera;
	}

	@Override
	public String toString(){
		return "Prenotazione [richieste=" + richieste + ", numeroNotti="
				+ numeroNotti + ", arrivoIl=" + arrivoIl + ", effettuatoIl="
				+ effettuatoIl + ", clienteArrivaIl=" + clienteArrivaIl
				+ ", cliente=" + cliente + ", camera=" + camera + "]";
	}
}