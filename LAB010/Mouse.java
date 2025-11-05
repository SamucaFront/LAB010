public class Mouse implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("Mouse conectado.");
    }

    @Override
    public void desconectar() {
        System.out.println("Mouse desconectado.");
    }

    @Override
    public String getTipo() {
        return "Mouse";
    }
}