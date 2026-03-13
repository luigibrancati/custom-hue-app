package L;

import L.C1095e0;

/* JADX INFO: renamed from: L.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1097f0 {

    /* JADX INFO: renamed from: L.f0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC1097f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1095e0 f8058a = new C1095e0.a().h();

        @Override // L.InterfaceC1097f0
        public C1095e0 a() {
            return this.f8058a;
        }

        @Override // L.InterfaceC1097f0
        public int getId() {
            return 0;
        }
    }

    C1095e0 a();

    int getId();
}
