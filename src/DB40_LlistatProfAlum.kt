import com.db4o.Db4oEmbedded

fun main() {
    val baseDades = Db4oEmbedded.openFile("AutoEscola.db4o")
    val patro = Professor()
    val llista = baseDades.queryByExample<Professor>(patro)

    for (p in llista) {
        println(p.nom)
        for (a in p.llAlumnes.sortedBy { it.nom }) {
            var t = 0.0
            for (pr in a.llPractiques) {
                t += pr.km
            }
            println("\t----> " + a.nom + " " + a.llPractiques.size + " practiques. Total quilometres: " + t)
        }
    }

    baseDades.close()
}