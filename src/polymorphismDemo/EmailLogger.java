package polymorphismDemo;

public class EmailLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println("Log to email : "+message);
    }
}
