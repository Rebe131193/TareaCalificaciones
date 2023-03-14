import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        //Instancia de cuenta de banco
        ResultadosExamen resultados = new ResultadosExamen();
        Map resultados_finales = new HashMap();
        resultados.getCalificacionesOriginales().forEach((llave,valor) -> {
                    if (resultados.getCalificacionesRegularizacion().containsKey(llave)) {
                        int calificacion_2 = (int) resultados.getCalificacionesRegularizacion().get(llave);
                        if (calificacion_2 > (int) valor) {
                            resultados_finales.put(llave, calificacion_2);
                        } else {
                            resultados_finales.put(llave, valor);
                        }
                    } else {resultados_finales.put(llave, valor);}
                }
        );
        resultados_finales.forEach((llave,valor) -> {
            System.out.println("Estudiante: "+ llave +". Calificación Final: "+ valor);
        });

    }
}
