package Xb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum d implements Mb.e {
    INSTANCE;

    public static void a(Ze.b bVar) {
        bVar.d(INSTANCE);
        bVar.a();
    }

    public static void b(Throwable th, Ze.b bVar) {
        bVar.d(INSTANCE);
        bVar.onError(th);
    }

    @Override // Mb.h
    public boolean isEmpty() {
        return true;
    }

    @Override // Mb.h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Ze.c
    public void p(long j10) {
        g.v(j10);
    }

    @Override // Mb.h
    public Object poll() {
        return null;
    }

    @Override // Mb.d
    public int q(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // Ze.c
    public void cancel() {
    }

    @Override // Mb.h
    public void clear() {
    }
}
