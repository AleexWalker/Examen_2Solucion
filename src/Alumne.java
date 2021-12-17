
import java.util.ArrayList;
import java.util.Date;


public class Alumne {
	
	String dni;
	String nom;
	Date data_n;
	Professor prof;
	ArrayList<Practica> llPractiques;
	String dia_c;
	String hora_c;
	boolean aprovat;
	boolean baixa;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getData_n() {
		return data_n;
	}
	public void setData_n(Date data_n) {
		this.data_n = data_n;
	}
	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	public ArrayList<Practica> getLlPractiques() {
		return llPractiques;
	}
	public void setLlPractiques(ArrayList<Practica> llPractiques) {
		this.llPractiques = llPractiques;
	}
	public String getDia_c() {
		return dia_c;
	}
	public void setDia_c(String dia_c) {
		this.dia_c = dia_c;
	}
	public String getHora_c() {
		return hora_c;
	}
	public void setHora_c(String hora_c) {
		this.hora_c = hora_c;
	}
	public boolean isAprovat() {
		return aprovat;
	}
	public void setAprovat(boolean aprovat) {
		this.aprovat = aprovat;
	}
	public boolean isBaixa() {
		return baixa;
	}
	public void setBaixa(boolean baixa) {
		this.baixa = baixa;
	}
}
