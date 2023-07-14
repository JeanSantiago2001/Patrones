package Command;

public class Invoker {

    private Comand comand;

    public void setComand(Comand comand) {
        this.comand = comand;
    }
    public void executeCommand() {
        comand.execute();
    }
}
