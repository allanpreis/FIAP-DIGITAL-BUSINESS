package br.com.fiap.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.swing.*;

import br.com.fiap.dao.SetupDAO;
import br.com.fiap.model.Setup;

@ManagedBean
public class SetupBean {
	
	private Setup setup = new Setup();
	
	public void save() {
		new SetupDAO().save(this.setup);
		JOptionPane.showMessageDialog(null,"salvando.." + this.setup);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Setup cadastrado com sucesso"));
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}
	
	
	
}
