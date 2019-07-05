package dao;

import javax.persistence.EntityManager;

import modelo.ItemPedido;

public class ItemPedidoDAO {
	public void create(ItemPedido itempedido) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(itempedido);
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(ItemPedido itempedido) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(itempedido);
		em.getTransaction().commit();
		em.close();
	}
	
	public ItemPedido readId(long id) {
		EntityManager em=JPAUtil.getEntityManager();
		ItemPedido consultaItemPedido=em.find(ItemPedido.class, id);
		em.close();
		return consultaItemPedido;
	}
	
	public void delete(ItemPedido itempedido) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Object c=em.merge(itempedido);
		em.remove(c);
		em.getTransaction().commit();
		em.close();
	}
}
