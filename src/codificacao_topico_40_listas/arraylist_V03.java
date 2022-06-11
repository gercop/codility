package codificacao_topico_40_listas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Curso {

    private String nome;
    
    private String instrutor;
    
    /*	Repare que, em vez de declararmos a referência a uma ArrayList<Aula> (ou LinkedList<Aula>), deixamos mais genérico, utilizando 
     * 	a interface List. Por quê? Pelo motivo que já vimos ao estudar orientação a objetos aqui no Alura: não temos motivo para ser 
     *  super específico na instância que iremos usar. Se forçarmos ArrayList na referência, certamente teremos problema o dia que 
     *  precisarmos trocar essa lista. Se declararmos apenas como List, poderemos mudar de implementação, como para uma LinkedList, 
     *  sem problema algum de compilação, por não termos nos comprometido com uma implementação em específico. Fique tranquilo se 
     *  você ainda não está convencido dessas vantagens. Com tempo de programação e de prática em orientação a objetos isso ficará 
     *  mais claro.
     * */
    private List<Aula> aulas = new LinkedList<Aula>();    
    /*
     * Então qual é a diferença? Basicamente performance. O ArrayList, como diz o nome, internamente usa um array para guardar os elementos. 
     * Ele consegue fazer operações de maneira muito eficiente, como invocar o método get(indice). Se você precisa pegar o décimo quinto elemento, 
     * ele te devolverá isso bem rápido. Quando um ArrayList é lento? Quando você for, por exemplo, inserir um novo elemento na primeira posição. 
     * Pois a implementação vai precisar mover todos os elementos que estão no começo da lista para a próxima posição. Se há muitos elementos, 
     * isso vai demorar... Em computação, chamamos isso de consumo de tempo linear.

	   Já o LinkedList possui uma grande vantagem aqui. Ele utiliza a estrutura de dados chamada lista ligada, e é bastante rápido para adicionar 
	   e remover elementos na cabeça da lista, isto é, na primeira posição. Mas é lento se você precisar acessar um determinado elemento, pois a 
	   implementação precisará percorrer todos os elementos até chegar ao décimo quinto, por exemplo.

	   Confuso? Não tem problema. Sabe o que é interessante? Você não precisa tomar essa decisão desde já e oficializar para sempre. Como utilizamos 
	   a referência a List, comprometendo-nos pouco, podemos sempre mudar a implementação, isso é, em quem damos new, caso percebamos que é melhor 
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
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        //Não vai funcionar, pois colocamos Collections.unmodifiableList(aulas)
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        System.out.println(aulas);
        
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        System.out.println(aulas);
	}

}
