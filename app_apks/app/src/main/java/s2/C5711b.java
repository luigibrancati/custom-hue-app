package s2;

import D1.u;
import G1.B;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import r2.c;

/* JADX INFO: renamed from: s2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5711b extends c {
    public static u c(B b10) {
        b10.r(12);
        int iD = (b10.d() + b10.h(12)) - 4;
        b10.r(44);
        b10.s(b10.h(12));
        b10.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (b10.d() >= iD) {
                break;
            }
            b10.r(48);
            int iH = b10.h(8);
            b10.r(4);
            int iD2 = b10.d() + b10.h(12);
            String strL2 = null;
            while (b10.d() < iD2) {
                int iH2 = b10.h(8);
                int iH3 = b10.h(8);
                int iD3 = b10.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = b10.h(16);
                    b10.r(8);
                    if (iH4 == 3) {
                        while (b10.d() < iD3) {
                            strL = b10.l(b10.h(8), StandardCharsets.US_ASCII);
                            int iH5 = b10.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                b10.s(b10.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = b10.l(iH3, StandardCharsets.US_ASCII);
                }
                b10.p(iD3 * 8);
            }
            b10.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new C5710a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u(arrayList);
    }

    @Override // r2.c
    public u b(r2.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new B(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
