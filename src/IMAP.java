import java.util.ArrayList;
import java.util.List;


public class IMAP {
	
	private static List<String> Ausgabearray_von = new ArrayList<String>();
	private static List<String> Ausgabearray_betreff = new ArrayList<String>();
	private static List<String> Ausgabearray_datum = new ArrayList<String>();
	
public void start(String Server, String Mail, String Passwort){
	int Zahl = 30;
	while(Zahl != 0){
	Ausgabearray_betreff.add("Betreff " + Zahl);
	Ausgabearray_datum.add(Zahl + ".05.2014");
	Ausgabearray_von.add(Zahl + "@host.de");
	Zahl--;
	}
}

public List<String> getAusgabearray_von() {
	return Ausgabearray_von;
}

public List<String> getAusgabearray_datum() {
	// TODO Auto-generated method stub
	return Ausgabearray_datum;
}

public List<String> getAusgabearray_betreff() {
	// TODO Auto-generated method stub
	return Ausgabearray_betreff;
}
}
