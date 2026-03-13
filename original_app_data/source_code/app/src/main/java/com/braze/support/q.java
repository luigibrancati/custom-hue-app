package com.braze.support;

import Od.A;
import com.braze.support.BrazeLogger;
import gc.C4179C;
import gc.P;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28646a = BrazeLogger.INSTANCE.getBrazeLogTag("HttpUtils");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f28647b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    public static final Long a(final String str) {
        try {
            Double dS = A.s(str);
            if (dS != null) {
                return Long.valueOf((long) (dS.doubleValue() * 1000));
            }
            Date date = f28647b.parse(str);
            if (date != null) {
                return Long.valueOf(date.getTime() - DateTimeUtils.nowInMilliseconds());
            }
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28646a, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.g1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.q.b(str);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String b(String str) {
        return "Could not parse http-date value: " + str;
    }

    public static final LinkedHashMap a(Map map) {
        AbstractC4862t.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            AbstractC4862t.b(key);
            Locale US = Locale.US;
            AbstractC4862t.d(US, "US");
            String lowerCase = ((String) key).toLowerCase(US);
            AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(P.e(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), C4179C.q0((Iterable) entry3.getValue(), null, null, null, 0, null, null, 63, null));
        }
        return linkedHashMap3;
    }
}
