public class Teclado implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("Teclado conectado.");
    }

    @Override
    public void desconectar() {
        System.out.println("Teclado desconectado.");
    }

    @Override
    public String getTipo() {
        return "Teclado";
    }
}