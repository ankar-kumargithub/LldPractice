package CompositeDesignPattern.Ques1;

public class File implements FileSystem{
    private String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display(String indent){
        System.out.println(indent + "- " + fileName);
    }
    
    @Override
    public String getName(){
        return this.fileName;
    }

}
