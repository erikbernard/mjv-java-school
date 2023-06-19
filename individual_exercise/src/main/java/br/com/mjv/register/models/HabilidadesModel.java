package br.com.mjv.register.models;

import br.com.mjv.register.models.Enums.NivelEnum;

public class HabilidadesModel {
     private String nome;
     private NivelEnum nivel;
    public HabilidadesModel(String nome, NivelEnum nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public NivelEnum getNivel() {
        return nivel;
    }
    public void setNivel(NivelEnum nivel) {
        this.nivel = nivel;
    }
    
}
