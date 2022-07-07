

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Coda {
	//classe monitor
	
	BlockingQueue<Integer> c;
	int size;
	
	public int getElemento() throws InterruptedException { //ritorna elemento 
		int ritorno = c.take(); //va salvato dentro una variabile temporanea perchè se si sveglia priuma il thread non sto facendo un operazione atomica e quindi due thread operano sulla stessa variabile
		return ritorno;
	}
	
	public void setElemento(int elemento) throws InterruptedException {
		c.put(elemento);
	}
	
	public Coda(int grandezza) {
		c = new ArrayBlockingQueue<Integer>(grandezza);
		size = grandezza;
	}
}
  