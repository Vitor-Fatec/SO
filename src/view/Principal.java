package view;

import controller.procontrol;

public class Principal {

	public static void main(String[] args) {
		procontrol control = new procontrol();
		//String os = control.os();
		//System.out.println(os);

		String process = "C:\\Windows\\regedit.exe";
		control.callProcess(process);
	}

}
