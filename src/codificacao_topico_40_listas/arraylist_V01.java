package codificacao_topico_40_listas;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_V01 {

	/*
	 * Referência: https://www.alura.com.br/conteudo/java-collections?gclid=EAIaIQobChMI-piphtDw9wIV6UVIAB2dJQiUEAAYASAAEgKrrvD_BwE
	 */
	public static void main(String[] args) {
		
		String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        

        System.out.println(aulas);
        
        aulas.remove(0);
        System.out.println();
        System.out.println(aulas);
        
        System.out.println();
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        
        System.out.println();
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
        
        System.out.println();
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula : " + aulas.get(i));
        }
        
        /*
         * Uma outra forma de percorrer nossa lista é utilizando as sintaxes e métodos novos incluídos no Java 8. 
         * Temos um método (não um comando!) agora que se chama forEach. Ele recebe um objeto do tipo Consumer, 
         * mas o interessante é que você não precisa criá-lo, você pode utilizar uma sintaxe bem mais enxuta, 
         * mas talvez assustadora a primeira vista, chamada lambda.
         */
        System.out.println();
        aulas.forEach(aula -> {
            System.out.print("Percorrendo: ");
            System.out.println(aula);
        });
        
        aulas.add(aula1);
        Collections.sort(aulas);
        System.out.println();
        aulas.forEach(aula -> {
            System.out.print("Percorrendo: ");
            System.out.println(aula);
        });
	}
}
