package codigo;

import java.io.File;

public class Principal {
    public static void main(String[] args){
     String ruta = "D:/UNDAC/VII Semestre/Diseño de Lenguaje de Programación/AnalizadorLexico2/src/codigo/Lexer.flex";
     generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
     File archivo = new File(ruta);
     JFlex.Main.generate(archivo);
    }
    
}
