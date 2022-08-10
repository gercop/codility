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
		 * A serialização resume-se em salvar, gravar, capturar o estado de um objeto. Ou seja, tenho um objeto de uma classe e quero salvar seu estado: uso
		 * serialização pois, quando quiser usá-lo com seu último estado gravado, é somente des-serializá-lo.
		 * Mas por que usar isso?
		 * Usar serialização permite que você crie o objeto ou uma variável de instância de uma classe e grave em um arquivo para, futuramente, utilizar esse 
		 * objeto/variável com seu estado que foi gravado.
		 * 
		 * Lembre-se: quando o construtor é executado, os valores são perdidos, objeto = null, e os tipos primitivos recebem seus valores padrões. Com a serialização, um
		 * objeto ou uma variável de instância tem o valor gravado (em um arquivo), armazenado e futuramente posso obter esse valor através da des-serialização.
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
