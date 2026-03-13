package J6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    public static Object a(Class cls, String str, p... pVarArr) {
        return b(cls, "isIsolated", null, false, pVarArr);
    }

    public static Object b(Class cls, String str, Object obj, boolean z10, p... pVarArr) {
        int length = pVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        Object obj2 = null;
        if (pVarArr.length <= 0) {
            return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
        }
        p pVar = pVarArr[0];
        obj2.getClass();
        throw null;
    }
}
