package CompositeDesignPattern.Ques1;

import java.util.*;

public class Directory implements FileSystem {
    private String directoryName;
    private List<FileSystem> elements;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.elements = new ArrayList<>();
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Directory: " + directoryName);
        for (FileSystem element : elements) {
            element.display(indent + "   ");
        }

    }

    @Override
    public String getName() {
        return this.directoryName;
    }

    public void add(FileSystem component) {
        this.elements.add(component);
    }

    public void remove(FileSystem component) {
        System.out.println(component.getName() + " removed from Directory: " + this.directoryName);
        for (FileSystem element : elements) {
            if (element.equals(component)) {
                elements.remove(component);
                break;
            }
        }
    }
}
