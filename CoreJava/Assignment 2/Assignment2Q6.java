abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() { return "File Persistance"; }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() { return "Database Persistance"; }
}
class Client extends Persistence{
    @Override
    public String persist() { return "Client Persistance"; }

}
public class Assignment2Q6 {
    public static void main(String[] args) {}
}