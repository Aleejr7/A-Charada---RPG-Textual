
package charada;

import java.util.Scanner;

public class jogo_textual {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String  nome;
        System.out.println("'A Charada'. Um jogo RPG Textual.");
        System.out.println("Digite o nome do personagem: ");
        nome = input.next();
        System.out.println("                 .:::!!!!!!!!!!::                                                           \n" +
"                                       .:!!!!!!!!!!!!!!!!!!!!!!!:                                                       \n" +
"                                   .:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                                    \n" +
"                                .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                                  \n" +
"                              :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                 \n" +
"                            :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                               \n" +
"                          .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                               \n" +
"                        .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!:                                              \n" +
"                       :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                             \n" +
"                     .:!!!!!!!!!!!!!!!!!!!!::..:!!!!!!!!!!!!!!!!!!!!!!!!!!:                                             \n" +
"                    .!!!!!!!!!!!!!!!!:.           .!!!!!!!!!!!!!!!!!!!!!!!!                                             \n" +
"                   :!!!!!!!!!!!!!!!:                :!!!!!!!!!!!!!!!!!!!!!!.                                            \n" +
"                  :!!!!!!!!!!!!!!:                   !!!!!!!!!!!!!!!!!!!!!!:                                            \n" +
"                 .!!!!!!!!!!!!!:.                    !!!!!!!!!!!!!!!!!!!!!!:                                            \n" +
"                .!!!!!!!!!!!!!:                      !!!!!!!!!!!!!!!!!!!!!!.                                            \n" +
"                :!!!!!!!!!!!!:                       !!!!!!!!!!!!!!!!!!!!!!                                             \n" +
"                !!!!!!!!!!!!!                       :!!!!!!!!!!!!!!!!!!!!!:                                             \n" +
"               .::::::::::::     ..                 ::::::::::::::::::::::                                              \n" +
"               ::::::::::::: .::::::::.            ::::::::::::::::::::::.              ....                            \n" +
"               ::::::::::::::::::::::::.          .:::::::::::::::::::::.          .:::::::::::::                       \n" +
"               :::::::::::::::::::::::::         .:::::::::::::::::::::         .:::::::::::::::::::.                   \n" +
"               :::::::::::::::::::::::::         ::::::::::::::::::::.        .::::::::::::::::::::::::                 \n" +
"               :::::::::::::::::::::::::        ::::::::::::::::::::         :::::::::::::::::::::::::::.               \n" +
"               .:::::::::::::::::::::::.       :::::::::::::::::::          ::::::::::::::::::::::::::::::              \n" +
"                :::::::::::::::::::::::       ::::::::::::::::::.          ::::::::::::::::::::::::::::::::             \n" +
"                ::::::::::::::::::::::       .::::::::::::::::.           .:::::::::::::::::::::::::::::::::.           \n" +
"                 ::::::::::::::::::::        :::::::::::::::.             :::::::::::::::::::::::::::::::::::.          \n" +
"                  :::::::::::::::::         :::::::::::::::               ::::::::::::::.    :::::::::::::::::.         \n" +
"                     ::::::::::..          ::::::::::::::                 :::::::::::::::      .:::::::::::::::         \n" +
"                                          .::::::::::::.                  .::::::::::::::       .::::::::::::::.        \n" +
"                                          ::::::::::::                     :::::::::::::.        .::::::::::::::        \n" +
"                                         .:::::::::::                       ::::::::::::         .::::::::::::::.       \n" +
"                                         .::::::::::                          :::::::::.         .:::::::::::::::       \n" +
"                                         ::::::::::                            ..::::.           ::::::::::::::::       \n" +
"                                         :::::::::                                             .:::::::::::::::::       \n" +
"                                         ::::::::                                           .::::::::::::::::::::       \n" +
"                                         ::::::::                                        :::::::::::::::::::::::.       \n" +
"                   ..:::::::.            ::::::::                                   ..::::::::::::::::::::::::::        \n" +
"                .::::::::::::::          .:::::::.                               .:::::::::::::::::::::::::::::         \n" +
"              ::::::::::::::::::.         ::::::::                             .:::::::::::::::::::::::::::::.          \n" +
"            :::::::::::::::::::::.         ::::::::.                          :::::::::::::::::::::::::::::             \n" +
"          .:::::::::::::::::::::::          :::::::::                        .::::::::::::...:::::::::...               \n" +
"         ::::::::::::....:::::::::           .:::::::::::.                   :::::::::.                                 \n" +
"        ::::::::::.       .:::::::             .:::::::.                     .:::::::                                   \n" +
"       .::::::::.         .::::::.                                            .::::::                                   \n" +
"       ::::::::.          :::::::                                              .::::::                                  \n" +
"       ::::::::          :::::::                         ..:::::::::::.           ....                                  \n" +
"       .:::::::.        :::::::.                       .:::::::::::::::.                                                \n" +
"        .:::::::::     :::::::.                      ::::::::::::::::::.                                                \n" +
"           .....      .::::::.                     .:::::::::::::::::::.                                                \n" +
"                      ::::::.                     .:::::::::::::::::::.                                                 \n" +
"                      .:::::                     .::::::::::::::::::::                                                  \n" +
"                       :::::.                    .::::::::::::::::::.                                                   \n" +
"                         ..::.   ..              .::::::::::::::::.                                                     \n" +
"                             .::::::              :::::::::::::..                                                       \n" +
"                            .:::::::               .:::::::..                                                           \n" +
"                            ::::::::                                                                                    \n" +
"                            ::::::.                                                                                     \n" +
"                             ...                                                                                        \n" +
"                                                                                                                        ");
        System.out.println("Bem vindo ao jogo 'A Charada'" + nome + "\n O jogo acontece no espaço do Senac, no qual você irá ter interações com o espaço da Universidade.");
        System.out.println("Será apresentado charadas a você, os seus resultados irão definir o seu futuro. \nDica: usufrua do espaço, para interagir com o jogo");
        do{
        System.out.println("----- MENU -----");
        System.out.println("Digite 1 para jogar");
        System.out.println("Digite 2 para rever as instruções");
        System.out.println("Digite 3 para ver os Créditos");
        System.out.println("Digite 5 para sair ");
        
        System.out.println("Digite um numero: ");
        int entrada = input.nextInt();
        
        switch (entrada) {
            case 1:
                System.out.println(nome+" era um aluno vagabundo que não estuda e não ligava para nada, até que um dia a familia do(a)"+nome+" resolveu cobrar ele para ele começar a estudar.\n");
                System.out.println("Deram a condição de ou "+nome+" estudava ou iria sair de casa.\n");   
                System.out.println("Diante deste cenário, "+nome+" resolve voltar a estudar, porém já estamos no final do ano e as provas já se passaram,\n");
                System.out.println(nome+" vai para o senac correndo para tentar uma salvação, chegando no senac "+nome+" encontra o professor Fernando tsuda na biblioteca,\n");
                System.out.println(nome+" explica seu caso para o professor e o professor dá uma solução inusitada para o aluno(a)\n");
                System.out.println("O professor dá um livro com uma sequência de charadas, se o(a) "+nome+" conseguir responder todas as charadas, o professor hackeia o senac e passa o mesmo\n");
                System.out.println(nome+" passa a noite toda estudando o livro e volta no dia seguinte para tentar resolver as charadas\n");
                System.out.println("Chegando na entrada do senac você pega a primeira charada:\n ");
                //a partir daqui vamos ter que joga essa parte do case 1 em alguma função, para o codigo não ficar um livro.
                do{
                System.out.println("Primeira charada");
                System.out.println("Para responder a charada você pode escolher:");
                System.out.println("Digite 1 para ir para a Portaria");
                System.out.println("Digite 2 para ir para a Biblioteca");
                System.out.println("Digite 3 para ir para o Centro esportivo");
                System.out.println("Digite 4 para ir para o Estacionamento");
                System.out.println("Digite 5 para responder a charada");
                
                System.out.println("Digite um numero:");
                int alter = input.nextInt();
                
                int respo;
                
                switch(alter){
                    case 1:
                        System.out.println("Portaria do senac");
                        System.out.println("Você da um 360º e vê:");
                        System.out.println("A sua esquerda: ");
                        System.out.println("A sua direita: ");
                        System.out.println("A sua frente: ");
                        System.out.println("Na sua costas: ");
                        break;
                    case 2:
                        System.out.println("Biblioteca");
                        System.out.println("Você da um 360º e vê:");
                        System.out.println("A sua esquerda: ");
                        System.out.println("A sua direita: ");
                        System.out.println("A sua frente: ");
                        System.out.println("Na sua costas: ");
                        break;
                    case 3:
                        System.out.println("Centro esportivo");
                        System.out.println("Você da um 360º e vê:");
                        System.out.println("A sua esquerda: ");
                        System.out.println("A sua direita: ");
                        System.out.println("A sua frente: ");
                        System.out.println("Na sua costas: ");
                        break;
                    case 4:
                        System.out.println("Estacionamento");
                        System.out.println("Você da um 360º e vê:");
                        System.out.println("A sua esquerda: ");
                        System.out.println("A sua direita: ");
                        System.out.println("A sua frente: ");
                        System.out.println("Na sua costas: ");
                        break;
                    case 5:
                        System.out.println("Resposta da charada colocada pelo jogador");    
                }
                }while(true);//Aqui dentro do "()" ao inves de está true, vai está a resposta certa do case 5 que vai liberar a proxima charada     
                
            case 2:
                
                System.out.println("Intruções:");
                
            case 3:
                
                System.out.println("Idealizado e Desenvolvido por : Alesandro da Rocha; Augusto Brito; Brenno Lima e Deive Oliveira. Alunos do Curso Analise e Desenvolvimento de Sistemas.");
                
            case 4:
                
                System.exit(0);
        }
        }while(true);    
    }
    
}
