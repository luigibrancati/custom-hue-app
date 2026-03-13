package kb;

import android.text.TextUtils;
import android.util.FloatProperty;
import android.util.IntProperty;
import android.util.Property;

/* JADX INFO: renamed from: kb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4836b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FloatProperty f39530h = new a("timePosition");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Property f39531i = new C0515b("framePosition");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Property f39532j = new c("fractionPosition");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC4835a f39533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f39536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f39538f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39539g = false;

    /* JADX INFO: renamed from: kb.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends FloatProperty {
        public a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C4836b c4836b) {
            return Float.valueOf(c4836b.k());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(C4836b c4836b, float f10) {
            c4836b.p(f10);
        }
    }

    /* JADX INFO: renamed from: kb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0515b extends IntProperty {
        public C0515b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(C4836b c4836b) {
            return Integer.valueOf(c4836b.g());
        }

        @Override // android.util.IntProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(C4836b c4836b, int i10) {
            c4836b.o(i10);
        }
    }

    /* JADX INFO: renamed from: kb.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends FloatProperty {
        public c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C4836b c4836b) {
            return Float.valueOf(c4836b.e());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(C4836b c4836b, float f10) {
            c4836b.n(f10);
        }
    }

    public C4836b(InterfaceC4835a interfaceC4835a, String str, int i10, float f10, int i11) {
        this.f39533a = interfaceC4835a;
        this.f39534b = i10;
        this.f39535c = str;
        if (TextUtils.isEmpty(str)) {
            this.f39535c = String.valueOf(i10);
        }
        this.f39537e = i11;
        this.f39536d = f10;
    }

    public static float a(float f10, float f11) {
        return f10 * f11;
    }

    public static float b(int i10, int i11) {
        return i10 / i11;
    }

    public static float q(float f10, float f11) {
        return f10 / f11;
    }

    public static int r(float f10, int i10) {
        return (int) (f10 * i10);
    }

    public float c() {
        return this.f39536d;
    }

    public float d(float f10) {
        return q(f10, c());
    }

    public float e() {
        return d(k());
    }

    public int f(float f10) {
        return r(f10, h());
    }

    public int g() {
        return f(k());
    }

    public int h() {
        return this.f39537e;
    }

    public float i(float f10) {
        return a(f10, c());
    }

    public float j(int i10) {
        return b(i10, h());
    }

    public float k() {
        return this.f39538f;
    }

    public boolean l() {
        return this.f39539g;
    }

    public void m(boolean z10) {
        this.f39539g = z10;
        if (z10) {
            this.f39533a.b(this);
        }
    }

    public void n(float f10) {
        p(i(f10));
    }

    public void o(int i10) {
        p(j(i10));
    }

    public void p(float f10) {
        this.f39538f = f10;
        m(true);
    }
}
