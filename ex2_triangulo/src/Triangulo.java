import java.util.Scanner;

public class Triangulo{
    private double base;
    private double altura;

    public Triangulo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a base");
        this.base = input.nextDouble();
        System.out.println("Digite a altura");
        this.altura = input.nextDouble();
    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calculaArea(){
        return (this.base * this.altura) / 2;
    }

    public void imprimeDados(){
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + calculaArea());
    }
}