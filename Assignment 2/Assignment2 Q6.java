abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    public String persist() {
    	return "Present";
    }
}
class DatabasePersistence extends Persistence{
    public String persist() {
    	return "Present";
    }
}
class client extends Persistence{
	public String persist() {
    	return "Present";
    }
}


public class Assignment2Q6 {
    public static void main(String[] args) {}
}