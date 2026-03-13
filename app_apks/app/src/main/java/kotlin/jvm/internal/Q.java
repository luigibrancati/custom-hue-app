package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39780a;

    public Q(int i10) {
        this.f39780a = new ArrayList(i10);
    }

    public void a(Object obj) {
        this.f39780a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f39780a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f39780a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f39780a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f39780a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f39780a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f39780a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f39780a.toArray(objArr);
    }
}
