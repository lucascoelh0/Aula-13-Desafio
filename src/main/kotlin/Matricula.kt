import java.util.*

class Matricula(
    val aluno: Aluno,
    val curso: Curso,
    val dataDeMatricula: Date
) {
    constructor(aluno: Aluno, curso: Curso) : this(aluno, curso, Date())
}