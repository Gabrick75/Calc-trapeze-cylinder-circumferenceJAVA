package cilindro;

public class cilindro {
	
	public double PI;
	public double raio;
	public double h;
	public double b;

	public double arealateral =  ((2 * (Math.PI * raio)) * h);
		
	
	public double areacirculo = Math.PI * Math.pow(raio, 2);
		
	
	
	public double area() {
		return (arealateral) + (2 * areacirculo);
	}
	
	public double areaa() {
		return 2 * (Math.PI * Math.pow(raio, 2)) + 2 * (Math.PI * raio * h);
	}
	
	
	public double volume() {
		return (Math.PI * Math.pow(raio,2) * h);
		
	}
	

}

