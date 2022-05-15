/*
Cenários que serão utilizado durante o jogo
 */
package charada;

import java.util.Scanner;

public class cenarios {

    static void entrada() {
        System.out.println("Você está na entrada do Senac, esta é vista 360º do local");
        System.out.println("\nA sua direita você tem o Estacionamento e uma grande árvore, com alguns bancos embaixo");
        System.out.println("A sua esquerda você tem a grande bliblioteca do senac e a obra de Elisa Bracher.");
        System.out.println("Uma obra de arte que consite em quatro troncos de árvore; a mesma não há um titulo, diante disso a denominamos como 'MUTIlADOS' ");
        System.out.println("Na sua frente se encontra uma placa, a qual faz referência ao 'Abram Szajman'. Mais a frente está a entrada para o prédio 1 ");
    }

    
    
    static void biblioteca(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a Bliblioteca, bom estudos");
        System.out.println("Descrição da bliblioteca :");
        System.out.println("Na entrada temos a obra 'GINASTA SENTADO'");
        System.out.println("sicronizar com o GINASTA SENTADO?");
        System.out.println("Caso desejese sicronizar digite: 1\nCaso não desejese digite qualquer outro número\n");
        int resposta1 = input.nextInt();

        if (resposta1 <= 1 && resposta1 > 0) {
            System.out.println(/*descrever a obra*/);

        } else {
            System.out.println("Ok, vamos coninuar.");
        }

        System.out.println("A direita temos a recepção, lemre-se de passar por lá caso deseje levar um livro para casa");
        System.out.println("Vem, vamos entrar");
        System.out.println("Olha ao seu redor, aqui temos um ambiente de estudo, com diversos computadores para você fazer seus trabalhos");
        System.out.println("Além de diverso puff, sofa, e cadeiras para vc relachar enquanto estuda");
        System.out.println("Vou te mostrar um lugar bem interessante, principalmente se você for fã de HQs");
        System.out.println("Vem (:");
        System.out.println("Olha esse lugar, qauntos HQs (:");
        System.out.println("Olha esse poster do Superman, uouu maior que você");
        System.out.println("Sicronizar com o Poster ?");
        System.out.println("Caso desejese sicroniza digite: 1\nCaso não desejese digite qualquer outro número\n");
        int resposta2 = input.nextInt();

        if (resposta2 <= 1 && resposta2 > 0) {
            System.out.println("E ae campeão, dia puxado não é msm");
            System.out.println("Continue assim, você esta dando seu melhor este é o segredo, não desista");
            System.out.println(/*dica para resolver uma charada */);
            System.out.println("Lembre-se o segredo do sucesso é a perseverança \n");
            System.out.println("Muito bem, vamos seguir em frente");
        } else {
            System.out.println("Muito bem, vamos em frente então");
        }

        //Segundo anadr podemos colocar 
        System.out.println("Deseja ir para o segundo andar da bliblioteca?");
        System.out.println("Digite 1 - para ir ao segundo andar.\nCaso não queira deigite qualquer outro número");
        int resposta3 = input.nextInt();

        if (resposta3 <= 1 && resposta3 > 0) {
            System.out.println("Bem aqui no segundo andar ficam os livros");
            System.out.println("Temos uma imensa variedade de livros, é so você entrar nesses corredores e escolher o seu livro");
            System.out.println("Eu sei que há muitos corredores ");
            System.out.println("Mas vc pode se localizar por essas plaquinhas que há inicio de cada corredor");

            System.out.println("Olhe para cima");
            System.out.println("Gigante não é mesmo?");
            System.out.println("Essa é a Vesica\nProvavelmente você ja ouvi falarsobre isso");

            System.out.println("Sicronizar com a Vesica?");
            System.out.println("Caso desejese sicroniza digite: 1\nCaso não desejese digite qualquer outro número");
            int resposta4 = input.nextInt();

            if (resposta4 <= 1 && resposta4 > 0) {
                System.out.println(/*Descrever o que estar na placa da vesica*/);
            } else {
                System.out.println("Muito bem, vamos em frente");
            }

        } else {
            System.out.println("Ok, muito bom ver você por aqui\nVamos nós econtrar muito por aqui ");
            System.out.println("Volte sempre");
            // else realacionado a opção dele subir para o segundo andar

        }

    }
}
