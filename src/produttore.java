

public class produttore extends Thread{
	
	Coda c;
	
	public produttore(Coda coda, String n) {
		c = coda;
		this.start();
		this.setName(n);
	}
	
	public void run() {
		while(true) {
			try {
				c.setElemento((int) (Math.random()*100));
				System.out.println("sono " + this.getName()+ "   ho salvato un elemento in coda");
				this.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
