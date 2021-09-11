package one.digitalinnovation.collections

fun main() {
    val supervisor = Funcionario("Maria", 2500.0, "CLT")
    val operador = Funcionario("Sebastiao", 1500.0, "CLT")
    val gerente = Funcionario("Antônio", 4000.0, "PJ")

    println("----------LIST------------")
    val funcionarios = mutableListOf(supervisor, gerente)
    funcionarios.forEach { println(it) }

    println("==================")
    funcionarios.add(operador)
    funcionarios.forEach { println(it) }

    println("==================")
    funcionarios.remove(gerente)
    funcionarios.forEach { println(it) }

    println("----------SET------------")
    val funcionariosSet = mutableSetOf(operador)
    //funcionariosSet.forEach { println(it) }

    funcionariosSet.add(gerente)
    funcionariosSet.add(supervisor)
    funcionariosSet.forEach { println(it) }

    println("==================")
    funcionariosSet.remove(supervisor)
    funcionariosSet.forEach { println(it) }
}