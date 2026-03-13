package b2;

import G1.M;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends AbstractC2795e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f25041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f25042k;

    public k(I1.f fVar, I1.j jVar, int i10, D1.o oVar, int i11, Object obj, byte[] bArr) {
        super(fVar, jVar, i10, oVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f25041j = bArr == null ? M.f4267f : bArr;
    }

    @Override // e2.m.e
    public final void b() {
        this.f25042k = true;
    }

    public abstract void f(byte[] bArr, int i10);

    public byte[] g() {
        return this.f25041j;
    }

    public final void h(int i10) {
        byte[] bArr = this.f25041j;
        if (bArr.length < i10 + 16384) {
            this.f25041j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // e2.m.e
    public final void load() {
        try {
            this.f25002i.f(this.f24995b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f25042k) {
                h(i11);
                i10 = this.f25002i.read(this.f25041j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f25042k) {
                f(this.f25041j, i11);
            }
            I1.i.a(this.f25002i);
        } catch (Throwable th) {
            I1.i.a(this.f25002i);
            throw th;
        }
    }
}
