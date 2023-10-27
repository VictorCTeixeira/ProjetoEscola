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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Inserir'");
    }

    @Override
    public Turma Obter(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Obter'");
    }

    @Override
    public ArrayList<Turma> Listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Listar'");
    }

    @Override
    public Turma Atualizar(Turma registro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Atualizar'");
    }

    @Override
    public Turma Excluir(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Excluir'");
    }

}
