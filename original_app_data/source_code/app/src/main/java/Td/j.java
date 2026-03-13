package Td;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final g a(int i10, a aVar, vc.l lVar) {
        if (i10 == -2) {
            return aVar == a.SUSPEND ? new e(g.f16405N.a(), lVar) : new s(1, aVar, lVar);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new e(i10, lVar) : new s(i10, aVar, lVar) : new e(Integer.MAX_VALUE, lVar) : aVar == a.SUSPEND ? new e(0, lVar) : new s(1, aVar, lVar);
        }
        if (aVar == a.SUSPEND) {
            return new s(1, a.DROP_OLDEST, lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ g b(int i10, a aVar, vc.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}
