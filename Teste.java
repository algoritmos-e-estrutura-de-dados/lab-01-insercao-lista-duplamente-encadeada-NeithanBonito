//Nathan Godoy Tavares
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int carta;
        int opcao = 0;
    ArrayList<Integer> a = new ArrayList<>();
    a.add(1);
        ListaCartas listaCartasA = new ListaCartas();
        ListaCartas listaCartasB = new ListaCartas();
        while(opcao !=9){
            System.out.println("1-Inserir cartas Alice");
            System.out.println("2-Inserir cartas Betty");
            System.out.println("3-Retornar cartas");
            System.out.println("4-Quantas trocas podem ser realizadas?");
                opcao = teclado.nextInt(); teclado.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Qual o número da carta?");
                        carta = teclado.nextInt();
                    listaCartasA.addCarta(carta);
                    break;
                case 2:
                    System.out.println("Qual o número da carta?");
                        carta = teclado.nextInt();
                    listaCartasB.addCarta(carta);
                    break;
                case 3:
                    System.out.println("Alice: " + listaCartasA.getListaCarta());
                    System.out.println("Betty: " + listaCartasB.getListaCarta());
                    break;
                case 4:
                    System.out.println(listaCartasA.trocaCartas(listaCartasB.getListaCarta()));
            }
        }
    }
}
