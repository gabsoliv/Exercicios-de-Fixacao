package entities;

public class Informations {
	
	private String names;
	private Integer idades;
	private String profission;
	
	public Informations() {
		
	}
	
	
	public Informations(String names, Integer idades, String profission) {
		this.names = names;
		this.idades = idades;
		this.profission = profission;
	}


	public String getNames() {
		return names;
	}


	public void setNames(String names) {
		this.names = names;
	}


	public Integer getIdades() {
		return idades;
	}


	public void setIdades(Integer idades) {
		this.idades = idades;
	}


	public String getProfission() {
		return profission;
	}


	public void setProfission(String profission) {
		this.profission = profission;
	}


	@Override
	public String toString() {
		return  "Nome: " 
				+ names
				+ "\n"
				+ "Idade: " 
				+ idades 
				+ " ano(s)\nPersonalidade: " 
				+ profission 
				+ "\n";
	}

	
	

}
