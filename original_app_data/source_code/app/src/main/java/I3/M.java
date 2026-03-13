package I3;

import J3.g0;
import android.content.Context;
import gc.C4205s;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5571a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public M a(Context context) {
            AbstractC4862t.e(context, "context");
            g0 g0VarL = g0.l(context);
            AbstractC4862t.d(g0VarL, "getInstance(...)");
            return g0VarL;
        }

        public void b(Context context, androidx.work.a configuration) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(configuration, "configuration");
            g0.g(context, configuration);
        }

        public a() {
        }
    }

    public static M e(Context context) {
        return f5571a.a(context);
    }

    public static void g(Context context, androidx.work.a aVar) {
        f5571a.b(context, aVar);
    }

    public abstract y a(String str);

    public abstract y b(UUID uuid);

    public final y c(N request) {
        AbstractC4862t.e(request, "request");
        return d(C4205s.d(request));
    }

    public abstract y d(List list);

    public abstract O7.e f(String str);
}
