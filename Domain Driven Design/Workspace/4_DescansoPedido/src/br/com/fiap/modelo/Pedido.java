package br.com.fiap.modelo;

public class Pedido {
	private int numPedido;
	private Cliente cliente;
	private double total;
	private String formaPagamento;
	private ItemPedido itemPedido;
	
	//GetAll & setAll
	
	public String getAll() {
		return "Número do Pedido..: " + numPedido + "\n" +
			   "Cliente...........: " + cliente.getAll() + "\n" +
			   "Total.............: " + total + "\n" +
			   "Forma de Pagamento: " + formaPagamento + "\n" +
			   "Item do Pedido....: " + itemPedido.getAll();
	}
	
	public void setAll(int numPedido, Cliente cliente, double total, String formaPagamento, ItemPedido itemPedido) {
		setNumPedido(numPedido);
		setCliente(cliente);
		setTotal(total);
		setFormaPagamento(formaPagamento);
		setItemPedido(itemPedido);
	}
	
	
	//Construtores
	public Pedido() {
	}
	
	public Pedido(int numPedido, Cliente cliente, double total, String formaPagamento, ItemPedido itemPedido) {
		setNumPedido(numPedido);
		setCliente(cliente);
		setTotal(total);
		setFormaPagamento(formaPagamento);
		setItemPedido(itemPedido);
	}
	
	//Get & Set
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento.toUpperCase();
	}
	public ItemPedido getItemPedido() {
		return itemPedido;
	}
	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	
	

}
