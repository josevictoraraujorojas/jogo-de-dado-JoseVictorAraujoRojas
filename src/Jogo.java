import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        String player1,player2;
        String resposta1,respota2;
        String jogar;
        int dado1,dado2;
        int ponto1,ponto2;

        Scanner ler = new Scanner(System.in);
        Random r = new Random();

        do {
            ponto1 = 0;
            ponto2 = 0;


            System.out.println("informe o nome do player1:");
            player1 = ler.next();
            System.out.println("bem vindo player1 " + player1);

            System.out.println("informe o nome do player2:");
            player2 = ler.next();
            System.out.println("bem vindo player2 " + player2);

            System.out.println("Este e um jogo de dados, o player que tirar o maior numero ganha 1 ponto, o jogo termina quando algum dos players tiver 11 pontos");
            System.out.println("para jogar o dado basta ecrever dado");


            while (ponto1<11 && ponto2<11)
            {
                System.out.println("jogue o dado " + player1+":");
                resposta1 = ler.next();
                while (!(resposta1.equals("dado")))
                {
                    System.out.println("resposta invalida!!");
                    System.out.println("jogue o dado " + player1+":");
                    resposta1 = ler.next();
                }
                System.out.println(player1 + " jogou o dado e deu:");
                dado1 = r.nextInt(6) + 1;
                System.out.println(dado1);

                System.out.println(" jogue o dado: " + player2+":");
                respota2 = ler.next();
                while (!(respota2.equals("dado")))
                {
                    System.out.println("resposta invalida!!");
                    System.out.println("jogue o dado " + player2+":");
                    respota2 = ler.next();
                }
                System.out.println(player2 + " jogou o dado e deu:");
                dado2 = r.nextInt(6) + 1;
                System.out.println(dado2);


                if (dado1 > dado2)
                {
                    ponto1++;
                    System.out.println(player1 + " ganhou");
                    System.out.println(player1 + " esta com: " + ponto1 + " pontos");
                } else if (dado2 > dado1)
                {
                    ponto2++;
                    System.out.println(player2 + " ganhou");
                    System.out.println(player2 + " esta com: " + ponto2 + " pontos");
                } else {
                    System.out.println("deu empate, ninguem pontuou nessa rodada");
                }

                if (ponto1 == 11) {
                    System.out.println(player1 + " ganhou!!!!!");
                } else if (ponto2 == 11) {
                    System.out.println(player2 + " ganhou!!!!!");
                }

            }

            System.out.println("Voc? quer jogar dnv? se sim digite sim, se n?o digite n?o");
            jogar = ler.next();

            while (!(jogar.equals("sim"))  && !(jogar.equals("n?o")))
            {
                System.out.println("resposta invalida!!");
                System.out.println("Voc? quer jogar dnv? se sim digite sim, se n?o digite n?o");
                jogar = ler.next();
            }

        }while(jogar.equals("sim"));
    }
}
