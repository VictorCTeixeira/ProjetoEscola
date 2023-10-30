package poo.projeto.Repositorio;

import poo.projeto.dominio.Professor;
import poo.projeto.FakeDB.ProfessorFakeDB;

public class ProfessorRepositorio extends BaseGenericaCRUD<ProfessorFakeDB, Professor>{

    public ProfessorRepositorio() {
        this.db = new ProfessorFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public Professor Create(Professor instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;  
    }

    @Override
    public Professor Read(int codigo) {
        for (Professor prof : this.dataset) {
            if (prof.getCodigo() == codigo)
                prof.toString();
        }
        return null;    
    }

    @Override
    public Professor Update(Professor instancia) {
        Professor prof = this.Read(instancia.getCodigo());
        prof.setCargo(instancia.getCargo());
        prof.setDataNascimento(instancia.getDataNascimento());
        prof.setNome(instancia.getNome());
        prof.setNomeUsuario(instancia.getNomeUsuario());
        prof.setSenha(instancia.getSenha());
        prof.setTurmas(instancia.getTurmas());
        return prof;
    }

    @Override
    public Professor Delete(int codigo) {
        Professor cod = this.Read(codigo);
        this.dataset.remove(cod);
        return cod;
    }
    
}
