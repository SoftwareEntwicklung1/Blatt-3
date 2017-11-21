import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadStringsmitVerdopplung {
    


    public static String[] readStrings() { 
            String[] a = new String[5];
            int i = 0;
            int j = 1;
//Fall: leere Eingabe
            if(StdIn.isEmpty()) {
			    a[0]="";
                i++;
		    }   

            while (!StdIn.isEmpty()) {

// Wenn aktuelles Array voll, wird neues mit doppelter Größe erstellt
                if ( i == j * 5) {
                    int b = ( j * 2) * 5;
                    String[] ar = new String[b];
                    for (int k = 0; k < j * 5; k++) {
                        ar[k] = a[k];
                    }
                    j++;
                    a = ar;
                    
                }
                a[i]=StdIn.readString();
                i++;                
            }

//Kopiert alles in Array passender Größe
            String[] array = new String[i];

            for (int l = 0; l < i; l++) {
                array[l] = a[l];
            }

    return array;


    }

    public static void main (String[] args) {
        String[] b = ReadStringsmitVerdopplung.readStrings();
		System.out.println(Arrays.toString(b));
    }


}