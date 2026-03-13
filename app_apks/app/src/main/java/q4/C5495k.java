package q4;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: q4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5495k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43227a;

    public C5495k() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.f43227a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5495k) && this.f43227a == ((C5495k) obj).f43227a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f43227a);
    }

    public String toString() {
        return "RageClickOptions(enabled=" + this.f43227a + ')';
    }

    public C5495k(boolean z10) {
        this.f43227a = z10;
    }

    public /* synthetic */ C5495k(boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
