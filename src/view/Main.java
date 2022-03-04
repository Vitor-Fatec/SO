package view;
import javax.swing.JOptionPane;

import controller.KillController;
public class Main {

	public static void main(String[] args) {
		 KillController kill = new KillController ();
		 
		 String sistema = System.getProperty("os.name");
		 int opc = Integer.parseInt(JOptionPane.showInputDialog("- 1 Para listar os processos \n -2 Para matar um processo pelo PID \n - 3 Para matar um processo pelo nome \n 0 Para finalizar o programa : ")); 
		 while(opc != 0) {
				switch(opc){
				case 1: kill.listaProcessos(sistema);
				opc = Integer.parseInt(JOptionPane.showInputDialog("- 1 Para listar os processos \n -2 Para matar um processo pelo PID \n - 3 Para matar um processo pelo nome \n 0 Para finalizar o programa : ")); 
					break;
				case 2: int pid = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do PID"));
						kill.mataPid(pid, sistema);
				opc = Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja?\n 1-Para mostrar o ip\n 2-Para pingar em google.com \n0 Para encerrar: "));
					break;
				case 3: String nome = JOptionPane.showInputDialog("Digite o nome do programa que deseja fechar : ");
						kill.mataNome(nome, sistema);
				opc = Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja?\n 1-Para mostrar o ip\n 2-Para pingar em google.com \n0 Para encerrar: "));
					break;
				case 0:
					System.out.println("Obrigado por utilizar nosso programa");
					opc = 0;
					break;
				default:
					System.out.println("Número inválido");
					opc = 0;
					break;
				}
			}
		 
		 
		 
	}

}
