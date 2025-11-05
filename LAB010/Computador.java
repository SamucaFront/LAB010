public class Computador {
    public void conectarDispositivo(DispositivoConectavel dispositivo) {
        dispositivo.conectar();
        System.out.println(dispositivo.getTipo() + " foi conectado ao computador.\n");
    }

    public void desconectarDispositivo(DispositivoConectavel dispositivo) {
        dispositivo.desconectar();
        System.out.println(dispositivo.getTipo() + " foi desconectado do computador.\n");
    }

    public static void main(String[] args) {
        Computador pc = new Computador();

        DispositivoConectavel teclado = new Teclado();
        DispositivoConectavel mouse = new Mouse();
        DispositivoConectavel impressora = new Impressora();

        pc.conectarDispositivo(teclado);
        pc.conectarDispositivo(mouse);
        pc.conectarDispositivo(impressora);

        pc.desconectarDispositivo(mouse);
        pc.desconectarDispositivo(teclado);
        pc.desconectarDispositivo(impressora);
    }
}