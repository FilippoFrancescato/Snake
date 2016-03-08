
public class Nodo {
	
	private Punto punto;
	private Nodo link;
	
	public Nodo(){
		punto = new Punto();
		link = null;
	}
	
	public void setPunto(int x,int y){
		punto.setX(x);
		punto.setY(y);
	}
	public Punto getPunto(){
		return punto;
	}

	public Nodo getLink() {
		return link;
	}

	public void setLink(Nodo link) {
		this.link = link;
	}
	
	
}
