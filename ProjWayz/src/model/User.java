package model;

/**
 * @author kelwin_santos
 */
public class User {
 
    private int id_user;
    private String txtCpf;
    private String txtNome;
    private String user_password;
    private String nm_user;
    private String txtFone;
    private String txtNascimento;
    private String Cargo;
    private int grauDeAcesso;

    public int getGrauDeAcesso() {
        return grauDeAcesso;
    }

    public void setGrauDeAcesso(int grauDeAcesso) {
        this.grauDeAcesso = grauDeAcesso;
    }
    
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getTxtCpf() {
        return txtCpf;
    }

    public void setTxtCpf(String txtCpf) {
        this.txtCpf = txtCpf;
    }

    public String getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getNm_user() {
        return nm_user;
    }

    public void setNm_user(String nm_user) {
        this.nm_user = nm_user;
    }

    public String getTxtFone() {
        return txtFone;
    }

    public void setTxtFone(String txtFone) {
        this.txtFone = txtFone;
    }

    public String getTxtNascimento() {
        return txtNascimento;
    }

    public void setTxtNascimento(String txtNascimento) {
        this.txtNascimento = txtNascimento;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
}
