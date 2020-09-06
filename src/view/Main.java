package view;

import controller.KillController;

public class Main {

	public static void main(String[] args) {
		KillController test = new KillController();
		
		String systemName = test.typeSystem();
		test.listActiveProcess(systemName);
		
//		String param = "1939";
		String param = "gnome-mines";
		test.killProcess(systemName, param);

	}

}
