package task02;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        try {
            fileManager.copyAnyFile("task02\\test.txt");
            fileManager.readAnyFile("task02\\fileCopy.txt");
            fileManager.writeAnyFile("12354\n54321", "task02\\newText.txt");
        } catch (Exception e) {
            System.out.println("Возникла ошибка: " + e.getMessage());
        }
         
    }
}
