class Node<T>(val value: T, var next: Node<T>? = null)
class Queue<T> {
    private var front: Node<T>? = null
    private var rear: Node<T>? = null
    private var size = 0

    fun enqueue(value: T) {

        val newNode = Node(value)
        if (rear != null) {
        rear?.next = newNode
        }
        rear = newNode
        if (front == null) {
        front = rear
        }
        size++
    }
        
    fun dequeue(): T? {
        if (isEmpty()) {
        println("Queue is empty.")
        return null
        }
        val dequeuedValue = front?.value
        front = front?.next
        if (front == null) {
        rear = null
        }
        size--
        return dequeuedValue
    }

    fun peek(): T? {
        return front?.value
    }

    fun isEmpty(): Boolean {
        return front == null
    }
    
    fun size(): Int {
        return size
    }
    
    override fun toString(): String {
        if (isEmpty()) return "[]"
        val result = StringBuilder("[")
        var current = front
        while (current != null) {
        result.append(current.value)
        if (current.next != null) {
        result.append(", ")
        }
        current = current.next
        }
        result.append("]")
        return result.toString()
    }
}

// EJERCICIO 1
// Simulación de sistemas de turnos en un banco
fun main() {
    println(".:: EJERCICIO 1::.")
    val bancoQueve = Queve<Int>()

    for (i in 1..10) {
        bancoQueve.enqueue(i)
    }

    println("Turno de clientes iniciales: $bancoQueve")

    for (i in 1..8) {
        println("Atendiendo al cliente: ${bancoQueve.dequeue()}")
    }
    println("Clientes restantes a atender: ${bancoQueve.size()}")

    println("\n\n.:: Ejercicio 2::.")
    val tareasQueve = Queve<String>()

    tareasQueve.enqueue("Limpiar")
    tareasQueve.enqueue("Cocinar")
    tareasQueve.enqueue("Estudiar")
    tareasQueve.enqueue("Jugar")
    tareasQueve.enqueue("Leer")
    println("Tareas pendientes: $tareasQueve")

    while (!tareasQueve.isEmpty()) {
        println("Se esta realizando la tarea de: ${tareasQueve.dequeue()}")
    }
}


