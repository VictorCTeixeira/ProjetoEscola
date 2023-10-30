package poo.projeto.dominio.FakeDB;
import poo.projeto.dominio.*;
import java.util.ArrayList;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB <RendimentoEscolar>{ //800 - 900
    
    private AlunoFakeDB alunos = new AlunoFakeDB();
    private ArrayList<Aluno> listaAlunos = alunos.getLista();
    private NotasTrabalhoFakeDB trabalhos = new NotasTrabalhoFakeDB();
    private ArrayList<NotaTrabalho> listaTrabalhos = trabalhos.getLista();
    private ArrayList<NotaTrabalho> notaAluno1 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno2 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno3 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno4 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno5 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno6 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno7 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno8 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno9 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno10 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno11 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno12 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno13 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno14 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno15 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno16 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno17 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno18 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno19 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno20 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno21 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno22 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno23 = new ArrayList<NotaTrabalho>();
    private ArrayList<NotaTrabalho> notaAluno24 = new ArrayList<NotaTrabalho>();
    
    @Override
    protected void CarregarDados(){
       CarregarTrabalhos(); 
    }

    public void CarregarTrabalhos(){
        this.notaAluno1.add(listaTrabalhos.get(1));
        this.notaAluno1.add(listaTrabalhos.get(2));
        this.notaAluno1.add(listaTrabalhos.get(3));
        this.notaAluno1.add(listaTrabalhos.get(4));
        this.notaAluno1.add(listaTrabalhos.get(5));
        this.notaAluno1.add(listaTrabalhos.get(6));
        this.notaAluno1.add(listaTrabalhos.get(7));
        this.notaAluno1.add(listaTrabalhos.get(8));
        this.notaAluno1.add(listaTrabalhos.get(9));
        this.notaAluno1.add(listaTrabalhos.get(10));
        this.notaAluno1.add(listaTrabalhos.get(11));
        this.notaAluno1.add(listaTrabalhos.get(12));
        this.notaAluno1.add(listaTrabalhos.get(13));
        this.notaAluno1.add(listaTrabalhos.get(14));
        this.notaAluno1.add(listaTrabalhos.get(15)); // caio

        this.notaAluno2.add(listaTrabalhos.get(16));
        this.notaAluno2.add(listaTrabalhos.get(17));
        this.notaAluno2.add(listaTrabalhos.get(18));
        this.notaAluno2.add(listaTrabalhos.get(19));
        this.notaAluno2.add(listaTrabalhos.get(20));
        this.notaAluno2.add(listaTrabalhos.get(21));
        this.notaAluno2.add(listaTrabalhos.get(22));
        this.notaAluno2.add(listaTrabalhos.get(23));
        this.notaAluno2.add(listaTrabalhos.get(24));
        this.notaAluno2.add(listaTrabalhos.get(25));
        this.notaAluno2.add(listaTrabalhos.get(26));
        this.notaAluno2.add(listaTrabalhos.get(27));
        this.notaAluno2.add(listaTrabalhos.get(28));
        this.notaAluno2.add(listaTrabalhos.get(29));
        this.notaAluno2.add(listaTrabalhos.get(30));
        this.notaAluno2.add(listaTrabalhos.get(31)); // Fabricio

        this.notaAluno3.add(listaTrabalhos.get(32));
        this.notaAluno3.add(listaTrabalhos.get(33));
        this.notaAluno3.add(listaTrabalhos.get(34));
        this.notaAluno3.add(listaTrabalhos.get(35));
        this.notaAluno3.add(listaTrabalhos.get(36));
        this.notaAluno3.add(listaTrabalhos.get(37));
        this.notaAluno3.add(listaTrabalhos.get(38));
        this.notaAluno3.add(listaTrabalhos.get(39));
        this.notaAluno3.add(listaTrabalhos.get(40));
        this.notaAluno3.add(listaTrabalhos.get(41));
        this.notaAluno3.add(listaTrabalhos.get(42));
        this.notaAluno3.add(listaTrabalhos.get(43));
        this.notaAluno3.add(listaTrabalhos.get(44));
        this.notaAluno3.add(listaTrabalhos.get(45));
        this.notaAluno3.add(listaTrabalhos.get(46));
        this.notaAluno3.add(listaTrabalhos.get(47)); // Fagner

        this.notaAluno4.add(listaTrabalhos.get(48));
        this.notaAluno4.add(listaTrabalhos.get(49));
        this.notaAluno4.add(listaTrabalhos.get(50));
        this.notaAluno4.add(listaTrabalhos.get(51));
        this.notaAluno4.add(listaTrabalhos.get(52));
        this.notaAluno4.add(listaTrabalhos.get(53));
        this.notaAluno4.add(listaTrabalhos.get(54));
        this.notaAluno4.add(listaTrabalhos.get(55));
        this.notaAluno4.add(listaTrabalhos.get(56));
        this.notaAluno4.add(listaTrabalhos.get(57));
        this.notaAluno4.add(listaTrabalhos.get(58));
        this.notaAluno4.add(listaTrabalhos.get(59));
        this.notaAluno4.add(listaTrabalhos.get(60));
        this.notaAluno4.add(listaTrabalhos.get(61));
        this.notaAluno4.add(listaTrabalhos.get(62));
        this.notaAluno4.add(listaTrabalhos.get(63)); // Gabriel

        this.notaAluno5.add(listaTrabalhos.get(64));
        this.notaAluno5.add(listaTrabalhos.get(65));
        this.notaAluno5.add(listaTrabalhos.get(66));
        this.notaAluno5.add(listaTrabalhos.get(67));
        this.notaAluno5.add(listaTrabalhos.get(68));
        this.notaAluno5.add(listaTrabalhos.get(69));
        this.notaAluno5.add(listaTrabalhos.get(70));
        this.notaAluno5.add(listaTrabalhos.get(71));
        this.notaAluno5.add(listaTrabalhos.get(72));
        this.notaAluno5.add(listaTrabalhos.get(73));
        this.notaAluno5.add(listaTrabalhos.get(74));
        this.notaAluno5.add(listaTrabalhos.get(75));
        this.notaAluno5.add(listaTrabalhos.get(76));
        this.notaAluno5.add(listaTrabalhos.get(77));
        this.notaAluno5.add(listaTrabalhos.get(78));
        this.notaAluno5.add(listaTrabalhos.get(79)); // Felipe

        this.notaAluno6.add(listaTrabalhos.get(80));
        this.notaAluno6.add(listaTrabalhos.get(81));
        this.notaAluno6.add(listaTrabalhos.get(82));
        this.notaAluno6.add(listaTrabalhos.get(83));
        this.notaAluno6.add(listaTrabalhos.get(84));
        this.notaAluno6.add(listaTrabalhos.get(85));
        this.notaAluno6.add(listaTrabalhos.get(86));
        this.notaAluno6.add(listaTrabalhos.get(87));
        this.notaAluno6.add(listaTrabalhos.get(88));
        this.notaAluno6.add(listaTrabalhos.get(89));
        this.notaAluno6.add(listaTrabalhos.get(90));
        this.notaAluno6.add(listaTrabalhos.get(91));
        this.notaAluno6.add(listaTrabalhos.get(92));
        this.notaAluno6.add(listaTrabalhos.get(93));
        this.notaAluno6.add(listaTrabalhos.get(94));
        this.notaAluno6.add(listaTrabalhos.get(95)); //Fernando

        this.notaAluno7.add(listaTrabalhos.get(96));
        this.notaAluno7.add(listaTrabalhos.get(97)); 
        this.notaAluno7.add(listaTrabalhos.get(98)); 
        this.notaAluno7.add(listaTrabalhos.get(99)); 
        this.notaAluno7.add(listaTrabalhos.get(100)); 
        this.notaAluno7.add(listaTrabalhos.get(101)); 
        this.notaAluno7.add(listaTrabalhos.get(102)); 
        this.notaAluno7.add(listaTrabalhos.get(103)); 
        this.notaAluno7.add(listaTrabalhos.get(104)); 
        this.notaAluno7.add(listaTrabalhos.get(105)); 
        this.notaAluno7.add(listaTrabalhos.get(106)); 
        this.notaAluno7.add(listaTrabalhos.get(107)); 
        this.notaAluno7.add(listaTrabalhos.get(108)); 
        this.notaAluno7.add(listaTrabalhos.get(109)); 
        this.notaAluno7.add(listaTrabalhos.get(110)); 
        this.notaAluno7.add(listaTrabalhos.get(111)); // Henrique
        
        this.notaAluno8.add(listaTrabalhos.get(112));
        this.notaAluno8.add(listaTrabalhos.get(113));
        this.notaAluno8.add(listaTrabalhos.get(114));
        this.notaAluno8.add(listaTrabalhos.get(115));
        this.notaAluno8.add(listaTrabalhos.get(116));
        this.notaAluno8.add(listaTrabalhos.get(117));
        this.notaAluno8.add(listaTrabalhos.get(118));
        this.notaAluno8.add(listaTrabalhos.get(119));
        this.notaAluno8.add(listaTrabalhos.get(120));
        this.notaAluno8.add(listaTrabalhos.get(121));
        this.notaAluno8.add(listaTrabalhos.get(122));
        this.notaAluno8.add(listaTrabalhos.get(123));
        this.notaAluno8.add(listaTrabalhos.get(124));
        this.notaAluno8.add(listaTrabalhos.get(125));
        this.notaAluno8.add(listaTrabalhos.get(126));
        this.notaAluno8.add(listaTrabalhos.get(127));
        this.notaAluno8.add(listaTrabalhos.get(128)); // Bruno

        this.notaAluno9.add(listaTrabalhos.get(129));
        this.notaAluno9.add(listaTrabalhos.get(130));
        this.notaAluno9.add(listaTrabalhos.get(131));
        this.notaAluno9.add(listaTrabalhos.get(132));
        this.notaAluno9.add(listaTrabalhos.get(133));
        this.notaAluno9.add(listaTrabalhos.get(134));
        this.notaAluno9.add(listaTrabalhos.get(135));
        this.notaAluno9.add(listaTrabalhos.get(136));
        this.notaAluno9.add(listaTrabalhos.get(137));
        this.notaAluno9.add(listaTrabalhos.get(138));
        this.notaAluno9.add(listaTrabalhos.get(139));
        this.notaAluno9.add(listaTrabalhos.get(140));
        this.notaAluno9.add(listaTrabalhos.get(141));
        this.notaAluno9.add(listaTrabalhos.get(142));
        this.notaAluno9.add(listaTrabalhos.get(143));
        this.notaAluno9.add(listaTrabalhos.get(144)); // Giorgian

        this.notaAluno10.add(listaTrabalhos.get(145));
        this.notaAluno10.add(listaTrabalhos.get(146));
        this.notaAluno10.add(listaTrabalhos.get(147));
        this.notaAluno10.add(listaTrabalhos.get(148));
        this.notaAluno10.add(listaTrabalhos.get(149));
        this.notaAluno10.add(listaTrabalhos.get(150));
        this.notaAluno10.add(listaTrabalhos.get(151));
        this.notaAluno10.add(listaTrabalhos.get(152));
        this.notaAluno10.add(listaTrabalhos.get(153));
        this.notaAluno10.add(listaTrabalhos.get(154));
        this.notaAluno10.add(listaTrabalhos.get(155));
        this.notaAluno10.add(listaTrabalhos.get(156));
        this.notaAluno10.add(listaTrabalhos.get(157));
        this.notaAluno10.add(listaTrabalhos.get(158));
        this.notaAluno10.add(listaTrabalhos.get(159));
        this.notaAluno10.add(listaTrabalhos.get(160)); //Gerson

        this.notaAluno11.add(listaTrabalhos.get(161));
        this.notaAluno11.add(listaTrabalhos.get(162));
        this.notaAluno11.add(listaTrabalhos.get(163));
        this.notaAluno11.add(listaTrabalhos.get(164));
        this.notaAluno11.add(listaTrabalhos.get(165));
        this.notaAluno11.add(listaTrabalhos.get(166));
        this.notaAluno11.add(listaTrabalhos.get(167));
        this.notaAluno11.add(listaTrabalhos.get(168));
        this.notaAluno11.add(listaTrabalhos.get(169));
        this.notaAluno11.add(listaTrabalhos.get(170));
        this.notaAluno11.add(listaTrabalhos.get(171));
        this.notaAluno11.add(listaTrabalhos.get(172));
        this.notaAluno11.add(listaTrabalhos.get(173));
        this.notaAluno11.add(listaTrabalhos.get(174));
        this.notaAluno11.add(listaTrabalhos.get(175));
        this.notaAluno11.add(listaTrabalhos.get(176)); // Piquerez

        this.notaAluno12.add(listaTrabalhos.get(177));
        this.notaAluno12.add(listaTrabalhos.get(178));
        this.notaAluno12.add(listaTrabalhos.get(179));
        this.notaAluno12.add(listaTrabalhos.get(180));
        this.notaAluno12.add(listaTrabalhos.get(181));
        this.notaAluno12.add(listaTrabalhos.get(182));
        this.notaAluno12.add(listaTrabalhos.get(183));
        this.notaAluno12.add(listaTrabalhos.get(184));
        this.notaAluno12.add(listaTrabalhos.get(185));
        this.notaAluno12.add(listaTrabalhos.get(186));
        this.notaAluno12.add(listaTrabalhos.get(187));
        this.notaAluno12.add(listaTrabalhos.get(188)); // Rony

        this.notaAluno13.add(listaTrabalhos.get(189));
        this.notaAluno13.add(listaTrabalhos.get(190));
        this.notaAluno13.add(listaTrabalhos.get(191));
        this.notaAluno13.add(listaTrabalhos.get(192));
        this.notaAluno13.add(listaTrabalhos.get(193));
        this.notaAluno13.add(listaTrabalhos.get(194));
        this.notaAluno13.add(listaTrabalhos.get(195));
        this.notaAluno13.add(listaTrabalhos.get(196));
        this.notaAluno13.add(listaTrabalhos.get(197));
        this.notaAluno13.add(listaTrabalhos.get(198));
        this.notaAluno13.add(listaTrabalhos.get(199));
        this.notaAluno13.add(listaTrabalhos.get(200));
        this.notaAluno13.add(listaTrabalhos.get(201));
        this.notaAluno13.add(listaTrabalhos.get(202));
        this.notaAluno13.add(listaTrabalhos.get(203));
        this.notaAluno13.add(listaTrabalhos.get(204)); // Victor

        this.notaAluno14.add(listaTrabalhos.get(205));
        this.notaAluno14.add(listaTrabalhos.get(206));
        this.notaAluno14.add(listaTrabalhos.get(207));
        this.notaAluno14.add(listaTrabalhos.get(208));
        this.notaAluno14.add(listaTrabalhos.get(209));
        this.notaAluno14.add(listaTrabalhos.get(210));
        this.notaAluno14.add(listaTrabalhos.get(211));
        this.notaAluno14.add(listaTrabalhos.get(212));
        this.notaAluno14.add(listaTrabalhos.get(213));
        this.notaAluno14.add(listaTrabalhos.get(214));
        this.notaAluno14.add(listaTrabalhos.get(215));
        this.notaAluno14.add(listaTrabalhos.get(216));
        this.notaAluno14.add(listaTrabalhos.get(217));
        this.notaAluno14.add(listaTrabalhos.get(218));
        this.notaAluno14.add(listaTrabalhos.get(219));
        this.notaAluno14.add(listaTrabalhos.get(220)); //Diogo

        this.notaAluno15.add(listaTrabalhos.get(221));
        this.notaAluno15.add(listaTrabalhos.get(222));
        this.notaAluno15.add(listaTrabalhos.get(223));
        this.notaAluno15.add(listaTrabalhos.get(224));
        this.notaAluno15.add(listaTrabalhos.get(225));
        this.notaAluno15.add(listaTrabalhos.get(226));
        this.notaAluno15.add(listaTrabalhos.get(227));
        this.notaAluno15.add(listaTrabalhos.get(228));
        this.notaAluno15.add(listaTrabalhos.get(229));
        this.notaAluno15.add(listaTrabalhos.get(230));
        this.notaAluno15.add(listaTrabalhos.get(231));
        this.notaAluno15.add(listaTrabalhos.get(232));
        this.notaAluno15.add(listaTrabalhos.get(233));
        this.notaAluno15.add(listaTrabalhos.get(234));
        this.notaAluno15.add(listaTrabalhos.get(235));
        this.notaAluno15.add(listaTrabalhos.get(236)); // Guilherme

        this.notaAluno16.add(listaTrabalhos.get(237));
        this.notaAluno16.add(listaTrabalhos.get(238));
        this.notaAluno16.add(listaTrabalhos.get(239));
        this.notaAluno16.add(listaTrabalhos.get(240));
        this.notaAluno16.add(listaTrabalhos.get(241));
        this.notaAluno16.add(listaTrabalhos.get(242));
        this.notaAluno16.add(listaTrabalhos.get(243));
        this.notaAluno16.add(listaTrabalhos.get(244));
        this.notaAluno16.add(listaTrabalhos.get(245));
        this.notaAluno16.add(listaTrabalhos.get(246));
        this.notaAluno16.add(listaTrabalhos.get(247));
        this.notaAluno16.add(listaTrabalhos.get(248));
        this.notaAluno16.add(listaTrabalhos.get(249));
        this.notaAluno16.add(listaTrabalhos.get(250));
        this.notaAluno16.add(listaTrabalhos.get(251));
        this.notaAluno16.add(listaTrabalhos.get(252)); // Daniel

        this.notaAluno17.add(listaTrabalhos.get(253));
        this.notaAluno17.add(listaTrabalhos.get(254));
        this.notaAluno17.add(listaTrabalhos.get(255));
        this.notaAluno17.add(listaTrabalhos.get(256));
        this.notaAluno17.add(listaTrabalhos.get(257));
        this.notaAluno17.add(listaTrabalhos.get(258));
        this.notaAluno17.add(listaTrabalhos.get(259));
        this.notaAluno17.add(listaTrabalhos.get(260));
        this.notaAluno17.add(listaTrabalhos.get(261));
        this.notaAluno17.add(listaTrabalhos.get(262));
        this.notaAluno17.add(listaTrabalhos.get(263));
        this.notaAluno17.add(listaTrabalhos.get(264));
        this.notaAluno17.add(listaTrabalhos.get(265));
        this.notaAluno17.add(listaTrabalhos.get(266));
        this.notaAluno17.add(listaTrabalhos.get(267));
        this.notaAluno17.add(listaTrabalhos.get(268)); // Igor

        this.notaAluno18.add(listaTrabalhos.get(269));
        this.notaAluno18.add(listaTrabalhos.get(270)); 
        this.notaAluno18.add(listaTrabalhos.get(271)); 
        this.notaAluno18.add(listaTrabalhos.get(272)); 
        this.notaAluno18.add(listaTrabalhos.get(273)); 
        this.notaAluno18.add(listaTrabalhos.get(274)); 
        this.notaAluno18.add(listaTrabalhos.get(275)); 
        this.notaAluno18.add(listaTrabalhos.get(276)); 
        this.notaAluno18.add(listaTrabalhos.get(277)); 
        this.notaAluno18.add(listaTrabalhos.get(278)); 
        this.notaAluno18.add(listaTrabalhos.get(279)); 
        this.notaAluno18.add(listaTrabalhos.get(280)); 
        this.notaAluno18.add(listaTrabalhos.get(281)); 
        this.notaAluno18.add(listaTrabalhos.get(282)); 
        this.notaAluno18.add(listaTrabalhos.get(283)); 
        this.notaAluno18.add(listaTrabalhos.get(284)); // Roberto
 
        this.notaAluno19.add(listaTrabalhos.get(285));
        this.notaAluno19.add(listaTrabalhos.get(286));
        this.notaAluno19.add(listaTrabalhos.get(287));
        this.notaAluno19.add(listaTrabalhos.get(288));
        this.notaAluno19.add(listaTrabalhos.get(289));
        this.notaAluno19.add(listaTrabalhos.get(290));
        this.notaAluno19.add(listaTrabalhos.get(291));
        this.notaAluno19.add(listaTrabalhos.get(292));
        this.notaAluno19.add(listaTrabalhos.get(293));
        this.notaAluno19.add(listaTrabalhos.get(294));
        this.notaAluno19.add(listaTrabalhos.get(295));
        this.notaAluno19.add(listaTrabalhos.get(296));
        this.notaAluno19.add(listaTrabalhos.get(297));
        this.notaAluno19.add(listaTrabalhos.get(298));
        this.notaAluno19.add(listaTrabalhos.get(299));
        this.notaAluno19.add(listaTrabalhos.get(300)); // Cruz

        this.notaAluno20.add(listaTrabalhos.get(301));
        this.notaAluno20.add(listaTrabalhos.get(302));
        this.notaAluno20.add(listaTrabalhos.get(303));
        this.notaAluno20.add(listaTrabalhos.get(304));
        this.notaAluno20.add(listaTrabalhos.get(305));
        this.notaAluno20.add(listaTrabalhos.get(306));
        this.notaAluno20.add(listaTrabalhos.get(307));
        this.notaAluno20.add(listaTrabalhos.get(308));
        this.notaAluno20.add(listaTrabalhos.get(309));
        this.notaAluno20.add(listaTrabalhos.get(310));
        this.notaAluno20.add(listaTrabalhos.get(311));
        this.notaAluno20.add(listaTrabalhos.get(312));
        this.notaAluno20.add(listaTrabalhos.get(313));
        this.notaAluno20.add(listaTrabalhos.get(314));
        this.notaAluno20.add(listaTrabalhos.get(315));
        this.notaAluno20.add(listaTrabalhos.get(316)); // Jackson

        this.notaAluno21.add(listaTrabalhos.get(317));
        this.notaAluno21.add(listaTrabalhos.get(318));
        this.notaAluno21.add(listaTrabalhos.get(319));
        this.notaAluno21.add(listaTrabalhos.get(320));
        this.notaAluno21.add(listaTrabalhos.get(321));
        this.notaAluno21.add(listaTrabalhos.get(322));
        this.notaAluno21.add(listaTrabalhos.get(323));
        this.notaAluno21.add(listaTrabalhos.get(324));
        this.notaAluno21.add(listaTrabalhos.get(325));
        this.notaAluno21.add(listaTrabalhos.get(326));
        this.notaAluno21.add(listaTrabalhos.get(327));
        this.notaAluno21.add(listaTrabalhos.get(328));
        this.notaAluno21.add(listaTrabalhos.get(329));
        this.notaAluno21.add(listaTrabalhos.get(330));
        this.notaAluno21.add(listaTrabalhos.get(331));
        this.notaAluno21.add(listaTrabalhos.get(332)); // Doc

        this.notaAluno22.add(listaTrabalhos.get(333));
        this.notaAluno22.add(listaTrabalhos.get(334)); 
        this.notaAluno22.add(listaTrabalhos.get(335)); 
        this.notaAluno22.add(listaTrabalhos.get(336)); 
        this.notaAluno22.add(listaTrabalhos.get(337)); 
        this.notaAluno22.add(listaTrabalhos.get(338)); 
        this.notaAluno22.add(listaTrabalhos.get(339)); 
        this.notaAluno22.add(listaTrabalhos.get(340)); 
        this.notaAluno22.add(listaTrabalhos.get(341)); 
        this.notaAluno22.add(listaTrabalhos.get(342)); 
        this.notaAluno22.add(listaTrabalhos.get(343)); 
        this.notaAluno22.add(listaTrabalhos.get(344)); 
        this.notaAluno22.add(listaTrabalhos.get(345)); 
        this.notaAluno22.add(listaTrabalhos.get(346)); 
        this.notaAluno22.add(listaTrabalhos.get(347)); 
        this.notaAluno22.add(listaTrabalhos.get(348)); // Fabricio

        this.notaAluno23.add(listaTrabalhos.get(349));
        this.notaAluno23.add(listaTrabalhos.get(350));
        this.notaAluno23.add(listaTrabalhos.get(351));
        this.notaAluno23.add(listaTrabalhos.get(352));
        this.notaAluno23.add(listaTrabalhos.get(353));
        this.notaAluno23.add(listaTrabalhos.get(354));
        this.notaAluno23.add(listaTrabalhos.get(355));
        this.notaAluno23.add(listaTrabalhos.get(356));
        this.notaAluno23.add(listaTrabalhos.get(357));
        this.notaAluno23.add(listaTrabalhos.get(358));
        this.notaAluno23.add(listaTrabalhos.get(359));
        this.notaAluno23.add(listaTrabalhos.get(360));
        this.notaAluno23.add(listaTrabalhos.get(361));
        this.notaAluno23.add(listaTrabalhos.get(362));
        this.notaAluno23.add(listaTrabalhos.get(363));
        this.notaAluno23.add(listaTrabalhos.get(364)); // Everton
 
        this.notaAluno24.add(listaTrabalhos.get(365));
        this.notaAluno24.add(listaTrabalhos.get(366));
        this.notaAluno24.add(listaTrabalhos.get(367));
        this.notaAluno24.add(listaTrabalhos.get(368));
        this.notaAluno24.add(listaTrabalhos.get(369));
        this.notaAluno24.add(listaTrabalhos.get(370));
        this.notaAluno24.add(listaTrabalhos.get(371));
        this.notaAluno24.add(listaTrabalhos.get(372));
        this.notaAluno24.add(listaTrabalhos.get(373));
        this.notaAluno24.add(listaTrabalhos.get(374));
        this.notaAluno24.add(listaTrabalhos.get(375));
        this.notaAluno24.add(listaTrabalhos.get(376));
        this.notaAluno24.add(listaTrabalhos.get(377));
        this.notaAluno24.add(listaTrabalhos.get(378));
        this.notaAluno24.add(listaTrabalhos.get(379));
        this.notaAluno24.add(listaTrabalhos.get(380)); // Hemerson

    }

    public RendimentoEscolarFakeDB() {
        super();
    }
    
}
