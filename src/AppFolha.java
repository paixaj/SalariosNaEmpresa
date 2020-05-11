import model.Diretor;
import model.Funcionario;

public class AppFolha {
	public static void main(String args[]) {
		Funcionario f = new Funcionario("Isidro","isi@isi.com",1000.0f);
		Diretor d = new Diretor("Nanci","nance@nanci.com",5000.0f,2000.0f);
		
		//f.setNome("Isidro");
		//f.setEmail("isi@isi.com");
		//f.setSalario(1000.0f);
		
		//d.setNome("Nanci");
		//d.setEmail("nanci@nanci.com");
		//d.setSalario(5000.0f);
		//d.setBeneficio(2000.0f);

		f.imprimirInfo();
		
		System.out.println("\n\n");
		
		d.imprimirInfo();
		
	}

}
