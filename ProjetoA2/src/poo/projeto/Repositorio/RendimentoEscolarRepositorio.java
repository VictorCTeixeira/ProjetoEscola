package poo.projeto.Repositorio;

import poo.projeto.dominio.RendimentoEscolar;
import poo.projeto.FakeDB.RendimentoEscolarFakeDB;

public class RendimentoEscolarRepositorio extends BaseGenericaCRUD<RendimentoEscolarFakeDB, RendimentoEscolar> {

    public RendimentoEscolarRepositorio() {
        this.db = new RendimentoEscolarFakeDB();
        this.dataset = this.db.getLista();
    }

    @Override
    public RendimentoEscolar Create(RendimentoEscolar instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;  
    }

    @Override
    public RendimentoEscolar Read(int codigo) {
        for (RendimentoEscolar rendEsc : this.dataset) {
            if (rendEsc.getCodigo() == codigo)
                rendEsc.toString();
        }
        return null;    
    }

    @Override
    public RendimentoEscolar Update(RendimentoEscolar instancia) {
        RendimentoEscolar rend = this.Read(instancia.getCodigo());
        rend.setAluno(instancia.getAluno());
        rend.setMediaGeral(instancia.getMediaGeral());
        rend.setMediaTrabalhos(instancia.getMediaTrabalhos());
        rend.setNota1Prova(instancia.getNota1Prova());
        rend.setNota2Prova(instancia.getNota2Prova());
        rend.setTrabalhos(instancia.getTrabalhos());
        rend.setTurma(instancia.getTurma());
        return rend;
    }

    @Override
    public RendimentoEscolar Delete(int codigo) {
        RendimentoEscolar cod = this.Read(codigo);
        this.dataset.remove(cod);
        return cod;
    }
    
}
