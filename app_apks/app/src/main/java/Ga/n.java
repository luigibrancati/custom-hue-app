package Ga;

import android.util.Log;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4662b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4663a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public n(boolean z10) {
        this.f4663a = z10;
    }

    public final void a(String msg) {
        AbstractC4862t.e(msg, "msg");
        if (this.f4663a) {
            Log.d("HueWidget", msg);
        }
    }

    public final void b(String msg) {
        AbstractC4862t.e(msg, "msg");
        if (this.f4663a) {
            Log.e("HueWidget", msg);
        }
    }

    public final void c(String msg) {
        AbstractC4862t.e(msg, "msg");
        if (this.f4663a) {
            Log.w("HueWidget", msg);
        }
    }
}
