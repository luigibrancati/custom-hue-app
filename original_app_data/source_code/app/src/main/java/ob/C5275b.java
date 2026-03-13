package ob;

import android.media.Image;
import cb.C3091b;
import cb.C3092c;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.ar.core.Config;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import tb.C5876e;

/* JADX INFO: renamed from: ob.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5275b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f41508m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f41509n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List f41510o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Engine f41511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5876e f41512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f41519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ByteBuffer f41520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Texture f41521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Texture f41522l;

    /* JADX INFO: renamed from: ob.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: ob.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0552b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C3092c f41523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Float f41524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C3091b f41525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Texture f41526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f41527e;

        public C0552b() {
            this(null, null, null, null, null, 31, null);
        }

        public final float[] a() {
            return this.f41527e;
        }

        public final C3092c b() {
            return this.f41523a;
        }

        public final C3091b c() {
            return this.f41525c;
        }

        public final Float d() {
            return this.f41524b;
        }

        public final Texture e() {
            return this.f41526d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0552b)) {
                return false;
            }
            C0552b c0552b = (C0552b) obj;
            return AbstractC4862t.a(this.f41523a, c0552b.f41523a) && AbstractC4862t.a(this.f41524b, c0552b.f41524b) && AbstractC4862t.a(this.f41525c, c0552b.f41525c) && AbstractC4862t.a(this.f41526d, c0552b.f41526d) && AbstractC4862t.a(this.f41527e, c0552b.f41527e);
        }

        public final void f(float[] fArr) {
            this.f41527e = fArr;
        }

        public final void g(C3092c c3092c) {
            this.f41523a = c3092c;
        }

        public final void h(C3091b c3091b) {
            this.f41525c = c3091b;
        }

        public int hashCode() {
            C3092c c3092c = this.f41523a;
            int iHashCode = (c3092c == null ? 0 : c3092c.hashCode()) * 31;
            Float f10 = this.f41524b;
            int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            C3091b c3091b = this.f41525c;
            int iHashCode3 = (iHashCode2 + (c3091b == null ? 0 : c3091b.hashCode())) * 31;
            Texture texture = this.f41526d;
            int iHashCode4 = (iHashCode3 + (texture == null ? 0 : texture.hashCode())) * 31;
            float[] fArr = this.f41527e;
            return iHashCode4 + (fArr != null ? Arrays.hashCode(fArr) : 0);
        }

        public final void i(Float f10) {
            this.f41524b = f10;
        }

        public final void j(Texture texture) {
            this.f41526d = texture;
        }

        public String toString() {
            return "Estimation(mainLightColor=" + this.f41523a + ", mainLightIntensity=" + this.f41524b + ", mainLightDirection=" + this.f41525c + ", reflections=" + this.f41526d + ", irradiance=" + Arrays.toString(this.f41527e) + ")";
        }

        public C0552b(C3092c c3092c, Float f10, C3091b c3091b, Texture texture, float[] fArr) {
            this.f41523a = c3092c;
            this.f41524b = f10;
            this.f41525c = c3091b;
            this.f41526d = texture;
            this.f41527e = fArr;
        }

        public /* synthetic */ C0552b(C3092c c3092c, Float f10, C3091b c3091b, Texture texture, float[] fArr, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? null : c3092c, (i10 & 2) != 0 ? null : f10, (i10 & 4) != 0 ? null : c3091b, (i10 & 8) != 0 ? null : texture, (i10 & 16) != 0 ? null : fArr);
        }
    }

    /* JADX INFO: renamed from: ob.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41528a;

        static {
            int[] iArr = new int[Config.LightEstimationMode.values().length];
            try {
                iArr[Config.LightEstimationMode.AMBIENT_INTENSITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Config.LightEstimationMode.ENVIRONMENTAL_HDR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41528a = iArr;
        }
    }

    static {
        float[] fArr = {0.282095f, -0.325735f, 0.325735f, -0.325735f, 0.273137f, -0.273137f, 0.078848f, -0.273137f, 0.136569f};
        ArrayList arrayList = new ArrayList(9);
        int i10 = 0;
        int i11 = 0;
        while (i10 < 9) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (i11 == 6) {
                f10 = fArr[7];
            } else if (i11 == 7) {
                f10 = fArr[6];
            }
            arrayList.add(Float.valueOf(f10));
            i10++;
            i11 = i12;
        }
        f41510o = arrayList;
    }

    public C5275b(Engine engine, C5876e iblPrefilter) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(iblPrefilter, "iblPrefilter");
        this.f41511a = engine;
        this.f41512b = iblPrefilter;
        this.f41513c = true;
        this.f41514d = true;
        this.f41515e = true;
        this.f41517g = true;
        this.f41518h = true;
    }

    public static final void f(Image[] imageArr, ByteBuffer byteBuffer) {
        for (Image image : imageArr) {
            image.close();
        }
        byteBuffer.clear();
    }

    public final void b() {
        ByteBuffer byteBuffer = this.f41520j;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        Texture texture = this.f41521k;
        if (texture != null) {
            this.f41511a.destroyTexture(texture);
        }
        Texture texture2 = this.f41522l;
        if (texture2 != null) {
            this.f41511a.destroyTexture(texture2);
        }
    }

    public final void c(Texture texture) {
        C4015H c4015h;
        try {
            C4035r.a aVar = C4035r.f34274b;
            Texture texture2 = this.f41521k;
            if (texture2 != null) {
                this.f41511a.destroyTexture(texture2);
                c4015h = C4015H.f34254a;
            } else {
                c4015h = null;
            }
            C4035r.b(c4015h);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th));
        }
        this.f41521k = texture;
    }

    public final void d(Texture texture) {
        C4015H c4015h;
        try {
            C4035r.a aVar = C4035r.f34274b;
            Texture texture2 = this.f41522l;
            if (texture2 != null) {
                this.f41511a.destroyTexture(texture2);
                c4015h = C4015H.f34254a;
            } else {
                c4015h = null;
            }
            C4035r.b(c4015h);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th));
        }
        this.f41522l = texture;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.C5275b.C0552b e(com.google.ar.core.Session r24, com.google.ar.core.Frame r25, com.google.android.filament.Camera r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.C5275b.e(com.google.ar.core.Session, com.google.ar.core.Frame, com.google.android.filament.Camera):ob.b$b");
    }
}
