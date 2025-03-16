public class App {
    public static void main(String[] args) throws Exception {
        Funcionario guilherme = new Funcionario(153, 1500, "Estagiário Back Office");
        guilherme.calculaAumento(10f); // Teste com porcentagem
        guilherme.calculaAumento(3); // Teste com tempo
    }
}
