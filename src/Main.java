import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarar sense definició
        int [] notes;
        //Declarar i assignar longitud
        float [] scoring = new float [5];

        //Declarar i definir el valor de l'array
        String [] pelis = {"Interestellar","Lord of the Rings","Star Wars"};

        System.out.println(pelis[2]);

        //Modificar valor d'un array
        pelis[1] = "El Padrino";
        System.out.println(pelis[1]);

        System.out.println("Array pelis té longitud:" + pelis.length);

        for(int i = 0; i<pelis.length; i++){
            System.out.println(pelis[i]);


        }
    }
}