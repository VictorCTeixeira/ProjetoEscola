package poo.projeto.dominio.Repositorio;

import poo.projeto.dominio.Aluno;
import poo.projeto.dominio.Professor;
import poo.projeto.dominio.FakeDB.ProfessorFakeDB;

public class ProfessorRepositorio extends BaseGenericaCRUD<ProfessorFakeDB, Professor>{

    public ProfessorRepositorio() {
        this.db = new ProfessorFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public Professor Create(Professor instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }

    @Override
    public Professor Read(int codigo) {
          for (Professor prof : this.dataset) {
            if (prof.getCodigo() == codigo)
                prof.Imprimir();
        }
        return null;    
    }

    @Override
    public Professor Update(Professor instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public Professor Delete(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
    
}
