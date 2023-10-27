package poo.projeto.dominio.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.Trabalho;
import poo.projeto.dominio.Repositorio.TrabalhoRepositorio;

public class TrabalhoServico extends BaseGenericaServico<TrabalhoRepositorio, Trabalho>{

    public TrabalhoServico() {
        this.repo = new TrabalhoRepositorio();
    }

    @Override
    public Trabalho Inserir(Trabalho registro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Inserir'");
    }

    @Override
    public Trabalho Obter(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Obter'");
    }

    @Override
    public ArrayList<Trabalho> Listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Listar'");
    }

    @Override
    public Trabalho Atualizar(Trabalho registro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Atualizar'");
    }

    @Override
    public Trabalho Excluir(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Excluir'");
    }
    
}
