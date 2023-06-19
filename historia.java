package Historia;
import java.util.Scanner;

public class historia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String sinopse;
        int alt; //alternativa, por onde o usuário seguirá sua história
        int i = 0; //contador geral

        x("Olá! Nesse modo história, você usará os digitos [1] para sim e [0] para não.");
        x("Você entendeu?");
        y("- ");
        y("");
        alt = repetidorErro(leitor);

        x("\nÓtimo, você sabe ler! Continuando... ");
        x("Por padrão, 0 e 1 serão sempre a resposta.");
        x("...\n..\n.\n");


        x("Nessa história, você deverá encontr-");
        while (i != 10){
            y(".\n");
            i++;
            
        }

        x("Você parece cansado, deveria seguir em frente antes que seu tempo esgote. Vamos!");
        x("Era uma vez... Bom, não importa, não perca muito do seu tempo neste lugar,");
        x("primeiramente, como você está? Bem? Mal?...");
        y("- ");
        leitor.nextLine();
        sinopse = leitor.nextLine();
        if (sinopse.equalsIgnoreCase("sinopse")){
            x("\nVejo que quer a sinopse completa. Aqui está:\n");
            x("A história se passa em um período do tempo mais avançado, onde boa parte da humanidade se fora.");
            x("Nosso protagnonista, já a beira da morte, encontra a Morte, personificada pelo próprio deus asteca");
            x("OU pelo nosso querido barqueiro Carontes, o tal ''Barqueiro'' (grego) que leva as almas dos mortos");
            x("para o submundo. Em ambos os casos, nosso protagonista morre e se encontra com a Morte.");
            x("Apenas uma rota nos levará para o ''final'' feliz, onde recebemos uma lição de vida (morte).");
        }

        else{
            x("\n...");
            x("Desculpe-me, agora vamos, em que direção devemos seguir?");
            x("[0] Seguir para ponte de ferro");
            x("[1] Seguir para planícies verdes");  
            y("- ");          
            alt = leitor.nextInt();

            if (alt == 0){
                x("Vamos indo, então. Eu o vi cair, você está bem?");
                x("Deixe-me apresentar, me chamo Micli, irei guiar você.");
                x("Bom, é aqui que sua jornada começa de verdade.");
                x("");
                x("Os astecas eram um povo antigo com uma religião politeísta. Eles realizavam sacrifícios humanos e de animais para agradar seus deuses e tinham uma rica mitologia.");
                x("Os sacerdotes eram importantes para essa conexão com o mundo místico. Os astecas também eram tecnologicamente avançados, com uma estrutura social organizada");
                x("e sua própria forma de escrita.  No entanto, o destino final dos astecas e seu desaparecimento são assuntos para outra história.");
                x(".");

                x("Oh, passamos da ponte. Veja! É uma cidade (abandonada)!");
                x("Para onde vamos agora?");
                x("[0] Seguir para o circo abandonado");
                x("[1] Seguir para parque de diversões");  
                y("- "); 
                alt = repetidorErro(leitor);

                if (alt ==0){
                    x("Bom, como suspeitei, está abandonado, não há nada aqui... Igual no resto do mundo.");
                    x("Te parabenizo por conseguir chegar tão longe, minha cara pessoa. Mas... Infelizmente,");
                    x("você já morreu há algum tempo, antes mesmo de atravessar aquela ponte.");
                    x("Bom, como eu disse antes, me chamo Micli, sou uma das personificações da Morte,");
                    x("pertenço a ''mitologia'' asteca, vim aqui para poder levar sua alma em direção à luz.");           
                    x("Ou às trevas, ainda não me decidi quanto a você.");
                    x("No entanto, posso afirmar que, a pessoa que o controla, certamente irá ---");

                    i = 0;
                    while (i != 10){
                        x(".");
                        i++;
                    }
                } else {
                    x("Veja! Ainda há energia nas baterias, vamos na roda gigante, tenho algo para lhe mostrar.");
                    x("...");
                    x("Veja, olhe em direção ao horizonte, o que enxergas?");
                    x("Bem, certamente deve ser uma vista linda, memorize esta imagem, será a última coisa que verá antes de ''subir.''");
                    x("Ops, mas não olhe para baixo, você pode se arrepender...");
                    x("[0] Não olhar para baixo");
                    x("[1] Olhar para baixo");
                    y("- "); 
                    alt = repetidorErro(leitor);

                    if (alt == 0){
                        x("Bom, continue olhando para frente em direção ao horizonte. Deixe-me apresentar novamente.");
                        x("Me chamo Micli, sou a personificação da ''morte'' para os astecas antigos. Muito prazer!");
                        x("Bem, infelizmente você morreu recentemente, minha cara pessoa. Estou aqui para levar sua alma ao que você chama de ''céu''.");
                        x("Dê-me a sua mão, te explcicarei melhor quan---");

                        i = 0;
                        while (i != 5){
                            x("[Falha crítica]");
                            i++;
                        }i = 0;

                        while (i != 10){
                            x("[FALHA CRÍTICA]");
                            i++;
                        }

                    } else {
                        x("Eu falei uma vez, e eu não repito. Você não deveria olhar para baixo. /| 0 ¢ 3 - - - - W 0 R t -");
                        x(".");
                        x("...");

                    }
                    
                }
            } else {
                x("Bom, me chamo Caron, deixe-me contar uma história...");
                x("Tânatos, filho de Nyx, a deusa da noite, era o deus da morte não violenta. Nyx viveu no submundo de Hades e era conhecida por sua figura sombria.");
                x("Tânatos tinha um irmão gêmeo, Hypnos, o deus do sono. Enquanto Hypnos era gentil e ajudava os mortais, Tânatos era impiedoso e não era amado");
                x("pelos deuses e mortais. Ele levava os humanos para o submundo quando chegava a hora de sua morte. A paternidade de Tânatos é incerta, com diferentes");
                x("versões sugerindo que ele não tinha pai ou que seu pai era Érebo, o deus das trevas.");
                x(".");

                x("Bom, aqui estamos, olhe ao seu redor, podemos ir até onde o rio deságua no mar ou podemos seguir por aquela estreita parte entre as montanhas...");
                x("O que você sugere, minha cara pessoa?");
                x("[0] Estreito da montanha");
                x("[1] Onde o rio deságua");
                y("- "); 
                alt = repetidorErro(leitor);

                if (alt == 0){
                    x("Bom, depois de andarmos isso tudo, chegamos em um rio com um bote. Suba, irei levá-lo até lá...");
                    x("Percebi que estava muito cansado ao chegar até aquela pequena caverna antes de chegarmos até este rio.");
                    x("Bom, deixe-me contar um pouco sobre mim para que a sua jornada não seja tão monótona...");
                    x("Me chamo Caronte. Me apresentei previamente como Caron, então deixarei que me chame assim.");
                    x("Continuando, algumas pessoas me perguntam se gosto de bateria, cigarro, dominó e jogos de aposta, rum...");
                    x("Bom, eu gosto do pôr-do-sol, dos domingos, do Natal...");
                    x(".");
                    x("Ah, cuidado minha cara criança. Não precisa dar às pessoas o que você acha que elas precisam para se tornarem amigos.");
                    x("Nem sempre isso é o suficiente. Quando acontece de você dar tudo de si e não receber a amizade que queria,");
                    x("você se vê como um estorvo, não è? Portanto, o diabo são essas amizades, toxicas ou vazias.");
                    x("Lembre-se: O diabo não é amigo de ninguém, mas é divertido, é verdade. São aqueles falsos amigos que só coloca te colocam pra baixo");
                    x("ou só estão em sua vida na hora da parte boa. Você se molda para que as pessoas gostem de você, e, no final,");
                    x("elas nem são o que você acha que é ou precisa. Conheça a si mesmo e quem está ao seu redor.");
                    x("Você precisa estar sozinho e deixar tudo para trás, romper com quem te leva ao ''inferno'', se lançando no novo que é essa queda livre do auto conhecimento,");
                    x("pois você não sabe o que está por vir. Dessa forma, parando de se importar com os outros e buscar se salvar, cuidando de si mesmo.");
                    x("");
                    x("No fim, nada disso importa, venha, chegamos. O parabenizo por ter chegado tão longe e escolhido o caminho correto... Você fez bem, tenho orgulho de você.");


                } else {
                    x("Bom vamos indo então. Daqui vejo um pequeno barco, posso te levar até lá, siga-me.");
                    x("Bem... já estamos há um bom tempo navegando e já escureceu, deixe-me apresentar melhor. Sou a tão famosa ''Morte''.");
                    x("Para você pode ser algo repentino, mas não se preocupe! Você conseguiu sobreviver muito tempo neste lastimável mundo.");
                    x("Com você, toda a humanidade se fora, agora não existem mais humanos vivos neste planeta. Com isso, meu trabalho terminará.");
                    x("Adão foi o primeiro ''homem'' na Terra, você, será chamado de ''O Último''. Um título nobre, não achas?");
                    x("Hahaha... Oh, minha cara criança, não chores, nem tudo acaba com a morte, falando nisso, meu nome completo não é Caron,");
                    x("mas sim Carontes, sou o barqueiro da morte, eu, Thanatos e Hades trabalhamos no submundo, meu trabalho é trazer as almas dos mortais.");
                    x("Não encare a Morte como algo ruim, sempre há o lado bom...");
                    x("O ''céu''? bom, ele não existe, somente o submundo existe...");
                    x("Bem, estamos chegan-");
                    x(".");
                    x("CheGaND");
                }


            }
        }

    
    }



    public static void x(String message) { //método para substituir o "String.out.println()"
        System.out.println(message);
    }
    
    public static void y(String message) { //método para substituir o "String.out.print()"
        System.out.print(message);
    }

    public static int repetidorErro(Scanner leitor) { //método para forçar o usuário a escolher entre 1 e 0
        int alt;                                      //caso responda outra coisa, a pergunta é feita novamente

        do {
            alt = leitor.nextInt();

            if (alt != 0 && alt != 1) {
                x("Tente novamente. Lembre-se, APENAS 0 ou 1.");
                y("- "); 
            }
        } while (alt != 0 && alt != 1);

        return alt;
    }

}