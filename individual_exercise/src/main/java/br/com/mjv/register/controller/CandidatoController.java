package br.com.mjv.register.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import br.com.mjv.register.models.CandidatoModel;
import br.com.mjv.register.models.HabilidadeModel;

public class CandidatoController {

    public void exportaParaCSV(ArrayList<CandidatoModel> candidatos) {

        
        try {
            for (CandidatoModel candidato : candidatos) {
                StringBuilder conteudo = new StringBuilder().append( "Nome, CPF, DataNascimento, Sexo, Logradouro, Número, Complemento, Bairro, Cidade, Estado, Celular, Email, Telefone, Whatsapp, Empresa, Profissao, Salario, Emprego Atual, Valor Minimo, Valor Maximo, Habilidades\n");
                StringBuilder habilidades = new StringBuilder();

                for (HabilidadeModel habilidade : candidato.getHabilidades()) {
                    habilidades.append(habilidade).append(";");
                }

                conteudo.append(
                        this.substituirNullPorVazio(
                                candidato.getNome() + "," +
                                        candidato.getCpf() + "," +
                                        candidato.getDataNascimento() + "," +
                                        candidato.getSexo() + "," +
                                        candidato.getEndereco().toString() + "," +
                                        candidato.getContato().toString() + "," +
                                        candidato.getProfissao().toString() + "," +
                                        candidato.getPretencaoSalarial().toString() + "," +
                                        habilidades.toString() + ",\n")
                );

                Files.write((caminhoArquivo("cadastro-" + candidato.getCpf())),
                        conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Path caminhoArquivo(String nome) {
        return Paths.get(
                "C:\\Users\\Erik\\Documents\\MJV school\\mjv-java-school\\individual_exercise\\src\\main\\java\\br\\com\\mjv\\register\\"
                        + nome + ".csv");
    }

    String substituirNullPorVazio(String texto) {
        return texto.replaceAll("\\bnull\\b", "vazio");
    }

}
