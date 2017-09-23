package vikingo;

public class Vikingo {
	
	private EstadoVikingo estado;
	private int salud=100;

	public Vikingo(){
		this.estado=new Normal();
	}
	
	
	
	public EstadoVikingo getEstado() {
		return estado;
	}



	public void setEstado(EstadoVikingo estado) {
		this.estado = estado;
	}



	public int getSalud() {
		return salud;
	}

	public int getAtaque(){
		return estado.getAtaque();
	}
	
	public int getDefensa(){
		return estado.getDefensa();
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}



	public void beber(){
		estado=estado.beber();
	}
	public void sacudir(){
		
		estado=estado.sacudir();
	}


	
	
	/*public void atacar(Vikingo v2){
		v2.salud-=this.ataque-v2.defensa;
	}*/
	
	
	
	
	
	
}
