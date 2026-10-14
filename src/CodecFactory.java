public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: Извлечен MPEG4 кодек...");
            return new MPEG4Codec();
        } else {
            System.out.println("CodecFactory: Извлечен OGG кодек...");
            return new OggCodec();
        }
    }
}

interface Codec {}

class MPEG4Codec implements Codec {}
class OggCodec implements Codec {}