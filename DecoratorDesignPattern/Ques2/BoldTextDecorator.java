package DecoratorDesignPattern.Ques2;

public class BoldTextDecorator extends TextEditorDecorator{
    public BoldTextDecorator(TextEditor editor){
        super(editor);
    }

    @Override
    public String render(){
        return super.render() + " with Bold Design";
    }
}
