package Jd;

import Lc.InterfaceC1185m;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface l {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6420a = new a();

        @Override // Jd.l
        public boolean a(InterfaceC1185m what, InterfaceC1185m from) {
            AbstractC4862t.e(what, "what");
            AbstractC4862t.e(from, "from");
            return true;
        }
    }

    boolean a(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2);
}
