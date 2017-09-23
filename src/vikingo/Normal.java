package vikingo;

public class Normal extends EstadoVikingo {

	private int ataque=10 ;
	private int defensa=5 ;

	public Normal(){};
	
	
	
	public EstadoVikingo beber(){
		return new Borracho();
	}
	public EstadoVikingo sacudir(){
		return new Enfurecido();
	}



	public int getAtaque() {
		return ataque;
	}



	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}



	public int getDefensa() {
		return defensa;
	}



	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	
}
