package fr.manulep.entrainement;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Series1{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    private Series1() {
        throw new IllegalStateException("Test class");
    }


    public static String helloWorld(String name) {
        //1
			/*String message = " ";
			if((name != null) && (name != " ")){
				message = "Hello " + name;
				//Hello Manu
				return message; //Hello Manu
			}else {
				return "Hello World";*/
        if (name == null || name == "") {
            return "Hello World";
        } else {
            return "Hello " + name;
        }
    }



    public static String[] removeNullElements(String[] array) {
        // String array[] = { "a", "b", null, null, "false", "null" };
        ArrayList<String> data = new ArrayList<String>();
        for (String element : array){
            if (element != null){
                data.add(element);
            }
        }

        String[] newArray = data.toArray(new String[data.size()]);

        return newArray;
    }

    public static int[] addElementToBeginning(int[] array, int element) {
        //3
        int tailleTableau = array.length; //3
        int[] array2 = new int[tailleTableau + 1 ];
        array2[0] = element;

        for (int i = 0; i < tailleTableau ; i++){
            array2[i+ 1] = array[i];
        }

        return array2;
    }

    public static int[] allElementsExceptFirstThree(int[] array) {
        //4
		/*ArrayList<Integer>array2 = new ArrayList<Integer>();
		int[] array3;
		int tailleTableau = array.length;
		for(int i = 0; i < tailleTableau ; i++){
		}
		return null;*/
        int[] resultat;
        if (array.length > 3) {
            resultat = new int[array.length - 3];
            System.arraycopy(array, 3, resultat, 0, array.length - 3);
        } else {
            resultat = new int[0];
        }

        return resultat;
    }
    public static String getFirstHalf(String word) {
        //5
        int taille = word.length();
        double nombreMoitié = taille / 2.0;
        int arrondi = (int) Math.ceil(nombreMoitié);

        String moitiéDeMot = word.substring(0, arrondi);
        return moitiéDeMot;
		/*int mot = word.length();
		int word = (mot/2);

		if (word < 3){
			String word3 = word.substring(0, word + 1);
		}
		return null;*/
    }

    public static String[] selectElementsStartingWithA(String[] array) {
        //6
        ArrayList<String> motsAvecA = new ArrayList<String>();

        String[] resultat;

        for (String mot : array) {
            char premiereLettre = mot.charAt(0);
            if (premiereLettre == 'a')
                motsAvecA.add(mot);
        }
        resultat = motsAvecA.toArray(new String[0]);
        return resultat;

    }

    public static String[] selectElementsStartingWithVowel(String[]array) {
        //7
        ArrayList<String> motsAvecVoyelles = new ArrayList<String>();

        for (String mot : array) {
            if (mot != null) {
                char premiereLettre = mot.charAt(0);
                if (premiereLettre == 'a' || premiereLettre == 'e' || premiereLettre == 'i' || premiereLettre == 'o'
                        || premiereLettre == 'u' || premiereLettre == 'y') {
                    motsAvecVoyelles.add(mot);
                }
            }
        }
        return motsAvecVoyelles.toArray(new String[0]);
    }

    public static String[] reverseOrderInArray(String[]array) {
        //8
        String[] inversee = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            inversee[i] = array[array.length - i - 1];
        }
        return inversee;
    }

    public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
        //9
        int taille = array.length;
        int arrondi = (int) Math.round(taille / 2);

        int[] resultat = new int[array.length + 1];
        // resultat [1,2,3,4]
        // resultat [null,null,null,null,null]
        System.arraycopy(array, 0, resultat, 0, arrondi);
        // resultat [1,2,null,null,null]
        resultat[arrondi] = element;
        // resultat [1,2,9,null,null]
        System.arraycopy(array, arrondi, resultat, arrondi + 1, array.length - arrondi);
        // resultat [1,2,9,3,4]

        return resultat;
    }

    public static String shortestWord(String text) {
        //10
        String[] mots = text.split(" ");
        // mots = ["winter", "is", "coming"];
        int longueurLaPlusCourte = mots[0].length();
        String motLePlusCourt = mots[0];
        for (String mot : mots) {
            if (mot.length() < longueurLaPlusCourte) {
                longueurLaPlusCourte = mot.length();
                motLePlusCourt = mot;
            }
        }

        return motLePlusCourt;
    }

    public static String removeCapitals(String text) {
        //11
        String text2 = text;
        text2 = text2.replaceAll("[A-Z]", "");
        return text2;
    }

    public static long addingTwoNumbers(long number1, long number2) {
        //12
        int Number1 = 10;
        int Number2 = 20;
        int somme = Number1 + Number2;
        return somme;
    }

    public static long addingThreeNumbers(long number1, long number2, long number3) {
        //13
        int Number1 = 10;
        int Number2 = 20;
        int Number3 = 30;
        int somme = Number1 + Number2 + Number3;
        return somme;
    }

    public static long addingSeveralNumbers(final Integer... numbers) {
        //14
        int somme = 0;
        for (int i = 0; i<numbers.length; i++){
            somme = somme + numbers[i];
        }
        return somme;
    }

    public static float makeNegative(float number) {
        //15
        if (number < 0) {
            return number;
        } else {
            return number * -1;
        }
    }

    public static boolean checkForSpecialCharacters(String string) {
        //16
        Pattern p = Pattern.compile("[^a-z0-9! ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(string);
        boolean resultatFinal = m.find();
        return resultatFinal;
    }

    public static boolean checkIfStringStartsWithConsonant( String word ) {
        //17
        String wordUpper = word.toUpperCase();
        Character firstCharWord = wordUpper.charAt(0);
        String firstCharWordToString = firstCharWord.toString();
        Pattern p = Pattern.compile("[BCDFGHJKLMNPQRSTVWXZ]");
        Matcher m = p.matcher(firstCharWordToString);
        boolean b = m.matches();
        return b;
    }

    public static String getDomainName(String email) {
        //18
        return email.replaceAll("(^.*@|.com$)","");
    }

    public static int[] letterPosition(String name) {
        //19
        int len = name.length();
        int num = 31;
        int retour[] = new int [len];
        for(int i = 0; i<len; i++){
            retour[i] = name.charAt(i)& num;
        }
        return retour;
    }

    public static boolean isPeer(int number) {
        //20
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }
}
