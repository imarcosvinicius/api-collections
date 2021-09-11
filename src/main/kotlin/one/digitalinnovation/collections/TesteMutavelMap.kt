package one.digitalinnovation.collections

fun main() {
    val supervisor = Funcionario("Antônio", 2500.0, "CLT")
    val operador = Funcionario("Sebastiao", 1500.0, "CLT")
    val gerente = Funcionario("Maria", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(gerente.nome, gerente)
    repositorio.create(operador.nome, operador)
    repositorio.create(supervisor.nome, supervisor)

    println(repositorio.findById(supervisor.nome))

    println("===================")
    repositorio.findAll().forEach { println(it) }

    println("===================")
    repositorio.remove(supervisor.nome)
    repositorio.findAll().forEach { println(it) }
}