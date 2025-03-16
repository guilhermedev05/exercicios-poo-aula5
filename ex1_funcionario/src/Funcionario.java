public class Funcionario{
    private int cracha;
    private float salario;
    private String cargo;

    Funcionario(){
        this.cracha = 0;
        this.salario = 0.0f;
        this.cargo = "Assistente";
    }

    Funcionario(int cracha, float salario, String cargo){
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void calculaAumento(float porcentagem){
        this.salario += this.salario * (porcentagem / 100);
        System.out.println("Novo salário: " + this.salario);
    }

    public void calculaAumento(int tempo){
        this.salario += (150 * tempo);
        System.out.println("Novo salário: " + this.salario);
    }
}