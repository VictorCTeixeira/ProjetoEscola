package poo.projeto.Repositorio;

import poo.projeto.dominio.Aluno;
import poo.projeto.FakeDB.AlunoFakeDB;

public class AlunoRepositorio extends BaseGenericaCRUD<AlunoFakeDB, Aluno>{

    public AlunoRepositorio() {
        this.db = new AlunoFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public Aluno Create(Aluno instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Aluno Read(int codigo) {
        for (Aluno aluno : this.dataset) {
            if (aluno.getCodigo() == codigo)
                aluno.ListarTurmaAluno();
        }
        return null;    
    }

    @Override
    public Aluno Update(Aluno instancia) {
        Aluno cod = this.Read(instancia.getCodigo());
        cod.setDataNascimento(instancia.getDataNascimento());
        cod.setNome(instancia.getNome());
        cod.setNomeUsuario(instancia.getNomeUsuario());
        cod.setPeriodo(instancia.getPeriodo());
        cod.setRendimentoEscolar(instancia.getRendimentoEscolar());
        cod.setSenha(instancia.getSenha());
        cod.setTurma(instancia.getTurma());
        return cod;
    }

    @Override
    public Aluno Delete(int codigo) {
        Aluno cod = this.Read(codigo);
        this.dataset.remove(cod);
        return cod;
    }
}
