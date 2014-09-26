/*
Lag et applikasjonsprogram som leser inn vekten til et brev i antall hele gram og som skriver ut riktig porto (p� grunnlag av portotabellen ovenfor).
Dersom brevet er for tungt, skal melding om dette skrives ut istedenfor portoen.
(Gj�r bruk av if- og/eller if-else-setninger.) */

import javax.swing.JOptionPane;


public class Oppgave4_skjul_overflodig_T_og_M
{
    public static void main( String args[] )
    {
			int timar, minutt, sekund;

		    Integer tid = Integer.parseInt(JOptionPane.showInputDialog( "Har du mange sekund � by p� idag?" ));
		    while ( tid >= 0 )
		    {
				minutt = tid / 60;
				timar = minutt / 60;
				minutt = minutt-(timar*60);
	 			sekund = tid-(timar*3600)-(minutt*60);

				String utskrift=""; // Nullstill for kvar runde i loopen.
				if(timar>0){
					utskrift = timar + " t "; // Legg til " X t" i utskrift-variabelen, kanskje
				}
				if(minutt>0){
					utskrift += minutt + " m "; // Legg til " X m" i utskrift-variabelen, kanskje
				}

				utskrift +=  sekund + " s";
     			JOptionPane.showMessageDialog(null, utskrift);
     			// Sjekk om vi skal ha ny runde, sp�r om folket har f�tt nok...
		    	tid = Integer.parseInt(JOptionPane.showInputDialog( "Kor mange sekund vil du s� oppgi? Velg negativt for � kome deg ut av denne skj�rselden..." ));
		    }
		JOptionPane.showMessageDialog(null, "Takk for alt!");
    } // slutt p� main-metoden
 } // slutt p� klassen Sammenlikning (oppgave13_minstetal)