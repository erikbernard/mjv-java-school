package br.com.mjv.register.models;

public class ProfissaoModel {
    private String profissao;
    private String empresa;
    private Double salario;
    private boolean empregoAtual;
    
    public ProfissaoModel(String profissao, String empresa, Double salario, boolean empregoAtual) {
        setProfissao(profissao);
        setEmpresa(empresa);
        setSalario(salario);
        setEmpregoAtual(empregoAtual);
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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

    @Override
    public String toString() {
        return profissao + "," + empresa + "," + salario+ "," + empregoAtual;
    }

    String formatarValor(String valor) {
        valor = valor.replaceAll("[^\\d.]", "");
        while (valor.length() < 10) {
            valor = "0" + valor;
        }
        return valor;
    }
}
