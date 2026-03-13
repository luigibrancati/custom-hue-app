package C3;

import C3.v;
import android.app.Activity;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1146a = a.f1147a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f1147a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static vc.l f1148b = new vc.l() { // from class: C3.u
            @Override // vc.l
            public final Object invoke(Object obj) {
                return v.a.b((v) obj);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f1149c = new w(null, 1, 0 == true ? 1 : 0);

        public static final v b(v it) {
            AbstractC4862t.e(it, "it");
            return it;
        }

        public final v c() {
            return (v) f1148b.invoke(f1149c);
        }
    }

    static v a() {
        return f1146a.c();
    }

    t b(Activity activity);
}
