package br.ufrpe.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Esta Classe representa a nota fiscal gerada pelas compras 
 * @author srtacamelo
 *
 */
public class NotaFiscal {

	private Funcionario funcionario;
	private Cliente cliente;
	private Carrinho carrinho;
	private LocalDate horaDaCompra;
	/**
	 * Construtor vazio padrão.
	 */
	public NotaFiscal(){
		
	}
	/**
	 * Construtor para Serviço <Compra>
	 * 
	 * @param funcionario
	 * @param cliente
	 * @param carrinho
	 */
	public NotaFiscal(Funcionario funcionario, Cliente cliente, Carrinho carrinho) {
		
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.carrinho = carrinho;
		this.horaDaCompra = LocalDate.now();
	}
	
	/**
	 * Métodos Getters and Settters
	 * @return
	 * @void
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		if (carrinho == null) {
			if (other.carrinho != null)
				return false;
		} else if (!carrinho.equals(other.carrinho))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (horaDaCompra == null) {
			if (other.horaDaCompra != null)
				return false;
		} else if (!horaDaCompra.equals(other.horaDaCompra))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "NotaFiscal [funcionario=" + funcionario + ", cliente=" + cliente + ", carrinho=" + carrinho
				+ ", horaDaCompra=" + horaDaCompra + "]";
	}
	
	
}
