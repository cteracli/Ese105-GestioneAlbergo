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
	
	
	public String getRichieste() {
		return richieste;
	}
	public void setRichieste(String richieste) {
		this.richieste = richieste;
	}
	public int getNumeroNotti() {
		return numeroNotti;
	}
	public void setNumeroNotti(int numeroNotti) {
		this.numeroNotti = numeroNotti;
	}
	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}
	public void setArrivoIl(LocalDateTime arrivoIl) {
		this.arrivoIl = arrivoIl;
	}
	public LocalDateTime getEffettuatoIl() {
		return effettuatoIl;
	}
	public void setEffettuatoIl(LocalDateTime effettuatoIl) {
		this.effettuatoIl = effettuatoIl;
	}
	public LocalDateTime getClienteArrivaIl() {
		return clienteArrivaIl;
	}
	public void setClienteArrivaIl(LocalDateTime clienteArrivaIl) {
		this.clienteArrivaIl = clienteArrivaIl;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
}
