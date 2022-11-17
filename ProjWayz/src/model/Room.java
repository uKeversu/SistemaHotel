package model;

/**
 * @author kelwin_santos
 */
public class Room {
    
    private int nmr_quarto;
    private float txtValorDiaria;
    private String txtAndar;
    private String txtTipoQuarto;
    private String txtDesc;
    private String ocupacao;
    
    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
    
    public int getNmr_quarto() {
        return nmr_quarto;
    }

    public void setNmr_quarto(int nmr_quarto) {
        this.nmr_quarto = nmr_quarto;
    }

    public float getTxtValorDiaria() {
        return txtValorDiaria;
    }

    public void setTxtValorDiaria(float txtValorDiaria) {
        this.txtValorDiaria = txtValorDiaria;
    }

    public String getTxtAndar() {
        return txtAndar;
    }

    public void setTxtAndar(String txtAndar) {
        this.txtAndar = txtAndar;
    }

    public String getTxtTipoQuarto() {
        return txtTipoQuarto;
    }

    public void setTxtTipoQuarto(String txtTipoQuarto) {
        this.txtTipoQuarto = txtTipoQuarto;
    }

    public String getTxtDesc() {
        return txtDesc;
    }

    public void setTxtDesc(String txtDesc) {
        this.txtDesc = txtDesc;
    }
    
}
