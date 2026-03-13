package ma;

import android.os.DeadObjectException;
import la.C4974f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j implements qa.j {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Eb.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sa.i f40243a;

        public a(sa.i iVar) {
            this.f40243a = iVar;
        }

        @Override // Eb.m
        public void a(Eb.l lVar) {
            try {
                j.this.b(lVar, this.f40243a);
            } catch (DeadObjectException e10) {
                lVar.d(j.this.j(e10));
                q.e(e10, "QueueOperation terminated with a DeadObjectException", new Object[0]);
            } catch (Throwable th) {
                lVar.d(th);
                q.e(th, "QueueOperation terminated with an unexpected exception", new Object[0]);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(qa.j jVar) {
        return jVar.m().f40242a - m().f40242a;
    }

    public abstract void b(Eb.l lVar, sa.i iVar);

    public abstract C4974f j(DeadObjectException deadObjectException);

    @Override // qa.j
    public final Eb.k l(sa.i iVar) {
        return Eb.k.m(new a(iVar));
    }

    @Override // qa.j
    public i m() {
        return i.f40240c;
    }
}
