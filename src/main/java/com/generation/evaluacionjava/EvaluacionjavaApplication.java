package com.generation.evaluacionjava;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvaluacionjavaApplication {


//---------------------- Funciones ------------------------------------------------------------------

//Crear una función para ingresar la nota de cada estudiante y obtener el promedio de cada estudiante.

public static Double promedioNota(ArrayList<Double>notaAlumno){
	Double sumaNotas = 0.0;
	for (int i = 0; i < notaAlumno.size(); i++){
	sumaNotas += notaAlumno.get(i);
	}
	return sumaNotas/notaAlumno.size();
}

//Crear un Array que me permita guardar una cierta cantidad de alumno por cada curso y luego los muestre.


//Crear una función que muestre la mejor nota, la peor nota y el promedio de notas.

public static void promedioPeorMejorNota(ArrayList<Double> notaAlumno){
	Double peorNota = 0.0;
	Double mejorNota = 7.0;
	Double promedio = promedioNota(notaAlumno);

for(int i =0; i < notaAlumno.size(); i++){
	if(notaAlumno.get(i) > mejorNota){
	mejorNota = notaAlumno.get(i);
	}
	if(notaAlumno.get(i) < peorNota){
	peorNota = notaAlumno.get(i);
    }
}

System.out.println("\nEl alumno tiene un promedio " + promedio);
System.out.println("su peor nota fue (" + peorNota + ") y la mejor nota del alumno fue (" + mejorNota + ")");
}




	public static void main(String[] args) {


		
//---------------------- EJERCICIO Caso práctico -------------------------------------------------------------------

/*Te contactaron desde un colegio municipal para que los ayudes a generar un software
pensando en ordenar su funcionamiento, este colegio siempre a funcionado de manera análoga
por 20 años y esto ha generado errores de pérdidas de datos de alumnos antiguos,
documentos estropeados y nula posibilidad de generar estadísticas de rendimiento del colegio.
En esta instancia tu tarea será generar los objetos necesarios para cubrir las necesidades del
colegio, utilizando herencia.
Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del
colegio
Puntos a considerar:

● El colegio cuenta con distintos cursos, profesores, materias y alumnos
● Se debe crear una función que permita al profesor ingresar notas por estudiante y que
luego permita obtener el promedio de cada estudiante.
● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
alumnos por curso y que luego los muestre.
● Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor
nota y el promedio de notas.*/



/*- 1ro debo crear una función que permita ingresar 
    la nota de cada estudiante y obtener el promedio de cada uno.
    luego debo guardar en un array una cierta cantidad de alumnos para que después me los muestre.
    crear una función que muestre la mejor nota, la peor nota y el promedio de notas.
    Crear el objeto profesor(nombre, id, asignatura asignada), asignatura(nombre, horario), Curso (nombre del curso, cantidad de alumno) */


Scanner teclado = new Scanner(System.in);

System.out.println



	}
}
