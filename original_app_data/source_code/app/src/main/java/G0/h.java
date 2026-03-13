package G0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h extends m {
    public h(F0.e eVar) {
        super(eVar);
        eVar.f3490e.f();
        eVar.f3492f.f();
        this.f4226f = ((F0.g) eVar).H0();
    }

    @Override // G0.m, G0.d
    public void a(d dVar) {
        f fVar = this.f4228h;
        if (fVar.f4197c && !fVar.f4204j) {
            this.f4228h.d((int) ((((f) fVar.f4206l.get(0)).f4201g * ((F0.g) this.f4222b).K0()) + 0.5f));
        }
    }

    @Override // G0.m
    public void d() {
        F0.g gVar = (F0.g) this.f4222b;
        int iI0 = gVar.I0();
        int iJ0 = gVar.J0();
        gVar.K0();
        if (gVar.H0() == 1) {
            if (iI0 != -1) {
                this.f4228h.f4206l.add(this.f4222b.f3469N.f3490e.f4228h);
                this.f4222b.f3469N.f3490e.f4228h.f4205k.add(this.f4228h);
                this.f4228h.f4200f = iI0;
            } else if (iJ0 != -1) {
                this.f4228h.f4206l.add(this.f4222b.f3469N.f3490e.f4229i);
                this.f4222b.f3469N.f3490e.f4229i.f4205k.add(this.f4228h);
                this.f4228h.f4200f = -iJ0;
            } else {
                f fVar = this.f4228h;
                fVar.f4196b = true;
                fVar.f4206l.add(this.f4222b.f3469N.f3490e.f4229i);
                this.f4222b.f3469N.f3490e.f4229i.f4205k.add(this.f4228h);
            }
            q(this.f4222b.f3490e.f4228h);
            q(this.f4222b.f3490e.f4229i);
            return;
        }
        if (iI0 != -1) {
            this.f4228h.f4206l.add(this.f4222b.f3469N.f3492f.f4228h);
            this.f4222b.f3469N.f3492f.f4228h.f4205k.add(this.f4228h);
            this.f4228h.f4200f = iI0;
        } else if (iJ0 != -1) {
            this.f4228h.f4206l.add(this.f4222b.f3469N.f3492f.f4229i);
            this.f4222b.f3469N.f3492f.f4229i.f4205k.add(this.f4228h);
            this.f4228h.f4200f = -iJ0;
        } else {
            f fVar2 = this.f4228h;
            fVar2.f4196b = true;
            fVar2.f4206l.add(this.f4222b.f3469N.f3492f.f4229i);
            this.f4222b.f3469N.f3492f.f4229i.f4205k.add(this.f4228h);
        }
        q(this.f4222b.f3492f.f4228h);
        q(this.f4222b.f3492f.f4229i);
    }

    @Override // G0.m
    public void e() {
        if (((F0.g) this.f4222b).H0() == 1) {
            this.f4222b.C0(this.f4228h.f4201g);
        } else {
            this.f4222b.D0(this.f4228h.f4201g);
        }
    }

    @Override // G0.m
    public void f() {
        this.f4228h.c();
    }

    @Override // G0.m
    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f4228h.f4205k.add(fVar);
        fVar.f4206l.add(this.f4228h);
    }
}
