package o8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class w implements O8.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f41296c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f41297a = f41296c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile O8.b f41298b;

    public w(O8.b bVar) {
        this.f41298b = bVar;
    }

    @Override // O8.b
    public Object get() {
        Object obj;
        Object obj2 = this.f41297a;
        Object obj3 = f41296c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f41297a;
                if (obj == obj3) {
                    obj = this.f41298b.get();
                    this.f41297a = obj;
                    this.f41298b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
