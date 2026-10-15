public class Pagamento {


    private  String tipoDePagamento;
    private  String cupomDeDesconto;


    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public String getCupomDeDesconto() {
        return cupomDeDesconto;
    }

    public void setCupomDeDesconto(String cupomDeDesconto) {
        this.cupomDeDesconto = cupomDeDesconto;
    }

    public Pagamento(String tipoDePagamento, String cupomDeDesconto) {
        this.tipoDePagamento = tipoDePagamento;
        this.cupomDeDesconto = cupomDeDesconto;



    }
}
