package X6;

import java.util.EnumMap;

/* JADX INFO: renamed from: X6.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2452o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f19134a;

    public C2452o() {
        this.f19134a = new EnumMap(R3.class);
    }

    public static C2452o d(String str) {
        EnumMap enumMap = new EnumMap(R3.class);
        if (str.length() >= R3.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                R3[] r3ArrValues = R3.values();
                int length = r3ArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(r3ArrValues[i10], EnumC2444n.a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C2452o(enumMap);
            }
        }
        return new C2452o();
    }

    public final EnumC2444n a(R3 r32) {
        EnumC2444n enumC2444n = (EnumC2444n) this.f19134a.get(r32);
        return enumC2444n == null ? EnumC2444n.UNSET : enumC2444n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(X6.R3 r3, int r4) {
        /*
            r2 = this;
            X6.n r0 = X6.EnumC2444n.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            X6.n r0 = X6.EnumC2444n.INITIALIZATION
            goto L20
        L18:
            X6.n r0 = X6.EnumC2444n.MANIFEST
            goto L20
        L1b:
            X6.n r0 = X6.EnumC2444n.API
            goto L20
        L1e:
            X6.n r0 = X6.EnumC2444n.TCF
        L20:
            java.util.EnumMap r2 = r2.f19134a
            r2.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2452o.b(X6.R3, int):void");
    }

    public final void c(R3 r32, EnumC2444n enumC2444n) {
        this.f19134a.put(r32, enumC2444n);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (R3 r32 : R3.values()) {
            EnumC2444n enumC2444n = (EnumC2444n) this.f19134a.get(r32);
            if (enumC2444n == null) {
                enumC2444n = EnumC2444n.UNSET;
            }
            sb2.append(enumC2444n.b());
        }
        return sb2.toString();
    }

    public C2452o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(R3.class);
        this.f19134a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
