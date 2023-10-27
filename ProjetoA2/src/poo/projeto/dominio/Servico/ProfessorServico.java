package poo.projeto.dominio.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.Professor;
import poo.projeto.dominio.Repositorio.ProfessorRepositorio;

public class ProfessorServico extends BaseGenericaServico<ProfessorRepositorio, Professor>{

    public ProfessorServico() {
        this.repo = new ProfessorRepositorio();
    }

    @Override
    public Professor Inserir(Professor registro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Inserir'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Atualizar'");
    }

    @Override
    public Professor Excluir(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Excluir'");
    }
    
}
