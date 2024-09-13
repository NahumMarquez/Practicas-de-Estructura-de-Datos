//Principios Solid 
/*
1. single responsability  principle (SRP) - Princip de responsabilidad unica */

//EJEMPLO DE NO USO DE SRP
/* 
class factura (val items: List<Items){
    fun calcularTotal(): Double {
        return Items.sumOf {It.precio}
    } 
    fun generarReporte(): String{
        return"Reporte de la factura"
    }
}

}*/

class Factura(){
    fun calcularTotal(): String {
        return "Este es el total"
    } 
}

class ReporteFactura{
    fun generar(factura: Factura): String{
        return "Reporte de la factura"
    }
}


/*2. Open /ClodesnPrinciple (OCP) - Principio Abierto/Cerrado */

open class Empleado(val nombre: String, val horasTrabajadas: Int, val precioHora: Double){
    open fun calcularSalario(): Double{
        return horasTrabajadas*precioHora
    }
}

class EmpleadoConBono( nombre: String, horasTrabajadas: Int, precioHora: Double, val bono: Double): Empleado(nombre, horasTrabajadas,precioHora){
    override fun calcularSalario(): Double{
        return super.calcularSalario() + bono
    }
}


/*3. Liskov subtitution principle (LSP) - Principio de sutitucion Lisko */


fun main(args: Array<String>){
    fun imprimirSalario( empleado: Empleado){
        println ("El salario de ${empleado.nombre} es de ${empleado.calcularSalario()}")
    }

    val empleado = Empleado ("Daniel", 40,12.0)
    val empleadoConBono = EmpleadoConBono("Fernanda", 40,12.0,70.0)

    imprimirSalario(empleado)
    imprimirSalario(empleadoConBono)
} 


/*4. Interfaces segregation principle (ISP) - Principio de segregacion de interfaces */

interface Trabajador {
    fun trabajar()
}

interface Asistente {
    fun generarReporte()
}

interface Reportero {
    fun generarReporte()
}


class Programador : Trabajador {
    override fun trabajar() {
        println("El programador está programando")
    }
}


class Albaniles : Trabajador {
    override fun trabajar() {
        println("El albañil está trabajando")
    }
}


//5.Dependency  Iversion Principle (DIP) -Principio de inversion de depencias 
interface Notificaciones {
    fun enviarNotificacion(mensaje: String)
}

class ServicioEmail : Notificaciones {
    override fun enviarNotificacion(mensaje: String) {
        println("Enviando Email: $mensaje")
    }
}

class Notificacion(val servicio: Notificaciones) {
    fun enviarUnaNotificacion() {
        servicio.enviarNotificacion("Notificación importante")
    }
}

fun main() {
    val servicioEmail = ServicioEmail()
    val notificacion = Notificacion(servicioEmail)
    notificacion.enviarUnaNotificacion()
}
