package br.com.mjv.register.models;

import java.time.LocalDate;
import java.util.List;

import br.com.mjv.register.models.Enums.GeneroEnum;

public class CandidatoModel extends PessoalModel{
    private ContatoModel contato;
    private EnderecoModel endereco;
    private ProfissaoModel profissao;
    private List<HabilidadeModel> habilidades;
    private PretencaoSalarialModel pretencaoSalarial;

    public CandidatoModel(
            String nome, String cpf, 
            LocalDate dataNascimento, GeneroEnum sexo, 
            ContatoModel contato, EnderecoModel endereco, 
            ProfissaoModel profissao, List<HabilidadeModel> habilidades,
            PretencaoSalarialModel pretencaoSalarial
        ) {
        super(nome, cpf, dataNascimento, sexo);
        this.contato = contato;
        this.endereco = endereco;
        this.profissao = profissao;
        this.habilidades = habilidades;
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public ContatoModel getContato() {
        return contato;
    }

    public void setContato(ContatoModel contato) {
        this.contato = contato;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public ProfissaoModel getProfissao() {
        return profissao;
    }

    public void setProfissao(ProfissaoModel profissao) {
        this.profissao = profissao;
    }

    public List<HabilidadeModel> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<HabilidadeModel> habilidades) {
        this.habilidades = habilidades;
    }

    public PretencaoSalarialModel getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(PretencaoSalarialModel pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }
}
