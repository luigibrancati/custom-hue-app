package W3;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X3.a f17817a;

    public static void a(X3.a aVar, X3.a aVar2) {
        e.b(aVar2);
        a aVar3 = (a) aVar;
        if (aVar3.f17817a != null) {
            throw new IllegalStateException();
        }
        aVar3.f17817a = aVar2;
    }

    @Override // X3.a
    public Object get() {
        X3.a aVar = this.f17817a;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }
}
