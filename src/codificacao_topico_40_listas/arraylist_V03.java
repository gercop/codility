package codificacao_topico_40_listas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Curso {

    private String nome;
    
    private String instrutor;
    
    /*	Repare que, em vez de declararmos a refer�ncia a uma ArrayList<Aula> (ou LinkedList<Aula>), deixamos mais gen�rico, utilizando 
     * 	a interface List. Por qu�? Pelo motivo que j� vimos ao estudar orienta��o a objetos aqui no Alura: n�o temos motivo para ser 
     *  super espec�fico na inst�ncia que iremos usar. Se for�armos ArrayList na refer�ncia, certamente teremos problema o dia que 
     *  precisarmos trocar essa lista. Se declararmos apenas como List, poderemos mudar de implementa��o, como para uma LinkedList, 
     *  sem problema algum de compila��o, por n�o termos nos comprometido com uma implementa��o em espec�fico. Fique tranquilo se 
     *  voc� ainda n�o est� convencido dessas vantagens. Com tempo de programa��o e de pr�tica em orienta��o a objetos isso ficar� 
     *  mais claro.
     * */
    private List<Aula> aulas = new LinkedList<Aula>();    
    /*
     * Ent�o qual � a diferen�a? Basicamente performance. O ArrayList, como diz o nome, internamente usa um array para guardar os elementos. 
     * Ele consegue fazer opera��es de maneira muito eficiente, como invocar o m�todo get(indice). Se voc� precisa pegar o d�cimo quinto elemento, 
     * ele te devolver� isso bem r�pido. Quando um ArrayList � lento? Quando voc� for, por exemplo, inserir um novo elemento na primeira posi��o. 
     * Pois a implementa��o vai precisar mover todos os elementos que est�o no come�o da lista para a pr�xima posi��o. Se h� muitos elementos, 
     * isso vai demorar... Em computa��o, chamamos isso de consumo de tempo linear.

	   J� o LinkedList possui uma grande vantagem aqui. Ele utiliza a estrutura de dados chamada lista ligada, e � bastante r�pido para adicionar 
	   e remover elementos na cabe�a da lista, isto �, na primeira posi��o. Mas � lento se voc� precisar acessar um determinado elemento, pois a 
	   implementa��o precisar� percorrer todos os elementos at� chegar ao d�cimo quinto, por exemplo.

	   Confuso? N�o tem problema. Sabe o que � interessante? Voc� n�o precisa tomar essa decis�o desde j� e oficializar para sempre. Como utilizamos 
	   a refer�ncia a List, comprometendo-nos pouco, podemos sempre mudar a implementa��o, isso �, em quem damos new, caso percebamos que � melhor 
	   uma ou outra lista nesse caso em particular.
     */

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
}

public class arraylist_V03 {

	/*
	 * https://www.alura.com.br/conteudo/java-collections?gclid=EAIaIQobChMI-piphtDw9wIV6UVIAB2dJQiUEAAYASAAEgKrrvD_BwE
	 */
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        //N�o vai funcionar, pois colocamos Collections.unmodifiableList(aulas)
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        System.out.println(aulas);
        
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
        System.out.println(aulas);
	}

}
