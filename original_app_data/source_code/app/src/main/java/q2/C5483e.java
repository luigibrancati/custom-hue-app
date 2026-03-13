package q2;

import i2.AbstractC4320A;
import i2.J;
import i2.K;
import i2.O;
import i2.r;

/* JADX INFO: renamed from: q2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5483e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f43100b;

    /* JADX INFO: renamed from: q2.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC4320A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f43101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j10, J j11) {
            super(j10);
            this.f43101b = j11;
        }

        @Override // i2.AbstractC4320A, i2.J
        public J.a e(long j10) {
            J.a aVarE = this.f43101b.e(j10);
            K k10 = aVarE.f36872a;
            K k11 = new K(k10.f36877a, k10.f36878b + C5483e.this.f43099a);
            K k12 = aVarE.f36873b;
            return new J.a(k11, new K(k12.f36877a, k12.f36878b + C5483e.this.f43099a));
        }
    }

    public C5483e(long j10, r rVar) {
        this.f43099a = j10;
        this.f43100b = rVar;
    }

    @Override // i2.r
    public O f(int i10, int i11) {
        return this.f43100b.f(i10, i11);
    }

    @Override // i2.r
    public void n() {
        this.f43100b.n();
    }

    @Override // i2.r
    public void v(J j10) {
        this.f43100b.v(new a(j10, j10));
    }
}
