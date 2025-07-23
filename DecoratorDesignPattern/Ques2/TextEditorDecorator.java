package DecoratorDesignPattern.Ques2;

public abstract class TextEditorDecorator implements TextEditor{
    protected TextEditor textEditor;

    public TextEditorDecorator(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public String render(){
        return textEditor.render();
    }

}
