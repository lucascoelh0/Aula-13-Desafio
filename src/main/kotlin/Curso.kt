class Curso(
    val nome: String,
    val codigoCurso: Int,
    val maximoDeAlunos: Int,
) {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    val alunos = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        other as Curso
        return this.codigoCurso == other.codigoCurso
    }

    override fun toString(): String {
        return nome
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if (alunos.size == maximoDeAlunos) {
            println("Não foi possível realizar a matrícula. Não há vagas disponíveis.")
            false
        } else {
            alunos.add(umAluno)
            println("Matriculado com sucesso!")
            true
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        alunos.remove(umAluno)
    }
}