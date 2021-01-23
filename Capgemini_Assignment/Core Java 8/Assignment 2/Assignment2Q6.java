abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Available";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Available";
    }
}
//Cannot make object of Persistence, because it is a abstract class.
class client extends Persistence{
	public String persist() {
    	return "Available";
    }
}


public class Assignment2Q6 {
    public static void main(String[] args) {}
}
