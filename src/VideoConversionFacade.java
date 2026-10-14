import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: Начало конвертации...");

        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);

        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4Codec();
        } else {
            destinationCodec = new OggCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        AudioMixer mixer = new AudioMixer();
        File result = mixer.fix(intermediateResult);

        System.out.println("VideoConversionFacade: Конвертация завершена.");
        return result;
    }
}