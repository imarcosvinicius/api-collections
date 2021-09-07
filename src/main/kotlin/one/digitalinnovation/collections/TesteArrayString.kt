package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    nomes.sort()
    println("===============")
    nomes.forEach {
        println(it)
    }

    val jogadores = arrayOf("Rivaldo", "Zico", "Cafú")
    println("===============")
    jogadores.sort()
    jogadores.forEach {
        println(it)
    }
}