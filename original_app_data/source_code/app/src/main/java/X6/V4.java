package X6;

import java.net.URL;
import java.util.Map;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f18618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T4 f18620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f18622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W4 f18623f;

    public V4(W4 w42, String str, URL url, byte[] bArr, Map map, T4 t42) {
        Objects.requireNonNull(w42);
        this.f18623f = w42;
        AbstractC6056k.f(str);
        AbstractC6056k.l(url);
        AbstractC6056k.l(t42);
        this.f18618a = url;
        this.f18619b = bArr;
        this.f18620c = t42;
        this.f18621d = str;
        this.f18622e = map;
    }

    public final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f18620c.a(this.f18621d, i10, exc, bArr, map);
    }

    public final void b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f18623f.f18400a.b().t(new Runnable() { // from class: X6.U4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18589a.a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X6.V4] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.V4.run():void");
    }
}
