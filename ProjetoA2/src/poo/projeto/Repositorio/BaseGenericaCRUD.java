package poo.projeto.Repositorio;

import java.util.ArrayList;

public abstract class BaseGenericaCRUD<TFakeDB, Tdom> {

    protected TFakeDB db;
    protected ArrayList<Tdom> dataset;

    public abstract Tdom Create(Tdom instancia);

    public abstract Tdom Read(int codigo);

    public ArrayList<Tdom> ReadAll() {
        return this.dataset;
    }

    public abstract Tdom Update(Tdom instancia);

    public abstract Tdom Delete(int codigo);

}
