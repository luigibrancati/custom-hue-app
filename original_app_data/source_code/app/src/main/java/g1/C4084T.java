package g1;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.T, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4084T extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f34873b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4084T(Throwable readException, int i10) {
        super(i10, null);
        AbstractC4862t.e(readException, "readException");
        this.f34873b = readException;
    }

    public final Throwable b() {
        return this.f34873b;
    }
}
