package Z7;

import Z7.InterfaceC2604n;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f20386b = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20387c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20388a = new AtomicReference();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements InterfaceC2604n {
        public b() {
        }

        @Override // Z7.InterfaceC2604n
        public InterfaceC2604n.a a(InterfaceC2599i interfaceC2599i, C2603m c2603m, String str, String str2) {
            return o.f20380a;
        }
    }

    public static s b() {
        return f20386b;
    }

    public InterfaceC2604n a() {
        InterfaceC2604n interfaceC2604n = (InterfaceC2604n) this.f20388a.get();
        return interfaceC2604n == null ? f20387c : interfaceC2604n;
    }
}
