package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ItemPedido {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private ItemCardapio itemcardapio;
	private int quantidade;
	
	public ItemPedido() { }

	public ItemPedido(ItemCardapio itemcardapio, int quantidade) {
		super();
		this.itemcardapio = itemcardapio;
		this.quantidade = quantidade;
	}

	public ItemCardapio getItemcardapio() {
		return itemcardapio;
	}
	public void setItemcardapio(ItemCardapio itemcardapio) {
		this.itemcardapio = itemcardapio;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
