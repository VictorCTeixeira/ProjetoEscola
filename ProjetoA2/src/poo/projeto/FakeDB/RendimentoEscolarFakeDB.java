package poo.projeto.FakeDB;
import poo.projeto.dominio.*;
import java.util.ArrayList;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB <RendimentoEscolar>{ //800 - 900
    
    private AlunoFakeDB alunos = new AlunoFakeDB();
    private ArrayList<Aluno> listaAlunos = alunos.getLista();
    private NotasTrabalhoFakeDB trabalhos = new NotasTrabalhoFakeDB();
    private ArrayList<NotaTrabalho> listaTrabalhos = trabalhos.getLista();
    private TurmaFakeDB turmas = new TurmaFakeDB();
    private ArrayList<Turma> listaTurmas = turmas.getLista();

    private ArrayList<NotaTrabalho> notaAluno1D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno1D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno1D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno1D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno2D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno2D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno2D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno2D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno3D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno3D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno3D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno3D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno4D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno4D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno4D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno4D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno5D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno5D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno5D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno5D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno6D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno6D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno6D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno6D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno7D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno7D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno7D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno7D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno8D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno8D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno8D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno8D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno9D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno9D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno9D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno9D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno10D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno10D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno10D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno10D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno11D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno11D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno11D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno11D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno12D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno12D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno12D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno12D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno13D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno13D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno13D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno13D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno14D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno14D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno14D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno14D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno15D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno15D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno15D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno15D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno16D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno16D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno16D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno16D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno17D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno17D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno17D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno17D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno18D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno18D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno18D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno18D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno19D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno19D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno19D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno19D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno20D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno20D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno20D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno20D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno21D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno21D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno21D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno21D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno22D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno22D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno22D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno22D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno23D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno23D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno23D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno23D4 = new ArrayList<NotaTrabalho>();

    private ArrayList<NotaTrabalho> notaAluno24D1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno24D2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno24D3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno24D4 = new ArrayList<NotaTrabalho>();
    
    @Override
    protected void CarregarDados(){
       CarregarTrabalhos(); 
       this.lista.add(new RendimentoEscolar(801, listaAlunos.get(0), listaTurmas.get(0), 8.5, 7, notaAluno1D1));
       this.lista.add(new RendimentoEscolar(802, listaAlunos.get(0), listaTurmas.get(0), 4, 8, notaAluno1D2));
       this.lista.add(new RendimentoEscolar(803, listaAlunos.get(0), listaTurmas.get(0), 8, 9, notaAluno1D3));
       this.lista.add(new RendimentoEscolar(804, listaAlunos.get(0), listaTurmas.get(0), 8.2, 3.5, notaAluno1D4)); // Rendimento escolar Caio

       this.lista.add(new RendimentoEscolar(805, listaAlunos.get(1), listaTurmas.get(0), 8.75, 6.5, notaAluno2D1));
       this.lista.add(new RendimentoEscolar(806, listaAlunos.get(1), listaTurmas.get(0), 8.2, 3.5, notaAluno2D2));
       this.lista.add(new RendimentoEscolar(807, listaAlunos.get(1), listaTurmas.get(0), 3.2, 4.5, notaAluno2D3));
       this.lista.add(new RendimentoEscolar(808, listaAlunos.get(1), listaTurmas.get(0), 10, 9.5, notaAluno2D4)); // Rendimento escolar Fabricio

       this.lista.add(new RendimentoEscolar(809, listaAlunos.get(2), listaTurmas.get(0), 6, 7, notaAluno3D1));
       this.lista.add(new RendimentoEscolar(810, listaAlunos.get(2), listaTurmas.get(0), 8.4, 5.5, notaAluno3D2));
       this.lista.add(new RendimentoEscolar(811, listaAlunos.get(2), listaTurmas.get(0), 4.5, 10, notaAluno3D3));
       this.lista.add(new RendimentoEscolar(812, listaAlunos.get(2), listaTurmas.get(0), 5.7, 9, notaAluno3D4));// Rendimento escolar Fagner

       this.lista.add(new RendimentoEscolar(813, listaAlunos.get(3), listaTurmas.get(1), 4, 6, notaAluno4D1));
       this.lista.add(new RendimentoEscolar(814, listaAlunos.get(3), listaTurmas.get(1), 8, 2, notaAluno4D2));
       this.lista.add(new RendimentoEscolar(815, listaAlunos.get(3), listaTurmas.get(1), 0, 6.5, notaAluno4D3));
       this.lista.add(new RendimentoEscolar(816, listaAlunos.get(3), listaTurmas.get(1), 9, 2, notaAluno4D4)); // Rendimento escolar Gabriel

       this.lista.add(new RendimentoEscolar(817, listaAlunos.get(4), listaTurmas.get(1), 3.3, 9, notaAluno5D1));
       this.lista.add(new RendimentoEscolar(818, listaAlunos.get(4), listaTurmas.get(1), 9.5, 10, notaAluno5D2));
       this.lista.add(new RendimentoEscolar(819, listaAlunos.get(4), listaTurmas.get(1), 7, 8, notaAluno5D3));
       this.lista.add(new RendimentoEscolar(820, listaAlunos.get(4), listaTurmas.get(1), 8.5, 9, notaAluno5D4)); // Rendimento escolar Felipe
       
       this.lista.add(new RendimentoEscolar(821, listaAlunos.get(5), listaTurmas.get(1), 4, 3, notaAluno6D1));
       this.lista.add(new RendimentoEscolar(822, listaAlunos.get(5), listaTurmas.get(1), 9, 7, notaAluno6D2));
       this.lista.add(new RendimentoEscolar(823, listaAlunos.get(5), listaTurmas.get(1), 6, 1, notaAluno6D3));
       this.lista.add(new RendimentoEscolar(824, listaAlunos.get(5), listaTurmas.get(1), 9, 4, notaAluno6D4)); // Rendimento escolar Fernando

       this.lista.add(new RendimentoEscolar(825, listaAlunos.get(6), listaTurmas.get(2), 6.6, 7, notaAluno7D1));
       this.lista.add(new RendimentoEscolar(826, listaAlunos.get(6), listaTurmas.get(2), 9, 6, notaAluno7D2));
       this.lista.add(new RendimentoEscolar(827, listaAlunos.get(6), listaTurmas.get(2), 3, 10, notaAluno7D3));
       this.lista.add(new RendimentoEscolar(828, listaAlunos.get(6), listaTurmas.get(2), 10, 4, notaAluno7D4)); // Rendimento escolar Henrique

       this.lista.add(new RendimentoEscolar(829, listaAlunos.get(7), listaTurmas.get(2), 3.2, 7, notaAluno8D1));
       this.lista.add(new RendimentoEscolar(830, listaAlunos.get(7), listaTurmas.get(2), 7.6, 5.9, notaAluno8D2));
       this.lista.add(new RendimentoEscolar(831, listaAlunos.get(7), listaTurmas.get(2), 6, 7, notaAluno8D3));
       this.lista.add(new RendimentoEscolar(832, listaAlunos.get(7), listaTurmas.get(2), 10, 10, notaAluno8D4)); // Rendimento escolar Bruno

       this.lista.add(new RendimentoEscolar(833, listaAlunos.get(8), listaTurmas.get(2), 9, 8, notaAluno9D1));
       this.lista.add(new RendimentoEscolar(834, listaAlunos.get(8), listaTurmas.get(2), 7, 6, notaAluno9D2));
       this.lista.add(new RendimentoEscolar(835, listaAlunos.get(8), listaTurmas.get(2), 5, 10, notaAluno9D3));
       this.lista.add(new RendimentoEscolar(836, listaAlunos.get(8), listaTurmas.get(2), 9, 10, notaAluno9D4)); // Rendimento escolar Giorgian
       
       this.lista.add(new RendimentoEscolar(837, listaAlunos.get(9), listaTurmas.get(3), 9, 9.3, notaAluno10D1));
       this.lista.add(new RendimentoEscolar(838, listaAlunos.get(9), listaTurmas.get(3), 8, 9, notaAluno10D2));
       this.lista.add(new RendimentoEscolar(839, listaAlunos.get(9), listaTurmas.get(3), 7, 8, notaAluno10D3));
       this.lista.add(new RendimentoEscolar(840, listaAlunos.get(9), listaTurmas.get(3), 6, 10, notaAluno10D4)); // Rendimento escolar Gerson

       this.lista.add(new RendimentoEscolar(841, listaAlunos.get(10), listaTurmas.get(3), 8, 7, notaAluno11D1));
       this.lista.add(new RendimentoEscolar(842, listaAlunos.get(10), listaTurmas.get(3), 3, 9, notaAluno11D2));
       this.lista.add(new RendimentoEscolar(843, listaAlunos.get(10), listaTurmas.get(3), 8, 7, notaAluno11D3));
       this.lista.add(new RendimentoEscolar(844, listaAlunos.get(10), listaTurmas.get(3), 7, 9, notaAluno11D4)); // Rendimento escolar Piquerez

       this.lista.add(new RendimentoEscolar(845, listaAlunos.get(11), listaTurmas.get(3), 10, 9, notaAluno12D1));
       this.lista.add(new RendimentoEscolar(846, listaAlunos.get(11), listaTurmas.get(3), 8.5, 7.8, notaAluno12D2));
       this.lista.add(new RendimentoEscolar(847, listaAlunos.get(11), listaTurmas.get(3), 7, 10, notaAluno12D3));
       this.lista.add(new RendimentoEscolar(848, listaAlunos.get(11), listaTurmas.get(3), 7, 6, notaAluno12D4)); // Rendimento escolar Rony

       this.lista.add(new RendimentoEscolar(849, listaAlunos.get(12), listaTurmas.get(4), 8, 7, notaAluno13D1));
       this.lista.add(new RendimentoEscolar(850, listaAlunos.get(12), listaTurmas.get(4), 6, 6.5,notaAluno13D2));
       this.lista.add(new RendimentoEscolar(851, listaAlunos.get(12), listaTurmas.get(4), 5, 8, notaAluno13D3));
       this.lista.add(new RendimentoEscolar(852, listaAlunos.get(12), listaTurmas.get(4), 9, 8, notaAluno13D4)); // Rendimento escolar Victor

       this.lista.add(new RendimentoEscolar(853, listaAlunos.get(13), listaTurmas.get(4), 4, 5, notaAluno14D1));
       this.lista.add(new RendimentoEscolar(854, listaAlunos.get(13), listaTurmas.get(4), 6, 7, notaAluno14D2));
       this.lista.add(new RendimentoEscolar(855, listaAlunos.get(13), listaTurmas.get(4), 5, 5, notaAluno14D3));
       this.lista.add(new RendimentoEscolar(856, listaAlunos.get(13), listaTurmas.get(4), 3, 4, notaAluno14D4)); // Rendimento escolar  Diogo

       this.lista.add(new RendimentoEscolar(857, listaAlunos.get(14), listaTurmas.get(4), 5, 8, notaAluno15D1));
       this.lista.add(new RendimentoEscolar(858, listaAlunos.get(14), listaTurmas.get(4), 9, 9, notaAluno15D2));
       this.lista.add(new RendimentoEscolar(859, listaAlunos.get(14), listaTurmas.get(4), 8, 7, notaAluno15D3));
       this.lista.add(new RendimentoEscolar(860, listaAlunos.get(14), listaTurmas.get(4), 10, 7, notaAluno15D4)); // Rendimento escolar Guilherme

       this.lista.add(new RendimentoEscolar(861, listaAlunos.get(15), listaTurmas.get(5), 8, 7, notaAluno16D1));
       this.lista.add(new RendimentoEscolar(862, listaAlunos.get(15), listaTurmas.get(5), 5, 6, notaAluno16D2));
       this.lista.add(new RendimentoEscolar(863, listaAlunos.get(15), listaTurmas.get(5), 9, 8, notaAluno16D3));
       this.lista.add(new RendimentoEscolar(864, listaAlunos.get(15), listaTurmas.get(5), 3, 5, notaAluno16D4)); // Rendimento escolar Daniel

       this.lista.add(new RendimentoEscolar(865, listaAlunos.get(16), listaTurmas.get(5), 10, 10, notaAluno17D1));
       this.lista.add(new RendimentoEscolar(866, listaAlunos.get(16), listaTurmas.get(5), 9.8, 8, notaAluno17D2));
       this.lista.add(new RendimentoEscolar(867, listaAlunos.get(16), listaTurmas.get(5), 8, 7, notaAluno17D3));
       this.lista.add(new RendimentoEscolar(868, listaAlunos.get(16), listaTurmas.get(5), 19, 10, notaAluno17D4)); // Rendimento escolar Igor

       this.lista.add(new RendimentoEscolar(869, listaAlunos.get(17), listaTurmas.get(5), 9, 10, notaAluno18D1));
       this.lista.add(new RendimentoEscolar(870, listaAlunos.get(17), listaTurmas.get(5), 10, 9, notaAluno18D2));
       this.lista.add(new RendimentoEscolar(871, listaAlunos.get(17), listaTurmas.get(5), 8.7, 9, notaAluno18D3));
       this.lista.add(new RendimentoEscolar(872, listaAlunos.get(17), listaTurmas.get(5), 9, 9.5, notaAluno18D4)); // Rendimento escolar Roberto

       this.lista.add(new RendimentoEscolar(873, listaAlunos.get(18), listaTurmas.get(6), 3, 3.5, notaAluno19D1));
       this.lista.add(new RendimentoEscolar(874, listaAlunos.get(18), listaTurmas.get(6), 4, 5, notaAluno19D2));
       this.lista.add(new RendimentoEscolar(875, listaAlunos.get(18), listaTurmas.get(6), 6, 7, notaAluno19D3));
       this.lista.add(new RendimentoEscolar(876, listaAlunos.get(18), listaTurmas.get(6), 8, 3.9, notaAluno19D4)); // Rendimento escolar Cruz

       this.lista.add(new RendimentoEscolar(877, listaAlunos.get(19), listaTurmas.get(6), 7, 7, notaAluno20D1));
       this.lista.add(new RendimentoEscolar(878, listaAlunos.get(19), listaTurmas.get(6), 8, 6, notaAluno20D2));
       this.lista.add(new RendimentoEscolar(879, listaAlunos.get(19), listaTurmas.get(6), 6, 5, notaAluno20D3));
       this.lista.add(new RendimentoEscolar(880, listaAlunos.get(19), listaTurmas.get(6), 9, 10, notaAluno20D4)); // Rendimento escolar Jackson

       this.lista.add(new RendimentoEscolar(881, listaAlunos.get(20), listaTurmas.get(6), 9, 10, notaAluno21D1));
       this.lista.add(new RendimentoEscolar(882, listaAlunos.get(20), listaTurmas.get(6), 10, 10, notaAluno21D2));
       this.lista.add(new RendimentoEscolar(883, listaAlunos.get(20), listaTurmas.get(6), 10, 10, notaAluno21D3));
       this.lista.add(new RendimentoEscolar(884, listaAlunos.get(20), listaTurmas.get(6), 9.7, 8, notaAluno21D4)); // Rendimento escolar Doc

       this.lista.add(new RendimentoEscolar(885, listaAlunos.get(21), listaTurmas.get(7), 8, 7, notaAluno22D1));
       this.lista.add(new RendimentoEscolar(886, listaAlunos.get(21), listaTurmas.get(7), 6, 9, notaAluno22D2));
       this.lista.add(new RendimentoEscolar(887, listaAlunos.get(21), listaTurmas.get(7), 10, 5, notaAluno22D3));
       this.lista.add(new RendimentoEscolar(888, listaAlunos.get(21), listaTurmas.get(7), 5, 9.6, notaAluno22D4)); // Rendimento escolar Fabricio

       this.lista.add(new RendimentoEscolar(889, listaAlunos.get(22), listaTurmas.get(7), 5, 7, notaAluno23D1));
       this.lista.add(new RendimentoEscolar(890, listaAlunos.get(22), listaTurmas.get(7), 6, 6, notaAluno23D2));
       this.lista.add(new RendimentoEscolar(891, listaAlunos.get(22), listaTurmas.get(7), 4, 10, notaAluno23D3));
       this.lista.add(new RendimentoEscolar(892, listaAlunos.get(22), listaTurmas.get(7), 8.7, 9, notaAluno23D4)); // Rendimento escolar Everton

       this.lista.add(new RendimentoEscolar(893, listaAlunos.get(23), listaTurmas.get(7), 10, 10, notaAluno24D1));
       this.lista.add(new RendimentoEscolar(894, listaAlunos.get(23), listaTurmas.get(7), 10, 10, notaAluno24D2));
       this.lista.add(new RendimentoEscolar(895, listaAlunos.get(23), listaTurmas.get(7), 9.8, 9, notaAluno24D3));
       this.lista.add(new RendimentoEscolar(896, listaAlunos.get(23), listaTurmas.get(7), 10, 10, notaAluno24D4)); // Rendimento escolar Hemerson
    }

    public void CarregarTrabalhos(){
        this.notaAluno1D1.add(listaTrabalhos.get(0));
        this.notaAluno1D1.add(listaTrabalhos.get(1));
        this.notaAluno1D1.add(listaTrabalhos.get(2));
        this.notaAluno1D1.add(listaTrabalhos.get(3));
        this.notaAluno1D2.add(listaTrabalhos.get(4));
        this.notaAluno1D2.add(listaTrabalhos.get(5));
        this.notaAluno1D2.add(listaTrabalhos.get(6));
        this.notaAluno1D2.add(listaTrabalhos.get(7));
        this.notaAluno1D3.add(listaTrabalhos.get(8));
        this.notaAluno1D3.add(listaTrabalhos.get(9));
        this.notaAluno1D3.add(listaTrabalhos.get(10));
        this.notaAluno1D3.add(listaTrabalhos.get(11));
        this.notaAluno1D4.add(listaTrabalhos.get(12));
        this.notaAluno1D4.add(listaTrabalhos.get(13));
        this.notaAluno1D4.add(listaTrabalhos.get(14)); // caio

        this.notaAluno2D1.add(listaTrabalhos.get(15));
        this.notaAluno2D1.add(listaTrabalhos.get(16));
        this.notaAluno2D1.add(listaTrabalhos.get(17));
        this.notaAluno2D1.add(listaTrabalhos.get(18));
        this.notaAluno2D2.add(listaTrabalhos.get(19));
        this.notaAluno2D2.add(listaTrabalhos.get(20));
        this.notaAluno2D2.add(listaTrabalhos.get(21));
        this.notaAluno2D2.add(listaTrabalhos.get(22));
        this.notaAluno2D3.add(listaTrabalhos.get(23));
        this.notaAluno2D3.add(listaTrabalhos.get(24));
        this.notaAluno2D3.add(listaTrabalhos.get(25));
        this.notaAluno2D3.add(listaTrabalhos.get(26));
        this.notaAluno2D4.add(listaTrabalhos.get(27));
        this.notaAluno2D4.add(listaTrabalhos.get(28));
        this.notaAluno2D4.add(listaTrabalhos.get(29));
        this.notaAluno2D4.add(listaTrabalhos.get(30)); // Fabricio

        this.notaAluno3D1.add(listaTrabalhos.get(31));
        this.notaAluno3D1.add(listaTrabalhos.get(32));
        this.notaAluno3D1.add(listaTrabalhos.get(33));
        this.notaAluno3D1.add(listaTrabalhos.get(34));
        this.notaAluno3D2.add(listaTrabalhos.get(35));
        this.notaAluno3D2.add(listaTrabalhos.get(36));
        this.notaAluno3D2.add(listaTrabalhos.get(37));
        this.notaAluno3D2.add(listaTrabalhos.get(38));
        this.notaAluno3D3.add(listaTrabalhos.get(39));
        this.notaAluno3D3.add(listaTrabalhos.get(40));
        this.notaAluno3D3.add(listaTrabalhos.get(41));
        this.notaAluno3D3.add(listaTrabalhos.get(42));
        this.notaAluno3D4.add(listaTrabalhos.get(43));
        this.notaAluno3D4.add(listaTrabalhos.get(44));
        this.notaAluno3D4.add(listaTrabalhos.get(45));
        this.notaAluno3D4.add(listaTrabalhos.get(46)); // Fagner

        this.notaAluno4D1.add(listaTrabalhos.get(47));
        this.notaAluno4D1.add(listaTrabalhos.get(48));
        this.notaAluno4D1.add(listaTrabalhos.get(49));
        this.notaAluno4D1.add(listaTrabalhos.get(50));
        this.notaAluno4D2.add(listaTrabalhos.get(51));
        this.notaAluno4D2.add(listaTrabalhos.get(52));
        this.notaAluno4D2.add(listaTrabalhos.get(53));
        this.notaAluno4D2.add(listaTrabalhos.get(54));
        this.notaAluno4D3.add(listaTrabalhos.get(55));
        this.notaAluno4D3.add(listaTrabalhos.get(56));
        this.notaAluno4D3.add(listaTrabalhos.get(57));
        this.notaAluno4D3.add(listaTrabalhos.get(58));
        this.notaAluno4D4.add(listaTrabalhos.get(59));
        this.notaAluno4D4.add(listaTrabalhos.get(60));
        this.notaAluno4D4.add(listaTrabalhos.get(61));
        this.notaAluno4D4.add(listaTrabalhos.get(62)); // Gabriel

        this.notaAluno5D1.add(listaTrabalhos.get(63));
        this.notaAluno5D1.add(listaTrabalhos.get(64));
        this.notaAluno5D1.add(listaTrabalhos.get(65));
        this.notaAluno5D1.add(listaTrabalhos.get(66));
        this.notaAluno5D2.add(listaTrabalhos.get(67));
        this.notaAluno5D2.add(listaTrabalhos.get(68));
        this.notaAluno5D2.add(listaTrabalhos.get(69));
        this.notaAluno5D2.add(listaTrabalhos.get(70));
        this.notaAluno5D3.add(listaTrabalhos.get(71));
        this.notaAluno5D3.add(listaTrabalhos.get(72));
        this.notaAluno5D3.add(listaTrabalhos.get(73));
        this.notaAluno5D3.add(listaTrabalhos.get(74));
        this.notaAluno5D4.add(listaTrabalhos.get(75));
        this.notaAluno5D4.add(listaTrabalhos.get(76));
        this.notaAluno5D4.add(listaTrabalhos.get(77));
        this.notaAluno5D4.add(listaTrabalhos.get(78)); // Felipe

        this.notaAluno6D1.add(listaTrabalhos.get(79));
        this.notaAluno6D1.add(listaTrabalhos.get(80));
        this.notaAluno6D1.add(listaTrabalhos.get(81));
        this.notaAluno6D1.add(listaTrabalhos.get(82));
        this.notaAluno6D2.add(listaTrabalhos.get(83));
        this.notaAluno6D2.add(listaTrabalhos.get(84));
        this.notaAluno6D2.add(listaTrabalhos.get(85));
        this.notaAluno6D2.add(listaTrabalhos.get(86));
        this.notaAluno6D3.add(listaTrabalhos.get(87));
        this.notaAluno6D3.add(listaTrabalhos.get(88));
        this.notaAluno6D3.add(listaTrabalhos.get(89));
        this.notaAluno6D3.add(listaTrabalhos.get(90));
        this.notaAluno6D4.add(listaTrabalhos.get(91));
        this.notaAluno6D4.add(listaTrabalhos.get(92));
        this.notaAluno6D4.add(listaTrabalhos.get(93));
        this.notaAluno6D4.add(listaTrabalhos.get(94)); //Fernando

        this.notaAluno7D1.add(listaTrabalhos.get(95));
        this.notaAluno7D1.add(listaTrabalhos.get(96)); 
        this.notaAluno7D1.add(listaTrabalhos.get(97)); 
        this.notaAluno7D1.add(listaTrabalhos.get(98)); 
        this.notaAluno7D2.add(listaTrabalhos.get(99)); 
        this.notaAluno7D2.add(listaTrabalhos.get(100)); 
        this.notaAluno7D2.add(listaTrabalhos.get(101)); 
        this.notaAluno7D2.add(listaTrabalhos.get(102)); 
        this.notaAluno7D3.add(listaTrabalhos.get(103)); 
        this.notaAluno7D3.add(listaTrabalhos.get(104)); 
        this.notaAluno7D3.add(listaTrabalhos.get(105)); 
        this.notaAluno7D3.add(listaTrabalhos.get(106)); 
        this.notaAluno7D4.add(listaTrabalhos.get(107)); 
        this.notaAluno7D4.add(listaTrabalhos.get(108)); 
        this.notaAluno7D4.add(listaTrabalhos.get(109)); 
        this.notaAluno7D4.add(listaTrabalhos.get(110)); // Henrique
        
        this.notaAluno8D1.add(listaTrabalhos.get(111));
        this.notaAluno8D1.add(listaTrabalhos.get(112));
        this.notaAluno8D1.add(listaTrabalhos.get(113));
        this.notaAluno8D1.add(listaTrabalhos.get(114));
        this.notaAluno8D2.add(listaTrabalhos.get(115));
        this.notaAluno8D2.add(listaTrabalhos.get(116));
        this.notaAluno8D2.add(listaTrabalhos.get(117));
        this.notaAluno8D2.add(listaTrabalhos.get(118));
        this.notaAluno8D3.add(listaTrabalhos.get(119));
        this.notaAluno8D3.add(listaTrabalhos.get(120));
        this.notaAluno8D3.add(listaTrabalhos.get(121));
        this.notaAluno8D3.add(listaTrabalhos.get(122));
        this.notaAluno8D4.add(listaTrabalhos.get(123));
        this.notaAluno8D4.add(listaTrabalhos.get(124));
        this.notaAluno8D4.add(listaTrabalhos.get(125));
        this.notaAluno8D4.add(listaTrabalhos.get(126)); // Bruno

        this.notaAluno9D1.add(listaTrabalhos.get(127));
        this.notaAluno9D1.add(listaTrabalhos.get(128));
        this.notaAluno9D1.add(listaTrabalhos.get(129));
        this.notaAluno9D1.add(listaTrabalhos.get(130));
        this.notaAluno9D2.add(listaTrabalhos.get(131));
        this.notaAluno9D2.add(listaTrabalhos.get(132));
        this.notaAluno9D2.add(listaTrabalhos.get(133));
        this.notaAluno9D2.add(listaTrabalhos.get(134));
        this.notaAluno9D3.add(listaTrabalhos.get(135));
        this.notaAluno9D3.add(listaTrabalhos.get(136));
        this.notaAluno9D3.add(listaTrabalhos.get(137));
        this.notaAluno9D3.add(listaTrabalhos.get(138));
        this.notaAluno9D4.add(listaTrabalhos.get(139));
        this.notaAluno9D4.add(listaTrabalhos.get(140));
        this.notaAluno9D4.add(listaTrabalhos.get(141));
        this.notaAluno9D4.add(listaTrabalhos.get(142)); // Giorgian

        this.notaAluno10D1.add(listaTrabalhos.get(143));
        this.notaAluno10D1.add(listaTrabalhos.get(144));
        this.notaAluno10D1.add(listaTrabalhos.get(145));
        this.notaAluno10D1.add(listaTrabalhos.get(146));
        this.notaAluno10D2.add(listaTrabalhos.get(147));
        this.notaAluno10D2.add(listaTrabalhos.get(148));
        this.notaAluno10D2.add(listaTrabalhos.get(149));
        this.notaAluno10D2.add(listaTrabalhos.get(150));
        this.notaAluno10D3.add(listaTrabalhos.get(151));
        this.notaAluno10D3.add(listaTrabalhos.get(152));
        this.notaAluno10D3.add(listaTrabalhos.get(153));
        this.notaAluno10D3.add(listaTrabalhos.get(154));
        this.notaAluno10D4.add(listaTrabalhos.get(155));
        this.notaAluno10D4.add(listaTrabalhos.get(156));
        this.notaAluno10D4.add(listaTrabalhos.get(157));
        this.notaAluno10D4.add(listaTrabalhos.get(158)); //Gerson

        this.notaAluno11D1.add(listaTrabalhos.get(159));
        this.notaAluno11D1.add(listaTrabalhos.get(160));
        this.notaAluno11D1.add(listaTrabalhos.get(161));
        this.notaAluno11D1.add(listaTrabalhos.get(162));
        this.notaAluno11D2.add(listaTrabalhos.get(163));
        this.notaAluno11D2.add(listaTrabalhos.get(164));
        this.notaAluno11D2.add(listaTrabalhos.get(165));
        this.notaAluno11D2.add(listaTrabalhos.get(166));
        this.notaAluno11D3.add(listaTrabalhos.get(167));
        this.notaAluno11D3.add(listaTrabalhos.get(168));
        this.notaAluno11D3.add(listaTrabalhos.get(169));
        this.notaAluno11D3.add(listaTrabalhos.get(170));
        this.notaAluno11D4.add(listaTrabalhos.get(171));
        this.notaAluno11D4.add(listaTrabalhos.get(172));
        this.notaAluno11D4.add(listaTrabalhos.get(173));
        this.notaAluno11D4.add(listaTrabalhos.get(174)); // Piquerez

        this.notaAluno12D1.add(listaTrabalhos.get(175));
        this.notaAluno12D1.add(listaTrabalhos.get(176));
        this.notaAluno12D1.add(listaTrabalhos.get(177));
        this.notaAluno12D1.add(listaTrabalhos.get(178));
        this.notaAluno12D2.add(listaTrabalhos.get(179));
        this.notaAluno12D2.add(listaTrabalhos.get(180));
        this.notaAluno12D2.add(listaTrabalhos.get(181));
        this.notaAluno12D2.add(listaTrabalhos.get(182));
        this.notaAluno12D3.add(listaTrabalhos.get(183));
        this.notaAluno12D3.add(listaTrabalhos.get(184));
        this.notaAluno12D3.add(listaTrabalhos.get(185));
        this.notaAluno12D3.add(listaTrabalhos.get(186));
        this.notaAluno12D4.add(listaTrabalhos.get(187));
        this.notaAluno12D4.add(listaTrabalhos.get(188));
        this.notaAluno12D4.add(listaTrabalhos.get(189));
        this.notaAluno12D4.add(listaTrabalhos.get(190)); // Rony


        this.notaAluno13D1.add(listaTrabalhos.get(191));
        this.notaAluno13D1.add(listaTrabalhos.get(192));
        this.notaAluno13D1.add(listaTrabalhos.get(193));
        this.notaAluno13D1.add(listaTrabalhos.get(194));
        this.notaAluno13D2.add(listaTrabalhos.get(195));
        this.notaAluno13D2.add(listaTrabalhos.get(196));
        this.notaAluno13D2.add(listaTrabalhos.get(197));
        this.notaAluno13D2.add(listaTrabalhos.get(198));
        this.notaAluno13D3.add(listaTrabalhos.get(199));
        this.notaAluno13D3.add(listaTrabalhos.get(200));
        this.notaAluno13D3.add(listaTrabalhos.get(201));
        this.notaAluno13D3.add(listaTrabalhos.get(202));
        this.notaAluno13D4.add(listaTrabalhos.get(203));
        this.notaAluno13D4.add(listaTrabalhos.get(204));
        this.notaAluno13D4.add(listaTrabalhos.get(205));
        this.notaAluno13D4.add(listaTrabalhos.get(206)); // Victor

        this.notaAluno14D1.add(listaTrabalhos.get(207));
        this.notaAluno14D1.add(listaTrabalhos.get(208));
        this.notaAluno14D1.add(listaTrabalhos.get(209));
        this.notaAluno14D1.add(listaTrabalhos.get(210));
        this.notaAluno14D2.add(listaTrabalhos.get(211));
        this.notaAluno14D2.add(listaTrabalhos.get(212));
        this.notaAluno14D2.add(listaTrabalhos.get(213));
        this.notaAluno14D2.add(listaTrabalhos.get(214));
        this.notaAluno14D3.add(listaTrabalhos.get(215));
        this.notaAluno14D3.add(listaTrabalhos.get(216));
        this.notaAluno14D3.add(listaTrabalhos.get(217));
        this.notaAluno14D3.add(listaTrabalhos.get(218));
        this.notaAluno14D4.add(listaTrabalhos.get(219));
        this.notaAluno14D4.add(listaTrabalhos.get(220));
        this.notaAluno14D4.add(listaTrabalhos.get(221));
        this.notaAluno14D4.add(listaTrabalhos.get(222)); //Diogo

        this.notaAluno15D1.add(listaTrabalhos.get(223));
        this.notaAluno15D1.add(listaTrabalhos.get(224));
        this.notaAluno15D1.add(listaTrabalhos.get(225));
        this.notaAluno15D1.add(listaTrabalhos.get(226));
        this.notaAluno15D2.add(listaTrabalhos.get(227));
        this.notaAluno15D2.add(listaTrabalhos.get(228));
        this.notaAluno15D2.add(listaTrabalhos.get(229));
        this.notaAluno15D2.add(listaTrabalhos.get(230));
        this.notaAluno15D3.add(listaTrabalhos.get(231));
        this.notaAluno15D3.add(listaTrabalhos.get(232));
        this.notaAluno15D3.add(listaTrabalhos.get(233));
        this.notaAluno15D3.add(listaTrabalhos.get(234));
        this.notaAluno15D4.add(listaTrabalhos.get(235));
        this.notaAluno15D4.add(listaTrabalhos.get(236));
        this.notaAluno15D4.add(listaTrabalhos.get(237));
        this.notaAluno15D4.add(listaTrabalhos.get(238)); // Guilherme

        this.notaAluno16D1.add(listaTrabalhos.get(239));
        this.notaAluno16D1.add(listaTrabalhos.get(240));
        this.notaAluno16D1.add(listaTrabalhos.get(241));
        this.notaAluno16D1.add(listaTrabalhos.get(242));
        this.notaAluno16D2.add(listaTrabalhos.get(243));
        this.notaAluno16D2.add(listaTrabalhos.get(244));
        this.notaAluno16D2.add(listaTrabalhos.get(245));
        this.notaAluno16D2.add(listaTrabalhos.get(246));
        this.notaAluno16D3.add(listaTrabalhos.get(247));
        this.notaAluno16D3.add(listaTrabalhos.get(248));
        this.notaAluno16D3.add(listaTrabalhos.get(249));
        this.notaAluno16D3.add(listaTrabalhos.get(250));
        this.notaAluno16D4.add(listaTrabalhos.get(251));
        this.notaAluno16D4.add(listaTrabalhos.get(252));
        this.notaAluno16D4.add(listaTrabalhos.get(253));
        this.notaAluno16D4.add(listaTrabalhos.get(254)); // Daniel

        this.notaAluno17D1.add(listaTrabalhos.get(255));
        this.notaAluno17D1.add(listaTrabalhos.get(256));
        this.notaAluno17D1.add(listaTrabalhos.get(257));
        this.notaAluno17D1.add(listaTrabalhos.get(258));
        this.notaAluno17D2.add(listaTrabalhos.get(259));
        this.notaAluno17D2.add(listaTrabalhos.get(260));
        this.notaAluno17D2.add(listaTrabalhos.get(261));
        this.notaAluno17D2.add(listaTrabalhos.get(262));
        this.notaAluno17D3.add(listaTrabalhos.get(263));
        this.notaAluno17D3.add(listaTrabalhos.get(264));
        this.notaAluno17D3.add(listaTrabalhos.get(265));
        this.notaAluno17D3.add(listaTrabalhos.get(266));
        this.notaAluno17D4.add(listaTrabalhos.get(267));
        this.notaAluno17D4.add(listaTrabalhos.get(268));
        this.notaAluno17D4.add(listaTrabalhos.get(269));
        this.notaAluno17D4.add(listaTrabalhos.get(270)); // Igor

        this.notaAluno18D1.add(listaTrabalhos.get(271));
        this.notaAluno18D1.add(listaTrabalhos.get(272)); 
        this.notaAluno18D1.add(listaTrabalhos.get(273)); 
        this.notaAluno18D1.add(listaTrabalhos.get(274)); 
        this.notaAluno18D2.add(listaTrabalhos.get(275)); 
        this.notaAluno18D2.add(listaTrabalhos.get(276)); 
        this.notaAluno18D2.add(listaTrabalhos.get(277)); 
        this.notaAluno18D2.add(listaTrabalhos.get(278)); 
        this.notaAluno18D3.add(listaTrabalhos.get(279)); 
        this.notaAluno18D3.add(listaTrabalhos.get(280)); 
        this.notaAluno18D3.add(listaTrabalhos.get(281)); 
        this.notaAluno18D3.add(listaTrabalhos.get(282)); 
        this.notaAluno18D4.add(listaTrabalhos.get(283)); 
        this.notaAluno18D4.add(listaTrabalhos.get(284)); 
        this.notaAluno18D4.add(listaTrabalhos.get(285)); 
        this.notaAluno18D4.add(listaTrabalhos.get(286)); // Roberto
 
        this.notaAluno19D1.add(listaTrabalhos.get(287));
        this.notaAluno19D1.add(listaTrabalhos.get(288));
        this.notaAluno19D1.add(listaTrabalhos.get(289));
        this.notaAluno19D1.add(listaTrabalhos.get(290));
        this.notaAluno19D2.add(listaTrabalhos.get(291));
        this.notaAluno19D2.add(listaTrabalhos.get(292));
        this.notaAluno19D2.add(listaTrabalhos.get(293));
        this.notaAluno19D2.add(listaTrabalhos.get(294));
        this.notaAluno19D3.add(listaTrabalhos.get(295));
        this.notaAluno19D3.add(listaTrabalhos.get(296));
        this.notaAluno19D3.add(listaTrabalhos.get(297));
        this.notaAluno19D3.add(listaTrabalhos.get(298));
        this.notaAluno19D4.add(listaTrabalhos.get(299));
        this.notaAluno19D4.add(listaTrabalhos.get(300));
        this.notaAluno19D4.add(listaTrabalhos.get(301));
        this.notaAluno19D4.add(listaTrabalhos.get(302)); // Cruz

        this.notaAluno20D1.add(listaTrabalhos.get(303));
        this.notaAluno20D1.add(listaTrabalhos.get(304));
        this.notaAluno20D1.add(listaTrabalhos.get(305));
        this.notaAluno20D1.add(listaTrabalhos.get(306));
        this.notaAluno20D2.add(listaTrabalhos.get(307));
        this.notaAluno20D2.add(listaTrabalhos.get(308));
        this.notaAluno20D2.add(listaTrabalhos.get(309));
        this.notaAluno20D2.add(listaTrabalhos.get(310));
        this.notaAluno20D3.add(listaTrabalhos.get(311));
        this.notaAluno20D3.add(listaTrabalhos.get(312));
        this.notaAluno20D3.add(listaTrabalhos.get(313));
        this.notaAluno20D3.add(listaTrabalhos.get(314));
        this.notaAluno20D4.add(listaTrabalhos.get(315));
        this.notaAluno20D4.add(listaTrabalhos.get(316));
        this.notaAluno20D4.add(listaTrabalhos.get(317));
        this.notaAluno20D4.add(listaTrabalhos.get(318)); // Jackson

        this.notaAluno21D1.add(listaTrabalhos.get(319));
        this.notaAluno21D1.add(listaTrabalhos.get(320));
        this.notaAluno21D1.add(listaTrabalhos.get(321));
        this.notaAluno21D1.add(listaTrabalhos.get(322));
        this.notaAluno21D2.add(listaTrabalhos.get(323));
        this.notaAluno21D2.add(listaTrabalhos.get(324));
        this.notaAluno21D2.add(listaTrabalhos.get(325));
        this.notaAluno21D2.add(listaTrabalhos.get(326));
        this.notaAluno21D3.add(listaTrabalhos.get(327));
        this.notaAluno21D3.add(listaTrabalhos.get(328));
        this.notaAluno21D3.add(listaTrabalhos.get(329));
        this.notaAluno21D3.add(listaTrabalhos.get(330));
        this.notaAluno21D4.add(listaTrabalhos.get(331));
        this.notaAluno21D4.add(listaTrabalhos.get(332));
        this.notaAluno21D4.add(listaTrabalhos.get(333));
        this.notaAluno21D4.add(listaTrabalhos.get(334)); // Doc

        this.notaAluno22D1.add(listaTrabalhos.get(335));
        this.notaAluno22D1.add(listaTrabalhos.get(336)); 
        this.notaAluno22D1.add(listaTrabalhos.get(337)); 
        this.notaAluno22D1.add(listaTrabalhos.get(338)); 
        this.notaAluno22D2.add(listaTrabalhos.get(339)); 
        this.notaAluno22D2.add(listaTrabalhos.get(340)); 
        this.notaAluno22D2.add(listaTrabalhos.get(341)); 
        this.notaAluno22D2.add(listaTrabalhos.get(342)); 
        this.notaAluno22D3.add(listaTrabalhos.get(343)); 
        this.notaAluno22D3.add(listaTrabalhos.get(344)); 
        this.notaAluno22D3.add(listaTrabalhos.get(345)); 
        this.notaAluno22D3.add(listaTrabalhos.get(346)); 
        this.notaAluno22D4.add(listaTrabalhos.get(347)); 
        this.notaAluno22D4.add(listaTrabalhos.get(348)); 
        this.notaAluno22D4.add(listaTrabalhos.get(349)); 
        this.notaAluno22D4.add(listaTrabalhos.get(350)); // Fabricio

        this.notaAluno23D1.add(listaTrabalhos.get(351));
        this.notaAluno23D1.add(listaTrabalhos.get(352));
        this.notaAluno23D1.add(listaTrabalhos.get(353));
        this.notaAluno23D1.add(listaTrabalhos.get(354));
        this.notaAluno23D2.add(listaTrabalhos.get(355));
        this.notaAluno23D2.add(listaTrabalhos.get(356));
        this.notaAluno23D2.add(listaTrabalhos.get(357));
        this.notaAluno23D2.add(listaTrabalhos.get(358));
        this.notaAluno23D3.add(listaTrabalhos.get(359));
        this.notaAluno23D3.add(listaTrabalhos.get(360));
        this.notaAluno23D3.add(listaTrabalhos.get(361));
        this.notaAluno23D3.add(listaTrabalhos.get(362));
        this.notaAluno23D4.add(listaTrabalhos.get(363));
        this.notaAluno23D4.add(listaTrabalhos.get(364));
        this.notaAluno23D4.add(listaTrabalhos.get(365));
        this.notaAluno23D4.add(listaTrabalhos.get(366)); // Everton
 
        this.notaAluno24D1.add(listaTrabalhos.get(367));
        this.notaAluno24D1.add(listaTrabalhos.get(368));
        this.notaAluno24D1.add(listaTrabalhos.get(369));
        this.notaAluno24D1.add(listaTrabalhos.get(370));
        this.notaAluno24D2.add(listaTrabalhos.get(371));
        this.notaAluno24D2.add(listaTrabalhos.get(372));
        this.notaAluno24D2.add(listaTrabalhos.get(373));
        this.notaAluno24D2.add(listaTrabalhos.get(374));
        this.notaAluno24D3.add(listaTrabalhos.get(375));
        this.notaAluno24D3.add(listaTrabalhos.get(376));
        this.notaAluno24D3.add(listaTrabalhos.get(377));
        this.notaAluno24D3.add(listaTrabalhos.get(378));
        this.notaAluno24D4.add(listaTrabalhos.get(379));
        this.notaAluno24D4.add(listaTrabalhos.get(380));
        this.notaAluno24D4.add(listaTrabalhos.get(381));
        this.notaAluno24D4.add(listaTrabalhos.get(382)); // Hemerson

    }

    public RendimentoEscolarFakeDB() {
        super();
    }
    
}
