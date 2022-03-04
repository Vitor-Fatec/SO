package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KillController {
	
	
	public KillController() {
		super();
	}
	
	private String sistema = System.getProperty("os.name");
	
	public String so() {
		return sistema;
	}
	
	public void listaProcessos(String sistema) {
		String processow = "TASKLIST /FO TABLE\r\n"
				+ "";
		String processol = "Linux: ps -ef"+ "";
		if(sistema.contains("Windows")) {
			try {
				Process p = Runtime.getRuntime().exec(processow);
				InputStream dados = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(dados);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while(linha !=null) {
					System.out.println(linha);
					linha = buffer.readLine();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sistema.contains("Linux")) {
			try {
				Process p = Runtime.getRuntime().exec(processol);
				InputStream dados = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(dados);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while(linha !=null) {
					System.out.println(linha);
					linha = buffer.readLine();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void mataPid(int pid, String sistema) {
		StringBuffer buffer = new StringBuffer();
		if(sistema.contains("Windows")) {
			String cmdPid = "TASKKILL /PID";
			buffer.append(cmdPid);
			buffer.append(" ");
			buffer.append(pid);
			try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(sistema.contains("linux")) {
			String cmdPid = "kill -9";
			buffer.append(cmdPid);
			buffer.append(" ");
			buffer.append(pid);
			
			try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
	
	public void mataNome(String nome, String sistema) {
		StringBuffer buffer = new StringBuffer();
		if(sistema.contains("Windows")) {
			String nomePid = "TASKKILL /IM";
			buffer.append(nomePid);
			buffer.append(" ");
			buffer.append(nome);
			buffer.append(".exe");
			try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sistema.contains("Linux")) {
			String nomePid = "pkill -f";
			buffer.append(nomePid);
			buffer.append(" ");
			buffer.append(nome);
			buffer.append(".exe");
			try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

	
































