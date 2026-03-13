package p0;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import o0.AbstractC5188e;
import o0.AbstractC5189f;
import p0.AbstractC5368b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f42104g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f42105h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5369c f42106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5369c f42107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5369c f42108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC5369c f42109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f42111f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final float[] b(AbstractC5369c abstractC5369c, AbstractC5369c abstractC5369c2, int i10) {
            if (!r.e(i10, r.f42134a.a())) {
                return null;
            }
            long jE = abstractC5369c.e();
            AbstractC5368b.a aVar = AbstractC5368b.f42065a;
            boolean zE = AbstractC5368b.e(jE, aVar.b());
            boolean zE2 = AbstractC5368b.e(abstractC5369c2.e(), aVar.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                abstractC5369c = abstractC5369c2;
            }
            AbstractC4862t.c(abstractC5369c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            F f10 = (F) abstractC5369c;
            float[] fArrC = zE ? f10.B().c() : o.f42116a.c();
            float[] fArrC2 = zE2 ? f10.B().c() : o.f42116a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final l c(AbstractC5369c abstractC5369c) {
            return new C0558a(abstractC5369c, r.f42134a.c());
        }

        public a() {
        }

        /* JADX INFO: renamed from: p0.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0558a extends l {
            public C0558a(AbstractC5369c abstractC5369c, int i10) {
                super(abstractC5369c, abstractC5369c, i10, null);
            }

            @Override // p0.l
            public long a(long j10) {
                return j10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends l {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final F f42112i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final F f42113j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float[] f42114k;

        public /* synthetic */ b(F f10, F f11, int i10, AbstractC4854k abstractC4854k) {
            this(f10, f11, i10);
        }

        @Override // p0.l
        public long a(long j10) {
            float fI = AbstractC5188e.i(j10);
            float fH = AbstractC5188e.h(j10);
            float f10 = AbstractC5188e.f(j10);
            float fE = AbstractC5188e.e(j10);
            float fA = (float) this.f42112i.v().a(fI);
            float fA2 = (float) this.f42112i.v().a(fH);
            float fA3 = (float) this.f42112i.v().a(f10);
            float[] fArr = this.f42114k;
            return AbstractC5189f.a((float) this.f42113j.y().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.f42113j.y().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.f42113j.y().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fE, this.f42113j);
        }

        public final float[] b(F f10, F f11, int i10) {
            if (AbstractC5370d.f(f10.B(), f11.B())) {
                return AbstractC5370d.l(f11.x(), f10.A());
            }
            float[] fArrA = f10.A();
            float[] fArrX = f11.x();
            float[] fArrC = f10.B().c();
            float[] fArrC2 = f11.B().c();
            I iB = f10.B();
            o oVar = o.f42116a;
            if (!AbstractC5370d.f(iB, oVar.b())) {
                fArrA = AbstractC5370d.l(AbstractC5370d.e(AbstractC5367a.f42059b.a().b(), fArrC, oVar.f()), f10.A());
            }
            if (!AbstractC5370d.f(f11.B(), oVar.b())) {
                fArrX = AbstractC5370d.k(AbstractC5370d.l(AbstractC5370d.e(AbstractC5367a.f42059b.a().b(), fArrC2, oVar.f()), f11.A()));
            }
            if (r.e(i10, r.f42134a.a())) {
                fArrA = AbstractC5370d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, fArrA);
            }
            return AbstractC5370d.l(fArrX, fArrA);
        }

        public b(F f10, F f11, int i10) {
            super(f10, f11, f10, f11, i10, null, null);
            this.f42112i = f10;
            this.f42113j = f11;
            this.f42114k = b(f10, f11, i10);
        }
    }

    public /* synthetic */ l(AbstractC5369c abstractC5369c, AbstractC5369c abstractC5369c2, int i10, AbstractC4854k abstractC4854k) {
        this(abstractC5369c, abstractC5369c2, i10);
    }

    public long a(long j10) {
        float fI = AbstractC5188e.i(j10);
        float fH = AbstractC5188e.h(j10);
        float f10 = AbstractC5188e.f(j10);
        float fE = AbstractC5188e.e(j10);
        long jH = this.f42108c.h(fI, fH, f10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & KeyboardMap.kValueMask));
        float fI2 = this.f42108c.i(fI, fH, f10);
        float[] fArr = this.f42111f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fI2 *= fArr[2];
        }
        float f11 = fIntBitsToFloat;
        return this.f42109d.j(f11, fIntBitsToFloat2, fI2, fE, this.f42107b);
    }

    public /* synthetic */ l(AbstractC5369c abstractC5369c, AbstractC5369c abstractC5369c2, AbstractC5369c abstractC5369c3, AbstractC5369c abstractC5369c4, int i10, float[] fArr, AbstractC4854k abstractC4854k) {
        this(abstractC5369c, abstractC5369c2, abstractC5369c3, abstractC5369c4, i10, fArr);
    }

    public l(AbstractC5369c abstractC5369c, AbstractC5369c abstractC5369c2, AbstractC5369c abstractC5369c3, AbstractC5369c abstractC5369c4, int i10, float[] fArr) {
        this.f42106a = abstractC5369c;
        this.f42107b = abstractC5369c2;
        this.f42108c = abstractC5369c3;
        this.f42109d = abstractC5369c4;
        this.f42110e = i10;
        this.f42111f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(AbstractC5369c abstractC5369c, AbstractC5369c abstractC5369c2, int i10) {
        long jE = abstractC5369c.e();
        AbstractC5368b.a aVar = AbstractC5368b.f42065a;
        this(abstractC5369c, abstractC5369c2, AbstractC5368b.e(jE, aVar.b()) ? AbstractC5370d.d(abstractC5369c, o.f42116a.b(), null, 2, null) : abstractC5369c, AbstractC5368b.e(abstractC5369c2.e(), aVar.b()) ? AbstractC5370d.d(abstractC5369c2, o.f42116a.b(), null, 2, null) : abstractC5369c2, i10, f42104g.b(abstractC5369c, abstractC5369c2, i10), null);
    }
}
