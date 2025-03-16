public class Torneio{
    private String nome;
    private int idade;

    public Torneio(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String verificarCategoria(){
        String categoria;
        if(this.idade >= 5 && this.idade <= 7){
            categoria = "Infantil";
        }else if(this.idade >= 8 && this.idade <= 10){
            categoria = "Juvenil";
        }else if(this.idade >=11 && this.idade <= 15){
            categoria = "Adolescente";
        }else if(this.idade >= 16 && this.idade <= 30){
            categoria = "Adulto";
        }else if(this.idade > 30){
            categoria = "Sênior";
        }else{
            categoria = "Fora das categorias disponíveis";
        }
        return categoria;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Categoria: " + verificarCategoria());
    }
}