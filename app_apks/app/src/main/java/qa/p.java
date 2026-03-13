package qa;

import android.os.DeadObjectException;
import la.C4974f;
import la.C4981m;
import ta.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends ma.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f43390a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f43391a;

        public a(Object obj) {
            this.f43391a = obj;
        }

        @Override // Jb.c
        public void cancel() {
            ma.q.k("Scan operation is requested to stop.", new Object[0]);
            p pVar = p.this;
            pVar.s(pVar.f43390a, this.f43391a);
        }
    }

    public p(F f10) {
        this.f43390a = f10;
    }

    @Override // ma.j
    public final void b(Eb.l lVar, sa.i iVar) {
        Object objP = p(lVar);
        try {
            lVar.k(new a(objP));
            ma.q.k("Scan operation is requested to start.", new Object[0]);
            if (!q(this.f43390a, objP)) {
                lVar.d(new C4981m(0));
            }
        } catch (Throwable th) {
            try {
                ma.q.r(th, "Error while calling the start scan function", new Object[0]);
                lVar.d(new C4981m(0, th));
            } finally {
                iVar.release();
            }
        }
    }

    @Override // ma.j
    public C4974f j(DeadObjectException deadObjectException) {
        return new C4981m(1, deadObjectException);
    }

    public abstract Object p(Eb.l lVar);

    public abstract boolean q(F f10, Object obj);

    public abstract void s(F f10, Object obj);
}
