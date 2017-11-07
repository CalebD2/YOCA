package Alpha;
import java.util.ArrayList;
import java.util.Hashtable;


public class course {
	
	private String name;
	private String code;
	private int id;
	private Hashtable<String, distribution> distributions;
	
	public course(String name, int id, String code) {
		this.distributions = (new Hashtable<String, distribution>());
		this.name = name;
		this.id = id;
		this.code = code;
	}
	
	public boolean addDistribution(String name, double weight) {
		distribution temp = new distribution(name, weight);
		if(distributions.contains(name)) {
			return false;
		}
		else {
			this.distributions.put(name, temp);
			return true;
		}
	}
	
	public boolean removeDistribution(String name) {
		if(distributions.contains(name)) {
			this.distributions.remove(name);
			return true;
		}
		else {
			return false;
		}
	}
        
    public String[] getDistributions(){
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("Select Distribution...");
            for(String keys:distributions.keySet()){
                temp.add(distributions.get(keys).getName());
            }
            
        return temp.toArray(new String[temp.size()]);
    }
    
    public distribution getDistribution(String name) {
    	
    	return distributions.get(name);
    }
    
    public singleGrade getSingleGrade(String name, String gradeName) {
    	return distributions.get(name).getSingleGrade(gradeName);
    }
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public void changeCode(String code) {
		this.code = code;
	}
	
	public void changeId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getDistSize() {
		return distributions.size();
	}
	
	public boolean changeDistName(String name, String replace) {
		 if(distributions.contains(replace)) {
	    		distribution temp = distributions.get(replace);
		    	temp.changeName(name);
		    	distributions.remove(replace);
		    	distributions.put(name, temp);
		    	return true;
		    }
		    else {
		    	return false;
		    }
	}
	
	public double calcGrade() {
		double total = 0;
		for(String keys:distributions.keySet()) {
			total += (distributions.get(keys).getGrade()/distributions.get(keys).getPoints())*distributions.get(keys).getWeight();
		}
		return total;
	}
	
	
	
}
