import java.util.Scanner;

public class Decrypter
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        String encryptedText;
        String openText = "";
        int key;
        int asciiCode;

        System.out.print("Insert the encrypted text: ");
        encryptedText = scanner.nextLine().toUpperCase();

        System.out.print("Insert the key: ");
        key = scanner.nextInt();

        for(int i = 0; i < encryptedText.length(); i++)
        {
            if(encryptedText.charAt(i) > 64 && encryptedText.charAt(i) < 91)
            {
                asciiCode = (int) encryptedText.charAt(i);
                asciiCode -= key;
                if (asciiCode < 65)
                {
                    asciiCode += 26;
                    openText += (char) asciiCode;
                } else
                {
                    openText += (char) asciiCode;
                }
            }
            else
            {
                openText += encryptedText.charAt(i);
            }
        }

        System.out.print("Unencrypted text: " + openText);
    }
}
