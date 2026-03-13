package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2714u;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC2719z {
    public static AbstractC2714u.b d(Object obj, long j10) {
        return (AbstractC2714u.b) j0.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2719z
    public void a(Object obj, long j10) {
        d(obj, j10).i();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2719z
    public void b(Object obj, Object obj2, long j10) {
        AbstractC2714u.b bVarD = d(obj, j10);
        AbstractC2714u.b bVarD2 = d(obj2, j10);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.m()) {
                bVarD = bVarD.a(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        j0.O(obj, j10, bVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2719z
    public List c(Object obj, long j10) {
        AbstractC2714u.b bVarD = d(obj, j10);
        if (bVarD.m()) {
            return bVarD;
        }
        int size = bVarD.size();
        AbstractC2714u.b bVarA = bVarD.a(size == 0 ? 10 : size * 2);
        j0.O(obj, j10, bVarA);
        return bVarA;
    }
}
