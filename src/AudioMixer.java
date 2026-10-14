import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("AudioMixer: Обработка аудиопотока...");
        return new File("converted_" + result.getName());
    }
}