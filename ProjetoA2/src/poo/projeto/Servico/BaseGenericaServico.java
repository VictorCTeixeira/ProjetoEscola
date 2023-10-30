package poo.projeto.Servico;

import java.util.ArrayList;

public abstract class BaseGenericaServico <Trepositorio, Tdom>{
    
    protected Trepositorio repo;

    public abstract Tdom Inserir(Tdom registro);

    public abstract Tdom Obter(int codigo);

    public abstract ArrayList<Tdom> Listar();

    public abstract Tdom Atualizar(Tdom registro);

    public abstract Tdom Excluir(int codigo);

    public BaseGenericaServico(){
    }
}
