package D7;

import A7.E;
import A7.I;
import A7.InterfaceC0677a;
import A7.InterfaceC0680d;
import A7.z;
import B7.F;
import B7.J;
import B7.b0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import z7.AbstractC6534f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a implements InterfaceC0677a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f2279p = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f2280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f2282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f2283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f2284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f2285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f2286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f2287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f2288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f2289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f2290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f2291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f2292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f2293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f2294o;

    public a(Context context, File file, I i10, J j10) {
        Executor executorA = AbstractC6534f.a();
        F f10 = new F(context);
        f fVar = new Object() { // from class: D7.f
        };
        this.f2280a = new Handler(Looper.getMainLooper());
        this.f2290k = new AtomicReference();
        this.f2291l = Collections.synchronizedSet(new HashSet());
        this.f2292m = Collections.synchronizedSet(new HashSet());
        this.f2293n = new AtomicBoolean(false);
        this.f2281b = context;
        this.f2289j = file;
        this.f2282c = i10;
        this.f2283d = j10;
        this.f2287h = executorA;
        this.f2284e = f10;
        this.f2294o = fVar;
        this.f2286g = new b0();
        this.f2285f = new b0();
        this.f2288i = E.INSTANCE;
    }

    @Override // A7.InterfaceC0677a
    public final void a(InterfaceC0680d interfaceC0680d) {
        this.f2286g.b(interfaceC0680d);
    }

    @Override // A7.InterfaceC0677a
    public final Set b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f2282c.b());
        hashSet.addAll(this.f2291l);
        return hashSet;
    }

    @Override // A7.InterfaceC0677a
    public final void c(InterfaceC0680d interfaceC0680d) {
        this.f2286g.a(interfaceC0680d);
    }
}
