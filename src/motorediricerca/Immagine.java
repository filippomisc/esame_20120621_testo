package motorediricerca;

public class Immagine extends ElementoMultimediale{

	public Immagine(String nome, float dimensione) {
		super(nome, dimensione);
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
		return "immagine";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	
}
