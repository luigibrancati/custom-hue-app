package Ie;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5849b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f5849b = bArr;
    }

    @Override // Ie.a
    public InputStream b() {
        return new ByteArrayInputStream(this.f5849b);
    }

    public b(byte[] bArr) {
        this(null, bArr);
    }
}
