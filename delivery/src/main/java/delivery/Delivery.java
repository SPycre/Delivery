package delivery;

public class Delivery {

	private int distance;
	private int poids;
	private double prix;
	
	public void updatePrix() {
		this.prix = (this.distance <= 50 ? 10 : 10 + .5*(this.distance-50) ) + (this.poids > 25 ? 5 : this.poids >= 10 ? 2 : 0);
	}
	
	public Delivery(int distance, int poids) {
		this.distance = distance;
		this.poids = poids;
		this.updatePrix();
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
		this.updatePrix(); // Met à jour le prix
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
		this.updatePrix(); // Met à jour le prix
	}

	public double getPrix() {
		return prix;
	}
	
}
