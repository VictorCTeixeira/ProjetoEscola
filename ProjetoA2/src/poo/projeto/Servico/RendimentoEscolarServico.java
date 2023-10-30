package poo.projeto.Servico;

import java.util.ArrayList;

import poo.projeto.dominio.RendimentoEscolar;
import poo.projeto.Repositorio.RendimentoEscolarRepositorio;

public class RendimentoEscolarServico extends BaseGenericaServico<RendimentoEscolarRepositorio, RendimentoEscolar> {

    public RendimentoEscolarServico() {
        this.repo = new RendimentoEscolarRepositorio();
    }

    @Override
    public RendimentoEscolar Inserir(RendimentoEscolar registro) {
        return this.repo.Create(registro);
    }

    @Override
    public RendimentoEscolar Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<RendimentoEscolar> Listar() {
        return this.repo.ReadAll();     
    }

    @Override
    public RendimentoEscolar Atualizar(RendimentoEscolar registro) {
        return this.repo.Update(registro);
    }

    @Override
    public RendimentoEscolar Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
