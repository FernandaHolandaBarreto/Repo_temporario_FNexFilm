public class TipoDeIngressos {

    private String inteira;
    private String meia;
    private String Vip;

    public String getInteira() {
        return inteira;
    }

    public void setInteira(String inteira) {
        this.inteira = inteira;
    }

    public String getMeia() {
        return meia;
    }

    public void setMeia(String meia) {
        this.meia = meia;
    }

    public String getVip() {
        return Vip;
    }

    public void setVip(String vip) {
        Vip = vip;
    }

    public TipoDeIngressos(String inteira, String meia, String vip) {
        this.inteira = inteira;
        this.meia = meia;
        Vip = vip;



    }
}
