package com.mastek.topcoders.smartkanteen.bean;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

// Generated Dec 4, 2014 12:33:20 PM by Hibernate Tools 3.4.0.CR1

/**
 * Caterer generated by hbm2java
 */
@XmlRootElement
public class Caterer implements java.io.Serializable
{

	private int catererId;
	private String catererName;
	private Set<CatererMenuMapping> catererMenuMapping;
	private List<Menu> menuList;
	
	public Set<CatererMenuMapping> getCatererMenuMapping()
	{
		return catererMenuMapping;
	}

	public void setCatererMenuMapping(Set<CatererMenuMapping> catererMenuMapping)
	{
		this.catererMenuMapping = catererMenuMapping;
	}

	public int getCatererId()
	{
		return catererId;
	}

	public void setCatererId(int catererId)
	{
		this.catererId = catererId;
	}

	public String getCatererName()
	{
		return catererName;
	}

	public void setCatererName(String catererName)
	{
		this.catererName = catererName;
	}

	public List<Menu> getMenuList()
	{
		return menuList;
	}

	public void setMenuList(List<Menu> menuList)
	{
		this.menuList = menuList;
	}

	@Override
	public String toString()
	{
		return "Caterer [catererId=" + catererId + ", catererName=" + catererName + ", catererMenuMapping="
				+ catererMenuMapping + ", menuList=" + menuList + "]";
	}
}
