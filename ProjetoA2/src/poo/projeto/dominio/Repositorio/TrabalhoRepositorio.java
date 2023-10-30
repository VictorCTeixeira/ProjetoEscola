package poo.projeto.dominio.Repositorio;

import poo.projeto.dominio.Trabalho;
import poo.projeto.dominio.FakeDB.TrabalhoFakeDB;

public class TrabalhoRepositorio extends BaseGenericaCRUD<TrabalhoFakeDB, Trabalho>{

    public TrabalhoRepositorio() {
        this.db = new TrabalhoFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public Trabalho Create(Trabalho instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Trabalho Read(int codigo) {
          for (Trabalho trab : this.dataset) {
            if (trab.getCodigo() == codigo)
                trab.toString();
        }
        return null;  
    }

    @Override
    public Trabalho Update(Trabalho instancia) {
        Trabalho trab = this.Read(instancia.getCodigo());
        trab.setDescricao(instancia.getDescricao());
        trab.setDisciplina(instancia.getDisciplina());
        return trab;
    }

    @Override
    public Trabalho Delete(int codigo) {
        Trabalho cod = this.Read(codigo);
        this.dataset.remove(cod);
        return cod;
    }
    
}
