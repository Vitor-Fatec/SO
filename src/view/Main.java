package view;
import javax.swing.JOptionPane;
import controller.RedesController;
public class Main {
	
	public static void main(String[] args) {
	RedesController control = new RedesController();
	
	//String os = control.os(); 
	//System.out.println(os);
	//String os = control.os();
	int opc = Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja?\n 1-Para mostrar o ip\n 2-Para pingar em google.com \n0 Para encerrar: "));
	String sistema = System.getProperty("os.name");
	while(opc != 0) {
	switch(opc){
	case 1: control.ip(sistema);
	opc = Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja?\n 1-Para mostrar o ip\n 2-Para pingar em google.com \n0 Para encerrar: "));
		break;
	case 2: control.ping(sistema);
	opc = Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja?\n 1-Para mostrar o ip\n 2-Para pingar em google.com \n0 Para encerrar: "));
		break;
	case 0: System.out.println("Obrigado por utilizar nosso programa");
	default:
		System.out.println("Número inválido");
		opc = 0;
	}
}
	
	
}

}
