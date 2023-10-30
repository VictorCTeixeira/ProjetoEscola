package poo.projeto.dominio.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.Disciplina;
import poo.projeto.dominio.Repositorio.DisciplinaRepositorio;

public class DisciplinaServico extends BaseGenericaServico<DisciplinaRepositorio, Disciplina>{

    public DisciplinaServico() {
        this.repo = new DisciplinaRepositorio();
    }

    @Override
    public Disciplina Inserir(Disciplina registro) {
        return this.repo.Create(registro);
    }

    @Override
    public Disciplina Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Disciplina> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Disciplina Atualizar(Disciplina registro) {
        return this.repo.Update(registro);
    }

    @Override
    public Disciplina Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
    
}
