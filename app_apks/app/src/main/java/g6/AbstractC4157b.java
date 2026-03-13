package g6;

/* JADX INFO: renamed from: g6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4157b {
    public static Object a(int i10, Object obj, InterfaceC4156a interfaceC4156a, InterfaceC4158c interfaceC4158c) {
        Object objApply;
        if (i10 < 1) {
            return interfaceC4156a.apply(obj);
        }
        do {
            objApply = interfaceC4156a.apply(obj);
            obj = interfaceC4158c.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return objApply;
    }
}
