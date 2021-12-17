package JDBC

import java.sql.DriverManager
fun main() {
    val tInicial = System.currentTimeMillis()

    val url = "jdbc:postgresql://89.36.214.106:5432/energies"
    val usuari = "energies"
    val password = "energies"

    val connexio = DriverManager.getConnection(url, usuari, password)
    val statement = connexio.createStatement()
    val result1 = statement.executeQuery("SELECT p.nom, e.concepte, SUM(quant) " +
            "FROM PAIS p INNER JOIN PRODUCCIO_ENERGIA pe ON p.num=pe.pais " +
            "INNER JOIN ENERGIA E ON pe.energia=e.num " +
            "GROUP BY p.nom,e.concepte " +
            "ORDER  BY 1")
    var anterior = ""
    while (result1.next()) {
        if (result1.getString(1) != anterior) {
            println(result1.getString(1))
            anterior = result1.getString(1)
        }
        println("\t" + result1.getString(2) + " ----> " + result1.getInt(3))
    }
    result1.close()
    statement.close()
    connexio.close()
    val tFinal = System.currentTimeMillis() - tInicial
    println(tFinal)
}