package motorediricerca;

public class Video extends ElementoMultimediale{
	

	private int durata; //in secondi
	
	
	public Video(String nome, float dimensione, int durata) {
		super(nome, dimensione);
		this.durata = durata;
	}


	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}


	@Override
	public String getNome() {
		return super.getNome();
	}


	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}


	@Override
	public float getDimensione() {
		return super.getDimensione();
	}


	@Override
	public void setDimensione(float dimensione) {
		super.setDimensione(dimensione);
	}


	@Override
	public String tipo() {
		return "video";
	}


	@Override
	public String toString() {
		return "Video [nome: " + getNome() + "dimensione: " + getDimensione() + "durata: " + durata + "tipo: " + tipo() + "]";
	}
	
}
