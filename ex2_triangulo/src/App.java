public class App {
    public static void main(String[] args) throws Exception {
        Triangulo t = new Triangulo();
        double base = t.getBase();
        double altura = t.getAltura();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);

        t.setBase(10);
        t.setAltura(20);

        System.out.println("Base setada: " + t.getBase());
        System.out.println("Altura setada: " + t.getAltura());

        t.imprimeDados();
    }
}
