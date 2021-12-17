package JDBC

import java.sql.DriverManager
import java.util.*

fun main() {
    val url = "jdbc:postgresql://89.36.214.106:5432/energies"
    val usuari = "energies"
    val password = "energies"

    val connexio = DriverManager.getConnection(url, usuari, password)

    fun EnergiaAny(any: Int): Int {
        val statement = connexio.createStatement()
        val result = statement.executeQuery("SELECT SUM(quant)" +
                                                "FROM PRODUCCIO_ENERGIA" +
                                                "WHERE any_p=" + any)
        if (result.next())
            return result.getInt(1)
        else
            return 0
        result.close()
        statement.close()
        connexio.close()
    }

    val scanner = Scanner(System.`in`)
    var op =scanner.nextInt()
    while (op != 0) {
        println("L'energia produida l'any " + op + " ----> " + EnergiaAny(op))
    }
}