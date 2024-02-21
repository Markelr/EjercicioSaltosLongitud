public class SaltosLongitud{
    public static void main(String[] args) {
        double[][] saltos = {
            {6.80, 7.12, 0.00, 7.95, 0.00, 8.05},
            {7.50, 7.20, 7.85, 0.00, 7.22, 8.10},
            {7.02, 0.00, 7.90, 7.25, 8.01, 0.00},
            {0.00, 7.15, 7.78, 8.15, 7.20, 0.00},
            {7.35, 7.50, 0.00, 8.25, 0.00, 7.95},
            {0.00, 7.80, 7.10, 8.00, 7.60, 7.20},
            {7.00, 7.30, 0.00, 7.40, 8.10, 7.22},
            {7.85, 7.40, 0.00, 7.95, 0.00, 7.98},
            {7.20, 7.70, 7.30, 8.05, 7.10, 0.00},
            {0.00, 7.90, 8.23, 7.80, 0.00, 7.85}
        };

        // Imprimir los datos de los saltos
        for (int i = 0; i < 10; i++) {
            System.out.print("Saltador " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(saltos[i][j] + " ");
            }
            System.out.println();
        }
 

        int indiceGanador = 0;
		// Imprimir los datos de los saltos
        for (int i = 0; i < 10; i++) {
            System.out.print("Saltador " + (i + 1) + ": ");
            
            // Variable para almacenar el puntaje total del saltador actual
            double puntajeTotalSaltador = 0;

            for (int j = 0; j < 6; j++) {
                double salto = saltos[i][j];
                puntajeTotalSaltador += salto;

                System.out.print(salto + " ");
            }

            System.out.println();

            double mejorPuntajeGlobal = 0;
			// Verificar si el puntaje total del saltador actual es mejor que el mejor puntaje global
            if (puntajeTotalSaltador > mejorPuntajeGlobal) {
                mejorPuntajeGlobal = puntajeTotalSaltador;
                indiceGanador = i;
            }
        }

        // Imprimir el índice del atleta que ha ganado
        System.out.println("Índice de atleta que ha ganado: " + (indiceGanador + 1));
}
}


