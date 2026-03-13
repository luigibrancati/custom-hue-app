package com.google.android.gms.internal.play_billing;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3580n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f30202a;

    static {
        char[] cArr = new char[80];
        f30202a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(InterfaceC3568l3 interfaceC3568l3, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(interfaceC3568l3, sb2, 0);
        return sb2.toString();
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(G3.a(new C3585o2(((String) obj).getBytes(T2.f30091a))));
            sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof AbstractC3597q2) {
            sb2.append(": \"");
            sb2.append(G3.a((AbstractC3597q2) obj));
            sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof O2) {
            sb2.append(" {");
            d((O2) obj, sb2, i10 + 2);
            sb2.append("\n");
            c(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb2, i12, "key", entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        c(i10, sb2);
        sb2.append("}");
    }

    public static void c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f30202a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(com.google.android.gms.internal.play_billing.InterfaceC3568l3 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC3580n3.d(com.google.android.gms.internal.play_billing.l3, java.lang.StringBuilder, int):void");
    }
}
