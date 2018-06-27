package motorediricerca;

public class Collegamento {
	
	private Pagina paginaSogente;
	private Pagina paginaDestinazione;
	
	public Collegamento(Pagina paginaSogente, Pagina paginaDestinazione) {
		this.paginaSogente = paginaSogente;
		this.paginaDestinazione = paginaDestinazione;
	}

	public Pagina getPaginaSogente() {
		return paginaSogente;
	}

	public Pagina getPaginaDestinazione() {
		return paginaDestinazione;
	}

	@Override
	public String toString() {
		return "Collegamento [paginaSogente=" + paginaSogente + ", paginaDestinazione=" + paginaDestinazione + "]";
	}
	
	
	

}
