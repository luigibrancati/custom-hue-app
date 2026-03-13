package R9;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: R9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2106d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.b f14953a;

    public C2106d(O8.b bVar) {
        this.f14953a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f14953a.get();
    }
}
