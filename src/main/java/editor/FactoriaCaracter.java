package editor;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    
    private static FactoriaCaracter factoria;
    private final Map<Character,Caracter> caracteres = new HashMap<Character, Caracter>();
    
    private FactoriaCaracter(){
        
    }
    
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
        if(FactoriaCaracter.factoria==null){
            FactoriaCaracter.factoria = new FactoriaCaracter();
        }
        return FactoriaCaracter.factoria;
    }

}
