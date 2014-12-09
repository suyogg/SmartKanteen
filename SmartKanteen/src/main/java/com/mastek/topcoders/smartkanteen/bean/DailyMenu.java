package com.mastek.topcoders.smartkanteen.bean;

// Generated Dec 4, 2014 12:33:20 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.List;

/**
 * DailyMenu generated by hbm2java
 */
public class DailyMenu implements java.io.Serializable
{
	private int catererId;
	private Date menuDate;
	private List<Menu> menuItems;

	public int getCatererId()
	{
		return catererId;
	}

	public void setCatererId(int catererId)
	{
		this.catererId = catererId;
	}

	public Date getMenuDate()
	{
		return menuDate;
	}

	public void setMenuDate(Date menuDate)
	{
		this.menuDate = menuDate;
	}

	public List<Menu> getMenuItems()
	{
		return menuItems;
	}

	public void setMenuItems(List<Menu> menuItems)
	{
		this.menuItems = menuItems;
	}

	@Override
	public String toString()
	{
		return "DailyMenu [catererId=" + catererId + ", menuDate=" + menuDate + ", menuItems=" + menuItems + "]";
	}
}
