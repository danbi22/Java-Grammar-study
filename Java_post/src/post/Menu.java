package post;

public enum Menu {
	QUIT, CREATE, READ_ALL, READ_AT, UPDATE, DELETE, UNKNOWN;

	public static Menu getIndex(int index) {
		Menu[] menu = Menu.values();
		if (index >= 0 && index < menu.length) {
			return menu[index];
		}
		return menu[6];
	}
	
	
}
