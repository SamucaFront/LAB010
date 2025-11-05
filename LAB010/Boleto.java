public class Boleto implements MetodoPagamento {
    private String codigoBarras;
    private boolean pago = false;

    @Override
    public boolean pagar(double valor) {
        codigoBarras = "8362000000" + (int)(Math.random() * 999999);
        System.out.println("Boleto gerado. Código de barras: " + codigoBarras);
        System.out.println("Pagamento pendente. Valor: R$" + valor);
        return false;
    }

    @Override
    public String getNome() {
        return "Boleto";
    }
}