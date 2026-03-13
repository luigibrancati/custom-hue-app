package sc;

import Od.C1823c;
import fc.C4015H;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class j extends i {
    public static final ByteBuffer c(int i10, CharsetEncoder encoder) {
        AbstractC4862t.e(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        AbstractC4862t.d(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final CharsetEncoder d(Charset charset) {
        AbstractC4862t.e(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final String e(File file, Charset charset) throws IOException {
        AbstractC4862t.e(file, "<this>");
        AbstractC4862t.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strD = o.d(inputStreamReader);
            c.a(inputStreamReader, null);
            return strD;
        } finally {
        }
    }

    public static /* synthetic */ String f(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C1823c.f12394b;
        }
        return e(file, charset);
    }

    public static final void g(File file, String text, Charset charset) throws IOException {
        AbstractC4862t.e(file, "<this>");
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i(fileOutputStream, text, charset);
            C4015H c4015h = C4015H.f34254a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void h(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = C1823c.f12394b;
        }
        g(file, str, charset);
    }

    public static final void i(OutputStream outputStream, String text, Charset charset) throws IOException {
        AbstractC4862t.e(outputStream, "<this>");
        AbstractC4862t.e(text, "text");
        AbstractC4862t.e(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            AbstractC4862t.d(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderD = d(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        AbstractC4862t.b(charsetEncoderD);
        ByteBuffer byteBufferC = c(8192, charsetEncoderD);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC4862t.d(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderD.encode(charBufferAllocate, byteBufferC, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferC.array(), 0, byteBufferC.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferC.clear();
            i10 = i12;
        }
    }
}
