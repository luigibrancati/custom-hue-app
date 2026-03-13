package N6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H8.e f10096c;

    public V1(Map map, Map map2, H8.e eVar) {
        this.f10094a = map;
        this.f10095b = map2;
        this.f10096c = eVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new S1(byteArrayOutputStream, this.f10094a, this.f10095b, this.f10096c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
