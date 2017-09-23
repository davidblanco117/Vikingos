package vikingo;

public class Enfurecido extends EstadoVikingo {

	
	private int ataque=30 ;
	private int defensa=0 ;

	public Enfurecido(){};
	
	
	
	public EstadoVikingo beber(){
		return new Normal();
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
