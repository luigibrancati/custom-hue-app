package P1;

import L1.B0;
import P1.m;
import P1.t;
import P1.u;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f12675a = new a();

    m a(t.a aVar, D1.o oVar);

    int b(D1.o oVar);

    void c(Looper looper, B0 b02);

    default b d(t.a aVar, D1.o oVar) {
        return b.f12676a;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12676a = new b() { // from class: P1.v
            @Override // P1.u.b
            public final void release() {
                u.b.a();
            }
        };

        void release();

        static /* synthetic */ void a() {
        }
    }

    default void release() {
    }

    default void u() {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements u {
        @Override // P1.u
        public m a(t.a aVar, D1.o oVar) {
            if (oVar.f1809s == null) {
                return null;
            }
            return new z(new m.a(new J(1), 6001));
        }

        @Override // P1.u
        public int b(D1.o oVar) {
            return oVar.f1809s != null ? 1 : 0;
        }

        @Override // P1.u
        public void c(Looper looper, B0 b02) {
        }
    }
}
