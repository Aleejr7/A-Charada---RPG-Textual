
package charada;

import java.util.Scanner;

public class jogo_textual {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String  nome;
        System.out.println("'A Charada'. Um jogo RPG Textual.");
        System.out.println("Idealizado e Desenvolvido por : Alesandro da Rocha; Augusto Brito; Brenno Lima e Deive Oliveira. Alunos do Curso Analise e Desenvolvimento de Sistemas.");
        System.out.println("Digite o nome do personagem: ");
        nome = input.next();
        System.out.println("Bem vindo ao jogo " + nome + "\n O jogo acontece no espaço do Senac, do qual você irá ter interações com o espaço da Universidade.");
        System.out.println("Será apresentado charadas a você, os seus resultados irão definir o seu futuro. \nDica: usufrua do espaço, para interagir com o jogo");
        
        System.out.println("----- MENU -----");
        System.out.println("Digite 1 para jogar");
        System.out.println("Digite 2 para rever as instruções");

    }
    
}
