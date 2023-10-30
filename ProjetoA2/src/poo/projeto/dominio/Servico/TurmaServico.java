package poo.projeto.dominio.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.Turma;
import poo.projeto.dominio.Repositorio.TurmaRepositorio;

public class TurmaServico extends BaseGenericaServico<TurmaRepositorio, Turma>{

    public TurmaServico() {
        this.repo = new TurmaRepositorio();
    }

    @Override
    public Turma Inserir(Turma registro) {
        return this.repo.Create(registro);
    }

    @Override
    public Turma Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Turma> Listar() {
        return this.repo.ReadAll();     
    }

    @Override
    public Turma Atualizar(Turma registro) {
        return this.repo.Update(registro);
    }

    @Override
    public Turma Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

}
