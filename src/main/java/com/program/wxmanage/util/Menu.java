package com.program.wxmanage.util;

import java.util.List;
/**
 * 菜单实体
 * @author admin
 *
 */
public class Menu {
	private int id;
	private int pid;
	private String title;
	private String icon;
	private boolean spread;
	private String href;
	private List<Menu> childen;
	private int level;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public boolean isSpread() {
		return spread;
	}
	public void setSpread(boolean spread) {
		this.spread = spread;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public List<Menu> getChilden() {
		return childen;
	}
	public void setChilden(List<Menu> childen) {
		this.childen = childen;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
