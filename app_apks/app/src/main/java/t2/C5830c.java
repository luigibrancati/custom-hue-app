package t2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: t2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5830c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f44563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f44564b;

    public C5830c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f44563a = byteArrayOutputStream;
        this.f44564b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(C5828a c5828a) {
        this.f44563a.reset();
        try {
            b(this.f44564b, c5828a.f44557a);
            String str = c5828a.f44558b;
            if (str == null) {
                str = "";
            }
            b(this.f44564b, str);
            this.f44564b.writeLong(c5828a.f44559c);
            this.f44564b.writeLong(c5828a.f44560d);
            this.f44564b.write(c5828a.f44561e);
            this.f44564b.flush();
            return this.f44563a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
