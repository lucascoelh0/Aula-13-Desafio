class Aluno(
    val nome: String,
    val sobrenome: String,
    val codigoAluno: Int
) {
    override fun equals(other: Any?): Boolean {
        other as Aluno
        return this.codigoAluno == other.codigoAluno
    }

    override fun toString(): String {
        return "$nome $sobrenome. Código do aluno: $codigoAluno."
    }
}