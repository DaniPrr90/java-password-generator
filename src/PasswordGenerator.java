

public class PasswordGenerator {
    public static void main(String[] args) {
        // Dati dell'utente
        // Definisco le variabili per tipo
        String nome = "Danilo";
        String cognome = "Pirro";
        String colorePreferito = "Verde";
        int giornoNascita = 01;
        int meseNascita = 7;
        int annoNascita = 1990;

        // Calcolo la somma tra giorno, mese e anno di nascita
        int sommaData = giornoNascita + meseNascita + annoNascita;

        // ! Chiedo di generare una password concatenando le informazioni richieste e
        // separando con "-"
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaData;

        // Mando iin stampa la password generata
        System.out.println("La password generata è: " + password);
    }
}