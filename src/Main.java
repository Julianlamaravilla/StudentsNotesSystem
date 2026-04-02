import java.lang.reflect.Array;
import  java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // initialized a Scanner class object
    Scanner s = new Scanner(System.in);
    double number = 0.0;

    // Method to verify correct value of number
    public double addToArray(int i){
        System.out.println("Enter note " + (i+1)  + " between [1-7] : ");
        number = s.nextDouble();
        if (number >= 1 && number <= 7){
            return number;
        } else {
            System.out.println("the number has to be between [1-7], please select a correct value : ");
            return  addToArray(i);
        }
    }

    public static void main(String[] args) {


        Main m = new Main();
        double greater5 = 0.0;
        double less4 = 0.0;
        int equal1 = 0, greater = 0, less = 0;
        double average = 0.0;


        /*Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

          Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

          Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
          */

        ArrayList<Double> array = new ArrayList<>();


        // get 20 notes
        for(int i = 0; i < 20;i++){
            array.add(m.addToArray(i));
        }

        // print average with notes greater than 5
        for(int i = 0; i < 20;i++){
            if(array.get(i) > 5.0){
                greater5 += array.get(i);
                greater += 1;
            } else if(array.get(i) < 4){
                less4 += array.get(i);
                less += 1;
                if (array.get(i) == 1){
                    equal1 += 1;
                }
            }
            average += array.get(i);
        }

        //print result
        System.out.println("Average greater than 5 : " + (greater5/greater) );
        System.out.println("Average less than 4 : " + (less4/less));
        System.out.println("Notes equal to 1 : " + equal1);
        System.out.println("General Average : " + (average/array.size()));
    }
}