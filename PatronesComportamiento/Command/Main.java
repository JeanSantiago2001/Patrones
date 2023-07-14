package Command;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Comand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setComand(command);
        invoker.executeCommand();
    }
}
