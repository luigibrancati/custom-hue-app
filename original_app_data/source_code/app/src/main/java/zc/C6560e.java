package zc;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: zc.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6560e extends AbstractC6558c implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f48887i = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48893h;

    /* JADX INFO: renamed from: zc.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C6560e(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f48888c = i10;
        this.f48889d = i11;
        this.f48890e = i12;
        this.f48891f = i13;
        this.f48892g = i14;
        this.f48893h = i15;
        h();
        for (int i16 = 0; i16 < 64; i16++) {
            c();
        }
    }

    @Override // zc.AbstractC6558c
    public int b(int i10) {
        return AbstractC6559d.f(c(), i10);
    }

    @Override // zc.AbstractC6558c
    public int c() {
        int i10 = this.f48888c;
        int i11 = i10 ^ (i10 >>> 2);
        this.f48888c = this.f48889d;
        this.f48889d = this.f48890e;
        this.f48890e = this.f48891f;
        int i12 = this.f48892g;
        this.f48891f = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f48892g = i13;
        int i14 = this.f48893h + 362437;
        this.f48893h = i14;
        return i13 + i14;
    }

    public final void h() {
        if ((this.f48892g | this.f48888c | this.f48889d | this.f48890e | this.f48891f) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }

    public C6560e(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
