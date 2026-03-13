package com.braze.support;

import com.braze.support.BrazeLogger;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f28640a = new k();

    public static final EnumSet a(Class targetEnumClass, Set sourceStringSet) {
        AbstractC4862t.e(targetEnumClass, "targetEnumClass");
        AbstractC4862t.e(sourceStringSet, "sourceStringSet");
        EnumSet enumSetNoneOf = EnumSet.noneOf(targetEnumClass);
        Iterator it = sourceStringSet.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            try {
                Locale US = Locale.US;
                AbstractC4862t.d(US, "US");
                String enumValue = str.toUpperCase(US);
                AbstractC4862t.d(enumValue, "toUpperCase(...)");
                AbstractC4862t.e(enumValue, "enumValue");
                AbstractC4862t.e(targetEnumClass, "targetEnumClass");
                enumSetNoneOf.add(Enum.valueOf(targetEnumClass, enumValue));
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28640a, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.Y0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.support.k.a(str);
                    }
                }, 4, (Object) null);
            }
        }
        AbstractC4862t.b(enumSetNoneOf);
        return enumSetNoneOf;
    }

    public static final String a(String str) {
        return "Failed to create valid enum from string: " + str;
    }

    public static final Set a(EnumSet sourceEnumSet) {
        AbstractC4862t.e(sourceEnumSet, "sourceEnumSet");
        ArrayList arrayList = new ArrayList(C4207u.v(sourceEnumSet, 10));
        Iterator it = sourceEnumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return C4179C.Z0(arrayList);
    }
}
