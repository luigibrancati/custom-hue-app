package R9;

import android.content.Context;
import b7.AbstractC2879m;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;
import o8.C5233c;
import o8.C5236f;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: R9.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2111i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f14958b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2111i f14959c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o8.n f14960a;

    public static C2111i c() {
        C2111i c2111i;
        synchronized (f14958b) {
            AbstractC6056k.q(f14959c != null, "MlKitContext has not been initialized");
            c2111i = (C2111i) AbstractC6056k.l(f14959c);
        }
        return c2111i;
    }

    public static C2111i d(Context context) {
        C2111i c2111iE;
        synchronized (f14958b) {
            c2111iE = e(context, AbstractC2879m.f25415a);
        }
        return c2111iE;
    }

    public static C2111i e(Context context, Executor executor) {
        C2111i c2111i;
        synchronized (f14958b) {
            AbstractC6056k.q(f14959c == null, "MlKitContext is already initialized");
            C2111i c2111i2 = new C2111i();
            f14959c = c2111i2;
            Context contextF = f(context);
            o8.n nVarE = o8.n.l(executor).d(C5236f.c(contextF, MlKitComponentDiscoveryService.class).b()).b(C5233c.q(contextF, Context.class, new Class[0])).b(C5233c.q(c2111i2, C2111i.class, new Class[0])).e();
            c2111i2.f14960a = nVarE;
            nVarE.o(true);
            c2111i = f14959c;
        }
        return c2111i;
    }

    public static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public Object a(Class cls) {
        AbstractC6056k.q(f14959c == this, "MlKitContext has been deleted");
        AbstractC6056k.l(this.f14960a);
        return this.f14960a.get(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
