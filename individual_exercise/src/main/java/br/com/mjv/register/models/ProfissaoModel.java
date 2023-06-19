package br.com.mjv.register.models;

public class ProfissaoModel {
    private String profissao;
    private String empresa;
    private Double salario;
    private boolean empregoAtual;
    
    public ProfissaoModel(String profissao, String empresa, Double salario, boolean empregoAtual) {
        this.profissao = profissao;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public boolean isEmpregoAtual() {
        return empregoAtual;
    }
    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }
}
