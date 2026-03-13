package u6;

import android.os.Looper;
import java.util.concurrent.Executor;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: u6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5960i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f45184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f45185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a f45186c;

    /* JADX INFO: renamed from: u6.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f45187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45188b;

        public a(Object obj, String str) {
            this.f45187a = obj;
            this.f45188b = str;
        }

        public String a() {
            int iIdentityHashCode = System.identityHashCode(this.f45187a);
            String str = this.f45188b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
            sb2.append(str);
            sb2.append("@");
            sb2.append(iIdentityHashCode);
            return sb2.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f45187a == aVar.f45187a && this.f45188b.equals(aVar.f45188b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f45187a) * 31) + this.f45188b.hashCode();
        }
    }

    /* JADX INFO: renamed from: u6.i$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(Object obj);

        void b();
    }

    public C5960i(Looper looper, Object obj, String str) {
        this.f45184a = new C6.a(looper);
        this.f45185b = AbstractC6056k.m(obj, "Listener must not be null");
        this.f45186c = new a(obj, AbstractC6056k.f(str));
    }

    public void a() {
        this.f45185b = null;
        this.f45186c = null;
    }

    public a b() {
        return this.f45186c;
    }

    public void c(final b bVar) {
        AbstractC6056k.m(bVar, "Notifier must not be null");
        this.f45184a.execute(new Runnable() { // from class: u6.J
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f45108a.d(bVar);
            }
        });
    }

    public final /* synthetic */ void d(b bVar) {
        Object obj = this.f45185b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }
}
