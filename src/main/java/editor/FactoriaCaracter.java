package editor;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    
    private final Map<Character,Caracter> caracteres = new HashMap<Character, Caracter>();
    
    public Caracter get(char c){
        if (caracteres.containsKey(c)){
            return caracteres.get(c);
        } else {
            Caracter a = new Caracter(c);
            caracteres.put(c, a);
            return a;
        }
    }

    public static FactoriaCaracter getFactoria() {
        // TODO Auto-generated method stub
        return null;
    }

}
