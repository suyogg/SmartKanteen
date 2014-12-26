package com.mastek.topcoders.smartkanteen.rest;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.mastek.topcoders.smartkanteen.bean.Caterer;
import com.mastek.topcoders.smartkanteen.bean.DailyMenu;
import com.mastek.topcoders.smartkanteen.bean.Menu;


public interface IMenuResource {
	
	/*Methods related to caterer*/
	
		List<Caterer> getCaterers();
		
		Caterer getCaterer(Integer catererId);
		
		Caterer addCaterer(Caterer caterer);
		
		Caterer updateCaterer(Integer catererId, String catererName);
		
		Response deleteCaterer(Integer catererId);
		
		/*Methods Ends*/
		

	/*Methods related to Master Menu*/
			
	List<Menu> getMenuMasterByCaterer(Integer catererId);
	
	Menu addUpdateItemInMenuMaster(Menu menuMaster, int catererId);
		
	Response deleteItemFromMenuMaster(Integer itemId);
	
	/*Methods Ends*/
	

	
	/*Methods related to DailyMenu*/
	
	List<Menu> getDailyMenu(DateParam menuDate, Integer catererId);
	
	DailyMenu addDailyMenu(List<Menu> menu,Integer catererId, DateParam menuDate);
	
	DailyMenu updateDailyMenu(List<Menu> menuList,Integer catererId, DateParam menuDate);
	
	Response deleteDailyMenu(Integer catererId, DateParam menuDate);

	/*Method Ends*/

}
