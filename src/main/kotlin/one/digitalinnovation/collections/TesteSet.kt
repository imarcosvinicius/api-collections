package one.digitalinnovation.collections

fun main() {
    val supervisor = Funcionario("Maria", 2500.0, "CLT")
    val operador = Funcionario("Sebastiao", 1500.0, "CLT")
    val gerente = Funcionario("Antônio", 4000.0, "PJ")

    val funcionario1 = setOf(operador, supervisor)
    val funcionario2 = setOf(gerente)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("==========================")
    val funcionario3 = setOf(operador, supervisor, gerente)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("==========================")
    val resultintersect = funcionario3.intersect(funcionario2)
    resultintersect.forEach { println(it) }
}