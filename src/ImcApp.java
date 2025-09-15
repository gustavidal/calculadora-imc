public class ImcApp {

    public static void main(String[] args) {
        System.out.println("Executando o aplicativo...");

        Imc imc1 = new Imc();
        Imc imc2 = new Imc();

        imc1.obterDados();
        imc2.obterDados();

    }

}
