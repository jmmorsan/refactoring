Ejercicio 1: Paridad, signo y cuadrado de un número
Funcionalidad general:
Este programa solicita al usuario que introduzca números enteros y, mientras no sea un 0, realiza las siguientes operaciones:

Determina si el número es par o impar.
Determina si el número es positivo o negativo.
Calcula y muestra el cuadrado del número introducido.
Estructura del programa:

Un bucle do-while garantiza que el programa continúe pidiendo números hasta que el usuario introduzca un 0.
Las operaciones (paridad, signo, cuadrado) se realizan dentro del bucle y se presentan al usuario en cada iteración.
Finaliza con un mensaje de cierre.
Comentario general:
El programa es útil para practicar operaciones básicas con números enteros, condicionales y bucles. Además, enseña cómo usar un do-while para mantener un flujo continuo hasta cumplir una condición.

COMENTARIO SILVIA:
Extracción de Lógica Repetitiva en Métodos:
La lógica de procesamiento del número ( par/impar, positivo/negativo, cuadrado) se ha extraído a un método separado llamado procesarNumero(int numero). Esto mejora la claridad y hace que el código principal sea más conciso y fácil de leer.

Creación de Métodos Auxiliares:
Se agregaron los métodos auxiliares esPar(int numero)y calcularCuadrado(int numero):
esPar(int numero)evalúa si un numero es par.
calcularCuadrado(int numero)calcula el cuadrado de un número. Esto permite reutilizar la lógica si es necesario y mejorar la modularidad del código.

Uso de Operador Condicional ( ? :) :
En lugar de usar bloques ifseparados para verificar si el número es par o positivo/negativo, se utiliza el operador cond.      

Ejercicio 2: Cálculo de edades y estadísticas
Funcionalidad general:
Este programa solicita las edades de varios alumnos hasta que se introduce una edad negativa. Luego calcula y muestra:

La suma total de las edades introducidas.
La cantidad de alumnos mayores de edad (≥18 años).
La edad promedio de los alumnos (si hay suficientes datos).
Estructura del programa:

Un bucle do-while asegura que se procesen todas las edades hasta encontrar una negativa.
Se usan acumuladores (sumaEdad, contadorAlumnos, contadorMayores18) para llevar la cuenta de las estadísticas necesarias.
Después de procesar todas las edades, se calculan y muestran los resultados.
Comentario general:
El programa es un buen ejercicio para practicar la manipulación de datos mediante acumuladores, así como el uso de estructuras de control como condicionales y bucles. También enseña cómo manejar casos límite, como evitar dividir entre cero cuando no hay datos válidos.

Ejercicio 3: Adivina el número
Funcionalidad general:
Este programa genera un número aleatorio entre 1 y 100 que el usuario debe adivinar. Proporciona pistas para ayudar al usuario:

Si el número introducido es mayor o menor que el número aleatorio.
Valida que el número introducido esté dentro del rango permitido (1 a 100).
Estructura del programa:

Usa un objeto Random para generar el número aleatorio.
Un bucle while se asegura de que el programa continúe hasta que el usuario adivine el número.
Dentro del bucle:
Valida si el número introducido está en el rango válido.
Da pistas si el número es mayor o menor.
Al final, muestra un mensaje felicitando al usuario por acertar.
Comentario general:
Este programa combina lógica de validación, bucles y generación aleatoria, lo que lo hace ideal para enseñar la interacción con el usuario y la validación de entradas.

Ejercicio 4: Verificar rango numérico
Funcionalidad general:
Este programa solicita al usuario que defina un rango numérico (mínimo y máximo) y luego verifica si un número ingresado está dentro de ese rango. Realiza lo siguiente:

Comprueba que el mínimo sea menor que el máximo.
Pide números hasta que se introduzca uno que esté dentro del rango definido.
Estructura del programa:

Valida inicialmente que el valor mínimo sea menor que el máximo.
Usa un bucle do-while para solicitar números al usuario hasta que se cumpla la condición de estar dentro del rango.
Da mensajes específicos para indicar si el número está fuera del rango.
Comentario general:
El programa es un ejercicio práctico para trabajar con validación de rangos y bucles de control. Es especialmente útil para mostrar cómo manejar casos en los que las entradas iniciales pueden ser incorrectas.

Ejercicio 5: Contador hasta un número
Funcionalidad general:
Este programa solicita al usuario un número positivo n y, si el número es válido, cuenta y muestra los números del 1 al n. Si el número no es válido, muestra un mensaje de error.

Estructura del programa:

Verifica que el número ingresado sea mayor que 0.
Si el número es válido, usa un bucle for para contar desde 1 hasta n.
Muestra cada número en una línea nueva.
Si el número no es válido, muestra un mensaje de advertencia.
Comentario general:
Este programa es sencillo, pero efectivo para practicar validación de entradas y el uso de bucles for. También es útil para aprender a manejar mensajes de error en condiciones no deseadas.
