package Kb;

import Eb.p;
import Eb.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum d implements Mb.c {
    INSTANCE,
    NEVER;

    public static void a(p pVar) {
        pVar.b(INSTANCE);
        pVar.a();
    }

    public static void b(Throwable th, Eb.b bVar) {
        bVar.b(INSTANCE);
        bVar.onError(th);
    }

    public static void p(Throwable th, p pVar) {
        pVar.b(INSTANCE);
        pVar.onError(th);
    }

    public static void s(Throwable th, t tVar) {
        tVar.b(INSTANCE);
        tVar.onError(th);
    }

    @Override // Mb.h
    public boolean isEmpty() {
        return true;
    }

    @Override // Hb.c
    public boolean j() {
        return this == INSTANCE;
    }

    @Override // Mb.h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Mb.h
    public Object poll() {
        return null;
    }

    @Override // Mb.d
    public int q(int i10) {
        return i10 & 2;
    }

    @Override // Mb.h
    public void clear() {
    }

    @Override // Hb.c
    public void dispose() {
    }
}
