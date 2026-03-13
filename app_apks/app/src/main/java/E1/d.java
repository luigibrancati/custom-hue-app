package E1;

import E1.e;
import G1.AbstractC0853a;
import K7.AbstractC1081v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1081v f3186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3187b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f3188c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.a f3189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.a f3190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3191f;

    public d(AbstractC1081v abstractC1081v) {
        this.f3186a = abstractC1081v;
        e.a aVar = e.a.f3193e;
        this.f3189d = aVar;
        this.f3190e = aVar;
        this.f3191f = false;
    }

    public e.a a(e.a aVar) throws e.b {
        if (aVar.equals(e.a.f3193e)) {
            throw new e.b(aVar);
        }
        for (int i10 = 0; i10 < this.f3186a.size(); i10++) {
            e eVar = (e) this.f3186a.get(i10);
            e.a aVarE = eVar.e(aVar);
            if (eVar.c()) {
                AbstractC0853a.g(!aVarE.equals(e.a.f3193e));
                aVar = aVarE;
            }
        }
        this.f3190e = aVar;
        return aVar;
    }

    public void b() {
        this.f3187b.clear();
        this.f3189d = this.f3190e;
        this.f3191f = false;
        for (int i10 = 0; i10 < this.f3186a.size(); i10++) {
            e eVar = (e) this.f3186a.get(i10);
            eVar.flush();
            if (eVar.c()) {
                this.f3187b.add(eVar);
            }
        }
        this.f3188c = new ByteBuffer[this.f3187b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f3188c[i11] = ((e) this.f3187b.get(i11)).d();
        }
    }

    public final int c() {
        return this.f3188c.length - 1;
    }

    public ByteBuffer d() {
        if (!f()) {
            return e.f3192a;
        }
        ByteBuffer byteBuffer = this.f3188c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(e.f3192a);
        return this.f3188c[c()];
    }

    public boolean e() {
        return this.f3191f && ((e) this.f3187b.get(c())).b() && !this.f3188c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3186a.size() != dVar.f3186a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f3186a.size(); i10++) {
            if (this.f3186a.get(i10) != dVar.f3186a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f3187b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= c()) {
                if (!this.f3188c[i10].hasRemaining()) {
                    e eVar = (e) this.f3187b.get(i10);
                    if (!eVar.b()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f3188c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : e.f3192a;
                        long jRemaining = byteBuffer2.remaining();
                        eVar.f(byteBuffer2);
                        this.f3188c[i10] = eVar.d();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f3188c[i10].hasRemaining();
                    } else if (!this.f3188c[i10].hasRemaining() && i10 < c()) {
                        ((e) this.f3187b.get(i10 + 1)).g();
                    }
                }
                i10++;
            }
        }
    }

    public void h() {
        if (!f() || this.f3191f) {
            return;
        }
        this.f3191f = true;
        ((e) this.f3187b.get(0)).g();
    }

    public int hashCode() {
        return this.f3186a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f3191f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i10 = 0; i10 < this.f3186a.size(); i10++) {
            e eVar = (e) this.f3186a.get(i10);
            eVar.flush();
            eVar.reset();
        }
        this.f3188c = new ByteBuffer[0];
        e.a aVar = e.a.f3193e;
        this.f3189d = aVar;
        this.f3190e = aVar;
        this.f3191f = false;
    }
}
