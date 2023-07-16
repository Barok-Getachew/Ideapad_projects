public class OpenFileCommand implements Command {

  private TextFile textFile;
  OpenFileCommand(TextFile textFile){
      this.textFile = textFile;
  }
    @Override
    public String excecute() {
        return textFile.open();
    }
}
