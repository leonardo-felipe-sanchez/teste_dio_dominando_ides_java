package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	/*aula1 = 	File file = new File("C:\\Users\\lucas\\Desktop\\java_mesmo\\teste_dio_dominando_ides_java\\7\\textinho.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {

			System.out.println("mama aki: " + e.getMessage());
		
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}*/
//aula 2 e 3 		

/*		String path = "C:\\Users\\lucas\\Desktop\\java_mesmo\\teste_dio_dominando_ides_java\\7\\textinho.txt";
//		FileReader fr = null;
//		BufferedReader br = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
	//		fr = new FileReader(path);
	//		br = new BufferedReader(fr);
	
			String line = br.readLine();
		
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				}
			
		} catch (IOException e) {
			System.out.println("mama aki: " + e.getMessage());
		}/* finally {
		
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e) {

			e.printStackTrace();
			
			}		
		}*/
//aula 4

/*		String [] lines = new String[]{"vai","tomar", "no cu"};
		
		String path = "C:\\Users\\lucas\\Desktop\\java_mesmo\\teste_dio_dominando_ides_java\\7\\textonho.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			
		}*/
		
//Aula 5
		
	/*	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		for (File folder : folders)
			System.out.println(folder);
		
		File [] files =  path.listFiles(File::isFile);
		System.out.println("FILES:");
		
		for(File file: files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Foi criado com sucesso, a pasta chamada " + sucess);
		
		sc.close();*/
		
// aula 6
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		 
		File path = new File(strPath);
		
		System.out.println("getname: "+ path.getName());
		System.out.println("getPatent: "+ path.getParent());
		System.out.println("getPath: "+ path.getPath());
		sc.close();
		
	}
	
}
