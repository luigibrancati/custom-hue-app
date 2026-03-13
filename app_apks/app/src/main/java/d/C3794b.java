package d;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3794b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f32731f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f32734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f32736e;

    /* JADX INFO: renamed from: d.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C3794b(float f10, float f11, float f12, int i10, long j10) {
        this.f32732a = f10;
        this.f32733b = f11;
        this.f32734c = f12;
        this.f32735d = i10;
        this.f32736e = j10;
    }

    public final float a() {
        return this.f32734c;
    }

    public String toString() {
        return "BackEventCompat(touchX=" + this.f32732a + ", touchY=" + this.f32733b + ", progress=" + this.f32734c + ", swipeEdge=" + this.f32735d + ", frameTimeMillis=" + this.f32736e + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3794b(S2.b navigationEvent) {
        this(navigationEvent.d(), navigationEvent.e(), navigationEvent.b(), navigationEvent.c(), navigationEvent.a());
        AbstractC4862t.e(navigationEvent, "navigationEvent");
    }
}
