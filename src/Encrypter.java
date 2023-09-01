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

        //Get open text
        System.out.print("Insert the text to be encrypted: ");
        openText = scanner.nextLine().toUpperCase();

        //Get the key of the cipher
        System.out.print("Insert the key: ");
        key = scanner.nextInt();

        //Pass the key through every letter
        for(int i = 0; i < openText.length(); i++)
        {
            if((int) openText.charAt(i) > 64 && (int) openText.charAt(i) < 91)
            {
                asciiCode = (int) openText.charAt(i);
                asciiCode += key;
                if (asciiCode > 90)
                {
                    asciiCode -= 26;
                }
                encryptedText += (char) asciiCode;
            }
            else
            {
                encryptedText += openText.charAt(i);
            }
        }

        //Show the encrypted text
        System.out.print("Encrypted text: " + encryptedText);
    }
}
