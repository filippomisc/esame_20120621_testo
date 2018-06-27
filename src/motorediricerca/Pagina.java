package motorediricerca;

import java.util.*;

public class Pagina implements Comparable{
	
	private String indirizzo;
	private String html;
	private long data;
//	private int punteggio;
	
	private List<ElementoMultimediale> elementiMultimendiali;
	
	
	
	

	public Pagina(String indirizzo, String html, long data/*, int punteggio*/) {
		this.indirizzo = indirizzo;
		this.html = html;
		this.data = data;
//		this.punteggio = 0;
		elementiMultimendiali = new ArrayList<>();
	}

	public List<ElementoMultimediale> geteMultimendiali() {
		return elementiMultimendiali;
	}

	public String getIndirizzo(){
		return indirizzo;
	}
	
	public String getHtml(){
		return html;
		
	}
	
	public long getData(){
		return data;
	}
	
	public int getPunteggio(){
		return 0;
	}
		
	public void setHtml(String html) {
		this.html = html;
	}

	public void setData(long data) {
		this.data = data;
	}

	public void aggiungiImmagine(String nome, float dimensione){
		
		Immagine immagine = new Immagine(nome, dimensione);
		
		if(!elementiMultimendiali.contains(immagine))
			elementiMultimendiali.add(immagine);
	}

	public void aggiungiVideo(String nome, float dimensione,int durata){
		
		Video video = new Video(nome, dimensione, durata);
		
		if(!elementiMultimendiali.contains(video))
			elementiMultimendiali.add(video);
    }
	

	public Collection<ElementoMultimediale> elencoElementiMultimediali(){
		
		Collections.sort(elementiMultimendiali);
		return elementiMultimendiali;
	}

	public void aggiungiParolaChiave(String parola) throws ParolaChiaveDuplicataException{
	}
	
	public String[] elencoParoleChiave(){
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indirizzo == null) ? 0 : indirizzo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagina other = (Pagina) obj;
		if (indirizzo == null) {
			if (other.indirizzo != null)
				return false;
		} else if (!indirizzo.equals(other.indirizzo))
			return false;
		return true;
	}

	public void setIndirizzo(String indirizzo2) {


	}

	@Override
	public int compareTo(Object o) {
		Pagina altra = (Pagina) o;
		
		return (int) (this.data-altra.data);
	}

	@Override
	public String toString() {
		return "Pagina [indirizzo=" + indirizzo + ", html=" + html + ", data=" + data + "]";
	}
	
}







