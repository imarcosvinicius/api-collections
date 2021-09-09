package one.digitalinnovation.collections

fun main() {
    val supervisor = Funcionario("Maria", 2500.0, "CLT")
    val operador = Funcionario("Sebastiao", 1500.0, "CLT")
    val gerente = Funcionario("Antônio", 4000.0, "PJ")

    val funcionarios = listOf(operador, supervisor, gerente)

    funcionarios.forEach { println(it) }

    println("==========================")
    println(funcionarios.find { it.nome == "Maria" })

    println("==========================")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("==========================")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }

}
