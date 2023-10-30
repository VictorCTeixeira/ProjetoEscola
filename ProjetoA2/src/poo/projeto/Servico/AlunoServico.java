package poo.projeto.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.Aluno;
import poo.projeto.Repositorio.AlunoRepositorio;

public class AlunoServico extends BaseGenericaServico<AlunoRepositorio, Aluno>{

    public AlunoServico() {
        this.repo = new AlunoRepositorio();
    }

    @Override
    public Aluno Inserir(Aluno registro) {
        return this.repo.Create(registro);
    }

    @Override
    public Aluno Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Aluno> Listar() {
        return this.repo.ReadAll();    
    }

    @Override
    public Aluno Atualizar(Aluno registro) {
        return this.repo.Update(registro);    
    }

    @Override
    public Aluno Excluir(int codigo) {
        return this.repo.Delete(codigo);    
    }
    
}
