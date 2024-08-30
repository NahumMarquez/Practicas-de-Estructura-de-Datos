fun main() {
    val numeros = IntArray(4)

    for (i in 0 until 4) {
        try {
            print("Ingresa el número ${i + 1}: ")
            numeros[i] = readLine()?.toInt() ?: throw NumberFormatException("Entrada no numérica")
        } catch (e: NumberFormatException) {
            println("Error: Debes ingresar un número entero válido.")
            return
        }
    }

    val mayor = numeros.reduce { acc, num -> if (num > acc) num else acc }
    println("El número mayor es: $mayor")
}
