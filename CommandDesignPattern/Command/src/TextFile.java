//receiver
public class TextFile {
    private String name;

    TextFile(String name){
        this.name = name;
    }

    public String open(){
        return "file opened successfully " + name;
    }

    public String save(){
        return "file saved successfully " + name;
    }
}
