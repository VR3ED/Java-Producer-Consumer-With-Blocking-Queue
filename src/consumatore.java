

public class consumatore extends Thread{
	
	Coda c;
	
	public consumatore(Coda coda, String n) {
		c = coda;
		this.start();
		this.setName(n);
	}
	
	public void run() {
		while(true) {
			try {
				int ele = c.getElemento();
				System.out.println("sono: " + this.getName() + "   elemento: " + ele);
				this.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
