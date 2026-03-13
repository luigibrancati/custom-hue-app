package com.braze.storage;

import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import gc.C4179C;
import ge.C4231e;
import he.AbstractC4304b;
import i1.C4319d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {
    public static final String b(String str) {
        return "Migrated Int key: " + str;
    }

    public static final String c(String str) {
        return "Migrated Boolean key: " + str;
    }

    public final AbstractC4785h a(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.J2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.p2.a();
            }
        }, 7, (Object) null);
        try {
            C4781d c4781dD = currentData.d();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    c4781dD.l(AbstractC4788k.g(str), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.K2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.p2.a(str);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Integer) {
                    c4781dD.l(AbstractC4788k.e(str), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.L2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.p2.b(str);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Boolean) {
                    c4781dD.l(AbstractC4788k.a(str), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.M2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.p2.c(str);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Set) {
                    final Set set = (Set) value;
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List listV0 = C4179C.V0(set);
                    try {
                        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                        aVar.d();
                        strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
                    }
                    c4781dD.l(AbstractC4788k.g(str), strB);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.N2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.p2.a(str, set);
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.O2
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.p2.a(str, value);
                        }
                    }, 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.P2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p2.c();
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.Q2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.p2.b();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b() {
        return "Failed to migrate runtime configuration to DataStore.";
    }

    public static final String c() {
        return "Migration for RuntimeAppConfiguration completed successfully.";
    }

    public static final String a() {
        return "Starting migration for RuntimeAppConfiguration";
    }

    public static final String a(String str) {
        return "Migrated String key: " + str;
    }

    public static final String a(String str, Set set) {
        return "Migrated StringSet key: " + str + " with " + set.size() + " items";
    }

    public static final String a(String str, Object obj) {
        return "Unknown type for key: " + str + ", value: " + obj + " (type: " + (obj != null ? obj.getClass().getSimpleName() : null) + ") - skipping migration";
    }
}
