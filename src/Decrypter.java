import java.util.Scanner;

public class Decrypter
{
    public static void main(String[] args)
    {
        //variables
        Scanner scanner =  new Scanner(System.in);
        String encryptedText;
        String openText = "";
        int key;
        int asciiCode;

        //get encrypted text and convert to upper case
        System.out.print("Insert the encrypted text: ");
        encryptedText = scanner.nextLine().toUpperCase();

        //get the cipher key
        System.out.print("Insert the key: ");
        key = scanner.nextInt();

        //iterate through the encrypted text
        for(int i = 0; i < encryptedText.length(); i++)
        {
            //test if it's a letter
            if(encryptedText.charAt(i) > 64 && encryptedText.charAt(i) < 91)
            {
                //get the ascii value of the letter and subtract the key
                asciiCode = (int) encryptedText.charAt(i);
                asciiCode -= key;

                //test if ascii code it's smaller than a ascii code
                if (asciiCode < 65)
                {
                    //go back to z
                    asciiCode += 26;
                    openText += (char) asciiCode;
                } 
                else
                {
                    openText += (char) asciiCode;
                }
            }
            else
            {
                //don't decrypt if isn't a letter
                openText += encryptedText.charAt(i);
            }
        }
        //show the open text
        System.out.print("Unencrypted text: " + openText);
    }
}
