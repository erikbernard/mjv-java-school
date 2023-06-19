package br.com.mjv.register.models;

import java.time.LocalDate;

import br.com.mjv.register.models.Enums.GeneroEnum;

public class PessoalModel {
    private String nome;
    private String cpf;
    private LocalDate  dataNascimento;
    private GeneroEnum sexo;
    
    public PessoalModel(String nome, String cpf, LocalDate dataNascimento, GeneroEnum sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public GeneroEnum getSexo() {
        return sexo;
    }

    public void setSexo(GeneroEnum sexo) {
        this.sexo = sexo;
    }
}
