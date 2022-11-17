package model;

/**
 * @author kelwin_santos
 */
public class Reserva {
    
    private int id_reserva;
    private int qtd_hospedes;
    private String entrada;
    private String saida;
    private int diarias;

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getQtd_hospedes() {
        return qtd_hospedes;
    }

    public void setQtd_hospedes(int qtd_hospedes) {
        this.qtd_hospedes = qtd_hospedes;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }
    
}
