package ge;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4232e0 {
    public static final void a(int i10, int i11, ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.e(i13));
            }
            i12 >>>= 1;
        }
        throw new ce.c(arrayList, descriptor.i());
    }
}
