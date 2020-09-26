class DigitalHouseManager {

    var alunos: MutableList<Aluno> = mutableListOf()
    val professores: MutableList<Professor> = mutableListOf()
    val cursos: MutableList<Curso> = mutableListOf()
    var matriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        cursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int) {
        cursos.forEach {
            if (it.codigoCurso == codigoCurso) {
                cursos.remove(it)
                return
            }
        }
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int
    ) {
        val professorAdjunto = ProfessorAdjunto(
            nome,
            sobrenome,
            0,
            codigoProfessor,
            quantidadeDeHoras
        )
        professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ) {
        val professorTitular = ProfessorTitular(
            nome,
            sobrenome,
            0,
            codigoProfessor,
            especialidade
        )
        professores.add(professorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        professores.forEach {
            if (it.codigoProfessor == codigoProfessor) {
                professores.remove(it)
                return
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        alunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAlunoEmCurso(codigoAluno: Int, codigoCurso: Int) {

        val curso = encontrarAPartirDoCodigo(codigoCurso, "curso") as Curso
        val aluno = encontrarAPartirDoCodigo(codigoAluno, "aluno") as Aluno

        if (curso.adicionarUmAluno(aluno)) matriculas.add(Matricula(aluno, curso))
    }

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {
        val curso = encontrarAPartirDoCodigo(codigoCurso, "curso") as Curso
        curso.professorTitular = encontrarAPartirDoCodigo(codigoProfessorTitular, "professor") as ProfessorTitular
        curso.professorAdjunto = encontrarAPartirDoCodigo(codigoProfessorAdjunto, "professor") as ProfessorAdjunto
    }

    fun encontrarAPartirDoCodigo(codigo: Int, tipoDaLista: String): Any {
        when (tipoDaLista) {
            "aluno" -> {
                alunos.forEach {
                    if (it.codigoAluno == codigo) return it
                }
            }
            "professor" -> {
                professores.forEach {
                    if (it.codigoProfessor == codigo) return it
                }
            }
            "curso" -> {
                cursos.forEach {
                    if (it.codigoCurso == codigo) return it
                }
            }
            "matricula" -> {
                matriculas.forEach {
                    if (it.aluno.codigoAluno == codigo) return it
                }
            }
        }

        return ""
    }

    fun listaDeAlunos() {
        alunos.forEach {
            println(it)
        }
    }

    fun listaDeAlunosNoCurso(codigoCurso: Int) {
        val curso = encontrarAPartirDoCodigo(codigoCurso, "curso") as Curso
        curso.alunos.forEach {
            println(it)
        }
    }

    fun consultarAluno(codigoAluno: Int) {
        val aluno = encontrarAPartirDoCodigo(codigoAluno, "aluno") as Aluno

        matriculas.forEach {
            if (it.aluno.codigoAluno == codigoAluno) {
                println("$aluno Matriculado no curso de ${it.curso}.")
            }
        }
    }

    fun listaDeCursos() {
        cursos.forEach {
            println(it)
        }
    }

    fun listaDeProfessores() {
        professores.forEach {
            println(it)
        }
    }
}