//EJEMPLO 1

class Caja<T>(val contenido: T) {
    fun obtenerContenido(): T {
        return contenido
    }
}


//EJEMPLO 2

fun <T> imprimirDato(elemento: T) {
    println(elemento)
}


//EJEMPLO 3

fun <T: Number> sumar(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}


//EJEMPLO 4
fun <T> imprimirSiEsNumero(valor: T)where T:Number{
    println(valor.toDouble())
}



fun main(args: Array<String>) {
    val cajaInt = Caja(42.4156451)
    val cajaString = Caja("Soy una cadena")
    val nombre = "Gustavo"
    val suma = sumar(10.7541, 45)

    println("****** Ejemplo 1 ******")
    println(cajaInt.obtenerContenido())
    println(cajaString.obtenerContenido())
    println("****** Fin del ejemplo 1 ******")

    println("\n****** Ejemplo 2 ******")
    val entero = 42 // Definir variable
    imprimirDato(nombre)
    imprimirDato(entero)
    println("****** Fin del Ejemplo 2 ******")

    println("\n****** Ejemplo 3 ******")
    println("La suma es: $suma")
    println("****** Fin del Ejemplo 3 ******")

    println("\n****** Ejemplo 4 ******")
    imprimirSiEsNumero(suma)
    println("****** Fin del Ejemplo 4 ******")
}