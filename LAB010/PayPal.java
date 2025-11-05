public class PayPal implements MetodoPagamento {
    private String emailUsuario;

    public PayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public boolean pagar(double valor) {
        System.out.println("Autenticando usuário PayPal: " + emailUsuario);
        System.out.println("Transferindo R$" + valor + " via PayPal...");
        return true;
    }

    @Override
    public String getNome() {
        return "PayPal";
    }
}