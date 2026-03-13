package B7;

import java.io.File;
import java.util.Set;

/* JADX INFO: renamed from: B7.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0713v implements InterfaceC0702j {
    @Override // B7.InterfaceC0702j
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z10) {
        return AbstractC0706n.d(classLoader, file, file2, z10, new C0707o(), "path", new C0712u());
    }

    @Override // B7.InterfaceC0702j
    public final void b(ClassLoader classLoader, Set set) {
        AbstractC0711t.c(classLoader, set);
    }
}
