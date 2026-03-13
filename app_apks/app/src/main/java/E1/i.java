package E1;

import E1.e;
import G1.AbstractC0853a;
import G1.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.a f3233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e.a f3234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e.a f3235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e.a f3236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f3238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ByteBuffer f3239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ShortBuffer f3240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f3241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f3243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3244q;

    public i() {
        this(false);
    }

    public final boolean a() {
        return Math.abs(this.f3231d - 1.0f) < 1.0E-4f && Math.abs(this.f3232e - 1.0f) < 1.0E-4f && this.f3234g.f3194a == this.f3233f.f3194a;
    }

    @Override // E1.e
    public boolean b() {
        if (!this.f3244q) {
            return false;
        }
        h hVar = this.f3238k;
        return hVar == null || hVar.k() == 0;
    }

    @Override // E1.e
    public boolean c() {
        if (this.f3234g.f3194a != -1) {
            return this.f3229b || !a();
        }
        return false;
    }

    @Override // E1.e
    public ByteBuffer d() {
        int iK;
        h hVar = this.f3238k;
        if (hVar != null && (iK = hVar.k()) > 0) {
            if (this.f3239l.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f3239l = byteBufferOrder;
                this.f3240m = byteBufferOrder.asShortBuffer();
            } else {
                this.f3239l.clear();
                this.f3240m.clear();
            }
            hVar.j(this.f3240m);
            this.f3243p += (long) iK;
            this.f3239l.limit(iK);
            this.f3241n = this.f3239l;
        }
        ByteBuffer byteBuffer = this.f3241n;
        this.f3241n = e.f3192a;
        return byteBuffer;
    }

    @Override // E1.e
    public e.a e(e.a aVar) throws e.b {
        if (aVar.f3196c != 2) {
            throw new e.b(aVar);
        }
        int i10 = this.f3230c;
        if (i10 == -1) {
            i10 = aVar.f3194a;
        }
        this.f3233f = aVar;
        e.a aVar2 = new e.a(i10, aVar.f3195b, 2);
        this.f3234g = aVar2;
        this.f3237j = true;
        return aVar2;
    }

    @Override // E1.e
    public void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            h hVar = (h) AbstractC0853a.e(this.f3238k);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f3242o += (long) iRemaining;
            hVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // E1.e
    public void flush() {
        if (c()) {
            e.a aVar = this.f3233f;
            this.f3235h = aVar;
            e.a aVar2 = this.f3234g;
            this.f3236i = aVar2;
            if (this.f3237j) {
                this.f3238k = new h(aVar.f3194a, aVar.f3195b, this.f3231d, this.f3232e, aVar2.f3194a);
            } else {
                h hVar = this.f3238k;
                if (hVar != null) {
                    hVar.i();
                }
            }
        }
        this.f3241n = e.f3192a;
        this.f3242o = 0L;
        this.f3243p = 0L;
        this.f3244q = false;
    }

    @Override // E1.e
    public void g() {
        h hVar = this.f3238k;
        if (hVar != null) {
            hVar.s();
        }
        this.f3244q = true;
    }

    public long h(long j10) {
        if (this.f3243p < 1024) {
            return (long) (((double) this.f3231d) * j10);
        }
        long jL = this.f3242o - ((long) ((h) AbstractC0853a.e(this.f3238k)).l());
        int i10 = this.f3236i.f3194a;
        int i11 = this.f3235h.f3194a;
        return i10 == i11 ? M.a1(j10, jL, this.f3243p) : M.a1(j10, jL * ((long) i10), this.f3243p * ((long) i11));
    }

    public void i(float f10) {
        AbstractC0853a.a(f10 > 0.0f);
        if (this.f3232e != f10) {
            this.f3232e = f10;
            this.f3237j = true;
        }
    }

    public void j(float f10) {
        AbstractC0853a.a(f10 > 0.0f);
        if (this.f3231d != f10) {
            this.f3231d = f10;
            this.f3237j = true;
        }
    }

    @Override // E1.e
    public void reset() {
        this.f3231d = 1.0f;
        this.f3232e = 1.0f;
        e.a aVar = e.a.f3193e;
        this.f3233f = aVar;
        this.f3234g = aVar;
        this.f3235h = aVar;
        this.f3236i = aVar;
        ByteBuffer byteBuffer = e.f3192a;
        this.f3239l = byteBuffer;
        this.f3240m = byteBuffer.asShortBuffer();
        this.f3241n = byteBuffer;
        this.f3230c = -1;
        this.f3237j = false;
        this.f3238k = null;
        this.f3242o = 0L;
        this.f3243p = 0L;
        this.f3244q = false;
    }

    public i(boolean z10) {
        this.f3231d = 1.0f;
        this.f3232e = 1.0f;
        e.a aVar = e.a.f3193e;
        this.f3233f = aVar;
        this.f3234g = aVar;
        this.f3235h = aVar;
        this.f3236i = aVar;
        ByteBuffer byteBuffer = e.f3192a;
        this.f3239l = byteBuffer;
        this.f3240m = byteBuffer.asShortBuffer();
        this.f3241n = byteBuffer;
        this.f3230c = -1;
        this.f3229b = z10;
    }
}
