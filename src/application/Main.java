package application;
	
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		IMAP mail = new IMAP();
		mail.start("imap.server.tld", "user@host.de", "passwd");
		
		List<String> von = mail.getAusgabearray_von();
		List<String> datum = mail.getAusgabearray_datum();
		List<String> betreff = mail.getAusgabearray_betreff();
		List<String> text = mail.getAusgabearray_inhalt();

		
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
			System.out.println("Text:" + text.get(AnzahlDS));
			
			AnzahlDS--;
		}
		
		}System.exit(0);
	}
}
