import java.util.HashMap;
import java.util.Map;

public class ResultadosExamen {

    public static Map getCalificacionesOriginales(){
        Map calificaciones = new HashMap();
        calificaciones.put("Ana", 24);
        calificaciones.put("Daniel", 50);
        calificaciones.put("Alejandro", 79);
        calificaciones.put("Laura", 32);
        calificaciones.put("Kelly", 80);
        calificaciones.put("Ivan", 40);
        calificaciones.put("Maria", 59);
        calificaciones.put("Melanie", 55);
        calificaciones.put("Diego", 95);
        calificaciones.put("Miguel", 63);

        return calificaciones;

    }

    public static Map getCalificacionesRegularizacion(){

        Map calificaciones = new HashMap();
        calificaciones.put("Ana", 97);
        calificaciones.put("Daniel", 89);
        calificaciones.put("Alejandro", 79);
        calificaciones.put("Laura", 82);
        calificaciones.put("Kelly", 76);
        calificaciones.put("Ivan", 98);
        calificaciones.put("Maria", 80);
        calificaciones.put("Melanie", 95);
        calificaciones.put("Diego", 90);
        calificaciones.put("Miguel", 62);

        return calificaciones;
    }

    public static void main(String[] args) {

    }
}