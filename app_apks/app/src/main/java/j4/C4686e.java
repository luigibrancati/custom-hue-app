package j4;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: j4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4686e implements InterfaceC4690i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC4689h f38979c;

    public C4686e(AbstractC4689h size) {
        AbstractC4862t.e(size, "size");
        this.f38979c = size;
    }

    @Override // j4.InterfaceC4690i
    public Object a(InterfaceC4988e interfaceC4988e) {
        return this.f38979c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4686e) && AbstractC4862t.a(this.f38979c, ((C4686e) obj).f38979c);
        }
        return true;
    }

    public int hashCode() {
        return this.f38979c.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f38979c + ')';
    }
}
