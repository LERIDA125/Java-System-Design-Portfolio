package modelo;

public class Aeropuerto {
	
	private int idAeropuerto;
	private String codAeropuerto;
	private String aeropString;
	
	
public Aeropuerto(int idAeropuerto, String codAeropuerto, String aeropString) throws Exception{
		super();
		this.idAeropuerto = idAeropuerto;
		this.setCodAeropuerto(codAeropuerto);
		this.aeropString = aeropString;
	}


public int getIdAeropuerto() {
	return idAeropuerto;
}


public void setIdAeropuerto(int idAeropuerto) {
	this.idAeropuerto = idAeropuerto;
}


public String getCodAeropuerto() {
	return codAeropuerto;
}


public void setCodAeropuerto(String codAeropuerto) throws Exception{
	if (verificarCodigo(codAeropuerto) == true) {
	this.codAeropuerto = codAeropuerto;
	}
	else {
		throw new Exception("el codigo es incorrecto");
	}
}


public String getAeropString() {
	return aeropString;
}


public void setAeropString(String aeropString) {
	this.aeropString = aeropString;
}


@Override
public String toString() {
	return "\nAeropuerto [idAeropuerto=" + idAeropuerto + ", codAeropuerto=" + codAeropuerto + ", aeropString="
			+ aeropString + "]";
}
	
public boolean verificarCodigo(String codigo){
  if (codigo.length()>3) {
	  int i = 0;
	  while (i<codigo.length()) {
	  	if (!Character.isLetter(codAeropuerto.charAt(i))) {
	  		return false;
	  	}
	  i++;
	  }
	return true;
}
  
  return false;

}


}
