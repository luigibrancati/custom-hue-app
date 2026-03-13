package I1;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f5507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f5508g;

    public s(int i10, String str, IOException iOException, Map map, j jVar, byte[] bArr) {
        super("Response code: " + i10, iOException, jVar, 2004, 1);
        this.f5505d = i10;
        this.f5506e = str;
        this.f5507f = map;
        this.f5508g = bArr;
    }
}
