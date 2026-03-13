package s6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: s6.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5807z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile v6.F f44190g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Context f44192i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractBinderC5805x f44184a = new BinderC5796o(AbstractBinderC5802u.X("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractBinderC5805x f44185b = new BinderC5797p(AbstractBinderC5802u.X("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractBinderC5805x f44186c = new BinderC5798q(AbstractBinderC5802u.X("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractBinderC5805x f44187d = new BinderC5799r(AbstractBinderC5802u.X("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractBinderC5805x f44188e = new BinderC5800s(AbstractBinderC5802u.X("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractBinderC5805x f44189f = new BinderC5801t(AbstractBinderC5802u.X("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f44191h = new Object();

    public static synchronized void a(Context context) {
        if (f44192i != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f44192i = context.getApplicationContext();
        }
    }

    public static void b() {
        if (f44190g != null) {
            return;
        }
        AbstractC6056k.l(f44192i);
        synchronized (f44191h) {
            try {
                if (f44190g == null) {
                    f44190g = zzac.zzb(DynamiteModule.e(f44192i, DynamiteModule.f29115f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C5780J c(C5778H c5778h) {
        C5780J c5780jD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC6056k.l(f44192i);
            try {
                b();
                AbstractC6056k.l(f44192i);
                C5771A c5771aB = c5778h.b(f44192i);
                try {
                    C5773C c5773cE0 = c5778h.a() ? f44190g.E0(c5771aB) : f44190g.k3(c5771aB);
                    if (c5773cE0.zza()) {
                        c5780jD = C5780J.f(c5773cE0.h(), c5773cE0.e());
                    } else {
                        String strD = c5773cE0.d();
                        PackageManager.NameNotFoundException nameNotFoundException = c5773cE0.f() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strD == null) {
                            strD = "error checking package certificate";
                        }
                        c5780jD = C5780J.g(c5773cE0.h(), c5773cE0.f(), strD, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    c5780jD = C5780J.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                c5780jD = C5780J.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return c5780jD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public static C5780J d(String str, AbstractBinderC5802u abstractBinderC5802u, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, abstractBinderC5802u, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static /* synthetic */ String e(boolean z10, String str, AbstractBinderC5802u abstractBinderC5802u) {
        String str2 = (z10 || !f(str, abstractBinderC5802u, true, false).f44139a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = B6.a.b("SHA-256");
        AbstractC6056k.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, B6.j.a(messageDigestB.digest(abstractBinderC5802u.K())), Boolean.valueOf(z10), "12451000.false");
    }

    public static C5780J f(final String str, final AbstractBinderC5802u abstractBinderC5802u, final boolean z10, boolean z11) {
        try {
            b();
            AbstractC6056k.l(f44192i);
            try {
                return f44190g.o0(new C5775E(str, abstractBinderC5802u, z10, z11), ObjectWrapper.wrap(f44192i.getPackageManager())) ? C5780J.b() : new C5779I(new Callable() { // from class: s6.w
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return AbstractC5807z.e(z10, str, abstractBinderC5802u);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C5780J.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C5780J.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
