package org.esaude.dmt.util.log;

import java.util.Date;

/**
 * 
 * Classe que define os atributos para eventos do tipo INFO
 * @author Val�rio Jo�o
 * @since 21-08-2014
 */
public class Info extends Event {
	public final static String TYPE = "INFO";
	
	public Info() {
		super();
	}
	
	public Info(String descricao, String fase, Date timestamp) {
		super(descricao, fase, timestamp);
	}

	@Override
	public String getType() {
		return Info.TYPE;
	}
	
	@Override
	public String toString() {
		return Info.TYPE + " AT: " + getFase() + ": " + getDescricao();	
	}
}