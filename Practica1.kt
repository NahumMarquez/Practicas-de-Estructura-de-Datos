fun main() {
    println("Ingrese el primer número:")
    val numeroUno = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo número:")
    val numeroDos = readLine()?.toDoubleOrNull()

    println("Ingrese la operación (+, -, *, /, ^):")
    val operacion = readLine()

    if (numeroUno == null || numeroDos == null || operacion == null) {
        println("Error: Ingrese números válidos y una operación válida.")
        return
    }

    calculate(numeroUno, numeroDos, operacion)
}

fun calculate(numeroUno: Double, numeroDos: Double, operacion: String) {
    val resultado = when (operacion) {
        "+" -> numeroUno + numeroDos
        "-" -> numeroUno - numeroDos
        "*" -> numeroUno * numeroDos
        "/" -> if (numeroDos != 0.0) {
                    numeroUno / numeroDos
                } else {
                    println("Error: No se puede dividir entre 0.")
                    return
                }
        "^" -> Math.pow(numeroUno, numeroDos)
        else -> {
            println("Error: Operación no válida.")
            return
        }
    }
    println("Resultado de la operación $numeroUno $operacion $numeroDos = $resultado")
}
