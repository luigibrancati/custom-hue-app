package W8;

import X8.a;
import b9.C2898a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements a.InterfaceC0243a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2898a f17863a = C2898a.e();

    @Override // X8.a.InterfaceC0243a
    public void a() {
        try {
            e.c();
        } catch (IllegalStateException e10) {
            f17863a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
