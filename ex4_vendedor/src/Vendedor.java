public class Vendedor{
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    public Vendedor(float vendas, float salario, String nome, int falta){
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }

    public float getVendas(){
        return this.vendas;
    }

    public float getSalario(){
        return this.salario;
    }

    public String getNome(){
        return this.nome;
    }

    public int getFalta(){
        return this.falta;
    }

    public void setVendas(float vendas){
        this.vendas = vendas;
    }

    public void setSalario (float salario){
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setFalta(int falta){
        this.falta = falta;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Vendas: " + this.vendas);
        System.out.println("Faltas: " + this.falta);
    }

    public float calcularComissao(){
        float comissao = 0;
        if(this.vendas >= 1000 && this.vendas < 2000){
            comissao = this.vendas * 0.10f;
        }else if(this.vendas >= 2000){
            comissao = this.vendas * 0.15f;
        }
        return comissao;
    }

    public float descontoFalta(){
        return (this.salario/30) * this.falta;
    }

    public void calcularSalario(){
        System.out.println("Salário: " + (this.salario + calcularComissao() - descontoFalta()));
    }
}