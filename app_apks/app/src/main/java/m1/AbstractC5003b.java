package m1;

import Y0.E;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import m1.C5002a;

/* JADX INFO: renamed from: m1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5003b implements C5002a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f40116m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f40117n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f40118o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f40119p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f40120q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f40121r = new l("rotation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f40122s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f40123t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f40124u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f40125v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f40126w = new C0527b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f40127x = new c(ViewHierarchyNode.JsonKeys.ALPHA);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f40128y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f40129z = new e("scrollY");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC5004c f40134e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f40130a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f40131b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40132c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40135f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f40136g = Float.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f40137h = -Float.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f40138i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f40140k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f40141l = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f40133d = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f40139j = 1.0f;

    /* JADX INFO: renamed from: m1.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0527b extends s {
        public C0527b(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return E.G(view);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            E.w0(view, f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends AbstractC5004c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C5005d f40142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C5005d c5005d) {
            super(str);
            this.f40142b = c5005d;
        }

        @Override // m1.AbstractC5004c
        public float a(Object obj) {
            return this.f40142b.a();
        }

        @Override // m1.AbstractC5004c
        public void b(Object obj, float f10) {
            this.f40142b.b(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return E.E(view);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            E.v0(view, f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$l */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$m */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$n */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$o */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // m1.AbstractC5004c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    /* JADX INFO: renamed from: m1.b$p */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f40144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f40145b;
    }

    /* JADX INFO: renamed from: m1.b$q */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface q {
        void a(AbstractC5003b abstractC5003b, boolean z10, float f10, float f11);
    }

    /* JADX INFO: renamed from: m1.b$r */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface r {
        void g(AbstractC5003b abstractC5003b, float f10, float f11);
    }

    /* JADX INFO: renamed from: m1.b$s */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class s extends AbstractC5004c {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public AbstractC5003b(C5005d c5005d) {
        this.f40134e = new f("FloatValueHolder", c5005d);
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // m1.C5002a.b
    public boolean a(long j10) {
        long j11 = this.f40138i;
        if (j11 == 0) {
            this.f40138i = j10;
            l(this.f40131b);
            return false;
        }
        this.f40138i = j10;
        boolean zR = r(j10 - j11);
        float fMin = Math.min(this.f40131b, this.f40136g);
        this.f40131b = fMin;
        float fMax = Math.max(fMin, this.f40137h);
        this.f40131b = fMax;
        l(fMax);
        if (zR) {
            d(false);
        }
        return zR;
    }

    public AbstractC5003b b(q qVar) {
        if (!this.f40140k.contains(qVar)) {
            this.f40140k.add(qVar);
        }
        return this;
    }

    public AbstractC5003b c(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f40141l.contains(rVar)) {
            this.f40141l.add(rVar);
        }
        return this;
    }

    public final void d(boolean z10) {
        this.f40135f = false;
        C5002a.d().g(this);
        this.f40138i = 0L;
        this.f40132c = false;
        for (int i10 = 0; i10 < this.f40140k.size(); i10++) {
            if (this.f40140k.get(i10) != null) {
                ((q) this.f40140k.get(i10)).a(this, z10, this.f40131b, this.f40130a);
            }
        }
        h(this.f40140k);
    }

    public final float e() {
        return this.f40134e.a(this.f40133d);
    }

    public float f() {
        return this.f40139j * 0.75f;
    }

    public boolean g() {
        return this.f40135f;
    }

    public AbstractC5003b i(float f10) {
        this.f40136g = f10;
        return this;
    }

    public AbstractC5003b j(float f10) {
        this.f40137h = f10;
        return this;
    }

    public AbstractC5003b k(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f40139j = f10;
        o(f10 * 0.75f);
        return this;
    }

    public void l(float f10) {
        this.f40134e.b(this.f40133d, f10);
        for (int i10 = 0; i10 < this.f40141l.size(); i10++) {
            if (this.f40141l.get(i10) != null) {
                ((r) this.f40141l.get(i10)).g(this, this.f40131b, this.f40130a);
            }
        }
        h(this.f40141l);
    }

    public AbstractC5003b m(float f10) {
        this.f40131b = f10;
        this.f40132c = true;
        return this;
    }

    public AbstractC5003b n(float f10) {
        this.f40130a = f10;
        return this;
    }

    public abstract void o(float f10);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f40135f) {
            return;
        }
        q();
    }

    public final void q() {
        if (this.f40135f) {
            return;
        }
        this.f40135f = true;
        if (!this.f40132c) {
            this.f40131b = e();
        }
        float f10 = this.f40131b;
        if (f10 > this.f40136g || f10 < this.f40137h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        C5002a.d().a(this, 0L);
    }

    public abstract boolean r(long j10);
}
