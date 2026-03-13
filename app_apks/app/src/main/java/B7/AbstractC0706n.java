package B7;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: B7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0706n implements InterfaceC0702j {
    public static Object c(ClassLoader classLoader) {
        return AbstractC0717z.b(classLoader, "pathList", Object.class).a();
    }

    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z10, InterfaceC0705m interfaceC0705m, String str, InterfaceC0704l interfaceC0704l) {
        ArrayList arrayList = new ArrayList();
        Object objC = c(classLoader);
        C0715x c0715xA = AbstractC0717z.a(objC, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) c0715xA.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) AbstractC0717z.b(it.next(), str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z10 && !interfaceC0704l.a(objC, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        c0715xA.d(Arrays.asList(interfaceC0705m.a(objC, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        C0714w c0714w = new C0714w("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            IOException iOException = (IOException) arrayList.get(i10);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(c0714w, iOException);
            } catch (Exception unused) {
            }
        }
        AbstractC0717z.a(objC, "dexElementsSuppressedExceptions", IOException.class).d(arrayList);
        throw c0714w;
    }
}
