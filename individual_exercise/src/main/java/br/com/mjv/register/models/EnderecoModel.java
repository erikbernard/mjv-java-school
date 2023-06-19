package br.com.mjv.register.models;

public class EnderecoModel {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    public EnderecoModel(String logradouro, String numero, String complemento, String bairro, String cidade,
            String uf) {
        setLogradouro(logradouro);
        setNumero(numero);
        setComplemento(complemento);
        setBairro(bairro);
        setCidade(cidade);
        setUf(uf);
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNumero(String numero) {
        if(numero == "S/N"){
             this.numero = "00000";
        }
        this.numero = 00+numero;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return logradouro + ","+formatar(numero) + "," + complemento
                + "," + bairro + "," + cidade + "," + uf;
    }
    private String formatar(String valor) {
        valor = valor.replaceAll("[^\\d.]", "");
        while (valor.length() < 10) {
            valor = "0" + valor;
        }
        return valor;
    }

}
