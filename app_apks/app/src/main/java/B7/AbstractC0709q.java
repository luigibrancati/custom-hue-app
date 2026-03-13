package B7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: B7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0709q implements InterfaceC0702j {
    public static void c(ClassLoader classLoader, Set set, InterfaceC0708p interfaceC0708p) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objC = AbstractC0706n.c(classLoader);
        C0716y c0716yB = AbstractC0717z.b(objC, "nativeLibraryDirectories", List.class);
        synchronized (A7.D.class) {
            ArrayList arrayList = new ArrayList((Collection) c0716yB.a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            c0716yB.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrA = interfaceC0708p.a(objC, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (A7.D.class) {
                AbstractC0717z.a(objC, "nativeLibraryPathElements", Object.class).e(Arrays.asList(objArrA));
            }
            return;
        }
        C0714w c0714w = new C0714w("Error in makePathElements");
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(c0714w, (IOException) arrayList2.get(i10));
            } catch (Exception unused) {
            }
        }
        throw c0714w;
    }
}
