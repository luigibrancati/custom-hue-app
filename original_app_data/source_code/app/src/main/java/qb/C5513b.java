package qb;

import Bb.a;
import android.content.res.AssetManager;
import android.util.Size;
import cb.C3092c;
import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Scene;
import com.google.android.filament.Texture;
import com.google.ar.core.Camera;
import com.google.ar.core.Frame;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.core.Session;
import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingState;
import gc.T;
import gc.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb.AbstractC4754a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lb.i;
import mb.AbstractC5039d;
import mb.AbstractC5040e;
import mb.AbstractC5041f;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import wb.k;
import wb.l;
import yb.AbstractC6458a;

/* JADX INFO: renamed from: qb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5513b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f43414r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f43415s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Engine f43416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f43417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scene f43418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Size f43419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f43420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Texture f43421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Material f43422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f43423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Material f43424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EnumC0580b f43425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f43426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f43427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f43429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f43430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f43431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Frame f43432q;

    /* JADX INFO: renamed from: qb.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: qb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class EnumC0580b {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ EnumC0580b[] $VALUES;
        public static final EnumC0580b RENDER_ALL = new EnumC0580b("RENDER_ALL", 0);
        public static final EnumC0580b RENDER_CENTER = new EnumC0580b("RENDER_CENTER", 1);

        static {
            EnumC0580b[] enumC0580bArrA = a();
            $VALUES = enumC0580bArrA;
            $ENTRIES = AbstractC5277b.a(enumC0580bArrA);
        }

        public EnumC0580b(String str, int i10) {
        }

        public static final /* synthetic */ EnumC0580b[] a() {
            return new EnumC0580b[]{RENDER_ALL, RENDER_CENTER};
        }

        public static EnumC0580b valueOf(String str) {
            return (EnumC0580b) Enum.valueOf(EnumC0580b.class, str);
        }

        public static EnumC0580b[] values() {
            return (EnumC0580b[]) $VALUES.clone();
        }
    }

    public C5513b(Engine engine, l modelLoader, k materialLoader, Scene scene) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(modelLoader, "modelLoader");
        AbstractC4862t.e(materialLoader, "materialLoader");
        AbstractC4862t.e(scene, "scene");
        this.f43416a = engine;
        this.f43417b = modelLoader;
        this.f43418c = scene;
        this.f43420e = new LinkedHashMap();
        a.C0021a c0021a = new a.C0021a();
        AssetManager assetManagerS = materialLoader.s();
        AbstractC4862t.d(assetManagerS, "<get-assets>(...)");
        Texture textureBuild = a.C0021a.c(c0021a, assetManagerS, "textures/plane_renderer.png", null, 4, null).build(engine);
        this.f43421f = textureBuild;
        Material materialN = materialLoader.n("materials/plane_renderer.filamat");
        MaterialInstance defaultInstance = materialN.getDefaultInstance();
        AbstractC4862t.b(defaultInstance);
        AbstractC6458a.k(defaultInstance, "texture", textureBuild, null, 4, null);
        defaultInstance.setParameter("uvScale", 8.0f, (textureBuild.getWidth(0) / textureBuild.getHeight(0)) * 8.0f);
        AbstractC6458a.f(defaultInstance, "color", new C3092c(1.0f, 1.0f, 1.0f, 0.0f, 8, null));
        defaultInstance.setParameter("radius", 0.5f);
        this.f43422g = materialN;
        this.f43423h = new ArrayList();
        this.f43424i = materialLoader.n("materials/plane_renderer_shadow.filamat");
        this.f43425j = EnumC0580b.RENDER_CENTER;
        this.f43426k = 4.0f;
        this.f43427l = 10;
        this.f43428m = true;
        this.f43429n = true;
        this.f43430o = true;
    }

    public static final boolean c(Map.Entry entry) {
        AbstractC4862t.e(entry, "<destruct>");
        Plane plane = (Plane) entry.getKey();
        i iVar = (i) entry.getValue();
        if (plane.getSubsumedBy() == null && plane.getTrackingState() != TrackingState.STOPPED) {
            return false;
        }
        iVar.b();
        return true;
    }

    public static /* synthetic */ void g(C5513b c5513b, Plane plane, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        c5513b.f(plane, z10);
    }

    public final void b() {
        y.H(this.f43420e.entrySet(), new vc.l() { // from class: qb.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C5513b.c((Map.Entry) obj));
            }
        });
    }

    public final void d() {
        Iterator it = this.f43420e.entrySet().iterator();
        while (it.hasNext()) {
            ((i) ((Map.Entry) it.next()).getValue()).b();
        }
        Iterator it2 = this.f43423h.iterator();
        while (it2.hasNext()) {
            AbstractC4754a.m(this.f43416a, (MaterialInstance) it2.next());
        }
        Engine engine = this.f43416a;
        MaterialInstance defaultInstance = this.f43422g.getDefaultInstance();
        AbstractC4862t.d(defaultInstance, "getDefaultInstance(...)");
        AbstractC4754a.m(engine, defaultInstance);
        AbstractC4754a.l(this.f43416a, this.f43422g);
        AbstractC4754a.u(this.f43416a, this.f43421f);
        Engine engine2 = this.f43416a;
        MaterialInstance defaultInstance2 = this.f43424i.getDefaultInstance();
        AbstractC4862t.d(defaultInstance2, "getDefaultInstance(...)");
        AbstractC4754a.m(engine2, defaultInstance2);
        AbstractC4754a.l(this.f43416a, this.f43424i);
    }

    public final Size e() {
        Size size = this.f43419d;
        if (size != null) {
            return size;
        }
        AbstractC4862t.p("viewSize");
        return null;
    }

    public final void f(Plane plane, boolean z10) {
        if (plane.getTrackingState() == TrackingState.TRACKING || plane.getSubsumedBy() == null) {
            i iVar = (i) this.f43420e.get(plane);
            if (iVar == null) {
                iVar = new i(this.f43416a, this.f43417b, this.f43418c, plane);
                MaterialInstance materialInstanceCreateInstance = this.f43422g.createInstance();
                this.f43423h.add(materialInstanceCreateInstance);
                iVar.e(materialInstanceCreateInstance);
                MaterialInstance materialInstanceCreateInstance2 = this.f43424i.createInstance();
                this.f43423h.add(materialInstanceCreateInstance2);
                iVar.f(materialInstanceCreateInstance2);
                iVar.g(this.f43430o);
                boolean z11 = false;
                iVar.h(this.f43429n && z10);
                if (this.f43428m && this.f43431p) {
                    z11 = true;
                }
                iVar.d(z11);
                this.f43420e.put(plane, iVar);
            }
            iVar.i();
        }
    }

    public final void h(boolean z10) {
        if (this.f43431p != z10) {
            this.f43431p = z10;
            Iterator it = this.f43420e.values().iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(this.f43428m && z10);
            }
        }
    }

    public final void i(boolean z10) {
        if (this.f43428m != z10) {
            this.f43428m = z10;
            Iterator it = this.f43420e.values().iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(z10);
            }
        }
    }

    public final void j(boolean z10) {
        if (this.f43430o != z10) {
            this.f43430o = z10;
            Iterator it = this.f43420e.values().iterator();
            while (it.hasNext()) {
                ((i) it.next()).g(z10);
            }
        }
    }

    public final void k(Size size) {
        AbstractC4862t.e(size, "<set-?>");
        this.f43419d = size;
    }

    public final void l(boolean z10) {
        if (this.f43429n != z10) {
            this.f43429n = z10;
            Iterator it = this.f43420e.values().iterator();
            while (it.hasNext()) {
                ((i) it.next()).h(z10);
            }
        }
    }

    public final void m(Session session, Frame frame) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(frame, "frame");
        if (!this.f43428m || AbstractC5040e.a(frame, this.f43432q) >= this.f43427l) {
            return;
        }
        this.f43432q = frame;
        Camera camera = frame.getCamera();
        AbstractC4862t.d(camera, "getCamera(...)");
        h(AbstractC5039d.b(camera));
        try {
            Collection<Plane> collectionB = AbstractC5040e.b(frame);
            EnumC0580b enumC0580b = this.f43425j;
            Plane plane = null;
            if (enumC0580b == EnumC0580b.RENDER_ALL) {
                for (Plane plane2 : collectionB) {
                    AbstractC4862t.b(plane2);
                    g(this, plane2, false, 2, null);
                }
            } else if (enumC0580b == EnumC0580b.RENDER_CENTER) {
                if (this.f43429n) {
                    List<HitResult> listHitTest = frame.hitTest(e().getWidth() / 2.0f, e().getHeight() / 2.0f);
                    AbstractC4862t.d(listHitTest, "hitTest(...)");
                    HitResult hitResultB = AbstractC5041f.b(listHitTest, T.c(Plane.Type.HORIZONTAL_UPWARD_FACING), false, false, false, null, null, false, null, null, 510, null);
                    Trackable trackable = hitResultB != null ? hitResultB.getTrackable() : null;
                    if (trackable instanceof Plane) {
                        plane = (Plane) trackable;
                    }
                }
                for (Plane plane3 : collectionB) {
                    AbstractC4862t.b(plane3);
                    f(plane3, AbstractC4862t.a(plane3, plane));
                }
                for (Map.Entry entry : this.f43420e.entrySet()) {
                    Plane plane4 = (Plane) entry.getKey();
                    i iVar = (i) entry.getValue();
                    if (!collectionB.contains(plane4)) {
                        iVar.h(this.f43429n && AbstractC4862t.a(plane4, plane));
                    }
                }
            }
            b();
        } catch (Exception unused) {
        }
    }
}
