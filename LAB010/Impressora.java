public class Impressora implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("Impressora conectada.");
    }

    @Override
    public void desconectar() {
        System.out.println("Impressora desconectada.");
    }

    @Override
    public String getTipo() {
        return "Impressora";
    }
}