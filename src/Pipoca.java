public class Pipoca {

    private String Combo;
    private  String bebida;
    private  String pipoca;
    private  String preco;
    private  String qtd;

    public String getCombo() {
        return Combo;
    }

    public void setCombo(String combo) {
        Combo = combo;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPipoca() {
        return pipoca;
    }

    public void setPipoca(String pipoca) {
        this.pipoca = pipoca;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public Pipoca(String combo, String bebida, String pipoca, String preco, String qtd) {
        Combo = combo;
        this.bebida = bebida;
        this.pipoca = pipoca;
        this.preco = preco;
        this.qtd = qtd;



    }
}
