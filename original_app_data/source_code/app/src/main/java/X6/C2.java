package X6;

import java.util.Map;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B2 f18177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f18179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f18182f;

    public /* synthetic */ C2(String str, B2 b22, int i10, Throwable th, byte[] bArr, Map map, byte[] bArr2) {
        AbstractC6056k.l(b22);
        this.f18177a = b22;
        this.f18178b = i10;
        this.f18179c = th;
        this.f18180d = bArr;
        this.f18181e = str;
        this.f18182f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18177a.a(this.f18181e, this.f18178b, this.f18179c, this.f18180d, this.f18182f);
    }
}
