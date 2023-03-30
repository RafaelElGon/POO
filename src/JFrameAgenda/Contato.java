package JFrameAgenda;

public class Contato {
    private String name;
    private int dia;
    private int mes;

    public Contato(String name, int dia, int mes){
        this.dia = dia;
        this.mes = mes;
        this.name = name;
    }

    public Contato(){
        this("", 0, 0);
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDiaAniversario() {
        return dia;
    }

    public int getMesAniversario() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
