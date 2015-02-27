import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
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
    private HashMap<String, String> mapResponse;
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

        mapResponse = new HashMap<>();
        mapResponse.put("hola","hola, que tal estas");
        mapResponse.put("bien","me alegro");
        mapResponse.put("mal","que problema tienes");
        mapResponse.put("adios","no te marches");
    }

    /**
     * Generate a response.
     * @return A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> value)
    {
        String response = null;
        
        if(!value.isEmpty()){
            //busqueda de las palabras introducidas entre las claves de posibles respuestas
         for (String palabra : value){
             if( mapResponse.containsKey(palabra)){
                 response = mapResponse.get(palabra);
                 break;
                }
         }
        }
        
        //si el texto introducido por el usuario esta vacio genera una respuesta aleatoria
        if(response == null)
        {
            response = listResponse.get(random.nextInt(listResponse.size()));
        }
       
        return response;
    }

}

