package X6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18467b;

    public /* synthetic */ O6(R6 r62, String str, byte[] bArr) {
        this(r62, str);
    }

    public O6(R6 r62, String str) {
        Objects.requireNonNull(r62);
        this.f18466a = str;
        this.f18467b = r62.e().c();
    }

    public /* synthetic */ O6(R6 r62, byte[] bArr) {
        this(r62, r62.N0().l0());
    }
}
