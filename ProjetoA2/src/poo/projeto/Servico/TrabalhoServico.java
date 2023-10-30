package poo.projeto.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.Trabalho;
import poo.projeto.Repositorio.TrabalhoRepositorio;

public class TrabalhoServico extends BaseGenericaServico<TrabalhoRepositorio, Trabalho>{

    public TrabalhoServico() {
        this.repo = new TrabalhoRepositorio();
    }

    @Override
    public Trabalho Inserir(Trabalho registro) {
        return this.repo.Create(registro);
    }

    @Override
    public Trabalho Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Trabalho> Listar() {
        return this.repo.ReadAll();     
    }

    @Override
    public Trabalho Atualizar(Trabalho registro) {
        return this.repo.Update(registro);
    }

    @Override
    public Trabalho Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
    
}
