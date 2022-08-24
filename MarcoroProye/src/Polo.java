import java.util.ArrayList;
import java.util.List;
public class Polo {


    //Marco Roca .:Campus UPB SCZ:. 55995
//Método Recursivo para recorrer mi lista
    private List<Integer> recorrer(int cont, List<Integer> lista){
        if(cont<lista.size()){
            //En caso de que el número No es Impar
            if(lista.get(cont)%2==0){
                lista.remove(cont);
                recorrer(0,lista);
            }
            recorrer(cont+1,lista);
        }
        return lista;
    }
    //Método público es Impar
    public  List<Integer> esImpar1(List<Integer> lista){
        recorrer(0,lista);
        return lista;
    }
    //Segunda version utilizando ArrayList.removeIf
    public  List<Integer> esImpar2(List<Integer> lista){
        for(int i=0;i<lista.size();i++) {
            lista.removeIf(num -> (num%2==0));
        }
        return lista;
    }

    public static void main(String[] args) {
    Polo polo = new Polo();
    ArrayList<Integer> lis= new ArrayList<>();
        lis.add(12);
        lis.add(10);
        lis.add(1);
        lis.add(4);
        lis.add(1);
        System.out.println("HOLA");
        System.out.println("HOLA");
        System.out.println("HOLA");
        System.out.println (polo.esImpar1(lis));
        System.out.println( polo.esImpar2(lis));
    }
}


