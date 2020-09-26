fun main() {
    val digitalHouseManager = DigitalHouseManager()

    registrarProfessoresTitulares(digitalHouseManager)
    registrarProfessoresAdjuntos(digitalHouseManager)

    registrarCursos(digitalHouseManager)

    alocarProfessores(digitalHouseManager)

    matricularAlunos(digitalHouseManager)
    matricularAlunosEmCurso(digitalHouseManager)

    println("\nLista de cursos:")
    digitalHouseManager.listaDeCursos()

    println()

    digitalHouseManager.consultarAluno(1)
    digitalHouseManager.consultarAluno(4)

    println()

    digitalHouseManager.listaDeAlunos()

    println("\nAlunos no curso de fullstack:")
    digitalHouseManager.listaDeAlunosNoCurso(20001)

    println("\nAlunos no curso de android:")
    digitalHouseManager.listaDeAlunosNoCurso(20002)

    digitalHouseManager.excluirCurso(20001)

    println("\nLista de cursos:")

    digitalHouseManager.listaDeCursos()

    println("\nLista de professores:")
    digitalHouseManager.listaDeProfessores()

    digitalHouseManager.excluirProfessor(2)

    println("\nLista de professores:")
    digitalHouseManager.listaDeProfessores()
}

fun registrarProfessoresTitulares(digitalHouseManager: DigitalHouseManager) {
    digitalHouseManager.registrarProfessorTitular(
        "João",
        "da Silva",
        1,
        "Kotlin")
    digitalHouseManager.registrarProfessorTitular(
        "Lucas",
        "Coelho",
        2,
        "Java"
    )
}

fun registrarProfessoresAdjuntos(digitalHouseManager: DigitalHouseManager) {
    digitalHouseManager.registrarProfessorAdjunto(
        "Joanisvaldo",
        "Fulanosvildo",
        3,
        10
    )
    digitalHouseManager.registrarProfessorAdjunto(
        "Cleito",
        "Outrosvaldo",
        4,
        5
    )
}

fun registrarCursos(digitalHouseManager: DigitalHouseManager) {
    digitalHouseManager.registrarCurso(
        "Full Stack",
        20001,
        3
    )
    digitalHouseManager.registrarCurso(
        "Android",
        20002,
        2
    )
}

fun alocarProfessores(digitalHouseManager: DigitalHouseManager) {
    digitalHouseManager.alocarProfessores(20001, 1, 3)
    digitalHouseManager.alocarProfessores(20002, 2, 4)
}

fun matricularAlunos(digitalHouseManager: DigitalHouseManager) {
    digitalHouseManager.matricularAluno("Cleidosvalda", "Rosa", 1)
    digitalHouseManager.matricularAluno("Ana", "Cardoso", 2)
    digitalHouseManager.matricularAluno("Fulano", "Santos", 3)
    digitalHouseManager.matricularAluno("Sabrina", "Coelho", 4)
    digitalHouseManager.matricularAluno("Gerson", "Santos", 5)
}

fun matricularAlunosEmCurso(digitalHouseManager: DigitalHouseManager) {
    digitalHouseManager.matricularAlunoEmCurso(1, 20001)
    digitalHouseManager.matricularAlunoEmCurso(2, 20001)
    digitalHouseManager.matricularAlunoEmCurso(3, 20002)
    digitalHouseManager.matricularAlunoEmCurso(4, 20002)
    digitalHouseManager.matricularAlunoEmCurso(5, 20002)
}