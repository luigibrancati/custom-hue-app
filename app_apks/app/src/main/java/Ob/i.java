package Ob;

import Eb.r;
import Eb.t;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.c f12147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f12148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12149c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements Eb.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f12150a;

        public a(t tVar) {
            this.f12150a = tVar;
        }

        @Override // Eb.b
        public void a() {
            Object objCall;
            i iVar = i.this;
            Callable callable = iVar.f12148b;
            if (callable != null) {
                try {
                    objCall = callable.call();
                } catch (Throwable th) {
                    Ib.b.b(th);
                    this.f12150a.onError(th);
                    return;
                }
            } else {
                objCall = iVar.f12149c;
            }
            if (objCall == null) {
                this.f12150a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f12150a.onSuccess(objCall);
            }
        }

        @Override // Eb.b
        public void b(Hb.c cVar) {
            this.f12150a.b(cVar);
        }

        @Override // Eb.b
        public void onError(Throwable th) {
            this.f12150a.onError(th);
        }
    }

    public i(Eb.c cVar, Callable callable, Object obj) {
        this.f12147a = cVar;
        this.f12149c = obj;
        this.f12148b = callable;
    }

    @Override // Eb.r
    public void C(t tVar) {
        this.f12147a.b(new a(tVar));
    }
}
