package poo.projeto.dominio;

public class Disciplina extends BaseDadosComuns{
    private String ementa;

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Disciplina(int codigo, String nome, String ementa) {
        super(codigo, nome);
        this.ementa = ementa;
    }

    @Override
    public String toString() {
        return "Disciplina [codigo = "+ codigo + "nome = "+ nome +"ementa=" + ementa + "]";
    }

    public void ListarDisciplina() {
        System.out.println();
    }
    
}
