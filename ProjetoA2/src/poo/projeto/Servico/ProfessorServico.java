package poo.projeto.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.Professor;
import poo.projeto.Repositorio.ProfessorRepositorio;

public class ProfessorServico extends BaseGenericaServico<ProfessorRepositorio, Professor>{

    public ProfessorServico() {
        this.repo = new ProfessorRepositorio();
    }

    @Override
    public Professor Inserir(Professor registro) {
        return this.repo.Create(registro);
    }

    @Override
    public Professor Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Professor> Listar() {
        return this.repo.ReadAll();     
    }

    @Override
    public Professor Atualizar(Professor registro) {
        return this.repo.Update(registro);
    }

    @Override
    public Professor Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
    
}
