class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    val quantidadeDeHoras: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    override fun toString(): String {
        return "${super.toString()} Horas: $quantidadeDeHoras. Codigo do professor: $codigoProfessor"
    }
}