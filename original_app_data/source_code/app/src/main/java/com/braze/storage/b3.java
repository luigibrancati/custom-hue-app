package com.braze.storage;

import Od.F;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4034q;
import gc.C4179C;
import gc.C4206t;
import gc.Q;
import gc.U;
import ge.C4231e;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f28398f = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f28399g = (int) TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.events.d f28400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f28401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f28402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2687a f28403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.braze.models.response.m f28404e;

    public b3(Context context, String apiKey, com.braze.events.d internalEventPublisher) {
        b3 b3Var;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        this.f28400a = internalEventPublisher;
        a3 a3Var = new a3(context, apiKey);
        this.f28401b = a3Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f28402c = reentrantLock;
        this.f28403d = AbstractC2693g.b(false, 1, null);
        DataStoreKey dataStoreKey = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        final String string = a3Var.readString(dataStoreKey, "");
        final String str = "41.0.0";
        if (AbstractC4862t.a("41.0.0", string)) {
            b3Var = this;
        } else {
            b3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b3Var, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.g1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b3.a(string, str);
                }
            }, 6, (Object) null);
            a3Var.writeData(DataStoreKey.CONFIG_TIME, 0L);
            a3Var.writeData(dataStoreKey, "41.0.0");
        }
        com.braze.models.response.m mVar = new com.braze.models.response.m();
        mVar.f28161c = b3Var.e();
        mVar.f28160b = b3Var.f();
        mVar.f28162d = b3Var.g();
        mVar.f28159a = b3Var.i();
        mVar.f28169k = b3Var.r();
        mVar.f28163e = b3Var.t();
        mVar.f28164f = b3Var.s();
        mVar.f28165g = b3Var.q();
        mVar.f28167i = b3Var.I();
        mVar.f28166h = b3Var.J();
        mVar.f28168j = b3Var.E();
        mVar.f28170l = b3Var.G();
        mVar.f28171m = b3Var.H();
        mVar.f28172n = b3Var.m();
        mVar.f28173o = b3Var.L();
        mVar.f28174p = b3Var.u();
        mVar.f28178t = b3Var.F();
        mVar.f28179u = b3Var.D();
        mVar.f28175q = b3Var.K();
        mVar.f28176r = b3Var.o();
        mVar.f28177s = b3Var.n();
        mVar.f28180v = b3Var.v();
        mVar.f28183y = b3Var.l();
        mVar.f28181w = b3Var.k();
        mVar.f28182x = b3Var.j();
        mVar.f28184z = b3Var.M();
        mVar.f28151A = b3Var.y();
        mVar.f28153C = b3Var.A();
        mVar.f28154D = b3Var.B();
        mVar.f28155E = b3Var.C();
        mVar.f28152B = Long.valueOf(b3Var.z());
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar2 = b3Var.f28404e;
            Map mapW = (mVar2 == null || (mapW = mVar2.f28156F) == null) ? b3Var.w() : mapW;
            reentrantLock.unlock();
            mVar.f28156F = mapW;
            mVar.f28157G = b3Var.d();
            mVar.f28158H = b3Var.p();
            reentrantLock.lock();
            try {
                b3Var.f28404e = mVar;
                C4015H c4015h = C4015H.f34254a;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final String O() {
        return "Attempting to unlock server config info";
    }

    public static final String P() {
        return "Unlocking config info lock.";
    }

    public static final String Q() {
        return "Tried to unlock server config info when not locked.";
    }

    public static final String R() {
        return "Could not persist server config to DataStore.";
    }

    public static final String S() {
        return "Could not persist server config to DataStore.";
    }

    public static final String T() {
        return "Server config is older than previous config time. Not sending out ConfigChangeEvent.";
    }

    public static final String a(String str, String str2) {
        return "Detected SDK update from '" + str + "' -> '" + str2 + "'. Clearing config update time.";
    }

    public static final String b(com.braze.models.response.m mVar) {
        return "Finishing updating server config to " + mVar;
    }

    public static final String c() {
        return "Not allowing server config info unlock. Returning null.";
    }

    public static final String h() {
        return "Experienced exception retrieving blocklisted strings from local storage. Returning empty set.";
    }

    public static final String x() {
        return "Failed to parse endpoint override from storage";
    }

    public final long A() {
        long j10;
        long jLongValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                j10 = 0;
                Long l10 = this.f28401b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, 0L);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            jLongValue = mVar.f28153C;
            j10 = jLongValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long B() {
        long j10;
        long jLongValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                j10 = 0;
                Long l10 = this.f28401b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, 0L);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            jLongValue = mVar.f28154D;
            j10 = jLongValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long C() {
        long j10;
        long jLongValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                j10 = 0;
                Long l10 = this.f28401b.readLong(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES, 0L);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            jLongValue = mVar.f28155E;
            j10 = jLongValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean D() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28179u;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean E() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28168j;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.CONTENT_CARDS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean F() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28178t;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.DUST_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean G() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28170l;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.EPHEMERAL_EVENTS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean H() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28171m;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.FEATURE_FLAGS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean I() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28167i;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.GEOFENCES_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean J() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28166h;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.GEOFENCES_ENABLED_SET, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean K() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28175q;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED, Boolean.TRUE);
                zBooleanValue = bool != null ? bool.booleanValue() : true;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean L() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28173o;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.PUSH_MAX_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean M() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28184z;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.SDK_DEBUGGER_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void N() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.l1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.b3.O();
            }
        }, 6, (Object) null);
        if (this.f28403d.g()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.m1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b3.P();
                }
            }, 7, (Object) null);
            try {
                InterfaceC2687a.C0267a.c(this.f28403d, null, 1, null);
            } catch (IllegalStateException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.b1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.b3.Q();
                    }
                }, 4, (Object) null);
            }
        }
    }

    public final boolean d() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                zBooleanValue = mVar.f28157G;
            } else {
                Boolean bool = this.f28401b.readBoolean(DataStoreKey.BANNERS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            reentrantLock.unlock();
            return zBooleanValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set e() {
        Set setA;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null || (setA = mVar.f28161c) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_ATTRIBUTES);
            }
            reentrantLock.unlock();
            return setA;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set f() {
        Set setA;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null || (setA = mVar.f28160b) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_EVENTS);
            }
            reentrantLock.unlock();
            return setA;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Set g() {
        Set setA;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null || (setA = mVar.f28162d) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_PURCHASES);
            }
            reentrantLock.unlock();
            return setA;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long i() {
        long j10;
        long jLongValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                j10 = 0;
                Long l10 = this.f28401b.readLong(DataStoreKey.CONFIG_TIME, 0L);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            jLongValue = mVar.f28159a;
            j10 = jLongValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int j() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                a3 a3Var = this.f28401b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS;
                i10 = f28399g;
                Integer num = a3Var.readInt(dataStoreKey, Integer.valueOf(i10));
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28182x;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int k() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                a3 a3Var = this.f28401b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS;
                i10 = f28398f;
                Integer num = a3Var.readInt(dataStoreKey, Integer.valueOf(i10));
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28181w;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int l() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                i10 = 3;
                Integer num = this.f28401b.readInt(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, 3);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28183y;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int m() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                i10 = -1;
                Integer num = this.f28401b.readInt(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, -1);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28172n;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int n() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                i10 = 30;
                Integer num = this.f28401b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, 30);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28177s;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int o() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                i10 = 30;
                Integer num = this.f28401b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, 30);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28176r;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int p() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                i10 = 0;
                Integer num = this.f28401b.readInt(DataStoreKey.MAX_BANNER_PLACEMENTS, 0);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28158H;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int q() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                i10 = -1;
                Integer num = this.f28401b.readInt(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER, -1);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28165g;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long r() {
        long j10;
        long jLongValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                j10 = -1;
                Long l10 = this.f28401b.readLong(DataStoreKey.MESSAGING_SESSION_TIMEOUT, -1L);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            jLongValue = mVar.f28169k;
            j10 = jLongValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int s() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                i10 = -1;
                Integer num = this.f28401b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REPORT, -1);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28164f;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int t() {
        int i10;
        int iIntValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                i10 = -1;
                Integer num = this.f28401b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST, -1);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                reentrantLock.unlock();
                return i10;
            }
            iIntValue = mVar.f28163e;
            i10 = iIntValue;
            reentrantLock.unlock();
            return i10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long u() {
        long j10;
        long jLongValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                j10 = 86400;
                Long l10 = this.f28401b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER, 86400L);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            jLongValue = mVar.f28174p;
            j10 = jLongValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long v() {
        long j10;
        long jLongValue;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null) {
                j10 = -1;
                Long l10 = this.f28401b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER, -1L);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            jLongValue = mVar.f28180v;
            j10 = jLongValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final LinkedHashMap w() {
        String str = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String string = this.f28401b.readString(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, "");
            if (string != null) {
                str = string;
            }
            if (str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                AbstractC4862t.d(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    com.braze.requests.m mVar = com.braze.requests.n.f28312b;
                    AbstractC4862t.b(next);
                    com.braze.requests.n nVarA = mVar.a(next);
                    if (nVarA != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        linkedHashMap.put(nVarA, new com.braze.models.response.j(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.j1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b3.x();
                }
            }, 4, (Object) null);
            return linkedHashMap;
        }
    }

    public final String y() {
        String string;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null || (string = mVar.f28151A) == null) {
                string = this.f28401b.readString(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE, null);
            }
            reentrantLock.unlock();
            return string;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long z() {
        long j10;
        long jLongValue;
        Long l10;
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar == null || (l10 = mVar.f28152B) == null) {
                j10 = -1;
                Long l11 = this.f28401b.readLong(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME, -1L);
                if (l11 != null) {
                    jLongValue = l11.longValue();
                }
                reentrantLock.unlock();
                return j10;
            }
            jLongValue = l10.longValue();
            j10 = jLongValue;
            reentrantLock.unlock();
            return j10;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b() {
        return "Attempting to acquire server config lock";
    }

    public final void a(final com.braze.models.response.m serverConfig) {
        String strB;
        String strB2;
        AbstractC4862t.e(serverConfig, "serverConfig");
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            this.f28404e = serverConfig;
            C4015H c4015h = C4015H.f34254a;
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set set = serverConfig.f28160b;
                String strB3 = "[]";
                if (set != null) {
                    String key = DataStoreKey.BLOCKLISTED_EVENTS.getKey();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List listV0 = C4179C.V0(set);
                    try {
                        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                        aVar.d();
                        strB2 = aVar.b(new C4231e(ge.w0.f35762a), listV0);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB2 = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
                    }
                    linkedHashMap.put(key, strB2);
                }
                Set set2 = serverConfig.f28161c;
                if (set2 != null) {
                    String key2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES.getKey();
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    List listV02 = C4179C.V0(set2);
                    try {
                        AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                        aVar2.d();
                        strB = aVar2.b(new C4231e(ge.w0.f35762a), listV02);
                    } catch (Exception e11) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB = ((listV02 instanceof Map) || listV02 == null) ? "{}" : "[]";
                    }
                    linkedHashMap.put(key2, strB);
                }
                Set set3 = serverConfig.f28162d;
                if (set3 != null) {
                    String key3 = DataStoreKey.BLOCKLISTED_PURCHASES.getKey();
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    List listV03 = C4179C.V0(set3);
                    try {
                        AbstractC4304b.a aVar3 = AbstractC4304b.f36582d;
                        aVar3.d();
                        strB3 = aVar3.b(new C4231e(ge.w0.f35762a), listV03);
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        if ((listV03 instanceof Map) || listV03 == null) {
                            strB3 = "{}";
                        }
                    }
                    linkedHashMap.put(key3, strB3);
                }
                Map map = serverConfig.f28156F;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (com.braze.requests.n nVar : map.keySet()) {
                        com.braze.models.response.j jVar = (com.braze.models.response.j) map.get(nVar);
                        if (jVar != null) {
                            jSONObject.put(nVar.name(), new JSONObject().put("refill", jVar.f28148b).put("capacity", jVar.f28147a));
                        }
                    }
                    linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), jSONObject.toString());
                }
                linkedHashMap.put(DataStoreKey.CONFIG_TIME.getKey(), Long.valueOf(serverConfig.f28159a));
                linkedHashMap.put(DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28170l));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), Boolean.valueOf(serverConfig.f28166h));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28167i));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), Integer.valueOf(serverConfig.f28163e));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), Integer.valueOf(serverConfig.f28164f));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), Integer.valueOf(serverConfig.f28165g));
                linkedHashMap.put(DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), Long.valueOf(serverConfig.f28169k));
                linkedHashMap.put(DataStoreKey.DUST_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28178t));
                linkedHashMap.put(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH.getKey(), Boolean.valueOf(serverConfig.f28179u));
                linkedHashMap.put(DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28168j));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28171m));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), Integer.valueOf(serverConfig.f28172n));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28173o));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), Long.valueOf(serverConfig.f28174p));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), Long.valueOf(serverConfig.f28180v));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28175q));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), Integer.valueOf(serverConfig.f28177s));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), Integer.valueOf(serverConfig.f28176r));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), Integer.valueOf(serverConfig.f28181w));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), Integer.valueOf(serverConfig.f28182x));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), Integer.valueOf(serverConfig.f28183y));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28184z));
                Long l10 = serverConfig.f28152B;
                if (l10 != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l10.longValue()));
                }
                String str = serverConfig.f28151A;
                if (str != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str);
                }
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(serverConfig.f28153C));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(serverConfig.f28154D));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(serverConfig.f28155E));
                linkedHashMap.put(DataStoreKey.BANNERS_ENABLED.getKey(), Boolean.valueOf(serverConfig.f28157G));
                linkedHashMap.put(DataStoreKey.MAX_BANNER_PLACEMENTS.getKey(), Integer.valueOf(serverConfig.f28158H));
                this.f28401b.batchUpdate(linkedHashMap, U.d());
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e13, false, new InterfaceC6082a() { // from class: r5.a1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.b3.S();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.e1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b3.b(serverConfig);
                }
            }, 6, (Object) null);
            if (mVar != null) {
                if (serverConfig.f28159a > mVar.f28159a) {
                    this.f28400a.b(new com.braze.events.internal.d(mVar, serverConfig), com.braze.events.internal.d.class);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.f1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.b3.T();
                        }
                    }, 7, (Object) null);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(com.braze.managers.d1 sdkDebugConfig) {
        AbstractC4862t.e(sdkDebugConfig, "sdkDebugConfig");
        ReentrantLock reentrantLock = this.f28402c;
        reentrantLock.lock();
        try {
            com.braze.models.response.m mVar = this.f28404e;
            if (mVar != null) {
                mVar.f28184z = sdkDebugConfig.f27850a;
            }
            if (mVar != null) {
                mVar.f28153C = sdkDebugConfig.f27853d;
            }
            if (mVar != null) {
                mVar.f28154D = sdkDebugConfig.f27854e;
            }
            if (mVar != null) {
                mVar.f28155E = sdkDebugConfig.f27855f;
            }
            String str = sdkDebugConfig.f27852c;
            if (str != null && mVar != null) {
                mVar.f28151A = str;
            }
            Long l10 = sdkDebugConfig.f27851b;
            if (l10 != null) {
                long jLongValue = l10.longValue();
                com.braze.models.response.m mVar2 = this.f28404e;
                if (mVar2 != null) {
                    mVar2.f28152B = Long.valueOf(jLongValue);
                }
                C4015H c4015h = C4015H.f34254a;
            }
            reentrantLock.unlock();
            try {
                com.braze.models.response.m mVar3 = this.f28404e;
                if (mVar3 != null) {
                    Map<String, ? extends Object> mapM = Q.m(AbstractC4040w.a(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(mVar3.f28184z)), AbstractC4040w.a(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(mVar3.f28153C)), AbstractC4040w.a(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(mVar3.f28154D)), AbstractC4040w.a(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(mVar3.f28155E)));
                    Long l11 = mVar3.f28152B;
                    if (l11 != null) {
                        mapM.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l11.longValue()));
                    }
                    String str2 = mVar3.f28151A;
                    if (str2 != null) {
                        mapM.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str2);
                    }
                    this.f28401b.batchUpdate(mapM, U.d());
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.c1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.b3.R();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.d1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b3.a(this.f43664a);
                }
            }, 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(b3 b3Var) {
        return "Finishing updating server config to " + b3Var.f28404e;
    }

    public final C4034q a() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.h1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.b3.b();
            }
        }, 6, (Object) null);
        if (!InterfaceC2687a.C0267a.b(this.f28403d, null, 1, null)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.i1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b3.c();
                }
            }, 6, (Object) null);
            return null;
        }
        return new C4034q(Long.valueOf(i()), Boolean.valueOf(i() <= 0));
    }

    public final HashSet a(DataStoreKey dataStoreKey) {
        Iterable arrayList;
        List listK;
        try {
            a3 a3Var = this.f28401b;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(dataStoreKey), 12, (Object) null);
                arrayList = new ArrayList();
            } else {
                try {
                    Object data = a3Var.readData(dataStoreKey, "");
                    AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) data;
                    if (F.k0(str)) {
                        arrayList = new ArrayList();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                            listK = C4206t.k();
                        } else {
                            try {
                                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                                aVar.d();
                                listK = (List) aVar.a(new C4231e(ge.w0.f35762a), str);
                            } catch (Exception e10) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                                listK = C4206t.k();
                            }
                        }
                        arrayList = C4179C.X0(listK);
                    }
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new i0(dataStoreKey), 8, (Object) null);
                    arrayList = new ArrayList();
                }
            }
            return C4179C.T0(arrayList);
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e12, false, new InterfaceC6082a() { // from class: r5.k1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b3.h();
                }
            }, 4, (Object) null);
            return new HashSet();
        }
    }
}
