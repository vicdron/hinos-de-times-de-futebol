package hinos.vicdron.com.hinosdetimesdefutebol;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import hinos.vicdron.com.hinosdetimesdefutebol.adapers.ItemClickListener;
import hinos.vicdron.com.hinosdetimesdefutebol.adapers.Section;
import hinos.vicdron.com.hinosdetimesdefutebol.adapers.SectionedExpandableLayoutHelper;
import hinos.vicdron.com.hinosdetimesdefutebol.models.Clube;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    RecyclerView mRecyclerView;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        ((AdView) findViewById(R.id.adView)).loadAd(new AdRequest.Builder().build());
        this.mRecyclerView = findViewById(R.id.recycler_view);

        SectionedExpandableLayoutHelper sectionedExpandableLayoutHelper = new SectionedExpandableLayoutHelper(this, this.mRecyclerView, this, 4);
        ArrayList<Clube> arrayList = new ArrayList<>();
        arrayList.add(new Clube(R.drawable.agua_santa, "agua_santa", "Agua Santa", R.raw.agua_santa, "Hey, Hey, Hey, Hey. \n\nOlha quem ta na área é o Água Santa\nVem que vem que vem\nVai vai que vai\nNinguém segura a Água\nEssa Água Santa\n\nA Água que ferveu meu coração\nA paixão empurra\nSangue, raça e luta\nNossa historia de superação\n\nÁgua Santa do meu coração\nMe arranca esse grito de gol\nSacode a torcida\nLevanta essa massa Água Santa\nÉ o Água Santa\n\nQuem é Água Santa\nNasce um vencedor\nHonra essa camisa\nNo final da cruz\nÁgua Santa lá na multidão\nA lágrima na hora do gol\n\nÁgua Santa do meu coração\nMe arranca esse grito de gol\nSacode a torcida\nLevanta essa massa Água Santa\nÉ o Água Santa\n\nÉ o Água Santa"));
        arrayList.add(new Clube(R.drawable.america_sao_jose, "america_riopreto", "América de Rio Preto", R.raw.america_riopreto, "Do alto da cidade\nO América nasceu\nE crescendo a cidade\nO América cresceu\n\nNo campo, lutando\nEspalhando emoções\nDentro das linhas vibrando\nSão onze corações\n\nNas cores rubra e branca\nEstá o seu valor\nNo branco a paz serena ( bis )\nNo rubro seu ardor ( bis )\n\nNo vale dos esportes vai dobrar o seu valor"));
        arrayList.add(new Clube(R.drawable.aracatuba, "aracatuba","Araçatuba", R.raw.aracatuba, "A Noroeste se encheu de galhardia,\nQuando o Canário entrou em campo,\nAí sua história, sua raça e alegria,\nTransformaram nossas tardes em magia.\nCampeão de tantas gerações,\nEnche de graça o interior e o coração,\nAqui, ali ou lá bem longe,\nO Canarinho é pura sensação!\nAqui , ali ou lá bem longe,\nO Canarinho é pura sensação!\nVai meu A.E.A, vai paixão\nSacudir Araçatuba de emoção!\nArranca o grito, explode o peito,\nO nosso A.E.A será sempre Campeão"));
        arrayList.add(new Clube(R.drawable.botafogosp, "botafogosp","Botafogo SP", R.raw.botafogosp, "Botafogo, Botafogo\nOrgulho de Ribeirão\n\nSua fibra, sua raça\nMantém a nossa tradição\n\nA bravura, da sua gente\nAcende nossos corações\n\nGrandioso Botafogo\nCeleiro de campeões\n\nFoi a Vila, Vila Tibério\nO berço do tricolor\n\nCrescendo sempre, se consagrando\nNa glória da região\n\nSem preconceito, tem branco e preto nela\nVermelho representa o sangue do Pantera\n\nNossa bandeira altaneira, varonil\nVai tremulando pelo céu do meu Brasil\n\nO tricolor de Santa Cruz ninguém engole\nPorque a galera do Pantera não é mole"));
        arrayList.add(new Clube(R.drawable.corinthians, "corinthians","Corinthians", R.raw.corinthians, "Salve o Corinthians\nO campeão dos campeões\nEternamente dentro dos nossos corações\nSalve o Corinthians\nDe tradições e glórias mil\nTu és o orgulho dos desportistas do Brasil\n\nTeu passado é uma bandeira\nTeu presente é uma lição\nFiguras entre os primeiros\nDo nosso esporte bretão\n\nCorinthians grande\nSempre altaneiro\nÉs do Brasil o clube mais brasileiro"));
        arrayList.add(new Clube(R.drawable.ferroviaria,"ferroviaria", "Ferroviária", R.raw.ferroviaria, "O Povo está Feliz\nTem Futebol\ncom a Ferroviária\nda Morada do Sol\n\nAvinhado na camisa\nque emoção\nSalve Ferroviária\ndo meu Coração\n\nFerroviária, amo você\nEm qualquer hora e tempo\nSeu lema é vencer\n\nAraraquara, venturas mil\nViva Ferroviária\num orgulho do Brasil."));
        arrayList.add(new Clube(R.drawable.flamengo_guarulhos,"flamengo_guarulhos", "Flamengo de Guarulhos", R.raw.flamengo_guarulhos, "Minha paixão tem oito listras\nCom duas cores eu me cubro\nPois sou Flamengo, sou Flamengo meu amor\nMeu coração é negro e rubro\n\nNo Município de Guarulhos\nEstá gravada sua história\nPois sou Flamengo, sou Flamengo meu amor\nNo seu futuro está a glória\n\nFlamengo, Flamengo, Flamengo\nA voz ninguém há de calar\nO grito de guerra que trago\nNo tempo irá ecoar\n\nTransborda o meu coração\nDe amor pela Associação\nAtlética Flamengo\nMeu eterno campeão"));
        arrayList.add(new Clube(R.drawable.guarani, "guarani","Guarani", R.raw.guarani, "Eu levo sempre comigo\nEm todo campo que eu vou\nA bandeira do verde e branco\nSimbolo do torcedor.\n\nBrinco de Ouro a nossa taba\nConstruido com devoção\nNossa família bugrina\nTem raça, e tradição.\n\nAvante, Avante meu bugre\nCom fibra e destemor\nA cada nova jornada\nGuarani, é mais amor.\n\nAvante, Avante meu bugre\nQue nós vibramos por ti\nNa vitória ou na derrota\nHoje e sempre Guarani."));
        arrayList.add(new Clube(R.drawable.gremio_osasco,"gremio_osasco", "Grêmio Osasco", R.raw.gremio_osasco, "É gol, é go,l é gol\nO grêmio osasco é gol\nÉ gol, é go,l é gol\nO grêmio osasco é gol\n\nVerde, branco e vermelho\nSão as cores da nossa bandeira!\nA cidade trabalha a capital da viola\nTambém manda na bola\n\nVerde, branco e vermelho\nSão as cores da nossa bandeira!\nA cidade trabalha a capital da viola\nTambém manda na bola\n\nOnde o meu time for jogar eu vou\nOnde o meu time for jogar eu vou\nOnde o meu time for jogar eu vou\nOnde o meu time for jogar eu vou\nOnde o meu time for jogar eu vou\nOnde o meu time for jogar eu vou\n\nEhhhh leleoooo.........\nLeleooooooooo\nEhhhh leleoooooooo.........\nLeleooooooooo"));
        arrayList.add(new Clube(R.drawable.inter_limeira, "inter_limeira","Inter de Limeira", R.raw.inter_limeira, "Eis a equipe altaneira\nDo bravo Internacional\nque p'ra glória de Limeira\nNão teme nenhum rival.\n\nOh! Leão, Oh, meu Leão\nEntra firme no gramado\nVai com garra e coração\nPara um gol bem conquistado\nRuge Leão... Aaaaaa.... Uuuuuuuu...\nUrra Leão... Aaaaa... Uuuuuuu\n\nPé na bola, sem demora\nSacode a juba, meu Leão\nsejas hoje, como outrora\nSempre, sempre, campeão...\n\nOh! Leão, Oh, meu Leão\nEntra firme no gramado\nVai com garra e coração\nPara um gol bem conquistado\nRuge Leão... Aaaaaa.... Uuuuuuuu...\nUrra Leão... Aaaaa... Uuuuuuu"));
        arrayList.add(new Clube(R.drawable.ituano, "ituano","Ituano", R.raw.ituano, "Galo rubro-negro altaneiro\nForte, valente e audaz\nÉs um gigante guerreiro\nItuano você é demais\n\nVencedor, sempre em frente\nNão há ninguém como tu\nJoga essa bola na rede\nAh, rubro negro de Itu\n\nOlê olá pode o mundo se acabar\nOlê olê vamos sempre com você\nNão há ninguém como tu\nAh, rubro negro de Itu\n\nItuano, Ituano, Ituano…\nQue coisa linda, és o maioral!\nDentro de campo, um só pensamento\nOutra vitória, seu lema é ganhar\n\nSua bandeira balança\nDistinto e amado brasão\nA grande massa proclama\nItuano, és o grande campeão!"));
        arrayList.add(new Clube(R.drawable.juventus, "juventus","Juventus", R.raw.juventus, "Esse moleque travesso\nQue tem nome e tradição\nMerece nosso respeito\nÉ a força jovem da nação\n\nEsse moleque travesso\nQue tem nome e tradição\nMerece nosso respeito\nÉ a força jovem da nação\n\nQue belo time\nQue belo esquadrão\nJuventus amigo\nDo meu coração\n\nQue belo time\nQue belo esquadrão\nJuventus amigo\nDo meu coração\n\nJuventus, Juventus\nEu estou aqui\nVamos torcer juntos Juventus\nE daqui nunca mais sair\n\nJuventus, Juventus\nEu estou aqui\nVamos torcer juntos Juventus\nE daqui nunca mais sair\n\nQue belo time\nQue belo esquadrão\nJuventus amigo\nDo meu coração\n\nQue belo time\nQue belo esquadrão\nJuventus amigo\nDo meu coração\n\nJuventus, Juventus\nEu estou aqui\nVamos torcer juntos Juventus\nE daqui nunca mais sair\n\nJuventus, Juventus\nEu estou aqui\nVamos torcer juntos Juventus\nE daqui nunca mais sair"));
        arrayList.add(new Clube(R.drawable.oeste_sp, "oeste","Oeste", R.raw.oeste, "Olê, olê, olê\nOlê, olê, olá\nA garra rubro-negra\nTá botando pra quebrar\n\nA minha alegria\nÉ ver meu time jogar\nQuando minha equipe está beleza\nÉ alegria pra lá e pra cá\n\nMas quando o jogo aperta\nEu vejo é na moral\nOeste, aqui estou!\nE dá-lhe rubro\nÉ gol, é gol, é gol, é gol, é gol\n\nOlê olê olê\nOlê olê olá\nA garra rubro-negra\nTá botando pra quebrar\n\nO seu futuro,\nÉ certo e não tem zebra não.\nPois a galera mirim\nQuer ver o time, campeão\n\nVeja que beleza\nA festa do meu povão\nOeste, aqui estou!\nE dá-lhe rubro\nÉ gol, é gol, é gol, é gol, é gol\n\nOlê, olê, olê\nOlê, olê, olá\nA garra rubro-negra\nTá botando pra quebrar"));
        arrayList.add(new Clube(R.drawable.marilia, "marilia","Marília", R.raw.marilia, "E... e... o...\nÉ o MAC que chegou\nCom raça e tradição\nMAC MAC Campeão (bis)\n\nMarília, sua força e sua raça\nToque de bola que alegra essa massa\nAlvi-celeste que balança o Abreuzão\nSalve, Salve o Tigrão\n\nAzul e branco, a cor da nossa nação\nMarília, é você a minha paixão\nEssa torcida a ti declara o seu amor\nMarília, sempre, sempre vencedor"));
        arrayList.add(new Clube(R.drawable.mirassol,"mirassol", "Mirassol", R.raw.mirassol, "O meu coração entra em campo\nCom o Mirassol\nÉ o verde, amarelo e branco\nRaça e futebol\n\nLeão, o meu campeão rugindo\nNo país do futebol\nSalve, salve o meu leão querido\nsalve o Mirassol\n\nO meu coração entra em campo\nCom o mirassol\nÉ o verde, amarelo e branco\nRaça e futebol\n\nLeão, o meu campeão rugindo\nNo país do futebol\nSalve, salve o meu leão querido\nsalve o Mirassol\n\ne bate forte a emoção\neu grito: gol… leão leão\neu quero ver você vencer\nleão, leão, leão"));
        arrayList.add(new Clube(R.drawable.noroeste, "noroeste","Noroeste", R.raw.noroeste, "Avante, avante, Noroeste,\nBauru com emoção\nAlça essa bandeira alvirrubra,\nao pé do coração!\nAvante, avante mocidade,\nvanguarda varonil\ne luta por Bauru,\nque é uma cidade\nmaravilhosa deste Brasil\n\nAvante, Noroeste,\nhonra a camisa e em máscula vitória\nno peito e na raça, com garra e amor\nescreve a tua história"));
        arrayList.add(new Clube(R.drawable.novorizontino, "novorizontino","Novorizontino", R.raw.novorizontino, "Entra em campo veloz e imponente\nConcentrado na força da gloria\nLivre, audaz, majestoso e valente\nSó buscando ideais e vitórias.\n\nA vitória que surge de lutas\nDe heróis de vanguarda e valor\nDemonstrando a união desta equipe\nVence sempre com garra e glamour\n\nAuri negro tu és vencedor\nSalve o líder sagaz varonil\nAuri negro tu és esperança\nDesse novo horizonte, brasil"));
        arrayList.add(new Clube(R.drawable.palmeiras, "palmeiras","Palmeiras", R.raw.palmeiras, "Quando surge o alviverde imponente\nNo gramado em que a luta o aguarda\nSabe bem o que vem pela frente\nQue a dureza do prélio não tarda\n\nE o Palmeiras no ardor da partida\nTransformando a lealdade em padrão\nSabe sempre levar de vencida\nE mostrar que de fato é campeão\n\nDefesa que ninguém passa\nLinha atacante de raça\nTorcida que canta e vibra\n\nPor nosso alviverde inteiro\nQue sabe ser brasileiro\nOstentando a sua fibra"));
        arrayList.add(new Clube(R.drawable.paulista, "paulista","Paulista", R.raw.paulista, "Tricolor, meu clube amado,\nTeu caminho é o da glória,\nSegue avante no gramado,\nTraz os louros da vitória,\nMas se a luta te enfraquece,\nA poder dos desenganos,\nA história não te esquece,\nTu és Paulista, dos veteranos,\nPaulista, Paulista, Paulista,\nÉ o jundiaiense que quer ver-te campeão,\nPaulista, Paulista, Paulista,\nTu és o clube mais querido do torrão,\nPaulista, Paulista, Paulista,\nTua bandeira gloriosa quer por ti,\nGuardar silente a alegria da conquista,\nTu és Paulista, de Jundiaí."));
        arrayList.add(new Clube(R.drawable.ponte,"ponte", "Ponte Preta", R.raw.ponte, "Estandarte desfraldado\npreto e branco é sua cor\nPonte Preta vai pro campo\nprá mostrar o seu valor\n\nPonte Preta inflamante\nPonte Preta emoção\nPonte Preta gigante\nraça de campeão\n\nSeu estádio é o Majestoso\nseu nome uma glória\nPonte Preta sempre sempre\nna derrota ou na vitória\n\nÉs a nossa Ponte Preta\nO orgulho de nossa terra\nPonte Preta de paz\nPonte Preta de guerra\n\nPonte Preta de paz\nPonte Preta de guerra"));
        arrayList.add(new Clube(R.drawable.portuguesa,"portuguesa", "Portuguesa", R.raw.portuguesa, "Vamos à luta, ó campeões,\nHão de vibrar os nossos corações,\nDa tua glória, toda a certeza,\nQue tu és grande, ó Portuguesa.\n\nVamos á luta, ó campeões,\nHá de brilhar a cruz de teus brasões,\nE tua bandeira, verde encarnada,\nQue é a luz de tua jornada,\n\nVitória é a certeza\nDa tua força e tradição.\nEm campo, ó Portuguesa,\nPra nós és sempre um time campeão"));
        arrayList.add(new Clube(R.drawable.portuguesa_santista,"portuguesa_santista", "Portuguesa Santista", R.raw.portuguesa_santista, "Exuberante futebol,\n\nO da Portuguesa\n\nFaça chuva ou faça sol.\n\nO teu passado,\n\nA tua história,\n\nDeixam teus atletas\n\nacobertados de glória…\n\nNo teu presente\n\nÉs fabril,\n\nÉs a fita azul\n\nEm rubro-verde\n\nDo Brasil\n\nTens a façanha,\n\nBola no pé.\n\nMassa em delírio,\n\nÉ grito de olé. (BIS)\n\nNo teu plantel\n\nHá galhardia,\n\nEm Úlrico Mursa\n\nHá juventude noite e dia.\n\nE seu lema\n\nÉ não desista,\n\nMais briosa\n\nA Portuguesa Santista (BIS)."));
        arrayList.add(new Clube(R.drawable.red_bull_bragantino, "bragantino","Red Bull Bragantino", R.raw.bragantino, "É o alvinegro em ação, \nBragança toda se inflama. \nMassa Bruta, campeão, \nna força de uma raça, na luta já vencida, \nergamos sempre uma taça. Avante, fiel torcida. \nBragatino, o melhor, \nprimeiro em emoção, no campo é o maior.\n\nArrebenta coração. \nDefesa bem guardada, \na arte dentro do campo,\nvelocidade no ataque, \ne a bola entrando no canto. \n\nOlê, olê, olê, olá, \no Massa Bruta só joga pra ganhar, \nVamos lá rapaz, vamos lá menino, \nVenham, \nvamos todos, Futebol é Bragantino."));
        arrayList.add(new Clube(R.drawable.rio_branco_sp,"rio_branco_sp", "Rio Branco - SP", R.raw.rio_branco_sp, "Tigre, Tigre, Tigre, Tigre\nTigre, Tigre, Tigre, Tigre\n\nVocê chegou e nos conquistou\nDe alegria nos inundou\nRio Branco, força do interior\nSua grandeza há de se espalhar\nTem tradição, tem história enfim\nNo seu passado já demonstrou\nHoje é festa, é encantos mil\nFuturo alegre aos filhos será\nGarra, brilho e determinação\nCoragem, domínio e vibração\nOnde estiver, lá estarei torcendo com devoção.\n\nRio Branco, Rio Branco, sempre gritarei\nRio Branco, Rio Branco, Rio Branco do coração\nRio Branco, Rio Branco, sempre gritarei\nRio Branco, Rio Branco, de Americana tu és\nTigre, Tigre, Tigre, Tigre..."));
        arrayList.add(new Clube(R.drawable.santoandre,"santoandr", "Santo André", R.raw.santoandr, "Santo André do coração\nÉs dos clubes o maior\nUma equipe de valor\nPara defender o nosso futebol\n\nSuas cores nos encantam\nEm cada lance a torcida se levanta\nNum movimento de bandeiras\nEm coro te saúda e a vida encanta\n\nSalve, salve oh grandioso\nEsporte Clube Santo André\nSalve, salve oh glorioso\nSanto André da minha fé\n\nDe João Ramalho a tradição\nPois traz no peito seu brasão\nÉs lutador grande guerreiro és valente\nNo esporte-rei és campeão, és campeão"));
        arrayList.add(new Clube(R.drawable.santos,"santos", "Santos", R.raw.santos, "Sou alvinegro da Vila Belmiro\nO Santos vive no meu coração\nÉ o motivo de todo o meu riso\nDe minhas lágrimas e emoção\n\nSua bandeira no mastro é a história\nDe um passado e um presente só de glórias\nNascer, viver e no Santos morrer\nÉ um orgulho que nem todos podem ter\n\nNo Santos pratica-se o esporte\nCom dignidade e com fervor\nSeja qual for a sua sorte\nDe vencido ou vencedor\n\nCom técnica e disciplina\nDando o sangue com amor\nPela bandeira que ensina\nLutar com fé e com ardor"));
        arrayList.add(new Clube(R.drawable.sao_bento,"sao_bento", "São Bento", R.raw.sao_bento, "Gol sorocabano, vai ganhando azulão...\nGente de tutano tricotando o balão...\nArte do bailado sobre as linhas de cal,\nRitmo exaltado, precisão genial!\nGol alvi-celeste ecoando no ar...\nQuando bem fizeste\nEnsinando a ganhar\nNa emoção mais alta da porfia,\nNo calor da simpatia\nDe quem já te viu jogar.\nForça e mocidade,\nGlória da cidade...\nQue monumento\nÉ o meu querido são bento\nDe sorocaba expansiva,\nEm prol do esporte e do labor...\nSalve a chama sempre viva,\nQue me inspira, minha lira\nDe torcedor!\nSalve o afã beneditino,\nNossa história, mais um hino,\nMeu imenso amor!"));
        arrayList.add(new Clube(R.drawable.saocaerano,"saocaetano", "São Caetano", R.raw.saocaetano, "No dia quatro de dezembro aconteceu\nAquele fato que marcou a nossa história\nFoi nessa data que, pujante ele nasceu\nUm clube já predestinado para a glória\nCom disciplina e respeitando seus rivais\nParte pra luta para ser o \"Campeão\"\nLeva a torcida... para o delírio\nAlegra o meu coração\nSão Caetano... vamos pra vitória\nNosso objetivo é só o gol... \"gol !\"\nMarque prá sempre, fique na memória\nMostre ao povo o que é futebol\nSão Caetano... brilhe e a sua luz\nSe perpetuará na imensidão\nHonre a cidade que te batizou\nOstenta, no alto, seu pendão"));
        arrayList.add(new Clube(R.drawable.sao_jose,"sao_jose_sp", "São José", R.raw.sao_jose_sp, "Vai, pelo céu do Brasil,\nVai, nesse azul de anil,\nAGUIA DO VALE voou...\nBuscando com suas garras mais um gol\n(Goooool...!)\n\nVai, Glorioso esquadrão,\nVai, o grande Campeão\nMostrar a todo Brasil\nO que é\nA sua forca e garra\nOh! Grande São José\n\nVocê sempre será\nOrgulho do País\nContigo São José\nMe sinto tão feliz\nNasceu para vitorias\nÉs nato campeão\nOrgulho da cidade\nE de toda Nação\n\nÁGUIA DO VALE eu sei,\nTerás vitórias mil\nIrás sobrevoar\nOs Campos do Brasil\nNão ha quem te agüente,\nEs forte, es varonil\nCampeão do meu Brasil...\n"));
        arrayList.add(new Clube(R.drawable.saopaulo, "saopaulo","São Paulo", R.raw.saopaulo, "Salve o tricolor paulista\nAmado clube brasileiro\nTu és forte, tu és grande\nDentre os grandes és o primeiro\nÓ tricolor\nClube bem amado\nAs tuas glórias\nVêm do passado\n\nSão teus guias brasileiros\nQue te amam eternamente\nDe são paulo tens o nome\nQue ostentas dignamente\n\nSão paulo clube querido\nTu tens o nosso amor\nTeu nome e tuas glórias\nTêm honra e resplendor\n\nTuas cores gloriosas\nDespertam amor febril\nPela terra bandeirante:\nHonra e glória do brasil\n\nTrazes glórias luminosas\nDo paulistano imortal\nDa floresta também trazes\nUm brilho tradicional"));
        arrayList.add(new Clube(R.drawable.uniao_sao_joao, "uniao_sao_joao","União São João", R.raw.uniao_sao_joao, "Alvi-verde são as cores\nDo maior dos meus amores\nQuem abrir meu coração\nVai encontrar lá, gravado\nUnião São João\n\nÉ garra, é força, é Fibra, é raça\nEsse é o time da massa\nNão existe maior emoção\nQue ser torcedor\nDo União São João\n\nTens a fibra e o fascínio\nDo teu pai o grande Hermínio\nÉs de Araras o guerreiro\n\nNão há nada que espante\nNem que te faça tremer\nNo gramado és um gigante\nQue ninguém pode vencer\n\nUnião, União, União São João\nEu sou União São João pra valer\nUnião, União, União São João\nUnião vou ser enquanto eu viver"));
        arrayList.add(new Clube(R.drawable.xv_jau_sp,"xv_jau", "XV de Jaú", R.raw.xv_jau, "XV de Jaú,\nÉs gloria e tradição,\nSua história é tão bela,\nDe amor e união.\n\nSalve o XV de Jaú,\nOrgulho da cidade,\nGanhando ou perdendo,\nNos enche de vaidade.\n\nÉs verde e amarelo,\nDas cores do Brasil,\nGalo imponente,\nDe vitórias mil.\n\nQuando entra em campo,\nCom fibra de campeão,\nDe Galo é chamado,\nPela multidão.\n\n\nSalve o XV de Jaú,\nUniu a cidade inteira,\nE colocou o seu nome,\nEntre as melhores equipes brasileiras.\n\nÉs verde e amarelo,\nDas cores do Brasil,\nGalo imponente,\nDe vitórias mil."));
        arrayList.add(new Clube(R.drawable.xv_ipiracicaba,"xv_piracicaba", "XV de Piracicaba", R.raw.xv_piracicaba, "Salve XV de Novembro\nGlorioso esquadrão\nNa vitória ou na derrota\nEsta em nosso coração\nNo basquete e futebol\nÉ motivo de vaidade\nPioneiro da lei do acesso\nEngrandece nossa cidade\nVamos XV para frente\nOutra vitória conquistar\nDestemido e valente\nSó nos pode orgulhar\nVamos XV para frente\nOutra vitória conquistar\nA torcida está presente\nPara sempre incentivar"));
        sectionedExpandableLayoutHelper.addSection("  PAULISTAS", arrayList);

        ArrayList<Clube> arrayList2 = new ArrayList<>();
        arrayList2.add(new Clube(R.drawable.americarj, "americarj","América RJ", R.raw.americarj, "Hei de torcer, torcer, torcer...\nHei de torcer até morrer, morrer, morrer...\nPois a torcida americana é toda assim\nA começar por mim\nA cor do pavilhão é a cor do nosso coração\nEm nossos dias de emoção\nToda torcida cantará esta canção\nTra-la-la-la-la-la\nTra-la-la-la-la-la\nTra-la-la-la-la\n\nCampeões de 13, 16 e 22\nTra-la-la\nTemos muitas glórias\nE surgirão outras depois\nTra-la-la\nCampeões com a pelota nos pés\nFabricamos aos montes, aos dez\nNós ainda queremos muito mais\nAmérica unido vencerás!"));
        arrayList2.add(new Clube(R.drawable.americano_rj, "americano","Americano", R.raw.americano, "Americano, Americano\nEu me orgulho em ser seu torcedor\nA camisa alvi-negra glorifica e no gramado agiganta o jogador\nDe vitória em vitória, o Americano escreve a sua história\nOnde perfilam a fibra na disputa, a honra de vencer\nEm cada luta a multidão a torcer, por isso ele cresce a cada ano\nQuerido glorioso, meu Americano\nQuerido glorioso, meu Americano"));
        arrayList2.add(new Clube(R.drawable.bangu, "bangu","Bangu", R.raw.bangu, "O Bangu tem também a sua história, a sua glória,\nEnchendo seus fãs de alegria!\nDe lá, pra cá,\nSurgiu Domingos da Guia.\nEm Bangu se o clube vence há na certa um feriado,\nComércio fechado.\nA torcida reunida até parece a do FlaFlu:\nBangu, Bangu, Bangu!\nO Bangu tem também como divisa na camisa:\nO vermelho-sangue a brilhar.\nE faz cartaz,\nEstouram foguetes no ar!\nEm Bangu se o clube vence há na certa um feriado,\nComércio fechado.\nA torcida reunida até parece a do FlaFlu:\nBangu, Bangu, Bangu!"));
        arrayList2.add(new Clube(R.drawable.boa_vista_rj, "boa_vista_rj","Boa Vista", R.raw.boa_vista_rj, "O Boavista é um clube de tradição\nVamos torcer de todo o coração\nTorcida aplaude esse clube que surgiu\nO Boavista é o preferido do Brasil\n\nO verde é a natureza\nFeliz é a nação\nLevante a nossa bandeira\nO Boavista é o orgulho do povão\n\nTocando a bola e dando olé\nO povo grita, se põe em pé\nO time jogando um bolão\nRolando a bola pra ganhar, ser campeão"));
        arrayList2.add(new Clube(R.drawable.botafogo,"botafogo", "Botafogo", R.raw.botafogo, "Botafogo, Botafogo\nCampeão desde 1910\nFoste herói em cada jogo, Botafogo\nPor isso é que tu és\n\nE hás de ser\nNosso imenso prazer\nTradições,\nAos milhões tens também.\n\nTu és O Glorioso\nNão podes perder,\nPerder pra ninguém\n\nNoutros esportes\nTua fibra está presente\nHonrando as cores,\ndo Brasil de nossa gente\n\nNa estrada do louros\nNum faixe de luz\nTua estrela solitária\nTe conduz"));
        arrayList2.add(new Clube(R.drawable.cabofriense,"cabofriense", "Cabofriense", R.raw.cabofriense, "Sou Tricolor por mil razões sou o mais forte \nE no esporte serei sempre campeão \nHei de lutar \nHei de vencer! \nCabofriense hei de ser até morrer \nHei de lutar \nHei de vencer! \nCabofriense hei de ser até morrer. \n \nNo futebol sou o melhor é evidente \nNossa torcida a cada jogo está presente \nVerde é esperança \nO branco é paz \nVermelho é raça que o meu time sempre traz. \nVerde é esperança \nO branco é paz \nVermelho é raça que o meu time sempre traz. "));
        arrayList2.add(new Clube(R.drawable.flamengo, "flamengo","Flamengo", R.raw.flamengo, "Uma vez Flamengo\nSempre Flamengo\nFlamengo sempre eu hei de ser\nÉ o meu maior prazer\nVe-lo brilhar\nSeja na terra\nSeja no mar\nVencer, vencer, vencer\n\nUma vez Flamengo\nFlamengo até morrer\n\nNa regata ele me mata\nMe maltrata, me arrebata\nQue emoção no coração\nConsagrado no gramado\nSempre amado, o mais cotado\nNos \"Fla-Flus é o Ai, Jesus\"\nEu teria um desgosto profundo\nSe faltasse o Flamengo no mundo\nEle vibra, ele é fibra\nMuita libra já pesou\nFlamengo até morrer eu sou"));
        arrayList2.add(new Clube(R.drawable.fluminense, "fluminense","Fluminense", R.raw.fluminense, "Sou tricolor de coração\nSou do clube tantas vezes campeão\nFascina pela sua disciplina\nO Fluminense me domina\nEu tenho amor ao tricolor\nSalve o querido pavilhão\nDas três cores que traduzem tradição\nA paz, a esperança e o vigor\nUnido e forte pelo esporte\nEu sou é tricolor\nVence o Fluminense\nCom o verde da esperança\nPois quem espera sempre alcança\nClube que orgulha o Brasil retumbante\nDe glórias e vitórias mil\nSou tricolor de coração\nSou do clube tantas vezes campeão\nFascina pela sua disciplina\nO Fluminense me domina\nEu tenho amor ao tricolor\nSalve o querido pavilhão\nDas três cores que traduzem tradição\nA paz, a esperança e o vigor\nUnido e forte pelo esporte\\nEu sou é tricolor\\nVence o Fluminense\nCom o sangue do encarnado\nCom amor e com vigor\nFaz a torcida querida vibrar com emoção\nDo tricampeão\n"));
        arrayList2.add(new Clube(R.drawable.friburguense, "friburguense","Friburguense", R.raw.friburguense, "Friburguense Friburguense, orgulho da nossa terra\nFriburguense Friburguense, salve o tricolor da serra [2x]\nO azul do céu te pertence,\nvermelho é sangue é amor,\no branco a paz de quem vence,\nFriburguense é vencedor\n\nIremos contigo a qualquer lugar\nvibrando e cantando como torcedor\ne sabe o que ter o prazer de ganhar\ne sabe o que ter coração tricolor\n\nFriburguense Friburguense , orgulho da nossa terra\nFriburguense Friburguense , salve o tricolor da serra [2x]\n\nO azul do céu te pertence,\nvermelho é sangue é amor,\no branco a paz de quem vence,\nFriburguense é vencedor\n\nNos contes mais fontes no manto de gloria\nno peito uma estrela de luz e paixão\nEu sou Friburguense e a sua historia\né minha vitória é minha emoção.\n\nFriburguense Friburguense , orgulho da nossa terra\nFriburguense Friburguense , salve o tricolor da serra (2x)"));
        arrayList2.add(new Clube(R.drawable.goytacaz, "goytacaz","Goytacaz", R.raw.goytacaz, "Sou Goytacaz, sou Goytacaz até morrer,\nNosso lema é vencer, vencer,\nNa vitória, na derrota, na alegria no amargor,\nSou Goytacaz sim senhor,\nSou Goytacaz por amor.\n\nSou Goytacaz, sou Goytacaz até morrer,\nNosso lema é vencer, vencer,\nNa vitória, na derrota, na alegria no amargor,\nSou Goytacaz sim senhor,\nSou Goytacaz por amor.\n\nNossa camisa, Alvi-anil,\nTem suas cores destacadas na bandeira do Brasil,\nMinha Campos te amos demais,\nPor isso sou torcedor do Goytacaz,\nE no gramado,\nNinguém faz o que ele faz."));
        arrayList2.add(new Clube(R.drawable.macae, "macae_rj","Macaé", R.raw.macae_rj, "Vamos cantar, numa só voz\nMacaé Esporte é campeão\nCom muita raça\nPerseverança\nMacaé Esporte é garra e emoção\nSomos guerreiros\nNão tem fronteiras\nMacaé é a nação brasileira\n\nDesde 1990\nEsse clube tantas glórias conquistou\nDando alegria a essa torcida organizada\nCom muita luta, muita raça e muito amor\n\nNós vamos dar olé\nEu vou gritar: é gol!\nMacaé tá botando pra quebrar\n\nNós vamos dar olé\nEu vou gritar: é gol!\nMacaé, ninguém vai te segurar"));
        arrayList2.add(new Clube(R.drawable.madurureira, "madureira","Madureira", R.raw.madureira, "Nosso ideal é lutar\nLutar por ti Madureira\nQueremos ver tua bandeira\nTremular pelo ar\n\nE assim queridos, unidos,\nSeremos dez, vinte mil,\nEm cada Glória que temos,\nDaremos pujança ao esporte do Brasil\n\nÉs Madureira, nosso castelo,\nA nossa Catedral, ideal\nO sol de muitos anos,\nDos tricolores suburbanos"));
        arrayList2.add(new Clube(R.drawable.nova_iguacu, "nova_iguacu","Nova Iguaçu", R.raw.nova_iguacu, "Salve o “Fruto da Terra”\nNova Iguaçu traz com orgulho seu brasão\nOnde brilham duas cores\nLaranja e branco no seu pavilhão\n1° de abril é sua glória\nÉ um marco na história desse clube vencedor\nCom amor e alegria dia e noite, noite e dia vou aonde ele for\n\nSuas vitórias têm um gosto especial\nE a derrota é um fato acidental\n\nNova Iguaçu\nFutebol, paixão e arte\nÉs um grande baluarte\nNo esporte nacional\n\nNova Iguaçu\nFutebol, paixão e arte\nÉs um grande baluarte\nNo esporte nacional\n"));
        arrayList2.add(new Clube(R.drawable.portuguesa_rj,"portuguesa_rj", "Portuguesa Carioca", R.raw.portuguesa_rj, "SALVE SALVE À PORTUGUESA,\nCOM CERTEZA,\nPORTUGUESA CARIOCA.\nME FASCINA, ME DOMINA\nNO PEITO SE COLOCA,\nO RUBRO VERDE É MINHA SINA\nQUERO TORCER, TORCER\nPOR ESTE CLUBE QUERO VER VENCER\nVENCER, VENCER COM GALHARDIA,\nPERDER, PERDER COM FIDALGUIA,\nASSIM CONTA A SUA HISTÓRIA,\nNÃO É SÓ COM A VITÓRIA QUE VEM A SATISFAÇÃO,\nENCARA A BRAVA RAÇA LUSITANA,\nPORTUGUESA SOBERANA,\nDO MEU CORAÇÃO\n"));
        arrayList2.add(new Clube(R.drawable.resende,"resende", "Resende", R.raw.resende, "Resende, Resende, Resende.\n\nSou torcedor resendense\nCarrego a estrela em meu coração\nSou do Vale Paraíba\nSou centenário de amor e paixão\n\nGigante dessa natureza\nSou pioneiro da nossa região\nTu és a minha alegria\nTime de garra, time de emoção.\n\nE seja como for,\nEstarei a seu dispor.\nÉ mais que um time, tu és o meu amor.\n\nSou torcedor resendense\nCarrego a estrela em meu coração\nSou do Vale Paraíba\nSou centenário de amor e paixão\n\nGigante dessa natureza\nSou o alvinegro mais temido e com razão\nResende suas cores me fascinam\nEu sou Resende e sou de coração\n\nE seja como for,\nEstarei a seu dispor.\nResende tu és o meu amor\n\nE seja onde for,\nÉ pura emoção.\nEu me orgulho de ser um campeão."));
        arrayList2.add(new Clube(R.drawable.sao_cristovao,"sao_cristovao", "São Cristovão", R.raw.sao_cristovao, "São Cristóvão, São Cristóvão\nTeu passado é tão belo\nQuantas vitórias em Figueira de Melo.\n\nQuando vences outro clube\nOh! São Cristóvão pertences\nAos corações sãocristovenses.\n\nEstimulam tua fibra extraordinária\nOs grandes feitos do saudoso Cantuária.\n\nAvante São Cristóvão\nPor teu bem, por nosso bem\nPela grandeza dos esportes\nQue esta terra tem.\n\nÉs de um bairro cuja história\nTem valor profundo\nBairro ditoso de D. Pedro II.\n\nQuando vais à Zona Sul\nJogar com um clube bem forte\nTens a torcida da Zona Norte.\n\nSão Cristóvão, São Cristóvão\nTeu passado é tão cheio\nAos teus rivais inspiras sempre receio.\n"));
        arrayList2.add(new Clube(R.drawable.vasco,"vasco", "Vasco", R.raw.vasco, "Vamos todos cantar de coração   \nA cruz de malta é o meu pendão \nTu tens o nome do heróico português  \nVasco da Gama sua fama assim se fez  \n \nTua imensa torcida é bem feliz  \nNorte sul Norte sul deste pais \nTua estrela na terra a brilhar ilumina o mar \nNo atletismo és um braço, no remo és imortal \nNo futebol és um traço, de união Brasil - Portugal"));
        arrayList2.add(new Clube(R.drawable.volta,"voltaredonda", "Volta Redonda", R.raw.voltaredonda, "Entra em campo o esquadrão de aço \nEquipe do Voltaço \nFundado em 76 \nSeus atletas estão lutando pela vez. \n \nTime de Volta Redonda \nTerra de trabalho e paixão \nSeus torcedores garantem \nManter sua tradição. \n \nO município é seu braço \nA indústria o coração \nAlém de recordista de aço \nQuer ver o seu clube campeão. \n \nSua camisa, seu escudo, suas cores \nGritam gol \nSuas bandeiras coloridas  \nAgitando a torcida  \nTão vibrante aguerrida  \nAbre passagem com ideal  \nA meta perseguida é a conquista  \nDe glória nacional."));
        sectionedExpandableLayoutHelper.addSection("  CARIOCAS", arrayList2);

        ArrayList<Clube> arrayList3 = new ArrayList<>();
        arrayList3.add(new Clube(R.drawable.americamg, "americamg","América MG", R.raw.americamg, "Mantendo nosso espírito esportivo\nSocial e cultural\nVamos cantando o hino do América\nTão famoso e tradicional\n\nE cantando nossa música querida\nVibrando com amor no coração\nEnaltecemos assim a nossa equipe\nO nosso América Decacampeão\n\nAs tuas cores são alviverde\nTua torcida feminina é demais\nA tua classe aristocrata\nÉ quem fulmina os teus rivais\n\nAmérica, és o maior\nTeu futebol é sensacional\nCantamos para o mundo inteiro\nTu és a glória do esporte nacional"));
        arrayList3.add(new Clube(R.drawable.atleticomg, "atleticomg","Atlético MG", R.raw.atleticomg, "\"Nós somos do Clube Atlético Mineiro.\nJogamos com muita raça e amor...\nVibramos com alegria nas vitórias\nClube Atlético Mineiro,\nGalo forte vingador.\n\nVencer, vencer, vencer...\nEste é o nosso ideal.\nHonramos o nome de Minas\nNo cenário esportivo mundial!\nLutar, lutar, lutar...\nPelos gramados do mundo para vencer.\nClube Atlético Mineiro,\nUma vez até morrer.\n\nNós somos campeões do gelo\nO nosso time é imortal.\nNós somos campeões dos campeões,\nSomos o orgulho do esporte nacional.\nLutar, lutar, lutar...\nCom toda a nossa raça pra vencer.\nClube Atlético Mineiro,\nUma vez até morrer.\n\nClube Atlético Mineiro,\nUma vez até morrer.\""));
        arrayList3.add(new Clube(R.drawable.araxa, "araxa","Araxá", R.raw.araxa, "Salve o alvi-negro\nO mais querido do interior\nEm todas as partidas\nmostra sua garra e o seu valor\n\nGanso forte e genial\nEm campo toca e controla a bola\nA sua raça engrandece a nossa história\nCantando e vivendo sua glória\n\nAraxá Esporte Clube\nBalança coração\nEm todas as jornadas\nBate forte a emoção \n\nAraxá Esporte Clube\nBalança coração\nEm todas as jornadas\nBate forte a emoção\n\nNo pavilhão as cores \"da glória\"\nO vento faz tremular\nA flâmula alvi-negra\nDo mais querido de Araxá\n\nVai em busca da vitória\nCom toda garra de campeão\nMostrando com amor à camisa\nVai mantendo sempre sua tradição\n\nAraxá Esporte Clube\nBalança coração\nEm todas as jornadas\nBate forte a emoção"));
        arrayList3.add(new Clube(R.drawable.boa_sorte_mg,"boa_esporte", "Boa Esporte", R.raw.boa_esporte, "Boa, o Boa \nEsse som vai ecoar\nBoa, o Boa \nAqui ou em qualquer lugar\nBoa, o Boa \nQue mora em meu coração\nBoa, o Boa \nPra mim é sempre campeão\n\nBoa, o Boa \nEsse som vai ecoar\nBoa, o Boa \nAqui ou em qualquer lugar\nBoa, o Boa \nQue mora em meu coração\nBoa, o Boa \nPra mim é sempre campeão\nLeleleô lelelea\nEu sou de Boa\nE de boa eu vou ficar\n\nLeleleô lelelea\nEu sou de Boa\nE de boa eu vou ficar\n\nLeleleô lelelea\nEu sou de Boa\nE de boa eu vou ficar\n\nLeleleô lelelea\nEu sou de Boa\nE de boa eu vou ficar"));
        arrayList3.add(new Clube(R.drawable.caldense,"caldense", "Caldense", R.raw.caldense, "É no pé e na raça\nQue lutamos pela taça!\nOlé, olé, olé!\nOnze cobras muito nossos\nQue, vestindo a cor de Poços,\nSabem bater o pé!\n\nSalve, salve a Veterana,\nClube forte, tão bacana\nE que é querido demais!\n\nVitória! Glória ao Verdão!\nQue vibra no coração, (bis)\nDa nossa Minas Gerais!"));
        arrayList3.add(new Clube(R.drawable.cruzeiro,"cruzeiro", "Cruzeiro", R.raw.cruzeiro, "Existe um grande clube na cidade,\nque mora dentro do meu coração\nEu vivo cheio de vaidade\npois na realidade é um grande campeão\nNos gramados de Minas Gerais\ntemos páginas heróicas e imortais\nCruzeiro Cruzeiro querido\ntão combatido jamais vencido.\n\nExiste um grande clube na cidade,\nque mora dentro do meu coração\nEu vivo cheio de vaidade\npois na realidade é um grande campeão\nNos gramados de Minas Gerais\ntemos páginas heróicas e imortais\nCruzeiro Cruzeiro querido\ntão combatido jamais vencido."));
        arrayList3.add(new Clube(R.drawable.democrata,"democrata", "Democrata", R.raw.democrata, "Esporte Clube Democrata\nÉs uma equipe de grande tradição\nPantera de sangue alvinegro\nA tua força faz tremer qualquer leão\n\nDemocrata sinônimo de luta\nForça, coragem e esplendor\nPantera, teu lema é a vitória\nTeus dias são de glória, de raça e amor\n\nÉs o orgulho do Vale do Rio Doce\nTua camisa é a imagem do poder\nO teu passado reflete no presente\nUm futuro que haveremos de vencer\n\nSe acaso a derrota acontecer\nNão vai ser nada, iremos prosseguir\nO que importa é a nossa união\nPorque unidos a vitória há de vir\n\nEsporte Clube Democrata\nO teu nome exprime liberdade\nÉs a esperança de tantos corações\nAlvinegros que te amam de verdade\n\nDemocrata és o grito de um povo\nUma união cujo lema é vencer\nVamos, Pantera, nada temos a temer\nNós somos brasileiros, Democrata até morrer."));
        arrayList3.add(new Clube(R.drawable.guarani_mg,"guarani_mg", "Guarani", R.raw.guarani_mg, "Pinta em cores de vermelho e branco\n" +
                "a bandeira do tamanduá\n" +
                "bolas de ouro na grama\n" +
                "ao comando alvi-rubro do meu Guará\n" +
                "\n" +
                "E lá se vão nossos heróis\n" +
                "buscar vitórias para servir,\n" +
                "meu sentimento meu alimento\n" +
                "coração de Guarani.\n" +
                "Pelo prazer, de te querer\n" +
                "o teu nome é imortal."));
        arrayList3.add(new Clube(R.drawable.ipatinga,"ipatinga", "Ipatinga", R.raw.ipatinga, "Com muita raça e glória,\njogando com emoção,\nestou falando do Ipatinga,\no time do meu coração.\n\nUm Tigre com garras de aço,\npronto pra atacar,\nrepresentando o Vale do Aço,\nem território nacional.\n\n[Refrão]\n\nO Ipatinga é fruto desse chão,\no Ipatinga, orgulho dessa nação,\ncom muita garra e pronto pra vencer,\ncom a força de um tigre,\nnunca vamos morrer.\n\nEu sou Ipatinga\ncom raça e muito amor,\nonde o Ipatinga for,\ncom muito orgulho eu vou.\nEm busca de novas vitórias, histórias pra contar,\nPosso bater no meu peito,\nPor ter motivos pra me orgulhar."));
        arrayList3.add(new Clube(R.drawable.mamore,"mamore", "Mamoré", R.raw.mamore, "Da madeira veio o nome.\nE do nome a paixão.\nMamoré o mais querido.\nSempre sempre campeão.\n\nPredestinado a grandes glórias.\nNos gramados das Gerais.\nEsse é o sapo forte.\nCada vez pulando mais.\n\nMamoré o mais querido.\nSempre sempre campeão.\nMamoré o nosso clube.\nVida longa ao verdão.\n\nMamoré, Mamoré.\nMamoré, Mamoré.\nDe um sargento veio às ordens.\nSempre sempre a seguir.\nMuita garra muita luta.\nNunca nunca desistir.\n\nNa jornada em sua história.\nMuitas glórias conquistou.\nVários títulos em Minas.\nE o Brasil atravessou.\n\nMamoré o mais querido.\nSempre sempre campeão.\nMamoré o nosso clube.\nVida longa ao verdão.\n\nMamoré, Mamoré.\nMamoré, Mamoré.\nNosso nome veio de longe.\nUm periquito aqui pousou.\nE num brejo alagado.\nEm um sapo transformou.\n\nDa torcida veio a garra.\nE da garra a explosão.\nEsse é o sapo forte.\nMotivo da paixão.\n\nMamoré o mais querido.\nSempre sempre campeão.\nMamoré o nosso clube.\nVida longa ao verdão.\n\nMamoré, Mamoré.\nMamoré, Mamoré.\nMamoré, Mamoré.\nMamoré, Mamoré."));
        arrayList3.add(new Clube(R.drawable.tombense, "tombense","Tombemse", R.raw.tombense, "Fundado em 1914\nTombense é raça, é tradição\nSua história traduz em suas cores\nSua torcida mais pura emoção\nO vermelho é garra e coragem\nO branco muita paz e união\nVamos Tombense\nVamos jogar para vencer\n\nEm toda a partida\nJogaremos com você\nVamos Tombense\nForça, raça, amor e fé\n\nEstaremos com você\nAonde você estiver\nSomos Tombense não importa o lugar\nSeja no céu, na terra ou em qualquer lugar\nSomos Tombense não importa o lugar\nSeja no céu, na terra ou em qualquer lugar"));
        arrayList3.add(new Clube(R.drawable.tres_coracoes,"tres_coracoes", "Três Corações", R.raw.tres_coracoes, "De Goiás eram os três boiadeiros \nE do rio as três voltas no chão... \nTrês violas traziam os tropeiros - \nFundadores do nosso torrão \nAo deixarem esta terra morena \nTrês Marias deixaram a chorar: \nÉ Jacira, é Juçara, é Moema \nDe olhos verdes, das cores do mar \nRezam as lendas que velhas missões \nPaladinas de Deus e da Fé, \nConsagraram estes três corações \nA Jesus, a Maria e a José \nNestas serras de doces colinas \nSob um céu sem igual, sempre azul \nFoi crescendo a Princesa de Minas - \nO recanto mais belo do Sul \nRefrão: \nVinde ver, brasileiros do Leste \nE do Sul, ou de outros rincões \nA beleza que doura e que veste \nA cidade de Três Corações"));
        arrayList3.add(new Clube(R.drawable.tupi,"tupi", "Tupi", R.raw.tupi, "Vão desfilar as emoções,\nVão repetir-se as tradições,\nÉ o Tupi, é o galo, o índio, é o coração\nBatendo, batendo forte\nEm compassada vibração.\n\nTupi, Tupi é união!\nDos campeões, o campeão!\nÉ força viva,\nÉ muito mais que uma paixão.\nÉ a jogada,\nÉ o silêncio de um instante.\nÉ a repentina explosão dos carijós.\n\nAo tremular do alvinegro pavilhão,\nVibra a torcida,\nGanha o time inspiração.\nSurge na luta a chama viva da esperança,\nE o galo forte carijó não tem rivais...\nGrandes vitórias sempre alcança,\nE vive a glória dos imortais"));
        arrayList3.add(new Clube(R.drawable.uberaba,"uberaba", "Uberaba", R.raw.uberaba, "Tenho fulgente história.\nAté os deuses já cantam minha glória!\nSou o valente campeão\nQue de Uberaba possuo o coração.\nSempre leal e forte,\nSou o denodado Uberaba Sport,\nO astro rei, brilhante sol,\nA potestade mor do futebol.\nMeus jogadores lutam sempre com afeição\nEm prol do belo alvi-rubro pavilhão\nNada os retém em seu fervor\nAcometendo com ardil e valor.\nEm campo altivos, briosos, viris,\nSempre triunfam nas pugnas febris.\nSeus peitos tremem de santo ardor\nE a glória os beija num lance de amor...\nNobre e liberal,\nMeu time não tem rival!\nÉ vencer a sua divisa ideal.\nTem vitórias mil:\nÉ a glória do Brasil!\nAh! Valente Sport\nTão alvejado e sempre forte!\nAleguá!...guá!...guá...Urrah!...Urrah!\nSalve! Ó campeão\nDa Princesa do Sertão!."));
        arrayList3.add(new Clube(R.drawable.uberlandia,"uberlandia", "Uberlândia", R.raw.uberlandia, "Para a glória, com os louros da vitória,\nUberlândia! Uberlândia! Uberlândia!\nO Periquito, o mais querido e forte!\nFuracão, Uberlândia Esporte! (bis)\n\nComo ontem, a luta é a mesma agora,\nPendão Alvi-Verde desfraldado!\nCom mais ardor, mais vitórias,\nHonrando as glórias do passado. (bis)\n\nNossa torcida é vibrante:\nA velha guarda e a mocidade...\nVê no brasão que é tão amado,\nO amor, o sangue e o valor da cidade.\n\nNossa torcida venera\nVelhas batalhas e seus troféus\nDe companheiros de outrora,\nQue nos ajudam lá do céu."));
        arrayList3.add(new Clube(R.drawable.urt_de_patos_mg,"urt", "URT", R.raw.urt, "É União Recreativa dos Trabalhadores\nAzul e Branco são as suas cores,\ntime de garra e de tradição\nVelha Mangueira, com mil bandeiras\nsempre a tremular\nE a galera sempre a vibrar, com as\nconquistas do seu campeão\nURT, tu és o símbolo de união, tu és\na glória do esporte rei.\nÉ o mais querido da região.\nSalve a celeste, esquadra azul do gigante forte.\nÉ nos gramados desde o sul ao norte\nMostrando raça e exibição\nLutar, vencer, é este o lema\nque lhe deu as glórias\nGrandes conquistas faz a sua história\nSalve a celeste, salve o campeão\nURT, tu és o símbolo de união,\ntu és a glória do esporte rei.\nÉ o mais querido da região.."));
        sectionedExpandableLayoutHelper.addSection("  MINEIROS", arrayList3);

        ArrayList<Clube> arrayList4 = new ArrayList<>();
        arrayList4.add(new Clube(R.drawable.aimore,"aimore", "Aimoré", R.raw.aimore, "Aimoré, Aimoré\nClube do meu coração\nTorço por ti vibro por ti\nComo toda minha emoção\nAimoré, Aimoré\nOh Bravo Índio Capilé\nTuas vitórias nos enchem de glórias\nPor ti sempre de pé\nOh Aimoré alvi-azul\nBrilhas no Rio Grande do Sul\nÉs o cacique da Taba\nContigo ninguém acaba"));
        arrayList4.add(new Clube(R.drawable.avenida_rs,"avenida_rs", "Avenida", R.raw.avenida_rs, "Salve o Avenida,\nclube do povo, clube da massa\nEntra no campo Avenida,\ne vai mostrar a tua raça\nSalve o Avenida,\nclube do povo, clube da massa\nEntra no campo Avenida,\ne vai mostrar a tua raça\n\nA camiseta molhada\nna vitória ou na derrota\nVem demonstrar claramente\na garra da tua gente\nSalve o Periquitão\ndo meu coração\nTu és alegria\n\nE o verde e branco da tua bandeira\nQuero exaltar noite e dia\n\n Salve o Avenida,\nclube do povo, clube da massa\nEntra no campo Avenida,\ne vai mostrar a tua raça\nSalve o Avenida,\nclube do povo, clube da massa\nEntra no campo Avenida,\ne vai mostrar a tua raça\n\nA camiseta molhada\nna vitória ou na derrota\nVem demonstrar claramente\na garra da tua gente\nSalve o Periquitão\ndo meu coração\nTu és alegria\n\nE o verde e branco da tua bandeira\nQuero exaltar noite e dia"));
        arrayList4.add(new Clube(R.drawable.brasilpelotas,"brasilpelotas", "Brasil Pelotas", R.raw.brasilpelotas, "Brasil, Brasil, Brasil\nAs tuas cores são nosso sangue nossa raça\nBrasil, Brasil, Brasil\nForça e vontade cheio de graça\nBrasil, Brasil, Brasil\nNós este ano, vamos vencer\nSalve o Brasil\nO campeão do bem-querer\nAvante com todo esquadrão\nTorcida do nosso campeão\nEle tem seu passado de glória\nTem o seu nome gravado na história\n\nLá no estrangeiro\nMostraste ser bem brasileiro\nCom os louros da vitória\nTrouxeste para nós mais outra glória"));
        arrayList4.add(new Clube(R.drawable.caxias,"caxias_do_sul", "Caxias", R.raw.caxias_do_sul, "Ser Caxias é ser desportista \nE um bravo honrador da história \nSeguir sempre com muita justiça \nA longa impávida senda da glória \n \nO passado, o suor e a esperança, \nUm presente de glória e emoção \nJubilando os nossos desportos, consagrados \npor esta nação. \n \nMeu sangue é grená e azul \nAliado ao branco pureza \nMe dá vida e orgulho, ô Caxias \nA minha alegria é a tua grandeza. \n \nÔ bandeira em punho desfraldada \nTu hás de muito brilhar \nnosso povo cheio de fervor \nNa alegria ou na dor há de sempre gritar..."));
        arrayList4.add(new Clube(R.drawable.gremio,"gremio", "Grêmio", R.raw.gremio, "Até a pé nos iremos\nPara o que der e vier\nMas o certo é que nós estaremos\nCom o Grêmio, onde o Grêmio estiver.\n\nCinquenta anos de glória\nTens imortal tricolor\nOs feitos da tua história\nCanta o Rio Grande com amor.\n\nNós como bons torcedores\nSem exitarmos sequer\nAplaudiremos o Grêmio\nAonde o Grêmio estiver.\n\nLara o craque imortal\nSobe seu nome elevar\nHoje com o mesmo ideal\nNós saberemos te honrar."));
        arrayList4.add(new Clube(R.drawable.gremio_farroupilhas,"farropilha", "Grêmio Atlético Farroupilha", R.raw.farropilha, "Até a pé nos iremos\nTeu passado glorioso,\nSe assemelha à maravilha\nDesse Estado portentoso,\nTua história que é tão bela,\nCampeão de 35\nNa senda dos esportes.\nEsboça teu perfil,\nCom um traço varonil.\n\nVamos lutar com ardor!\nTeu futuro é promissor!\nFarroupilha é no esporte\nO mais bravo, o mais forte!."));
        arrayList4.add(new Clube(R.drawable.gremio_bage,"gremio_bage", "Grêmio de Bagé", R.raw.gremio_bage, "Avante Jalde Negro de Bagé\nMostra tua força que a torcida leva fé\n\nAvante Jalde Negro de Bagé\nMostra tua força que a torcida leva fé\n\nTu és o Campeão do Centenário\nAs tuas cores amarelo e preto resurge o passado\nHistórias de lutas, conquistas e união\nGigantes em campo e tens a nossa paixão\nA estrela que eu levo em meu peito é lembrança de jornadas triunfais\nMeu torcedor canta com todo direito \"Grêmio Esportivo Bagé - Campeão Estadual\"\n\nAvante Jalde Negro de Bagé\nMostra tua força que a torcida leva fé\n\nAvante Jalde Negro de Bagé\nMostra tua força que a torcida leva fé\n\nTuas glórias e tua raça vence até leão no Estádio da Pedra Moura recebe o aplauso da massa, és orgulho do povo, a mais pura tradição\n\nAvante Jalde Negro de Bagé\nMostra tua força que a torcida leva fé\n\nAvante Jalde Negro de Bagé\nMostra tua força que a torcida leva fé\n\n(Bis)"));
        arrayList4.add(new Clube(R.drawable.guarani_rs,"guarani_rs", "Guarani-RS", R.raw.guarani_rs, "Vamos saudar o glorioso rubro-negro\nDa terra do chimarrão\nTime de raça, sangue e guerreiro\nÉ o primeiro do meu coração\n\nÉs forte meu time índio\nTe amo desde guri\nNo campo ninguém te segura\nGuarani, Guarani, Guarani\n\nNa região, tu és temido\nEm todo o Estado, tens tradição\nOrgulho do presente e passado\nO Guarani é nosso campeão"));
        arrayList4.add(new Clube(R.drawable.internacional,"internacional", "Internacional", R.raw.internacional, "Glória do desporto nacional\nOh, Internacional\nQue eu vivo a exaltar\nLevas a plagas distantes\nFeitos relevantes\nVives a brilhar\nCorrem os anos surge o amanhã\nRadioso de luz, varonil\nSegue a tua senda de vitórias\nColorado das glórias\nOrgulho do Brasil\n\nÉ teu passado alvi-rubro\nMotivo de festas em nossos corações\nO teu presente diz tudo\nTrazendo à torcida alegres emoções\nColorado de ases celeiro\nTeus astros cintilam num céu sempre azul\nVibra o Brasil inteiro\nCom o clube do povo do Rio Grande do Sul"));
        arrayList4.add(new Clube(R.drawable.juventude,"juventude", "Juventude", R.raw.juventude, "Nossas almas em festa saúdam\nEsse clube de real tradição\nNa mais sã alegria se escudam\nEntoando esta marcha canção\n\nJuventude, um passado de glórias\nTeu nome querido tornou\nÉs um clube de muitas vitórias\nQue a cidade em orgulho deixou"));
        arrayList4.add(new Clube(R.drawable.pelotas,"pelotas", "Pelotas", R.raw.pelotas, "Orgulho-me de ser áureo cerúleo\nPela grandeza do ideal\nUfano-me de ser áureo cerúleo\nPelo que tem de emocional\nExulto ao ver as cores gloriosas\nQue lembram toda uma tradição\nAzul e amarelo são as cores\nQue moram no meu coração\nSalve o Pelotas\nSalve o Glorioso\nQue não te ama\nNunca sentiu emoção\nSalve o Pelotas\nVitorioso\nÉ a vitória\nO teu maior galardão"));
        arrayList4.add(new Clube(R.drawable.santa_cruz_rs,"santa_cruz_rs", "Santa Cruz-RS", R.raw.santa_cruz_rs, "Em 1913, debaixo de\num céu muito azul,\nnasceu o esporão de ouro\nnos verdes campos do sul.\n\nHoje, o Rio Grande inteiro,\nrola vencido, a teus pés.\nOs plátanos são teu terreiro\ne todos sabem quem és.\n\nGalo! Me chamam de galo!\nPreto e Branco, tuas cores.\nE vamos sempre amá-lo\nclube dos nossos amores.\n\nTeus torcedores te adoram,\nvibram com grande emoção.\nFica eterna, te imploram\ndo fundo do coração.\n\nGalo! Me chamam de galo!\n\nÉs o clube mais amado\nna derrota ou na vitória\nEstamos sempre ao teu lado\ncom o peito cheio de glória\n\nHomens fiéis, decididos,\nfizeram a tua história,\nmesmo que tenham partido,\nvivem na tua memória."));
        arrayList4.add(new Clube(R.drawable.sao_jose_rs,"sao_jose_rs", "São José RS", R.raw.sao_jose_rs, "Cor do céu clube alvi azul\nSão José de tradição\nMais simpático do sul\nResplendente pavilhão\n\nQuem não sente o teu ardor\nComo um todo sempre unido\nFrente ao forte contendor\nLuta bravo e destemido\n\nNasceu nacionalista\nSagrando nobre história\nNa senda da conquista\nCandente busca a glória\n\nZequinha traz um fado\nArdente e varonil\nDe honrar o seu passado\nNo esporte do Brasil"));
        arrayList4.add(new Clube(R.drawable.saopaulo_rs,"saopaulo_rs", "São Paulo RS", R.raw.saopaulo_rs, "São Paulo vermelho e verde já é tradição\nVem traz a tua bandeira que a festa hoje é\nDe integração é quase um Centenário\nDe luta e dedicação não importa a\nCamiseta todos nessa hora seremos irmãos\n\nLeão do Parque Glória é paixão\nReina São Paulo no meu coração\n\nSão Paulo em tua jornada brilhante\nNa terra de Tamandaré\nO povo feliz nesse instante\nBrindar contigo é o que ele mais quer\nTua torcida se inflama\nExalta fama por onde ela for\nNeste teu aniversário quer mostrar\nA todos teu grande valor"));
        arrayList4.add(new Clube(R.drawable.veranopolis,"veranopolis", "Veranópolis", R.raw.veranopolis, "Surgiste da força de um povo\nQue unido provou seu valor\nHoje és orgulho, timaço do peito\nVEC pentacolor.\n\nOh! Veranópolis\nMeu campeão\nBravo e forte\nVibra coração.\n\nTeu nome ecoa na Serra\nFaz parte da nossa história\nTorcida unida é raça\nTeu lema é sempre vitória"));
        arrayList4.add(new Clube(R.drawable.yparinga_erichim,"ypiranga", "Ypiranga de Erechim", R.raw.ypiranga, "O Ypiranga surgiu para a vida\nCom a missão de trazer, pelo esporte,\nA pujança corpórea reunida\nA beleza do espírito forte.\nO valor alcancemos, confiantes,\nE sejamos, portanto, esforçados;\nVencedores, fiquemos constantes:\nNão seremos jamais derrotados\n\nNas planuras e serras tão lindas\nYpiranga! Ypiranga! em louvor!\nQuer na paz, quer na luta, bem vindas\nAs vitórias da força e do amor!\n\nNas planuras e serras tão lindas\nYpiranga! Ypiranga! em louvor!\nQuer na paz, quer na luta, bem vindas\nAs vitórias da força e do amor!\nNossas cores, na pátria inspiradas,\nTêm o verde da terra e do mar;\nNo amarelo refulgem as fadas\nDo esplendor e riqueza sem par\nE no campo se vêem, promissoras,\nAs defesas...e o ataque que avança...\nEia, vamos gentis torcedoras,\nPara a glória da nossa esperança!"));
        sectionedExpandableLayoutHelper.addSection("  GAUCHOS", arrayList4);

        ArrayList<Clube> arrayList5 = new ArrayList<>();
        arrayList5.add(new Clube(R.drawable.avai,"avai", "Avai", R.raw.avai, "Na ilha formosa,\ncheia de graça.\nO time da raça.\nÉ povo é gente,\né bola pra frente,\nÉ só coração\no meu Avaí\n\nAvaí meu Avaí.\nDa ilha és o Leão\nAvaí meu Avaí.\nTu já nasceste campeão\n\nNão dá para esquecer\no seu belo passado\nMas a hora é presente\ne o time vem quente\nDe encontro marcado\ncom seus dias de glória\nPois a ordem é vitória\nVencer, vencer."));
        arrayList5.add(new Clube(R.drawable.brusque,"brusque", "Brusque", R.raw.brusque, "Sempre joga pra vencer,\nnosso time faz tremer,\nmeu Bruscão do coração.\n\nMais que um clube, uma paixão\no meu time é campeão\nmeu Bruscão do coração.\n\nSurge o Brusque entre os gigantes,\ne dando alegria para uma nação,\né o vermelho, verde, branco e amarelo,\na cor do meu Bruscão!\n\nBrusque, meu Bruscão!\nGlorioso e Campeão,\nSalve Brusque Imortal,\nminha paixão natural.\n\nBrusque, meu Bruscão!\nGlorioso e Campeão,\nTua torcida vibrante e guerreira,\nEu serei Brusque a vida inteira!"));
        arrayList5.add(new Clube(R.drawable.chapecoense,"chapecoense", "Chapecoense", R.raw.chapecoense, "Ó glorioso verde que se expande\nEntre os estados, tu és sempre um esplendor\nNas alegrias e nas horas mais difíceis\nMeu furacão, tu és sempre um vencedor\n\nSão tantos títulos outrora conquistados\nCom bravura, muita raça e fervor\nLeva consigo o coração de uma cidade\nMeu furacão, tu és sempre um vencedor\n\nSempre honrando nosso escudo com sua raça\nÉs alegria nos estádios nunca só\nNa imensidão e vastidão de nosso estado\nChapecoense, tu és sempre Chapecó\n\nA força imensa de sua fiel torcida\nQue nos estádios tudo é lindo e nos fascina\nA nossa massa, meu verdão mexe contigo\nTu és querido em toda Santa Catarina"));
        arrayList5.add(new Clube(R.drawable.criciuma,"criciiuma", "Criciúma", R.raw.criciiuma, "Lembrando os heróis do passado\nQue escreveram seus nomes na história\nÓ, Tricolor Predestinado!\nA um presente e futuro de glórias\n\nSalve o Criciúma!\nNo esporte nacional\nSalve o Criciúma!\nDe patrimônio imortal\nNa hora da decisão\nNuma só voz, grita feliz o meu povão:\n\nCriciúma! Criciúma!\nNosso Clube de amor\nAlma, garra e coração!\n\nCriciúma! Criciúma!\nNosso Clube de amor\nAlma, garra e coração!\n\nVibrando estaremos contigo\nDesfraldando o teu pavilhão\nOnde estiver o mais querido\nDos campeões, o nosso campeão!"));
        arrayList5.add(new Clube(R.drawable.figueirense,"figueirense", "Figueirense", R.raw.figueirense, "Avante FIGUEIRENSE\nPra frente Furacão\nS'embora esquadrão de aço\nÉs tesouro do meu coração\n\nTua torcida é garra, é empolgação\nVejo em ti pujança\nDe um grande esquadrão\n\nPor ti torcemos\nPor isso somos alvinegros\nA força do Scarpellão\n\nPor ti torcemos\nPor ti vibramos\nFIGUEIRENSE\nÉs o nosso campeão"));
        arrayList5.add(new Clube(R.drawable.joinville,"joinville", "Joinville", R.raw.joinville, "Meu coração é preto, branco e vermelho\nSou Jec, sou fogo, meu irmão!\nEu boto fé na garra deste coelho\ntem raça e pedigri\nNasceu pra Campeão!\nO Jec deita e rola a bola\nCheio de emoção\nÉ lider isolado no meu coração\nJec - Nasceu campeão\nNasceu com a taça na mão\nO Jec faz a finta\nPinta o sete e mete: Gol!\nE o grito da galera ecoou\n\nGOOL! ÔÔÔ! ÔÔÔ! ÔÔÔ! JEC - UH!\n\nRelembro sua história gloriosa\nNos idos de 76\nNa cidade dos príncipes\nNa cidade das flores\nNascia o tricolor dos tricolores\n\nNo coração do povo já fervia\nPaixão por ele que se chamaria\nJOINVILLE ESPORTE CLUBE\nEsse coelho, meu irmão\nJá nasceu com vocação pra campeão\n\nJec - Nasceu campeão\nNasceu com a taça na mão\nO Jec faz a finta\nPinta o sete e mete: Gol!\nE o grito da galera ecoou\n\nGOOL! ÔÔÔ! ÔÔÔ! ÔÔÔ! JEC - UH"));
        arrayList5.add(new Clube(R.drawable.juventus_santa,"juventus_sc", "Juventus", R.raw.juventus_sc, "Ressurgiu para a vitória\nSeu futuro é glorioso\nEntrará para a história\nSerá sempre vitorioso\n\nRefrão\nJuventus, Juventus, Juventus\nTricolor jaraguaense\nMoleque, Moleque Travesso\nA história lhe pertence\n\nJuventus, Juventus, Juventus\nTricolor jaraguaense\nMoleque, Moleque Travesso\nA vitória lhe pertence\n\nTem história no passado\nNo presente brilha mais\nNo futuro serás grande\nCairá nunca, jamais!\n\nRefrão\nJuventus, Juventus, Juventus\nTricolor jaraguaense\nMoleque, Moleque Travesso\nA história lhe pertence\n\nJuventus, Juventus, Juventus\nTricolor jaraguaense\nMoleque, Moleque Travesso\nA vitória lhe pertence"));
        arrayList5.add(new Clube(R.drawable.metropolitano,"metropolitano", "Metropolitano", R.raw.metropolitano, "Quero verde eu sou paixão\nQuero no meu coração, Metropolitano\n\nSímbolo para o esporte\nUm sinal de que ele é forte\nEsse clube que eu amo\n\nVou com ele até o fim\nDentro do meu coração\nBlumenau é toda assim:\nMeu Verdão!\nVou com ele até o fim\nDentro do meu coração\nBlumenau é toda assim:\nMeu Verdão!Quero verde eu sou paixão\nQuero no meu coração, Metropolitano\n\nMuita raça e muito amor\nVou com ele aonde for\nAno após ano\n\nVou com ele até o fim\nDentro do meu coração\nBlumenau é toda assim:\n \nMeu Verdão!Vou com ele até o fim\nDentro do meu coração\nBlumenau é toda assim:\nMeu Verdão!"));
        sectionedExpandableLayoutHelper.addSection("  CATARINENSES", arrayList5);

        ArrayList<Clube> arrayList6 = new ArrayList<>();
        arrayList6.add(new Clube(R.drawable.dap,"adap", "ADAP Maringá", R.raw.adap, "No campo da minha esperança\nDe novo voltou a brilhar\nA força, a fé a confiança\nAvança Galo Maringá\n\nE quando a rede balança\nNo meu coração a pulsar\nA emoção é preta e branca\nAvança Galo Maringá (2X)\n\nO grito que não saía\nVolta de novo a ecoar\nVeste o povo de alegria\nE orgulha o Paraná\n\nÉ paixão que extasia\nAvante Galo Maringá\nVai temer quem não temia\n\nSempre que o Galo jogar\n\nÉ campeão! É campeão\nE quando eu falo é pra valer\nÉ campeão! É campeão!\nO Galo faz o chão tremer"));
        arrayList6.add(new Clube(R.drawable.atleticopr,"atleticopr", "Athetico", R.raw.atleticopr, "Atlético! Atlético!\nConhecemos teu valor\nA camisa rubro-negra\nSó se veste por amor\n\nVamos marchar sempre cantando\nO hino do Furacão\nE no peito ostentando\nA faixa de campeão\n\nAtlético! Atlético!\nConhecemos teu valor\nA camisa rubro-negra\nSó se veste por amor\n\nO coração atleticano\nEstará sempre voltado\nPara os feitos do presente\nE as glórias do passado\n\nAtlético! Atlético!\nConhecemos teu valor\nA camisa rubro-negra\nSó se veste por amor\n\nA tradição vigor sem jaça\nNos legou o sangue forte\nRubro-negro é quem tem raça\nE não teme a própria morte\n\nAtlético! Atlético\nConhecemos teu valor\nA camisa rubro-negra\nSó se veste por amor"));
        arrayList6.add(new Clube(R.drawable.cianorte,"cianorte", "Cianorte", R.raw.cianorte, "És gigante no verde gramado\nE herói com a bola nos pés\nCada jogo é uma grande emoção\nCada gol col olé\nLeão do Vale a fera temida\nTem nas chuteiras o coração\nCianorte Futebol Clube\nUm time feito de paixão\nVamos Leão avante a vitória\nSempre com muita fé\nVamos Leão tu és a fera\nMostra quem tu és\nVamos Leão levanta a galera\nNo pique da vibração\nLeão vamos Leão\nForça garra e coração\nLeão vamos Leão\nForça garra e coração.\nA torcida nos lances de gol\nEntusiasmada aplaude de pé\nRemanescente de grandes conquistas\nSeguindo o exemplo do antigo café\nRevestido de verde e branco\nEsperança paz e união\nCianorte Futebol Clube\nUm time feito de paixão."));
        arrayList6.add(new Clube(R.drawable.coritiba,"coritiba", "Coritiba", R.raw.coritiba, "Lá no alto de tantas glórias\nBrilhou, Brilhou um novo sol\nClareando com seus raios verde e branco\nEncantando o país do futebol\n\nPalco de artistas, jogadores, de um passado sem igual\nDa arte dos teus grandes valores\nO seu nome pelo mundo vai brilhar\nCoritiba, Coritiba campeão do Paraná\n\nTua camisa alviverde\nCom orgulho para sempre irei de amar\nJogando pelos campos brasileiros\nDespertando na torcida emoção\n\nCoritiba Campeão do Povo\nAlegria do meu coração\nCoxa, Coxa, é garra, é força, é tradição\nCoxa, Coxa, explode o coração."));
        arrayList6.add(new Clube(R.drawable.colorado,"colorado", "Colorado", R.raw.colorado, "COLORADO A TUA HISTÓRIA\nÉ UM ORGULHO AO TEU TORCEDOR\nTRÊS TRADIÇÕES DO PASSADO\nNUM PRESENTE DE GARRA E DE AMOR\nTUA TORCIDA GIGANTE\nVAI DO MAIS HUMILDE ATÉ O DOUTOR\nÉS A ALEGRIA DO POVO\nÉS O TIME DO TRABALHADOR\n\nCOLORADO...COLORADO...\nTEU ACERVO NÃO TEM OUTRO IGUAL\nCOLORADO... COLORADO...\nTRÊS FAMÍLIAS NUM SÓ POTENCIAL\nNAS TRÊS CORES\nDA BANDEIRA NO AR TREMULANTE\nTUA HISTÓRIA ESTÁ RESUMIDA\nCOLORADO SEMPRE AVANTE!\n\nBOCA-NEGRA É O GRITO DE GUERRA\nQUE A TORCIDA HERDOU COM PRAZER\nECOANDO EM TODAS AS JORNADAS\nAJUDANDO O TIME A VENCER\nO VERMELHO DA TUA CAMISA\nÉ IGUAL O VERMELHO DO CORAÇÃO\nQUE VIBRA EM CADA VITÓRIA\nE SE AGITA EM CADA EMOÇÃO.\n"));
        arrayList6.add(new Clube(R.drawable.foz,"foz", "Foz do Iguaçu ", R.raw.foz, "Seu lema é lutar\nÉ jogar pra vencer\nSeu nome escrever\nUm placar de vitórias\nFoz do Iguaçu vem demonstrar o seu valor\nCom muita garra, conquistas e glórias\nFoz do Iguaçu vem demonstrar o seu valor\nCom muita garra, conquistas e glórias\n\nFoz do Iguaçu o esquadrão da fronteira\nOstenta em sua bandeira\nAs cores azul e branco\nO seu escudo simboliza as cascatas\nAs belas cataratas de magia e encanto\n\nDos grandes rios Paraná e Iguaçu\nA força e a energia da usina de Itaipú\n\nNas asas da águia dourada\nSobrevoo do azulão\nRazante a caminho do gol (é gol)\nCom bola área ou no chão\n\nAqui não tem pra ninguém\nO Foz é tudo de bom\nAqui não tem pra ninguém\nO Foz é o campeão"));
        arrayList6.add(new Clube(R.drawable.londrina,"londrina", "Londrina", R.raw.londrina, "O azul celeste da tua bandeira\nSimbolizando o céu do paraná\nO branco, a paz de tua gente ordeira\nQue em outras terras sei que igual não há.\nO teu brasão resume a tua história\nNa altivez da rama do café\nTu surgiste oh! grande Londrina\ndo seio de um povo que tem muita fé.\n\nRefrão\nLondrina... Londrina... Londrina...\nEstás presente em cada coração\nCaçula-gigante nasceste\nE hoje és o destemido tubarão.\nLondrina... Londrina... Londrina...\nNossa torcida vibra em cada emoção\nE o que importa é o ideal de vitória\nPois para nós, tu serás sempre campeão.\n\nII\nMeu tubarão, time de tantas glórias\nÉ uma força do norte ao sul\nVenceu fronteiras e já fez histórias\nTua camisa branca e azul.\nÉs o orgulho de uma cidade\nQue se formou na era do café\nTu surgiste oh! Grande londrina\ndo seio de um povo que tem muita fé"));
        arrayList6.add(new Clube(R.drawable.nacional_pr,"nacional_pr", "Nacional", R.raw.nacional_pr, "No Paraná é um orgulho sem par\nÉ forte, é resoluto\nTambém absoluto\nPorém as suas cores saberemos honrar\n\nO trio final\nÉ feito de cimento armado\nOs nossos alfes\nSão todos homens bronzeados\nA nossa linha\nÉ dona de qualquer gramado\n\nDiremos\nDiremos\nVitória quase sempre,\nVamos pois vencer."));
        arrayList6.add(new Clube(R.drawable.operario,"operario", "Operário", R.raw.operario, "Um grande grupo reuniu nos tempos áureos\nOs ferroviários na cidade princesina\nEm meio a campos onde já rolava a bola\nEstremecendo o chão da Vila Oficinas\n\nE muita gente acompanhou essa jornada\nVivendo as horas e os momentos de alegria\nUm Trem-Fantasma vem seguindo nessa estrada\nTrazendo um grande orgulho pra torcida todo dia\n\nE os Campos Gerais hoje tem na memória\nEssa equipe de ouro que brilha com glória\nA história alvinegra é um relicário\nÉ a estrada florida do Operário Ferroviário\n\nSalve o meu campeão\nOperário pra sempre no meu coração!\n\nCom fúria jovem nossa equipe sempre brilha\nPela vitória, se esforça por inteiro\nO Operário tem mostrado seu talento\nNo Paraná ou n'outro estado brasileiro\n\nE Ponta Grossa acompanha essa jornada\nMarcando as horas e os momentos de alegria\nUm Trem-Fantasma vem seguindo nessa estrada\nTrazendo um grande orgulho pra torcida todo dia\n\nE os Campos Gerais hoje tem na memória\nEssa equipe de ouro que brilha com glória\nA história alvinegra é um relicário\nÉ a estrada florida do Operário Ferroviário\n\nSalve o meu campeão\nOperário pra sempre no meu coração!"));
        arrayList6.add(new Clube(R.drawable.parana,"parana", "Paraná", R.raw.parana, "Paraná já nasceste gigante\nés o fruto de luta e união\ntens a força, o arrojo, a imponência\ne o poder da realização\n\nnas três cores do teu estandarte\ntão altiva está a gralha azul\nque plantou neste solo tão fértil\nesta grande potência do sul\n\nrefrão:\n\nmeu Paraná... meu tricolor\nteu pavilhão simboliza\nem cores tão vivas\na garra e o amor\n\nmeu Paraná... meu tricolor\neu sou a camisa doze\nque tanto te ama\nsou teu torcedor\n\nII\n\ntua origem coberta de glória\né que faz teu imenso valor\nteu destino é vitória, vitória\nsalve o meu esquadrão tricolor\n\nParaná és guerreiro valente\ne do esporte a maior razão\nverdadeira alegria do povo\nParaná clube do coração"));
        arrayList6.add(new Clube(R.drawable.paranavai,"paranavai", "Paranavaí", R.raw.paranavai, "Rever sua camisa vermelha\né renovar a emoção\nque vem do seu passado de conquistas\nde sangue, suor e coração\n\nE mostrar que dentro do meu peito\nbate forte uma paixão\nque vai pulsando vermelho, vermelho\nACP meu campeão.\n\nOh vermelhinho, vim só pra te ver\nOh vermelhinho gosto de você\npor onde vais tu és porta bandeira\nda nossa Paranavaí.\n\nSangue, sangue, pra vencer... vencer\nsempre, sempre, vermelhinho eu hei de ser\nA sua glória irá resplandecer\nsempre ...sempre, viva o nosso ACP.\n\nOh vermelhinho, vim só pra te ver\nOh vermelhinho gosto de você\npor onde vais tu és porta bandeira\nda nossa Paranavaí.\n\nSangue, sangue, pra vencer... vencer\nsempre, sempre, vermelhinho eu hei de ser\nA sua glória irá resplandecer\nsempre ...sempre, viva o nosso ACP\n"));
        arrayList6.add(new Clube(R.drawable.riobranco,"rio_branco_pr", "Rio Branco", R.raw.rio_branco_pr, "Leão da Estradinha\nMeu querido esquadrão\nLeão da Estradinha\nSerás eterno em meu coração\n\nTorcer por suas cores é sensacional\nRio Branco querido não existe outro igual\nA bandeira alvi-rubra, a mais linda que há\nOrgulho maior de Paranaguá"));
        arrayList6.add(new Clube(R.drawable.toledo_pr,"toledo_pr", "Toledo", R.raw.toledo_pr, "No passado conquistamos glórias\nnossa história merece respeito\nSomos homens de bem e de fé\namantes do esporte bretão\n\nNossa arte é com a bola nos pés\nnosso orgulho e satisfação\nÉ ver o Toledo em campo\nsendo mais uma vez campeão\n\nCamisa no corpo, bandeira na mão\nGrito na garganta explode coração\nToledo Toledo Toledo\nQuero ver-te sempre campeão\n\nPra cantar, pra torcer, pra vibrar\nonde está o Toledo eu estou\nNão importa a hora, o lugar,\nonde for o Toledo eu vou\n\nSó pra ver nossos craques em campo\ncompletar o encanto do show\nSó pra ver bandeiras tremulando\ne a torcida vibrando com o gol\n\nCamisa no corpo, bandeira na mão\nGrito na garganta explode coração\nToledo Toledo Toledo\nQuero ver-te sempre campeão\n\nCamisa no corpo, bandeira na mão\nGrito na garganta explode coração\nToledo Toledo Toledo\nQuero ver-te sempre campeão\n\nNum toque de classe\na bola deita e rola no verde da grama\nA bela jogada, a magia\naumenta a fogueira em chamas\n\nCom grande amor pelo time\na imensa torcida se inflama\nE bate forte no peito\ngrita mais alto o que ama\n\n Camisa no corpo, bandeira na mão\nGrito na garganta explode coração\nToledo Toledo Toledo\nQuero ver-te sempre campeão\n\nCamisa no corpo, bandeira na mão\nGrito na garganta explode coração\nToledo Toledo Toledo\nQuero ver-te sempre campeão\n"));
        sectionedExpandableLayoutHelper.addSection("  PARANAENSES", arrayList6);

        ArrayList<Clube> arrayList7 = new ArrayList<>();
        arrayList7.add(new Clube(R.drawable.america_pe,"america_pe", "América - PE ", R.raw.america_pe, "Salve o América\nCampeão do centenário\nSalve o América\nTua glória é um rosário\n\nSalve o América\nCampeão do centenário\nSalve o América\nTua glória é um rosário\n\nTens o verde da esperança\nE o branco da paz\nAmérica, América\nPor ti serei capaz\n\nSalve o América\nCampeão do centenário\nSalve o América\nTua glória é um rosário\n Salve o América\nCampeão do centenário\nSalve o América\nTua glória é um rosário\n\nTens o verde da esperança\nE o branco da paz\nAmérica, América\nPor ti serei capaz\n América, América"));
        arrayList7.add(new Clube(R.drawable.belo_jardim,"belojardim", "Belo Jardim ", R.raw.belojardim, "O meu Calango quando ele entra em campo\nA torcida se levanta gritando com emoção!\nBelo Jardim Futebol Clube é muita raça\nFaz o gol, segura a taça nasceu pra ser campeão!\nO meu agreste agora tá orgulhoso\nMeu Calango tá famoso, joga bola e dá olé!\nBelo Jardim, eu vou contigo aonde for\nEsse time é meu amor nesse clube eu boto fé!\nSeguro a bandeira vou amanhecer o dia\nMeu Calango é alegria, minha torcida é de paz!\nBelo Jardim é meu o time preferido\nOnde for eu tô contigo te amo cada vez mais!\nDentro de campo esse time não enrola\nÉ bom no toque de bola, chuta forte e faz o gol!\nÉ muito bom, é bom demais é quem libera!\nDá um grito aí, galera que meu Calango chegou!"));
        arrayList7.add(new Clube(R.drawable.central_pe,"central_pe", "Central ", R.raw.central_pe, "Meu glorioso alvinegro\nÉs campeão das emoções\nTua glória, teu passado\nSempre presente em nossos corações\nTua bandeira alvinegra\nAo tremular relembra a tua história\nEnche de orgulho o nosso peito\nNos faz lutar em busca da vitória\nÉs filho de Caruaru\nCapital do Agreste em Pernambuco\nNossa busca de vitórias prevalece\nO teu gingado tão malandro, tão matuto\nCentral, Central, Central\nO teu nome me enche de emoção\nSeja na terra, em outras terras\nTua bandeira é força e tradição"));
        arrayList7.add(new Clube(R.drawable.ibis,"ibis", "Íbis ", R.raw.ibis, "Vamos meu Íbis pra luta\nE em qualquer disputa\nEstaremos ao seu lado\nJuro por Deus, eu prometo\nQue o pássaro preto\nVai dar tudo no gramado\n\nNossa torcida é fiel e organizada\nNa geral e arquibancada\nVai vibrar de emoção\nQuem espera sempre alcança\nA nossa esperança\nÉ ver o Íbis campeão\n\nNossa galera da poeira e do asfalto\nQuer ver o pássaro preto\nVoando sempre mais alto\nSomos unidos e queremos prosperar\nNosso lema é competir\nVer o Íbis triunfar"));
        arrayList7.add(new Clube(R.drawable.nautico,"nautico", "Nautico", R.raw.nautico, "Da união de duas cores mágicas\nNasceu a força e a raça\nVermelho de luta\nBranco de paz\nQuem olha não esquece jamais\nDa união de sete letras mágicas (bis)\nN.á.u.t.i.c.o\nNasceu um time que encanta\nQue manda e desmanda\nQue faz o nosso Carnaval\n\nNáutico teu caminho é de luz\nTua força, tua garra\nFascina e seduz\nNo meu coração\nBrotou o esplendor\nDe te adorar com emoção\nNo meu coração\nBrotou o esplendor\nDe te adorar com muito amor\n\nLá, lá, lá, lá, lá, lá, lá, lá, lá, lá\nLá, lá, lá, lá, lá, lá, lá, lá, lá, lá\n\nNo meu coração\nBrotou o esplendor\nDe te adorar com emoção\nNo meu coração\nBrotou o esplendor\nDe te adorar com muito amor"));
        arrayList7.add(new Clube(R.drawable.petrolina,"petrolina", "Petrolina", R.raw.petrolina, "Eis que surge a fera sertaneja\n" +
                "Nasce forte como é forte o sertão\n" +
                "Petrolina, heróico Petrolina\n" +
                "És o clube do meu Coração\n" +
                "Eis que surge a fera sertaneja\n" +
                "Nasce forte como é forte o sertão\n" +
                "Petrolina, heróico Petrolina\n" +
                "És o clube do meu Coração\n" +
                "Suas cores representa a cidade\n" +
                "Amarelo e verde rubro dessa terra\n" +
                "Quando surge o escrete no gramado\n" +
                "A torcida brada o seu grito de guerra\n" +
                "Quando surge o escrete no gramado\n" +
                "A torcida brada o seu grito de guerra\n" +
                "É Fera é Fera é Fera é Fera é Fera\n" +
                "\n" +
                "Eis que surge a fera sertaneja\n" +
                "Nasce forte como é forte o sertão\n" +
                "Petrolina, heróico Petrolina\n" +
                "És o clube do meu Coração\n" +
                "\n" +
                "Eis que surge a fera sertaneja\n" +
                "Nasce forte como é forte o sertão\n" +
                "Petrolina, heróico Petrolina\n" +
                "És o clube do meu Coração\n" +
                "\n" +
                "Suas cores representa a cidade\n" +
                "Amarelo e verde rubro dessa terra\n" +
                "Quando surge o escrete no gramado\n" +
                "A torcida brada o seu grito de guerra\n" +
                "Quando surge o escrete no gramado\n" +
                "A torcida brada o seu grito de guerra\n" +
                "É Fera é Fera é Fera é Fera é Fera"));
        arrayList7.add(new Clube(R.drawable.porto_pe,"porto", "Porto", R.raw.porto, "Sou do Clube Atlético do Porto\nClube do meu coração\nSuando a camisa na força da torcida\nSomos uma só nação (tricolor)\n\nSou do Clube Atlético do porto\nMeu Gavião (tricolor)\nO preto, azul e branco é a nossa bandeira\nCores do meu coração\nMeu Gavião do Agreste, mais uma vitória\nNo teu destino de glória, meu grito de gol (Gol)\nQuem é do Porto fica, quem vem não quer voltar\nPorto pra sempre será.\nNo vôo do gavião uma nova história\nBola no pé a jogada é fazer mais um gol (Gol)\nDa rua preta és filho, orgulho e tradição\nPorto do meu coração\n\nDa rua preta és filho, orgulho e tradição\nMeu tricolor gavião"));
        arrayList7.add(new Clube(R.drawable.salgueiro,"salgueiro_pe", "Salgueiro", R.raw.salgueiro_pe, "É Branco, verde e vermelho\nAs cores do meu coração\nSalgueiro Atlético Clube\nÉ o Tricolor do Sertão\n\nÉ força, é garra, é magia\nO sonho não acabou\nSe tem bola na rede começa a folia\nNa garganta o grito de gol\n\nFutebol é a minha alegria\nTem festa no interior\nNo toque da bola tem muita harmonia\nNa garganta o grito de gol\n\nÉ paixão no meu coração\nEmoção meu time é campeão\nÉ paixão, emoção\n\nSalgueiro Atlético Clube\nÉ! É! É!\nÉ o Carcará do Sertão!\n\nCarcará, pega, mata e come\nCarcará, não vai morrer de fome\nCarcará, mais coragem do que homem\nCarcará, pega, mata e come!"));
        arrayList7.add(new Clube(R.drawable.santacruz,"santacruz", "Santa Cruz", R.raw.santacruz, "Santa cruz santa cruz\nJunta mais esta vitória\nSanta cruz santa cruz\nAo teu passado de glória\nÉs o querido do povo \nO terror do Nordeste \nNo gramado tuas vitórias de hoje\nNos lembram vitórias do passado\nClube querido das multidões\nTu és o super campeão)"));
        arrayList7.add(new Clube(R.drawable.serrano,"serrano", "Serrano de Pernambuco", R.raw.serrano, "Nasceu o Serrano em nossa terra\nPreto e amarelo bordaram sua bandeira\nA torcida soltou o seu grito de guerra\nNosso Time não está pra brincadeira\nNos momentos de tristeza e de glória\nNo empate, na derrota ou na vitória\nÉs belo, considerado Sempre honrado neste sertão\nSerrano sempre Serrano eu sou Serrano de coração.\n"));
        arrayList7.add(new Clube(R.drawable.sport,"sport", "Sport", R.raw.sport, "Com o Sport Eternamente estarei\nPois rubro-negras são\nAs cores que abracei\nE o abraço, de tão forte,\nNão tem separação\nPra mim, o meu Sport É religião\n\nA vida a gente vive\nPra vencer Sport, Sport\nUma razão para viver\n\nTreze de Maio,\nMil novecentos e cinco\nDia divino em que Guilherme de Aquino\nReune, no Recife, ardentes seguidores\nFundando esta nação de vencedores\nQue encanta, enobrece e dá prazer\nSport, Sport\nUma razão para viver\n\nEterno símbolo de orgulho\nÉ o pavilhão\nDe listras pretas e vermelhas,\nCom o Leão\nErguendo, imponente, o imortal escudo\nMostrando à gente que o Sport é tudo\nQue a vida tem de belo a oferecer\nSport, Sport Uma razão para viver\n\nSão gerações e corações\nFazendo a história\nSão campeões e emoções\nTercendo a glória\nDo bravo Leão da Ilha, Sport obsessão\nQue faz bater mais forte o coração\nTorcida mais fiel não pode haver\nSport, Sport Uma razão para viver\nSport! Sport! Sport"));
        arrayList7.add(new Clube(R.drawable.vitoria_pe,"vitoria_pe", "Vitoria - PE", R.raw.vitoria_pe, "Tricolor azul, vermelho e branco\nQuando entra em campo levanta a multidão\nNo escudo monte das Taboas\nDois leões ostentam nosso torrão\n\nEm campo quando a bola rola\nO time é bom de bola lembra a seleção\nGinga de corpo, parece um ballet\nToque de bola no pé\nQue agrada qualquer torcedor\nJogador também dá trivela perfeito\nO craque mata no peito\nAmortece a pelota no chão\n\nPega o balão faz um drible de corpo é show\nDispara no canto é gol\nÉ gol, é gol\nPega o balão faz um drible de corpo é show\nDispara no canto é gol\nÉ gol, é gol\n\nAssociação Desportiva Vitória\nTricolor das Tabocas\nVitória de Santo Antão\n\nTri tri tricolor das Tabocas\nTri tri tricolor campeão\nTri tri tri 23 de agosto data da fundação\nTri tri tricolor das Tabocas\nTri tri tricolor campeão\nTri tri tricolor é a história da Vitoria de Santo Antão\n\nTri tri tricolor das Tabocas\nTri tri tricolor campeão\nTri tri tri 23 de agosto data da fundação\nTri tri tricolor das Tabocas\nTri tri tricolor campeão\nTri tri tricolor é a história da Vitoria de Santo Antão"));
        sectionedExpandableLayoutHelper.addSection("  PERNAMBUCANOS", arrayList7);

        ArrayList<Clube> arrayList8 = new ArrayList<>();
        arrayList8.add(new Clube(R.drawable.atletico_ba,"atletico_ba", "Atlético BA", R.raw.atletico_ba, "Somos a Turma Tricolor,\nSaudemos nossa terra, nossa gente\nQue de maneira forte e eficiente\nMil glórias de porvir irão trazer\nNo campo de peleja ânimo forte\nFazendo conhecer de Sul a Norte - Bis\nNossa firme vontade de vencer\nSaudemos nosso Atlético altaneiro\nQue irá mostrar para o Brasil inteiro\nDa nossa terra o futebol viril\nSalve Atlético estrela pelegrina\nDo cenário esportivo do Brasil\nAvante Alagoinhas, prá frente meu Atlético - Refrão\nVitórias que são minhas, mais uma eu te peço"));
        arrayList8.add(new Clube(R.drawable.bahia,"bahia", "Bahia", R.raw.bahia, "Somos a Turma Tricolor,\nSomos a voz do campeão,\nSomos do povo o clamor,\nNinguém nos vence em vibração!\n\nVamos, avante, esquadrão!\nVamos, serás o vencedor!\nVamos, conquistar mais um tento!\nBahia, Bahia, Bahia!\nOuve esta voz que é seu alento!\nBahia, Bahia, Bahia!\n\nMais um! Mais um, Bahia!\nMais um, mais um título de glória!\nMais um! Mais um, Bahia!\nÉ assim que se resume a sua história!"));
        arrayList8.add(new Clube(R.drawable.colocolo,"colocolo", "Colo Colo - BA", R.raw.colocolo, "Meu querido Colo Colo\ntua raça conquistou o meu amor\nexpressão mais verdadeira\nda profunda beleza de São Jorge dos Ilhéus\n\nNos mares competindo\nnos gramados da Bahia, tu és o campeão\nColo Colo, tu és o mais bonito\ntuas cores reluzes em meu coração\n\nColo Colo, grita o povo na avenida\nazul e amarelo a minha paixão\n\nColo-Colo, eu grito!\nColo-Colo, meu tigre!\nPasse o céu e a terra\nTu és o campeão"));
        arrayList8.add(new Clube(R.drawable.flu_de_feira,"flu_de_feira", "Fluminense de Feira", R.raw.flu_de_feira, "Fluminense, bravo touro pioneiro \nAlegria da torcida tricolor \nEntre os clubes da Bahia, o primeiro \nNo gramado tu és sempre o vencedor \nTua glória merecida e honrada \nEm três cores \nOstentando tua fibra \nA tua bandeira \nÉ a mais querida. \nAvante, avante, avante, Fluminense \nÉ hora, é hora \nQueremos mais um gooool! \nCom ênfase, bradamos teu refrão \nE repetimos a alegria da vitória."));
        arrayList8.add(new Clube(R.drawable.galacia,"galicia", "Galícia", R.raw.galicia, "Galícia, Galícia, Galícia, Demolidor de Campeões.\nGranadeiros da Cruz de Santiago\nClube querido com muitas tradições\nO Galícia tem nome na história,\nNo futebol tem títulos de glória\nSalve, salve pendão galiciano\nAlegria do futebol baiano\nUm, dois, três...\nGranadeiros tri campeões\nUm, dois, três...\nAzulino que domina corações.\nO Galícia é um forte toureiro\nQue toureia com muita valentia\nQue domina qualquer touro, na arena\nLutando sempre com amor e galhardia\nOs torcedores do Galícia são modestos\nSão ordeiros contudo animados\nPara frente Galícia, eles gritam\nLevando o clube a conquistar bons resultados\nPara frente Galícia mais um tento\nNão desanime porque vitória é nossa\nPara frente queremos mais um título\nPara frente com você não há quem possa\nPara frente queremos mais um título\nPara frente com você não há quem possa\nUm, dois, três...\nGranadeiros tri campeões\nUm, dois, três...\nAzulino que domina corações.\nO Galícia é um forte toureiro\nQue toureia com muita valentia\nQue domina qualquer touro, na arena\nLutando sempre com amor e galhardia."));
        arrayList8.add(new Clube(R.drawable.ipitanga,"ipitanga", "Ipitanga", R.raw.ipitanga, "Não vim para ser mais um,\nEncaro qualquer um, nasci um campeão...\nLaranja é a cor da fera e o grito da galera tem mais vibração\nEsporte Clube Ipitanga é futebol, é gana, é mais coração...\nE quando entra em campo estou feliz e canto toda essa energia...\n\n(refrão) / E tome bola na rede é gol do ipitanga , tucano mania /\n/ E tome bola na rede é gol do ipitanga é so alegria / X2\nEu visto essa camisa, com muito orgulho, com muita emoção\nEu vou gritar seu nome em qualquer estádio, em qualquer nação\nE quando entra em campo estou feliz e canto toda essa energia...\n"));
        arrayList8.add(new Clube(R.drawable.jacuipense,"jacuipense", "Jacuipense", R.raw.jacuipense, "Leão grená\nA tua força vem dos nossos corações\nLeão grená\nA tua garra traz milhões de emoções\nLeão grená\nÉ impossível não vibrar com teu calor\nE é tão forte, é tão forte a emoção\nQue haja, haja, haja, haja coração\nSport! Sport!\n\nSempre será\nÔlê, ôlê, ôlê, ôlê, ôlá\nSempre será\nÔlê, ôlê, ôlê, ôlê, ôlá\nE a história vai gravando sua glória\nÉs o povo, és a gente\nSport Clube Jacuipense!!!\n\nSempre será\nÔlê, ôlê, ôlê, ôlê, ôlá\nSempre será\nÔlê, ôlê, ôlê, ôlê, ôlá\nE a história vai gravando sua glória\nÉs o povo, és a gente\nSport Clube Jacuipense!!!"));
        arrayList8.add(new Clube(R.drawable.juazeirense,"juazeirense", "Juazeirense", R.raw.juazeirense, "Verde esperança\nAmarelo, vermelho da terra do Sol\nDas margens do Rio São Francisco\nForça que gera energia e vida no chão\n\nO cancão de fogo\nO cancão de fogo\nO cancão de fogo\nDo grande sertão\n\nHoje eu vou vestir a camisa 12 eu vou\nBrilhar numa noite de estrelas\nNuma tarde de imenso calor\nPois meu o povo de novo orgulhoso\nCantando o seu canto de amor\n\nEu sou\nSou Juazeirense, eu sou\nO amor sempre vence\nEu sou\nSou Juazeirense, eu sou\nO amor sempre vence\n\nEu sou raça\nSou fé, alegria, valente, veloz, vibração\nO cancão de fogo\nDo grande sertão\n\nNosso time é bola pra frente para ser campeão\nCom Juazeiro pra sempre no meu coração\n\nSou\nSou Juazeirense, eu sou\nO amor sempre vence\nEu sou\nSou Juazeirense, eu sou\nO amor sempre vence\n\nEu sou\nSou Juazeirense, eu sou\nO amor sempre vence\nEu sou\nSou Juazeirense, eu sou\nO amor sempre vence\n\nEu sou\nSou raça\nSou fé, alegria, valente, veloz, vibração\nO cancão de fogo\nDo grande sertão\n\nNosso time é bola pra frente para ser campeão\nCom Juazeiro pra sempre no meu coração\n\nSou\nSou Juazeirense, eu sou\nO amor sempre vence\nEu sou\nSou Juazeirense, eu sou\nO amor sempre vence\nEu sou\nSou Juazeirense, eu sou\nO amor sempre vence\nEu sou\n"));
        arrayList8.add(new Clube(R.drawable.juazeiro,"juazeiro", "Juazeiro", R.raw.juazeiro, "Juazeiro tú es tradição Pela raça e dedicação \nSuas lutas e suas glórias És o time do meu coração \nSuas lutas e suas glórias És o time do meu coração \nJuazeiro onde estiver Estarei pra o que der e vier \nFirme e forte com esperança Por é isso é que a gente quer \nFirme e forte com esperança Por é isso é que a gente quer \nJuazeiro esta sempre em ação E pra frente em sua direção \nNa trajetória de grandes vitórias Juazeiro é o campeão \nNa trajetória de grandes vitorias Juazeiro é o campeão \nNa trajetória de grandes vitórias Juazeiro é o campeão"));
        arrayList8.add(new Clube(R.drawable.vitoria,"vitoria", "Vitória", R.raw.vitoria, "Vitória, Vitória\nMostra o teu valor\nNo campo da luta\nTu é os melhor\nNo teu pavilhão\nTens feitos de Glória\nVitória, Vitória\nTu tens grande história\n\nSomos torcedores\nde grande valor\nsomos rubro-negro\nnão temos temor\nestamos contigo em qualquer lugar\nPois temos conquistas\nna terra e no mar\n\nVitória, Vitória\nMostra o teu valor\nNo campo da luta\nTu é os melhor\nNo teu pavilhão\nTens feitos de Glória\nVitória, Vitória\nTu tens grande história\n\nProcura mostrar\nTodo teu poder\nSomos invenciveis\nNão vamos temer\nO teu pavilhão\nNós vamos erguer\nSeremos Vitória até morrer\n\nVitória, Vitória\nMostra o teu valor\nNo campo da luta\nTu é os melhor\nNo teu pavilhão\nTens feitos de Glória\nVitória, Vitória\nTu tens grande história"));
        arrayList8.add(new Clube(R.drawable.vitoria_conquista,"virotia_conquista", "Vitória da Conquista", R.raw.virotia_conquista, "Eu sou Vitória da Conquista,\neu sou Vitória da Conquista,\nsou a jóia do sertão,\nsou da Bahia, sou do Brasil,\neu sou o Vitória da Conquista,\nsou um grande campeão.\n\nO meu time joga com raça,\ncoragem e amor no coração,\no seu brilho é elegância,\ne no jogo é razão, é emoção.\n\nVamos Conquista bola jogar\ne ganharmos com alegria,\npara que possamos brilhar;\ncom alma, bravura,\ngarra e galhardia,\nO Vitória da conquista é o orgulho da Bahia\n\nCampeão, ê ô, Conquista,\nCampeão, ê ô, Conquista,\nVitória da Conquista é o Primeiro Passo\nmeu amado alviverde,\nvocê é a minha paixão.\n\nCampeão, ê ô, Conquista...\nCampeão, ê ô, Conquista...\n\nCampeão, ê ô, Conquista..."));
        arrayList8.add(new Clube(R.drawable.ypiranga_ba,"ypiranga_ba", "Ypiranga", R.raw.ypiranga_ba, "Aurinegro equipe varonil\nteu passado honroso de glórias\né o loiro da torcida viril\nincentivo das grande vitórias\nYpiranga o time mais querido\nesquadrão aguerrido e leal\né no campo da luta temido\npelo mais valoroso rival\n\navante Ypiranga popular\nmas um tento, outro tento nós, queremos\npara tua bandeira tremular\ne todos nós com a vitória vibraremos.\n"));
        sectionedExpandableLayoutHelper.addSection("  BAIANOS", arrayList8);

        ArrayList<Clube> arrayList9 = new ArrayList<>();
        arrayList9.add(new Clube(R.drawable.anapolina,"anapolina", "Anapolina", R.raw.anapolina, "Anapolina é um show de futebol\nAnapolina brilha mais do que o sol\nAnapolina é um show de futebol\nAnapolina brilha mais do que o sol.\n\nEu sou Anapolina\nOrgulho da nossa história\nAlegria que contamina\nPeito cheio de glória.\n\nDá-lhe Xata\nÉ gol, é gol! É mais um show\nViva a nossa bandeira\nAnapolina, paixão verdadeira.\n\nAnapolina é um show de futebol\nAnapolina brilha mais do que o sol\nAnapolina é um show de futebol\nAnapolina brilha mais do que o sol."));
        arrayList9.add(new Clube(R.drawable.aparecidense,"aparidense_go", "Aparecidense", R.raw.aparidense_go, "É o azul e branco,\nque faz o meu coração bater pela\nAparecidense que nasceu pra vencer.\nÉ o azul e branco,\nque faz o meu coração bater pela \n\nAparecidense que nasceu pra vencer.\nDesde 1985 a Aparecidense faz parte da nossa vida\nÉ o orgulho da cidade de Aparecida\nÉ garra, é amor, é a nossa emoção\nSou Aparecidense de coração\nÉ garra, é amor, é a nossa emoção\nSou Aparecidense de coração\nTocando de pé em pé\nA gente chega junto com a Aparecidense\nOnde o azul e branco estiver"));
        arrayList9.add(new Clube(R.drawable.atletico_go,"atleticogo", "Atlético GO", R.raw.atleticogo, "Meu Atlético,\nMeu estandarte\nModéstia à parte tem a força\nQuente de um dragão\nMeu Atlético tem a mania de dar\nAlegria pro meu coração...\nMeu rubro negro, eu chego e vejo,\nVocê cumprindo o meu desejo de vencer, vencer, vencer!\nDá gosto ver nosso dragão,\nRolando a bola pelo chão e\nDando um show e mais um gol...\nLê Lêlêoo\nLê Lêlêoo\nAtlético!"));
        arrayList9.add(new Clube(R.drawable.crac,"crac", "CRAC", R.raw.crac, "(Vamos lá meu leão do Sul !) (CRAC)\n\nAs terras de Goiás ensolaradas\n(lá lá lá lá)\nDo chão um goiano se elevou\n(lá lá lá lá)\nA mão de Deus abençoou\nO CRAC de Catalão\nCom muito mais amor...\nEu te amo meu leão\nEu te amo\nAs cores branca e azul\nEu te amo meu leão\nEu te amo\nNinguém segura o leão do Sul !\n\nO céu de Catalão tem mais estrelas\n(lá lá lá lá)\nO verde teu está mais esplendor\n(lá lá lá lá)\nPorque Deus abençoou\nO sudeste de Goiás\nSó plantamos amor...\n\nEu te amo meu leão\nEu te amo\nAs cores branca e azul\nEu te amo meu leão\nEu te amo\nNinguém segura o leão do Sul !\n\n(Vamos lá meu timão !)\n\nA fera indomada de Goiás\n(lá lá lá lá)\nDos clubes goianos é o terror\n(lá lá lá lá)\nCatalanos vibram muito mais\nO leão em campo é o vencedor...\n\n(Agora !)\n\n(53, 53 minutos\nRômulo vai para a cobrança\nQuem sabe agora galera\nPrepara a festa torcedor\n\"Tá\" bonito o Genervino\nA galera grita Rômulo(2x)\n\"Tá\" tudo \"ok\"\nVai bate Rômulo\n53, 53, 53\n\"Vamo\" Rômulo\nArtilheiro do Campeonato\n\"Sô\" mais você Rômulo\nBateu:\nGOOOOOOOOOOOOL !)\n\nEu te amo meu leão\nEu te amo\nAs cores branca e azul\nEu te amo meu leão\nEu te amo\nNinguém segura o leão do Sul !\n\n(Eu quero vê todo mundo cantando para este timão !)\n(CRAC)\n\nAs terras de Goiás ensolaradas\n(lá lá lá lá)\nDo chão um goiano se elevou\n(lá lá lá lá)\nA mão de Deus abençoou\nO CRAC de Catalão\nCom muito mais amor...\n\n(CRAC)\n\nEu te amo meu leão\nEu te amo\nAs cores branca e azul\nEu te amo meu leão\nEu te amo\nNinguém segura o leão do Sul !\n\nO céu de Catalão tem mais estrelas\n(lá lá lá lá)\nO verde teu está mais esplendor\n(lá lá lá lá)\nPorque Deus abençoou\nO sudeste de Goiás\nSó plantamos amor...\n\n(CRAC)\n\nEu te amo meu leão\nEu te amo\nAs cores branca e azul\nEu te amo meu leão\nEu te amo\nNinguém segura o leão do Sul !\n\n(Vamos lá meu timão !)\n\nA fera indomada de Goiás\n(lá lá lá lá)\nDos clubes goianos é o terror\n(lá lá lá lá)\nCatalanos vibram muito mais\nO leão em campo é o vencedor...\n\n(Todo mundo comigo !)\n\nEu te amo meu leão\nEu te amo\nAs cores branca e azul\nEu te amo meu leão\nEu te amo\nNinguém segura o leão do Sul !\n\n(CRAC)"));
        arrayList9.add(new Clube(R.drawable.goianesia,"goianesia", "Goianésia", R.raw.goianesia, "Desde 1955, Goianésia Esporte Clube,\n" +
                "é e sempre será time de brilho.\n" +
                "Desde 1955, Goianésia Esporte Clube,\n" +
                "é e sempre será time de brilho.\n" +
                "Garra, raça, amor nunca faltou para esse time,\n" +
                "Fé, força, do Vale do São Patrício é filho.\n" +
                "E os corações batem mais forte quando o Azulão,\n" +
                "Vai entrando campo e explode a multidão,\n" +
                "Muitas emoções, lágrimas correm, alegre sensação,\n" +
                "Mais uma batalha ganha é campeão.\n" +
                "Azulão do Vale vontade pra valer,\n" +
                "Solte a voz e cante: Somos Goianésia para sempre."));
        arrayList9.add(new Clube(R.drawable.goiania,"goiania", "Goiania", R.raw.goiania, "O galo carijó é professor.\nO galo carijó é brigador.\nO galo quando entra no rebolo\npega a bola, faz o gol, esconde a bola e ninguém vê\n\nCadê a bola?, cadê cadê?\nGoiânia Esporte Clube futebol é com você!\nCom você!!Com você!!\n\nCadê a bola?, cadê cadê?\nGoiânia Esporte Clube futebol é com você!\nCom você!!Com você!!"));
        arrayList9.add(new Clube(R.drawable.goias,"goias", "Goias", R.raw.goias, "Eu sou Goiás Esporte Clube\nEu sou Goiás, eu sou Goiás e vou gritar\nAté o peito me doer,\nAté perder a voz eu sou Goiás\nEu sou Goiás até morrer\nEu sou Goiás, eu sou Goiás de coração\nCada vez nossa torcida cresce mais\nEternamente serei Goiás\n\nNosso Clube é a nossa glória\nA nossa garra, nossa gente, nossa história\nO amor pela nossa bandeira\nÉ para nós a maior vitória\n\nNosso Clube é a nossa glória\nNossa garra, nossa gente, nossa história\nA vida toda eu vou torcer\nEu sou Goiás, Goiás, até morrer\n\nEu sou Goiás Esporte Clube\nEu sou Goiás, eu sou Goiás e vou gritar\nAté o peito me doer,\nAté perder a voz eu sou Goiás\nEu sou Goiás até morrer\nEu sou Goiás, eu sou Goiás de coração\nCada vez nossa torcida cresce mais\nEternamente serei Goiás\nCada vez nossa torcida cresce mais\nEternamente serei Goiás."));
        arrayList9.add(new Clube(R.drawable.itumbiara,"itumbiara", "Itumbiara", R.raw.itumbiara, "Gigante temível do vale,\nÉs tu meu querido esquadrão!\nTricolor que se empenha na luta,\nMoras dentro do meu coração!\nNa disputa em que entras tens raça,\nE fugor com bravura aguerrida,\nTua força transpassa fronteiras,\nÉs o orgulho que tenho na vida...\nSob aplausos de tua torcida,\nMostras garra e firmeza tão rara,\nSustentando o emblema que usas,\nÉs leal és o meu ITUMBIARA,\nÉs leal és o meu ITUMBIARA,\n....Gol....\nTua massa também é fiel,\nPois orgulhas o povo goiano,\nDestemido gigante do vale,\nDestas quadras és um soberano,\nGigante temível do vale,\nÉs tu meu querido esquadrão!\nTricolor que se empenha na luta,\nMoras dentro do meu coração,\nMoras dentro do meu coração."));
        arrayList9.add(new Clube(R.drawable.jataiense,"jataiense", "Jataiense", R.raw.jataiense, "Gigante és, já está escrita a sua história\nNa glória, alegria e emoção\nEm campo és o maior\nJá sabe de cor, p sabor da vitória\nLevanto a sua bandeira\nCom muito orgulho, com emoção\n\nJataiense, meu sangue é verde\nOrgulho do meu coração\nJataiense, meu sangue é verde\nOrgulho do meu coração\n\nAgora deixa a bola rolar, deixa rolar\nA raposa em campo é emoção, é emoção\nNesse gramado verde a bola, é o meu coração\n\nO meu amor é para sempre\nE para sempre eu vou te amar\nBrilhando Jataiense\nSó tenho um lema: 'Ganhar, ganhar'\nNo livro de ouro, sua história\nEncanta com raça, fé e emoção\n\nJataiense, meu sangue é verde\nOrgulho do meu coração\nJataiense, meu sangue é verde\nOrgulho do meu coração\n\nAgora deixa a bola rolar, deixa rolar\nA raposa em campo é emoção, é emoção\nNesse gramado verde a bola, é o meu coração\n\nO meu amor é para sempre\nE para sempre eu vou te amar\nBrilhando Jataiense\nSó tenho um lema: 'Ganhar, ganhar'\nNo livro de ouro, sua história\nEncanta com raça, fé e emoção \n\nJataiense, meu sangue é verde\nOrgulho do meu coração\nJataiense, meu sangue é verde\nOrgulho do meu coração\n Jataiense, meu sangue é verde\nOrgulho do meu coração\n\nGigante és, já está escrita a sua história\nNa glória, alegria e emoção\nEm campo és o maior\nJá sabe de cor, p sabor da vitória\nLevanto a sua bandeira\nCom muito orgulho, com emoção\n\nJataiense, meu sangue é verde\nOrgulho do meu coração\nJataiense, meu sangue é verde\nOrgulho do meu coração\n\nAgora deixa a bola rolar, deixa rolar\nA raposa em campo é emoção, é emoção\nNesse gramado verde a bola, é o meu coração\n\nO meu amor é para sempre\nE para sempre eu vou te amar\nBrilhando Jataiense\nSó tenho um lema: 'Ganhar, ganhar'\nNo livro de ouro, sua história\nEncanta com raça, fé e emoção\n\nJataiense, meu sangue é verde\nOrgulho do meu coração\nJataiense, meu sangue é verde\nOrgulho do meu coração\n\nAgora deixa a bola rolar, deixa rolar\nA raposa em campo é emoção, é emoção\nNesse gramado verde a bola, é o meu coração\n\nO meu amor é para sempre\nE para sempre eu vou te amar\nBrilhando Jataiense\nSó tenho um lema: 'Ganhar, ganhar'\nNo livro de ouro, sua história\nEncanta com raça, fé e emoção \n\nJataiense, meu sangue é verde\nOrgulho do meu coração\nJataiense, meu sangue é verde\nOrgulho do meu coração\n Jataiense, meu sangue é verde\nOrgulho do meu coração"));
        arrayList9.add(new Clube(R.drawable.mineiros,"mineiros", "Mineiros", R.raw.mineiros, "Novo rei da bola já surgiu\nE é do centro-oeste do brasil\nNo peito, azul e branco é só emoção\nMineiros é o grande campeão\n Se quiser falar, que fale\nCuidado com a Águia do Vale\nMas se quiser vencer é só dizer\nSou Águia, sou Águia até morrer\n\nMas eu volto a dizer\nSe você quer vencer\nMineiros Esporte ClubeDe glorias pra sempre vou viver"));
        arrayList9.add(new Clube(R.drawable.novo_horizonte_go,"novo_horizonte_go", "Novo Horizonte", R.raw.novo_horizonte_go, "Entramos juntos para vencer,\n" +
                "com nosso time vamos jogar,\n" +
                "Veste a camisa, ergue a bandeira.\n" +
                "\n" +
                "Entramos juntos com a mesma raça,\n" +
                "com a mão na taça, sem vacilar,\n" +
                "De pé em pé, passando a bola\n" +
                "cruza na área, é gol!\n" +
                "\n" +
                "Amarelo e preto! É o Fantasma! Chegou a hora!\n" +
                "Explode o grito de gol! Goooooool…\n" +
                "E o torcedor vai ao delírio,\n" +
                "e chora de emoção vendo seu timão na frente\n" +
                "\n" +
                "Novo Horizonte é meu Zonte!!\n" +
                "Está em nossos corações\n" +
                "No peito essa paixão!\n" +
                "Gritar com emoção!\n" +
                "É Zonte!\n" +
                "\n" +
                "Toda a galera vai jogar\n" +
                "entrando em campo pra ganhar\n" +
                "um brado forte a ecoar\n" +
                "Olé, Olé! Mais um, mais um!\n" +
                "\n" +
                "Explode o grito de gol! Goooooool…\n" +
                "E o torcedor vai ao delírio,\n" +
                "e chora de emoção vendo seu timão na frente\n" +
                "\n" +
                "Novo Horizonte é meu Zonte!!\n" +
                "Está em nossos corações\n" +
                "No peito essa paixão!\n" +
                "Gritar com emoção!\n" +
                "É Zonte!"));
        arrayList9.add(new Clube(R.drawable.vilanova,"vilanovago", "Vila Nova", R.raw.vilanovago, "Salve o Vila Nova tetracampeão\nSalve o Vila Nova\nOrgulho da nossa região.\n\nO Vila Nova não pode parar\nO tigre da vila famosa tem que triunfar\nSua torcida é fenomenal\nÊta esquadrão legal!"));
        sectionedExpandableLayoutHelper.addSection("  GOIANOS", arrayList9);

        ArrayList<Clube> arrayList10 = new ArrayList<>();
        arrayList10.add(new Clube(R.drawable.atletico_cearense,"atletico_cearense", "Atlético Cearense", R.raw.atletico_cearense, "Um pequeno sonho de criança\nUm universo de emoções se fez\nFoi alimentado a esperança\nNossa bandeira anunciou a nossa vez\n\nComo águia nos reinventamos\nComo águia longe enxergamos\nComo águia nos superamos\nVoando alto, vitórias contamos\nComo águia nos superamos\nVoando alto, vitórias contamos\n\nUm sonho a ser conquistado\nEm um clube cheio de amor\nÉ o futebol cearense exaltado\n\nAtlético Cearense\n\nVencedor, vencedor, vencedor"));
        arrayList10.add(new Clube(R.drawable.barbalha_ce,"barbalha_ce", "Barbalha", R.raw.barbalha_ce, "Barbalha, Barbalha\nBarbalha, Barbalha\n\nSalve o nosso tricolor\nBarbalha clube do meu coração\nSuas cores carregam no peito\nBarbalha sempre campeão\nSuas cores carregam no peito\nBarbalha sempre campeão\n\nBarbalha o teu passado de glórias\nTua torcida não se esquece jamais\nNo peito e na raça levanta essa taça\nBarbalha sempre muito mais\nNo peito e na raça levanta essa taça\nRaposa dos verdes canaviais\n\nDomingo vai ter baile lá no Inaldão\nA raposa vai jogar\nQueremos mais um show,\nQueremos mais um gol\nFaz a rede balançar\n\nDomingo vai ter baile lá no Inaldão\nA raposa vai jogar\nQueremos mais um show,\nQueremos mais um gol\nFaz a rede balançar"));
        arrayList10.add(new Clube(R.drawable.caucaia_ce,"caucaia", "Caucaia", R.raw.caucaia, "Caucaia Esporte Clube\nO tricolor que a gente ama\nCaucaia Esporte Clube\nQuerida raposa metropolitana\n\nCaucaia Esporte Clube\nO tricolor que a gente ama\nCaucaia Esporte Clube\nQuerida raposa metropolitana\n\nPreto, vermelho e branco\nSão suas cores, seu pavilhão\nGosto de te ver lá no gramado\nSou do Caucaia do meu coração\n\nCaucaia Esporte Clube\nO tricolor que a gente ama\nCaucaia Esporte Clube\nQuerida raposa metropolitana\n\nCaucaia Esporte Clube\nO tricolor que a gente ama\nCaucaia Esporte Clube\nQuerida raposa metropolitana"));
        arrayList10.add(new Clube(R.drawable.ceara,"ceara", "Ceara", R.raw.ceara, "Teu passado é todo coberto de glórias\nDia-a-dia tu conquistas mais vitórias\nTua bandeira alvinegra desfraldada\nTeu time em campo tem vitória assegurada.\n\nCampeão da popularidade\nTua torcida hoje é toda cidade\nÉ um grande povo a te estimular\nÉ o Vovô Ceará vai ganhar.\n\nÉs o time das grandes campanhas\nSempre aqui ou lá fora tu ganhas\nCom teus craques em campo a brilhar\nCeará tua glória é lutar."));
        arrayList10.add(new Clube(R.drawable.ferroviario,"ferroviario", "Ferroviário", R.raw.ferroviario, "Salve, Salve FAC\nÉ o time dos maiorais\nE é Ferroviário Atlético Clube\nO dono das iniciais\nSomos companheiros inseparáveis\nNa alegria e na tristeza\nCom esse vermelho, preto e branco\nQue traz o símbolo da beleza\nVamos marchar para a luta\nContinuar nossa jornada\nNão enxergamos sacrifício\nEnfrentamos qualquer parada\nO Ferrão foi e será\nO maior do Ceará!"));
        arrayList10.add(new Clube(R.drawable.floresta,"floresta", "Floresta", R.raw.floresta, "Foi no dia Nove de Novembro \nNasceu o meu time pra ser campeão\nÉ nosso Floresta Esporte Clube\nVai pra cima deles força verdão\n\nMeu time verdão de guerreiros\nNo Ceará não tem pra ninguém\nVamos Floresta querido\nFazer a alegria também\n\nAvante sempre Verdão\nPra sempre ser Campeão\nAvante sempre Verdão\nPra sempre ser Campeão"));
        arrayList10.add(new Clube(R.drawable.fortaleza,"fortaleza", "Fortaleza", R.raw.fortaleza, "Fortaleza,\nClube de glória e tradição.\nFortaleza,\nQuantas vezes campeão.\nFortaleza,\nQuerido idolatrado,\nestás sempre guardado,\ndentro do meu coração.\n\nAltivo,\ntua vida sempre foi um marco,\ntua glória é lutar e vencer também,\nsalve o Tricolor de Aço.\n\nNo campo,\nprovaste mesmo que não tens rival,\ntua turma é valente, é sensacional,\nsalve o Tricolor de Aço.\n\nSoberbo,\ntua fibra representa um norte,\ncombativo, aguerrido, vibrante e forte.\nSem demonstrar cansaço,\n\nReceba um sincero,\nabraço da torcida tão leal,\nmeu Tricolor de Aço!"));
        arrayList10.add(new Clube(R.drawable.guarai_juazeiro,"guarani_juazeiro", "Guarani de Juazeiro", R.raw.guarani_juazeiro, "O meu coração, é Guarani.\nEu sou Leão,\naté que a morte nos separe,\nEu não vou abrir.\n\nO meu coração, é Guarani.\nEu sou Leão,\naté que a morte nos separe,\nEu não vou abrir.\n\nGuarani, Guarani, Guarani.\nMinha alegria é te ver jogar.\nGuarani, Guarani, Guarani,\nganhando ou perdendo,\nnada vai me impedir.\n\nDe gritar gol (Gol).\nDe te seguir.\nPra onde você for, eu vou meu Guarani.\n\nVou gritar gol (Gol).\nEu vou vestir,\na camisa rubro-negra do meu Guarani.\n\nO meu coração, é Guarani.\nEu sou Leão,\naté que a morte nos separe,\nEu não vou abrir.\n\nO meu coração, é Guarani.\neu sou Leão,\nAté que a morte nos separe,\nEu não vou abrir.\n\nGuarani, Guarani, Guarani.\nBandeira em punho, sempre a tremular.\nGuarani, Guarani, Guarani.\nTua camisa é minha pele,\nte amo, meu Guará.\n\nVou gritar gol (Gol).\nVou te seguir,\nPra onde você for, eu vou meu Guarani.\n\nVou gritar gol (Gol).\nEu vou vestir,\na camisa rubro-negra do meu Guarani.\n\nO meu coração, é Guarani.\nEu sou Leão,\naté que a morte nos separe,\nEu não vou abrir.\n\nO meu coração, é Guarani.\nEu sou Leão,\naté que a morte nos separe,\nEu não vou abrir.\n\nGuarani, Guarani, Guarani.\nSeu torcedor é o mais apaixonado.\nGuarani, Guarani, Guarani.\nSerá pra sempre o Leão do Mercado\n\nVou gritar gol (Gol).\nEu vou vestir,\na camisa rubro-negra do meu Guarani."));
        arrayList10.add(new Clube(R.drawable.guarany_pe,"guarany_ce", "Guarany de Sobral", R.raw.guarany_ce, "Guarany, teu nome é glória\nGuarany, símbolo de vitória\nGuarany, na luta és tão forte\nÉs orgulho da \"Princesa do Norte\".\n\nÉs cacique de um vale vibrante\nQue vai muito avante, avante lutar\nPor um povo que ama seu time\nGuarany! Guarany!\nVamos lutar, vamos ganhar."));
        arrayList10.add(new Clube(R.drawable.icasa,"icasa", "Icasa", R.raw.icasa, "O verde vale do cariri, é a bandeira do nosso esquadrão.\nDesfraudada sobre a maior torcida,\nNossa só corrente de Mão em mão.(bis)\nMeu padim nos gramados do céu,\né mais um craque a orar meu Verdão,\na fé nos conduz a vitória, Icasa eterno campeão. Ê, ê, ê, ô icasa (bis)\n\nTemos forças pra lutar (utererê)\nIcasa estamos do teu lado (utererê)\nNão importa o resultado (utererê)\nO que importa é te amar.\n\nVamos jogar para vencer, (utererê)\nNão temos nada a temer (utererê)\nIcasa estamos aí, és a paixão do meu cariri"));
        arrayList10.add(new Clube(R.drawable.itapipoca,"itapipoca", "Itapipoca", R.raw.itapipoca, "Abram-alas para o tricolor passar\n" +
                "Moleque travesso meu amor\n" +
                "Amarelo, verde e branco\n" +
                "Esquadrão de raça e vencedor\n" +
                "Ita, Ita\n" +
                "Itapipoca terror do Ceará\n" +
                "Meu clube amado\n" +
                "Eu só vivo pra te amar\n" +
                "Vamos lá galera\n" +
                "Pro estádio, pra torcer\n" +
                "E ver a pelota de pé em pé\n" +
                "Vamos pra torcida\n" +
                "Jogar junto pra vencer\n" +
                "E ver o Itapipoca dar olé\n" +
                "Vamos lá galera\n" +
                "Pro estádio, pra torcer\n" +
                "E ver a pelota de pé em pé\n" +
                "Vamos pra torcida\n" +
                "Jogar junto pra vencer\n" +
                "E ver o Itapipoca dar olé"));
        arrayList10.add(new Clube(R.drawable.pacajus,"pacajus", "Pacajús", R.raw.pacajus, "Vamos vibrar, vibrar, vibrar\nVamos torcer\nVamos lutar, lutar\nVamos vencer\n\nA torcida se agita\nJoga junto pra valer\nPacajús nós amamos você\n\nVamos vibrar, vibrar, vibrar\nVamos torcer\nVamos lutar, lutar\nVamos vencer\n\nA torcida se agita\nJoga junto pra valer\nPacajús nós amamos você\n\nQuadricolor brilhante\nAmado, querido\nO seu nome é sigla importante\nCacique destemido\n\nSou do Ceará\nSou seu torcedor\nPacajús meu clube\nMeu amor\n\nVamos vibrar, vibrar, vibrar\nVamos torcer\nVamos lutar, lutar\nVamos vencer\n\nA torcida se agita\nJoga junto pra valer\nPacajús nós amamos você\n\nVamos vibrar, vibrar, vibrar\nVamos torcer\nVamos lutar, lutar\nVamos vencer\n\nA torcida se agita\nJoga junto pra valer\nPacajús nós amamos você"));
        sectionedExpandableLayoutHelper.addSection("  CEARENSES", arrayList10);

        ArrayList<Clube> arrayList11 = new ArrayList<>();
        arrayList11.add(new Clube(R.drawable.asa,"asa", "Asa", R.raw.asa, "Na terra dos marechais, um clube esportivo se destaca. \nPelo valor de seus craques, o ASA DE ARAPIRACA \n \nO seu pendão alvi-negro, sai com garbo varonil, \nconquistando sempre vitórias, sob os céus deste Brasil. \n \nOh! craques da esportiva, o ASA gigante tornai. \nCom bravura e galhardia, ide avante. Lutai! Lutai! \n \nOh! ASA da minha terra, aos píncaros da glória voai, \ne aos vossos admiradores, \nos loiros da vitória legai. \n \nOrgulhoso e altaneiro, o ASA sempre de pé, \nficará nas páginas da história, da terra de Manoel André. "));
        arrayList11.add(new Clube(R.drawable.comercial_vicosa,"comercial_vicosa", "Comercial de Viçosa", R.raw.comercial_vicosa, "Avante, avante é sangue\n" +
                "Que impulsiona a força do Comercial\n" +
                "O nosso batis, tem o esplendor do pavilhão nacional.\n" +
                "Sois avante, ó bravo\n" +
                "Jamais seremos  na disputa um time escravo\n" +
                "A cidade inteira vibra festiva ante o fulgor desta bandeira.\n" +
                "No campo da batalha,\n" +
                "A pelota é nossa amiga.\n" +
                "A posse da medalha,\n" +
                "Jamais ninguém nos tira.\n" +
                "Toda pujança em gente\n" +
                "Da juventude ousada,\n" +
                "Esplende heroicamente na meta conquistada.\n" +
                "Avante, avante é sangue\n" +
                "Que impulsiona a força do Comercial\n" +
                "O nosso batis, tem o esplendor do pavilhão nacional.\n" +
                "Sois avante, ó bravo\n" +
                "Jamais seremos  na disputa um time escravo\n" +
                "A cidade inteira, vibra festiva ante o fulgor desta bandeira.\n" +
                "A imagem  tão maravilhosa\n" +
                "Será sempre imortal no esporte de Viçosa\n" +
                "Com a sereno e louros de vitória.\n" +
                "A gregos e helenos cobrimos na vitória.\n" +
                "Avante, avante é sangue\n" +
                "Que impulsiona a força do Comercial\n" +
                "O nosso batis, tem o esplendor do pavilhão nacional.\n" +
                "Sois avante, ó bravo\n" +
                "Jamais seremos  na disputa um time escravo\n" +
                "A cidade inteira, vibra festiva ante o fulgor desta bandeira."));
        arrayList11.add(new Clube(R.drawable.corinthians_alagoano,"corinthians_alagoano", "Corinthians Alagoano", R.raw.corinthians_alagoano, "Em Alagoas surge um clube tricolor.\nCorinthians, Corinthians, Corinthians meu novo amor.\n\nDo Quilombo dos Palmares ao azul dos nossos mares, \nnasceu a força de um novo canto, sou Corinthians, \nsou vermelho, preto e branco.\n\nSou tricolor, oh, oh... sou tricolor, oh, oh... \neu sou Corinthians, sou vermelho, preto e branco.\n\nE toda sua história será de glória, \neu não me engano salvo o Corinthians Alagoano.\n\nSou tricolor, oh, oh... sou tricolor, oh, oh... \neu sou Corinthians, sou vermelho, preto e branco."));
        arrayList11.add(new Clube(R.drawable.coruripe_al,"coruripe", "Coruripe ", R.raw.coruripe, "Alvi verde eu sou,\ncom todo o meu amor\nCoruripe eu sou,\npor que ele retribui o meu amor.\n\nAlvi verde eu sou,\ncom todo o meu amor\nCoruripe eu sou,\npor que ele retribui o meu amor.\n\nNa segundona em 2003,\no Coruripe foi a grande sensação.\npois jogando o fino da bola,\nfoi fazendo escola,\nvai ser nosso campeão...\n\nAlvi verde eu sou,\ncom todo o meu amor\nCoruripe eu sou,\npor que ele retribui o meu amor.\n\nCom Bira e Beltrão no comando,\ne o açúcar Coruripe no coração,\na seleção alvi verde vai ganhar\no passaporte pra primeira divisão.\n\nAlvi verde eu sou,\ncom todo o meu amor\nCoruripe eu sou,\npor que ele retribui o meu amor.\n\nAlvi verde eu sou,\ncom todo o meu amor\nCoruripe eu sou,\npor que ele retribui o meu amor."));
        arrayList11.add(new Clube(R.drawable.csa,"csa", "CSA", R.raw.csa, "Pela pátria, na vida esportiva\nÉ que vamos sempre conquistar\nNossa glória da luta deriva\nÉ o campeão dos campeões CSA\n\nAzulinos impávidos e fortes\nEnfrentemos os nossos rivais\nNosso time não tem adversários\nNão seremos vencidos jamais\n\nCentro Sportivo Alagoano\nNo Mutange eterno vencedor\nSe tremulas a tua bandeira\nAlvi-celeste é com amor\n\nNesse anseio infinito de glória\nEsse Centro Sportivo não tem\nA vaidade que é sempre ilusória\nE que nunca elevou à ninguém\n\nVamos todos em busca das vitórias\nCom o coração na ponta das chuteiras\nUnião e Força CSA\nAzul e Branco a vida inteira\nCentro Sportivo Alagoano\nNo Mutange eterno vencedor\nSe tremulas a tua bandeira\nAlvi-celeste é com amor "));
        arrayList11.add(new Clube(R.drawable.cse,"cse", "CSE", R.raw.cse_al, "Sou tricolor, sou tricolor\n" +
                "Com muita raça, com muita fé, com muito amor\n" +
                "Sou tricolor, sim eu sou de coração\n" +
                "CSE tu és o nosso campeão\n" +
                "\n" +
                "Sou tricolor, sou tricolor\n" +
                "Com muita raça, com muita fé, com muito amor\n" +
                "Sou tricolor, sim eu sou de coração\n" +
                "CSE tu és o nosso campeãoJoga para mostrar como é\n" +
                "É bola no chão, é bola na rede, é bola no pé\n" +
                "Tua torcida grita com empolgação\n" +
                "CSE tu és o nosso campeão\n" +
                "\n" +
                "Sou tricolor, sou tricolor\n" +
                "Com muita raça, com muita fé, com muito amor\n" +
                "Sou tricolor, sim eu sou de coração\n" +
                "CSE tu és o nosso campeãoSou tricolor, sou tricolor\n" +
                "Com muita raça, com muita fé, com muito amor\n" +
                "Sou tricolor, sim eu sou de coração\n" +
                "CSE tu és o nosso campeão\n" +
                "\n" +
                "Joga para mostrar como é\n" +
                "É bola no chão, é bola na rede, é bola no pé\n" +
                "Tua torcida grita com empolgação\n" +
                "CSE tu és o nosso campeãoJoga para mostrar como é\n" +
                "É bola no chão, é bola na rede, é bola no pé\n" +
                "Tua torcida grita com empolgação\n" +
                "CSE tu és o nosso campeão"));
        arrayList11.add(new Clube(R.drawable.crb,"crb", "CRB", R.raw.crb, "Ao remo pois nosso norte \nDe glórias traçado está \nFaçamos o peito forte \nQue a pátria forte será \nArgonautas da esperança \nVamos bem longe embalar \nNosso sonho de bonança \nAo mar! Ao mar! \nAmemos a natureza \nO mar verde e o céu de anil \nAvante! Pela grandeza \nDo nosso caro Brasil \nNos momentos mais extremos \nA pátria em nós terá fé \nE o futuro venceremos \nAlegres, firmes, de pé \nEm nossas veias ardentes \nDe marujo o sangue corre \nMocidade para a frente \nQue a mocidade não morre. "));
        arrayList11.add(new Clube(R.drawable.ipanema,"ipanema", "Ipanema", R.raw.ipanema, "Ipanema, Ipanema\nTime orgulho do nosso futebol\nIpanema Esporte Clube\nEntre os bons tu és sempre o melhor\n\n\nIpanema, Ipanema\nTime orgulho do nosso futebol\nIpanema Esporte Clube\nEntre os bons tu és sempre o melhor\n\nIpanema, Ipanema querido\nO teu nome é pura tradição\nTodo povo santanense\nSente orgulho de seu tri-campeão\n\nTua torcida é para valer\nGrita forte que há de vencer\nTuas cores vestem o meu coração\nVerde, amarelo canarinho do sertão "));
        arrayList11.add(new Clube(R.drawable.murici_al,"murici", "Murici", R.raw.murici, "Tu és o Clube do meu coração,\nés a paixão desse povo altaneiro.\nFutebol, raça, humildade e ação,\nés campeão, tu és o primeiro.\n\nMurici, tua garra é crescente,\nno teu verde a esperança é real.\nFutebol de primeira e pra frente,\nteu escrespe não tem nada igual.\n\nMurici, teu caminho é de glória,\nno gramado tua força é total.\nNo teu branco clareia a vitória,\ne a galera é alegria geral.\n\nTu és o Clube do meu coração,\nés a paixão desse povo altaneiro.\nFutebol, raça, humildade e ação,\nés campeão, tu és o primeiro.\n\nMurici, o teu lema é vencer,\nsem temer, isso nunca é demais.\nÉs o laço entre o esporte e o prazer,\nsem perder a ternura jamais.\n\nVai em frente campeão das matas,\ntua luta, teu sonho é que faz.\nO sucesso em tua vida retratas,\ncom a pinta alviverde e a paz.\n\nTu és o Clube do meu coração,\nés a paixão desse povo altaneiro.\nFutebol, raça, humildade e ação,\nés campeão, tu és o primeiro. "));
        arrayList11.add(new Clube(R.drawable.penedense,"penedense", "Penedense", R.raw.penedense, "Eia! Vamos galharda corte,\n" +
                "ao combate, que é belo vencer, vencer!\n" +
                "Pois quem é como nós\n" +
                "bravo e fortes,\n" +
                "a derrota não deve temer\n" +
                "\n" +
                "Penedense guião da vitória,\n" +
                "que na luta não temos rival,\n" +
                "o teu lema é lutar pela glória,\n" +
                "que mais belo, mais nobre ideal?\n" +
                "\n" +
                "Penedense guião da vitória,\n" +
                "que na luta não temos rival,\n" +
                "o teu lema é lutar pela glória,\n" +
                "que mais belo, mais nobre ideal?\n" +
                "\n" +
                "Salve corte aguerrida,\n" +
                "afirmação do valor!\n" +
                "A glória trazes contida\n" +
                "no teu pendão bicolor.\n" +
                "\n" +
                "Alvirrubro pendão altaneiro,\n" +
                "em valor só te pode passar,\n" +
                "o alviverde pendão brasileiro,\n" +
                "que no mundo tremula sem par\n" +
                "\n" +
                "Penedense palavra que luz,\n" +
                "qual sentinela incentiva em nossa alma\n" +
                "na peleja que a glória conduz,\n" +
                "Penedense, terás sempre a palma.\n" +
                "\n" +
                "Salve corte aguerrida,\n" +
                "afirmação do valor!\n" +
                "A glória trazes contida\n" +
                "no teu pendão bicolor.\n" +
                "\n" +
                "Alvirrubro pendão altaneiro,\n" +
                "em valor só te pode passar,\n" +
                "o alviverde pendão brasileiro,\n" +
                "que no mundo tremula sem par"));
        arrayList11.add(new Clube(R.drawable.santa_rita_al,"santa_rita_al", "Santa Rita", R.raw.santa_rita_al, "O Glorioso Santa Rita\nCampeão e imortal\nMeu vibrante Rubro negro\nAguerrido e leal\nSeus torcedores satisfeitos\nSempre de pé a vibrar\nao gigante do pé da serra\nnum só coro a cantar\n\nEu amo esse time e o nome dele eu vou dizer\nSanta Rita\nSanta Rita\nSanta Rita\nVencer, vencer\n\nSanta Rita\nSanta Rita\nEstarei sempre com você\n\nO Glorioso Santa Rita\nés orgulho de minha terra\nBoca da Mata assoberba\nMinha Cidade das Serras\nVibrante, ousado e amoroso\nno campo mostra sua raça\nDesde de 1974 sempre será\nconquistador de taça\n\nEu amo esse time e o nome dele eu vou dizer\n\nSanta Rita\nSanta Rita\nSanta Rita\nVencer, vencer\n\nSanta Rita\nSanta Rita\nEstarei sempre com você"));
        sectionedExpandableLayoutHelper.addSection("   ALAGOANOS", arrayList11);

        ArrayList<Clube> arrayList12 = new ArrayList<>();
        arrayList12.add(new Clube(R.drawable.aguia_de_maraba,"aguia_de_maraba", "Águia de Marabá", R.raw.aguia_maraba, "Sou Águia de coração\n" +
                "Sou azul e branco\n" +
                "Sou forte, sou paixão\n" +
                "Guerreiro, sou campeão!\n" +
                "É gol, é raça é emoção…\n" +
                "\n" +
                "Nas asas do vento sou amor\n" +
                "Sou Marabá Brasil\n" +
                "Sou da cor da flor\n" +
                "Sou paz, sou sul do pará\n" +
                "Sou Águia de Marabá…\n" +
                "\n" +
                "É gol, é bola na rêde\n" +
                "Sacode a bandeira,\n" +
                "levanta a poeira.\n" +
                "Sou Águia, sou Águia,\n" +
                "sou Águia, sou Marabá…"));
        arrayList12.add(new Clube(R.drawable.bragantino,"bragantino_pa", "Bragantino - PA", R.raw.bragantino_pa, "Bragantino, Bragantino\nNinguém pode negar o teu valor\nBragantino, Bragantino\nA força jovem que vem do interior\nTens como a correnteza\nQue leva de rodão\nTemido, forte, bravo\nEm cada decisão\nTua garra e entusiasmo\nNinguém pode negar\nVermelho, azul e branco\nTem as cores do Pará\nTua garra e entusiasmo\nNinguém pode negar\nVermelho, azul e branco\nTem as cores do Pará\nBragantino, Bragantino\nO adversário vai cansar até tombar\nBragantino, Bragantino\nO teu destino é ser sempre campeão\nFeito esquadrão colosso\nTu és o Tubarão\nDesperta nas torcidas\nPaixão e emoção\nTua garra e entusiasmo\nNinguém pode negar\nVermelho, azul e branco\nTem as cores do Pará"));
        arrayList12.add(new Clube(R.drawable.castanhal,"castanhal", "Castanhal", R.raw.castanhal, "Estou marcado para defender o meu clube\n" +
                "Fundado em 1924\n" +
                "A mais dificil peregrinação\n" +
                "Mas o instinto de campeão\n" +
                "\n" +
                "Trajetória de momentos tão dificeis\n" +
                "De muita luta e muita paixão\n" +
                "Eu me orgulho, eu grito, canto e pulo\n" +
                "Sou Castanhal de coração\n" +
                "Eu me orgulho, eu grito, canto e pulo\n" +
                "Sou Castanhal de coração\n" +
                "\n" +
                "Em homenagem, ao pássaro tão belo\n" +
                "Me visto de preto e amarelo\n" +
                "Que do seu ninho, fez uma rede de gol\n" +
                "Com suas penas homenageou\n" +
                "\n" +
                "Obrigado ó Japim da estrada\n" +
                "Com tanta força e determinação\n" +
                "Contagia de amor e de carinho\n" +
                "De coração pra coração\n" +
                "\n" +
                "És tradição do dia 7 de setembro\n" +
                "Do ano que eu nem sequer me lembro\n" +
                "Eu me orgulho, eu grito, canto e pulo\n" +
                "Sou Castanhal de coração\n" +
                "Eu me orgulho, eu grito, canto e pulo\n" +
                "Sou Castanhal de coração"));
        arrayList12.add(new Clube(R.drawable.paysandu,"paysandu", "Paysandu", R.raw.paysandu, "De vitórias e louros coroado,\nAltivo, o Paysandu jamais temeu...\nTem um belo, honradíssimo passado,\nSão nobres as batalhas que venceu\n\nCada um de nós guarda no peito,\nValor e orgulho extraordinários\nDas nossas cores têm respeito\nOs mais pujantes adversários\n\"Lutar\"! eis a divisa que trazemos!\n\"Vencer\"! eis a esperança que nos guia!\nLeais e destemidos seguiremos\nA glória que o futuro nos confia!\n\nCada um de nos guarda no peito...\nSomos jovens e ousados paladinos,\nE sempre achar-nos-hão de gladio nu,\nElevando nos prélios mais ferinos\nCom honra o pavilhão do Paysandu\nCada um de nós guarda no peito...\nAmamos os cambates! e na luta,\nComo antigos heróis nos comportamos,\nPor isso a vez do público se escuta,\nSaudar o Paysandu com meus aclamos\nCada um de nós guarda no peito..."));
        arrayList12.add(new Clube(R.drawable.remo,"remo", "Remo", R.raw.remo, "Atletas azulinos somos nós,\ne cumpriremos o nosso dever,\num dia quando unidos para a luta,\no pavilhão sabemos defender.\n\nEnquanto a azul bandeira tremuleja,\no vento a beija, como a sonhar,\nhonrando essa bandeira que paneja,\nnós todos saberemos com amor lutar.\n\nE NÓS ATLETAS TEMOS VIGOR,\nA NOSSA TURMA É TODA DE VALOR (BIS).\n\nNós todos no vigor da mocidade,\nvamos gozando nessa quadra jovial,\ne nós, os azulinos da cidade,\nerguemos vivas ao nosso ideal.\n\nEm cada um de nós mora a esperança,\nnossa pujança, nosso ideal,\ne porque somos do CLUBE DO REMO\nNuma só voz diremos que não tem igual\n\nE NÓS ATLETAS TEMOS VIGOR,\nA NOSSA TURMA É TODA DE VALOR (BIS)"));
        arrayList12.add(new Clube(R.drawable.sao_francisco,"sao_francisco", "São Francisco", R.raw.sao_francisco, "Camisa azul,\nNossa paixão.\nEm cada jogo uma vitória,\nSalve o grande Clube,\nSete vezes campeão!\nVence sempre a garra do “Leão”.\nDe Santarém\nÉ o maior.\nA cor do Tapajós\nO São Francisco há de honrar,\nSeja na glória,\nSeja no azar,\nPois nunca faltará o ardor!\n\nInflama a torcida vibrante\nQue acena a bandeira, e eu sou\nFanático porque festejo,\nCantando alegremente a cada gol:\n\nSão Francisco, São Francisco!\nÉs o glorioso sem par.\n\nSão Francisco, São Francisco!\nÉs o glorioso sem par."));
        arrayList12.add(new Clube(R.drawable.sao_raimundo_pa,"sao_raimundo_pa", "São Raimundo", R.raw.sao_raimundo_pa, "Meu São Raimundo,\nGlorioso alvinegro,\nJoga bola pra valer\nSou São Raimundo até morrer.\nMeu São Raimundo,\nGlorioso alvinegro,\nJoga bola pra valer\nSou São Raimundo até morrer.\n\nMuitas glórias no passado e no presente\nNo esporte é o maioral\nMeu Pantera Negra\nSó tu é o nosso ideal\nSão Raimundo é time forte e de raça\nNos gramados, vence tudo e ergue a taça.\n\nA torcida agora grita de emoção:\n“São Raimundo, meu pantera, é campeão!”.\nPantera! Pantera! Goool"));
        arrayList12.add(new Clube(R.drawable.tunalusa,"tunaluso", "Tuna-Luso", R.raw.tunaluso, "Nós estamos empunhando a bandeira\nComemorando a nossa vitória,\nTuna, Tuna, Tuna\nÉ mais um time\nQue entra na história.\nTuna Luso Brasileira,\nO teu passado é de glória\nLutando na terra e no mar\nE conquistando sempre as vitórias.\nNós estamos empunhando a bandeira\nComemorando a nossa vitória\nTuna, Tuna, Tuna\nÉ mais um time que\nQue entra na história.\nVerde, branco e a cruz de malta,\nQue mora no meu coração\nTu és a águia do Souza\nE serás sempre em toda geração\nNós estamos empunhando a bandeira\nComemorando a nossa vitória\nTuna, Tuna, Tuna\nÉ mais um time que entra na história."));
        sectionedExpandableLayoutHelper.addSection("  PARAENSES", arrayList12);

        ArrayList<Clube> arrayList13 = new ArrayList<>();
        arrayList13.add(new Clube(R.drawable.berga,"berga", "Berta", R.raw.berga, "Sou Berga esporte clube\nTime da minha paixão\nQuando esse time entra em campo nossa torcida\nSe empolga de emoção\nToque de bola desconcertante\nToca batendo igual os nossos corações\nVamos comemorar torcer pro Berga salve nosso esquadrão\n\nÉ gooooooooool\nÉ gooooooooool\nÉ gooooooooool\n\nÔôôôôôÔÔÔôÔôÔÔÔô\n\nEu vou, eu vou, eu vou.\nVou me preparar\n\nPra assistir ver o meu Berga\nDá um show particular\nNo verdão ou em qualquer estádio\nSua torcida presente vai estar\nVencer sempre vencer Berga\nA galera ama você\n\nÉ gooooooooool\nÉ gooooooooool\nÉ gooooooooool\n\nOooooooooooooooo\n\nNo verdão ou em qualquer estádio\nSua torcida presente vai estar\nVencer sempre vencer Berga\nA galera Cuiabá ama você\n\nÉ gooooooooool\nÉ gooooooooool\nÉ gooooooooool\n\nÔôôôôôÔÔÔôÔôÔÔÔô "));
        arrayList13.add(new Clube(R.drawable.cuiaba,"cuiaba", "Cuiabá", R.raw.cuiaba, "Cuiabá Esporte Clube, time do meu coração\nNasceste, predestinado para ser um grande campeão \n \nLegítimo representante da cidade verde, da terra do sol \nÉs guerreiro, és gigante, na arte do futebol \nÉs guerreiro, és gigante, na arte do futebol \n \nAuriverde da baixada \nSuas cores lembram nossa tradição \nE cada gol (gol) é uma jogada que ascende a chama da nossa paixão \nE cada gol (gol) é uma jogada que ascende a chama da nossa paixão \n \nCuiabá, Cuiabá, Cuiabá \nTens a valentia de um dourado \nEm campo nos faz vibrar \nNo gingado do rasqueado \n \nCuiabá, Cuiabá, Cuiabá \nTens a valentia de um dourado \nEm campo nos faz vibrar \nNo gingado do rasqueado \n \nCuiabá Esporte Clube, este é o time do meu coração "));
        arrayList13.add(new Clube(R.drawable.luverdense,"luverdense", "Luverdense", R.raw.luverdense, "Sou Luverdense de encantos mil do sul ao norte do meu Brasil \nÉs glorioso de encantos mil do sul ao norte do meu Brasil \n \nTeu verde representa as matas seu manto branco que dá paz ao torcedor, \nGrito de gol na arquibancada (gooooollll) e nós estamos contigo por onde for \nSou Luverdense de encantos mil do sul ao norte do meu Brasil \nÉs glorioso de encantos mil do sul ao norte do meu Brasil \n \nTu que nasceste grande é nosso orgulho futebol é nossa paixão \nEu sou Luverdense e quero ver você sempre campeão \n \nTeu verde representa as matas seu manto branco que dá paz ao torcedor, \nGrito de gol na arquibancada (gooooollll) e nós estamos contigo por onde for \n \nSou Luverdense de encantos mil do sul ao norte do meu brasil \nÉs glorioso de encantos mil do sul ao norte do meu brasil \nJá faz parte da história nos dando glória  \ncontagiando de emoção és o gigante do norte e faz parte de todos os corações."));
        arrayList13.add(new Clube(R.drawable.mixto,"mixto", "Mixto", R.raw.mixto, "O Mixto Esporte Clube\nAgora se apresenta.\nE pelo branco e negro,\nAs cores que ostenta\nNo seu pavilhão.\n\nSeremos sempre unidos\nE sempre destemidos.\nHavemos de lutar\nE também trabalhar\nDe todo coração.\n\nHurra!... Hurra!...\n\nO Mixto Esporte Clube\nSerá o lema\nDesta nossa sociedade.\nA união e também a lealdade.\n\nDebaixo do nosso céu de anil,\nTremula altaneira\nNossa gentil bandeira.\nE pelo esporte, em nossa Cuiabá,\nTeremos por fanal,\nLutar, lutar, lutar\nPor nosso ideal."));
        arrayList13.add(new Clube(R.drawable.sinop,"sinop", "Sinop", R.raw.sinop, "Somos de um clube que já nasceu campeão\nSomos SINOP de coração\nTua camisa vestimos com emoção\nE mostraremos tua glória para a nação\n\nNo interior, és o primeiro campeão\nA torcida é a maior, é multidão\nAzul e branco é o nosso manto\nA nossa casa é o Gigantão\n\nO nosso galo, honra a capital do norte\nEm nosso estado é o orgulho do esporte\nVamos gritar ao grande campeão, SINOP, clube do meu coração, GALO!"));
        arrayList13.add(new Clube(R.drawable.uniao,"uniao", "União", R.raw.uniao, "Sua camisa se confunde\nCom o rio e o coração desta cidade\nUnião, garra e vontade\n\nNos gramados enfrenta todos\nE joga com lealdade\nUnião, força e coragem\n\nNão tem lugar, não tem fronteira\nNossa torcida é companheira\n\nE onde quer que ele vá\nNós iremos acompanhar\n\nVibra União, o colorado do meu coração\nVibra União, mais uma vês ele vai ser o campeão\n\nSua bandeira resplandece\nEm um passado de glória\nNos gramados do país\nEstá escrito a sua história\n\nÉ força e garra, trabalho, dedicação\nVamos nessa colorado, nosso time é campeão!"));
        arrayList13.add(new Clube(R.drawable.vilaaurora,"vila_aurora", "Vila Aurora", R.raw.vila_aurora, "Nova Aurora surgiu no Horizonte,\npra saudar o Cruzeiro do Sul\nO explendor das estrelas cadentes,\ntatuou o meu peito de azul\n\nComo garras de um tigre ferroz,\narraigou-se no meu coração\nFez morada, brotou e cresceu,\ndando vida ao glorioso Tigrão.\n\nÉs Raçudo, vibrante e temido\nFez a verve de um vencedor\nNa defesa ao ataque é só raça\nPro inimigo somos um terror\n\nFirme e forte na luta ou na classe\nVencer sempre é a nossa missão\nVila Aurora a galera te adora\nSalve salve o glorioso Tigrão"));
        sectionedExpandableLayoutHelper.addSection("  MATO-GROSSENSES", arrayList13);

        ArrayList<Clube> arrayList14 = new ArrayList<>();
        arrayList14.add(new Clube(R.drawable.abc,"abc", "ABC", R.raw.abc, "ABC clube do povo\nCampeão das multidões\nSerás sempre o mais querido\nEntre os nossos corações\nEu me orgulho em ser da terra Potiguar\nQuando eu vou para o gramado ver o ABC jogar\n\nÉ bola pra aqui\nÉ bola pra lá\nA turma joga com classe e com raça pra ganhar\nO adversário fica no campo perdido\nSalve o mais querido\nSalve o mais querido\nSalve o mais querido\nSalve o mais querido"));
        arrayList14.add(new Clube(R.drawable.alegrim,"alegrim", "Alebrim", R.raw.alecrim, "O wiphurra ao nosso bicampeão\n" +
                "Todo povo te saúde de alma e coração\n" +
                "Bate olé no grama com o adversário seu\n" +
                "Alecrim Futebol Clube você é meu\n" +
                "\n" +
                "O wiphurra ao nosso bicampeão\n" +
                "Todo povo te saúde de alma e coração\n" +
                "Bate olé no grama com o adversário seu\n" +
                "Alecrim Futebol Clube você é meu\n" +
                "\n" +
                "É voz geral da torcida potiguar\n" +
                "O negócio só tem graça se o Alecrim jogar\n" +
                "Dá gosto de ver\n" +
                "Os meninos traçando o bolão pra valer\n" +
                "Deixando o adversário sem nada poder fazer\n" +
                "Olé!"));
        arrayList14.add(new Clube(R.drawable.americarn,"americarn", "América RN", R.raw.americarn, "O nosso time mostra a sua raça no jogo\nÉ o América, América\n\nVai conquistando o coração do povo no jogo\nE na torcida eu sou América\nEu sou América e tenho orgulho de ser\nPorque o América em tudo é o melhor\nÉ alegria no esporte e no futebol\nAmérica, América\nÉ alegria no esporte e no futebol\nAmérica,América\n\nMeu coração vibra nas suas cores\nEu sou América, América\nÉ uma canção que canta mil amores, enfim\nCantou América, América\n\nVamos em frente gente Americana\nMostrar que o nosso time entrou pra valer\nBola pra frente, quero ver jogando pra ganhar\nAmérica, América"));
        arrayList14.add(new Clube(R.drawable.atletico_potiguar,"atletico_potiguar", "Atlético Potiguar", R.raw.atletico_potiguar, "Atlético Potiguar\n" +
                "Vamos vibrar com o Atlético Potiguar\n" +
                "Vamos torcer\n" +
                "Torcer, torcer com emoção\n" +
                "Sou seu torcedor de corpo, alma e coração\n" +
                "Atlético você é  meu campeão\n" +
                "Vamos vibrar com o Atlético Potiguar\n" +
                "Vamos torcer\n" +
                "Torcer, torcer com emoção\n" +
                "Sou seu torcedor de corpo, alma e coração\n" +
                "Atlético você é  meu campeão\n" +
                "Você é sol que brilha sempre\n" +
                "No futebol alegra a gente\n" +
                "Eu vou pro estádio\n" +
                "Vou torcer e vou vibrar\n" +
                "Vibrar, vibrar\n" +
                "Salve o meu Atlético Potiguar"));
        arrayList14.add(new Clube(R.drawable.baraunas,"baraunas", "Baraúnas", R.raw.baraunas, "Baraúnas, tu és origem Da história que fez tradição. \nFostes chefe, na mata virgem, De uma tribo desta região. \n\nO seu verde da mata encanta. \nTens o branco que a paz reuniu. \nNo vermelho do sangue a esperança \nDe tua garra repleta de brio.\n\nOh tricolor! oh tricolor! \nOh tricolor É no gramado que tu és um vencedor \nOh tricolor! Oh tricolor! \nOh tricolor Leão guerreiro, \nimbatível aonde for.\n\nBaraúnas, és um guerreiro, \nTens a glória de ser campeão No esporte, \nés o primeiro, Bate forte no meu coração.\n\nMossoró, tu és grande e altaneira. \nTens um nome a zelar no Brasil. \nBaraúnas és um marco de história \nDe um clube guerreiro e viril.\n\nOh tricolor! oh tricolor! Oh tricolor \nÉ no gramado que tu és um vencedor \nOh tricolor! Oh tricolor!"));
        arrayList14.add(new Clube(R.drawable.globo,"globo", "Globo", R.raw.globo, "Globo vai entrar em campo\nE vai jogar com alma e coração\nNossa torcida vai vibrar com os gols\nEm Ceará - Mirim no gramado do Barretão\n\nGlobo vai entrar em campo\nE vai jogar com alma e coração\nNossa torcida vai vibrar com os gols\nEm Ceará - Mirim no gramado do Barretão\n\nA Águia vai voar bem alto\nHasteando a bandeira tricolor\nVerde amarelo e preto\nDo Globo eu sou torcedor"));
        arrayList14.add(new Clube(R.drawable.macau,"macau", "Macau", R.raw.macau, "Macau Esporte Clube altaneiro\n" +
                "És o primeiro dentro do meu coração\n" +
                "Meu querido time salineiro\n" +
                "Forte e guerreiro do nosso esporte bretão\n" +
                "Filhos das salinas e do mar\n" +
                "Meu tubarão\n" +
                "Macau você é o meu campeão\n" +
                "Azul e negro\n" +
                "Negro e azul\n" +
                "Entre mil amores\n" +
                "Brilham tuas cores\n" +
                "De leste a oeste\n" +
                "E de norte a sul\n" +
                "Macau Esporte Clube altaneiro\n" +
                "Macau, Macau"));
        arrayList14.add(new Clube(R.drawable.palmeira_rn,"palmeira_rn", "Palmeira", R.raw.palmeira, "Vamos torcer, torcer, torcer\n" +
                "Vamos torcer com emoção\n" +
                "Com emoção\n" +
                "Sou da torcida esmeraldina\n" +
                "Que canta e vibra, sua paixão\n" +
                "Vamos torcer, torcer, torcer\n" +
                "Vamos torcer de coração\n" +
                "Salve o guerreiro de Goianinha\n" +
                "Salve, salve o meu verdão\n" +
                "Força do agreste\n" +
                "De tradição\n" +
                "Meu clube amado\n" +
                "Palmeira do meu coração"));
        arrayList14.add(new Clube(R.drawable.poriguar,"potiguar", "Potiguar", R.raw.potiguar, "Sobre o branco das salinas\nVibra o sangue de um guerreiro\nAlvirrubro, cuja sina\nÉ chegar sempre primeiro\n\nTradição de gente forte\nSempre pronta pra lutar\nCom a nobreza do esporte\nÉs meu Potiguar\n\nA ruidosa charanga\nBandeiras bailam no ar\nUma torcida se inflama\nPotiguar, Mossoró, Potiguar.\n\nCada passo, nova glória\nQue a história floriu\nDesta jóia que hoje brilha\nO Nordeste do Brasil"));
        arrayList14.add(new Clube(R.drawable.potyguar,"potyguar", "Potyguar", R.raw.potyguar, "Potyguar meu querido Potyguar\n" +
                "No esporte tu és uma glória\n" +
                "Quando entra no campo do jogo\n" +
                "Seus atletas lutam pela vitória\n" +
                "\n" +
                "Com garra suando a camisa\n" +
                "com o apoio de sua torcida\n" +
                "Potyguar tu és grande e forte\n" +
                "No futebol do rio grande do norte\n" +
                "\n" +
                "Potyguar! Potyguar!\n" +
                "Mostra seu valor\n" +
                "Potyguar! Potyguar\n" +
                "Com bravura e amor!"));
        arrayList14.add(new Clube(R.drawable.santa_cruz_rn,"santa_cruz_rn", "Santa Cruz de Natal", R.raw.santa_cruz_rn, "Salve o rei do gramado\nSalve o meu tricolor\nSalve o meu clube amado\nSanta Cruz, tu serás sempre um vencedor\nSalve o rei do gramado\nSalve o meu tricolor\nSalve o meu clube amado\nSanta Cruz, tu serás sempre um vencedor\nRaça, garra e força\nDestemido esquadrão\nTu serás sempre meu campeão\nMeu time valente\nGuerreiro e tradicional\nSalve o meu Santa Cruz de Natal\nSalve o meu Santa Cruz de Natal"));
        arrayList14.add(new Clube(R.drawable.sao_goncalo,"sao_goncalo", "São Gonçalo", R.raw.sao_goncalo, "Vou para o estádio vibrar\\nCom minha bandeira na mão\\nEu visto a camisa\\nEsfrego o emblema\\nNo meu coração\\nMeu time é forte e valente\\nSão Gonçalo é meu tesouro\\nQuero ver jogar\\nE eu poder gritar\\nÉ gol do touro\\n\\nSão Gonçalo tu és o melhor\\nDo interior à capital\\nÉs a minha maior alegria\\nNo Rio Grande do Norte\\nMeu time é forte\\nÉ o meu maioral\\nEu vou pedir proteção\\nSão Gonçalo chegou para jogar\\nVai na raça ele é meu campeão\\n\\nO “Touro” é forte\\nÉ bom no esporte\\nEu não posso negar\\nSou São Gonçalo e sou muito fiel\\nSuas cores engrandecem o futebol\\nCom o “Touro” eu vou mais além\\nPode até chover cair tempestade\\nOu então fazer sol.\\n"));
        sectionedExpandableLayoutHelper.addSection("  NORTE-RIOGRANDENSES", arrayList14);

        ArrayList<Clube> arrayList15 = new ArrayList<>();
        arrayList15.add(new Clube(R.drawable.bacabal,"bacabal", "Bacabal", R.raw.bacabal, "Bola pra frente esquadrão bacabalense\n" +
                "No peito franco da torcida campeã\n" +
                "Bate um coração azul e branco\n" +
                "Que mistura nas cores a raça dos povos\n" +
                "O abraço sincero no grito de gol\n" +
                "Mostra sua força sua raça tudo em fim\n" +
                "És o Leão do Mearim\n" +
                "\n" +
                "Bola pra frente esquadrão bacabalense\n" +
                "No peito franco da torcida campeã\n" +
                "Bate um coração azul e branco\n" +
                "Que mistura nas cores a raça dos povos\n" +
                "O abraço sincero no grito de gol\n" +
                "Mostra sua força sua raça tudo em fim\n" +
                "És o Leão do Mearim\n" +
                "\n" +
                "Tens a tradição no futebol\n" +
                "Tu és o preferido, és o mais querido\n" +
                "Teu povo sofrido, contente, aguerrido,\n" +
                "agita, transpira, delira, suspira de tanta emoção\n" +
                "\n" +
                "Bacabal Esporte Clube,\n" +
                "Futebol é coração\n" +
                "Bola pra frente nosso grande campeão\n" +
                "Bacabal Esporte Clube,\n" +
                "A alegria do povão\n" +
                "Querido BEC orgulho do meu Maranhão"));
        arrayList15.add(new Clube(R.drawable.chapadinha,"chapadinha", "Chapadinha", R.raw.chapadinha, "Nessa terra de lindas mulatas\n" +
                "O esporte já se consagrou\n" +
                "Com destaque no seu futebol\n" +
                "Tão galhardo e de grande valor\n" +
                "\n" +
                "Chapadinha o galo querido\n" +
                "Que nasceu pra crescer e vencer\n" +
                "É o nosso esquadrão preferido\n" +
                "Que desperta no amanhecer\n" +
                "\n" +
                "Altiva torcida\n" +
                "Vamos torcer e vibrar\n" +
                "Não deixemos o galo cair\n" +
                "Pois é hora de o levantar\n" +
                "\n" +
                "Para glória de nosso torrão\n" +
                "A vitória ele vai buscar\n" +
                "Chapadinha ó galo querido\n" +
                "Há motivos para comemorar\n" +
                "\n" +
                "Tuas cores brilham na bandeira\n" +
                "Sempre erguida e a tremular\n" +
                "Alentando o teu torcedor\n" +
                "Confiante chegar a desvairar\n" +
                "\n" +
                "Teus atletas com garra e coragem\n" +
                "São guerreiros sempre a luta\n" +
                "E a torcida vai incentivando\n" +
                "E a vitória brilhante chegar\n" +
                "\n" +
                "Altiva torcida\n" +
                "Vamos torcer e vibrar\n" +
                "Não deixemos o galo cair\n" +
                "Pois é hora de o levantar\n" +
                "\n" +
                "Para glória de nosso torrão\n" +
                "A vitória ele vai buscar\n" +
                "Chapadinha ó galo querido\n" +
                "Há motivos para comemorar\n" +
                "\n" +
                "Na derrota, empate ou vitória\n" +
                "Ou durante a sofrida partida\n" +
                "Estaremos sempre solidários\n" +
                "No aguardo da grande saída\n" +
                "\n" +
                "Chapadinha ó galo querido\n" +
                "Nossa ??? vai sempre cantar\n" +
                "Expandindo o teu futebol\n" +
                "E a galera sempre a delirar\n" +
                "\n" +
                "Altiva torcida\n" +
                "Vamos torcer e vibrar\n" +
                "Não deixemos o galo cair\n" +
                "Pois é hora de o levantar\n" +
                "\n" +
                "Para glória de nosso torrão\n" +
                "A vitória ele vai buscar\n" +
                "Chapadinha ó galo querido\n" +
                "Há motivos para comemorar"));
        arrayList15.add(new Clube(R.drawable.cordino,"cordino", "Cordino ", R.raw.cordino, "Canta meu Cordino Esporte Clube\nCanta com amor a tua glória\nCanta com a tua voz altaneira\nQue a tua bandeira bem alto tremula\nNo Pavilhão da vitória\n\nEnfrentarás lutando pelo teu valor\nE vencerás com honra, glória e ardor\nQuer na paz, quer na luta, vencerás!\nSalve Cordino Esporte Clube!\nNome de luz e amor\n\nEnfrentarás lutando pelo teu valor\nE vencerás com honra, glória e ardor\nQuer na paz, quer na luta, vencerás!\nSalve Cordino Esporte Clube!\nNome de luz e amor"));
        arrayList15.add(new Clube(R.drawable.imperatriz_ma,"imperatriz_ma", "Imperatriz ", R.raw.imperatriz_ma, "Imperatriz, Teu nome é uma bandeira\nExaltai o vosso altivo pavilhão\nTu és o mais forte no esporte\nUm clube muitas vezes campeão\n\nEm tuas cores o esplendor\nNo campo a tua garra faz vibrar o torcedor\nE a galera num grito de guerra, buscando a vitória aplaude os heróis\nTua torcida num grito de guerra no campo aplaude os teus onze heróis\nCAVALO DE AÇO! CAVALO DE AÇO!\n\nEm teus passado, não há fracasso\nO teu presente orgulha a gente \nNo peito um escudo que inflama\nE busca fama com muito ardor \n\nBem alto eu aclamo com orgulho:\nSou Alvi-Rubro com muito amor"));
        arrayList15.add(new Clube(R.drawable.juventude_ma,"juventude_ma", "Juventude", R.raw.juventude_ma, "O Juventude é uma time brilhante\n" +
                "É o galo da princesa do sertão\n" +
                "De cores vermelho, preto e branco\n" +
                "Que está no coração da nação\n" +
                "\n" +
                "**O Juventude é Caxiense\n" +
                "O Juventude é paz e amor\n" +
                "O Juventude é um clube de glórias\n" +
                "Que o Maranhão consagrou**\n" +
                "\n" +
                "**Muitas vezes campeão caxiense\n" +
                "Muitos títulos já conquistou\n" +
                "Com peito cheio de amor\n" +
                "Cantar bem forte a nossa torcida**\n" +
                "\n" +
                "**O Juventude é Caxiense\n" +
                "O Juventude é paz e amor\n" +
                "O Juventude é um clube de glórias\n" +
                "Que o Maranhão consagrou**\n" +
                "\n" +
                "**Fundado em 14 de Junho de 1979\n" +
                "É o rubro negro caxiense\n" +
                "Que está sempre na frente com suas vitórias\n" +
                "O Juventude é o campeão dos campeões\n" +
                "O Juventude é o campeão dos campeões**"));
        arrayList15.add(new Clube(R.drawable.maranhao,"maranhao", "Maranhão", R.raw.maranhao, "Moto Club de tantas tradições\nMaranhão Atlético Clube\nO teu nome é virtude, é luta é grandeza é emoção\nMaranhão bandeira do norte\nDo nosso esporte és uma consagração\nMaranhão a tua história\nNa nossa memória sempre há de existir\nDemolidor de cartazes\nCom os seus onze azes\nÉ um astro a aluzir\n\nMaranhão Atlético Clube\nO teu nome é virtude, é luta é grandeza é emoção\nMaranhão bandeira do norte\nDo nosso esporte és uma consagração\n\nMaranhão a tua história\nNa nossa memória sempre há de existir\nDemolidor de cartazes\nCom os seus onze azes\nÉ um astro a aluzir\n\nPelas taças que já conquistaste\nNas contendas que ganhaste\nO seu nome cresceu\nÉs Maranhão esquadrão de quatro cores\nReunindo a luz e a glória de Deus"));
        arrayList15.add(new Clube(R.drawable.motoclibe,"motoclube", "Moto Clube", R.raw.motoclube, "Moto Club de tantas tradições\nColocado entre grandes vencedores\nSeu nome vive em nossos corações\nE nos lábios de muitos torcedores\n\nCampeão de feitos gloriosos\nDe heroísmo sem par e de coragem\nReceba agora mesmo neste instante\nA nossa mais esplendida homenagem\n\nOh! Moto surpreendente\nTime de fibra e garra\nQuando te lança à frente\nNenhuma defesa te barra\n\nNos gramados daqui ou de outros Estados\nHonra o Moto o valor da nossa gente\nGrande foi em todo seu passado\nAinda maior agora em seu presente\n\nNosso lema é vencer de ânimo forte\nCom justa fama de Papão do Norte\nMarchemos nesse instante para a glória\nNa conquista de mais uma vitória."));
        arrayList15.add(new Clube(R.drawable.sabia,"sabia", "Sábia", R.raw.sabia_ma, "Sou Sabiá\n" +
                "O time mais popular.\n" +
                "Sou campeão\n" +
                "Da Princesa do Sertão.\n" +
                "\n" +
                "Fundado em 2007\n" +
                "Por um grupo de amigos\n" +
                "Para ser campeão!\n" +
                "\n" +
                "Eis o tricolor mais forte;\n" +
                "Verde, branco e amarelo\n" +
                "Como é tão belo!\n" +
                "\n" +
                "Saiu da poesia\n" +
                "Das palmeiras;\n" +
                "Do poeta Gonçalves Dias\n" +
                "Pra vencer nos gramados\n" +
                "Com brilho e muita raça\n" +
                "Eu sou é Sabiá\n" +
                "\n" +
                "Sou Sabiá\n" +
                "O time mais popular.\n" +
                "Sou campeão\n" +
                "Da Princesa do Sertão\n" +
                "\n" +
                "Sabiá vai voar alto\n" +
                "E conquistar grandes vitoria\n" +
                "No maranhão.\n" +
                "\n" +
                "Vamos lá Sabiá\n" +
                "Conquistar o céu de anil\n" +
                "Do meu Brasil.\n" +
                "\n" +
                "Tua bandeira\n" +
                "É um manto sagrado\n" +
                "Que trêmula,\n" +
                "Quando pisa no gramado\n" +
                "Cada gol, cada jogada\n" +
                "Faz a galera gritar;\n" +
                "Eu sou é Sabiá."));
        arrayList15.add(new Clube(R.drawable.sao_jose_ribamar,"sao_jose_ribamar", "São José de Ribamar", R.raw.sao_jose_ribamar, "Salve São José de Ribamar, da mais nobre tradição \nSalve terra hospitaleira, que amamos com muita emoção\nTeu lindo céu estrelado com presença do cruzeiro\nEnche de esperança o nosso estado\nE o nosso Brasil inteiro.\nSalve São José de Ribamar, da mais nobre tradição\nSalve terra hospitaleira, que amamos com muita emoção\nTeu lindo céu estrelado com presença do cruzeiro\nEnche de esperança o nosso estado\nE o nosso Brasil inteiro.\nO ensino de nossas escolas sempre está presente\nDando assistência à classe discente\ne levando o município a um futuro melhor\nO Importante é primar cada vez mais por nossa cultura\nE o município ser beleza pura\nPro nosso progresso ser muito maior.\n"));
        arrayList15.add(new Clube(R.drawable.sampaio,"sampaio_correa", "Sampaio Correia", R.raw.sampaio_correa, "Sampaio Corrêa \nA Bolívia Querida, de maior torcida neste Maranhão \nSampaio Corrêa \nDo nosso esporte o mais antigo esquadrão \n \nSua camisa encarnada, verde e amarelo \nVeste gigante do esporte em constante duelo \nSampaio Corrêa, time de escol \nMaior torcida, tradição em futebol"));
        sectionedExpandableLayoutHelper.addSection("  MARANHENSES", arrayList15);

        ArrayList<Clube> arrayList16 = new ArrayList<>();
        arrayList16.add(new Clube(R.drawable.atletico_de_cajueiras,"atletico_de_cajueiras", "Atlético Cajazeirense", R.raw.atletico_cajazeirense,"Atlético o clube cazajeirense\n" +
                "Orgulha a gente o teu pendão\n" +
                "És e serás sempre assim\n" +
                "Fadado a glórias\n" +
                "Muitas hão de vir\n" +
                "\n" +
                "Teu branco nos lembra a paz\n" +
                "E o azul do céu a grandeza nos trás\n" +
                "Te amamos de coração\n" +
                "Trovão azul do sertão.\n" +
                "Trovão azul do sertão.\n" +
                "\n" +
                "1948, um ano iluminado\n" +
                "O Hegino Pires com a torcida uma festa\n" +
                "Um palco consagrado."));
        arrayList16.add(new Clube(R.drawable.botafogo_pb,"botafogo_pb", "Botafogo PB", R.raw.botafogo_pb, "Botafogo Paraibano\nVocê é o mais Belo e glorioso\nQue enche de alegria o seu povo\nCom tantas glórias e tantas vitórias!\n\nBranca, preta e vermelha\nDo tricolor do contorno são as cores\nQue vibram nas mãos dos torcedores\nEm forma de lindas bandeiras\n\nVamos ganhar o jogo sim!\nVamos dar um olé!\nEncher os olhos desse povo todo\nQue está lotando o Almeidão!\n\nO nosso Tricolor é sempre campeão\nPorque nosso timão tem muito mais vigor!!!"));
        arrayList16.add(new Clube(R.drawable.campinense,"campinense", "Campinense", R.raw.campinense, "Pelos campos do Brasil\nA raposa a correr\nVitórias glórias mil\nGarra e raça pra valer\n\nAs cores da Paraíba\nE a grande inspiração\nRubro-negro na camisa\nSangue,nervos e coração\nGrande campeão paraibano\nÉ o Campinense com razão\nTitulos,troféis ano após ano\nSalve a raposa bixo papão\n\nT.O.R.A vibrante extremecida\nE as charangas a tocar\nEntusiasmada toda torcida\nSeu clube a incentivar\nFutebol é bola no barbante\nAlegria das multidões\nVamos da as mãos raposa avante\nPra maratona dos campeões.\n"));
        arrayList16.add(new Clube(R.drawable.esporte_patos,"esporte_patos", "Esporte de Patos", R.raw.esporte_patos, "Esporte, Esporte, Esporte,\\nO Alvirrubro do meu coração. Bis\\nEsporte, Esporte, Esporte,\\nÉ o Patinho terror do sertão.\\n\\nQuando ele arranca\\nTodos sabem como é\\nÉ mais um gol\\nE a turma segue dando olé\\nDesde Inocêncio\\nMuita Glória, Muito Amor\\nEsse Patinho é mesmo o Terror.\\n"));
        arrayList16.add(new Clube(R.drawable.guarapira,"guarapira", "Guarabira", R.raw.guarapira, "Tubarão-SC\n-Oh, Tubarão\nTu és a glória\nTu és o maior\nNo esporte és tradição\nOh, Tubarão Clube do meu coração\nNos gramados do Sul\nTua fibra estará presente\nHonrando as cores tricolores\nOrgulho de nossa gente (BIS)\n\nÉ nosso imenso prazer\nTe ver sempre vencer\nE ser o campeão (BIS)\n\nTu és garra\nTu és raça\nTu és emoção\nTocando a bola com o coração\nLevantando a galera\nCom o grito de gol\nÉ GOL\nTremulando as bandeiras\nTubarão és feito de amor! (BIS)\n"));
        arrayList16.add(new Clube(R.drawable.nacional_patos,"nacional_patos", "Nacional de patos", R.raw.nacional_patos, "Olha o verde,\nDa Esperança no gramado. \nToda galera, Bis\nJá sabe o resultado.\nSempre, sempre, sempre no final,\nNa cabeça dá Nacional.\n\nVerdão de fibra,\nGanha no grito,\nGanha na raça,\nGanha bonito.\nE a cada gol,\nQue emoção !!\nSalve o canarinho do Sertão !!\nNacional, Nacional......"));
        arrayList16.add(new Clube(R.drawable.souza,"souza", "Sousa ", R.raw.souza, "Nós somos o Sousa Esporte Clube,\nNós somos o eterno campeão\nNós somos o Sousa Esporte Clube,\nSomos o Dinossauro do sertão\n\nHoje, a cidade sorriso\nÉ berço de harmonia e de alegria,\nE o toque de bola no gramado,\nDe futebol com\nClasse e categoria\n\nNo bico da chuteira leva o coração,\nBatendo forte nós somos campeões!\n\nNo peito e na raça,\nCom a bola no pé,\nJá tendo a certeza de um grande olé,\nNo peito e na raça,\nCom a bola no pé,\nJá tendo a certeza de olé\n\nO Sousa Esporte Clube expressam alegria,\nSeu futebol é raça,\nÉ arte e magia\nNossa camisa é sangue explode coração\nNosso grito de guerra é pura emoção!\n\nSou, sou Dinossauro eu sou,\nA gente vai ganhar\nE ninguém vai nos segurar,\nSousa! Sousa!\nSou, sou Dinossauro eu sou,\nA gente vai ganhar\nE ninguém vai nos segurar,\nSousa! Sousa!"));
        arrayList16.add(new Clube(R.drawable.treza,"treze", "Treze", R.raw.treze, "Somos campeões \nDa Paraíba somos o melhor \nSomos campeões \nTreze querido tu és o maior \n \nSua torcida é uma legião \nE a cada dia cresce sempre mais \nSomos campeões dos campeões \nDos campeonatos paraibanos e regionais \n \nTreze, Treze \nTu és a alegria do povo \nTreze, Treze \nTu és campeão de novo \n \nÉs alvinegro o Galo da Borborema \nDe tantas glórias e tradições \nTreze, Treze \nSou trezeano de coração"));
        sectionedExpandableLayoutHelper.addSection("  PARAIBANO", arrayList16);

        ArrayList<Clube> arrayList17 = new ArrayList<>();
        arrayList17.add(new Clube(R.drawable.america_se,"america_se", "América-SE", R.raw.america_se, "Passo à passo na vida esportiva o tricolor sempre vencerá,\ntrabalhando o corpo e a alma seremos fortes um clube de valor,\nna vitória lutar por lealdade será sempre o nosso ideal,\nhonraremos a nossa bandeira,\nsuas cores e suas tradições.\n\nAmérica eu sou, sou tricolor;\nAmérica eu sou, sou tricolor.\n\nCom garra e talento seremos campeões com a força da bandeira em nossos corações, somos ribeirinhos um povo lutador trazemos no peito o amor... ao tricolor.\n\nAmérica eu sou, sou tricolor;\nAmérica eu sou, sou tricolor."));
        arrayList17.add(new Clube(R.drawable.confianca,"confianca", "Confiança", R.raw.confianca, "Quem é o campeão dos campeões,\nque no gramado mantém sua glória,\né a Desportiva Confiança,\ndos operários tem o nome a vitória,\nsua bandeira com alvi-anil,\nsou Confiança em todo Brasil,\nTua luta continuará,\noutras taças,\nIremos conquistar,\nessa é a realidade,\nquem foi rei sempre é majestade."));
        arrayList17.add(new Clube(R.drawable.freipaulistano,"frei_paulistano", "Frei Paulistano", R.raw.frei_paulistano, "Oh! Eu não me engano\nMeu coração e frei paulistano (bis)\n\nEu ainda não tinha um time pra torcer\nMas agora eu tenho um time pra valer\nÔooooo doutor eu não me engano\nMeu coração é frei paulistano\n\nOh! Eu não me engano\nMeu coração e frei paulistano (bis)\n\nFrei Paulo casa nova que desbravou o Sertão\nE o Frei Paulistano muitas vezes campeão\nÔooooo doutor eu não me engano\nMeu coração é frei paulistano"));
        arrayList17.add(new Clube(R.drawable.itabaiana,"itabaiana", "Itabaiana", R.raw.itabaiana, "Descendo a serra, jogando uma bola\ncom alma e paixão\ntrês cores na faixa, alegria do povo\né o seu campeão\nem casa ou distante , o ator é o mesmo,no campo de ação\nna vitória ou derrota\na disputa com luta e o abraço do irmão\n\nDescendo a serra, jogando uma bola\ncom alma e paixão\ntrês cores na faixa, alegria do povo\né o seu campeão\nem casa ou distante , o ator é o mesmo,no campo de ação\nna vitória ou derrota\na disputa com luta e o abraço do irmão\nsomos Itabaiana\nCidade celeiro\nque vibra no esporte\ncom o seu Tremendão"));
        arrayList17.add(new Clube(R.drawable.lagarto,"largato", "Lagarto", R.raw.largato, "Lagarto Futebol Clube\nQue luta pra vencer\nOs seus adversários\nTem medo de perder\nLagarto Futebol Clube\nQue luta pra vencer\nOs seus adversários\nTem medo de perder\n\nJogando de pé para pé\nCom seu futebol no chão\nAguardando a oportunidade\nPara balançar os cordões"));
        arrayList17.add(new Clube(R.drawable.sergipe,"sergipe", "Sergipe", R.raw.sergipe, "Cinquenta Anos de Lutas,de Glórias\nO Pendão Alvi-Rubro a Vibrar\nO Sergipe no Esporte na História\nNas Pelejas da Terra e do Mar.\n\nCinquenta Anos na Nossa Cidade\nCom Amor Esportivo e Feliz\nConduzindo Todas as Mocidades\nNosso Orgulho Perante o Brasil.\n\nCom Pendão Alvi-Rubro Lenvamos\nEm Sergipe esse Povo é Altaneiro\nPara Frente as Bandeiras Agitamos\nSob a Luz desse Céu Brasileiro.\n\nNossas Taças Troféus Gloriosos\nSão a Soma do Nosso Valor\nNossos dias de Prélios Famosos\nO Sergipe é Tremir Vencedor.\n\nCinquenta Anos Sergipe o Teu Nome\nNesse Estado na Vida do Esporte\nTodo Tempo a Passar Não Consome\nBravo Clube dos Filhos do Norte.\n\nCom o Pendão Alvi-Rubro Vou Levando\nEm Sergipe esse Povo é Altaneiro\nPara Frente as Bandeiras Agitando\nSob a Luz Desse Céu Brasileiro."));
        sectionedExpandableLayoutHelper.addSection("  SERGIPANOS", arrayList17);

        ArrayList<Clube> arrayList18 = new ArrayList<>();
        arrayList18.add(new Clube(R.drawable.atletico_ac,"atletico_ac", "Atlético Acreano", R.raw.atletico_ac, "Glorioso clube Atlético Acreano\nAdorado sempre galo carijó\nSempre foste o orgulho da cidade\nNo gramado foste sempre o melhor\n\nDefender as tuas cores é o teu lema\nSer humilde é a sua tradição\nO Atlético tem um objetivo\nCompetir para sagrar-se campeão\nCompetir para sagrar-se campeão\n\nNo tapete verde tu lutas com fé\nA torcida aplaude pedindo \"olé\"\nBandeiras erguidas estão tremulando\nTu és o orgulho do povo acreano\n\nTuas lindas cores são brancos e azul anil\nPara mim tu és o melhor do Brasil\nSempre combatido jamais vencido\nTu és o meu orgulho, galinho querido"));
        arrayList18.add(new Clube(R.drawable.galvez,"galvez", "Galvez", R.raw.galvez, "Galvez é uma estrela vermelha\nQue reluz no firmamento do mundo do futebol\nMantém a eterna centelha\nDa coragem de um heroico aventureiro espanhol\n\nNão há tristeza ou talvez\nQuando entra em campo a paixão\nQue dá ao ataque e à defesa\nA certeza de ser campeão\n\nLutar pra ser brasileiro \nMostra que a firmeza faz possível o ideal\nNo Acre há um povo guerreiro\nQue mostra na luta a garra do Gavião Real\n\nNão há tristeza ou talvez\nQuando entra em campo a paixão\nQue dá ao ataque e à defesa\nA certeza de ser campeão\nTorcer, e mostrar a força da união \n\nO povo e a Polícia Militar\nHaja coração, vale a pena tanto amor\nEstá no Arena o Imperador\nTorcer, e mostrar a força da união\n\nO povo e a Polícia Militar\nHaja coração, vale a pena tanto amor\nEstá no Arena o Imperador\nTorcer, e mostrar a força da união"));
        arrayList18.add(new Clube(R.drawable.juventus_acre,"juventus_acre", "Juventus", R.raw.juventus_acre, "Juventus, Juventus\nCantar-te é o meu prazer\nJuventus, Juventus\nTe adorei até morrer\n\nO lema do Juventus é vencer\nA tendência do Juventus é crescer\nAtlético Clube Juventus\nGaranto mil vitórias\nAinda há de ter\n\nJuventus, Juventus\nCantar-te é o meu prazer\nJuventus, Juventus\nTe adorei até morrer\n\nO lema do Juventus é vencer\nA tendência do Juventus é crescer\nAtlético Clube Juventus\nGaranto mil vitórias\nAinda há de ter\n\nTua torcida é bem organizada\nTem um esquadrão águia à frente\nTua bandeira no alto há tremular\nQue envolve o coração da gente"));
        arrayList18.add(new Clube(R.drawable.nauas,"nauas", "Náuas", R.raw.nauas, "Entre as tranças da mata altaneira\n" +
                "Cai a luz se induz dos festões\n" +
                "Empolgante brasileira\n" +
                "Nossa equipe se diz dos nossos brasõe\n" +
                "É do Náuas a bela corte\n" +
                "E na rena se dispõe a lutar\n" +
                "Sempre altiva, sempre forte\n" +
                "Para o laurel conquistar\n" +
                "Sempre altiva, sempre forte\n" +
                "Para o laurel conquistar\n" +
                "Avante nobres lutadores\n" +
                "Sem temer, sem fugir\n" +
                "Defender as nossas cores\n" +
                "Nossa glória imortal no porvir\n" +
                "Avante nobres lutadores\n" +
                "Sem temer, sem fugir\n" +
                "Defender as nossas cores\n" +
                "Nossa glória imortal no porvir\n" +
                "Desfraldando o indio verde estandarte\n" +
                "O teu emblema de amor fraternal\n" +
                "Nós os filhos, filhos fortes\n" +
                "Temos o prazer triunfal\n" +
                "O inimigo temos o valor a vida\n" +
                "A conquista de um belo de um troféu\n" +
                "EM uma luta destemida\n" +
                "Longe de ti nos tristes ao léu\n" +
                "Avante nobres lutadores\n" +
                "Sem temer, sem fugir\n" +
                "Defender as nossas cores\n" +
                "Nossa glória imortal no porvir\n" +
                "Avante nobres lutadores\n" +
                "Sem temer, sem fugir\n" +
                "Defender as nossas cores\n" +
                "Nossa glória imortal no porvir\n" +
                "Defender as nossas cores\n" +
                "Nossa glória imortal no porvir"));
        arrayList18.add(new Clube(R.drawable.placido,"placido", "Plácido de Castro", R.raw.placido, "Com a força de um tigre luta\nE vibra sem parar, seu plantel é uma fortaleza\nQque ninguém pode ultrapassar.\n\nSua história entre os grandes foi escrita e ninguém pode apagar.\nQuando plácido entra numa briga, entra sempre pra ganhar...\nPlácido de Castro amado clube do Abunã\nA sua torcida que grita e vibra pra sempre vai cantar...\nPlácido de Castro amado Tigre do Abunã\nA tua torcida que canta e vibra pra sempre vai te amar...\n\nTuas cores nos alegra e nos leva aonde for,\nA paixão que tinha em nosso peito se transforma em amor.\nCada jogo uma história que dá gosto de contar, quando\nPlácido entra numa briga, entra sempre pra ganhar..."));
        arrayList18.add(new Clube(R.drawable.rio_branco_ac,"rio_branco_ac", "Rio Branco - AC", R.raw.rio_branco_ac, "O Rio Branco é o primeiro\nClube forte e varonil\nO seu time é altaneiro\nNesses longes do Brasil\n\nJá tão cheio de vitórias\nO Alvi-rubro pavilhão\nRio Branco entre glórias\nSerás sempre o campeão"));
        sectionedExpandableLayoutHelper.addSection("  ACREANOS", arrayList18);

        ArrayList<Clube> arrayList19 = new ArrayList<>();
        arrayList19.add(new Clube(R.drawable.comercial_pi,"comercial_pi", "Comercial PI", R.raw.comercial_pi, "Comercial é time belo\nSabe vencer seus inimigos\nSabe controlar bem a pelota\nE quando perde, ai meu Deus ai que castigo\nSão onze companheiros, que sabem se compreender\nPassinho aqui, HEI\nPassinho ali, HEI\nA goleada sempre da pena de ver\nPor isso eu grito com emoção, azul e branco do meu coração\nE digo ainda como você não tem igual\nVamos minha gente viva o Comercial.\n"));
        arrayList19.add(new Clube(R.drawable.flamengo_pi,"flamengo_pi", "Flamengo PI", R.raw.flamengo_pi, "Flamengo a tua glória é lutar\nFlamengo é o campeão dos campeões\nFlamengo é o mais querido da cidade\nFlamengo vive em nossos corações\nEu sou Flamengo\nSou rubronegro com amor\nEu sou sou Flamengo\nEm qualquer lugar eu sou\nQuem é Flamengo\nPode dizer\nVencer, vencer, vencer\nJuro por Deus que sou Flamengo até morrer\nSalve 8 de dezembro de 37\nFoi nessa data que o Flamengo nasceu\nSalve a fiel, salve o povão\nSalve o mais querido de nosso torrão\n\nFlamengo tem mania de ganhar\nFlamengo é raça, arte e emoção\nVermelho e preto são as cores mais queridas\nMengo eu sou teu e tu és meu por toda a vida"));
        arrayList19.add(new Clube(R.drawable.parnaiba,"parnagyba", "Parnahyba", R.raw.parnagyba, "Ó Parnaíba,\nTeu nome exprime\nEm nosso peito\nArdor sublime\nQue nos inspira a repetir a doce escala\nDa voz do rio que te envolve que te embala\n\nTeus filhos bravos\nNo embate rudo\nFazem do peito\nUm bronzeo escudo\n\nESTRIBILHO - E quem da luta\nTodo ardor não liba\nAo som do brado:\nSalve ó Parnaíba\n\nPossues o brilho\nDa paz bendita\nQue sobre nós\nFulge e palpita\n\nAo sopro forte do Nordeste a vida canta\nNessa oficina de labor que nos encanta\n\nDo nosso esforço\nVem a surgir\nA glória excelsa\nEm teu porvir\n\nESTRIBILHO\n\nA doce sombra\nDa paz suprema\nProgredir sempre\nÉ o nosso lema\n\nOnde a bravura destemida enfim assome,\nNos lembra o rio que te deu tão grande nome\n\nTeus filhos bravos\nNo embate rudo\nFazem do peito\nUm bronzeo escudo\n\nESTRIBILHO - E quem da luta\nTodo ardor não liba\nAo som do brado:\nSalve ó Parnaíba\n\nPossues o brilho\nDa paz bendita\nQue sobre nós\nFulge e palpita"));
        arrayList19.add(new Clube(R.drawable.river,"river", "River PI", R.raw.river, "Avante, Riverinos!\nCom a bandeira de glória nas mãos\nLutemos com ardor\nPela vitória do tricolor\nLevemos a nossa sede\nQue é orgulho do nosso torrão\nA taça conquistada\nCom heroísmo e com paixão.\nA nossa meta certa a seguir\nÉ defender o Piauí\nCom o nome do tricolor\nEm qualquer lugar\nGritando gol!\nE ainda proporcionarmos\nUm meio social\nSem igual."));
        sectionedExpandableLayoutHelper.addSection("  PIAUIENSE", arrayList19);

        ArrayList<Clube> arrayList20 = new ArrayList<>();
        arrayList20.add(new Clube(R.drawable.aruc,"aruc", "ARUC", R.raw.aruc, "Eu sou um rio\n" +
                "Transbordando de amor\n" +
                "Eu sou ARUC,\n" +
                "sou um vencedor\n" +
                "\n" +
                "Voa gavião,\n" +
                "Leva na garra o pandeiro\n" +
                "Mostra pra esse povo\n" +
                "Que o teu samba é verdadeiro\n" +
                "\n" +
                "Teu azul e branco\n" +
                "Veio lá de Madureira\n" +
                "Enxuga teu pranto,\n" +
                "Que eu não vim pra brincadeira\n" +
                "\n" +
                "Fui abençoada\n" +
                "Pelo braço de Natal\n" +
                "Sou glorificada campeã\n" +
                "Do futebol e do carnaval\n" +
                "\n" +
                "Tenho alma de guerreiro\n" +
                "No gramado, um lutador\n" +
                "Vou soltar o meu grito, é gol\n" +
                "Por isso é que Cruzeiro eu sou."));
        arrayList20.add(new Clube(R.drawable.brasilia,"brasilia", "Brasília", R.raw.brasilia, "Avante, Brasília, avante!\nTodos gritam por você\nComo um sol irradiante\nEi de tê-lo até morrer\n\nSua garra exuberante\nE o magnífico esplendor\nMe deixa muito contente\nColorado, meu grande amor\n\nBrasília, Brasília\nVocê é o maior em tradição\nBrasília, Brasília\nSempre será o eterno campeão\nBrasília, Brasília\nEu sempre lhe amei\nBrasília, Brasília\nColorado sempre serei."));
        arrayList20.add(new Clube(R.drawable.brasiliense,"brasiliense", "Brasiliense", R.raw.brasiliense, "Com muita garra e toda a nossa vibração\nSalve o Brasiliense, futebol clube, meu irmão\nNo campo, uma pintura, uma aquarela\nE na torcida explode essa febre amarela\n\nBis\nAs cores do meu coração\nVerde, amarelo e branco\nO meu time é campeão\n\nRefrão\nÉ na palma da mão\nÉ com a bola no pé\nÉ na palma da mão\nÉ com a bola no pé\nVacilou caiu na boca, na boca do Jacaré"));
        arrayList20.add(new Clube(R.drawable.ceilandia,"ceilandia", "Ceilândia", R.raw.ceilandia, "Ceilândia agora está em festa\nCom a maior animação\nComemorando mais uma vitória\nDesta vez será campeão\n\nMais um, Ceilândia, mais um...\nMais um gol pra firmar tua liderança\nVais demonstrando tua garra\nAumentando nossa fé e confiança\n\nMais um, Ceilândia, mais um...\nExplode tua torcida de emoção\nVais conquistando mais um título\nEstá na hora da tua decisão"));
        arrayList20.add(new Clube(R.drawable.gama,"gama", "Gama", R.raw.gama, "Gama sempre Gama \nEu sou gamense até morrer \nAguerrido esquadrão de ouro \nTesouro que eu não posso esquecer \nOutras vitórias e glórias virão \nDessa pujança que és tu \nTua torcida não se intimida \nPorque o lema é vencer \nCom lealdade, com galhardia \nGigante do esporte \nO mais forte há de ser"));
        arrayList20.add(new Clube(R.drawable.paranoa,"paranoa", "Paranoá", R.raw.paranoa_df, "Paranoá terra linda\n" +
                "O próprio pudor\n" +
                "Terra linda que fala de amor\n" +
                "Os heróis que aqui despontaram\n" +
                "Dessa terra plantaram o calor\n" +
                "\n" +
                "Vieram, sofreram, viveram\n" +
                "A dor escassez das duras\n" +
                "Bem firmes valentes guerreiros\n" +
                "Lutaram felizes venceram\n" +
                "\n" +
                "E hoje no esporte despontam\n" +
                "Na vitória sempre alcançar\n" +
                "Ao grito do som esplêndido\n" +
                "É gol, é gol\n" +
                "Ao grito do gol avançar\n" +
                "É gol, é gol\n" +
                "Ao grito do gol avançar\n" +
                "\n" +
                "E hoje no esporte despontam\n" +
                "Na vitória sempre alcançar\n" +
                "Ao grito do som esplêndido\n" +
                "É gol,é gol\n" +
                "Ao grito do gol avançar\n" +
                "É gol,é gol\n" +
                "Ao grito do gol avançar"));
        arrayList20.add(new Clube(R.drawable.planatilna,"planatilna", "Planaltina", R.raw.planatilna, "Planaltina\nÉs cum clube tão querido,\nÉs também orgulho do povão\nTe queremos com muita alegria,\nTu nos dás confiança e emoção\n\nDentre todos,\nFoste sempre o preferido,\nDa maior torcida do planalto,\nTendo garra bastante pra vencer\nPlanaltina,\nÉs um clube consagrado\n\nÉs o orgulho que sempre desejei\nE aceito como tu és\nDesta torcida que muito o ama,\nE cresce de mãos dadas,\nUnida pela fé."));
        arrayList20.add(new Clube(R.drawable.sobradinho,"sobradinho", "Sobradinho", R.raw.sobradinho, "És o bravo leão da cidade\nSem temer os mais sérios rumores\nPra vencer os mais duros rivais\nDefendendo tuas honradas cores\n\nComo herói, foste sempre destemido\nEnfrentando qualquer time no gramado\nMais que tudo, foste sempre o mais querido\nÉs o grande leão consagrado\n\nVencer! Vencer!\nNossa lema é: Vencer!\nSobradinho, meu clube querido,\nHei de amá-lo, amá-lo até morrer\n\nVencer! Vencer!\nNossa lema é: Vencer!\nSobradinho, meu clube querido,\nHei de amá-lo, amá-lo até morrer"));
        sectionedExpandableLayoutHelper.addSection("  BRASILIENSES", arrayList20);

        ArrayList<Clube> arrayList21 = new ArrayList<>();
        arrayList21.add(new Clube(R.drawable.america_am,"america_am", "América-AM", R.raw.america_am, "Força da raça e da vitória \nAmérica do meu coração \nNo Amazonas não tem igual \nVermelho e branco tradicional \nTu vens da luta de uma raça \nVermelho e branco o teu valor \nEm tuas hostes exercitas \nA juventude, a esperança e o labor \nNo futebol és a conquista \nDa força rubra destemida indolor! \nTetracampeão! \n\nAmérica do meu coração!\n\nTua torcida nunca ti esquece \nA tua luta é inconteste \nEm 2 de agosto de 39 \nNasceu a fama que nos comove \n(BIS) da chama ardente americana \nSe fez a luz rubra da vitória \nAmérica! América! América! meu coração! \nAmérica! América! América! minha paixão!\n"));
        arrayList21.add(new Clube(R.drawable.clipper,"clipper", "Clíper", R.raw.clipper, "-Surge o velo de ouro à brilhar\nCom a águia dourada a voar\nSobre a estrada do vulto futebol\nCentenário de valor\nCombinado à paixão\nClíper Clube\nTu és a esperança\nambém és juventude\nClube do coração\nDefesa que se agiganta\nQuando o inimigo se levanta\nMeio-campo estrategista\nE o ataque que conquista\nNos cordéis adversários\nSua marca a deixar\nMostra meu time querido (bis)\nTua devoção para ganhar (bis)\n\nE fazer uma nova era\nA explosão dessa galera\nA alegria a extasiar\nPreto e amarelo\nSão as cores dessa garra\nDessa águia que congraça\nA magia nesse dia\nVoa sobre os campos do Amazonas (refrão)\nClíper clube para a vitória alcançar\n"));
        arrayList21.add(new Clube(R.drawable.fast,"fast", "Fast Clube", R.raw.fast, "Sua glória é lutar\n\nSeduz a gente popular\nE hoje é dia\nDe alegria\nAcabou a nostalgia\n\nFAST CLUBE tu és a esperança\nO povo deposita confiança\nQuando entras pra lutar (ha ha ha ha ha ho ho ho ho ho)\nFAST CLUBE a tua estrela é explendor\nPara o inimigo é um \"Rolo Compressor\n\nPara a torcida sempre grande vencedor ( ho ho ho ho ho ha ha ha ha ha)"));
        arrayList21.add(new Clube(R.drawable.libermorro,"libermorro", "Libermorro ", R.raw.libermorro, "O verde é a cor da esperança\nNo gramado a sua força é total\nLibermorro se agiganta\nNo futebol dessa Manaus\n\nRemonta teu passado glorioso\nSob a luz divina triunfal\nCenário verde, fruto de um tesouro!\nNa \"Liberdade\" surge o clube sem igual\n\nDa fundação ao presente supremo\nSerás lembrado como garra e emoção\nLibermorro, Libermorro eu vou cantar (bis)\nTigre do Morro\n para sempre vou ti amar (bis)\n\nTua torcida - sempre temida\nErgue bem alto o nosso pavilhão\nNossa Manaus - Terra querida\nDe verde e branco saúda o campeão\\n"));
        arrayList21.add(new Clube(R.drawable.manaus_am,"manaus", "Manaus ", R.raw.manaus, "Manaus, Manaus, Manaus\nTeu Gavião Real chegou\nEm Verde, Preto e Branco\nEstas são as cores do clube vencedor\nO Teatro Amazonas rebrilha com a luz da chama do esplendor\nNa grande floresta E igarapés ecoa o brado dos grandes Barés\nCinco de maio de 2013/ No futebol surge o campeão\nVibra a torcida, sempre aguerrida\nO pulso forte dessa nação\nE entre lutas e desafios\nManaus é raça, Verde coração\nAh! Quantas vitórias que virão/ Sei, sou feliz, tenho razão\nVoa, voa Gavião do Norte/ Tu és Guerreiro, tu és forte\nEu sou Manaus, sempre vou vencer!\nEu sou Manaus, sempre vou vencer!\nEu sou Manaus,. Sempre vou vencer!"));
        arrayList21.add(new Clube(R.drawable.nacional,"nacional", "Nacional", R.raw.nacional, "Nacional, Nacional, Nacional \nMeu glorioso pavilhão \nNos encoraja para a luta com amor e união, \nMais querido e sempre amado \nPela sua tradição de campeão, \nSempre consagrado no gramado \nÔ clube amado Nacional do meu coração. \n \nVamos a luta, \nlutar para vencer \nSe for preciso lutar até morrer \nLutar com disciplina e destemor \nMostra pra todo o mundo o teu valor, \nTua torcida estará sempre ao teu lado, \nSempre fiél meu clube adorado, \nTua estrela azul \nÉ meu símbolo de glória, \nAvante Nacional para a vitória \n"));
        arrayList21.add(new Clube(R.drawable.princesa,"princesa", "Princesa dos Solimões", R.raw.princesa, "Nacional, Nacional, Nacional \nDestas cores que traduzem emoções\nDa luta serenada à vitória\nVermelho e Branco unindo os corações\nE hoje vou cantar bem forte\nTubarão do Norte\nMergulha prá vencer\nNa tua história o teu passado nos revela\n\nQue és um clube em que impera a união\nÉ o maior prazer vê-lo jogar\nDe Manacapuru para o Amazonas orgulhar\n\nbis\nvencer é ser feliz\nSou realeza do meu Brasil\nTubarão do Norte que fascina\nPrincesa! Princesa! o campeão!"));
        arrayList21.add(new Clube(R.drawable.saoraimundo,"saoraimundo", "São Raimundo", R.raw.saoraimundo, "Pantera! Pantera! Goool!\nMeu São Raimundo,\nGlorioso alvinegro,\nJoga bola pra valer\nSou São Raimundo até morrer. (2x)\n\nMuitas glórias no passado e no presente\nNo esporte é o maioral\nMeu Pantera Negra\nSó tu é o nosso ideal\nSão Raimundo é time forte e de raça\nNos gramados, vence tudo e ergue a taça.\n\nA torcida agora grita de emoção:\n\"São Raimundo, meu pantera, é campeão!\n.\n\nPantera! Pantera! Goool"));
        arrayList21.add(new Clube(R.drawable.sul_america,"sul_america", "Sul-América", R.raw.sul_america, "É o trem da Colina que chegou\nSua raça e toda a massa alegria e mais fervor\nÉ o Trem da Colina que ultrapassa\nA conquista de uma taça\nPara mostrar o seu valor\n\nSou SULAMÉRICA eu sou!\nE da Glória desenho o meu caminho\nNo estádio não estou sozinho\nBusco a vitória com emoção\nDesde 1932 que mantenho a tradição\nSou SULAMÉRICA eu sou!\nE a Glória é meu berço de amor\nNo futebol sou o primeiro\nMais um guerreiro de prontidão\nEu tenho a força de uma raça\nSou 1000 em 1 sou campeão\n"));
        sectionedExpandableLayoutHelper.addSection("   AMAZONENSES", arrayList21);
        sectionedExpandableLayoutHelper.notifyDataSetChanged();

        ArrayList<Clube> arrayList22 = new ArrayList<>();
        arrayList22.add(new Clube(R.drawable.atletico_es,"atletico_es", "Atlético Itapemirim", R.raw.atletico_es, "Salve o galo da Vila\nClube Atlético Itapemirim\nMinha maior alegria é vê-lo brilhar\nE o José Olivio inteiro gritar\n“Pra cima dele galo”\nNós entramos no gramado\nÉ pra brilhar, é pra ganhar, é pra vencer\nMas se a sorte for ingrata\nA derrota nós sabemos receber\nÉ o Atlético, É o Atlético\nÉ o time de tradição\nAs suas cores são preto e branco\nEstão gravadas em nosso corações\nNós entramos no gramado\nÉ pra brilhar, é pra ganhar, é pra vencer\nMas se a sorte for ingrata\nA derrota nós sabemos receber\nÉ o Atlético, É o Atlético\nÉ o time de tradição\nAs suas cores são preto e branco\nEstão gravadas em nosso corações\nDo Itapemirim és um eterno campeão\nDe nosso povo és eterna paixão\nAtlético, Atlético, Atlético\nNosso eterno campeão\nNós entramos no gramado\nÉ pra brilhar, é pra ganhar, é pra vencer\nMas se a sorte for ingrata\nA derrota nós sabemos receber\nÉ o Atlético, É o Atlético\nÉ o time de tradição\nAs suas cores são preto e branco\nEstão gravadas em nosso corações\nAs suas cores são preto e branco\nEstão gravadas em nosso corações"));
        arrayList22.add(new Clube(R.drawable.deportiva_ferroviaria,"deportiva_ferroviaria", "Desportiva Ferroviária", R.raw.deportiva_ferroviaria, "Pra frente Desportiva\nPra frente é o seu destino\nQuem fica não conquista\nGrandes marcas em sua vida.\nO seu passado já mostrava suas glórias\nDe triunfos que ornamentam sua história.\n\nVencer, vencer, vencer!\nÉ o grito da torcida que desperta.\nO suor grená de suas lutas\nParece sangue que corre em nossas veias.\nÉ o clube que sabe fazer amigos\nDesportiva, Desportiva!"));
        arrayList22.add(new Clube(R.drawable.estrela_do_norte,"estrela_norte", "Estrela do Norte", R.raw.estrela_norte, "o estrela\nestrela\nestrela\nestrela \ne o clube do meu coracao\nquando ha jogo pega fogo na torcida do meu campeao\nalvinegro preferido\nde vitoria em vitoria se fez\npega a bola,chuta a bola, e quem da bola\nvence 1, vence 2 ,vence 3\nbrilha tambem os refletores\nbranco e preto sao as suas cores \nele e tradicao do esporte\ncomo e forte \ncomo e forte\no meu estrela do norte"));
        arrayList22.add(new Clube(R.drawable.riobranco_es,"rio_branco_es", "Rio Branco", R.raw.rio_branco_es, "Meu Rio Branco, meu sonho, meu clube\nSempre que o vejo, sou todo emoção\nMeu Rio Branco, sua raça, suas taças\nFicaram marcadas no meu coração.\n\nPara onde for, lá também estarei\nDe corpo e alma sempre torcerei\nMeu Rio Branco, lancei-me em seus braços\nVocê é culpado do amor que lhe dei.\n\nNão posso evitar o pranto\nAo vê-lo brilhar em campo\nSuas cores, sua bandeira\nTraduzem luta e certeza\nDe que você é o maior\nE pra mim não existe melhor.\n\nMeu Rio Branco, seus anos são glórias\nSão toda a prova do meu bem querer\nMeu Rio Branco, toda a sua história\nTrago na memória com todo prazer.\n\nSe é na vitória ou mesmo na derrota\nVê-lo na luta é nunca vê-lo ao chão\nMeu Rio Branco, de mim dependendo\nPra seguir em frente nunca direi não.\n\nNão posso evitar o pranto\nAo vê-lo brilhar em campo\nSuas cores, sua bandeira\nTraduzem luta e certeza\nDe que você é o maior\nE pra mim não existe melhor."));
        arrayList22.add(new Clube(R.drawable.serra_es,"serra_es", "Serra", R.raw.serra_es, "Eu sou tricolor, sou alto astral\nEu sou Cobra Coral\nSou, sou, tricolor, eu sou\nE é com muito amor\nQue eu viro criança\n\nSerra da boa esperança\nTua camisa me abraça\nÉ o pano que veste a raça\nDesse time campeão\n\nEu sou do Serra\nEu vou subir a montanha\nSó pra fincar sua bandeira\nSó pra gritar o seu nome\nSerra, Serra\n\nNa brincadeira da vida eu ganhei\nMarraio ferider sou rei\nNa arquibancada da vida sou eu\nSou eu, sou eu, sou eu\nCobra-Coral sou eu.\nSou eu, sou eu, sou eu\nCobra-Coral sou eu."));
        arrayList22.add(new Clube(R.drawable.vitoria_es,"vitoria_es", "Vitória-ES", R.raw.vitoria_es, "Vamos juntos, Vitória, juntos vamos jogar\nVisto a sua camisa por me orgulhar\nO meu sangue é azul, carrego a paz no meu peito\nMeu Deus, me dê o direito de sempre com você ficar.\n\nVitória, Vitória, Vitória, clube de minha devoção\nÁguia azul sobrevoa, meu sonho, minha emoção\nVitória, Vitória, Vitória, campeão, sempre, sempre campeão\nSuas cores, no céu elas moram, e você vive no meu coração (bis).\n\nMil novecentos e doze, um ano de esplendor\nNasceu com força e garra a Águia bicolor\nErguendo esta bandeira me sinto mais feliz\nTorcer por esse time foi o que eu sempre quis.\n\nAvante, alvianil, pra mim você é o maior do Brasil\nAvante, alvianil, pra mim você é o maior do Brasil."));
        sectionedExpandableLayoutHelper.addSection("   CAPIXABA", arrayList22);

        ArrayList<Clube> arrayList23 = new ArrayList<>();
        arrayList23.add(new Clube(R.drawable.aguia_negra,"aguia_negra", "Águia Negra", R.raw.aguia_negra, "O Águia vai jogar\n" +
                "E a gente vai vibrar\n" +
                "Toda a cidade veio pra ver\n" +
                "Vamos arrepiar\n" +
                "O Águia Negra veio pra vencer\n" +
                "Você me faz feliz\n" +
                "Me deixa tão afim\n" +
                "Meu rubro-negro me levam alem\n" +
                "Basta você jogar\n" +
                "E o bicho vai pegar tão bem\n" +
                "Não quero desgrudar de você\n" +
                "Paixão de muito tempo\n" +
                "É grito na garganta (é gol)\n" +
                "Já sei que não tem jeito, tá feito\n" +
                "O Águia Negra arrasou\n" +
                "Abalou, abalou\n" +
                "Sacudiu, balançou\n" +
                "Águia Negra é amor de verdade\n" +
                "Abalou, abalou\n" +
                "Vibração é paixão da cidade\n" +
                "Abalou, abalou\n" +
                "Sacudiu, balançou\n" +
                "Águia Negra é amor de verdade\n" +
                "Abalou, abalou\n" +
                "\n" +
                "Vibraçã é paixão da cidade"));
        arrayList23.add(new Clube(R.drawable.cene,"cene", "Cene", R.raw.cene, "Nós somos do CENE avante\nCom muito amor e paixão\nNa luta buscando conquistas\nDemonstramos nossa união\n\nVencer, CENE vencer CENE\nVencer é a nossa missão\nVencer, CENE vencer CENE\nCom garra e determinação\n\nNascemos em um lindo bosque\nDe natureza sem igual\nDos rios de águas cristalinas\nLigando-nos ao Pantanal\n\nNós temos em nossas planícies\nFlora e fauna que nunca se viu\nNa beleza de nossas campinas\nLugar mais belo do Brasil \n\nVencer, CENE vencer CENE\nVencer é a nossa missão\nVencer, CENE vencer CENE\nCom garra e determinação\n\nNossa cidade tem história\nDos valores do bom futebol\nQue abriram o caminho da glória\nNos dando um lugar ao sol\n\nNossa força vem do princípio\nDa justiça e perseverança\nHarmonia de corpo e de mente\nO esporte da nova esperança\n\nVencer, CENE vencer CENE\nVencer é a nossa missão\nVencer CENE vencer CENE\nCom garra e determinação\n\nSe o comercial entra em campo\nEle precisa de você\nA torcida é a alma do time\nCom boa torcida é mais fácil vencer\n\nSalve o Comercial!\nSalve o nosso torcedor!\nSalve o brado da torcida que empresta ao time seu grande valor!"));
        arrayList23.add(new Clube(R.drawable.comercial_ms,"comercial_ms", "Comercial - MS", R.raw.comercial_ms, "Comercial\né o maior\n\nA torcida já consagrou\nNossa torcida é a melhor\nSalve o nosso torcedor!\n\nSe o comercial entra em campo\nEle precisa de você\nA torcida é a alma do time\nCom boa torcida é mais fácil vencer\n\nSalve o Comercial!\nSalve o nosso torcedor!\nSalve o brado da torcida que empresta ao time seu grande valor!\n\nComercial\né o maior\n\nA torcida já consagrou\nNossa torcida é a melhor\nSalve o nosso torcedor!\n\nSe o comercial entra em campo\nEle precisa de você\nA torcida é a alma do time\nCom boa torcida é mais fácil vencer\n\nSalve o Comercial!\nSalve o nosso torcedor!\nSalve o brado da torcida que empresta ao time seu grande valor!"));
        arrayList23.add(new Clube(R.drawable.corumbaense,"corumbaense", "Corumbaense", R.raw.corumbaense, "Corumbaense avante\nTu és fibra tu és raça\nAvante carijó avante\nEm busca de mais uma taça\n\nO teu passado de glórias\nRestou a história, galo panteiro\nVitórias quantas são tantas\nCorumbaense esquadrão guerreiro\n\nTua torcida galo\nCarijó da avenida\nSe levanta e canta\nAté o final da partida\n\nVai galo\nMarca por zona\nOu vai de marcação cerrada\nChega junto na bola\nPra dominar a jogadaVai galo\nMarca por zona\nOu vai de marcação cerrada\nChega junto na bola\nPra dominar a jogada"));
        arrayList23.add(new Clube(R.drawable.novoperario,"novooperario", "Novoperário", R.raw.novooperario, "Mato Grosso do Sul está em festa,\no time do povo novamente é o campeão.\nNovoperario, tu já nasceste grande.\nGalo guerreiro e vencedor.\nE nos gramados, não tem pra ninguém.\nNos adversários causa temor.\nSua torcida vibrante e feliz.\nTranspõe pro campo garra e amor.\nCom as bandeiras tremulando de emoção,\nvamos gritar novamente: É CAMPEÃO!\nO ouro negro é a cor desta nação,\nE o preto e branco no coração.\nO ouro negro é a cor desta nação,\nE o preto e branco no coração.\nNovoperario, tu já nasceste grande.\nGalo guerreiro e vencedor.\nNovoperario, tu já nasceste grande.\nGalo guerreiro e vencedor."));
        arrayList23.add(new Clube(R.drawable.operario_ms,"operario_ms", "Operário - MS", R.raw.operario_ms, "Garra, amor e tradição\nDestinado a ser campeão\nDe Mato Grosso o mais querido\nE em campo é o mais temido\n\nGarra, amor e tradição\nDestinado a ser campeão\nDe Mato Grosso o mais querido\nE em campo é o mais temido\n\nO Operário é dono da torcida\nDe Campo Grande a mais unida\nÉ Galo em qualquer terreiro\nE valente como o povo brasileiro\n\nO, o , o , pe, e, e, ra, ri, ô ,ô, ô\nO, o , o , pe, e, e, ra, ri, ô ,ô, ô\n\nGarra, amor e tradição\nPreto e branco está no coração\nPra aqueles que sabem torcer\nE o Operário só pensa em vencer"));
        arrayList23.add(new Clube(R.drawable.saad,"saad", "SAAD", R.raw.saad_ms, "São Caetano voltou a sorrir,\n" +
                "Pois agora podemos torcer\n" +
                "Surge um novo Campeão\n" +
                "Saad do meu Coração\n" +
                "\n" +
                "A Campanha tão linda que fêz\n" +
                "Com a ajuda da nossa cidade\n" +
                "O azul mostra a sua coragem\n" +
                "E o branco toda a amizade\n" +
                "\n" +
                "Saad, Saad, Saad\n" +
                "Vamos pra frente vencer\n" +
                "Bandeira Branca e Azul,\n" +
                "De São Caetano do Sul\n" +
                "\n" +
                "Saad, Saad, Saad\n" +
                "\n" +
                "Vamos pra frente vencer\n" +
                "Bandeira Branca e Azul,\n" +
                "De São Caetano do Sul"));
        arrayList23.add(new Clube(R.drawable.serc,"serc", "SERC", R.raw.serc_ms, "SERC, o nosso grande campeão.\n" +
                "A sua raça é tradição\n" +
                "É bicho solto no bolsão\n" +
                "SERC, a sua historia é de glória.\n" +
                "E a trajetória é de vitória\n" +
                "Em Mato Grosso do Sul\n" +
                "\n" +
                "SERC, é raça pura em decisão.\n" +
                "A sua saga é de vencer\n" +
                "E a torcida é toda vibração\n" +
                "Salve, salve o nosso tricolor.\n" +
                "Azul, vermelho e o branco com amor.\n" +
                "Salve, salve o nosso tricolor.\n" +
                "Azul, vermelho e o branco com amor\n" +
                "\n" +
                "O branco é a paz da imensidão\n" +
                "E o vermelho é nosso sangue, coração.\n" +
                "E o azul é nosso céu azul,\n" +
                "Para a beleza de Chapadão do Sul.\n" +
                "Para a beleza de Chapadão do Sul\n" +
                "\n" +
                "SERC é Sociedade Esportiva Recreativa de Chapadão\n" +
                "Contagiante a galera se emotiva\n" +
                "SERC é força confiança e emoção\n" +
                "SERC é força confiança e emoção\n" +
                "\n"));
        arrayList23.add(new Clube(R.drawable.sete_de_setembro,"sete_setembro", "Sete de Setembro", R.raw.sete_setembro, "O 7 de Setembro de Dourados,\né o orgulho do povo douradense.\nClube empresa, nasceu líder,\nnasceu grande, vencedor, polivalente.\nO 7 de Setembro de Dourados,\n\nvermelho, azul e branco é sua cor\nTime joga inteligente,\njoga pra frente e com muito amor\n7, 7, 7 de Setembro, 7, 7, 7 de Setembro,\nVista a camisa e pegue esta bandeira!!!"));
        sectionedExpandableLayoutHelper.addSection("   SUL-MATO GROSSENSE", arrayList23);

        ArrayList<Clube> arrayList24 = new ArrayList<>();
        arrayList24.add(new Clube(R.drawable.gurupi,"gurupi", "Gurupi", R.raw.gurupi, "Somos Gurupi Esporte Clube\nNossa base é forte e não à quem a derrube\nVencemos através de uma união\nJogando com os pés, cabeça e coração\nTemos o apoio da torcida\nQue nos incentiva durante toda a partida\nCom garra e com força, estamos ai\nA vitória é nossa, vai Gurupi\n\nBola na rede, troféu na mão\nMatando a sede, de ser campeão\nVencendo barreiras, quebrando tabus\nGurupi, camaleão do sul\n\nSomos Gurupi Esporte Clube\nNossa base é forte e não à quem a derrube\nVencemos através de uma união\nJogando com os pés, cabeça e coração\n\nTemos o apoio da torcida\nQue nos incentiva durante toda a partida\nCom garra e com força, estamos ai\nA vitória é nossa, vai Gurupi\n\nBola na rede, troféu na mão\nMatando a sede, de ser campeão\nVencendo barreiras, quebrando tabus\nGurupi, camaleão do sul\n\nBola na rede, troféu na mão\nMatando a sede, de ser campeão\nVencendo barreiras, quebrando tabus\nGurupi, camaleão do sul"));
        arrayList24.add(new Clube(R.drawable.interporto,"interponto", "Interporto", R.raw.interponto, "Salve, salve Interporto\nGlórias fostes consagrado\nMeu orgulho é a camisa\nMeu coração de torcedor\nSalve, salve Interporto\nSalve, salve o Parrião\nSão tantas vitórias\nAlegria, história\nDeste time campeão\nVamos Interporto\nVamos golear\nNão tem adversário\nQue o tigre não possa derrotar\nVamos Interporto\nVamos festejar\nEm qualquer gramado que seja\nA vitória vamos conquistar\nA vitória vamos conquistar"));
        arrayList24.add(new Clube(R.drawable.ipiranga_de_alianca,"ipiranga_de_alianca", "Ipiranga de Aliança", R.raw.ipiranga_alianca, "Ipiranga\n" +
                "De Aliança Esporte Clube\n" +
                "Do estado do Tocantins\n" +
                "Ipiranga\n" +
                "O clube amado dos adultos e mirins\n" +
                "Ipiranga\n" +
                "Ó amarelo e azul\n" +
                "São as cores do guerreiro\n" +
                "Time altaneiro\n" +
                "O meu leão do sul\n" +
                "Ipiranga, Ipiranga\n" +
                "Minha paixão\n" +
                "Ipiranga, Ipiranga\n" +
                "A sua história só de glória, campeão\n" +
                "Ipiranga, Ipiranga\n" +
                "Minha paixão\n" +
                "Ipiranga, Ipiranga\n" +
                "A sua história só de glória, campeão"));
        arrayList24.add(new Clube(R.drawable.miracema,"miracema", "Miracema", R.raw.miracema, "Miracema Esporte Clube\n" +
                "Meu tricolor\n" +
                "O abacaxi do Tocantins\n" +
                "Meu guerreiro vencedor\n" +
                "Quando você entra no gramado\n" +
                "Sacode o estádio, faz o meu coração tremer\n" +
                "Sua torcida canta forte, canta alto\n" +
                "Mais uma batalha\n" +
                "Haveremos de vencer\n" +
                "Preto, vermelho e branco\n" +
                "Tricolor de aço, sim senhor\n" +
                "Preto, vermelho e branco\n" +
                "Meu clube amado\n" +
                "Sou seu fiel torcedor\n" +
                "Preto, vermelho e branco\n" +
                "Tricolor de aço, sim senhor\n" +
                "Preto, vermelho e branco\n" +
                "Meu clube amado\n" +
                "Sou seu fiel torcedor"));
        arrayList24.add(new Clube(R.drawable.nova_conquista,"nova_conquista", "Nova Conquista", R.raw.nova_conquista, "Nova Conquista, de muitas glórias\n" +
                "Somos guerreiros, rumo a vitórias\n" +
                "Nova Conquista, de muitas glórias\n" +
                "Somos guerreiros, rumo a vitórias\n" +
                "Nossas vozes jubilosas\n" +
                "Levantamos para mostrar o seu valor\n" +
                "Tu és forte, tu és grande\n" +
                "Nova Conquista, time de vencedor\n" +
                "Sempre em campos lutaremos\n" +
                "A procura das grandes vitórias\n" +
                "Os guerreiros na batalha\n" +
                "Nova Conquista já tem a sua história\n" +
                "Nós a frente da bandeira\n" +
                "No Tocantins nós somos o verdão\n" +
                "Sempre em busca da vitória\n" +
                "Seremos fortes, seremos campeão\n" +
                "Nova Conquista, de muitas glórias\n" +
                "Somos guerreiros, rumo a vitórias\n" +
                "Nova Conquista, de muitas glórias\n" +
                "Somos guerreiros, rumo a vitórias"));
        arrayList24.add(new Clube(R.drawable.palmas,"palmas", "Palmas", R.raw.palmas, "Somos “Palmas”, corpo e alma,\nNossa meta é a vitória.\nPalmas tu és minha paixão.\nNos gramados, seus craques cobertos de glória.\nPalmas, time do coração.\nVai tricolor Palmense,\nGrita a torcida: é campeão!\nVai tricolor, meu tricolor,\nVai conquistar essa nação\nCom amor as suas cores,\nVai vencer de Norte a Sul.\nVai tricolor, meu tricolor,\nVoa arara azul.\nFaz “ola”, agita e grita, acelera essa emoção.\nNessa vibração tricolor.\nDribla mais um, faz mais um gol.\nPorque o meu Palmas dá show\nPõe a mão na taça, mostra a tua raça\nFaça a massa delirar\nE no meu coração, eterno campeão.\nPalmas, amor e Paixão.\nE no meu coração, eterno campeão.\nPalmas, amor e paixão!"));
        arrayList24.add(new Clube(R.drawable.rio_sono,"rio_sono", "Rio Sono", R.raw.rio_sono, "Verde e branco\n" +
                "Verde e branco\n" +
                "Verde e branco\n" +
                "Rio Sono time do meu coração\n" +
                "Suas cores representam esperança\n" +
                "Paz e harmonia, muita história e tradição\n" +
                "Vibro quando vou vê-lo jogar\n" +
                "Eu choro em pranto, grito e canto sem parar\n" +
                "É mais um gol\n" +
                "Lá no gramado\n" +
                "Torço port ti, morro por ti\n" +
                "Meu clube amado\n" +
                "Vibro quando vou vê-lo jogar\n" +
                "Eu choro em pranto, grito e canto sem parar\n" +
                "É mais um gol\n" +
                "Lá no gramado\n" +
                "Torço port ti, morro por ti\n" +
                "Meu clube amado"));
        arrayList24.add(new Clube(R.drawable.tocantinopolis,"tocantinopolis", "Tocantinópolis", R.raw.tocantinopolis, "Tocantinópolis queremos te promover,\n" +
                "Esse verdão é time forte, sabe ganhar e perder.\n" +
                "Tocantinópolis queremos te promover,\n" +
                "Esse verdão é time forte, sabe ganhar e perder.\n" +
                "\n" +
                "Sabe de tudo, na hora H.\n" +
                "O que ele sabe, pode provar.\n" +
                "Sabe de tudo, na hora H.\n" +
                "O que ele sabe, pode provar.\n" +
                "\n" +
                "Time de jovens, Leva a bandeira na mão.\n" +
                "E a Mancha Verde contribuindo, incentivando o timão.\n" +
                "Time de jovens, Leva a bandeira na mão.\n" +
                "E a Mancha Verde contribuindo, incentivando o timão.\n" +
                "\n" +
                "Sabe de tudo, na hora H.\n" +
                "O que ele sabe, pode provar.\n" +
                "Sabe de tudo, na hora H.\n" +
                "O que ele sabe, pode provar."));
        arrayList24.add(new Clube(R.drawable.uniao_atletica_araguaiense,"uniao_atletica_araguaiense", "União Atlética Araguainense", R.raw.uniao_atletica, "União Atlética Araguainense\n" +
                "Meu boto do lontra\n" +
                "Estádio forte, guerreiro e valente\n" +
                "União Atlética Araguainense\n" +
                "Meu boto do lontra\n" +
                "Estádio forte, guerreiro e valente\n" +
                "Azul, preto e branco\n" +
                "Ó meu tricolor\n" +
                "Meu timão do canto\n" +
                "O meu encanto\n" +
                "Meu clube, minha paixão\n" +
                "Azul, preto e branco\n" +
                "Ó meu tricolor\n" +
                "Meu timão do canto\n" +
                "O meu encanto\n" +
                "Meu clube, minha paixão"));
        sectionedExpandableLayoutHelper.addSection("   TOCANTINENSE", arrayList24);

        ArrayList<Clube> arrayList25 = new ArrayList<>();
        arrayList25.add(new Clube(R.drawable.amapa,"amapa", "Amapá", R.raw.amapa, "Nasce sobre sol do Equador\nTeu nome as quatro cantos vou levar\nAmapá é sinônimo de glória\nE nobreza em teu cantar\nEsperança nesse povo varonil\nEstado de grandeza em tom sem fim\nTantas foram as vitórias assumidas, tão sofridas\nQue até chorei por ti\nAmapá Clube de raça\nTua estrela brilhará com todo amor\nEm tu peito toda historia\nJá vivida por cada torcedor\nAmapá é alvinegro\nTenho orgulho de te ver vencendo sim\nÉs do extremo norte brasileiro\nSua virtude só vejo refletir\nAmapá Clube de raça\nTua estrela brilhará com todo amor\nEm tu peito toda historia\nNa bebida com cada torcedor\nAmapá é alvinegro\nTenho orgulho de te ver vencendo sim\nÉs do extremo norte brasileiro\nSua virtude só vejo refletir\nSua virtude só vejo refletir\nSua virtude só vejo refletir\nSua virtude só vejo refletir"));
        arrayList25.add(new Clube(R.drawable.cristal,"cristal", "Cristal", R.raw.cristal, "Salve, salve vermelho e branco\n" +
                "com muita garra, com muita raça\n" +
                "esse é o Clube Atlético Cristal\n" +
                "\n" +
                "As cores que agigantam o meu coração\n" +
                "São as cores desse Cristal campeão\n" +
                "\n" +
                "Sempre pra frente vou ver jogar\n" +
                "o mais querido, aguerrido alvirrubro do Amapá\n" +
                "\n" +
                "Salve, salve vermelho e branco\n" +
                "com muita garra, com muita raça\n" +
                "esse é o Clube Atlético Cristal\n" +
                "\n" +
                "Nossa torcida ecoa num só grito\n" +
                "corre nas veias as mesmas cores\n" +
                "vermelho e branco são meus amores\n" +
                "Ergue a taça alvirrubro és o clube campeão\n" +
                "mora dentro do meu coração"));
        arrayList25.add(new Clube(R.drawable.guarany_ap,"guarany_ap", "Guarany", R.raw.guarany_ap, "Guarany esbelto e forte\n" +
                "Vou sempre ti amar\n" +
                "As conquistas do esporte\n" +
                "Fez esse time se orgulhar\n" +
                "\n" +
                "Que nos campos e pelas quadras\n" +
                "Em qualquer competição\n" +
                "Para ter sempre o teu nome\n" +
                "Dentro do meu coração\n" +
                "\n" +
                "Por isso prazer Guarany\n" +
                "Egue bem teu pavilhão\n" +
                "Ontem e hoje para sempre\n" +
                "Meu eterno campeão\n" +
                "\n" +
                "Tu é pioneiro és pela causa\n" +
                "Tu esporte do Amapá\n" +
                "Exaltando tua bandeira\n" +
                "Seja em qualquer lugar\n" +
                "\n" +
                "Corajoso e revoluto\n" +
                "Contemplado varonil\n" +
                "Guarany es o pedaço do esporte do Brasil\n" +
                "\n" +
                "Por isso bravo Guarany\n" +
                "Ergue bem teu pavilhão\n" +
                "Ontem, hoje para sempre\n" +
                "Meu eterno campeão\n" +
                "\n" +
                "Tua bravura meu coração conquistou\n" +
                "Teus atletas destemidos\n" +
                "Estão sempre a fazer fazer gol\n" +
                "Tua bravura meu coração conquistou\n" +
                "Teus atletas destemidos\n" +
                "Estão sempre a fazer fazer gol\n" +
                "\n" +
                "Por isso bravo Guarany\n" +
                "Ergue bem teu pavilhão\n" +
                "Ontem e hoje para sempre\n" +
                "Meu eterno campeão\n" +
                "Ontem e hoje para sempre\n" +
                "Meu eterno campeão\n" +
                "Ontem e hoje para sempre\n" +
                "Meu eterno campeão"));
        arrayList25.add(new Clube(R.drawable.independente_amapa,"independente_amapa", "Independente", R.raw.independente, "São muitos anos de lutas\n" +
                "São tantos anos de progresso\n" +
                "O Independente sempre pra frente\n" +
                "De sucesso em sucesso\n" +
                "\n" +
                "Quantas vitórias, quantos troféus\n" +
                "O Independente já tem\n" +
                "Por sua vida eu me orgulho\n" +
                "De ser Independente também\n" +
                "\n" +
                "Por sua vida eu me orgulho\n" +
                "De ser Independente também\n" +
                "\n" +
                "O Independente é fogo\n" +
                "Gosto de ver o seu jogo\n" +
                "Faz a torcida vibrar\n" +
                "Independente, Independente\n" +
                "Pra sempre eu irei te adorar\n" +
                "Independente, Independente\n" +
                "Pra sempre eu irei te adorar"));
        arrayList25.add(new Clube(R.drawable.macapa,"macapa", "Macapá", R.raw.macapa, "Macapá, Macapá,\nClube do meu coração\nEm ti posso lhe orgulhar\nPor seres tantas vezes campeão\nNa hora da decisão\nDá gosto de ver lutar\nCom tanta determinação\nPara a vitória conquistar\n\nHá títulos históricos na tua trajetória\nPois fostes o primeiro a se cobrir de glórias\nTua camisa azul cheia de tradição\nÉ símbolo de raça em qualquer competição\n\nHá títulos históricos na tua trajetória\nPois fostes o primeiro a se cobrir de glórias\nTua camisa azul cheia de tradição\nÉ símbolo de raça em qualquer competição"));
        arrayList25.add(new Clube(R.drawable.oratorio,"oratorio", "Oratório", R.raw.oratorio, "Em azul e branco\n" +
                "São cantadas as tuas glórias\n" +
                "Oratório, todos conhecem teu valor\n" +
                "Homenageando tua história\n" +
                "Nossa Senhora de Fátima te abençoou\n" +
                "Valente guerreiro, grande vencedor\n" +
                "\n" +
                "Clube de raça e coragem\n" +
                "Teu sentimento é de paixão\n" +
                "Vibra Orca Demolidora\n" +
                "O Oratório é campeão\n" +
                "\n" +
                "Clube de raça e coragem\n" +
                "Teu sentimento é de paixão\n" +
                "Vibra Orca Demolidora\n" +
                "O Oratório é campeão\n" +
                "\n" +
                "És o orgulho e a alegria do torcedor\n" +
                "Assim o Santa Rita te abraçou\n" +
                "Num caloroso gesto de amor\n" +
                "\n" +
                "O teu passado ta na memória\n" +
                "O teu presente te faz brilhar\n" +
                "O teu futuro é de vitória\n" +
                "Seja em qualquer lugar\n" +
                "\n" +
                "O teu passado ta na memória\n" +
                "O teu presente te faz brilhar\n" +
                "O teu futuro é de vitória\n" +
                "Seja em qualquer lugar"));
        arrayList25.add(new Clube(R.drawable.ypiranga_ap,"ypiranga_ap", "Ypiranga", R.raw.ypiranga_ap, "Abrace o glorioso Ypiranga\nYpiranga do meu coração\nPor ti farei o impossível\nPra no esporte serem sempre o campeão\n\nNascido em 63\nTua historia irei sempre exaltar\nClube pujante querido\nHonra e glória do desporto do Amapá\n\nJamais te esquecerei\nTrago tuas cores dentro do meu coração\nYpiranga de Amor e Garra.\nClube da torre.\nDono da minha paixão\n\nJamais te esquecerei\nTrago tuas cores dentro do meu coração\nYpiranga de Amor e Garra.\nClube da torre.\nDono da minha paixão\n\nAbsolutos e encorajados\nOs atletas estão sempre a lutar\nPara dar mais valor a nosso esporte\nE o teu nome eternamente consagrar\n\nNessa corrente negro anil\nQue canta vibra e explode de emoção\nUnindo forças pra tua vitória\nUm elo eu sou ao desfraldar teu pavilhão\n\nJamais te esquecerei\nTrago tuas cores dentro do meu coração\nYpiranga de Amor e Garra.\nClube da torre.\nDono da minha paixão\n\nJamais te esquecerei\nTrago tuas cores dentro do meu coração\nYpiranga de Amor e Garra.\nClube da torre.\nDono da minha paixão"));
        arrayList25.add(new Clube(R.drawable.sao_jose_ap,"sao_jose_ap", "São José", R.raw.sao_jose_ap, "São José é sinônimo de fibra\nSão José é uma realidade\nJoga bem de verdade\nSeu plantel tem qualidade\nSão José, São José\nSua torcida de fidelidade.\n\nSão José é sinônimo de fibra\nSão José é uma realidade\nJoga bem de verdade\nSeu plantel tem qualidade\nSão José, São José\nSua torcida de fidelidade.\n\nO Branco da camisa representa a paz,\nO Vermelho representa uma brasa,\nGosto de ver o São José jogar\nLá fora ou dentro de casa.\nGosto do São José com paixão\n\nO Tricolor do meu coração.\n"));
        sectionedExpandableLayoutHelper.addSection("   AMAPAENSE", arrayList25);

        ArrayList<Clube> arrayList26 = new ArrayList<>();
        arrayList26.add(new Clube(R.drawable.genus,"genus", "Genus", R.raw.genus, "E quem são eles que surgem lá do alto?\nDo extremo norte do País.\nÉ o nosso esquadrão dourado,\nCom sua massa imensa e feliz.\nO Aluizão e nosso campo de batalha.\nNosso reduto de raça e vibração.\nE com um grito forte vem o nosso brado.\nDe um time campeão.\n\nVem, vem conhecer a nossa massa.\nVem, estremecer a arquibancada.\nVem, vestir a camisa dourada.\n\nCom o grená no coração\nE cantar pro nosso Genus\nNosso grande campeão.\n\nVem, vem conhecer a nossa massa.\nVem, estremecer a arquibancada.\nVem, vestir a camisa dourada.\n\nCom o grená no coração\nE cantar pro nosso Genus\nNosso grande campeão."));
        arrayList26.add(new Clube(R.drawable.jiparana,"jiparana", "Ji-Paraná", R.raw.jiparana, "Sob o pálio do supremo Criador,\nDo Seu amor, resplandecem nossas provas:\nA educação, a saúde e a cultura.\nÉ uma ventura ver na ULBRA as Boas Novas.\nUniversidade Luterana do Brasil!\nNo teu perfil, o estandarte do saber:\nO bem comum se confunde com a pesquisa.\nE a mão precisa avaliza o bem querer.\n\nAbre caminhos com a luz do futuro,\nO tempo seguro a vida trará.\nLeal ao lema da cristandade:\n“A verdade vos libertará”\n\nUniversidade Luterana do Brasil!\nNo teu perfil, o estandarte do saber:\nO bem comum se confunde com a pesquisa.\nE a mão precisa avaliza o bem querer.\n\nSempre fiel às ciências verdadeiras,\nFormando fieiras dos valores culturais,\nAlcança o tempo, derrubando preconceitos,\nPelo respeito à liberdade dos demais.\n\nUniversidade Luterana do Brasil!\nNo teu perfil, o estandarte do saber:\nO bem comum se confunde com a pesquisa.\nE a mão precisa avaliza o bem querer."));
        arrayList26.add(new Clube(R.drawable.moto_clube_esportes_ro,"moto_clube_esportes_ro", "Moto Clube", R.raw.moto_clube_ro, "Meu alvi rubro\n" +
                "Timão de raça\n" +
                "O campeão das grandes decisões\n" +
                "Eternamente erguendo taças\n" +
                "Orgulho e raça desse meu torrão\n" +
                "\n" +
                "Bi campeão da Amazônia Ocidental\n" +
                "Primeiro clube a jogar no Maracanã, em 1969\n" +
                "Meu Moto Clube, eu sou tufão\n" +
                "\n" +
                "Meu alvi rubro\n" +
                "Timão de raça\n" +
                "O campeão das grandes decisões\n" +
                "Eternamente erguendo taças\n" +
                "Orgulho e raça desse meu torrão\n" +
                "\n" +
                "Doze de Maio do ano de 52\n" +
                "Nasceu orgulho do esporte estadual\n" +
                "Meu alvi rubro, meu Moto Clube\n" +
                "Timão de fé, meu alto astral"));
        arrayList26.add(new Clube(R.drawable.real_ariquemes,"real", "Real Ariquemes", R.raw.real, "Aqui só tem heróis\nNo sangue o coração e desportistas\nNos leva a onde tu quiser\nReal Ariquemes de conquistas\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nCor vermelha que abraço o preto\nReal Ariquemes de amor\nÉs o clube do meu coração\nNa alegria tristeza e na dor\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nNossa história é vencer e vencer\nSou Real sou o céu da Amazônia\nSou amor ao o fruto de terra\nSou Real Ariquemes Rondônia\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória"));
        sectionedExpandableLayoutHelper.addSection("   RONDONIENSE", arrayList26);

        ArrayList<Clube> arrayList27 = new ArrayList<>();
        arrayList27.add(new Clube(R.drawable.atletico_rr,"atletico_rr", "Atlético - RR", R.raw.atletico_rr, "Eu sou milionário, eu sou\nEu sou tricolor\nO meu clube é um show\nEu sou milionário, eu sou\nEu sou tricolor\nO meu clube é um show\nVerde, branco e grená\nMas que maravilha eu vou me acabar\nVerde, branco e grená\nMas que maravilha eu vou me acabar\nVerde, branco e grená\nMas que maravilha eu vou me acabar\nVerde, branco e grená\nMas que maravilha eu vou me acabar\nTodos numa só jogada\nMas que parada\nO que, que há?\nTodos numa só jogada\nMas que parada\nO que, que há?\nTricolor, Tricolor, Tricolor, Tricolo"));
        arrayList27.add(new Clube(R.drawable.bare,"bare", "Baré", R.raw.bare, "Sou colorado\nSou respeitado\nEu sou, eu sou Baré\nSou colorado\nSou respeitado\nEu sou, eu sou Baré\nSou indio forte\nVou levar a minha bandeira\nVou gritar forte\nFaça chuva ou faça sol\nSou indio forte\nVou levar a minha bandeira\nVou gritar forte\nFaça chuva ou faça sol\n\nA bola rola de pé em pé\nBaré está dando olé\nA bola rola de pé em pé\nBaré está dando olé"));
        arrayList27.add(new Clube(R.drawable.nautico_rr,"nautico_rr", "Náutico", R.raw.nautico_rr, "Quem quiser saber de bola\n" +
                "Venha para o lado de cá\n" +
                "A águia rubra é uma parada\n" +
                "E á botando para quebrar\n" +
                "Quem quiser saber de bola\n" +
                "Venha para o lado de cá\n" +
                "A águia rubra é uma parada\n" +
                "E á botando para quebrar\n" +
                "Entre nessa corrente\n" +
                "Em um só pensamento de uma só vez\n" +
                "Gritando todos juntos\n" +
                "\n" +
                "NÁUTICO, NÁUTICO, 1, 2, 3"));
        arrayList27.add(new Clube(R.drawable.sao_raimundo_rr,"sao_raimundo_rr", "São Raimundo", R.raw.sao_raimundo_rr, "Aqui só tem heróis\nNo sangue o coração e desportistas\nNos leva a onde tu quiser\nReal Ariquemes de conquistas\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nCor vermelha que abraço o preto\nReal Ariquemes de amor\nÉs o clube do meu coração\nNa alegria tristeza e na dor\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nNossa história é vencer e vencer\nSou Real sou o céu da Amazônia\nSou amor ao o fruto de terra\nSou Real Ariquemes Rondônia\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória\nAonde você chegar\nVai ser de todos a história\nSonhamos lutamos pra ser\nReal Ariquemes de glória"));
        sectionedExpandableLayoutHelper.addSection("   RORAIMENSE", arrayList27);
        sectionedExpandableLayoutHelper.notifyDataSetChanged();
    }
    @Override
    public void itemClicked(Clube clube) {
        Toast.makeText(this, "Clube: " + clube.getName() + clube.getCover() + "clicked", Toast.LENGTH_LONG).show();
    }
    @Override
    public void itemClicked(Section section) {
        Toast.makeText(this, "Section: " + section.getName() + " clicked", Toast.LENGTH_LONG).show();


    }
}
