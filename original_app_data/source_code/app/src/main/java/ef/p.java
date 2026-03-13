package ef;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f34067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f34068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f34070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34071e;

    public p() {
    }

    public static void b(OutputStream outputStream, String str) throws IOException {
        for (int i10 = 0; i10 < str.length(); i10++) {
            outputStream.write(str.charAt(i10));
        }
    }

    public static void c(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10);
        outputStream.write(i10 >> 8);
        outputStream.write(i10 >> 16);
        outputStream.write(i10 >> 24);
    }

    public static void d(OutputStream outputStream, short s10) throws IOException {
        outputStream.write(s10);
        outputStream.write(s10 >> 8);
    }

    public int a(OutputStream outputStream) throws IOException {
        b(outputStream, "RIFF");
        c(outputStream, this.f34071e + 36);
        b(outputStream, "WAVE");
        b(outputStream, "fmt ");
        c(outputStream, 16);
        d(outputStream, this.f34067a);
        d(outputStream, this.f34068b);
        c(outputStream, this.f34069c);
        c(outputStream, ((this.f34068b * this.f34069c) * this.f34070d) / 8);
        d(outputStream, (short) ((this.f34068b * this.f34070d) / 8));
        d(outputStream, this.f34070d);
        b(outputStream, "data");
        c(outputStream, this.f34071e);
        return 44;
    }

    public String toString() {
        return String.format("WaveHeader format=%d numChannels=%d sampleRate=%d bitsPerSample=%d numBytes=%d", Short.valueOf(this.f34067a), Short.valueOf(this.f34068b), Integer.valueOf(this.f34069c), Short.valueOf(this.f34070d), Integer.valueOf(this.f34071e));
    }

    public p(short s10, short s11, int i10, short s12, int i11) {
        this.f34067a = s10;
        this.f34069c = i10;
        this.f34068b = s11;
        this.f34070d = s12;
        this.f34071e = i11;
    }
}
