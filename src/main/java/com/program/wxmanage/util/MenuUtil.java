package com.program.wxmanage.util;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import microservice.online.entity.TbSecqurity;
/**
 * 菜单解析工具
 * @author admin
 *
 */
public class MenuUtil {

	public static JSONArray paresMenu(JSONArray list, int parentId) {
		JSONArray menus = new JSONArray();
		for(int i = 0;i < list.size(); i++) {
			JSONObject childMenu = list.getJSONObject(i);
			int id = childMenu.getInteger("id");
			int pid = childMenu.getInteger("pid");
			if(parentId == pid) {
				JSONArray array = paresMenu(list, id);
				JSONObject object = new JSONObject();
				if(array.size() > 0) {
					object.put("children", array);
				}
				object.put("title", childMenu.get("menu_name"));
				object.put("icon", childMenu.get("icon"));
				object.put("spread", false);
				object.put("href", childMenu.get("action"));
				menus.add(object);
			}
		}
		return menus;
	}
	
	public static void main(String[] args) {
		JSONArray jsonArray = new JSONArray(); 
		Menu menu1 = new Menu(); 
		menu1.setId(1); 
		menu1.setPid(0);
		menu1.setHref("#");
		menu1.setIcon("");
		menu1.setTitle("菜单一");
		Menu menu2 = new Menu(); 
		menu2.setId(2); 
		menu2.setPid(0); 
		menu2.setHref("#");
		menu2.setIcon("");
		menu2.setTitle("菜单二");
		Menu menu3 = new Menu(); 
		menu3.setId(3); 
		menu3.setPid(2); 
		menu3.setHref("#");
		menu3.setIcon("");
		menu3.setTitle("二菜单一");
		Menu menu4 = new Menu(); 
		menu4.setId(4); 
		menu4.setPid(2); 
		menu4.setHref("#");
		menu4.setIcon("");
		menu4.setTitle("二菜单二");
		Menu menu5 = new Menu(); 
		menu5.setId(5); 
		menu5.setPid(4); 
		menu5.setHref("#");
		menu5.setIcon("");
		menu5.setTitle("erer菜单一");
		Menu menu6 = new Menu(); 
		menu6.setId(6); 
		menu6.setPid(1); 
		menu6.setHref("#");
		menu6.setIcon("");
		menu6.setTitle("已菜单一");
		jsonArray.add(menu1); 
		jsonArray.add(menu2); 
		jsonArray.add(menu3); 
		jsonArray.add(menu4); 
		jsonArray.add(menu5); 
		jsonArray.add(menu6); 
		System.out.println(paresMenu(jsonArray, 0));
	}
}
