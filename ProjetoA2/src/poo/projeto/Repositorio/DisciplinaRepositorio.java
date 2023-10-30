package poo.projeto.Repositorio;

import poo.projeto.dominio.Disciplina;
import poo.projeto.FakeDB.DisciplinaFakeDB;

public class DisciplinaRepositorio extends BaseGenericaCRUD<DisciplinaFakeDB, Disciplina>{

    public DisciplinaRepositorio() {
        this.db = new DisciplinaFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public Disciplina Create(Disciplina instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;    
    }

    @Override
    public Disciplina Read(int codigo) {
        for (Disciplina disciplina : this.dataset) {
            if (disciplina.getCodigo() == codigo)
                disciplina.toString();
        }
        return null;
    }

    @Override
    public Disciplina Update(Disciplina instancia) {
        Disciplina disc = this.Read(instancia.getCodigo());
        disc.setEmenta(instancia.getEmenta());
        disc.setNome(instancia.getNome());
        return disc;
    }

    @Override
    public Disciplina Delete(int codigo) {
        Disciplina cod = this.Read(codigo);
        this.dataset.remove(cod);
        return cod;  
    }
}
