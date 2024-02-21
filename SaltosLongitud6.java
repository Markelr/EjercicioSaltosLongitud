public class SaltosLongitud6 {
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

        for (int i = 0; i < saltos.length; i++) {
            double mejorSalto1 = -1;
            double mejorSalto2 = -1;
            double mejorSalto3 = -1;

            for (int j = 0; j < saltos[i].length; j++) {
                double salto = saltos[i][j];

                if (salto > mejorSalto1) {
                    mejorSalto3 = mejorSalto2;
                    mejorSalto2 = mejorSalto1;
                    mejorSalto1 = salto;
                } else if (salto > mejorSalto2) {
                    mejorSalto3 = mejorSalto2;
                    mejorSalto2 = salto;
                } else if (salto > mejorSalto3) {
                    mejorSalto3 = salto;
                }
            }

            System.out.println("Atleta " + (i + 1) + ": Podium - [" + mejorSalto1 + ", " + mejorSalto2 + ", " + mejorSalto3 + "]");
        }
    }
}