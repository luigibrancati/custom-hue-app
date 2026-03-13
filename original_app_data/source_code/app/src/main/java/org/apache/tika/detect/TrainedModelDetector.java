package org.apache.tika.detect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class TrainedModelDetector implements Detector {
    private static final long serialVersionUID = 1;
    private final Map<MediaType, TrainedModel> MODEL_MAP = new HashMap();

    public TrainedModelDetector() {
        loadDefaultModels(getClass().getClassLoader());
    }

    private void writeHisto(float[] fArr) throws IOException {
        BufferedWriter bufferedWriterNewBufferedWriter = Files.newBufferedWriter(new TemporaryResources().createTempFile(), StandardCharsets.UTF_8, new OpenOption[0]);
        try {
            for (float f10 : fArr) {
                bufferedWriterNewBufferedWriter.write(f10 + "\t");
            }
            bufferedWriterNewBufferedWriter.write("\r\n");
            bufferedWriterNewBufferedWriter.close();
        } catch (Throwable th) {
            if (bufferedWriterNewBufferedWriter != null) {
                try {
                    bufferedWriterNewBufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return null;
        }
        inputStream.mark(getMinLength());
        float[] byteFrequencies = readByteFrequencies(inputStream);
        MediaType mediaType = MediaType.OCTET_STREAM;
        float f10 = 0.5f;
        for (Map.Entry<MediaType, TrainedModel> entry : this.MODEL_MAP.entrySet()) {
            MediaType key = entry.getKey();
            float fPredict = entry.getValue().predict(byteFrequencies);
            if (f10 < fPredict) {
                f10 = fPredict;
                mediaType = key;
            }
        }
        inputStream.reset();
        return mediaType;
    }

    public int getMinLength() {
        return Integer.MAX_VALUE;
    }

    public abstract void loadDefaultModels(InputStream inputStream);

    public abstract void loadDefaultModels(ClassLoader classLoader);

    public void loadDefaultModels(Path path) {
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                loadDefaultModels(inputStreamNewInputStream);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new RuntimeException("Unable to read the default media type registry", e10);
        }
    }

    public float[] readByteFrequencies(InputStream inputStream) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStream);
        float[] fArr = new float[257];
        fArr[0] = 1.0f;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5120);
        float fMax = -1.0f;
        for (int i10 = readableByteChannelNewChannel.read(byteBufferAllocate); i10 != -1; i10 = readableByteChannelNewChannel.read(byteBufferAllocate)) {
            byteBufferAllocate.flip();
            while (byteBufferAllocate.hasRemaining()) {
                byte b10 = byteBufferAllocate.get();
                int i11 = b10 + 1;
                if (b10 < 0) {
                    i11 = b10 + 257;
                    fArr[i11] = fArr[i11] + 1.0f;
                } else {
                    fArr[i11] = fArr[i11] + 1.0f;
                }
                fMax = Math.max(fMax, fArr[i11]);
            }
            byteBufferAllocate.clear();
        }
        for (int i12 = 1; i12 < 257; i12++) {
            float f10 = fArr[i12] / fMax;
            fArr[i12] = f10;
            fArr[i12] = (float) Math.sqrt(f10);
        }
        return fArr;
    }

    public void registerModels(MediaType mediaType, TrainedModel trainedModel) {
        this.MODEL_MAP.put(mediaType, trainedModel);
    }

    public void loadDefaultModels(File file) {
        loadDefaultModels(file.toPath());
    }
}
