package poo.projeto.FakeDB;
import java.util.ArrayList;

import poo.projeto.dominio.*;

public class NotasTrabalhoFakeDB extends BaseGenericaFakeDB <NotaTrabalho> { // 400 - 599

    private TrabalhoFakeDB trabalhos = new TrabalhoFakeDB();
    private ArrayList<Trabalho> listaTrabalhos = trabalhos.getLista();

    private AlunoFakeDB alunos = new AlunoFakeDB();
    private ArrayList<Aluno> listaAlunos = alunos.getLista();

    @Override
    protected void CarregarDados() {

       this.lista.add(new NotaTrabalho(400, listaAlunos.get(0), listaTrabalhos.get(32), 6)); // nota Caio 1
       this.lista.add(new NotaTrabalho(401, listaAlunos.get(0), listaTrabalhos.get(33), 8)); 
       this.lista.add(new NotaTrabalho(402, listaAlunos.get(0), listaTrabalhos.get(34), 10)); 
       this.lista.add(new NotaTrabalho(403, listaAlunos.get(0), listaTrabalhos.get(35), 4));
       this.lista.add(new NotaTrabalho(404, listaAlunos.get(0), listaTrabalhos.get(0), 10)); 
       this.lista.add(new NotaTrabalho(405, listaAlunos.get(0), listaTrabalhos.get(1), 2)); 
       this.lista.add(new NotaTrabalho(406, listaAlunos.get(0), listaTrabalhos.get(2), 4)); 
       this.lista.add(new NotaTrabalho(407, listaAlunos.get(0), listaTrabalhos.get(3),9));
       this.lista.add(new NotaTrabalho(408, listaAlunos.get(0), listaTrabalhos.get(8), 3)); 
       this.lista.add(new NotaTrabalho(409, listaAlunos.get(0), listaTrabalhos.get(9), 10)); 
       this.lista.add(new NotaTrabalho(410, listaAlunos.get(0), listaTrabalhos.get(10), 2)); 
       this.lista.add(new NotaTrabalho(411, listaAlunos.get(0), listaTrabalhos.get(11), 4));
       this.lista.add(new NotaTrabalho(412, listaAlunos.get(0), listaTrabalhos.get(20), 10)); 
       this.lista.add(new NotaTrabalho(413, listaAlunos.get(0), listaTrabalhos.get(21), 9)); 
       this.lista.add(new NotaTrabalho(414, listaAlunos.get(0), listaTrabalhos.get(22), 8)); 
       this.lista.add(new NotaTrabalho(415, listaAlunos.get(0), listaTrabalhos.get(23), 2));

       this.lista.add(new NotaTrabalho(416, listaAlunos.get(1), listaTrabalhos.get(32), 10)); // nota Fabricio 1
       this.lista.add(new NotaTrabalho(417, listaAlunos.get(1), listaTrabalhos.get(33), 10)); 
       this.lista.add(new NotaTrabalho(418, listaAlunos.get(1), listaTrabalhos.get(34), 9)); 
       this.lista.add(new NotaTrabalho(419, listaAlunos.get(1), listaTrabalhos.get(35), 8));
       this.lista.add(new NotaTrabalho(404, listaAlunos.get(1), listaTrabalhos.get(0), 10)); 
       this.lista.add(new NotaTrabalho(420, listaAlunos.get(1), listaTrabalhos.get(1), 10)); 
       this.lista.add(new NotaTrabalho(421, listaAlunos.get(1), listaTrabalhos.get(2), 10)); 
       this.lista.add(new NotaTrabalho(422, listaAlunos.get(1), listaTrabalhos.get(3),9));
       this.lista.add(new NotaTrabalho(423, listaAlunos.get(1), listaTrabalhos.get(8), 10));
       this.lista.add(new NotaTrabalho(425, listaAlunos.get(1), listaTrabalhos.get(9), 10)); 
       this.lista.add(new NotaTrabalho(426, listaAlunos.get(1), listaTrabalhos.get(10), 10)); 
       this.lista.add(new NotaTrabalho(427, listaAlunos.get(1), listaTrabalhos.get(11), 9));
       this.lista.add(new NotaTrabalho(428, listaAlunos.get(1), listaTrabalhos.get(20), 10)); 
       this.lista.add(new NotaTrabalho(429, listaAlunos.get(1), listaTrabalhos.get(21), 9)); 
       this.lista.add(new NotaTrabalho(430, listaAlunos.get(1), listaTrabalhos.get(22), 8)); 
       this.lista.add(new NotaTrabalho(431, listaAlunos.get(1), listaTrabalhos.get(23), 8));

       this.lista.add(new NotaTrabalho(432, listaAlunos.get(2), listaTrabalhos.get(32), 9)); // nota Fagner 1
       this.lista.add(new NotaTrabalho(433, listaAlunos.get(2), listaTrabalhos.get(33), 8)); 
       this.lista.add(new NotaTrabalho(434, listaAlunos.get(2), listaTrabalhos.get(34), 4)); 
       this.lista.add(new NotaTrabalho(435, listaAlunos.get(2), listaTrabalhos.get(35), 5));
       this.lista.add(new NotaTrabalho(436, listaAlunos.get(2), listaTrabalhos.get(0), 5)); 
       this.lista.add(new NotaTrabalho(437, listaAlunos.get(2), listaTrabalhos.get(1), 4)); 
       this.lista.add(new NotaTrabalho(438, listaAlunos.get(2), listaTrabalhos.get(2), 2)); 
       this.lista.add(new NotaTrabalho(439, listaAlunos.get(2), listaTrabalhos.get(3),3));
       this.lista.add(new NotaTrabalho(440, listaAlunos.get(2), listaTrabalhos.get(8), 5));
       this.lista.add(new NotaTrabalho(441, listaAlunos.get(2), listaTrabalhos.get(9), 6)); 
       this.lista.add(new NotaTrabalho(442, listaAlunos.get(2), listaTrabalhos.get(10), 7)); 
       this.lista.add(new NotaTrabalho(443, listaAlunos.get(2), listaTrabalhos.get(11), 3));
       this.lista.add(new NotaTrabalho(444, listaAlunos.get(2), listaTrabalhos.get(20), 1)); 
       this.lista.add(new NotaTrabalho(445, listaAlunos.get(2), listaTrabalhos.get(21), 4)); 
       this.lista.add(new NotaTrabalho(446, listaAlunos.get(2), listaTrabalhos.get(22), 5)); 
       this.lista.add(new NotaTrabalho(447, listaAlunos.get(2), listaTrabalhos.get(23), 3));
            
       this.lista.add(new NotaTrabalho(448, listaAlunos.get(3), listaTrabalhos.get(0), 9)); // nota Gabriel 2
       this.lista.add(new NotaTrabalho(449, listaAlunos.get(3), listaTrabalhos.get(1), 8)); 
       this.lista.add(new NotaTrabalho(450, listaAlunos.get(3), listaTrabalhos.get(2), 5)); 
       this.lista.add(new NotaTrabalho(451, listaAlunos.get(3), listaTrabalhos.get(3), 8));
       this.lista.add(new NotaTrabalho(452, listaAlunos.get(3), listaTrabalhos.get(20), 7)); 
       this.lista.add(new NotaTrabalho(453, listaAlunos.get(3), listaTrabalhos.get(21), 2)); 
       this.lista.add(new NotaTrabalho(454, listaAlunos.get(3), listaTrabalhos.get(22), 10)); 
       this.lista.add(new NotaTrabalho(455, listaAlunos.get(3), listaTrabalhos.get(23), 8));
       this.lista.add(new NotaTrabalho(456, listaAlunos.get(3), listaTrabalhos.get(32), 7));
       this.lista.add(new NotaTrabalho(457, listaAlunos.get(3), listaTrabalhos.get(33), 10)); 
       this.lista.add(new NotaTrabalho(458, listaAlunos.get(3), listaTrabalhos.get(34), 3)); 
       this.lista.add(new NotaTrabalho(459, listaAlunos.get(3), listaTrabalhos.get(35), 2));
       this.lista.add(new NotaTrabalho(456, listaAlunos.get(3), listaTrabalhos.get(36), 2));
       this.lista.add(new NotaTrabalho(457, listaAlunos.get(3), listaTrabalhos.get(37), 6)); 
       this.lista.add(new NotaTrabalho(458, listaAlunos.get(3), listaTrabalhos.get(38), 2)); 
       this.lista.add(new NotaTrabalho(459, listaAlunos.get(3), listaTrabalhos.get(39), 5)); 
 
       this.lista.add(new NotaTrabalho(460, listaAlunos.get(4), listaTrabalhos.get(0), 10)); // nota Felipe 2
       this.lista.add(new NotaTrabalho(461, listaAlunos.get(4), listaTrabalhos.get(1), 2)); 
       this.lista.add(new NotaTrabalho(462, listaAlunos.get(4), listaTrabalhos.get(2), 3)); 
       this.lista.add(new NotaTrabalho(463, listaAlunos.get(4), listaTrabalhos.get(3), 5));
       this.lista.add(new NotaTrabalho(464, listaAlunos.get(4), listaTrabalhos.get(20), 2)); 
       this.lista.add(new NotaTrabalho(465, listaAlunos.get(4), listaTrabalhos.get(21), 2)); 
       this.lista.add(new NotaTrabalho(466, listaAlunos.get(4), listaTrabalhos.get(22), 5)); 
       this.lista.add(new NotaTrabalho(467, listaAlunos.get(4), listaTrabalhos.get(23),10));
       this.lista.add(new NotaTrabalho(468, listaAlunos.get(4), listaTrabalhos.get(32), 7));
       this.lista.add(new NotaTrabalho(469, listaAlunos.get(4), listaTrabalhos.get(33), 10)); 
       this.lista.add(new NotaTrabalho(470, listaAlunos.get(4), listaTrabalhos.get(34), 3)); 
       this.lista.add(new NotaTrabalho(471, listaAlunos.get(4), listaTrabalhos.get(35), 5));
       this.lista.add(new NotaTrabalho(472, listaAlunos.get(4), listaTrabalhos.get(36), 7));
       this.lista.add(new NotaTrabalho(473, listaAlunos.get(4), listaTrabalhos.get(37), 8)); 
       this.lista.add(new NotaTrabalho(474, listaAlunos.get(4), listaTrabalhos.get(38), 2)); 
       this.lista.add(new NotaTrabalho(475, listaAlunos.get(4), listaTrabalhos.get(39), 6)); 
 
       this.lista.add(new NotaTrabalho(476, listaAlunos.get(5), listaTrabalhos.get(0), 9)); // nota Fernando 2
       this.lista.add(new NotaTrabalho(477, listaAlunos.get(5), listaTrabalhos.get(1), 5)); 
       this.lista.add(new NotaTrabalho(478, listaAlunos.get(5), listaTrabalhos.get(2), 7)); 
       this.lista.add(new NotaTrabalho(479, listaAlunos.get(5), listaTrabalhos.get(3), 5));
       this.lista.add(new NotaTrabalho(480, listaAlunos.get(5), listaTrabalhos.get(20), 3)); 
       this.lista.add(new NotaTrabalho(481, listaAlunos.get(5), listaTrabalhos.get(21), 7)); 
       this.lista.add(new NotaTrabalho(482, listaAlunos.get(5), listaTrabalhos.get(22), 10)); 
       this.lista.add(new NotaTrabalho(483, listaAlunos.get(5), listaTrabalhos.get(23),10));
       this.lista.add(new NotaTrabalho(484, listaAlunos.get(5), listaTrabalhos.get(32), 9));
       this.lista.add(new NotaTrabalho(485, listaAlunos.get(5), listaTrabalhos.get(33), 5)); 
       this.lista.add(new NotaTrabalho(486, listaAlunos.get(5), listaTrabalhos.get(34), 6)); 
       this.lista.add(new NotaTrabalho(487, listaAlunos.get(5), listaTrabalhos.get(35), 5));
       this.lista.add(new NotaTrabalho(488, listaAlunos.get(5), listaTrabalhos.get(36), 9));
       this.lista.add(new NotaTrabalho(489, listaAlunos.get(5), listaTrabalhos.get(37), 4)); 
       this.lista.add(new NotaTrabalho(490, listaAlunos.get(5), listaTrabalhos.get(38), 2)); 
       this.lista.add(new NotaTrabalho(491, listaAlunos.get(5), listaTrabalhos.get(39), 3)); 

       this.lista.add(new NotaTrabalho(492, listaAlunos.get(6), listaTrabalhos.get(24), 10)); // nota Henrique 3
       this.lista.add(new NotaTrabalho(493, listaAlunos.get(6), listaTrabalhos.get(25), 5)); 
       this.lista.add(new NotaTrabalho(494, listaAlunos.get(6), listaTrabalhos.get(26), 3)); 
       this.lista.add(new NotaTrabalho(495, listaAlunos.get(6), listaTrabalhos.get(27), 2));
       this.lista.add(new NotaTrabalho(496, listaAlunos.get(6), listaTrabalhos.get(28), 8));
       this.lista.add(new NotaTrabalho(497, listaAlunos.get(6), listaTrabalhos.get(29), 5)); 
       this.lista.add(new NotaTrabalho(498, listaAlunos.get(6), listaTrabalhos.get(30), 4)); 
       this.lista.add(new NotaTrabalho(499, listaAlunos.get(6), listaTrabalhos.get(31), 2));
       this.lista.add(new NotaTrabalho(500, listaAlunos.get(6), listaTrabalhos.get(0), 1));
       this.lista.add(new NotaTrabalho(501, listaAlunos.get(6), listaTrabalhos.get(1), 6)); 
       this.lista.add(new NotaTrabalho(502, listaAlunos.get(6), listaTrabalhos.get(2), 7)); 
       this.lista.add(new NotaTrabalho(503, listaAlunos.get(6), listaTrabalhos.get(3), 4));
       this.lista.add(new NotaTrabalho(504, listaAlunos.get(6), listaTrabalhos.get(36), 2));
       this.lista.add(new NotaTrabalho(505, listaAlunos.get(6), listaTrabalhos.get(37), 8)); 
       this.lista.add(new NotaTrabalho(506, listaAlunos.get(6), listaTrabalhos.get(38), 2)); 
       this.lista.add(new NotaTrabalho(507, listaAlunos.get(6), listaTrabalhos.get(39), 3)); 

       this.lista.add(new NotaTrabalho(508, listaAlunos.get(7), listaTrabalhos.get(24), 7)); // nota Bruno 3
       this.lista.add(new NotaTrabalho(509, listaAlunos.get(7), listaTrabalhos.get(25), 4)); 
       this.lista.add(new NotaTrabalho(510, listaAlunos.get(7), listaTrabalhos.get(26), 2)); 
       this.lista.add(new NotaTrabalho(511, listaAlunos.get(7), listaTrabalhos.get(27),8));
       this.lista.add(new NotaTrabalho(512, listaAlunos.get(7), listaTrabalhos.get(28), 9));
       this.lista.add(new NotaTrabalho(513, listaAlunos.get(7), listaTrabalhos.get(29), 10)); 
       this.lista.add(new NotaTrabalho(514, listaAlunos.get(7), listaTrabalhos.get(30), 2)); 
       this.lista.add(new NotaTrabalho(515, listaAlunos.get(7), listaTrabalhos.get(31), 7));
       this.lista.add(new NotaTrabalho(516, listaAlunos.get(7), listaTrabalhos.get(0), 2));
       this.lista.add(new NotaTrabalho(517, listaAlunos.get(7), listaTrabalhos.get(1), 8)); 
       this.lista.add(new NotaTrabalho(518, listaAlunos.get(7), listaTrabalhos.get(2), 1)); 
       this.lista.add(new NotaTrabalho(519, listaAlunos.get(7), listaTrabalhos.get(3), 6));
       this.lista.add(new NotaTrabalho(520, listaAlunos.get(7), listaTrabalhos.get(36), 7));
       this.lista.add(new NotaTrabalho(521, listaAlunos.get(7), listaTrabalhos.get(37), 2)); 
       this.lista.add(new NotaTrabalho(522, listaAlunos.get(7), listaTrabalhos.get(38), 3)); 
       this.lista.add(new NotaTrabalho(523, listaAlunos.get(7), listaTrabalhos.get(39), 1));
       
       this.lista.add(new NotaTrabalho(524, listaAlunos.get(8), listaTrabalhos.get(24), 10)); // nota Giorgian 3
       this.lista.add(new NotaTrabalho(525, listaAlunos.get(8), listaTrabalhos.get(25), 5)); 
       this.lista.add(new NotaTrabalho(526, listaAlunos.get(8), listaTrabalhos.get(26), 3)); 
       this.lista.add(new NotaTrabalho(527, listaAlunos.get(8), listaTrabalhos.get(27), 2));
       this.lista.add(new NotaTrabalho(528, listaAlunos.get(8), listaTrabalhos.get(28), 8));
       this.lista.add(new NotaTrabalho(529, listaAlunos.get(8), listaTrabalhos.get(29), 5)); 
       this.lista.add(new NotaTrabalho(530, listaAlunos.get(8), listaTrabalhos.get(30), 4)); 
       this.lista.add(new NotaTrabalho(531, listaAlunos.get(8), listaTrabalhos.get(31), 2));
       this.lista.add(new NotaTrabalho(532, listaAlunos.get(8), listaTrabalhos.get(0), 1));
       this.lista.add(new NotaTrabalho(533, listaAlunos.get(8), listaTrabalhos.get(1), 6)); 
       this.lista.add(new NotaTrabalho(534, listaAlunos.get(8), listaTrabalhos.get(2), 7)); 
       this.lista.add(new NotaTrabalho(535, listaAlunos.get(8), listaTrabalhos.get(3), 4));
       this.lista.add(new NotaTrabalho(536, listaAlunos.get(8), listaTrabalhos.get(36), 2));
       this.lista.add(new NotaTrabalho(537, listaAlunos.get(8), listaTrabalhos.get(37), 8)); 
       this.lista.add(new NotaTrabalho(538, listaAlunos.get(8), listaTrabalhos.get(38), 2)); 
       this.lista.add(new NotaTrabalho(539, listaAlunos.get(8), listaTrabalhos.get(39), 3));
       
       this.lista.add(new NotaTrabalho(540, listaAlunos.get(9), listaTrabalhos.get(40), 2)); // nota Gerson 4
       this.lista.add(new NotaTrabalho(541, listaAlunos.get(9), listaTrabalhos.get(41), 5)); 
       this.lista.add(new NotaTrabalho(542, listaAlunos.get(9), listaTrabalhos.get(42), 5)); 
       this.lista.add(new NotaTrabalho(543, listaAlunos.get(9), listaTrabalhos.get(43), 5));
       this.lista.add(new NotaTrabalho(544, listaAlunos.get(9), listaTrabalhos.get(4), 7)); 
       this.lista.add(new NotaTrabalho(545, listaAlunos.get(9), listaTrabalhos.get(5), 8)); 
       this.lista.add(new NotaTrabalho(546, listaAlunos.get(9), listaTrabalhos.get(6), 2)); 
       this.lista.add(new NotaTrabalho(547, listaAlunos.get(9), listaTrabalhos.get(7), 8));
       this.lista.add(new NotaTrabalho(548, listaAlunos.get(9), listaTrabalhos.get(0), 1)); 
       this.lista.add(new NotaTrabalho(549, listaAlunos.get(9), listaTrabalhos.get(1), 9)); 
       this.lista.add(new NotaTrabalho(550, listaAlunos.get(9), listaTrabalhos.get(2), 10)); 
       this.lista.add(new NotaTrabalho(551, listaAlunos.get(9), listaTrabalhos.get(3), 9));
       this.lista.add(new NotaTrabalho(552, listaAlunos.get(9), listaTrabalhos.get(44), 7)); 
       this.lista.add(new NotaTrabalho(553, listaAlunos.get(9), listaTrabalhos.get(45), 5)); 
       this.lista.add(new NotaTrabalho(554, listaAlunos.get(9), listaTrabalhos.get(46), 5)); 
       this.lista.add(new NotaTrabalho(555, listaAlunos.get(9), listaTrabalhos.get(47), 2));       
       
       this.lista.add(new NotaTrabalho(556, listaAlunos.get(10), listaTrabalhos.get(40), 5)); // nota Piquerez 4
       this.lista.add(new NotaTrabalho(557, listaAlunos.get(10), listaTrabalhos.get(41), 5)); 
       this.lista.add(new NotaTrabalho(558, listaAlunos.get(10), listaTrabalhos.get(42), 5)); 
       this.lista.add(new NotaTrabalho(559, listaAlunos.get(10), listaTrabalhos.get(43), 9));
       this.lista.add(new NotaTrabalho(560, listaAlunos.get(10), listaTrabalhos.get(4), 10)); 
       this.lista.add(new NotaTrabalho(561, listaAlunos.get(10), listaTrabalhos.get(5), 2)); 
       this.lista.add(new NotaTrabalho(562, listaAlunos.get(10), listaTrabalhos.get(6), 8)); 
       this.lista.add(new NotaTrabalho(563, listaAlunos.get(10), listaTrabalhos.get(7), 5));
       this.lista.add(new NotaTrabalho(564, listaAlunos.get(10), listaTrabalhos.get(0), 3)); 
       this.lista.add(new NotaTrabalho(565, listaAlunos.get(10), listaTrabalhos.get(1), 2)); 
       this.lista.add(new NotaTrabalho(566, listaAlunos.get(10), listaTrabalhos.get(2), 7)); 
       this.lista.add(new NotaTrabalho(567, listaAlunos.get(10), listaTrabalhos.get(3), 9));
       this.lista.add(new NotaTrabalho(568, listaAlunos.get(10), listaTrabalhos.get(44),4)); 
       this.lista.add(new NotaTrabalho(569, listaAlunos.get(10), listaTrabalhos.get(45), 1)); 
       this.lista.add(new NotaTrabalho(570, listaAlunos.get(10), listaTrabalhos.get(46), 2)); 
       this.lista.add(new NotaTrabalho(571, listaAlunos.get(10), listaTrabalhos.get(47), 8));

       this.lista.add(new NotaTrabalho(572, listaAlunos.get(11), listaTrabalhos.get(40), 10)); // nota Rony 4
       this.lista.add(new NotaTrabalho(573, listaAlunos.get(11), listaTrabalhos.get(41), 1)); 
       this.lista.add(new NotaTrabalho(574, listaAlunos.get(11), listaTrabalhos.get(42),5)); 
       this.lista.add(new NotaTrabalho(575, listaAlunos.get(11), listaTrabalhos.get(43), 8));
       this.lista.add(new NotaTrabalho(576, listaAlunos.get(11), listaTrabalhos.get(4), 8)); 
       this.lista.add(new NotaTrabalho(577, listaAlunos.get(11), listaTrabalhos.get(5), 6)); 
       this.lista.add(new NotaTrabalho(578, listaAlunos.get(11), listaTrabalhos.get(6), 6)); 
       this.lista.add(new NotaTrabalho(579, listaAlunos.get(11), listaTrabalhos.get(7), 5));
       this.lista.add(new NotaTrabalho(580, listaAlunos.get(11), listaTrabalhos.get(0), 4)); 
       this.lista.add(new NotaTrabalho(581, listaAlunos.get(11), listaTrabalhos.get(1), 3)); 
       this.lista.add(new NotaTrabalho(582, listaAlunos.get(11), listaTrabalhos.get(2), 10)); 
       this.lista.add(new NotaTrabalho(583, listaAlunos.get(11), listaTrabalhos.get(3), 8));
       this.lista.add(new NotaTrabalho(584, listaAlunos.get(11), listaTrabalhos.get(44), 10)); 
       this.lista.add(new NotaTrabalho(585, listaAlunos.get(11), listaTrabalhos.get(45), 10)); 
       this.lista.add(new NotaTrabalho(586, listaAlunos.get(11), listaTrabalhos.get(46), 9)); 
       this.lista.add(new NotaTrabalho(587, listaAlunos.get(11), listaTrabalhos.get(47), 8));

       this.lista.add(new NotaTrabalho(588, listaAlunos.get(12), listaTrabalhos.get(16), 3)); // nota Victor 5
       this.lista.add(new NotaTrabalho(589, listaAlunos.get(12), listaTrabalhos.get(17), 7)); 
       this.lista.add(new NotaTrabalho(590, listaAlunos.get(12), listaTrabalhos.get(18), 8)); 
       this.lista.add(new NotaTrabalho(591, listaAlunos.get(12), listaTrabalhos.get(19), 9));
       this.lista.add(new NotaTrabalho(592, listaAlunos.get(12), listaTrabalhos.get(40),10)); 
       this.lista.add(new NotaTrabalho(593, listaAlunos.get(12), listaTrabalhos.get(41), 8)); 
       this.lista.add(new NotaTrabalho(594, listaAlunos.get(12), listaTrabalhos.get(42), 2)); 
       this.lista.add(new NotaTrabalho(595, listaAlunos.get(12), listaTrabalhos.get(43), 8));
       this.lista.add(new NotaTrabalho(596, listaAlunos.get(12), listaTrabalhos.get(20), 1)); 
       this.lista.add(new NotaTrabalho(597, listaAlunos.get(12), listaTrabalhos.get(21), 9)); 
       this.lista.add(new NotaTrabalho(598, listaAlunos.get(12), listaTrabalhos.get(22), 10)); 
       this.lista.add(new NotaTrabalho(599, listaAlunos.get(12), listaTrabalhos.get(23), 9));
       this.lista.add(new NotaTrabalho(600, listaAlunos.get(12), listaTrabalhos.get(28), 7)); 
       this.lista.add(new NotaTrabalho(601, listaAlunos.get(12), listaTrabalhos.get(29), 5)); 
       this.lista.add(new NotaTrabalho(602, listaAlunos.get(12), listaTrabalhos.get(30), 5)); 
       this.lista.add(new NotaTrabalho(603, listaAlunos.get(12), listaTrabalhos.get(31), 2));

       this.lista.add(new NotaTrabalho(604, listaAlunos.get(13), listaTrabalhos.get(16), 2)); // nota Diogo 5
       this.lista.add(new NotaTrabalho(605, listaAlunos.get(13), listaTrabalhos.get(17), 1)); 
       this.lista.add(new NotaTrabalho(606, listaAlunos.get(13), listaTrabalhos.get(18), 10)); 
       this.lista.add(new NotaTrabalho(607, listaAlunos.get(13), listaTrabalhos.get(19), 3));
       this.lista.add(new NotaTrabalho(608, listaAlunos.get(13), listaTrabalhos.get(40),8)); 
       this.lista.add(new NotaTrabalho(609, listaAlunos.get(13), listaTrabalhos.get(41), 6)); 
       this.lista.add(new NotaTrabalho(610, listaAlunos.get(13), listaTrabalhos.get(42), 4)); 
       this.lista.add(new NotaTrabalho(611, listaAlunos.get(13), listaTrabalhos.get(43), 5));
       this.lista.add(new NotaTrabalho(612, listaAlunos.get(13), listaTrabalhos.get(20), 3)); 
       this.lista.add(new NotaTrabalho(613, listaAlunos.get(13), listaTrabalhos.get(21), 2)); 
       this.lista.add(new NotaTrabalho(614, listaAlunos.get(13), listaTrabalhos.get(22), 8)); 
       this.lista.add(new NotaTrabalho(615, listaAlunos.get(13), listaTrabalhos.get(23), 6));
       this.lista.add(new NotaTrabalho(616, listaAlunos.get(13), listaTrabalhos.get(28), 5)); 
       this.lista.add(new NotaTrabalho(617, listaAlunos.get(13), listaTrabalhos.get(29), 3)); 
       this.lista.add(new NotaTrabalho(618, listaAlunos.get(13), listaTrabalhos.get(30), 3)); 
       this.lista.add(new NotaTrabalho(619, listaAlunos.get(13), listaTrabalhos.get(31), 1));

       this.lista.add(new NotaTrabalho(620, listaAlunos.get(14), listaTrabalhos.get(16), 10)); // nota Guilherme 5
       this.lista.add(new NotaTrabalho(621, listaAlunos.get(14), listaTrabalhos.get(17), 10)); 
       this.lista.add(new NotaTrabalho(622, listaAlunos.get(14), listaTrabalhos.get(18), 10)); 
       this.lista.add(new NotaTrabalho(623, listaAlunos.get(14), listaTrabalhos.get(19), 9));
       this.lista.add(new NotaTrabalho(624, listaAlunos.get(14), listaTrabalhos.get(40),6)); 
       this.lista.add(new NotaTrabalho(625, listaAlunos.get(14), listaTrabalhos.get(41), 5)); 
       this.lista.add(new NotaTrabalho(626, listaAlunos.get(14), listaTrabalhos.get(42), 4)); 
       this.lista.add(new NotaTrabalho(627, listaAlunos.get(14), listaTrabalhos.get(43), 3));
       this.lista.add(new NotaTrabalho(628, listaAlunos.get(14), listaTrabalhos.get(20), 2)); 
       this.lista.add(new NotaTrabalho(629, listaAlunos.get(14), listaTrabalhos.get(21), 1)); 
       this.lista.add(new NotaTrabalho(630, listaAlunos.get(14), listaTrabalhos.get(22), 5)); 
       this.lista.add(new NotaTrabalho(631, listaAlunos.get(14), listaTrabalhos.get(23), 2));
       this.lista.add(new NotaTrabalho(632, listaAlunos.get(14), listaTrabalhos.get(28), 1)); 
       this.lista.add(new NotaTrabalho(633, listaAlunos.get(14), listaTrabalhos.get(29), 5)); 
       this.lista.add(new NotaTrabalho(634, listaAlunos.get(14), listaTrabalhos.get(30), 2)); 
       this.lista.add(new NotaTrabalho(635, listaAlunos.get(14), listaTrabalhos.get(31), 7));

       this.lista.add(new NotaTrabalho(636, listaAlunos.get(15), listaTrabalhos.get(12), 8)); // nota Daniel 6
       this.lista.add(new NotaTrabalho(637, listaAlunos.get(15), listaTrabalhos.get(13), 4)); 
       this.lista.add(new NotaTrabalho(638, listaAlunos.get(15), listaTrabalhos.get(14), 3)); 
       this.lista.add(new NotaTrabalho(639, listaAlunos.get(15), listaTrabalhos.get(15), 6));
       this.lista.add(new NotaTrabalho(640, listaAlunos.get(15), listaTrabalhos.get(16),6)); 
       this.lista.add(new NotaTrabalho(641, listaAlunos.get(15), listaTrabalhos.get(17), 8)); 
       this.lista.add(new NotaTrabalho(642, listaAlunos.get(15), listaTrabalhos.get(18), 3)); 
       this.lista.add(new NotaTrabalho(643, listaAlunos.get(15), listaTrabalhos.get(19), 2));
       this.lista.add(new NotaTrabalho(644, listaAlunos.get(15), listaTrabalhos.get(44), 10)); 
       this.lista.add(new NotaTrabalho(645, listaAlunos.get(15), listaTrabalhos.get(45), 10)); 
       this.lista.add(new NotaTrabalho(646, listaAlunos.get(15), listaTrabalhos.get(46), 9)); 
       this.lista.add(new NotaTrabalho(647, listaAlunos.get(15), listaTrabalhos.get(47), 7));
       this.lista.add(new NotaTrabalho(648, listaAlunos.get(15), listaTrabalhos.get(40), 5)); 
       this.lista.add(new NotaTrabalho(649, listaAlunos.get(15), listaTrabalhos.get(41), 3)); 
       this.lista.add(new NotaTrabalho(650, listaAlunos.get(15), listaTrabalhos.get(42), 2)); 
       this.lista.add(new NotaTrabalho(651, listaAlunos.get(15), listaTrabalhos.get(43), 8));
       
       this.lista.add(new NotaTrabalho(652, listaAlunos.get(16), listaTrabalhos.get(12), 10)); // nota Igor 6
       this.lista.add(new NotaTrabalho(653, listaAlunos.get(16), listaTrabalhos.get(13), 10)); 
       this.lista.add(new NotaTrabalho(654, listaAlunos.get(16), listaTrabalhos.get(14), 9)); 
       this.lista.add(new NotaTrabalho(655, listaAlunos.get(16), listaTrabalhos.get(15), 7));
       this.lista.add(new NotaTrabalho(656, listaAlunos.get(16), listaTrabalhos.get(16),4)); 
       this.lista.add(new NotaTrabalho(657, listaAlunos.get(16), listaTrabalhos.get(17), 3)); 
       this.lista.add(new NotaTrabalho(658, listaAlunos.get(16), listaTrabalhos.get(18), 6)); 
       this.lista.add(new NotaTrabalho(659, listaAlunos.get(16), listaTrabalhos.get(19), 5));
       this.lista.add(new NotaTrabalho(660, listaAlunos.get(16), listaTrabalhos.get(44),9)); 
       this.lista.add(new NotaTrabalho(661, listaAlunos.get(16), listaTrabalhos.get(45), 7)); 
       this.lista.add(new NotaTrabalho(662, listaAlunos.get(16), listaTrabalhos.get(46), 6)); 
       this.lista.add(new NotaTrabalho(663, listaAlunos.get(16), listaTrabalhos.get(47), 6));
       this.lista.add(new NotaTrabalho(664, listaAlunos.get(16), listaTrabalhos.get(40), 5)); 
       this.lista.add(new NotaTrabalho(665, listaAlunos.get(16), listaTrabalhos.get(41), 4)); 
       this.lista.add(new NotaTrabalho(666, listaAlunos.get(16), listaTrabalhos.get(42), 6)); 
       this.lista.add(new NotaTrabalho(667, listaAlunos.get(16), listaTrabalhos.get(43), 7)); 

       this.lista.add(new NotaTrabalho(668, listaAlunos.get(17), listaTrabalhos.get(12), 7)); // nota Roberto 6
       this.lista.add(new NotaTrabalho(669, listaAlunos.get(17), listaTrabalhos.get(13), 7)); 
       this.lista.add(new NotaTrabalho(670, listaAlunos.get(17), listaTrabalhos.get(14), 6)); 
       this.lista.add(new NotaTrabalho(671, listaAlunos.get(17), listaTrabalhos.get(15), 5));
       this.lista.add(new NotaTrabalho(672, listaAlunos.get(17), listaTrabalhos.get(16),10)); 
       this.lista.add(new NotaTrabalho(673, listaAlunos.get(17), listaTrabalhos.get(17), 10)); 
       this.lista.add(new NotaTrabalho(674, listaAlunos.get(17), listaTrabalhos.get(18), 9)); 
       this.lista.add(new NotaTrabalho(675, listaAlunos.get(17), listaTrabalhos.get(19), 8));
       this.lista.add(new NotaTrabalho(676, listaAlunos.get(17), listaTrabalhos.get(44), 8)); 
       this.lista.add(new NotaTrabalho(677, listaAlunos.get(17), listaTrabalhos.get(45), 7)); 
       this.lista.add(new NotaTrabalho(678, listaAlunos.get(17), listaTrabalhos.get(46), 8)); 
       this.lista.add(new NotaTrabalho(679, listaAlunos.get(17), listaTrabalhos.get(47), 9));
       this.lista.add(new NotaTrabalho(680, listaAlunos.get(17), listaTrabalhos.get(40), 6)); 
       this.lista.add(new NotaTrabalho(681, listaAlunos.get(17), listaTrabalhos.get(41), 6)); 
       this.lista.add(new NotaTrabalho(682, listaAlunos.get(17), listaTrabalhos.get(42), 7)); 
       this.lista.add(new NotaTrabalho(683, listaAlunos.get(17), listaTrabalhos.get(43), 4));
       
       this.lista.add(new NotaTrabalho(684, listaAlunos.get(18), listaTrabalhos.get(8), 6)); // nota Cruz 7
       this.lista.add(new NotaTrabalho(685, listaAlunos.get(18), listaTrabalhos.get(9), 6)); 
       this.lista.add(new NotaTrabalho(686, listaAlunos.get(18), listaTrabalhos.get(10), 4)); 
       this.lista.add(new NotaTrabalho(687, listaAlunos.get(18), listaTrabalhos.get(11), 4));
       this.lista.add(new NotaTrabalho(688, listaAlunos.get(18), listaTrabalhos.get(24),10)); 
       this.lista.add(new NotaTrabalho(689, listaAlunos.get(18), listaTrabalhos.get(25), 10)); 
       this.lista.add(new NotaTrabalho(690, listaAlunos.get(18), listaTrabalhos.get(26), 9)); 
       this.lista.add(new NotaTrabalho(691, listaAlunos.get(18), listaTrabalhos.get(27), 9));
       this.lista.add(new NotaTrabalho(692, listaAlunos.get(18), listaTrabalhos.get(20), 4)); 
       this.lista.add(new NotaTrabalho(693, listaAlunos.get(18), listaTrabalhos.get(21), 2)); 
       this.lista.add(new NotaTrabalho(694, listaAlunos.get(18), listaTrabalhos.get(22), 1)); 
       this.lista.add(new NotaTrabalho(695, listaAlunos.get(18), listaTrabalhos.get(23), 7));
       this.lista.add(new NotaTrabalho(696, listaAlunos.get(18), listaTrabalhos.get(28), 10)); 
       this.lista.add(new NotaTrabalho(697, listaAlunos.get(18), listaTrabalhos.get(29), 7)); 
       this.lista.add(new NotaTrabalho(698, listaAlunos.get(18), listaTrabalhos.get(30), 7)); 
       this.lista.add(new NotaTrabalho(699, listaAlunos.get(18), listaTrabalhos.get(31), 8));

       this.lista.add(new NotaTrabalho(700, listaAlunos.get(19), listaTrabalhos.get(8), 2)); // nota Jackson 7
       this.lista.add(new NotaTrabalho(701, listaAlunos.get(19), listaTrabalhos.get(9), 10)); 
       this.lista.add(new NotaTrabalho(702, listaAlunos.get(19), listaTrabalhos.get(10), 8)); 
       this.lista.add(new NotaTrabalho(703, listaAlunos.get(19), listaTrabalhos.get(11), 9));
       this.lista.add(new NotaTrabalho(704, listaAlunos.get(19), listaTrabalhos.get(24),10)); 
       this.lista.add(new NotaTrabalho(705, listaAlunos.get(19), listaTrabalhos.get(25), 9)); 
       this.lista.add(new NotaTrabalho(706, listaAlunos.get(19), listaTrabalhos.get(26), 8)); 
       this.lista.add(new NotaTrabalho(707, listaAlunos.get(19), listaTrabalhos.get(27), 10));
       this.lista.add(new NotaTrabalho(708, listaAlunos.get(19), listaTrabalhos.get(20), 8)); 
       this.lista.add(new NotaTrabalho(709, listaAlunos.get(19), listaTrabalhos.get(21), 7)); 
       this.lista.add(new NotaTrabalho(710, listaAlunos.get(19), listaTrabalhos.get(22), 6)); 
       this.lista.add(new NotaTrabalho(711, listaAlunos.get(19), listaTrabalhos.get(23), 8));
       this.lista.add(new NotaTrabalho(712, listaAlunos.get(19), listaTrabalhos.get(28), 10)); 
       this.lista.add(new NotaTrabalho(713, listaAlunos.get(19), listaTrabalhos.get(29),8)); 
       this.lista.add(new NotaTrabalho(714, listaAlunos.get(19), listaTrabalhos.get(30), 9)); 
       this.lista.add(new NotaTrabalho(715, listaAlunos.get(19), listaTrabalhos.get(31), 9));
       
       this.lista.add(new NotaTrabalho(716, listaAlunos.get(20), listaTrabalhos.get(8), 9)); // nota Doc 7
       this.lista.add(new NotaTrabalho(717, listaAlunos.get(20), listaTrabalhos.get(9), 8)); 
       this.lista.add(new NotaTrabalho(718, listaAlunos.get(20), listaTrabalhos.get(10), 9)); 
       this.lista.add(new NotaTrabalho(719, listaAlunos.get(20), listaTrabalhos.get(11), 10));
       this.lista.add(new NotaTrabalho(720, listaAlunos.get(20), listaTrabalhos.get(24),10)); 
       this.lista.add(new NotaTrabalho(721, listaAlunos.get(20), listaTrabalhos.get(25), 10)); 
       this.lista.add(new NotaTrabalho(722, listaAlunos.get(20), listaTrabalhos.get(26), 7)); 
       this.lista.add(new NotaTrabalho(723, listaAlunos.get(20), listaTrabalhos.get(27), 9));
       this.lista.add(new NotaTrabalho(724, listaAlunos.get(20), listaTrabalhos.get(20), 6)); 
       this.lista.add(new NotaTrabalho(725, listaAlunos.get(20), listaTrabalhos.get(21), 6)); 
       this.lista.add(new NotaTrabalho(726, listaAlunos.get(20), listaTrabalhos.get(22), 5)); 
       this.lista.add(new NotaTrabalho(727, listaAlunos.get(20), listaTrabalhos.get(23), 9));
       this.lista.add(new NotaTrabalho(728, listaAlunos.get(20), listaTrabalhos.get(28), 10)); 
       this.lista.add(new NotaTrabalho(729, listaAlunos.get(20), listaTrabalhos.get(29), 8)); 
       this.lista.add(new NotaTrabalho(730, listaAlunos.get(20), listaTrabalhos.get(30), 8)); 
       this.lista.add(new NotaTrabalho(731, listaAlunos.get(20), listaTrabalhos.get(31),7));

       this.lista.add(new NotaTrabalho(732, listaAlunos.get(21), listaTrabalhos.get(32), 6)); // nota Fabricio 8
       this.lista.add(new NotaTrabalho(733, listaAlunos.get(21), listaTrabalhos.get(33), 8)); 
       this.lista.add(new NotaTrabalho(734, listaAlunos.get(21), listaTrabalhos.get(34), 5)); 
       this.lista.add(new NotaTrabalho(735, listaAlunos.get(21), listaTrabalhos.get(35), 3));
       this.lista.add(new NotaTrabalho(736, listaAlunos.get(21), listaTrabalhos.get(36),7)); 
       this.lista.add(new NotaTrabalho(737, listaAlunos.get(21), listaTrabalhos.get(37), 8)); 
       this.lista.add(new NotaTrabalho(738, listaAlunos.get(21), listaTrabalhos.get(38), 6)); 
       this.lista.add(new NotaTrabalho(739, listaAlunos.get(21), listaTrabalhos.get(39), 9));
       this.lista.add(new NotaTrabalho(740, listaAlunos.get(21), listaTrabalhos.get(8), 5)); 
       this.lista.add(new NotaTrabalho(741, listaAlunos.get(21), listaTrabalhos.get(9), 6)); 
       this.lista.add(new NotaTrabalho(742, listaAlunos.get(21), listaTrabalhos.get(10), 7)); 
       this.lista.add(new NotaTrabalho(743, listaAlunos.get(21), listaTrabalhos.get(11), 7));
       this.lista.add(new NotaTrabalho(744, listaAlunos.get(21), listaTrabalhos.get(16), 9)); 
       this.lista.add(new NotaTrabalho(755, listaAlunos.get(21), listaTrabalhos.get(17), 8)); 
       this.lista.add(new NotaTrabalho(756, listaAlunos.get(21), listaTrabalhos.get(18), 7)); 
       this.lista.add(new NotaTrabalho(757, listaAlunos.get(21), listaTrabalhos.get(19), 8));

       this.lista.add(new NotaTrabalho(758, listaAlunos.get(22), listaTrabalhos.get(32), 9)); // nota Everton 8
       this.lista.add(new NotaTrabalho(759, listaAlunos.get(22), listaTrabalhos.get(33), 8)); 
       this.lista.add(new NotaTrabalho(760, listaAlunos.get(22), listaTrabalhos.get(34), 8)); 
       this.lista.add(new NotaTrabalho(761, listaAlunos.get(22), listaTrabalhos.get(35), 7));
       this.lista.add(new NotaTrabalho(762, listaAlunos.get(22), listaTrabalhos.get(36),10)); 
       this.lista.add(new NotaTrabalho(763, listaAlunos.get(22), listaTrabalhos.get(37), 9)); 
       this.lista.add(new NotaTrabalho(764, listaAlunos.get(22), listaTrabalhos.get(38), 9)); 
       this.lista.add(new NotaTrabalho(765, listaAlunos.get(22), listaTrabalhos.get(39), 8));
       this.lista.add(new NotaTrabalho(766, listaAlunos.get(22), listaTrabalhos.get(8), 6)); 
       this.lista.add(new NotaTrabalho(767, listaAlunos.get(22), listaTrabalhos.get(9), 7)); 
       this.lista.add(new NotaTrabalho(768, listaAlunos.get(22), listaTrabalhos.get(10), 4)); 
       this.lista.add(new NotaTrabalho(769, listaAlunos.get(22), listaTrabalhos.get(11), 5));
       this.lista.add(new NotaTrabalho(770, listaAlunos.get(22), listaTrabalhos.get(16), 8)); 
       this.lista.add(new NotaTrabalho(771, listaAlunos.get(22), listaTrabalhos.get(17), 7)); 
       this.lista.add(new NotaTrabalho(772, listaAlunos.get(22), listaTrabalhos.get(18), 6)); 
       this.lista.add(new NotaTrabalho(773, listaAlunos.get(22), listaTrabalhos.get(19), 8));

       this.lista.add(new NotaTrabalho(774, listaAlunos.get(23), listaTrabalhos.get(32), 7)); // nota Hemerson 8
       this.lista.add(new NotaTrabalho(775, listaAlunos.get(23), listaTrabalhos.get(33), 6)); 
       this.lista.add(new NotaTrabalho(776, listaAlunos.get(23), listaTrabalhos.get(34), 8)); 
       this.lista.add(new NotaTrabalho(777, listaAlunos.get(23), listaTrabalhos.get(35), 7));
       this.lista.add(new NotaTrabalho(778, listaAlunos.get(23), listaTrabalhos.get(36),10)); 
       this.lista.add(new NotaTrabalho(779, listaAlunos.get(23), listaTrabalhos.get(37), 9)); 
       this.lista.add(new NotaTrabalho(780, listaAlunos.get(23), listaTrabalhos.get(38), 6)); 
       this.lista.add(new NotaTrabalho(781, listaAlunos.get(23), listaTrabalhos.get(39), 6));
       this.lista.add(new NotaTrabalho(782, listaAlunos.get(23), listaTrabalhos.get(8), 8)); 
       this.lista.add(new NotaTrabalho(783, listaAlunos.get(23), listaTrabalhos.get(9), 6)); 
       this.lista.add(new NotaTrabalho(784, listaAlunos.get(23), listaTrabalhos.get(10), 8)); 
       this.lista.add(new NotaTrabalho(785, listaAlunos.get(23), listaTrabalhos.get(11), 8));
       this.lista.add(new NotaTrabalho(786, listaAlunos.get(23), listaTrabalhos.get(16), 10)); 
       this.lista.add(new NotaTrabalho(787, listaAlunos.get(23), listaTrabalhos.get(17), 10)); 
       this.lista.add(new NotaTrabalho(788, listaAlunos.get(23), listaTrabalhos.get(18), 9)); 
       this.lista.add(new NotaTrabalho(789, listaAlunos.get(23), listaTrabalhos.get(19), 8));
    }

    public NotasTrabalhoFakeDB() {
        super();
    }
    
}

