package emailApp;

public class emailApp {

	public static void main(String[] args) {
		
		email em1=new email("John", "Smith");
		em1.changePassword("devillover");
		em1.setAlternativeEmail("armanahmedjony786@gmail.com");
		System.out.println(em1.getAlternativeEmail());
		System.out.println(em1.showInfo());
	
	
	}

}
