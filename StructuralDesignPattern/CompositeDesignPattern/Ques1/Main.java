package CompositeDesignPattern.Ques1;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Directory subDir = new Directory("subdir");
        File file3 = new File("file3.txt");
        root.add(file1);
        root.add(file2);
        subDir.add(file3);
        root.add(subDir);
        root.display("");
        System.out.println();
        root.remove(subDir);
        System.out.println();
        root.display("");
        System.out.println();
        root.remove(file1);
        System.out.println();
        root.display("");
    }
}
