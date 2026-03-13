package M4;

import gc.C4206t;
import io.sentry.TraceContext;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0142a f9267c = new C0142a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f9268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N4.c f9269b;

    /* JADX INFO: renamed from: M4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0142a {
        public /* synthetic */ C0142a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0142a() {
        }
    }

    public a(f configuration) throws IOException {
        AbstractC4862t.e(configuration, "configuration");
        this.f9268a = configuration;
        File fileG = configuration.g();
        N4.a.a(fileG);
        N4.c cVar = new N4.c(fileG, configuration.c(), configuration.f());
        this.f9269b = cVar;
        cVar.d();
        d();
    }

    @Override // M4.k
    public void a(String str) {
        N4.c cVar = this.f9269b;
        if (str == null) {
            str = "";
        }
        cVar.e(TraceContext.JsonKeys.USER_ID, str);
    }

    @Override // M4.k
    public void b(String str) {
        N4.c cVar = this.f9269b;
        if (str == null) {
            str = "";
        }
        cVar.e("device_id", str);
    }

    public final boolean c(String str, String str2) {
        String strC;
        if (str2 == null || (strC = this.f9269b.c(str, null)) == null) {
            return true;
        }
        return AbstractC4862t.a(strC, str2);
    }

    public final void d() {
        if (!c("api_key", this.f9268a.a()) || !c("experiment_api_key", this.f9268a.b())) {
            this.f9269b.f(C4206t.n(TraceContext.JsonKeys.USER_ID, "device_id", "api_key", "experiment_api_key"));
        }
        String strA = this.f9268a.a();
        if (strA != null) {
            this.f9269b.e("api_key", strA);
        }
        String strB = this.f9268a.b();
        if (strB != null) {
            this.f9269b.e("experiment_api_key", strB);
        }
    }

    @Override // M4.k
    public e load() {
        return new e(this.f9269b.c(TraceContext.JsonKeys.USER_ID, null), this.f9269b.c("device_id", null));
    }
}
