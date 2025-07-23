package DecoratorDesignPattern.Ques2;

public class ItalicsTextDecorator extends TextEditorDecorator{
    public ItalicsTextDecorator(TextEditor textEditor){
        super(textEditor);
    }

    @Override
    public String render(){
        return super.render() + " with Italics.";
    }
}
