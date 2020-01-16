
public class Circulo {
	double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double radio() {
		return Math.PI*(Math.pow(radio,2));
	}	
}


