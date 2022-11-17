package model;

/**
 * @author kelwin_santos
 */
public class Hospede {
    
    private int id_hospede;
    private String TxtNome;
    private String TxtCpf;
    private String TxtFone;
    private String TxtEmail;

    public int getId_hospede() {
        return id_hospede;
    }

    public void setId_hospede(int id_hospede) {
        this.id_hospede = id_hospede;
    }

    public String getTxtNome() {
        return TxtNome;
    }

    public void setTxtNome(String TxtNome) {
        this.TxtNome = TxtNome;
    }

    public String getTxtCpf() {
        return TxtCpf;
    }

    public void setTxtCpf(String TxtCpf) {
        this.TxtCpf = TxtCpf;
    }

    public String getTxtFone() {
        return TxtFone;
    }

    public void setTxtFone(String TxtFone) {
        this.TxtFone = TxtFone;
    }

    public String getTxtEmail() {
        return TxtEmail;
    }

    public void setTxtEmail(String TxtEmail) {
        this.TxtEmail = TxtEmail;
    }
    
}
