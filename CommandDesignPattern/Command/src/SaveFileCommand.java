public class SaveFileCommand implements Command {
     private TextFile textFile;
     SaveFileCommand(TextFile textFile){
         this.textFile = textFile;
     }

    @Override
    public String excecute() {
        return textFile.save();
    }
}
