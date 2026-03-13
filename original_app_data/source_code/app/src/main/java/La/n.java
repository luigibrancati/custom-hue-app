package La;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface n {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f8656a;

        public a(i iVar) {
            this.f8656a = iVar;
        }

        @Override // La.j
        public int a() {
            return this.f8656a.f8634c;
        }

        @Override // La.j
        public boolean b() {
            return this.f8656a.F();
        }
    }

    static n b(String str, int i10, int i11) {
        return i10 == 1 ? new r(str, i11) : new p(str, i10, i11);
    }

    default void a(i iVar, Runnable runnable) {
        d(new k(iVar == null ? null : new a(iVar), runnable));
    }

    void c();

    void d(k kVar);

    void start();
}
