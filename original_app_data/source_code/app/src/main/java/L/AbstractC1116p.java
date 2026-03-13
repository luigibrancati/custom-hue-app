package L;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: L.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1116p {

    /* JADX INFO: renamed from: L.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC1114o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f8161a = new ArrayList();

        public a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC1114o abstractC1114o = (AbstractC1114o) it.next();
                if (!(abstractC1114o instanceof b)) {
                    this.f8161a.add(abstractC1114o);
                }
            }
        }

        @Override // L.AbstractC1114o
        public void a(int i10) {
            Iterator it = this.f8161a.iterator();
            while (it.hasNext()) {
                ((AbstractC1114o) it.next()).a(i10);
            }
        }

        @Override // L.AbstractC1114o
        public void b(int i10, InterfaceC1133y interfaceC1133y) {
            Iterator it = this.f8161a.iterator();
            while (it.hasNext()) {
                ((AbstractC1114o) it.next()).b(i10, interfaceC1133y);
            }
        }

        @Override // L.AbstractC1114o
        public void c(int i10, C1118q c1118q) {
            Iterator it = this.f8161a.iterator();
            while (it.hasNext()) {
                ((AbstractC1114o) it.next()).c(i10, c1118q);
            }
        }

        @Override // L.AbstractC1114o
        public void d(int i10) {
            Iterator it = this.f8161a.iterator();
            while (it.hasNext()) {
                ((AbstractC1114o) it.next()).d(i10);
            }
        }

        public List e() {
            return this.f8161a;
        }
    }

    public static AbstractC1114o a(List list) {
        return list.isEmpty() ? c() : list.size() == 1 ? (AbstractC1114o) list.get(0) : new a(list);
    }

    public static AbstractC1114o b(AbstractC1114o... abstractC1114oArr) {
        return a(Arrays.asList(abstractC1114oArr));
    }

    public static AbstractC1114o c() {
        return new b();
    }

    /* JADX INFO: renamed from: L.p$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC1114o {
        @Override // L.AbstractC1114o
        public void d(int i10) {
        }

        @Override // L.AbstractC1114o
        public void b(int i10, InterfaceC1133y interfaceC1133y) {
        }

        @Override // L.AbstractC1114o
        public void c(int i10, C1118q c1118q) {
        }
    }
}
