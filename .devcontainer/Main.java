public class Main {
    public static void main(String[] args) {
        System.out.println("Application started.");

        // Usando Proxy la carga no ocurre inmediatamente
        Image image = new ProxyImage("photo.jpg");
        System.out.println("Proxy created, but RealImage not loaded yet.");

        // La carga solo ocurre aquí, cuando realmente necesitamos mostrar la imagen
        image.display();

        // Segunda llamada: ya está cargada, no se vuelve a cargar
        System.out.println("Second call:");
        image.display();
    }
}