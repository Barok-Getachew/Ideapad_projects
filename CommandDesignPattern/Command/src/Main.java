public class Main {
    public static void main(String[] args) {


        OpenFileCommand openCommand = new OpenFileCommand(new TextFile("file1"));
        SaveFileCommand saveCommand  = new SaveFileCommand(new TextFile("file2"));

        Invoker invoker1 = new Invoker(openCommand);
        invoker1.executeCommand();
        Invoker invoker2 = new Invoker(saveCommand);
        invoker2.executeCommand();
    }
}