public class LojaVirtual {
    public void processarCompra(double valor, MetodoPagamento metodo) {
        System.out.println("\nProcessando compra de R$" + valor + " com " + metodo.getNome());
        boolean sucesso = metodo.pagar(valor);

        if (sucesso) {
            System.out.println("Compra concluída com sucesso!");
        } else {
            System.out.println("Falha no pagamento!");
        }
    }

    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        MetodoPagamento cartao = new CartaoCredito(500);
        MetodoPagamento paypal = new PayPal("cliente@email.com");
        MetodoPagamento boleto = new Boleto();

        loja.processarCompra(200, cartao);
        loja.processarCompra(100, paypal);
        loja.processarCompra(350, boleto);
    }
}