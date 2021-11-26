//Nathan Godoy Tavares
import java.util.ArrayList;
public class ListaCartas {
        private ArrayList<Integer> listaCarta;
        public ListaCartas(){
                listaCarta = new ArrayList<Integer>();
        }
        public void addCarta(int CartaA) {
            boolean dif = false;
            if(listaCarta.isEmpty()){
                listaCarta.add(CartaA);
            }
            for (int i = 0; i < listaCarta.size(); i++){
                if(CartaA != listaCarta.get(i)){
                    dif = true;
                } else{
                    dif = false;
                    break;
                }
            }
            if(dif == true){
                listaCarta.add(CartaA);
            }
        }
        public ArrayList<Integer> getListaCarta() {
                return listaCarta;
        }
        public int trocaCartas(ArrayList<Integer> CartaBe){
                int contadorA = 0;
                int contadorB = 0;
                int contador = 0;
                boolean dif = false;
                for(int i = 0; i<listaCarta.size(); i++){
                        for(int j = 0; j<CartaBe.size(); j++){
                            if(listaCarta.get(i).equals(CartaBe.get(j))){
                                dif = false;
                                break;
                            } else{
                                dif = true;
                            }
                        }
                    if(dif == true){
                        contadorA = contadorA +1;
                    }
                }
            for(int i = 0; i<CartaBe.size(); i++){
                for(int j = 0; j<listaCarta.size(); j++){
                    if(CartaBe.get(i).equals(listaCarta.get(j))){
                        dif = false;
                        break;
                    } else{
                        dif = true;
                    }
                }
                if(dif == true){
                    contadorB = contadorB +1;
                }
            }
            if(contadorA < contadorB) {
                contador = contadorA;
            } else{
                contador = contadorB;
            }
            return contador;
        }
}
