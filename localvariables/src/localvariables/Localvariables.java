package localvariables;

public class Localvariables {

	  int a = 40;
	    void localVariable() {
	       
	        int a = 60;
	        System.out.println("Local variable a : " + a);
	    }
	public static void main(String[] args) {
		
		 Localvariables obj = new Localvariables();
	        System.out.println("Instance variable a : " + obj.a);
	        //calling method()
	        obj.localVariable();
	}
}
// NOTE : IN JAVA WE HAVE ONLY LOCAL VARIABLES , CLASS VARIABLES , INSTANCE VARIABLES AND THERE IS NO CONCEPT OF GOLBAL VARIABLES