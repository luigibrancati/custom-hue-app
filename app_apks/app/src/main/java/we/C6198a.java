package we;

import Fe.InterfaceC0845g;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.u;

/* JADX INFO: renamed from: we.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6198a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0640a f46538c = new C0640a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0845g f46539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46540b;

    /* JADX INFO: renamed from: we.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0640a {
        public /* synthetic */ C0640a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0640a() {
        }
    }

    public C6198a(InterfaceC0845g source) {
        AbstractC4862t.e(source, "source");
        this.f46539a = source;
        this.f46540b = 262144L;
    }

    public final u a() {
        u.a aVar = new u.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.d();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String strO = this.f46539a.O(this.f46540b);
        this.f46540b -= (long) strO.length();
        return strO;
    }
}
