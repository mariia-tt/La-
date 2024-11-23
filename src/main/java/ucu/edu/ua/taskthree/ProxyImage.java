package ucu.edu.ua.taskthree;

public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    public static void main(String[] args) {
        ProxyImage proxyObject = new ProxyImage("11_lab_OOP.png");
        proxyObject.display();
    }
}
