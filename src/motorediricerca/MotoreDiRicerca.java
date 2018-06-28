package motorediricerca;

import java.util.*;


public class MotoreDiRicerca {
	
	private List<Pagina> pagine;
	
	/*
	 * se usiamo la mappa non possiamo avere 
	 * piu collegamenti tra 2 pagine 
	 */
	private List<Collegamento> collegamenti;
	

	public MotoreDiRicerca() {
		this.pagine = new ArrayList<>();
		this.collegamenti = new ArrayList<>();
		
	}

	public Pagina aggiungiPagina(String indirizzo, String html){
		
		Pagina pagina = new Pagina(indirizzo, html, System.currentTimeMillis());
		
		if(!pagine.contains(pagina))
			pagine.add(pagina);
		else {
			for (Pagina paginaGiaPresente : pagine) {
				if(paginaGiaPresente.equals(pagina)) {
					paginaGiaPresente.setIndirizzo(indirizzo);
					paginaGiaPresente.setHtml(html);
					paginaGiaPresente.setData(System.currentTimeMillis());
				}
				
			}
			
		}
		
		return pagina;
	}
	
	public Collection<Pagina> elencoPagine(){
		Collections.sort(pagine);
		return pagine;
	}
	
	public void aggiungiCollegamentoUscente(String indirizzoSorgente, String indirizzoDestinazione){
		
		//controllare con il metodo getPaginaByIndirizzo() che le pagine siano presenti nella lista
		//pagine
		Pagina paginaSorgente = getPaginaByIndirizzo(indirizzoSorgente);
		Pagina paginaDestinazione = getPaginaByIndirizzo(indirizzoDestinazione);
		
		Collegamento collegamento = new Collegamento(paginaSorgente, paginaDestinazione);
		
		collegamenti.add(collegamento);
		
		
	}
	
	public Collection<Pagina> cerca(String query){
		return null;
	}

	public List<Pagina> getPagine() {
		return pagine;
	}
	
	
	
	public Pagina getPaginaByIndirizzo (String indirizzo) {
		
		Pagina result = null;
		try {
				
		
		for (Pagina pagina2 : pagine) {
			if(pagina2.getIndirizzo().compareTo(indirizzo)==0) {
				
				result = pagina2;
			}
			
			
		}
//		return result;
		
		} catch (NullPointerException e) {
			System.err.println("pagina non trovata");	
			
			}
		
	return result;
		
		
	
		
		
		
	}
}
