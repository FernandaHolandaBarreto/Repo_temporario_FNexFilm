public class Rodape {

    private  String menu;
    private  String institucional;
    private  String redesSociais;
    private  String sobreNois;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getInstitucional() {
        return institucional;
    }

    public void setInstitucional(String institucional) {
        this.institucional = institucional;
    }

    public String getRedesSociais() {
        return redesSociais;
    }

    public void setRedesSociais(String redesSociais) {
        this.redesSociais = redesSociais;
    }

    public String getSobreNois() {
        return sobreNois;
    }

    public void setSobreNois(String sobreNois) {
        this.sobreNois = sobreNois;
    }

    public Rodape(String menu, String institucional, String redesSociais, String sobreNois) {
        this.menu = menu;
        this.institucional = institucional;
        this.redesSociais = redesSociais;
        this.sobreNois = sobreNois;


    }
}
