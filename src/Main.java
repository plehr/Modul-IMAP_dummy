
	
import java.util.List;



public class Main {
	
	public static void main(String[] args) {
		
		start();
	}


	public static void start() {
		System.out.println("test");
		IMAP mail = new IMAP();
		mail.start("imap.server.tld", "user@host", "passwrd");
		
		List<String> von = mail.getAusgabearray_von();
		List<String> datum = mail.getAusgabearray_datum();
		List<String> betreff = mail.getAusgabearray_betreff();

		
		int AnzahlDS = betreff.size();
		if (AnzahlDS == 0){
			System.out.println("Keine neuen Mails");
		} else {
		System.out.println("--------------- AUSGABE DER UNGELESENEN MAILS ---------------");
		AnzahlDS--;
		while (AnzahlDS != -1) {
			System.out.println("Nummer: " + (AnzahlDS+1));
			System.out.println("Von: " + von.get(AnzahlDS));
			System.out.println("Datum: " + datum.get(AnzahlDS));
			System.out.println("Betreff: " + betreff.get(AnzahlDS));
			System.out.println("");
			AnzahlDS--;
		}
		
		}System.exit(0);
	}
}
