public class CartaoCredito implements MetodoPagamento {
    private double limiteDisponivel;

    public CartaoCredito(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor <= limiteDisponivel) {
            limiteDisponivel -= valor;
            System.out.println("Pagamento aprovado no Cartão de Crédito!");
            return true;
        } else {
            System.out.println("Pagamento recusado: limite insuficiente.");
            return false;
        }
    }

    @Override
    public String getNome() {
        return "Cartão de Crédito";
    }
}