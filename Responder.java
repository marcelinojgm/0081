import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
    private HashMap<HashSet<String>, String> mapResponse;
    private ArrayList<String> listResponse;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        generateRandomResponse();

        mapResponse = new HashMap<>();

        HashSet<String> conjunto1 = conjuntoPalabras("free,app");
        mapResponse.put(conjunto1,"no tenemos app gratuitas");

        HashSet<String> conjunto1a = conjuntoPalabras("app");
        mapResponse.put(conjunto1a,"sobre que app");

        HashSet<String> conjunto1b = conjuntoPalabras("free");
        mapResponse.put(conjunto1b,"is free!!!!");

        HashSet<String> conjunto2 = conjuntoPalabras("crash,linux,problem");
        mapResponse.put(conjunto2,"contacte con nuestro servicio tecnico tlf: 555-1-22212-22");

        HashSet<String> conjunto2a = conjuntoPalabras("crash");
        mapResponse.put(conjunto2a,"ha roto algo?");

        HashSet<String> conjunto2b = conjuntoPalabras("linux");
        mapResponse.put(conjunto2b,"GNU/Linux es el kernel libre similar a Unix ");

        HashSet<String> conjunto2c = conjuntoPalabras("problem");
        mapResponse.put(conjunto2c,"describame su problema");

    
    }
    /**
     * genera respuestas aleatorias y las guarda en listResponse
     */
    private void generateRandomResponse(){

        listResponse = new ArrayList<>();
        listResponse.add("mensage 0");  
        listResponse.add("mensage 1"); 
        listResponse.add("mensage 2"); 
        listResponse.add("mensage 3"); 

    }

    /**
     * retorna el conjunto de palabras de una cadena de caracteres pasada de palabras pasadas por comas
     * @param cadena palabras que se desean incluir separadas por comas
     * @return retorna conjunto de palabras
     */

    private HashSet<String> conjuntoPalabras(String cadena){
        HashSet<String> conjunto = new HashSet<>();
        //separamos las palabras por comas
        String[] palabras = cadena.split(",");
        //añadimos las palabras al conjunto
        for(int i=0; i < palabras.length; i++){
            conjunto.add(palabras[i]);
        }
        return conjunto;
    }

    /**
     * Generate a response.
     * @return A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> value)
    {
        String response = null;
        
        response = mapResponse.get(value);
        
        //si el texto introducido por el usuario esta vacio genera una respuesta aleatoria
        if(response == null)
        { 
            if(listResponse.size() > 0){
                response = listResponse.remove(random.nextInt(listResponse.size()));
            }
            else{
                response = "no entiendo su pregunta";
            }
        }

        return response;
    }

}

