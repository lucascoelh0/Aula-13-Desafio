abstract class Professor(
    val nome: String,
    val sobrenome: String,
    val tempoDeCasa: Int,
    val codigoProfessor: Int
) {
    override fun equals(other: Any?): Boolean {
        other as Professor
        return this.codigoProfessor == other.codigoProfessor
    }

    override fun toString(): String {
        return "$nome $sobrenome. Tempo de casa: $tempoDeCasa."
    }
}
