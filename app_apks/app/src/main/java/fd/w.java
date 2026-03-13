package fd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.AbstractC5047a;
import md.AbstractC5048b;
import md.AbstractC5050d;
import md.C5051e;
import md.C5052f;
import md.C5053g;
import md.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends md.i implements md.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w f34748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static md.r f34749g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f34751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f34752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34753e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public w c(C5051e c5051e, C5053g c5053g) {
            return new w(c5051e, c5053g);
        }
    }

    static {
        w wVar = new w(true);
        f34748f = wVar;
        wVar.r();
    }

    public static w o() {
        return f34748f;
    }

    private void r() {
        this.f34751c = Collections.EMPTY_LIST;
    }

    public static b s() {
        return b.s();
    }

    public static b t(w wVar) {
        return s().m(wVar);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f34751c.size(); i10++) {
            c5052f.c0(1, (md.p) this.f34751c.get(i10));
        }
        c5052f.h0(this.f34750b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34753e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f34751c.size(); i11++) {
            iR += C5052f.r(1, (md.p) this.f34751c.get(i11));
        }
        int size = iR + this.f34750b.size();
        this.f34753e = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34752d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f34752d = (byte) 1;
        return true;
    }

    public int p() {
        return this.f34751c.size();
    }

    public List q() {
        return this.f34751c;
    }

    @Override // md.p
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return s();
    }

    @Override // md.p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return t(this);
    }

    public w(i.b bVar) {
        super(bVar);
        this.f34752d = (byte) -1;
        this.f34753e = -1;
        this.f34750b = bVar.j();
    }

    public w(boolean z10) {
        this.f34752d = (byte) -1;
        this.f34753e = -1;
        this.f34750b = AbstractC5050d.f40294a;
    }

    public w(C5051e c5051e, C5053g c5053g) {
        this.f34752d = (byte) -1;
        this.f34753e = -1;
        r();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ != 10) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            if (!z11) {
                                this.f34751c = new ArrayList();
                                z11 = true;
                            }
                            this.f34751c.add(c5051e.t(v.f34730m, c5053g));
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z11) {
                    this.f34751c = Collections.unmodifiableList(this.f34751c);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34750b = bVarT.f();
                    throw th2;
                }
                this.f34750b = bVarT.f();
                g();
                throw th;
            }
        }
        if (z11) {
            this.f34751c = Collections.unmodifiableList(this.f34751c);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34750b = bVarT.f();
            throw th3;
        }
        this.f34750b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f34755c = Collections.EMPTY_LIST;

        public b() {
            u();
        }

        public static b s() {
            return new b();
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public w build() {
            w wVarQ = q();
            if (wVarQ.isInitialized()) {
                return wVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(wVarQ);
        }

        public w q() {
            w wVar = new w(this);
            if ((this.f34754b & 1) == 1) {
                this.f34755c = Collections.unmodifiableList(this.f34755c);
                this.f34754b &= -2;
            }
            wVar.f34751c = this.f34755c;
            return wVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b e() {
            return s().m(q());
        }

        public final void t() {
            if ((this.f34754b & 1) != 1) {
                this.f34755c = new ArrayList(this.f34755c);
                this.f34754b |= 1;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(w wVar) {
            if (wVar == w.o()) {
                return this;
            }
            if (!wVar.f34751c.isEmpty()) {
                if (this.f34755c.isEmpty()) {
                    this.f34755c = wVar.f34751c;
                    this.f34754b &= -2;
                } else {
                    t();
                    this.f34755c.addAll(wVar.f34751c);
                }
            }
            n(j().d(wVar.f34750b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.w.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.w.f34749g     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.w r3 = (fd.w) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
                if (r3 == 0) goto Le
                r2.m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                md.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                fd.w r4 = (fd.w) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: fd.w.b.v0(md.e, md.g):fd.w$b");
        }

        private void u() {
        }
    }
}
