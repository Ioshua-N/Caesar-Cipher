import java.util.Scanner;

public class Encrypter
{
    public static void main(String[] args)
    {
        //variables
        String openText;
        int key;
        String encryptedText = "";
        Scanner scanner = new Scanner(System.in);
        int asciiCode;

        //Get open text and convert to upper case
        System.out.print("Insert the text to be encrypted: ");
        openText = scanner.nextLine().toUpperCase();

        //Get the key of the cipher
        System.out.print("Insert the key: ");
        key = scanner.nextInt();

        //Iterate through every letter of the open text
        for(int i = 0; i < openText.length(); i++)
        {
            //test if it's a letter
            if((int) openText.charAt(i) > 64 && (int) openText.charAt(i) < 91)
            {
                //get ascii value
                asciiCode = (int) openText.charAt(i);
                asciiCode += key;

                //test if the ascii code exceeds the z ascii value
                if (asciiCode > 90)
                {
                    //go back to a ascii value
                    asciiCode -= 26;
                }
                encryptedText += (char) asciiCode;
            }
            //test if isn't a letter
            else
            {
                //don't encrypt if isn't a letter
                encryptedText += openText.charAt(i);
            }
        }

        //Show the encrypted text
        System.out.print("Encrypted text: " + encryptedText);
    }
}
