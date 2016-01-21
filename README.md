###Escuela Colombiana de Ingeniería

El siguiente, es un modelo de clases de una aplicación que se comunica con un microcontrolador encargado de la fabricación automática de pizzas. Dichas clases encapsulan la lógica para amasar, hornear y moldear pizzas de las pizzas delgadas.

El programa principal del micro-controlador utiliza la siguiente función, la cual depende de las clases antes mostradas:


```



####Parte II. 

En el presente [repositorio](https://github.com/PDSW-ECI/DesignPatterns_WordProcessorExercise.git) se tiene una versión muy básica de un procesador de texto orientado principalmente a la calidad del texto escrito. 

Para revisar su funcionamiemto, clone el proyecto y desde la consola ejecute con maven:

```
mvn exec:java -Dexec.mainClass="edu.eci.pdsw.wordprocessor.view.GuordMainFrame"
```
Verifique qué pasa al escribir en alguna parte el texto un error tipográfico/ortográfico como 'hoal' o 'vuenas'. Como se observa, el procesador de texto realiza automáticamente correcciones sobre este tipo de errores. 

Ahora, ensaye escribir en el texto palabras como 'parcero' o 'supersona', y escoja la opción 'Style/Autocorrect'. Como puede observar, esta opción hace correcciones de 'estilo', sustituyendo modernismos o costumbrismos por sus equivalentes más formales.

Realice lo siguiente:

1. Revise el código y haga el diagrama de clases UML.
2. Como se observa, los fuente incluyen las clases requeridas para que la aplicación pueda trabajar con inglés en lugar de español. Analice: qué habría que hacer para que la aplicación funcione en inglés en lugar de español?. De acuerdo con esto, se puede considerar que la misma está cerrada para modificación y abierta para extensión?. Justifique su respuesta.
3. Proponga una versión alterna del diseño, en la que se aprovechen las propiedades de polimorfismo y se aplique el patrón Fábrica Abstracta, de manera que la aplicación quede 'cerrada para modificación' y 'abierta para extensión'.
4. Implemente su diseño, y agregue a la aplicación una opción de menú que permita seleccionar en qué idioma se va a trabajar.
5. Describa: si se quisiera agregar soporte -por ejemplo- a la corrección de errores y de estilo del francés, qué cambios se necesitarían para hacerlo.