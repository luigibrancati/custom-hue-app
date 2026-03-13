package G0;

import G0.f;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i extends m {
    public i(F0.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f4228h.f4205k.add(fVar);
        fVar.f4206l.add(this.f4228h);
    }

    @Override // G0.m, G0.d
    public void a(d dVar) {
        F0.a aVar = (F0.a) this.f4222b;
        int iI0 = aVar.I0();
        Iterator it = this.f4228h.f4206l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f4201g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iI0 == 0 || iI0 == 2) {
            this.f4228h.d(i11 + aVar.J0());
        } else {
            this.f4228h.d(i10 + aVar.J0());
        }
    }

    @Override // G0.m
    public void d() {
        F0.e eVar = this.f4222b;
        if (eVar instanceof F0.a) {
            this.f4228h.f4196b = true;
            F0.a aVar = (F0.a) eVar;
            int iI0 = aVar.I0();
            boolean zH0 = aVar.H0();
            int i10 = 0;
            if (iI0 == 0) {
                this.f4228h.f4199e = f.a.LEFT;
                while (i10 < aVar.f3563x0) {
                    F0.e eVar2 = aVar.f3562w0[i10];
                    if (zH0 || eVar2.M() != 8) {
                        f fVar = eVar2.f3490e.f4228h;
                        fVar.f4205k.add(this.f4228h);
                        this.f4228h.f4206l.add(fVar);
                    }
                    i10++;
                }
                q(this.f4222b.f3490e.f4228h);
                q(this.f4222b.f3490e.f4229i);
                return;
            }
            if (iI0 == 1) {
                this.f4228h.f4199e = f.a.RIGHT;
                while (i10 < aVar.f3563x0) {
                    F0.e eVar3 = aVar.f3562w0[i10];
                    if (zH0 || eVar3.M() != 8) {
                        f fVar2 = eVar3.f3490e.f4229i;
                        fVar2.f4205k.add(this.f4228h);
                        this.f4228h.f4206l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f4222b.f3490e.f4228h);
                q(this.f4222b.f3490e.f4229i);
                return;
            }
            if (iI0 == 2) {
                this.f4228h.f4199e = f.a.TOP;
                while (i10 < aVar.f3563x0) {
                    F0.e eVar4 = aVar.f3562w0[i10];
                    if (zH0 || eVar4.M() != 8) {
                        f fVar3 = eVar4.f3492f.f4228h;
                        fVar3.f4205k.add(this.f4228h);
                        this.f4228h.f4206l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f4222b.f3492f.f4228h);
                q(this.f4222b.f3492f.f4229i);
                return;
            }
            if (iI0 != 3) {
                return;
            }
            this.f4228h.f4199e = f.a.BOTTOM;
            while (i10 < aVar.f3563x0) {
                F0.e eVar5 = aVar.f3562w0[i10];
                if (zH0 || eVar5.M() != 8) {
                    f fVar4 = eVar5.f3492f.f4229i;
                    fVar4.f4205k.add(this.f4228h);
                    this.f4228h.f4206l.add(fVar4);
                }
                i10++;
            }
            q(this.f4222b.f3492f.f4228h);
            q(this.f4222b.f3492f.f4229i);
        }
    }

    @Override // G0.m
    public void e() {
        F0.e eVar = this.f4222b;
        if (eVar instanceof F0.a) {
            int iI0 = ((F0.a) eVar).I0();
            if (iI0 == 0 || iI0 == 1) {
                this.f4222b.C0(this.f4228h.f4201g);
            } else {
                this.f4222b.D0(this.f4228h.f4201g);
            }
        }
    }

    @Override // G0.m
    public void f() {
        this.f4223c = null;
        this.f4228h.c();
    }

    @Override // G0.m
    public boolean m() {
        return false;
    }
}
