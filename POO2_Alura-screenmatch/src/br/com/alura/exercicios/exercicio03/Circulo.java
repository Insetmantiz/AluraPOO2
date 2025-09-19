package br.com.alura.exercicios.exercicio03;

public class Circulo implements Forma{
	
	double raio=0;
	double diametro=0;
	
	public Circulo(double diametro){
		this.diametro = diametro;
	}
	
	@Override
	public void calcularArea() {
		if(diametro>0){
			raio = diametro/2;
		}
			System.out.println("Area do Círculo: " + (raio*raio)*Math.PI);
	}

	

}
