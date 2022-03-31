package at.campus02.zamss22.pr1.uebungsBeispiele3;

public class GrossBuchstaben {
    public static void main(String[] args) {
// create a string
        String message = "i hop that i understood this";

        // stores each character to char array
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {
            // if the array element is a letter
            if (Character.isLetter(charArray[i])) {
                // check space is present beforethe letter
                if (foundSpace) {
                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                //if the new character is not character
                foundSpace = true;
            }
        }
        message = String.valueOf(charArray);
        System.out.println(message);


    }

}