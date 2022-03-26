public class Main {

    public static void main(String[] args) {

        Camera camera = Camera.getInstance();

        camera.setName("SONY");
        System.out.println("Camera Name: " + camera.getName());
    }
}
