import java.util.TreeSet;
public class Register {
	 private String vename;
	    private String name;
	      
	    public Register(String a,String b){
	        this.vename=a;
	        this.name=b;
	    }

		@Override
		public String toString() {
			return "[Vehicalname=" + vename + ",Username=" + name + "]";
		}  
	        
	    
}
