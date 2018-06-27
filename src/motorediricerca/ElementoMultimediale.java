package motorediricerca;

public class ElementoMultimediale implements Comparable {
	
	private String nome;
	private float dimensione;
	
	
	

	
	public ElementoMultimediale(String nome, float dimensione) {
		this.nome = nome;
		this.dimensione = dimensione;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public float getDimensione() {
		return dimensione;
	}





	public void setDimensione(float dimensione) {
		this.dimensione = dimensione;
	}





	public String tipo(){
		return null;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		ElementoMultimediale other = (ElementoMultimediale) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}





	@Override
	public int compareTo(Object o) {
		
		ElementoMultimediale e = (ElementoMultimediale) o;
		
		int result = (int) (this.dimensione-e.getDimensione());
		if(result == 0)
			result = this.nome.compareTo(e.getNome());
		return result;
	}





	@Override
	public String toString() {
		return "ElementoMultimediale [nome=" + nome + ", dimensione=" + dimensione + ", tipo()=" + tipo() + "]";
	}	
}
