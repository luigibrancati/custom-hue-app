package wb;

import Rd.C2123d0;
import Rd.M;
import Rd.N;
import android.content.Context;
import com.google.android.filament.Engine;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.AbstractC4754a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import tb.C5872a;
import tb.C5876e;

/* JADX INFO: renamed from: wb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6183a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Engine f46490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f46492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5876e f46493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f46494e;

    public C6183a(Engine engine, Context context, M coroutineScope) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(coroutineScope, "coroutineScope");
        this.f46490a = engine;
        this.f46491b = context;
        this.f46492c = coroutineScope;
        this.f46493d = new C5876e(engine);
        this.f46494e = new ArrayList();
    }

    public final void a() {
        try {
            C4035r.a aVar = C4035r.f34274b;
            N.c(this.f46492c, null, 1, null);
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th));
        }
        Iterator it = C4179C.V0(this.f46494e).iterator();
        while (it.hasNext()) {
            c((C5872a) it.next());
        }
        this.f46494e.clear();
    }

    public final void b() {
        a();
        this.f46493d.e();
    }

    public final void c(C5872a environment) {
        AbstractC4862t.e(environment, "environment");
        IndirectLight indirectLightA = environment.a();
        if (indirectLightA != null) {
            C4035r.a(AbstractC4754a.k(this.f46490a, indirectLightA));
        }
        Skybox skyboxB = environment.b();
        if (skyboxB != null) {
            C4035r.a(AbstractC4754a.t(this.f46490a, skyboxB));
        }
        this.f46494e.remove(environment);
    }

    public final Context d() {
        return this.f46491b;
    }

    public final Engine e() {
        return this.f46490a;
    }

    public final C5876e f() {
        return this.f46493d;
    }

    public /* synthetic */ C6183a(Engine engine, Context context, M m10, int i10, AbstractC4854k abstractC4854k) {
        this(engine, context, (i10 & 4) != 0 ? N.a(C2123d0.b()) : m10);
    }
}
