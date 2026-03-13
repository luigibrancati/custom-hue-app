package Qc;

import Lc.b0;
import Rc.p;
import ad.InterfaceC2685a;
import ad.InterfaceC2686b;
import bd.InterfaceC2920l;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements InterfaceC2686b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f14275a = new l();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2685a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f14276b;

        public a(p javaElement) {
            AbstractC4862t.e(javaElement, "javaElement");
            this.f14276b = javaElement;
        }

        @Override // Lc.a0
        public b0 b() {
            b0 NO_SOURCE_FILE = b0.f8747a;
            AbstractC4862t.d(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // ad.InterfaceC2685a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p c() {
            return this.f14276b;
        }

        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    @Override // ad.InterfaceC2686b
    public InterfaceC2685a a(InterfaceC2920l javaElement) {
        AbstractC4862t.e(javaElement, "javaElement");
        return new a((p) javaElement);
    }
}
