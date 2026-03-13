package s6;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: s6.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5779I extends C5780J {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Callable f44137f;

    public /* synthetic */ C5779I(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f44137f = callable;
    }

    @Override // s6.C5780J
    public final String a() {
        try {
            return (String) this.f44137f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
