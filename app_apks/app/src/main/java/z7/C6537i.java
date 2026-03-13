package z7;

import java.io.File;

/* JADX INFO: renamed from: z7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6537i implements InterfaceC6542n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C6538j f48811a;

    public C6537i(C6538j c6538j) {
        this.f48811a = c6538j;
    }

    @Override // z7.InterfaceC6542n
    public final void a(C6543o c6543o, File file, boolean z10) {
        this.f48811a.f48813b.add(file);
        if (z10) {
            return;
        }
        this.f48811a.f48814c.set(false);
    }
}
