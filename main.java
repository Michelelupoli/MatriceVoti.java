/* Inserire un vettore contenente il nome di 20 alunni
 * Inserire una matrice contenente i voti di 10 materie degli alunni
 * Stampare gli alunni che hanno una valutazione >= 6 nella terza materia */

import java.io.*;
public class MatriceVoti {
	public static void main (String args[])
	{
		//Inpostazione standard input
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		//Dichiarazione variabili
		final int alunno = 20, riga = 20, colonna = 10, materia = 10;
		String materie[] = new String[materia];
		String alunni[] = new String[alunno];
		int voti[][] = new int[riga][colonna];
		int i,j;
		
		//Inserimento alunni nel vettore
		System.out.println("Registrazione alunni: ");
		for (i=0; i<alunno; i++)
		{
			System.out.print("Inserisci alunno n. "+i+": ");
			try {
				alunni[i] = tastiera.readLine();
				}
			catch (Exception e)
			{
				System.out.println("Il valore inserito non è valido! ");
				i--;
			}
		}
		
		//Inserimento materie nel vettore
		System.out.println("Registrazione discipline ");
		for (i=0; i<materia; i++)
		{
			System.out.print("Inserisci disciplina n. "+i+": ");
			try {
					materie[i] = tastiera.readLine();
				}
			catch (Exception e)
			{
				System.out.println("Il valore inserito non è valido! ");
			}
		}
		
		//Inserimento voti nella matrice
		System.out.println("Registrazione valutazioni ");
		for (i=0; i<riga; i++)
		{
			System.out.println("Stai inserendo i voti di "+"'"+alunni[i]+"'");
			for (j=0; j<colonna; j++)
			{
				do {
				System.out.print("Inserire valutazione nella disciplina "+"'"+materie[j]+"'"+": ");
				try {
						String numeroLetto = tastiera.readLine();
						voti[i][j] = Integer.valueOf(numeroLetto).intValue();
					}
				catch (Exception e)
				{
					System.out.println("Il valore inserito non è valido! ");
					i--;
				}
				if (voti[i][j] > 10)
					System.out.println("Inserisci un valore compreso tra 0 e 10!");
				}
				while (voti[i][j] >10);
			}
		}
		
		//Calcolo e stampa alunni che hanno una valutazione >= 6 nella terza materia
		System.out.println("Gli alunni con valutazione >= a 6 nella materia "+"'"+materie[3]+"'"+" sono: ");
		for (i=0; i<riga; i++)
		{
			for (j=0; j<colonna; j++)
			{
				if (j == 3)
				if (voti[i][j] >= 6)
				{
					System.out.println("Alunno: "+"'"+alunni[i]+"'"+"      Valutazione: "+"'"+voti[i][j]+"'");
					j = colonna;
				}
			}
		}
		return;
	}
}
