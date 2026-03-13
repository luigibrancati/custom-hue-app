package P1;

import P1.t;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12655a;

        public a(Throwable th, int i10) {
            super(th);
            this.f12655a = i10;
        }
    }

    static void g(m mVar, m mVar2) {
        if (mVar == mVar2) {
            return;
        }
        if (mVar2 != null) {
            mVar2.d(null);
        }
        if (mVar != null) {
            mVar.c(null);
        }
    }

    UUID a();

    boolean b();

    void c(t.a aVar);

    void d(t.a aVar);

    a e();

    J1.b f();

    int getState();

    Map h();

    boolean i(String str);
}
