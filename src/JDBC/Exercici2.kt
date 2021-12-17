package JDBC

import java.sql.DriverManager
fun main() {
    val tInicial = System.currentTimeMillis()

    val url = "jdbc:postgresql://89.36.214.106:5432/energies"
    val usuari = "energies"
    val password = "energies"

    val connexio = DriverManager.getConnection(url, usuari, password)
    val statement = connexio.createStatement()
    val result1 = statement.executeQuery("SELECT * FROM PAIS")
    while (result1.next()) {
        println(result1.getString(2))
        val statement2 = connexio.createStatement()
        val result2 = statement2.executeQuery("SELECT SUM(quant) " +
                                                    "FROM PRODUCCIO_ENERGIA INNER JOIN ENERGIA " +
                                                    "ON PRODUCCIO_ENERGIA.energia=ENERGIA.num " +
                                                    "WHERE pais=" + result1.getInt(1) + " " +
                                                    "GROUP BY concepte")
        while (result2.next()) {
            println("\t" +  result1.getString(1) + "----> " + result2.getInt(1))
        }
        result2.close()
        statement2.close()
    }
    result1.close()
    statement.close()
    connexio.close()
    val tFinal = System.currentTimeMillis() - tInicial
    println(tFinal)
}

