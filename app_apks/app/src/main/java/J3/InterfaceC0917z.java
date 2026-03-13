package J3;

import Q3.C1877w;
import Q3.q0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: J3.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0917z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6100a = a.f6101a;

    /* JADX INFO: renamed from: J3.z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f6101a = new a();

        public static /* synthetic */ InterfaceC0917z c(a aVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return aVar.b(z10);
        }

        public final InterfaceC0917z a() {
            return c(this, false, 1, null);
        }

        public final InterfaceC0917z b(boolean z10) {
            A a10 = new A();
            return z10 ? new B(a10) : a10;
        }
    }

    static InterfaceC0917z b(boolean z10) {
        return f6100a.b(z10);
    }

    static InterfaceC0917z create() {
        return f6100a.a();
    }

    C0916y a(C1877w c1877w);

    boolean c(C1877w c1877w);

    C0916y d(C1877w c1877w);

    default C0916y e(Q3.I spec) {
        AbstractC4862t.e(spec, "spec");
        return d(q0.a(spec));
    }

    List remove(String str);
}
