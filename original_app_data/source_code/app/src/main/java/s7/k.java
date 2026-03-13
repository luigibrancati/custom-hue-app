package s7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s7.c f44249m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f44250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f44251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f44252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f44253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s7.c f44254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s7.c f44255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s7.c f44256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s7.c f44257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f44258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f44259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f44260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f44261l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        s7.c a(s7.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    public static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new C5808a(i12));
    }

    public static b d(Context context, int i10, int i11, s7.c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, c7.j.f26121S3);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(c7.j.f26128T3, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(c7.j.f26149W3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(c7.j.f26156X3, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(c7.j.f26142V3, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(c7.j.f26135U3, i12);
            s7.c cVarM = m(typedArrayObtainStyledAttributes, c7.j.f26163Y3, cVar);
            s7.c cVarM2 = m(typedArrayObtainStyledAttributes, c7.j.f26186b4, cVarM);
            s7.c cVarM3 = m(typedArrayObtainStyledAttributes, c7.j.f26194c4, cVarM);
            s7.c cVarM4 = m(typedArrayObtainStyledAttributes, c7.j.f26178a4, cVarM);
            return new b().y(i13, cVarM2).C(i14, cVarM3).u(i15, cVarM4).q(i16, m(typedArrayObtainStyledAttributes, c7.j.f26170Z3, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new C5808a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, s7.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c7.j.f26169Z2, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c7.j.f26177a3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(c7.j.f26185b3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    public static s7.c m(TypedArray typedArray, int i10, s7.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new C5808a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public f h() {
        return this.f44260k;
    }

    public d i() {
        return this.f44253d;
    }

    public s7.c j() {
        return this.f44257h;
    }

    public d k() {
        return this.f44252c;
    }

    public s7.c l() {
        return this.f44256g;
    }

    public f n() {
        return this.f44261l;
    }

    public f o() {
        return this.f44259j;
    }

    public f p() {
        return this.f44258i;
    }

    public d q() {
        return this.f44250a;
    }

    public s7.c r() {
        return this.f44254e;
    }

    public d s() {
        return this.f44251b;
    }

    public s7.c t() {
        return this.f44255f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f44261l.getClass().equals(f.class) && this.f44259j.getClass().equals(f.class) && this.f44258i.getClass().equals(f.class) && this.f44260k.getClass().equals(f.class);
        float fA = this.f44254e.a(rectF);
        return z10 && ((this.f44255f.a(rectF) > fA ? 1 : (this.f44255f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f44257h.a(rectF) > fA ? 1 : (this.f44257h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f44256g.a(rectF) > fA ? 1 : (this.f44256g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f44251b instanceof j) && (this.f44250a instanceof j) && (this.f44252c instanceof j) && (this.f44253d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(s7.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public k(b bVar) {
        this.f44250a = bVar.f44262a;
        this.f44251b = bVar.f44263b;
        this.f44252c = bVar.f44264c;
        this.f44253d = bVar.f44265d;
        this.f44254e = bVar.f44266e;
        this.f44255f = bVar.f44267f;
        this.f44256g = bVar.f44268g;
        this.f44257h = bVar.f44269h;
        this.f44258i = bVar.f44270i;
        this.f44259j = bVar.f44271j;
        this.f44260k = bVar.f44272k;
        this.f44261l = bVar.f44273l;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f44262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f44263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f44264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f44265d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public s7.c f44266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s7.c f44267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public s7.c f44268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public s7.c f44269h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f f44270i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public f f44271j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public f f44272k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public f f44273l;

        public b() {
            this.f44262a = h.b();
            this.f44263b = h.b();
            this.f44264c = h.b();
            this.f44265d = h.b();
            this.f44266e = new C5808a(0.0f);
            this.f44267f = new C5808a(0.0f);
            this.f44268g = new C5808a(0.0f);
            this.f44269h = new C5808a(0.0f);
            this.f44270i = h.c();
            this.f44271j = h.c();
            this.f44272k = h.c();
            this.f44273l = h.c();
        }

        public static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f44248a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f44196a;
            }
            return -1.0f;
        }

        public b A(float f10) {
            this.f44266e = new C5808a(f10);
            return this;
        }

        public b B(s7.c cVar) {
            this.f44266e = cVar;
            return this;
        }

        public b C(int i10, s7.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        public b D(d dVar) {
            this.f44263b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f10) {
            this.f44267f = new C5808a(f10);
            return this;
        }

        public b F(s7.c cVar) {
            this.f44267f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(s7.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, s7.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f44265d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f10) {
            this.f44269h = new C5808a(f10);
            return this;
        }

        public b t(s7.c cVar) {
            this.f44269h = cVar;
            return this;
        }

        public b u(int i10, s7.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f44264c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f10) {
            this.f44268g = new C5808a(f10);
            return this;
        }

        public b x(s7.c cVar) {
            this.f44268g = cVar;
            return this;
        }

        public b y(int i10, s7.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        public b z(d dVar) {
            this.f44262a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(k kVar) {
            this.f44262a = h.b();
            this.f44263b = h.b();
            this.f44264c = h.b();
            this.f44265d = h.b();
            this.f44266e = new C5808a(0.0f);
            this.f44267f = new C5808a(0.0f);
            this.f44268g = new C5808a(0.0f);
            this.f44269h = new C5808a(0.0f);
            this.f44270i = h.c();
            this.f44271j = h.c();
            this.f44272k = h.c();
            this.f44273l = h.c();
            this.f44262a = kVar.f44250a;
            this.f44263b = kVar.f44251b;
            this.f44264c = kVar.f44252c;
            this.f44265d = kVar.f44253d;
            this.f44266e = kVar.f44254e;
            this.f44267f = kVar.f44255f;
            this.f44268g = kVar.f44256g;
            this.f44269h = kVar.f44257h;
            this.f44270i = kVar.f44258i;
            this.f44271j = kVar.f44259j;
            this.f44272k = kVar.f44260k;
            this.f44273l = kVar.f44261l;
        }
    }

    public k() {
        this.f44250a = h.b();
        this.f44251b = h.b();
        this.f44252c = h.b();
        this.f44253d = h.b();
        this.f44254e = new C5808a(0.0f);
        this.f44255f = new C5808a(0.0f);
        this.f44256g = new C5808a(0.0f);
        this.f44257h = new C5808a(0.0f);
        this.f44258i = h.c();
        this.f44259j = h.c();
        this.f44260k = h.c();
        this.f44261l = h.c();
    }
}
