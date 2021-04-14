package controller;

import java.util.List;

import model.dao.vacinacao.VacinaDAO;
import model.entity.vacinacao.Vacina;

public class ControladoraVacina {
	
	private VacinaDAO dao = new VacinaDAO();

	public List<Vacina> consultarVacinas() {
		
		
		
		return dao.consultarTodos();
	}

	
	
	
	

}
