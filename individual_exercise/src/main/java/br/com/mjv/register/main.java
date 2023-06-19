package br.com.mjv.register;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import br.com.mjv.register.controller.CandidatoController;
import br.com.mjv.register.models.CandidatoModel;
import br.com.mjv.register.models.ContatoModel;
import br.com.mjv.register.models.EnderecoModel;
import br.com.mjv.register.models.HabilidadeModel;
import br.com.mjv.register.models.PretencaoSalarialModel;
import br.com.mjv.register.models.ProfissaoModel;
import br.com.mjv.register.models.Enums.GeneroEnum;
import br.com.mjv.register.models.Enums.NivelEnum;

public class main {
    public static void main(String[] args) {

        
        ArrayList<CandidatoModel> listaCandidatos = new ArrayList<>();
        ArrayList<HabilidadeModel> listaHabilidades = new ArrayList<>();
        
        var contato =  new ContatoModel("abc@email.com", "40018922", "(88)9.9323-2223", true);
        var endereco = new EnderecoModel("Rua Tal de lá", "222", " não","Azul", "Russa", "CE");
        var profissao = new ProfissaoModel("Dev", "Fanta S.A", 2000.00, true);
        var pretencaoSalarial = new PretencaoSalarialModel(1000.00, 1700.00);
        var habilidade1 = new HabilidadeModel("Pòstgres", NivelEnum.BASICO);
        var habilidade = new HabilidadeModel("Angular", NivelEnum.BASICO);
        
        listaHabilidades.add(habilidade);
        listaHabilidades.add(habilidade1);
        
        var candidato = new CandidatoModel("Erik Bernardo", gerarNumeroAleatorio()+".099.010-21", LocalDate.of(1998, 04, 13), GeneroEnum.MASCULINO, contato, endereco, profissao, listaHabilidades, pretencaoSalarial);
        
        
        var endereco1 = new EnderecoModel("Rua Tal de lá", "S/N", " não","Azul", "Russa", "CE");
        var candidato1 = new CandidatoModel("Erik Bernardo2",  gerarNumeroAleatorio()+".099.010-21", LocalDate.of(1998, 04, 13), GeneroEnum.MASCULINO, contato, endereco1, profissao, listaHabilidades, pretencaoSalarial);
        
        
        var profissao2 = new ProfissaoModel(null, null, null, false);
        var candidato2 = new CandidatoModel("Erik Bernardo2",  gerarNumeroAleatorio()+".099.010-21", LocalDate.of(1998, 04, 13), GeneroEnum.MASCULINO, contato, endereco, profissao2, listaHabilidades, pretencaoSalarial);
        
        listaCandidatos.add(candidato);
        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        
        CandidatoController controller = new CandidatoController();
        controller.exportaParaCSV(listaCandidatos);
        
    }
    
    public static int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(900) + 100;
    }
}