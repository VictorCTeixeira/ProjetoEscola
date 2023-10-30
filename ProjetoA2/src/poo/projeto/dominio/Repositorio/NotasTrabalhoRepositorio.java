package poo.projeto.dominio.Repositorio;

import poo.projeto.dominio.NotaTrabalho;
import poo.projeto.dominio.FakeDB.NotasTrabalhoFakeDB;

public class NotasTrabalhoRepositorio extends BaseGenericaCRUD<NotasTrabalhoFakeDB, NotaTrabalho>{

    public NotasTrabalhoRepositorio() {
        this.db = new NotasTrabalhoFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public NotaTrabalho Create(NotaTrabalho instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;  
    }

    @Override
    public NotaTrabalho Read(int codigo) {
        for (NotaTrabalho trab : this.dataset) {
            if (trab.getCodigo() == codigo)
                trab.toString();
        }
        return null;    
    }

    @Override
    public NotaTrabalho Update(NotaTrabalho instancia) {
        NotaTrabalho trab = this.Read(instancia.getCodigo());
        trab.setAluno(instancia.getAluno());
        trab.setNota(instancia.getNota());
        trab.setTrabalho(instancia.getTrabalho());
        return trab;
    }

    @Override
    public NotaTrabalho Delete(int codigo) {
        NotaTrabalho cod = this.Read(codigo);
        this.dataset.remove(cod);
        return cod;
    }
    
}
