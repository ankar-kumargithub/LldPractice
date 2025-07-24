package DecoratorDesignPattern.Ques2;

public class Main {
    public static void main(String args[]){
        TextEditor textEditor = new BasicTextEditor();
        System.out.println(textEditor.render());

        TextEditorDecorator boldTextEditorDecorator = new BoldTextDecorator(textEditor);
        System.out.println(boldTextEditorDecorator.render());

        TextEditorDecorator italicsTextEditorDecorator = new ItalicsTextDecorator(boldTextEditorDecorator);
        System.out.println(italicsTextEditorDecorator.render());

    }
}
