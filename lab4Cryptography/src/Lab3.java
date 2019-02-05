import javax.swing.*;

public class Lab3
{
    public static void main(String[] args) {



        String plaintext = JOptionPane.showInputDialog(null,"Please enter your message to be encrypted: ");
        String offsetAsString = JOptionPane.showInputDialog(null,"What is your selected offset?");
        int offset = Integer.parseInt(offsetAsString);


        System.out.println(encryptCaeserCipher(plaintext, offset));
    }



    public static String encryptCaeserCipher(String plaintext, int offset)

    {
        String cipherText="";

        System.out.println("This is plaintext: " + plaintext);

        int chNum = plaintext.charAt(0);
        System.out.println(chNum);
        int counter = 0;
        //convert the charAt(index) to a string value, add the offset and concatenate it to an empty string for each position to encrypt


        while (counter<plaintext.length())
        {

            char holdAscii = plaintext.charAt(counter);         //takes the letter at position x and stores it in a placeholder

            int holdAsciiAsInt = (int) holdAscii;               //converts the char to an int

            holdAsciiAsInt = holdAsciiAsInt + offset ;          //adds the offset to the char value

            holdAscii = (char) holdAsciiAsInt;

            String holdChar = Character.toString(holdAscii);    //changes it back to a string to allow it to be printed as letters
            cipherText += holdChar;                             //concatenates the held char to the cipherText
            counter++;                                          //increments the counter/index
        }

        System.out.println(cipherText);                         //prints out the cipher text

        return cipherText;
    }
}
