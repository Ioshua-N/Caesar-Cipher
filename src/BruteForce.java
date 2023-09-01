import java.util.Scanner;

public class BruteForce
{
    public static void main(String[] args)
    {
        // Variables
        Scanner scanner = new Scanner (System.in);
        String openText = "";

        // Get the encrypted text
        System.out.print("Insert the encrypted text: ");
        String encryptedText = scanner.nextLine();

        //iterate through the alphabet
        for (int i = 0; i < 26; i++)
        {
            //iterate through the encrypted text
            for (int i2 = 0; i2 < encryptedText.length(); i2++)
            {
                //add the letter to the open text using i key
                openText += (char) ((int) encryptedText.charAt(i2) - i) ;
            }
            // show open text using i key and the key
            System.out.print("Open text: " + openText + "\n");
            System.out.print("Key: " + i + "\n\n");

            // reset the open text
            openText = "";
        }
    }
}
