
import java.util.ArrayList;
import java.util.Date;


public class Professor {
	String dni;
	String nom;
	Date data_i;
	ArrayList<Alumne> llAlumnes;



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
	public Date getData_i() {
		return data_i;
	}
	public void setData_i(Date data_i) {
		this.data_i = data_i;
	}
	public ArrayList<Alumne> getLlAlumnes() {
		return llAlumnes;
	}
	public void setLlAlumnes(ArrayList<Alumne> llAlumnes) {
		this.llAlumnes = llAlumnes;
	}
}
