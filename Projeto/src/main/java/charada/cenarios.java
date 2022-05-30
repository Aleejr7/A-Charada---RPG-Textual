/*
Cenários que serão utilizado durante o jogo
 */
package charada;

import java.util.Scanner;

public class cenarios {//entrada de dados para ler somente valor númerico OBS: Substituir todos os O

    static int lerEntradaInt(Scanner entrada) {
        do {
            System.out.println("Digite valor numérico: ");
            try {
                String valorStr = entrada.nextLine();
                int valor = Integer.parseInt(valorStr);
                return valor;
            } catch (NumberFormatException ex) {
                System.out.print("Valor inválido. ");
            }
        } while (true);
    }

    static void entrada() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Você está na entrada do Senac, esta é vista 360º do local");
        System.out.println("A sua direita você tem o Estacionamento e uma grande árvore, com alguns bancos embaixo");
        System.out.println("A sua esquerda você tem a grande bliblioteca do senac e a obra de Elisa Bracher, a qual não foi atribuído um título.\n");
        int resposta;
        do {

            System.out.println("Sicronizar com a obra ?");
            System.out.println("1-Para Sicronizar\n2-Para NÃO Sicronizar\n");
            resposta = lerEntradaInt(input);

            switch (resposta) {
                case (1):
                    System.out.println("Uma obra de arte que consite em quatro troncos de árvore; como não há título denominamos 'MUTIlADOS' ");
                    System.out.println("Ao olharmos para obra, é possivel farzer uma ligação instântanea ao desmatamento");
                    System.out.println("E por mais que a madeira ainda seja utilizado como matéria prima para confecção de livros, cadernos, móveis e etc...");
                    System.out.println("É uma pratica inaceitável nos dias atuais \n  ");
                    Thread.sleep(3000);
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    break;
                case (2):
                    System.out.println("Ok, vamos em fente!!");
                    break;
                    default:
                        System.out.println("Opção inválida");
            }
            System.out.println("Bom mais a frente encontra-se uma placa, a qual faz referência ao 'Abram Szajman'. Mais a frente está a entrada para o prédio 1 \n");   
        } while(resposta > 2 || resposta <= 0);
    }

    static void biblioteca(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int resposta1;
        System.out.println("Bem vindo a Biblioteca, bom estudos \n");
        System.out.println("-------------Descrição da biblioteca------------- \n");
        System.out.println("Na entrada temos a obra 'GINASTA SENTADO'\n");

        do {
            System.out.println("sicronizar com o GINASTA SENTADO?");
            System.out.println("1-Para Sicronizar\n2-Para NÃO Sicronizar\n");
            resposta1 = lerEntradaInt(input);
            System.out.println("");

            switch (resposta1) {

                case 1:
                    System.out.println("Uma obra produzida em 2006 pelo Autor Veríssimo \n");
                    System.out.println("A obra 'GINASTA SENATADO' consiste basicamente em um homem sentado em posição de reflexão e ao seu lado alguns livros. \n");
                    System.out.println("'Uma mente que não se exercita é como um atleta que não treina'. \n");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    Thread.sleep(3000);
                    break;
                case 2:
                    System.out.println("Ok, vamos coninuar!. \n");
                    break;

                default:
                    System.out.println("Opção inválida \n");
                    break;
            }
        } while (resposta1 > 2 || resposta1 <= 0);

        System.out.println("A direita temos a recepção, lemre-se de passar por lá caso deseje levar um livro para casa \n");
        System.out.println("Vem, vamos entrar\n");
        System.out.println("Olha ao seu redor, aqui temos um ambiente de estudo, com diversos computadores para você fazer seus trabalhos \n");
        System.out.println("Além de diverso puff, sofá e cadeiras para vc relaxar enquanto estuda \n");
        System.out.println("Vou te mostrar um lugar bem interessante, principalmente se você for fã de HQs \n");
        System.out.println("Vem (: \n");
        System.out.println("Olha esse lugar, quantas HQs (: \n");
        System.out.println("Olha esse poster do Superman, uouu maior que você!! \n");
        Thread.sleep(3000);
        int resposta2;

        do {
            System.out.println("Sicronizar com o Poster ?");
            System.out.println("1-Para Sicronizar\n2-Para NÃO Sicronizar\n");
            resposta2 = lerEntradaInt(input);
            System.out.println("");

            switch (resposta2) {

                case 1:
                    System.out.println("E ae campeão, dia puxado não é msm\n");
                    System.out.println("Continue assim, você esta dando seu melhor este é o segredo, não desista \n");
                    System.out.println("Você está meio para baixo, para te animar vou te contar uma piada, lá vai:  ");
                    System.out.println("Um homem estava muito bebado na madrugada");
                    System.out.println("Quando se deparou com uma freira, não demorou muito e eles sairam na mão");
                    System.out.println("Depois de brigarem por muito tempo, a freira disse: ");
                    System.out.println("PÔÔ, BATMAN Esperava mais de você kkkkkkk!!!! \n");
                    System.out.println("Lembre-se o segredo do sucesso é a perseverança \n");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    Thread.sleep(4000);
                    System.out.println("'Muito bem, vamos seguir em frente' \n");
                    break;

                case 2:
                    System.out.println("Muito bem, vamos em frente então \n");
                    break;

                default:
                    System.out.println("Opção inválida \n");
                    break;
            }
            System.out.println("As escadas te levam ao segundo andar da biblioteca \n");

        } while (resposta2 > 2 || resposta2 <= 0);

        int resposta3;
        int resposta4;

        do {
            System.out.println("Deseja ir para o segundo andar da biblioteca? \n");
            System.out.println("1-Para ir ao segundo andar\n2-Para NÃO ir ao segundo andar \n");
            resposta3 = lerEntradaInt(input);

            switch (resposta3) {

                case 1:
                    System.out.println("Bem aqui no segundo andar ficam os livros \n");
                    System.out.println("Temos uma imensa variedade de livros, é so você entrar nesses corredores e escolher o seu livro \n");
                    System.out.println("Eu sei que há muitos corredores \n");
                    System.out.println("Mas vc pode se localizar por essas plaquinhas que há inicio de cada corredor \n");
                    System.out.println("Nos computadores você pode pesquisar se o seu livro está no acervo, lá também vai informa o corredor que ele estar \n");
                    Thread.sleep(3000);

                    System.out.println("Olhe para cima");
                    System.out.println("Gigante não é mesmo?");
                    System.out.println("Essa é a Vesica\nProvavelmente você ja ouvi falar sobre isso \n");
                    do {

                        System.out.println("Sicronizar com a Vesica? \n");
                        System.out.println("1-Para Sicronizar\n2-Para NÃO Sicronizar\n");
                        resposta4 = lerEntradaInt(input);

                        switch (resposta4) {

                            case 1:
                                System.out.println("Esta escultura foi construida a partir do desenho formado pela sobreposição parcial de 2 circulos");
                                System.out.println("Materialização - 0 divino fecunda o divino. \n");
                                System.out.println("A VESICA é uma variação do símbolo zodical Peixes.");
                                System.out.println("E a era de Peixes se caracterizou pela encarnação formal do espírito na forma,\naprofundadando assim a materialização do espírito.\n");
                                System.out.println("----------------------------------------------------------------------------------------------");
                                Thread.sleep(3000);
                                break;
                            case 2:
                                System.out.println("Muito bem, vamos em frente. \n");
                                break;
                            default:
                                System.out.println("Opção Inválida");
                                break;
                        }
                    } while (resposta4 > 2 || resposta4 <= 0);

                case 2:
                    System.out.println("Lemre-se, conhecimento nunca é de mais. \n");
            }
            System.out.println("Ok, muito bom ver você por aqui\nEspero que nos econtremos em breve aqui. \n");
            System.out.println("Volte sempre!  (:\n");
            System.out.println("----------------------------------------------------------------------------------------------");
            Thread.sleep(3000);
        } while (resposta3 > 2 || resposta3 <= 0);

    }

    static void predio1(String[] args) throws InterruptedException {
        int resposta1;
        int resposta2;
        Scanner input = new Scanner(System.in);
        System.out.println("Esse espaço você deve conhecer bem\n");
        System.out.println("Aqui é o espaço dos laboratórios, no qual temos nossas aulas\n");
        System.out.println("Temos o Corredor A e o Corredor C \n");

        do {
            System.out.println("Qual corredor você deseja ir ? \n1 - Para corredor A \n2 - Para corredor C");
            resposta1 = lerEntradaInt(input);

            switch (resposta1) {
                case 1:
                    System.out.println("Bom este é o corredor A");
                    System.out.println("Aqui temos diversas salas de aula diariament");
                    System.out.println("Temos também a NASA ao lado, aposto que você conhece bem \n");
                    System.out.println("Olha só que legal, temos nas paredes diversos quadros, pinturas e desenhos. Isso deixa o ambiente mais atrativo não é mesmo? \n");
                    System.out.println("Por enquanto é so. Não se esqueça de dar uma passadinha no corredor C, pode ter algo mais interessante por lá");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    Thread.sleep(3000);
                    break;

                case 2:
                    System.out.println("Bem vindo, esse é o corredor C \n");
                    System.out.println("Aqui no inicio temos alguns laboratório de TI, com diversos computadores e muito mais \n");
                    System.out.println("Já para o final, temos alguns laboratórios de Quimica, aqui acontece uma parada sinistra ás vezes (): \n");
                    System.out.println("Nas paredes temos alguns quadros, para deixar o ambiente mais agradável \n");
                    System.out.println("Dar uma olhada nesse \n");
                    System.out.println("Sicronizar com o Quadro?");
                    System.out.println("1- Para Sicronizar \n2-Para NÂO sicronizar");
                    Thread.sleep(3000);

                    do {
                        resposta2 = lerEntradaInt(input);
                        switch (resposta2) {
                            case 1:
                                System.out.println("-----Reconstrução dos 18 fingurinos e dança do BALLET TRIÁDICO----- \n");
                                System.out.println("O projeto de pesquisa 'A reconstrução dos 18 figurinosdo BALLET TRIÁDICO de Osckar Schlemmer ");
                                System.out.println("foi iniciado no Centro Universitário Senac em 2007.");
                                System.out.println("Tendo sido a primeira reconstituição desenvolvida na América Latina.[...]\n");
                                System.out.println("----------O Ballet----------");
                                System.out.println("[...] ");
                                System.out.println("O Ballet Triádico consiste em três partes que formam uma estrutura de cenas de dança estilizadas,");
                                System.out.println("variando do humor ao austero. [...]");
                                System.out.println("Ele nomeou 'Triádico' para referi-se aos três atos, três dançarinos e ás três cores, uma para cada ato.[...] \n");
                                System.out.println("Muito legal esse tal de Trindade não é mesmo");
                                System.out.println("As três pessoas são distintas, mas são uma (Deus). Tem um princípio ai \n");
                                System.out.println("----------------------------------------------------------------------------------------------");
                                Thread.sleep(3000);
                                break;
                            case 2:
                                System.out.println("Muito bem, isso pode fazer falta.\n");
                                break;

                            default:
                                System.out.println("Opção inválida \n");
                                break;
                        }
                    } while (resposta2 > 2 || resposta2 <= 0);

                    break;

                default:
                    System.out.println("Opção Inválida\n");
                    break;
            }
        } while (resposta1 > 2 || resposta1 <= 0);

    }

    static void centroEsportivo(String[] args) throws InterruptedException {
        System.out.println("------------------------------Centro Esportivo---------------------------------------");
        System.out.println("É aqui que você pode vir praticar algumas atividades físicas");
        System.out.println("E até se tornar um atleta do SENAC");
        System.out.println("A nossa direita temos a academia onde você pode manter sua forma física");
        System.out.println("E a esquerda temos algumas quadras de futebol, basquetebol, voleibol");
        System.out.println("Bem, e ali no fundo temos uma, oxii, uma capivara kkkkk");
        System.out.println("Esse é o nosso centro esportivo, espero por você na quadra\n");
        System.out.println("Até mais\n");
        System.out.println("----------------------------------------------------------------------------------------------");
        Thread.sleep(3000);

    }

    static void lanchonete(String[] args) throws InterruptedException {
        int resposta1;
        Scanner input = new Scanner(System.in);
        System.out.println("-------------Bem vindo a Lanchonete--------------\n");
        System.out.println("Aqui é onde você vai comer seu lanchinho (:");
        System.out.println("Aqui támbem temos alguns jogos: Tênis de Mesa; Pebolim ");
        System.out.println("Vamos jogar ? \n");

        do {
            System.out.println("1-Para jogar\n2-Para NÃO jogar");
            resposta1 = lerEntradaInt(input);
            System.out.println("");
            switch (resposta1) {

                case 1:

                    System.out.println("Você é um bom adversário...");
                    System.out.println("Uouuu, bom saque!! ");
                    System.out.println("Você está se saindo bem para uma primeira vez, deveria entrar para a *KAPIVA* ");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    Thread.sleep(3000);
                    break;
                case 2:

                    System.out.println("Você pode jogar a qualquer momento, basta dar uma passadinha aqui \n");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (resposta1 > 2 || resposta1 <= 0);
    }

}
