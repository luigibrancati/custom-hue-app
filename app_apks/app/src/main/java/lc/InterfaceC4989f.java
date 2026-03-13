package lc;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: lc.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4989f extends InterfaceC4992i.b {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final b f40086j0 = b.f40087a;

    /* JADX INFO: renamed from: lc.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static InterfaceC4992i.b a(InterfaceC4989f interfaceC4989f, InterfaceC4992i.c key) {
            InterfaceC4992i.b bVarB;
            AbstractC4862t.e(key, "key");
            if (!(key instanceof AbstractC4985b)) {
                if (InterfaceC4989f.f40086j0 != key) {
                    return null;
                }
                AbstractC4862t.c(interfaceC4989f, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC4989f;
            }
            AbstractC4985b abstractC4985b = (AbstractC4985b) key;
            if (!abstractC4985b.a(interfaceC4989f.getKey()) || (bVarB = abstractC4985b.b(interfaceC4989f)) == null) {
                return null;
            }
            return bVarB;
        }

        public static InterfaceC4992i b(InterfaceC4989f interfaceC4989f, InterfaceC4992i.c key) {
            AbstractC4862t.e(key, "key");
            if (!(key instanceof AbstractC4985b)) {
                return InterfaceC4989f.f40086j0 == key ? C4993j.f40088a : interfaceC4989f;
            }
            AbstractC4985b abstractC4985b = (AbstractC4985b) key;
            return (!abstractC4985b.a(interfaceC4989f.getKey()) || abstractC4985b.b(interfaceC4989f) == null) ? interfaceC4989f : C4993j.f40088a;
        }
    }

    /* JADX INFO: renamed from: lc.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC4992i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f40087a = new b();
    }

    InterfaceC4988e g0(InterfaceC4988e interfaceC4988e);

    void o(InterfaceC4988e interfaceC4988e);
}
