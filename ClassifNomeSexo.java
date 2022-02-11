import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class ClassifNomeSexo {
        public static void main(String[] args) {
                ListaNomeSexo();


        }

        private static void ListaNomeSexo() {
              List lista = new ArrayList();
              lista.add("Lucas", "M");
              lista.add("Joice", "F");
              lista.add("Rodrigo", "M");
              lista.add("Gabriela", "F");
              lista.add("Pedro", "M");
              lista.add("Ana", "F");

              String[] array = new String[2];
              array = String.split(lista);

                System.out.println(lista);








        }
}