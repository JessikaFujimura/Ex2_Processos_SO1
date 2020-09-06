package view;

import controller.KillController;

public class Main {

	public static void main(String[] args) {
		KillController test = new KillController();
		
		String systemName = test.typeSystem();
		test.listActiveProcess(systemName);
		
		String param = "";
//		String param = "wordpad.exe";
		test.killProcess(systemName, param);

	}

}
