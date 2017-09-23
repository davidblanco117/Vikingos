package vikingo;

public class Borracho extends EstadoVikingo{

	private int ataque=7 ;
	private int defensa=2 ;

	public Borracho(){};
	
	
	
	public EstadoVikingo beber(){
		return new Borracho();
	}
	public EstadoVikingo sacudir(){
		
		return new Normal();
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
