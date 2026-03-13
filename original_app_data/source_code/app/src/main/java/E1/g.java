package E1;

import E1.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e.a f3199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e.a f3200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.a f3201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.a f3202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f3203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f3204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3205h;

    public g() {
        ByteBuffer byteBuffer = e.f3192a;
        this.f3203f = byteBuffer;
        this.f3204g = byteBuffer;
        e.a aVar = e.a.f3193e;
        this.f3201d = aVar;
        this.f3202e = aVar;
        this.f3199b = aVar;
        this.f3200c = aVar;
    }

    public final boolean a() {
        return this.f3204g.hasRemaining();
    }

    @Override // E1.e
    public boolean b() {
        return this.f3205h && this.f3204g == e.f3192a;
    }

    @Override // E1.e
    public boolean c() {
        return this.f3202e != e.a.f3193e;
    }

    @Override // E1.e
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f3204g;
        this.f3204g = e.f3192a;
        return byteBuffer;
    }

    @Override // E1.e
    public final e.a e(e.a aVar) {
        this.f3201d = aVar;
        this.f3202e = h(aVar);
        return c() ? this.f3202e : e.a.f3193e;
    }

    @Override // E1.e
    public final void flush() {
        this.f3204g = e.f3192a;
        this.f3205h = false;
        this.f3199b = this.f3201d;
        this.f3200c = this.f3202e;
        i();
    }

    @Override // E1.e
    public final void g() {
        this.f3205h = true;
        j();
    }

    public e.a h(e.a aVar) {
        return e.a.f3193e;
    }

    public final ByteBuffer l(int i10) {
        if (this.f3203f.capacity() < i10) {
            this.f3203f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3203f.clear();
        }
        ByteBuffer byteBuffer = this.f3203f;
        this.f3204g = byteBuffer;
        return byteBuffer;
    }

    @Override // E1.e
    public final void reset() {
        ByteBuffer byteBuffer = e.f3192a;
        this.f3204g = byteBuffer;
        this.f3205h = false;
        this.f3203f = byteBuffer;
        e.a aVar = e.a.f3193e;
        this.f3201d = aVar;
        this.f3202e = aVar;
        this.f3199b = aVar;
        this.f3200c = aVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
