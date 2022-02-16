import java.util.Scanner;

public class A2E12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // definir variables
        boolean Con = true;
        String Sexo = "u";
        int Altura;
        int Edad;
        int SumAlMu = 0;
        int SumAlHo = 0;
        int SumaEdad = 0;
        int NumM = 0;
        int NumH = 0;
        float PromedioMujeres;
        float PromedioHombres;
        float PromedioEdad;
        int NumPer = 0;
        //hacer un ciclo para que se pueda ingresar hasta que la altura sea negativa
        while (Con) {
            System.out.println("Ingrese su Sexo F si es mujer y M si es Hombre");
            Sexo = sc.next();
            
            //comprobar si la leta coinside con la determinada
            if (Sexo.equals("f") ^ Sexo.equals("F") ^ Sexo.equals("m") ^ Sexo.equals("M")) {
                System.out.print("Ingrese su altura. ");
                Altura = sc.nextInt();

                //comprobar que la altura no sea negativa
                if (Altura > 0) {
                    System.out.print("Ingrese su edad ");
                    Edad = sc.nextInt();
                    //separar si es hombre o mujer 
                    if (Sexo.equals("f") ^ Sexo.equals("F")) {
                        SumAlMu = SumAlMu + Altura;
                        NumM = NumM + 1;
                    }
                    if (Sexo.equals("m") ^ Sexo.equals("M")) {
                        SumAlHo = SumAlHo + Altura;
                        NumH = NumH + 1;
                    }
                    SumaEdad = SumaEdad + Edad;
                    NumPer = NumPer + 1;

                } else {
                    System.out.println("\n\n----------------------------------");
                    System.out.println(" No se permiten alturas negativas");
                    System.out.println("----------------------------------\n\n");
                    Con = false;
                }
            } else {
                System.out.println("\n\n---------------");
                System.out.println(" valor erroneo");
                System.out.println("---------------\n\n");
            }

        }
        //para que no salga error si no se ingresa alguna persona 
        if (NumH == 0) {
            NumH = 1;
        }
        if (NumM == 0) {
            NumH = 1;
        }
        if (NumPer == 0) {
            NumPer = 1;
        }
        //hacer operaciones
        PromedioMujeres = (float) SumAlMu / NumM;
        PromedioHombres = (float) SumAlHo / NumH;
        PromedioEdad = (float) SumaEdad / NumPer;
        System.out.println("El promedio de alturas en mujeres es: " + PromedioMujeres);
        System.out.println("El promedio de alturas en hombres es: " + PromedioHombres);
        System.out.println("El promedio de edades de los participantes es: " + PromedioEdad);
    }

}
