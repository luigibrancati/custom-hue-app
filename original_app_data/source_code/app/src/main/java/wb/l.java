package wb;

import Rd.C2123d0;
import Rd.M;
import Rd.N;
import android.content.Context;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.ResourceLoader;
import com.google.android.filament.gltfio.UbershaderProvider;
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

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f46519h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46520i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Engine f46521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f46523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UbershaderProvider f46524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetLoader f46525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ResourceLoader f46526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f46527g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public l(Engine engine, Context context, M coroutineScope) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(coroutineScope, "coroutineScope");
        this.f46521a = engine;
        this.f46522b = context;
        this.f46523c = coroutineScope;
        UbershaderProvider ubershaderProvider = new UbershaderProvider(engine);
        this.f46524d = ubershaderProvider;
        this.f46525e = new AssetLoader(engine, ubershaderProvider, EntityManager.get());
        this.f46526f = new ResourceLoader(engine, true);
        this.f46527g = new ArrayList();
    }

    public final void a() {
        try {
            C4035r.a aVar = C4035r.f34274b;
            N.c(this.f46523c, null, 1, null);
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th));
        }
        this.f46526f.asyncCancelLoad();
        this.f46526f.evictResourceData();
        Iterator it = C4179C.V0(this.f46527g).iterator();
        while (it.hasNext()) {
            c((FilamentAsset) it.next());
        }
        this.f46527g.clear();
    }

    public final void b() {
        a();
        this.f46525e.destroy();
        this.f46524d.destroyMaterials();
        this.f46524d.destroy();
        this.f46526f.destroy();
    }

    public final void c(FilamentAsset model) {
        AbstractC4862t.e(model, "model");
        AbstractC4754a.o(this.f46525e, model);
        this.f46527g.remove(model);
    }

    public final AssetLoader d() {
        return this.f46525e;
    }

    public final ResourceLoader e() {
        return this.f46526f;
    }

    public /* synthetic */ l(Engine engine, Context context, M m10, int i10, AbstractC4854k abstractC4854k) {
        this(engine, context, (i10 & 4) != 0 ? N.a(C2123d0.b()) : m10);
    }

    public final void f() {
    }
}
