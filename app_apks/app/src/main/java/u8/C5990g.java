package u8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import x8.F;

/* JADX INFO: renamed from: u8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5990g implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45334c;

    public C5990g(String str, String str2, byte[] bArr) {
        this.f45333b = str;
        this.f45334c = str2;
        this.f45332a = bArr;
    }

    @Override // u8.P
    public F.d.b a() {
        byte[] bArrC = c();
        if (bArrC == null) {
            return null;
        }
        return F.d.b.a().b(bArrC).c(this.f45333b).a();
    }

    @Override // u8.P
    public String b() {
        return this.f45334c;
    }

    public final byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f45332a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final boolean d() {
        byte[] bArr = this.f45332a;
        return bArr == null || bArr.length == 0;
    }

    @Override // u8.P
    public InputStream h() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f45332a);
    }
}
