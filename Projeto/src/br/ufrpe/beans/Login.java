/*
 * Projeto PetShop
 * 
 * Tipo: Login
 *  
 *Este software foi criado para fins acad�micos, visando a aprova��o na disciplina
 *Introdu��o a Programa��o II, lecionada no per�odo 2016.2, 
 *na UFRPE (Universidade Federal Rural de Pernambuco),
 *pelo professor PhD. Leandro Marques. 
 */

package br.ufrpe.beans;

import java.io.Serializable;
/**
 * Esta classe representa a estrutura para realizar o Login no
 * sistema da Pet shop
 * @author Lucas
 *
 */
public class Login implements Serializable{
	private String login;
	private int senha;

	/**
	 * Construtor
	 * @param login
	 * @param senha
	 */
	public Login(String login, int senha) {
		this.login = login;
		this.senha = senha;
	}
	/**
	 * Getters and Setters
	 * @return
	 */
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public boolean equals(Login outro) {
		if(this.login.equalsIgnoreCase(outro.getLogin()) && this.senha == outro.getSenha()){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
		String linha = "Login: " + login + "\nSenha: " + senha;
		return linha;
	}
}
