

//Realizzare un sistema con un produttore e un consumatore
//Tutta la sincronizzazione viene fatta nella coda (da realizzare)
//Per la sincronizzazione si usano wait e notify

public class main {
	public static void main(String[] args) {
		int count = 5;
		Coda c = new Coda(count);
		for(int i=0; i<count; i++) {
			consumatore c1 = new consumatore(c, "consumatore:"+i);
			produttore p1 = new produttore(c, "produttore:"+i);
		}
	}
}
