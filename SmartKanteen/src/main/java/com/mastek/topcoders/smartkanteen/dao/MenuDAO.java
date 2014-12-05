package com.mastek.topcoders.smartkanteen.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mastek.topcoders.smartkanteen.bean.Caterer;
import com.mastek.topcoders.smartkanteen.bean.Menu;
import com.mastek.topcoders.smartkanteen.common.util.DatabaseUtil;

public class MenuDAO
{
	public List<Menu> getMenuMaster()
	{
		Session session = DatabaseUtil.getSession();
		List<Menu> menuMasterList = (List<Menu>) session.createQuery("FROM Menu").list();
		DatabaseUtil.closeSession(session);
		
		return menuMasterList;
	}

	public List<Menu> getMenuMaster(Integer catererId)
	{
		return null;
	}

	public Menu getItem(Integer itemId)
	{
		Session session = DatabaseUtil.getSession();

		Query query = session.createQuery("FROM Menu WHERE itemID= :itemId");
		query.setParameter("itemId", itemId);
		
		List<Menu> menuMasterList = (List<Menu>) query.list();
		DatabaseUtil.closeSession(session);
		
		if(menuMasterList!=null && menuMasterList.size()==1)
		{
			return menuMasterList.get(0);
		}
		
		return null;
	}
	
	public Integer addItem(Menu menuMaster)
	{
		Session session = DatabaseUtil.getSession();

		Transaction tx = session.beginTransaction();
		Integer result = (Integer) session.save(menuMaster);
		tx.commit();

		DatabaseUtil.closeSession(session);
		return result;
	}

	public void deleteItem(Integer itemId)
	{
		Session session = DatabaseUtil.getSession();

		Transaction tx = session.beginTransaction();

		Menu menuMaster = new Menu();
		menuMaster.setItemId(itemId);

		session.delete(menuMaster);
		tx.commit();
		DatabaseUtil.closeSession(session);
	}

	public void deleteAllItems()
	{
		Session session = DatabaseUtil.getSession();

		Transaction tx = session.beginTransaction();

		session.createQuery("DELETE FROM Menu").executeUpdate();
		tx.commit();
		DatabaseUtil.closeSession(session);
	}

	public void updateItem(Menu menuMaster)
	{
		Session session = DatabaseUtil.getSession();

		Transaction tx = session.beginTransaction();

		session.update(menuMaster);
		tx.commit();
		DatabaseUtil.closeSession(session);
	}

	public void addItemInMenuMaster(Menu menuMaster, Caterer caterer)
	{
		Session session = DatabaseUtil.getSession();

		Transaction tx = session.beginTransaction();

		session.update(menuMaster);
		//session.add()
		tx.commit();
		DatabaseUtil.closeSession(session);
		
	}

}
