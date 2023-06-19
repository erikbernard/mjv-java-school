package br.com.mjv.register.models;

public class ContatoModel {
    private String email;
    private String telefone;
    private String celular;
    private boolean celularWhatsApp;
    public ContatoModel(String email, String telefone, String celular, boolean celularWhatsApp) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularWhatsApp = celularWhatsApp;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular, boolean celularWhatsApp) {
        this.celularWhatsApp = celularWhatsApp;
        this.celular = celular;
    }
}
