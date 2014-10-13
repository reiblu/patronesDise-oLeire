package editor;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    
    private final Map<String,Caracter> caracteres = new HashMap<String, Caracter>();
    
    public Caracter get(char c){
        if (caracteres.containsKey(c)){
            return caracteres.get(c);
        } else {
            Caracter a = new Caracter(c);
            caracteres.put(Character.toString(c), a);
            return a;
        }
    }

    public static FactoriaCaracter getFactoria() {
        // TODO Auto-generated method stub
        return null;
    }

}
