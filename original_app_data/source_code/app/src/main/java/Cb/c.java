package Cb;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final FloatBuffer a(FloatBuffer floatBuffer) {
        AbstractC4862t.e(floatBuffer, "<this>");
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(floatBuffer.capacity());
        floatBuffer.rewind();
        floatBufferAllocate.put(floatBuffer);
        floatBuffer.rewind();
        floatBufferAllocate.flip();
        return floatBufferAllocate;
    }

    public static final ByteBuffer b(AssetManager assetManager, String fileLocation) throws IOException {
        AbstractC4862t.e(assetManager, "<this>");
        AbstractC4862t.e(fileLocation, "fileLocation");
        InputStream inputStreamOpen = assetManager.open(fileLocation);
        AbstractC4862t.d(inputStreamOpen, "open(...)");
        return c(inputStreamOpen);
    }

    public static final ByteBuffer c(InputStream inputStream) {
        AbstractC4862t.e(inputStream, "<this>");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(d(inputStream));
        AbstractC4862t.d(byteBufferWrap, "let(...)");
        return byteBufferWrap;
    }

    public static final byte[] d(InputStream inputStream) throws IOException {
        AbstractC4862t.e(inputStream, "<this>");
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            sc.c.a(inputStream, null);
            return bArr;
        } finally {
        }
    }
}
