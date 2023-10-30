package poo.projeto.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.NotaTrabalho;
import poo.projeto.Repositorio.NotasTrabalhoRepositorio;

public class NotasTrabalhoServico extends BaseGenericaServico<NotasTrabalhoRepositorio, NotaTrabalho> {

    public NotasTrabalhoServico() {
        this.repo = new NotasTrabalhoRepositorio();
    }
    
    @Override
    public NotaTrabalho Inserir(NotaTrabalho registro) {
        return this.repo.Create(registro);
    }

    @Override
    public NotaTrabalho Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<NotaTrabalho> Listar() {
        return this.repo.ReadAll();     
    }

    @Override
    public NotaTrabalho Atualizar(NotaTrabalho registro) {
        return this.repo.Update(registro);
    }

    @Override
    public NotaTrabalho Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

}
