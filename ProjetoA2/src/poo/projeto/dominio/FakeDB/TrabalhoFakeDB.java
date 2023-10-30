package poo.projeto.dominio.FakeDB;
import java.util.ArrayList;
import poo.projeto.dominio.*;

public class TrabalhoFakeDB extends BaseGenericaFakeDB <Trabalho> { // 300 - 399
    private DisciplinaFakeDB disciplinas = new DisciplinaFakeDB();
    private ArrayList<Disciplina> listaDisciplinas = disciplinas.getLista();

    @Override
    protected void CarregarDados() {

        this.lista.add(new Trabalho(301, listaDisciplinas.get(0), "Trabalho 1 Matemática"));
        this.lista.add(new Trabalho(302, listaDisciplinas.get(0), "Trabalho 2 Matemática"));
        this.lista.add(new Trabalho(303, listaDisciplinas.get(0), "Trabalho 3 Matemática"));
        this.lista.add(new Trabalho(304, listaDisciplinas.get(0), "Trabalho 4 Matemática"));
        this.lista.add(new Trabalho(305, listaDisciplinas.get(1), "Trabalho 1 Portugues"));
        this.lista.add(new Trabalho(306, listaDisciplinas.get(1), "Trabalho 2 Portugues"));
        this.lista.add(new Trabalho(307, listaDisciplinas.get(1), "Trabalho 3 Portugues"));
        this.lista.add(new Trabalho(308, listaDisciplinas.get(1), "Trabalho 4 Portugues"));
        this.lista.add(new Trabalho(309, listaDisciplinas.get(2), "Trabalho 1 Educação Física"));
        this.lista.add(new Trabalho(310, listaDisciplinas.get(2), "Trabalho 2 Educação Física"));
        this.lista.add(new Trabalho(311, listaDisciplinas.get(2), "Trabalho 3 Educaçãoo Física"));
        this.lista.add(new Trabalho(312, listaDisciplinas.get(2), "Trabalho 4 Educação Física"));
        this.lista.add(new Trabalho(313, listaDisciplinas.get(3), "Trabalho 1 Geografia"));
        this.lista.add(new Trabalho(314, listaDisciplinas.get(3), "Trabalho 2 Geografia"));
        this.lista.add(new Trabalho(315, listaDisciplinas.get(3), "Trabalho 3 Geografia"));
        this.lista.add(new Trabalho(316, listaDisciplinas.get(3), "Trabalho 4 Geografia"));
        this.lista.add(new Trabalho(317, listaDisciplinas.get(4), "Trabalho 1 História"));
        this.lista.add(new Trabalho(318, listaDisciplinas.get(4), "Trabalho 2 História"));
        this.lista.add(new Trabalho(319, listaDisciplinas.get(4), "Trabalho 3 História"));
        this.lista.add(new Trabalho(320, listaDisciplinas.get(4), "Trabalho 4 História"));
        this.lista.add(new Trabalho(321, listaDisciplinas.get(5), "Trabalho 1 Biologia"));
        this.lista.add(new Trabalho(322, listaDisciplinas.get(5), "Trabalho 2 Biologia"));
        this.lista.add(new Trabalho(323, listaDisciplinas.get(5), "Trabalho 3 Biologia"));
        this.lista.add(new Trabalho(324, listaDisciplinas.get(5), "Trabalho 4 Biologia"));
        this.lista.add(new Trabalho(325, listaDisciplinas.get(6), "Trabalho 1 Física"));
        this.lista.add(new Trabalho(326, listaDisciplinas.get(6), "Trabalho 2 Física"));
        this.lista.add(new Trabalho(327, listaDisciplinas.get(6), "Trabalho 3 Física"));
        this.lista.add(new Trabalho(328, listaDisciplinas.get(6), "Trabalho 4 Física"));
        this.lista.add(new Trabalho(329, listaDisciplinas.get(7), "Trabalho 1 Química"));
        this.lista.add(new Trabalho(330, listaDisciplinas.get(7), "Trabalho 2 Química"));
        this.lista.add(new Trabalho(331, listaDisciplinas.get(7), "Trabalho 3 Química"));
        this.lista.add(new Trabalho(332, listaDisciplinas.get(7), "Trabalho 4 Química"));
        this.lista.add(new Trabalho(333, listaDisciplinas.get(8), "Trabalho 1 Inglês"));
        this.lista.add(new Trabalho(334, listaDisciplinas.get(8), "Trabalho 2 Inglês"));
        this.lista.add(new Trabalho(335, listaDisciplinas.get(8), "Trabalho 3 Inglês"));
        this.lista.add(new Trabalho(336, listaDisciplinas.get(8), "Trabalho 4 Inglês"));
        this.lista.add(new Trabalho(337, listaDisciplinas.get(9), "Trabalho 1 Espanhol"));
        this.lista.add(new Trabalho(338, listaDisciplinas.get(9), "Trabalho 2 Espanhol"));
        this.lista.add(new Trabalho(339, listaDisciplinas.get(9), "Trabalho 3 Espanhol"));
        this.lista.add(new Trabalho(340, listaDisciplinas.get(9), "Trabalho 4 Espanhol"));
        this.lista.add(new Trabalho(341, listaDisciplinas.get(10), "Trabalho 1 Filosofia"));
        this.lista.add(new Trabalho(342, listaDisciplinas.get(10), "Trabalho 2 Filosofia"));
        this.lista.add(new Trabalho(343, listaDisciplinas.get(10), "Trabalho 3 Filosofia"));
        this.lista.add(new Trabalho(344, listaDisciplinas.get(10), "Trabalho 4 Filosofia"));
        this.lista.add(new Trabalho(345, listaDisciplinas.get(11), "Trabalho 1 Sociologia"));
        this.lista.add(new Trabalho(346, listaDisciplinas.get(11), "Trabalho 2 Sociologia"));
        this.lista.add(new Trabalho(347, listaDisciplinas.get(11), "Trabalho 3 Sociologia"));
        this.lista.add(new Trabalho(348, listaDisciplinas.get(11), "Trabalho 4 Sociologia"));
    }

    public TrabalhoFakeDB() {
        super();
    }
    
    
}
