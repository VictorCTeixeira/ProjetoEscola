package poo.projeto.dominio.Repositorio;

import poo.projeto.dominio.Aluno;
import poo.projeto.dominio.FakeDB.AlunoFakeDB;

public class AlunoRepositorio extends BaseGenericaCRUD<AlunoFakeDB, Aluno>{

    public AlunoRepositorio() {
        this.db = new AlunoFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public Aluno Create(Aluno instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }

    @Override
    public Aluno Read(int codigo) {
        for (Aluno aluno : this.dataset) {
            if (aluno.getCodigo() == codigo)
                aluno.Imprimir();
        }
        return null;    
    }

    @Override
    public Aluno Update(Aluno instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public Aluno Delete(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
    
}
