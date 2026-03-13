package ud;

import Bd.n;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ud.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6020b implements InterfaceC6019a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f45551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bd.b f45552b;

    public C6020b(n storageManager, Iterable samWithReceiverResolvers) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f45551a = samWithReceiverResolvers;
        this.f45552b = storageManager.d();
    }
}
