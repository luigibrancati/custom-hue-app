package P7;

import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3952C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f13131a;

    public b(InputStream inputStream) {
        this.f13131a = inputStream;
    }

    public static p b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // P7.p
    public e8.t a() throws IOException {
        try {
            return e8.t.T(this.f13131a, C3669p.b());
        } finally {
            this.f13131a.close();
        }
    }

    @Override // P7.p
    public C3952C read() throws IOException {
        try {
            return C3952C.Y(this.f13131a, C3669p.b());
        } finally {
            this.f13131a.close();
        }
    }
}
