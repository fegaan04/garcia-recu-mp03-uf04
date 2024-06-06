public class GarciaData {
    private int dia;
    private int mes;
    private int any;
    private int hora;
    private int minut;
    private int segon;

    public GarciaData(int _segon, int _minut, int _hora, int _any, int _mes, int _dia) {
        this.segon = _segon;
        this.minut = _minut;
        this.hora = _hora;
        this.any = _any;
        this.mes = _mes;
        this.dia = _dia;
    }

    public int getSegon() {
        return segon;
    }

    public void setSegon(int _segon) {
        this.segon = _segon;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int _minut) {
        this.minut = _minut;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int _hora) {
        this.hora = _hora;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int _any) {
        this.any = _any;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int _mes) {
        this.mes = _mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int _dia) {
        this.dia = _dia;
    }
}
