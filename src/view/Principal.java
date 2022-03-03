package view;

import controller.procontrol;

public class Principal {

	public static void main(String[] args) {
		procontrol control = new procontrol();
		//String os = control.os();
		//System.out.println(os);

		//String process = "C:\\Windows\\regedi.exe";
		//control.callProcess(process);
		
		//String process = "TASKLIST /FO TABLE";
		//control.readProcess(process);
		
		String param = "11168";
		control.killProcess(param);
	}

}
