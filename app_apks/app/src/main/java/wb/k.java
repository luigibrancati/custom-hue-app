package wb;

import Rd.C2123d0;
import Rd.M;
import Rd.N;
import android.content.Context;
import android.content.res.AssetManager;
import cb.C3092c;
import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.gltfio.UbershaderProvider;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.AbstractC4754a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import yb.AbstractC6458a;
import zb.AbstractC6555a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Engine f46504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f46506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UbershaderProvider f46507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4028k f46508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4028k f46509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC4028k f46510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4028k f46511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC4028k f46512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC4028k f46513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC4028k f46514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC4028k f46515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC4028k f46516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f46517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f46518o;

    public k(Engine engine, Context context, M coroutineScope) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(coroutineScope, "coroutineScope");
        this.f46504a = engine;
        this.f46505b = context;
        this.f46506c = coroutineScope;
        this.f46507d = new UbershaderProvider(engine);
        this.f46508e = C4029l.b(new InterfaceC6082a() { // from class: wb.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.x(this.f46495a);
            }
        });
        this.f46509f = C4029l.b(new InterfaceC6082a() { // from class: wb.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.z(this.f46496a);
            }
        });
        this.f46510g = C4029l.b(new InterfaceC6082a() { // from class: wb.d
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.y(this.f46497a);
            }
        });
        this.f46511h = C4029l.b(new InterfaceC6082a() { // from class: wb.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.A(this.f46498a);
            }
        });
        this.f46512i = C4029l.b(new InterfaceC6082a() { // from class: wb.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.w(this.f46499a);
            }
        });
        this.f46513j = C4029l.b(new InterfaceC6082a() { // from class: wb.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.C(this.f46500a);
            }
        });
        this.f46514k = C4029l.b(new InterfaceC6082a() { // from class: wb.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.B(this.f46501a);
            }
        });
        this.f46515l = C4029l.b(new InterfaceC6082a() { // from class: wb.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.D(this.f46502a);
            }
        });
        this.f46516m = C4029l.b(new InterfaceC6082a() { // from class: wb.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.E(this.f46503a);
            }
        });
        this.f46517n = new ArrayList();
        this.f46518o = new ArrayList();
    }

    public static final Material A(k kVar) {
        return kVar.n("materials/transparent_textured.filamat");
    }

    public static final Material B(k kVar) {
        return kVar.n("materials/video_texture_chroma_key.filamat");
    }

    public static final Material C(k kVar) {
        return kVar.n("materials/video_texture.filamat");
    }

    public static final Material D(k kVar) {
        return kVar.n("materials/view_texture_lit.filamat");
    }

    public static final Material E(k kVar) {
        return kVar.n("materials/view_texture_unlit.filamat");
    }

    public static /* synthetic */ MaterialInstance l(k kVar, int i10, float f10, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.4f;
        }
        if ((i11 & 8) != 0) {
            f12 = 0.5f;
        }
        return kVar.j(i10, f10, f11, f12);
    }

    public static final Material w(k kVar) {
        return kVar.n("materials/image_texture.filamat");
    }

    public static final Material x(k kVar) {
        return kVar.n("materials/opaque_colored.filamat");
    }

    public static final Material y(k kVar) {
        return kVar.n("materials/opaque_textured.filamat");
    }

    public static final Material z(k kVar) {
        return kVar.n("materials/transparent_colored.filamat");
    }

    public final MaterialInstance j(int i10, float f10, float f11, float f12) {
        return k(AbstractC6555a.g(i10), f10, f11, f12);
    }

    public final MaterialInstance k(C3092c color, float f10, float f11, float f12) {
        AbstractC4862t.e(color, "color");
        MaterialInstance materialInstanceM = m(color.a() == 1.0f ? u() : v());
        AbstractC6458a.c(materialInstanceM, color, null, 2, null);
        AbstractC6458a.e(materialInstanceM, f10);
        AbstractC6458a.i(materialInstanceM, f11);
        AbstractC6458a.h(materialInstanceM, f12);
        return materialInstanceM;
    }

    public final MaterialInstance m(Material material) {
        AbstractC4862t.e(material, "material");
        MaterialInstance materialInstanceCreateInstance = material.createInstance();
        this.f46518o.add(materialInstanceCreateInstance);
        AbstractC4862t.d(materialInstanceCreateInstance, "also(...)");
        return materialInstanceCreateInstance;
    }

    public final Material n(String assetFileLocation) {
        AbstractC4862t.e(assetFileLocation, "assetFileLocation");
        AssetManager assetManagerS = s();
        AbstractC4862t.d(assetManagerS, "<get-assets>(...)");
        return o(Cb.c.b(assetManagerS, assetFileLocation));
    }

    public final Material o(Buffer payload) {
        AbstractC4862t.e(payload, "payload");
        Material materialBuild = new Material.Builder().payload(payload, payload.remaining()).build(this.f46504a);
        AbstractC4862t.d(materialBuild, "build(...)");
        this.f46517n.add(materialBuild);
        return materialBuild;
    }

    public final void p() {
        N.c(this.f46506c, null, 1, null);
        Iterator it = C4179C.V0(this.f46518o).iterator();
        while (it.hasNext()) {
            r((MaterialInstance) it.next());
        }
        this.f46518o.clear();
        Iterator it2 = C4179C.V0(this.f46517n).iterator();
        while (it2.hasNext()) {
            q((Material) it2.next());
        }
        this.f46517n.clear();
    }

    public final void q(Material material) {
        AbstractC4862t.e(material, "material");
        if (this.f46517n.contains(material)) {
            Engine engine = this.f46504a;
            MaterialInstance defaultInstance = material.getDefaultInstance();
            AbstractC4862t.d(defaultInstance, "getDefaultInstance(...)");
            AbstractC4754a.m(engine, defaultInstance);
            AbstractC4754a.l(this.f46504a, material);
            this.f46517n.remove(material);
        }
    }

    public final void r(MaterialInstance materialInstance) {
        AbstractC4862t.e(materialInstance, "materialInstance");
        if (this.f46518o.contains(materialInstance)) {
            AbstractC4754a.m(this.f46504a, materialInstance);
            this.f46518o.remove(materialInstance);
        }
    }

    public final AssetManager s() {
        return this.f46505b.getAssets();
    }

    public final Engine t() {
        return this.f46504a;
    }

    public final Material u() {
        return (Material) this.f46508e.getValue();
    }

    public final Material v() {
        return (Material) this.f46509f.getValue();
    }

    public /* synthetic */ k(Engine engine, Context context, M m10, int i10, AbstractC4854k abstractC4854k) {
        this(engine, context, (i10 & 4) != 0 ? N.a(C2123d0.b()) : m10);
    }
}
