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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }

    @Override
    public Trabalho Read(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Read'");
    }

    @Override
    public Trabalho Update(Trabalho instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public Trabalho Delete(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
    
}
