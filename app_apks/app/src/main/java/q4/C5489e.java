package q4;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: q4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5489e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43170a;

    public C5489e() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.f43170a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5489e) && this.f43170a == ((C5489e) obj).f43170a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f43170a);
    }

    public String toString() {
        return "DeadClickOptions(enabled=" + this.f43170a + ')';
    }

    public C5489e(boolean z10) {
        this.f43170a = z10;
    }

    public /* synthetic */ C5489e(boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
