package O6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: O6.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1726o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H8.e f11777c;

    public C1726o(Map map, Map map2, H8.e eVar) {
        this.f11775a = map;
        this.f11776b = map2;
        this.f11777c = eVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C1705l(byteArrayOutputStream, this.f11775a, this.f11776b, this.f11777c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
