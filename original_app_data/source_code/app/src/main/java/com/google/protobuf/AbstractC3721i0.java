package com.google.protobuf;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3721i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f32235a;

    static {
        char[] cArr = new char[80];
        f32235a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f32235a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    public static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof AbstractC3722j ? obj.equals(AbstractC3722j.f32236b) : obj instanceof InterfaceC3717g0 ? obj == ((InterfaceC3717g0) obj).getDefaultInstanceForType() : (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    public static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    public static void d(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        sb2.append(c(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(G0.c((String) obj));
            sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof AbstractC3722j) {
            sb2.append(": \"");
            sb2.append(G0.a((AbstractC3722j) obj));
            sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            e((GeneratedMessageLite) obj, sb2, i10 + 2);
            sb2.append("\n");
            a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i10 + 2;
        d(sb2, i11, "key", entry.getKey());
        d(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        a(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(com.google.protobuf.InterfaceC3717g0 r17, java.lang.StringBuilder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC3721i0.e(com.google.protobuf.g0, java.lang.StringBuilder, int):void");
    }

    public static String f(InterfaceC3717g0 interfaceC3717g0, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        e(interfaceC3717g0, sb2, 0);
        return sb2.toString();
    }
}
