package controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	
	public RedesController() {
		super();
	}
	
	private String sistema = System.getProperty("os.name");
	private String arch = System.getProperty("os.arch");
	private String versao = System.getProperty("os.version");
	
	public String os() {
		return sistema +" "+ arch + " " + versao ;
		
	}
	
	public void  ip( String sistema) {
		String processw = "ipconfig";
		String processl = "IFCONFIG";
		if(sistema.contains("Windows")) {
			try {
				Process p = Runtime.getRuntime().exec(processw);
				InputStream dados = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(dados);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while(linha != null) {
					if(linha.contains("Adaptador") || linha.contains("IPv4")) {
						System.out.println(linha);
					}
					linha = buffer.readLine();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sistema.contains("Linux")) {
			
			try {
				Process p = Runtime.getRuntime().exec(processl);
				InputStream dados = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(dados);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while(linha != null) {
					if(linha.contains("Adaptador") || linha.contains("IPv4")) {
						System.out.println(linha);
					}
					linha = buffer.readLine();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		
	}

}
	
	public void ping(String sistema) {
		String processw = "PING -4 -n 10 www.google.com.br";
		String processl = "PING -4 -c 10 www.google.com.br";
			if(sistema.contains("Windows")) {
				try {
					Process p = Runtime.getRuntime().exec(processw);
					InputStream dados = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(dados);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					while(linha != null) {
							System.out.println(linha);
							linha = buffer.readLine();
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			
	}
			if(sistema.contains("Linux")) {
				try {
					Process p = Runtime.getRuntime().exec(processl);
					InputStream dados = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(dados);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					while(linha != null) {
							System.out.println(linha);
							linha = buffer.readLine();
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
}
}