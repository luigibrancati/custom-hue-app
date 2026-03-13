package G3;

import C3.t;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4467a = a.f4468a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f4468a = new a();

        public final f a() {
            return Build.VERSION.SDK_INT >= 34 ? h.f4470b : g.f4469b;
        }
    }

    t a(Context context, c cVar);

    t b(Context context, c cVar);
}
