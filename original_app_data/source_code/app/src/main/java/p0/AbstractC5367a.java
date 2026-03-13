package p0;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: p0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5367a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f42059b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42060c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC5367a f42061d = new C0557a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC5367a f42062e = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC5367a f42063f = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f42064a;

    /* JADX INFO: renamed from: p0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0557a extends AbstractC5367a {
        public C0557a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: p0.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5367a {
        public b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: p0.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5367a {
        public c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: p0.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        public /* synthetic */ d(AbstractC4854k abstractC4854k) {
            this();
        }

        public final AbstractC5367a a() {
            return AbstractC5367a.f42061d;
        }

        public d() {
        }
    }

    public /* synthetic */ AbstractC5367a(float[] fArr, AbstractC4854k abstractC4854k) {
        this(fArr);
    }

    public final float[] b() {
        return this.f42064a;
    }

    public AbstractC5367a(float[] fArr) {
        this.f42064a = fArr;
    }
}
