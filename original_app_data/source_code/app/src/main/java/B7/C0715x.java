package B7;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: B7.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0715x extends C0716y {
    public C0715x(Object obj, Field field, Class cls) {
        super(obj, field, Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public final void d(Collection collection) {
        Object[] objArr = (Object[]) a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) f(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        c(objArr2);
    }

    public final void e(Collection collection) {
        Object[] objArr = (Object[]) a();
        int i10 = 0;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) f(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i10] = it.next();
            i10++;
        }
        c(objArr2);
    }

    public final Class f() {
        return b().getType().getComponentType();
    }
}
