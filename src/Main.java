public class Fila {

    private static Fila instancia;
}
    public  static  Fila getInstance()
    {
        if (instancia == null) {
            instancia = new Fila();
        }
        return  instancia;
    }

    private Fila() {
    }

    public static void ImprimeDocumento(){

        }
public static void RemoveDocumento(){

        }
public static void RemoveTodosDocumentos() {
}
