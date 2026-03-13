package g1;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4067B extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f34814b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4067B(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        AbstractC4862t.e(finalException, "finalException");
        this.f34814b = finalException;
    }

    public final Throwable b() {
        return this.f34814b;
    }
}
