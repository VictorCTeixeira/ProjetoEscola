package poo.projeto.FakeDB;
import poo.projeto.dominio.*;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina>{
    @Override
    protected void CarregarDados() {//200 - 299 -> Disciplinas
        this.lista.add(new Disciplina(201, "Matemática", "Ensinar para o aluno as operações fundamentais envolvendo numeros, tais como: soma, subtração, divisão, multiplicação, equações, entre outros"));
        this.lista.add(new Disciplina(202, "Português", "Ensinar as principais regras e aplicações da língua portuguesa"));
        this.lista.add(new Disciplina(203, "Educação Física", "Aprender a história dos principais esportes praticados no mundo, além de praticá-los"));
        this.lista.add(new Disciplina(204, "Geografia", "Ensinar sobre as relações internacionais, relevo, qualidade do solo, entre outros"));
        this.lista.add(new Disciplina(205, "História", "Ensinar a história do mundo, desde a antiguidade até os tempos atuais"));
        this.lista.add(new Disciplina(206, "Biologia", "Ensinar sobre a natureza e suas características, desde o ecossistema até os organismos"));
        this.lista.add(new Disciplina(207, "Física", "Aprender as principais leis da física, cinemática, eletricidade, entre outros"));
        this.lista.add(new Disciplina(208, "Química", "Ensinar sobre os principais elementos químicos e suas reações"));
        this.lista.add(new Disciplina(209, "Inglês", "Ensinar as principais palavras e verbos no inglês, além de ensinar a comunicação nessa língua"));
        this.lista.add(new Disciplina(210, "Espanhol", "Ensinar sobre as principais palavras em espanhol, além de seus verbos, facilitando a comunicação nessa língua"));
        this.lista.add(new Disciplina(211, "Filosofia", "Ensinar sobre a história da filosofia, além dos principais pensadores e seus ideais"));
        this.lista.add(new Disciplina(212, "Sociologia", "Estudar sobre a sociedade, abrangendo seu funcionamento e suas interações"));
    }
    public DisciplinaFakeDB(){
        super();
    }
}
