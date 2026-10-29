public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Carga la imagen solo cuando es necesario
        }
        realImage.display(); // Delega la ejecución al objeto real
    }
}