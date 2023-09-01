package Rep1;

import javax.lang.model.element.NestingKind;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String [] args) {
        String navn, adresse;
        navn = "Per Hansen";
        adresse = "Osloveien 82";

        String postadresse = "Oslo";
        String postnr = "0256";
        System.out.println("Navnet er : "+navn);
        System.out.println("Adressen er : "+adresse);
        System.out.println("Poststed "+postnr+ " "+postadresse);

        String innNavn = showInputDialog("Skriv inn ditt navn");
        String innAdresse = showInputDialog("Skriv inn din adresse");

        showMessageDialog(null, "Navnet : "+innNavn+" \nAdresse : "+innAdresse);

    }
}
