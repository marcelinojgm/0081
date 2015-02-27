import java.util.HashSet;
import java.util.Scanner;
import java.util.HashSet;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet getInput()
    {
        System.out.print("> ");         // print prompt
        //guardado de cadena introducida sin espacios al principio y final
        String inputLine = reader.nextLine().trim();

        //separacion por palabras de la cadena 
        String[] imput =  inputLine.split(" ");
        HashSet<String> palabras = new HashSet<>();

        for (int i = 0; i< imput.length ; i++){
            String palabra = imput[i];
            if(palabra != "")
            {
                palabras.add(palabra); 
            }
        }
        //retorna hashSet con las palabras que ha introducido el usuario
        return palabras;
    }
}
