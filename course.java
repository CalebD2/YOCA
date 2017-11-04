package Alpha;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class course {
	
	private String name;
	private String code;
	private int id;
	private ArrayList<distribution> distributions;
	
	public course(String name, int id, String code) {
		this.distributions = (new ArrayList<distribution>());
		this.name = name;
		this.id = id;
		this.code = code;
	}
	
	public void addDistribution(String name, double weight) {
		distribution temp = new distribution(name, weight);
		this.distributions.add(temp);
	}
	
	public void removeDistribution(int index) {
		this.distributions.remove(index);
	}
	
	public int findDistribution(String name) {
		int index = -1;
		for(int i=0; i<distributions.size(); i++) {
			if(distributions.get(i).getName()==name) {
				index = i;
				break;
			}
		}
		return index;
	}
        
        public String[] getDistributions(){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add("Select Distribution...");
            for(int i = 0; i < distributions.size(); i++){
                temp.add(distributions.get(i).getName());
            }
            
            return temp.toArray(new String[temp.size()]);
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
	
	public double calcGrade() {
		double total = 0;
		for(int i=0; i<distributions.size(); i++) {
			total += (distributions.get(i).getGrade()/distributions.get(i).getPoints())*distributions.get(i).getWeight();
		}
		return total;
	}
	
	
	
}
