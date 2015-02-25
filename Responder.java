import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
    private ArrayList<String> listResponse;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        listResponse = new ArrayList<>();
        listResponse.add("mensage 0");  
        listResponse.add("mensage 1"); 
        listResponse.add("mensage 2"); 
        listResponse.add("mensage 3"); 
       
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return listResponse.get(random.nextInt(listResponse.size())) ;
    }
}
