import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NomePessoasOrder {
    public static void main (String[] args){
        TreeMap<Integer , String> lista = new TreeMap<>();
        lista.put(01, "Lucas");
        lista.put(02 , "Pedro");
        lista.put(03, "Matheus");
        lista.put(04 , "Gabriel");
        lista.put(05 , "João");

        List<Map.Entry<Integer ,String>> lis =new ArrayList<>(lista.entrySet());
        lis.sort(Map.Entry.comparingByValue());
        lis.forEach(System.out::println);







    }
}
