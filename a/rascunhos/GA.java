package View;//a c
import java.util.ArrayList;
import java.util.List;

import Controls.InstanceLoader;
import Models.Data;

public class GA {
	
	public static void main(String[] args) {
		
		ArrayList<Data> valores = new InstanceLoader().loader("horario.csv");
		
		for(Data v : valores) {
			System.out.println(v.getDocente() + " : "
		+ v.getDisciplina() + " - " 
		+ v.getTurma() + " - " 
		+ v.getCH() / 20 );
		}
		
		System.out.println("====================================================");
		
		
		for(int i = 0; i < valores.size(); i++) {
			System.out.println(valores.get(i).getDocente() + " : "
					+ valores.get(i).getDisciplina() + " - " 
					+ valores.get(i).getTurma() + " - " 
					+ valores.get(i).getCH() / 20 );
					
		}
		
		//System.out.println(valores.get(Integer.parseInt(data[7])); //teste novo
		
		

	}

}