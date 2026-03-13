package x0;

import java.util.concurrent.atomic.AtomicInteger;
import l0.InterfaceC4869e;
import vc.l;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6285e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicInteger f47270a = new AtomicInteger(0);

    public static final int a() {
        return f47270a.addAndGet(1);
    }

    public static final InterfaceC4869e b(InterfaceC4869e interfaceC4869e, boolean z10, l lVar) {
        return interfaceC4869e.b(new C6282b(z10, lVar));
    }

    public static /* synthetic */ InterfaceC4869e c(InterfaceC4869e interfaceC4869e, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(interfaceC4869e, z10, lVar);
    }
}
