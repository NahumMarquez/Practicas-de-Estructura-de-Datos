import java.io.File

fun leerArchivo(ruta: String): String {
    val archivo = File(ruta)
    return archivo.readText()
}

fun escribirEnArchivo(ruta: String, content: String) {
    val archivo = File(ruta)
    archivo.appendText(content)
}

fun main(args: Array<String>) {
    val ruta ="C:/Users/MINEDUCYT/Desktop/Practica 6 Estructura de datos/documento/archivo.txt"
    val contenido = leerArchivo(ruta)

    /* EJEMPLO 1 - LECTURA DE ARCHIVOS */
    println(contenido)
    println("\n")

    /* EJEMPLO 2 - ESCRIBIR EN UN ARCHIVO */
    val escritura =  "\nEsta es una prueba de appendText."
    escribirEnArchivo(ruta, escritura)
    println("Creado Exitosamente")
}
