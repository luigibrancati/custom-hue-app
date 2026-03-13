package s9;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import s9.o;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44327b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f44328a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public b(Context appContext) {
        AbstractC4862t.e(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f44328a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // s9.o
    public Boolean a() {
        if (this.f44328a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f44328a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // s9.o
    public Pd.a b() {
        if (this.f44328a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return Pd.a.q(Pd.c.s(this.f44328a.getInt("firebase_sessions_sessions_restart_timeout"), Pd.d.SECONDS));
        }
        return null;
    }

    @Override // s9.o
    public Double c() {
        if (this.f44328a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f44328a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // s9.o
    public Object d(InterfaceC4988e interfaceC4988e) {
        return o.a.a(this, interfaceC4988e);
    }
}
