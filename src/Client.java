import java.io.File;

public class Client {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("funny-cats-video.ogg", "mp4");
        System.out.println("Готовый файл: " + mp4Video.getName());
    }
}