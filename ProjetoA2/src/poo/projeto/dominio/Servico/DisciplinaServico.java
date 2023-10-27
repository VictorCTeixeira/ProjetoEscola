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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Inserir'");
    }

    @Override
    public Disciplina Obter(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Obter'");
    }

    @Override
    public ArrayList<Disciplina> Listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Listar'");
    }

    @Override
    public Disciplina Atualizar(Disciplina registro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Atualizar'");
    }

    @Override
    public Disciplina Excluir(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Excluir'");
    }
    
}
