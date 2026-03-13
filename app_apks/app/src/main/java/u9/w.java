package u9;

import java.io.IOException;
import x9.C6335g;
import x9.C6336h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b extends w {
        public b() {
        }

        @Override // u9.w
        public Object c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return w.this.c(aVar);
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        public void e(C9.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.C();
            } else {
                w.this.e(cVar, obj);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + w.this + "]";
        }
    }

    public final Object a(j jVar) {
        try {
            return c(new C6335g(jVar));
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public final w b() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract Object c(C9.a aVar);

    public final j d(Object obj) {
        try {
            C6336h c6336h = new C6336h();
            e(c6336h, obj);
            return c6336h.M0();
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public abstract void e(C9.c cVar, Object obj);
}
