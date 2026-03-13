package z;

import java.util.Objects;
import z.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48675a;

    public n(Object obj) {
        this.f48675a = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return Objects.equals(this.f48675a, ((n) obj).f48675a);
        }
        return false;
    }

    public int hashCode() {
        return this.f48675a.hashCode();
    }

    @Override // z.i.a
    public void a(long j10) {
    }

    @Override // z.i.a
    public void f(int i10) {
    }
}
