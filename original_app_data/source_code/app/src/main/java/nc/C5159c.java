package nc;

import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: nc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5159c implements InterfaceC4988e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5159c f40766a = new C5159c();

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // lc.InterfaceC4988e
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
