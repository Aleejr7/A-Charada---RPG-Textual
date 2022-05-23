package charada;

import java.util.Scanner;

public class jogo_textual {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("------------ A Charada ------------\n");
        System.out.println(" Um jogo RPG Textual. \n");
        System.out.println("Digite o nome do personagem: ");
        nome = input.next();
        System.out.println(""); 
       
        System.out.println("                                    .:::!!!!!!!!!!::                                                           \n"
                + "                                       .:!!!!!!!!!!!!!!!!!!!!!!!:                                                       \n"
                + "                                   .:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                                    \n"
                + "                                .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                                  \n"
                + "                              :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                 \n"
                + "                            :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                               \n"
                + "                          .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                               \n"
                + "                        .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!:                                              \n"
                + "                       :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                             \n"
                + "                     .:!!!!!!!!!!!!!!!!!!!!::..:!!!!!!!!!!!!!!!!!!!!!!!!!!:                                             \n"
                + "                    .!!!!!!!!!!!!!!!!:.           .!!!!!!!!!!!!!!!!!!!!!!!!                                             \n"
                + "                   :!!!!!!!!!!!!!!!:                :!!!!!!!!!!!!!!!!!!!!!!.                                            \n"
                + "                  :!!!!!!!!!!!!!!:                   !!!!!!!!!!!!!!!!!!!!!!:                                            \n"
                + "                 .!!!!!!!!!!!!!:.                    !!!!!!!!!!!!!!!!!!!!!!:                                            \n"
                + "                .!!!!!!!!!!!!!:                      !!!!!!!!!!!!!!!!!!!!!!.                                            \n"
                + "                :!!!!!!!!!!!!:                       !!!!!!!!!!!!!!!!!!!!!!                                             \n"
                + "                !!!!!!!!!!!!!                       :!!!!!!!!!!!!!!!!!!!!!:                                             \n"
                + "               .::::::::::::     ..                 ::::::::::::::::::::::                                              \n"
                + "               ::::::::::::: .::::::::.            ::::::::::::::::::::::.              ....                            \n"
                + "               ::::::::::::::::::::::::.          .:::::::::::::::::::::.          .:::::::::::::                       \n"
                + "               :::::::::::::::::::::::::         .:::::::::::::::::::::         .:::::::::::::::::::.                   \n"
                + "               :::::::::::::::::::::::::         ::::::::::::::::::::.        .::::::::::::::::::::::::                 \n"
                + "               :::::::::::::::::::::::::        ::::::::::::::::::::         :::::::::::::::::::::::::::.               \n"
                + "               .:::::::::::::::::::::::.       :::::::::::::::::::          ::::::::::::::::::::::::::::::              \n"
                + "                :::::::::::::::::::::::       ::::::::::::::::::.          ::::::::::::::::::::::::::::::::             \n"
                + "                ::::::::::::::::::::::       .::::::::::::::::.           .:::::::::::::::::::::::::::::::::.           \n"
                + "                 ::::::::::::::::::::        :::::::::::::::.             :::::::::::::::::::::::::::::::::::.          \n"
                + "                  :::::::::::::::::         :::::::::::::::               ::::::::::::::.    :::::::::::::::::.         \n"
                + "                     ::::::::::..          ::::::::::::::                 :::::::::::::::      .:::::::::::::::         \n"
                + "                                          .::::::::::::.                  .::::::::::::::       .::::::::::::::.        \n"
                + "                                          ::::::::::::                     :::::::::::::.        .::::::::::::::        \n"
                + "                                         .:::::::::::                       ::::::::::::         .::::::::::::::.       \n"
                + "                                         .::::::::::                          :::::::::.         .:::::::::::::::       \n"
                + "                                         ::::::::::                            ..::::.           ::::::::::::::::       \n"
                + "                                         :::::::::                                             .:::::::::::::::::       \n"
                + "                                         ::::::::                                           .::::::::::::::::::::       \n"
                + "                                         ::::::::                                        :::::::::::::::::::::::.       \n"
                + "                   ..:::::::.            ::::::::                                   ..::::::::::::::::::::::::::        \n"
                + "                .::::::::::::::          .:::::::.                               .:::::::::::::::::::::::::::::         \n"
                + "              ::::::::::::::::::.         ::::::::                             .:::::::::::::::::::::::::::::.          \n"
                + "            :::::::::::::::::::::.         ::::::::.                          :::::::::::::::::::::::::::::             \n"
                + "          .:::::::::::::::::::::::          :::::::::                        .::::::::::::...:::::::::...               \n"
                + "         ::::::::::::....:::::::::           .:::::::::::.                   :::::::::.                                 \n"
                + "        ::::::::::.       .:::::::             .:::::::.                     .:::::::                                   \n"
                + "       .::::::::.         .::::::.                                            .::::::                                   \n"
                + "       ::::::::.          :::::::                                              .::::::                                  \n"
                + "       ::::::::          :::::::                         ..:::::::::::.           ....                                  \n"
                + "       .:::::::.        :::::::.                       .:::::::::::::::.                                                \n"
                + "        .:::::::::     :::::::.                      ::::::::::::::::::.                                                \n"
                + "           .....      .::::::.                     .:::::::::::::::::::.                                                \n"
                + "                      ::::::.                     .:::::::::::::::::::.                                                 \n"
                + "                      .:::::                     .::::::::::::::::::::                                                  \n"
                + "                       :::::.                    .::::::::::::::::::.                                                   \n"
                + "                         ..::.   ..              .::::::::::::::::.                                                     \n"
                + "                             .::::::              :::::::::::::..                                                       \n"
                + "                            .:::::::               .:::::::..                                                           \n"
                + "                            ::::::::                                                                                    \n"
                + "                            ::::::.                                                                                     \n"
                + "                             ...                                                                                        \n"
                + "                                                                                                                        \n");
        System.out.println("Bem vindo ao jogo 'A Charada', " + nome + "\n \nO jogo acontece no espaço do Senac, no qual você irá ter interações com o espaço da Universidade.\n");
        System.out.println("Será apresentado charadas a você, os seus resultados irão definir o seu futuro. \nDica: usufrua do espaço, para interagir melhor com o jogo \n \n");
        
        do {
            System.out.println("----- MENU ----- \n");
            System.out.println("Digite 1 para jogar");
            System.out.println("Digite 2 para ver as instruções");
            System.out.println("Digite 3 para ver os Créditos");
            System.out.println("Digite 4 para sair \n");

            System.out.println("Digite um numero: ");
            int entrada = input.nextInt();
            System.out.println("");

            switch (entrada) {
                case 1:
                    System.out.println(nome + " é um aluno desinteressado nos estudos, até que um dia sua familia resolve cobra-lo para começar a estudar.");
                    System.out.println("Avisaram o " + nome + ", caso ele seja reprovado irá sofrer consequências.");
                    System.out.println("Diante deste cenário, " + nome + " se encontra em uma situação horrível, pois já estamos na reta final e as provas já se passaram.");
                    System.out.println(nome + " vai para o SENAC correndo para tentar uma salvação, chegando la se encontra com um de seus professores na biblioteca,");
                    System.out.println(nome + " explica seu caso para o professor e o mesmo dá uma solução inusitada para o aluno(a)");
                    System.out.println("O professor fã de charadas, dá um livro com uma sequência de charadas, caso " + nome + " conseguir responder todas corretamente, o professor hackeia o sistema do SENAC e aprova o aluno\n");
                    System.out.println(nome + " passa a noite toda estudando o livro e volta no dia seguinte para tentar resolver as charadas.");
                    System.out.println("Chegando ao SENAC você abre o livro na primeira charada:\n \n ");

                    String resposta;
                    int contador = 1;
                    do {
                       
                        System.out.println("   |Fica dentro de um pequeno espaço, entretanto seu tamanho tende ao infinito,");
                        System.out.println("   |mas nada é ao acaso, precisa ser preparado, treinado e exercitado.");
                        System.out.println("   |Do que estamos falando ? \n \n");
                        
                        System.out.println("Para responder a charada você pode escolher: ");
                        System.out.println("*Dica: use o espaço do SENAC \n");
                        System.out.println("Digite 1 para ir a Entrada");
                        System.out.println("Digite 2 para ir a Biblioteca");
                        System.out.println("Digite 3 para ir ao Predio1");
                        System.out.println("Digite 4 para ir ao CentroEsportivo");
                        System.out.println("Digite 5 para ir a Lanchonete");
                        System.out.println("Digite 6 para responder a charada \n");
                        System.out.println("Digite um numero:");
                        int alter = input.nextInt();
                        System.out.println(" ");

                        switch (alter) {

                            case 1:
                                cenarios.entrada();
                                break;
                            case 2:
                                cenarios.biblioteca(args);
                                break;
                            case 3:
                                cenarios.predio1(args);
                                break;
                            case 4:
                                cenarios.centroEsportivo(args);
                                break;
                            case 5:
                                cenarios.lanchonete(args);
                                break;
                            case 6:
                                System.out.println("Digite sua resposta: ");
                                resposta = input.next();
                                if (resposta.toLowerCase().equals("mente")) {
                                    System.out.println("Resposta correta, você irá ser direcionado a próxima charada\n");
                                    contador++;
                                    break;
                                } else {
                                    System.out.println("Resposta errada!");
                                }
                            default:
                                 System.out.println("Opção Inválida\n");
                                 break;
                            
                        }
                    }while (contador == 1);
                    
                    do{
                        System.out.println("   |Durante o dia sou visto no mar");
                        System.out.println("   |a noite sobre o luar,");
                        System.out.println("   |ninguem consegue me alcançar, ");
                        System.out.println("   |se você nasceu entre fevereiro e março,");
                        System.out.println("   |contigo posso estar ");
                        System.out.println("   |vários vem antes de mim ");
                        System.out.println("   |mas no fim sempre estou lá. \n");
                        System.out.println("   |Quem sou ? \n\n");
                        
                        
                        System.out.println("Para responder a charada você pode escolher: ");
                        System.out.println("*Dica: use o espaço do SENAC \n");
                        System.out.println("Digite 1 para ir a Entrada");
                        System.out.println("Digite 2 para ir a Biblioteca");
                        System.out.println("Digite 3 para ir ao Predio1");
                        System.out.println("Digite 4 para ir ao CentroEsportivo");
                        System.out.println("Digite 5 para ir a Lanchonete");
                        System.out.println("Digite 6 para responder a charada \n");
                        System.out.println("Digite um numero:");
                        int alter = input.nextInt();
                        System.out.println("");

                        switch (alter) {

                            case 1:
                                cenarios.entrada();
                                break;
                            case 2:
                                cenarios.biblioteca(args);
                                break;
                            case 3:
                                cenarios.predio1(args);
                                break;
                            case 4:
                                cenarios.centroEsportivo(args);
                                break;
                            case 5:
                                cenarios.lanchonete(args);
                                break;
                            case 6:
                                System.out.println("Digite sua resposta: ");
                                resposta = input.next();
                                if (resposta.toLowerCase().equals("peixes")) {
                                    System.out.println("Resposta correta, você irá ser direcionado a próxima charada\n");
                                    contador++;
                                    break;
                                } else {
                                    System.out.println("Resposta errada!");
                                }
                            default:
                                 System.out.println("Opção Inválida\n");
                                 break;
                        }
                    }while(contador == 2);
                    
                    do{
                        System.out.println("   |Sou um só, pórem posso me revelar em três pessoas consubstanciais, ");
                        System.out.println("   |expressões ou hipóstases. As três pessoas são distintas, ");
                        System.out.println("   |mas são uma substância, essência ou natureza. ");
                        System.out.println("   |Do que estamos falando ? \n \n");
                        
                        System.out.println("Para responder a charada você pode escolher:");
                        System.out.println("*Dica: use o espaço do SENAC \n");
                        System.out.println("Digite 1 para ir a Entrada");
                        System.out.println("Digite 2 para ir a Biblioteca");
                        System.out.println("Digite 3 para ir ao Predio1");
                        System.out.println("Digite 4 para ir ao CentroEsportivo");
                        System.out.println("Digite 5 para ir a Lanchonete");
                        System.out.println("Digite 6 para responder a charada \n");
                        System.out.println("Digite um numero:");
                        int alter = input.nextInt();
                        System.out.println("");

                        switch (alter) {

                            case 1:
                                cenarios.entrada();
                                break;
                            case 2:
                                cenarios.biblioteca(args);
                                break;
                            case 3:
                                cenarios.predio1(args);
                                break;
                            case 4:
                                cenarios.centroEsportivo(args);
                                break;
                            case 5:
                                cenarios.lanchonete(args);
                                break;
                            case 6:
                                System.out.println("Digite sua resposta:");
                                resposta = input.next();
                                if (resposta.toLowerCase().equals("deus")) {
                                    System.out.println("Resposta correta, você irá ser direcionado a próxima charada");
                                    contador++;
                                    break;
                                } else {
                                    System.out.println("Resposta errada!");
                                }
                            default:
                                 System.out.println("Opção Inválida\n");
                                 break;  
                             
                        }
                    }while(contador == 3);
                    
                    do{
                        System.out.println("   |Tem uma capivara no centro esportivo... ");
                        System.out.println("   |Qual o nome dela? \n\n");
                        
                        System.out.println("Para responder a charada você pode escolher:");
                         System.out.println("*Dica: use o espaço do SENAC \n");
                        System.out.println("Digite 1 para ir a Entrada");
                        System.out.println("Digite 2 para ir a Biblioteca");
                        System.out.println("Digite 3 para ir ao Predio1");
                        System.out.println("Digite 4 para ir ao CentroEsportivo");
                        System.out.println("Digite 5 para ir a Lanchonete");
                        System.out.println("Digite 6 para responder a charada \n");
                        System.out.println("Digite um numero:");
                        int alter = input.nextInt();
                        System.out.println("");

                        switch (alter) {

                            case 1:
                                cenarios.entrada();
                                break;
                            case 2:
                                cenarios.biblioteca(args);
                                break;
                            case 3:
                                cenarios.predio1(args);
                                break;
                            case 4:
                                cenarios.centroEsportivo(args);
                                break;
                            case 5:
                                cenarios.lanchonete(args);
                                break;
                            case 6:
                                System.out.println("Digite sua resposta:");
                                resposta = input.next();
                                if (resposta.toLowerCase().equals("kapiva")) {
                                    
                                    contador++;
                                    break;
                                } else {
                                    System.out.println("Resposta errada!");
                                }
                                
                            default:
                                 System.out.println("Opção Inválida\n");
                                 break;
                        }
                    }while(contador == 4);
                    
                    System.out.println("Parabéns você conseguiu concluir todas charadas!");
                    System.out.println("Agora você está aprovado e dá 'orgulho' para sua familia\n");
                    
                    break;
                    
                    
                    
                    
                   
                case 2:
                    System.out.println("--------------- Como jogar \"A charada\" ---------------\n" +
"\n" +
"1 - Aproveite o máximo de todos ambientes para obter dicas!\n" +
"\n" +
"2 - Coloque em pratica seu raciocinio lógico.\n" +
"\n" +
"3 - Preste atenção em cada detalhe, pois vai fazer diferença.\n" +
"\n" +
"4 - Todos nossos cenarios foram pesquisados diretamente dentro do Centro universitario Senac.\n" +
"\n" +
"5 - As respostas podem ser escritas em maiúsculo ou minúsculo \n");
                    break;   
                    
                case 3:
                    System.out.println("Idealizado e Desenvolvido por : Alesandro da Rocha; Augusto Brito; Brenno Lima e Deive Oliveira.\n");
                    System.out.println("Alunos do Curso: Análise e Desenvolvimento de Sistemas.\n");
                    break;
                    
                case 4:
                    System.out.println("Até mais!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida\n");
                    break;    
            }   
        } while (true);
    }
}
