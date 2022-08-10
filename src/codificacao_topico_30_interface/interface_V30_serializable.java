package codificacao_topico_30_interface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

public class interface_V30_serializable {

	public static void main(String[] args) {
		/*
		 * A serializa��o resume-se em salvar, gravar, capturar o estado de um objeto. Ou seja, tenho um objeto de uma classe e quero salvar seu estado: uso
		 * serializa��o pois, quando quiser us�-lo com seu �ltimo estado gravado, � somente des-serializ�-lo.
		 * Mas por que usar isso?
		 * Usar serializa��o permite que voc� crie o objeto ou uma vari�vel de inst�ncia de uma classe e grave em um arquivo para, futuramente, utilizar esse 
		 * objeto/vari�vel com seu estado que foi gravado.
		 * 
		 * Lembre-se: quando o construtor � executado, os valores s�o perdidos, objeto = null, e os tipos primitivos recebem seus valores padr�es. Com a serializa��o, um
		 * objeto ou uma vari�vel de inst�ncia tem o valor gravado (em um arquivo), armazenado e futuramente posso obter esse valor atrav�s da des-serializa��o.
		 */		
		
		Cat c = new Cat();
		// aqui vou serializar meu objeto da class cat
		try {
			FileOutputStream fo = new FileOutputStream("test.ser");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(c); // serializo objeto cat
			oo.close();
			System.out.println("Class Cat - object serializado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// des-serializo o objeto
		try {
			FileInputStream fi = new FileInputStream("test.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);
			c = (Cat) oi.readObject();
			oi.close();
			System.out.println("agora ele foi des-serializado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
