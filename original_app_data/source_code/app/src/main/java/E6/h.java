package E6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f3332a;

    public h(a aVar) {
        Objects.requireNonNull(aVar);
        this.f3332a = aVar;
    }

    @Override // E6.i
    public final int a() {
        return 5;
    }

    @Override // E6.i
    public final void b(b bVar) {
        this.f3332a.k().onResume();
    }
}
