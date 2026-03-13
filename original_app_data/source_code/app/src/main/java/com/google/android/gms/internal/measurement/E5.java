package com.google.android.gms.internal.measurement;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f29171a;

    static {
        char[] cArr = new char[80];
        f29171a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(C5 c52, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        c(c52, sb2, 0);
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
        d(i10, sb2);
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
            E4 e42 = E4.f29169b;
            sb2.append(W5.a(new D4(((String) obj).getBytes(AbstractC3211h5.f29486a))));
            sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof E4) {
            sb2.append(": \"");
            sb2.append(W5.a((E4) obj));
            sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof AbstractC3148a5) {
            sb2.append(" {");
            c((AbstractC3148a5) obj, sb2, i10 + 2);
            sb2.append("\n");
            d(i10, sb2);
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
        d(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.google.android.gms.internal.measurement.C5 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.E5.c(com.google.android.gms.internal.measurement.C5, java.lang.StringBuilder, int):void");
    }

    public static void d(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f29171a, 0, i11);
            i10 -= i11;
        }
    }
}
