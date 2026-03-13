package Q3;

import I3.C0874d;
import I3.EnumC0871a;
import I3.EnumC0891v;
import I3.L;
import Q3.I;
import Ud.InterfaceC2313e;
import androidx.work.b;
import b0.C2777a;
import b3.AbstractC2806e;
import b3.AbstractC2807f;
import fc.C4015H;
import gc.C4206t;
import h3.AbstractC4270a;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f13720d = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.t f13721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2807f f13722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2806e f13723c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2807f {
        @Override // b3.AbstractC2807f
        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // b3.AbstractC2807f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC4794d statement, I entity) {
            AbstractC4862t.e(statement, "statement");
            AbstractC4862t.e(entity, "entity");
            statement.N(1, entity.f13588a);
            statement.r(2, w0.k(entity.f13589b));
            statement.N(3, entity.f13590c);
            statement.N(4, entity.f13591d);
            b.C0319b c0319b = androidx.work.b.f24768b;
            statement.s(5, c0319b.e(entity.f13592e));
            statement.s(6, c0319b.e(entity.f13593f));
            statement.r(7, entity.f13594g);
            statement.r(8, entity.f13595h);
            statement.r(9, entity.f13596i);
            statement.r(10, entity.f13598k);
            statement.r(11, w0.a(entity.f13599l));
            statement.r(12, entity.f13600m);
            statement.r(13, entity.f13601n);
            statement.r(14, entity.f13602o);
            statement.r(15, entity.f13603p);
            statement.r(16, entity.f13604q ? 1L : 0L);
            statement.r(17, w0.i(entity.f13605r));
            statement.r(18, entity.j());
            statement.r(19, entity.g());
            statement.r(20, entity.h());
            statement.r(21, entity.i());
            statement.r(22, entity.k());
            String strL = entity.l();
            if (strL == null) {
                statement.t(23);
            } else {
                statement.N(23, strL);
            }
            Boolean boolF = entity.f();
            if ((boolF != null ? Integer.valueOf(boolF.booleanValue() ? 1 : 0) : null) == null) {
                statement.t(24);
            } else {
                statement.r(24, r3.intValue());
            }
            C0874d c0874d = entity.f13597j;
            statement.r(25, w0.h(c0874d.f()));
            statement.s(26, w0.c(c0874d.e()));
            statement.r(27, c0874d.i() ? 1L : 0L);
            statement.r(28, c0874d.j() ? 1L : 0L);
            statement.r(29, c0874d.h() ? 1L : 0L);
            statement.r(30, c0874d.k() ? 1L : 0L);
            statement.r(31, c0874d.b());
            statement.r(32, c0874d.a());
            statement.s(33, w0.j(c0874d.c()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC2806e {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public /* synthetic */ c(AbstractC4854k abstractC4854k) {
            this();
        }

        public final List a() {
            return C4206t.k();
        }

        public c() {
        }
    }

    public p0(b3.t __db) {
        AbstractC4862t.e(__db, "__db");
        this.f13721a = __db;
        this.f13722b = new a();
        this.f13723c = new b();
    }

    public static final C4015H A0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            interfaceC4794dA1.X0();
            interfaceC4794dA1.close();
            return C4015H.f34254a;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final int B0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            interfaceC4794dA1.X0();
            return h3.j.a(_connection);
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final C4015H C0(p0 p0Var, I i10, InterfaceC4792b _connection) throws Exception {
        AbstractC4862t.e(_connection, "_connection");
        p0Var.f13722b.c(_connection, i10);
        return C4015H.f34254a;
    }

    public static final int D0(String str, long j10, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.r(1, j10);
            interfaceC4794dA1.N(2, str2);
            interfaceC4794dA1.X0();
            return h3.j.a(_connection);
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final int E0(String str, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.X0();
            return h3.j.a(_connection);
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final C4015H F0(String str, String str2, int i10, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            interfaceC4794dA1.r(2, i10);
            interfaceC4794dA1.X0();
            interfaceC4794dA1.close();
            return C4015H.f34254a;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final int G0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            interfaceC4794dA1.X0();
            return h3.j.a(_connection);
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final int H0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            interfaceC4794dA1.X0();
            return h3.j.a(_connection);
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final C4015H I0(String str, long j10, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.r(1, j10);
            interfaceC4794dA1.N(2, str2);
            interfaceC4794dA1.X0();
            interfaceC4794dA1.close();
            return C4015H.f34254a;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final C4015H J0(String str, androidx.work.b bVar, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.s(1, androidx.work.b.f24768b.e(bVar));
            interfaceC4794dA1.N(2, str2);
            interfaceC4794dA1.X0();
            interfaceC4794dA1.close();
            return C4015H.f34254a;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final int K0(String str, L.c cVar, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.r(1, w0.k(cVar));
            interfaceC4794dA1.N(2, str2);
            interfaceC4794dA1.X0();
            return h3.j.a(_connection);
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final C4015H L0(String str, int i10, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.r(1, i10);
            interfaceC4794dA1.N(2, str2);
            interfaceC4794dA1.X0();
            interfaceC4794dA1.close();
            return C4015H.f34254a;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final C4015H h0(p0 p0Var, InterfaceC4792b interfaceC4792b, C2777a _tmpMap) {
        AbstractC4862t.e(_tmpMap, "_tmpMap");
        p0Var.g0(interfaceC4792b, _tmpMap);
        return C4015H.f34254a;
    }

    public static final C4015H j0(p0 p0Var, InterfaceC4792b interfaceC4792b, C2777a _tmpMap) {
        AbstractC4862t.e(_tmpMap, "_tmpMap");
        p0Var.i0(interfaceC4792b, _tmpMap);
        return C4015H.f34254a;
    }

    public static final int k0(String str, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            return interfaceC4794dA1.X0() ? (int) interfaceC4794dA1.getLong(0) : 0;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final C4015H l0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            interfaceC4794dA1.X0();
            interfaceC4794dA1.close();
            return C4015H.f34254a;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final List m0(String str, int i10, InterfaceC4792b _connection) {
        int i11;
        Integer numValueOf;
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.r(1, i10);
            int iD = h3.k.d(interfaceC4794dA1, "id");
            int iD2 = h3.k.d(interfaceC4794dA1, SentryThread.JsonKeys.STATE);
            int iD3 = h3.k.d(interfaceC4794dA1, "worker_class_name");
            int iD4 = h3.k.d(interfaceC4794dA1, "input_merger_class_name");
            int iD5 = h3.k.d(interfaceC4794dA1, "input");
            int iD6 = h3.k.d(interfaceC4794dA1, "output");
            int iD7 = h3.k.d(interfaceC4794dA1, "initial_delay");
            int iD8 = h3.k.d(interfaceC4794dA1, "interval_duration");
            int iD9 = h3.k.d(interfaceC4794dA1, "flex_duration");
            int iD10 = h3.k.d(interfaceC4794dA1, "run_attempt_count");
            int iD11 = h3.k.d(interfaceC4794dA1, "backoff_policy");
            int iD12 = h3.k.d(interfaceC4794dA1, "backoff_delay_duration");
            int iD13 = h3.k.d(interfaceC4794dA1, "last_enqueue_time");
            int iD14 = h3.k.d(interfaceC4794dA1, "minimum_retention_duration");
            int iD15 = h3.k.d(interfaceC4794dA1, "schedule_requested_at");
            int iD16 = h3.k.d(interfaceC4794dA1, "run_in_foreground");
            int iD17 = h3.k.d(interfaceC4794dA1, "out_of_quota_policy");
            int iD18 = h3.k.d(interfaceC4794dA1, "period_count");
            int iD19 = h3.k.d(interfaceC4794dA1, "generation");
            int iD20 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override");
            int iD21 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override_generation");
            int iD22 = h3.k.d(interfaceC4794dA1, "stop_reason");
            int iD23 = h3.k.d(interfaceC4794dA1, "trace_tag");
            int iD24 = h3.k.d(interfaceC4794dA1, "backoff_on_system_interruptions");
            int iD25 = h3.k.d(interfaceC4794dA1, "required_network_type");
            int iD26 = h3.k.d(interfaceC4794dA1, "required_network_request");
            int iD27 = h3.k.d(interfaceC4794dA1, "requires_charging");
            int iD28 = h3.k.d(interfaceC4794dA1, "requires_device_idle");
            int iD29 = h3.k.d(interfaceC4794dA1, "requires_battery_not_low");
            int iD30 = h3.k.d(interfaceC4794dA1, "requires_storage_not_low");
            int iD31 = h3.k.d(interfaceC4794dA1, "trigger_content_update_delay");
            int iD32 = h3.k.d(interfaceC4794dA1, "trigger_max_content_delay");
            int iD33 = h3.k.d(interfaceC4794dA1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                String strK0 = interfaceC4794dA1.K0(iD);
                int i12 = iD13;
                int i13 = iD14;
                L.c cVarG = w0.g((int) interfaceC4794dA1.getLong(iD2));
                String strK02 = interfaceC4794dA1.K0(iD3);
                String strK03 = interfaceC4794dA1.K0(iD4);
                byte[] blob = interfaceC4794dA1.getBlob(iD5);
                b.C0319b c0319b = androidx.work.b.f24768b;
                androidx.work.b bVarA = c0319b.a(blob);
                androidx.work.b bVarA2 = c0319b.a(interfaceC4794dA1.getBlob(iD6));
                long j10 = interfaceC4794dA1.getLong(iD7);
                long j11 = interfaceC4794dA1.getLong(iD8);
                long j12 = interfaceC4794dA1.getLong(iD9);
                int i14 = (int) interfaceC4794dA1.getLong(iD10);
                int i15 = iD;
                int i16 = iD2;
                EnumC0871a enumC0871aD = w0.d((int) interfaceC4794dA1.getLong(iD11));
                long j13 = interfaceC4794dA1.getLong(iD12);
                long j14 = interfaceC4794dA1.getLong(i12);
                long j15 = interfaceC4794dA1.getLong(i13);
                int i17 = iD15;
                long j16 = interfaceC4794dA1.getLong(i17);
                iD15 = i17;
                int i18 = iD16;
                int i19 = iD3;
                boolean z10 = ((int) interfaceC4794dA1.getLong(i18)) != 0;
                int i20 = iD17;
                int i21 = iD4;
                I3.D dF = w0.f((int) interfaceC4794dA1.getLong(i20));
                int i22 = iD18;
                int i23 = (int) interfaceC4794dA1.getLong(i22);
                int i24 = iD19;
                int i25 = (int) interfaceC4794dA1.getLong(i24);
                int i26 = iD20;
                long j17 = interfaceC4794dA1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) interfaceC4794dA1.getLong(i27);
                iD21 = i27;
                int i29 = iD22;
                int i30 = (int) interfaceC4794dA1.getLong(i29);
                int i31 = iD23;
                Boolean boolValueOf = null;
                String strK04 = interfaceC4794dA1.isNull(i31) ? null : interfaceC4794dA1.K0(i31);
                int i32 = iD24;
                if (interfaceC4794dA1.isNull(i32)) {
                    i11 = i31;
                    iD22 = i29;
                    numValueOf = null;
                } else {
                    i11 = i31;
                    iD22 = i29;
                    numValueOf = Integer.valueOf((int) interfaceC4794dA1.getLong(i32));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i33 = iD25;
                EnumC0891v enumC0891vE = w0.e((int) interfaceC4794dA1.getLong(i33));
                int i34 = iD26;
                R3.p pVarL = w0.l(interfaceC4794dA1.getBlob(i34));
                int i35 = iD27;
                boolean z11 = ((int) interfaceC4794dA1.getLong(i35)) != 0;
                int i36 = iD28;
                boolean z12 = ((int) interfaceC4794dA1.getLong(i36)) != 0;
                int i37 = iD29;
                boolean z13 = ((int) interfaceC4794dA1.getLong(i37)) != 0;
                iD29 = i37;
                int i38 = iD30;
                int i39 = iD31;
                int i40 = iD32;
                iD31 = i39;
                int i41 = iD33;
                arrayList.add(new I(strK0, cVarG, strK02, strK03, bVarA, bVarA2, j10, j11, j12, new C0874d(pVarL, enumC0891vE, z11, z12, z13, ((int) interfaceC4794dA1.getLong(i38)) != 0, interfaceC4794dA1.getLong(i39), interfaceC4794dA1.getLong(i40), w0.b(interfaceC4794dA1.getBlob(i41))), i14, enumC0871aD, j13, j14, j15, j16, z10, dF, i23, i25, j17, i28, i30, strK04, bool));
                iD28 = i36;
                iD4 = i21;
                iD17 = i20;
                iD18 = i22;
                iD19 = i24;
                iD20 = i26;
                iD23 = i11;
                iD24 = i32;
                iD25 = i33;
                iD26 = i34;
                iD27 = i35;
                iD33 = i41;
                iD32 = i40;
                iD30 = i38;
                iD = i15;
                iD13 = i12;
                iD14 = i13;
                iD2 = i16;
                iD3 = i19;
                iD16 = i18;
            }
            interfaceC4794dA1.close();
            return arrayList;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final List n0(String str, int i10, InterfaceC4792b _connection) {
        int i11;
        Integer numValueOf;
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.r(1, i10);
            int iD = h3.k.d(interfaceC4794dA1, "id");
            int iD2 = h3.k.d(interfaceC4794dA1, SentryThread.JsonKeys.STATE);
            int iD3 = h3.k.d(interfaceC4794dA1, "worker_class_name");
            int iD4 = h3.k.d(interfaceC4794dA1, "input_merger_class_name");
            int iD5 = h3.k.d(interfaceC4794dA1, "input");
            int iD6 = h3.k.d(interfaceC4794dA1, "output");
            int iD7 = h3.k.d(interfaceC4794dA1, "initial_delay");
            int iD8 = h3.k.d(interfaceC4794dA1, "interval_duration");
            int iD9 = h3.k.d(interfaceC4794dA1, "flex_duration");
            int iD10 = h3.k.d(interfaceC4794dA1, "run_attempt_count");
            int iD11 = h3.k.d(interfaceC4794dA1, "backoff_policy");
            int iD12 = h3.k.d(interfaceC4794dA1, "backoff_delay_duration");
            int iD13 = h3.k.d(interfaceC4794dA1, "last_enqueue_time");
            int iD14 = h3.k.d(interfaceC4794dA1, "minimum_retention_duration");
            int iD15 = h3.k.d(interfaceC4794dA1, "schedule_requested_at");
            int iD16 = h3.k.d(interfaceC4794dA1, "run_in_foreground");
            int iD17 = h3.k.d(interfaceC4794dA1, "out_of_quota_policy");
            int iD18 = h3.k.d(interfaceC4794dA1, "period_count");
            int iD19 = h3.k.d(interfaceC4794dA1, "generation");
            int iD20 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override");
            int iD21 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override_generation");
            int iD22 = h3.k.d(interfaceC4794dA1, "stop_reason");
            int iD23 = h3.k.d(interfaceC4794dA1, "trace_tag");
            int iD24 = h3.k.d(interfaceC4794dA1, "backoff_on_system_interruptions");
            int iD25 = h3.k.d(interfaceC4794dA1, "required_network_type");
            int iD26 = h3.k.d(interfaceC4794dA1, "required_network_request");
            int iD27 = h3.k.d(interfaceC4794dA1, "requires_charging");
            int iD28 = h3.k.d(interfaceC4794dA1, "requires_device_idle");
            int iD29 = h3.k.d(interfaceC4794dA1, "requires_battery_not_low");
            int iD30 = h3.k.d(interfaceC4794dA1, "requires_storage_not_low");
            int iD31 = h3.k.d(interfaceC4794dA1, "trigger_content_update_delay");
            int iD32 = h3.k.d(interfaceC4794dA1, "trigger_max_content_delay");
            int iD33 = h3.k.d(interfaceC4794dA1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                String strK0 = interfaceC4794dA1.K0(iD);
                int i12 = iD13;
                int i13 = iD14;
                L.c cVarG = w0.g((int) interfaceC4794dA1.getLong(iD2));
                String strK02 = interfaceC4794dA1.K0(iD3);
                String strK03 = interfaceC4794dA1.K0(iD4);
                byte[] blob = interfaceC4794dA1.getBlob(iD5);
                b.C0319b c0319b = androidx.work.b.f24768b;
                androidx.work.b bVarA = c0319b.a(blob);
                androidx.work.b bVarA2 = c0319b.a(interfaceC4794dA1.getBlob(iD6));
                long j10 = interfaceC4794dA1.getLong(iD7);
                long j11 = interfaceC4794dA1.getLong(iD8);
                long j12 = interfaceC4794dA1.getLong(iD9);
                int i14 = (int) interfaceC4794dA1.getLong(iD10);
                int i15 = iD;
                int i16 = iD2;
                EnumC0871a enumC0871aD = w0.d((int) interfaceC4794dA1.getLong(iD11));
                long j13 = interfaceC4794dA1.getLong(iD12);
                long j14 = interfaceC4794dA1.getLong(i12);
                long j15 = interfaceC4794dA1.getLong(i13);
                int i17 = iD15;
                long j16 = interfaceC4794dA1.getLong(i17);
                iD15 = i17;
                int i18 = iD16;
                int i19 = iD3;
                boolean z10 = ((int) interfaceC4794dA1.getLong(i18)) != 0;
                int i20 = iD17;
                int i21 = iD4;
                I3.D dF = w0.f((int) interfaceC4794dA1.getLong(i20));
                int i22 = iD18;
                int i23 = (int) interfaceC4794dA1.getLong(i22);
                int i24 = iD19;
                int i25 = (int) interfaceC4794dA1.getLong(i24);
                int i26 = iD20;
                long j17 = interfaceC4794dA1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) interfaceC4794dA1.getLong(i27);
                iD21 = i27;
                int i29 = iD22;
                int i30 = (int) interfaceC4794dA1.getLong(i29);
                int i31 = iD23;
                Boolean boolValueOf = null;
                String strK04 = interfaceC4794dA1.isNull(i31) ? null : interfaceC4794dA1.K0(i31);
                int i32 = iD24;
                if (interfaceC4794dA1.isNull(i32)) {
                    i11 = i31;
                    iD22 = i29;
                    numValueOf = null;
                } else {
                    i11 = i31;
                    iD22 = i29;
                    numValueOf = Integer.valueOf((int) interfaceC4794dA1.getLong(i32));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i33 = iD25;
                EnumC0891v enumC0891vE = w0.e((int) interfaceC4794dA1.getLong(i33));
                int i34 = iD26;
                R3.p pVarL = w0.l(interfaceC4794dA1.getBlob(i34));
                int i35 = iD27;
                boolean z11 = ((int) interfaceC4794dA1.getLong(i35)) != 0;
                int i36 = iD28;
                boolean z12 = ((int) interfaceC4794dA1.getLong(i36)) != 0;
                int i37 = iD29;
                boolean z13 = ((int) interfaceC4794dA1.getLong(i37)) != 0;
                iD29 = i37;
                int i38 = iD30;
                int i39 = iD31;
                int i40 = iD32;
                iD31 = i39;
                int i41 = iD33;
                arrayList.add(new I(strK0, cVarG, strK02, strK03, bVarA, bVarA2, j10, j11, j12, new C0874d(pVarL, enumC0891vE, z11, z12, z13, ((int) interfaceC4794dA1.getLong(i38)) != 0, interfaceC4794dA1.getLong(i39), interfaceC4794dA1.getLong(i40), w0.b(interfaceC4794dA1.getBlob(i41))), i14, enumC0871aD, j13, j14, j15, j16, z10, dF, i23, i25, j17, i28, i30, strK04, bool));
                iD28 = i36;
                iD4 = i21;
                iD17 = i20;
                iD18 = i22;
                iD19 = i24;
                iD20 = i26;
                iD23 = i11;
                iD24 = i32;
                iD25 = i33;
                iD26 = i34;
                iD27 = i35;
                iD33 = i41;
                iD32 = i40;
                iD30 = i38;
                iD = i15;
                iD13 = i12;
                iD14 = i13;
                iD2 = i16;
                iD3 = i19;
                iD16 = i18;
            }
            interfaceC4794dA1.close();
            return arrayList;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final List o0(String str, InterfaceC4792b _connection) {
        int i10;
        int i11;
        Integer numValueOf;
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            int iD = h3.k.d(interfaceC4794dA1, "id");
            int iD2 = h3.k.d(interfaceC4794dA1, SentryThread.JsonKeys.STATE);
            int iD3 = h3.k.d(interfaceC4794dA1, "worker_class_name");
            int iD4 = h3.k.d(interfaceC4794dA1, "input_merger_class_name");
            int iD5 = h3.k.d(interfaceC4794dA1, "input");
            int iD6 = h3.k.d(interfaceC4794dA1, "output");
            int iD7 = h3.k.d(interfaceC4794dA1, "initial_delay");
            int iD8 = h3.k.d(interfaceC4794dA1, "interval_duration");
            int iD9 = h3.k.d(interfaceC4794dA1, "flex_duration");
            int iD10 = h3.k.d(interfaceC4794dA1, "run_attempt_count");
            int iD11 = h3.k.d(interfaceC4794dA1, "backoff_policy");
            int iD12 = h3.k.d(interfaceC4794dA1, "backoff_delay_duration");
            int iD13 = h3.k.d(interfaceC4794dA1, "last_enqueue_time");
            int iD14 = h3.k.d(interfaceC4794dA1, "minimum_retention_duration");
            int iD15 = h3.k.d(interfaceC4794dA1, "schedule_requested_at");
            int iD16 = h3.k.d(interfaceC4794dA1, "run_in_foreground");
            int iD17 = h3.k.d(interfaceC4794dA1, "out_of_quota_policy");
            int iD18 = h3.k.d(interfaceC4794dA1, "period_count");
            int iD19 = h3.k.d(interfaceC4794dA1, "generation");
            int iD20 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override");
            int iD21 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override_generation");
            int iD22 = h3.k.d(interfaceC4794dA1, "stop_reason");
            int iD23 = h3.k.d(interfaceC4794dA1, "trace_tag");
            int iD24 = h3.k.d(interfaceC4794dA1, "backoff_on_system_interruptions");
            int iD25 = h3.k.d(interfaceC4794dA1, "required_network_type");
            int iD26 = h3.k.d(interfaceC4794dA1, "required_network_request");
            int iD27 = h3.k.d(interfaceC4794dA1, "requires_charging");
            int iD28 = h3.k.d(interfaceC4794dA1, "requires_device_idle");
            int iD29 = h3.k.d(interfaceC4794dA1, "requires_battery_not_low");
            int iD30 = h3.k.d(interfaceC4794dA1, "requires_storage_not_low");
            int iD31 = h3.k.d(interfaceC4794dA1, "trigger_content_update_delay");
            int iD32 = h3.k.d(interfaceC4794dA1, "trigger_max_content_delay");
            int iD33 = h3.k.d(interfaceC4794dA1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                String strK0 = interfaceC4794dA1.K0(iD);
                int i12 = iD14;
                ArrayList arrayList2 = arrayList;
                L.c cVarG = w0.g((int) interfaceC4794dA1.getLong(iD2));
                String strK02 = interfaceC4794dA1.K0(iD3);
                String strK03 = interfaceC4794dA1.K0(iD4);
                byte[] blob = interfaceC4794dA1.getBlob(iD5);
                b.C0319b c0319b = androidx.work.b.f24768b;
                androidx.work.b bVarA = c0319b.a(blob);
                androidx.work.b bVarA2 = c0319b.a(interfaceC4794dA1.getBlob(iD6));
                long j10 = interfaceC4794dA1.getLong(iD7);
                long j11 = interfaceC4794dA1.getLong(iD8);
                long j12 = interfaceC4794dA1.getLong(iD9);
                int i13 = (int) interfaceC4794dA1.getLong(iD10);
                int i14 = iD2;
                int i15 = iD3;
                EnumC0871a enumC0871aD = w0.d((int) interfaceC4794dA1.getLong(iD11));
                long j13 = interfaceC4794dA1.getLong(iD12);
                long j14 = interfaceC4794dA1.getLong(iD13);
                long j15 = interfaceC4794dA1.getLong(i12);
                int i16 = iD15;
                long j16 = interfaceC4794dA1.getLong(i16);
                int i17 = iD;
                int i18 = iD16;
                boolean z10 = ((int) interfaceC4794dA1.getLong(i18)) != 0;
                int i19 = iD17;
                int i20 = iD4;
                I3.D dF = w0.f((int) interfaceC4794dA1.getLong(i19));
                int i21 = iD18;
                int i22 = iD5;
                int i23 = (int) interfaceC4794dA1.getLong(i21);
                int i24 = iD19;
                int i25 = (int) interfaceC4794dA1.getLong(i24);
                int i26 = iD20;
                long j17 = interfaceC4794dA1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) interfaceC4794dA1.getLong(i27);
                int i29 = iD22;
                int i30 = (int) interfaceC4794dA1.getLong(i29);
                int i31 = iD23;
                Boolean boolValueOf = null;
                String strK04 = interfaceC4794dA1.isNull(i31) ? null : interfaceC4794dA1.K0(i31);
                int i32 = iD24;
                if (interfaceC4794dA1.isNull(i32)) {
                    i10 = i28;
                    i11 = i29;
                    numValueOf = null;
                } else {
                    i10 = i28;
                    i11 = i29;
                    numValueOf = Integer.valueOf((int) interfaceC4794dA1.getLong(i32));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i33 = iD25;
                Boolean bool = boolValueOf;
                EnumC0891v enumC0891vE = w0.e((int) interfaceC4794dA1.getLong(i33));
                int i34 = iD26;
                R3.p pVarL = w0.l(interfaceC4794dA1.getBlob(i34));
                iD25 = i33;
                iD26 = i34;
                int i35 = iD27;
                boolean z11 = ((int) interfaceC4794dA1.getLong(i35)) != 0;
                iD27 = i35;
                int i36 = iD28;
                boolean z12 = ((int) interfaceC4794dA1.getLong(i36)) != 0;
                int i37 = iD29;
                boolean z13 = ((int) interfaceC4794dA1.getLong(i37)) != 0;
                iD29 = i37;
                int i38 = iD30;
                int i39 = iD31;
                int i40 = iD32;
                int i41 = iD33;
                iD33 = i41;
                arrayList2.add(new I(strK0, cVarG, strK02, strK03, bVarA, bVarA2, j10, j11, j12, new C0874d(pVarL, enumC0891vE, z11, z12, z13, ((int) interfaceC4794dA1.getLong(i38)) != 0, interfaceC4794dA1.getLong(i39), interfaceC4794dA1.getLong(i40), w0.b(interfaceC4794dA1.getBlob(i41))), i13, enumC0871aD, j13, j14, j15, j16, z10, dF, i23, i25, j17, i10, i30, strK04, bool));
                iD30 = i38;
                iD4 = i20;
                iD17 = i19;
                iD19 = i24;
                iD22 = i11;
                iD24 = i32;
                iD31 = i39;
                iD32 = i40;
                iD2 = i14;
                iD14 = i12;
                iD3 = i15;
                arrayList = arrayList2;
                iD = i17;
                iD15 = i16;
                iD16 = i18;
                iD20 = i26;
                iD21 = i27;
                iD23 = i31;
                iD28 = i36;
                iD5 = i22;
                iD18 = i21;
            }
            ArrayList arrayList3 = arrayList;
            interfaceC4794dA1.close();
            return arrayList3;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final List p0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                arrayList.add(androidx.work.b.f24768b.a(interfaceC4794dA1.getBlob(0)));
            }
            return arrayList;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final List q0(String str, long j10, InterfaceC4792b _connection) {
        int i10;
        Integer numValueOf;
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.r(1, j10);
            int iD = h3.k.d(interfaceC4794dA1, "id");
            int iD2 = h3.k.d(interfaceC4794dA1, SentryThread.JsonKeys.STATE);
            int iD3 = h3.k.d(interfaceC4794dA1, "worker_class_name");
            int iD4 = h3.k.d(interfaceC4794dA1, "input_merger_class_name");
            int iD5 = h3.k.d(interfaceC4794dA1, "input");
            int iD6 = h3.k.d(interfaceC4794dA1, "output");
            int iD7 = h3.k.d(interfaceC4794dA1, "initial_delay");
            int iD8 = h3.k.d(interfaceC4794dA1, "interval_duration");
            int iD9 = h3.k.d(interfaceC4794dA1, "flex_duration");
            int iD10 = h3.k.d(interfaceC4794dA1, "run_attempt_count");
            int iD11 = h3.k.d(interfaceC4794dA1, "backoff_policy");
            int iD12 = h3.k.d(interfaceC4794dA1, "backoff_delay_duration");
            int iD13 = h3.k.d(interfaceC4794dA1, "last_enqueue_time");
            int iD14 = h3.k.d(interfaceC4794dA1, "minimum_retention_duration");
            int iD15 = h3.k.d(interfaceC4794dA1, "schedule_requested_at");
            int iD16 = h3.k.d(interfaceC4794dA1, "run_in_foreground");
            int iD17 = h3.k.d(interfaceC4794dA1, "out_of_quota_policy");
            int iD18 = h3.k.d(interfaceC4794dA1, "period_count");
            int iD19 = h3.k.d(interfaceC4794dA1, "generation");
            int iD20 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override");
            int iD21 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override_generation");
            int iD22 = h3.k.d(interfaceC4794dA1, "stop_reason");
            int iD23 = h3.k.d(interfaceC4794dA1, "trace_tag");
            int iD24 = h3.k.d(interfaceC4794dA1, "backoff_on_system_interruptions");
            int iD25 = h3.k.d(interfaceC4794dA1, "required_network_type");
            int iD26 = h3.k.d(interfaceC4794dA1, "required_network_request");
            int iD27 = h3.k.d(interfaceC4794dA1, "requires_charging");
            int iD28 = h3.k.d(interfaceC4794dA1, "requires_device_idle");
            int iD29 = h3.k.d(interfaceC4794dA1, "requires_battery_not_low");
            int iD30 = h3.k.d(interfaceC4794dA1, "requires_storage_not_low");
            int iD31 = h3.k.d(interfaceC4794dA1, "trigger_content_update_delay");
            int iD32 = h3.k.d(interfaceC4794dA1, "trigger_max_content_delay");
            int iD33 = h3.k.d(interfaceC4794dA1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                String strK0 = interfaceC4794dA1.K0(iD);
                int i11 = iD13;
                int i12 = iD14;
                L.c cVarG = w0.g((int) interfaceC4794dA1.getLong(iD2));
                String strK02 = interfaceC4794dA1.K0(iD3);
                String strK03 = interfaceC4794dA1.K0(iD4);
                byte[] blob = interfaceC4794dA1.getBlob(iD5);
                b.C0319b c0319b = androidx.work.b.f24768b;
                androidx.work.b bVarA = c0319b.a(blob);
                androidx.work.b bVarA2 = c0319b.a(interfaceC4794dA1.getBlob(iD6));
                long j11 = interfaceC4794dA1.getLong(iD7);
                long j12 = interfaceC4794dA1.getLong(iD8);
                long j13 = interfaceC4794dA1.getLong(iD9);
                int i13 = (int) interfaceC4794dA1.getLong(iD10);
                int i14 = iD;
                int i15 = iD2;
                EnumC0871a enumC0871aD = w0.d((int) interfaceC4794dA1.getLong(iD11));
                long j14 = interfaceC4794dA1.getLong(iD12);
                long j15 = interfaceC4794dA1.getLong(i11);
                long j16 = interfaceC4794dA1.getLong(i12);
                int i16 = iD15;
                long j17 = interfaceC4794dA1.getLong(i16);
                iD15 = i16;
                int i17 = iD16;
                int i18 = iD3;
                boolean z10 = ((int) interfaceC4794dA1.getLong(i17)) != 0;
                int i19 = iD17;
                int i20 = iD4;
                I3.D dF = w0.f((int) interfaceC4794dA1.getLong(i19));
                int i21 = iD18;
                int i22 = (int) interfaceC4794dA1.getLong(i21);
                int i23 = iD19;
                int i24 = (int) interfaceC4794dA1.getLong(i23);
                int i25 = iD20;
                long j18 = interfaceC4794dA1.getLong(i25);
                int i26 = iD21;
                int i27 = (int) interfaceC4794dA1.getLong(i26);
                iD21 = i26;
                int i28 = iD22;
                int i29 = (int) interfaceC4794dA1.getLong(i28);
                int i30 = iD23;
                Boolean boolValueOf = null;
                String strK04 = interfaceC4794dA1.isNull(i30) ? null : interfaceC4794dA1.K0(i30);
                int i31 = iD24;
                if (interfaceC4794dA1.isNull(i31)) {
                    i10 = i30;
                    iD22 = i28;
                    numValueOf = null;
                } else {
                    i10 = i30;
                    iD22 = i28;
                    numValueOf = Integer.valueOf((int) interfaceC4794dA1.getLong(i31));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i32 = iD25;
                EnumC0891v enumC0891vE = w0.e((int) interfaceC4794dA1.getLong(i32));
                int i33 = iD26;
                R3.p pVarL = w0.l(interfaceC4794dA1.getBlob(i33));
                int i34 = iD27;
                boolean z11 = ((int) interfaceC4794dA1.getLong(i34)) != 0;
                int i35 = iD28;
                boolean z12 = ((int) interfaceC4794dA1.getLong(i35)) != 0;
                int i36 = iD29;
                boolean z13 = ((int) interfaceC4794dA1.getLong(i36)) != 0;
                iD29 = i36;
                int i37 = iD30;
                int i38 = iD31;
                int i39 = iD32;
                iD31 = i38;
                int i40 = iD33;
                arrayList.add(new I(strK0, cVarG, strK02, strK03, bVarA, bVarA2, j11, j12, j13, new C0874d(pVarL, enumC0891vE, z11, z12, z13, ((int) interfaceC4794dA1.getLong(i37)) != 0, interfaceC4794dA1.getLong(i38), interfaceC4794dA1.getLong(i39), w0.b(interfaceC4794dA1.getBlob(i40))), i13, enumC0871aD, j14, j15, j16, j17, z10, dF, i22, i24, j18, i27, i29, strK04, bool));
                iD4 = i20;
                iD17 = i19;
                iD18 = i21;
                iD19 = i23;
                iD20 = i25;
                iD23 = i10;
                iD24 = i31;
                iD25 = i32;
                iD26 = i33;
                iD27 = i34;
                iD28 = i35;
                iD33 = i40;
                iD32 = i39;
                iD30 = i37;
                iD = i14;
                iD13 = i11;
                iD14 = i12;
                iD2 = i15;
                iD3 = i18;
                iD16 = i17;
            }
            interfaceC4794dA1.close();
            return arrayList;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final List r0(String str, InterfaceC4792b _connection) {
        int i10;
        int i11;
        Integer numValueOf;
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            int iD = h3.k.d(interfaceC4794dA1, "id");
            int iD2 = h3.k.d(interfaceC4794dA1, SentryThread.JsonKeys.STATE);
            int iD3 = h3.k.d(interfaceC4794dA1, "worker_class_name");
            int iD4 = h3.k.d(interfaceC4794dA1, "input_merger_class_name");
            int iD5 = h3.k.d(interfaceC4794dA1, "input");
            int iD6 = h3.k.d(interfaceC4794dA1, "output");
            int iD7 = h3.k.d(interfaceC4794dA1, "initial_delay");
            int iD8 = h3.k.d(interfaceC4794dA1, "interval_duration");
            int iD9 = h3.k.d(interfaceC4794dA1, "flex_duration");
            int iD10 = h3.k.d(interfaceC4794dA1, "run_attempt_count");
            int iD11 = h3.k.d(interfaceC4794dA1, "backoff_policy");
            int iD12 = h3.k.d(interfaceC4794dA1, "backoff_delay_duration");
            int iD13 = h3.k.d(interfaceC4794dA1, "last_enqueue_time");
            int iD14 = h3.k.d(interfaceC4794dA1, "minimum_retention_duration");
            int iD15 = h3.k.d(interfaceC4794dA1, "schedule_requested_at");
            int iD16 = h3.k.d(interfaceC4794dA1, "run_in_foreground");
            int iD17 = h3.k.d(interfaceC4794dA1, "out_of_quota_policy");
            int iD18 = h3.k.d(interfaceC4794dA1, "period_count");
            int iD19 = h3.k.d(interfaceC4794dA1, "generation");
            int iD20 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override");
            int iD21 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override_generation");
            int iD22 = h3.k.d(interfaceC4794dA1, "stop_reason");
            int iD23 = h3.k.d(interfaceC4794dA1, "trace_tag");
            int iD24 = h3.k.d(interfaceC4794dA1, "backoff_on_system_interruptions");
            int iD25 = h3.k.d(interfaceC4794dA1, "required_network_type");
            int iD26 = h3.k.d(interfaceC4794dA1, "required_network_request");
            int iD27 = h3.k.d(interfaceC4794dA1, "requires_charging");
            int iD28 = h3.k.d(interfaceC4794dA1, "requires_device_idle");
            int iD29 = h3.k.d(interfaceC4794dA1, "requires_battery_not_low");
            int iD30 = h3.k.d(interfaceC4794dA1, "requires_storage_not_low");
            int iD31 = h3.k.d(interfaceC4794dA1, "trigger_content_update_delay");
            int iD32 = h3.k.d(interfaceC4794dA1, "trigger_max_content_delay");
            int iD33 = h3.k.d(interfaceC4794dA1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                String strK0 = interfaceC4794dA1.K0(iD);
                int i12 = iD14;
                ArrayList arrayList2 = arrayList;
                L.c cVarG = w0.g((int) interfaceC4794dA1.getLong(iD2));
                String strK02 = interfaceC4794dA1.K0(iD3);
                String strK03 = interfaceC4794dA1.K0(iD4);
                byte[] blob = interfaceC4794dA1.getBlob(iD5);
                b.C0319b c0319b = androidx.work.b.f24768b;
                androidx.work.b bVarA = c0319b.a(blob);
                androidx.work.b bVarA2 = c0319b.a(interfaceC4794dA1.getBlob(iD6));
                long j10 = interfaceC4794dA1.getLong(iD7);
                long j11 = interfaceC4794dA1.getLong(iD8);
                long j12 = interfaceC4794dA1.getLong(iD9);
                int i13 = (int) interfaceC4794dA1.getLong(iD10);
                int i14 = iD2;
                int i15 = iD3;
                EnumC0871a enumC0871aD = w0.d((int) interfaceC4794dA1.getLong(iD11));
                long j13 = interfaceC4794dA1.getLong(iD12);
                long j14 = interfaceC4794dA1.getLong(iD13);
                long j15 = interfaceC4794dA1.getLong(i12);
                int i16 = iD15;
                long j16 = interfaceC4794dA1.getLong(i16);
                int i17 = iD;
                int i18 = iD16;
                boolean z10 = ((int) interfaceC4794dA1.getLong(i18)) != 0;
                int i19 = iD17;
                int i20 = iD4;
                I3.D dF = w0.f((int) interfaceC4794dA1.getLong(i19));
                int i21 = iD18;
                int i22 = iD5;
                int i23 = (int) interfaceC4794dA1.getLong(i21);
                int i24 = iD19;
                int i25 = (int) interfaceC4794dA1.getLong(i24);
                int i26 = iD20;
                long j17 = interfaceC4794dA1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) interfaceC4794dA1.getLong(i27);
                int i29 = iD22;
                int i30 = (int) interfaceC4794dA1.getLong(i29);
                int i31 = iD23;
                Boolean boolValueOf = null;
                String strK04 = interfaceC4794dA1.isNull(i31) ? null : interfaceC4794dA1.K0(i31);
                int i32 = iD24;
                if (interfaceC4794dA1.isNull(i32)) {
                    i10 = i28;
                    i11 = i29;
                    numValueOf = null;
                } else {
                    i10 = i28;
                    i11 = i29;
                    numValueOf = Integer.valueOf((int) interfaceC4794dA1.getLong(i32));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i33 = iD25;
                Boolean bool = boolValueOf;
                EnumC0891v enumC0891vE = w0.e((int) interfaceC4794dA1.getLong(i33));
                int i34 = iD26;
                R3.p pVarL = w0.l(interfaceC4794dA1.getBlob(i34));
                iD25 = i33;
                iD26 = i34;
                int i35 = iD27;
                boolean z11 = ((int) interfaceC4794dA1.getLong(i35)) != 0;
                iD27 = i35;
                int i36 = iD28;
                boolean z12 = ((int) interfaceC4794dA1.getLong(i36)) != 0;
                int i37 = iD29;
                boolean z13 = ((int) interfaceC4794dA1.getLong(i37)) != 0;
                iD29 = i37;
                int i38 = iD30;
                int i39 = iD31;
                int i40 = iD32;
                int i41 = iD33;
                iD33 = i41;
                arrayList2.add(new I(strK0, cVarG, strK02, strK03, bVarA, bVarA2, j10, j11, j12, new C0874d(pVarL, enumC0891vE, z11, z12, z13, ((int) interfaceC4794dA1.getLong(i38)) != 0, interfaceC4794dA1.getLong(i39), interfaceC4794dA1.getLong(i40), w0.b(interfaceC4794dA1.getBlob(i41))), i13, enumC0871aD, j13, j14, j15, j16, z10, dF, i23, i25, j17, i10, i30, strK04, bool));
                iD30 = i38;
                iD4 = i20;
                iD17 = i19;
                iD19 = i24;
                iD22 = i11;
                iD24 = i32;
                iD31 = i39;
                iD32 = i40;
                iD2 = i14;
                iD14 = i12;
                iD3 = i15;
                arrayList = arrayList2;
                iD = i17;
                iD15 = i16;
                iD16 = i18;
                iD20 = i26;
                iD21 = i27;
                iD23 = i31;
                iD28 = i36;
                iD5 = i22;
                iD18 = i21;
            }
            ArrayList arrayList3 = arrayList;
            interfaceC4794dA1.close();
            return arrayList3;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final List s0(String str, InterfaceC4792b _connection) {
        int i10;
        int i11;
        Integer numValueOf;
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            int iD = h3.k.d(interfaceC4794dA1, "id");
            int iD2 = h3.k.d(interfaceC4794dA1, SentryThread.JsonKeys.STATE);
            int iD3 = h3.k.d(interfaceC4794dA1, "worker_class_name");
            int iD4 = h3.k.d(interfaceC4794dA1, "input_merger_class_name");
            int iD5 = h3.k.d(interfaceC4794dA1, "input");
            int iD6 = h3.k.d(interfaceC4794dA1, "output");
            int iD7 = h3.k.d(interfaceC4794dA1, "initial_delay");
            int iD8 = h3.k.d(interfaceC4794dA1, "interval_duration");
            int iD9 = h3.k.d(interfaceC4794dA1, "flex_duration");
            int iD10 = h3.k.d(interfaceC4794dA1, "run_attempt_count");
            int iD11 = h3.k.d(interfaceC4794dA1, "backoff_policy");
            int iD12 = h3.k.d(interfaceC4794dA1, "backoff_delay_duration");
            int iD13 = h3.k.d(interfaceC4794dA1, "last_enqueue_time");
            int iD14 = h3.k.d(interfaceC4794dA1, "minimum_retention_duration");
            int iD15 = h3.k.d(interfaceC4794dA1, "schedule_requested_at");
            int iD16 = h3.k.d(interfaceC4794dA1, "run_in_foreground");
            int iD17 = h3.k.d(interfaceC4794dA1, "out_of_quota_policy");
            int iD18 = h3.k.d(interfaceC4794dA1, "period_count");
            int iD19 = h3.k.d(interfaceC4794dA1, "generation");
            int iD20 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override");
            int iD21 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override_generation");
            int iD22 = h3.k.d(interfaceC4794dA1, "stop_reason");
            int iD23 = h3.k.d(interfaceC4794dA1, "trace_tag");
            int iD24 = h3.k.d(interfaceC4794dA1, "backoff_on_system_interruptions");
            int iD25 = h3.k.d(interfaceC4794dA1, "required_network_type");
            int iD26 = h3.k.d(interfaceC4794dA1, "required_network_request");
            int iD27 = h3.k.d(interfaceC4794dA1, "requires_charging");
            int iD28 = h3.k.d(interfaceC4794dA1, "requires_device_idle");
            int iD29 = h3.k.d(interfaceC4794dA1, "requires_battery_not_low");
            int iD30 = h3.k.d(interfaceC4794dA1, "requires_storage_not_low");
            int iD31 = h3.k.d(interfaceC4794dA1, "trigger_content_update_delay");
            int iD32 = h3.k.d(interfaceC4794dA1, "trigger_max_content_delay");
            int iD33 = h3.k.d(interfaceC4794dA1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                String strK0 = interfaceC4794dA1.K0(iD);
                int i12 = iD14;
                ArrayList arrayList2 = arrayList;
                L.c cVarG = w0.g((int) interfaceC4794dA1.getLong(iD2));
                String strK02 = interfaceC4794dA1.K0(iD3);
                String strK03 = interfaceC4794dA1.K0(iD4);
                byte[] blob = interfaceC4794dA1.getBlob(iD5);
                b.C0319b c0319b = androidx.work.b.f24768b;
                androidx.work.b bVarA = c0319b.a(blob);
                androidx.work.b bVarA2 = c0319b.a(interfaceC4794dA1.getBlob(iD6));
                long j10 = interfaceC4794dA1.getLong(iD7);
                long j11 = interfaceC4794dA1.getLong(iD8);
                long j12 = interfaceC4794dA1.getLong(iD9);
                int i13 = (int) interfaceC4794dA1.getLong(iD10);
                int i14 = iD2;
                int i15 = iD3;
                EnumC0871a enumC0871aD = w0.d((int) interfaceC4794dA1.getLong(iD11));
                long j13 = interfaceC4794dA1.getLong(iD12);
                long j14 = interfaceC4794dA1.getLong(iD13);
                long j15 = interfaceC4794dA1.getLong(i12);
                int i16 = iD15;
                long j16 = interfaceC4794dA1.getLong(i16);
                int i17 = iD;
                int i18 = iD16;
                boolean z10 = ((int) interfaceC4794dA1.getLong(i18)) != 0;
                int i19 = iD17;
                int i20 = iD4;
                I3.D dF = w0.f((int) interfaceC4794dA1.getLong(i19));
                int i21 = iD18;
                int i22 = iD5;
                int i23 = (int) interfaceC4794dA1.getLong(i21);
                int i24 = iD19;
                int i25 = (int) interfaceC4794dA1.getLong(i24);
                int i26 = iD20;
                long j17 = interfaceC4794dA1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) interfaceC4794dA1.getLong(i27);
                int i29 = iD22;
                int i30 = (int) interfaceC4794dA1.getLong(i29);
                int i31 = iD23;
                Boolean boolValueOf = null;
                String strK04 = interfaceC4794dA1.isNull(i31) ? null : interfaceC4794dA1.K0(i31);
                int i32 = iD24;
                if (interfaceC4794dA1.isNull(i32)) {
                    i10 = i28;
                    i11 = i29;
                    numValueOf = null;
                } else {
                    i10 = i28;
                    i11 = i29;
                    numValueOf = Integer.valueOf((int) interfaceC4794dA1.getLong(i32));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i33 = iD25;
                Boolean bool = boolValueOf;
                EnumC0891v enumC0891vE = w0.e((int) interfaceC4794dA1.getLong(i33));
                int i34 = iD26;
                R3.p pVarL = w0.l(interfaceC4794dA1.getBlob(i34));
                iD25 = i33;
                iD26 = i34;
                int i35 = iD27;
                boolean z11 = ((int) interfaceC4794dA1.getLong(i35)) != 0;
                iD27 = i35;
                int i36 = iD28;
                boolean z12 = ((int) interfaceC4794dA1.getLong(i36)) != 0;
                int i37 = iD29;
                boolean z13 = ((int) interfaceC4794dA1.getLong(i37)) != 0;
                iD29 = i37;
                int i38 = iD30;
                int i39 = iD31;
                int i40 = iD32;
                int i41 = iD33;
                iD33 = i41;
                arrayList2.add(new I(strK0, cVarG, strK02, strK03, bVarA, bVarA2, j10, j11, j12, new C0874d(pVarL, enumC0891vE, z11, z12, z13, ((int) interfaceC4794dA1.getLong(i38)) != 0, interfaceC4794dA1.getLong(i39), interfaceC4794dA1.getLong(i40), w0.b(interfaceC4794dA1.getBlob(i41))), i13, enumC0871aD, j13, j14, j15, j16, z10, dF, i23, i25, j17, i10, i30, strK04, bool));
                iD30 = i38;
                iD4 = i20;
                iD17 = i19;
                iD19 = i24;
                iD22 = i11;
                iD24 = i32;
                iD31 = i39;
                iD32 = i40;
                iD2 = i14;
                iD14 = i12;
                iD3 = i15;
                arrayList = arrayList2;
                iD = i17;
                iD15 = i16;
                iD16 = i18;
                iD20 = i26;
                iD21 = i27;
                iD23 = i31;
                iD28 = i36;
                iD5 = i22;
                iD18 = i21;
            }
            ArrayList arrayList3 = arrayList;
            interfaceC4794dA1.close();
            return arrayList3;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final L.c t0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            L.c cVarG = null;
            if (interfaceC4794dA1.X0()) {
                Integer numValueOf = interfaceC4794dA1.isNull(0) ? null : Integer.valueOf((int) interfaceC4794dA1.getLong(0));
                if (numValueOf != null) {
                    cVarG = w0.g(numValueOf.intValue());
                }
            }
            return cVarG;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final List u0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                arrayList.add(interfaceC4794dA1.K0(0));
            }
            return arrayList;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final List v0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                arrayList.add(interfaceC4794dA1.K0(0));
            }
            return arrayList;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final I w0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            int iD = h3.k.d(interfaceC4794dA1, "id");
            int iD2 = h3.k.d(interfaceC4794dA1, SentryThread.JsonKeys.STATE);
            int iD3 = h3.k.d(interfaceC4794dA1, "worker_class_name");
            int iD4 = h3.k.d(interfaceC4794dA1, "input_merger_class_name");
            int iD5 = h3.k.d(interfaceC4794dA1, "input");
            int iD6 = h3.k.d(interfaceC4794dA1, "output");
            int iD7 = h3.k.d(interfaceC4794dA1, "initial_delay");
            int iD8 = h3.k.d(interfaceC4794dA1, "interval_duration");
            int iD9 = h3.k.d(interfaceC4794dA1, "flex_duration");
            int iD10 = h3.k.d(interfaceC4794dA1, "run_attempt_count");
            int iD11 = h3.k.d(interfaceC4794dA1, "backoff_policy");
            int iD12 = h3.k.d(interfaceC4794dA1, "backoff_delay_duration");
            int iD13 = h3.k.d(interfaceC4794dA1, "last_enqueue_time");
            int iD14 = h3.k.d(interfaceC4794dA1, "minimum_retention_duration");
            int iD15 = h3.k.d(interfaceC4794dA1, "schedule_requested_at");
            int iD16 = h3.k.d(interfaceC4794dA1, "run_in_foreground");
            int iD17 = h3.k.d(interfaceC4794dA1, "out_of_quota_policy");
            int iD18 = h3.k.d(interfaceC4794dA1, "period_count");
            int iD19 = h3.k.d(interfaceC4794dA1, "generation");
            int iD20 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override");
            int iD21 = h3.k.d(interfaceC4794dA1, "next_schedule_time_override_generation");
            int iD22 = h3.k.d(interfaceC4794dA1, "stop_reason");
            int iD23 = h3.k.d(interfaceC4794dA1, "trace_tag");
            int iD24 = h3.k.d(interfaceC4794dA1, "backoff_on_system_interruptions");
            int iD25 = h3.k.d(interfaceC4794dA1, "required_network_type");
            int iD26 = h3.k.d(interfaceC4794dA1, "required_network_request");
            int iD27 = h3.k.d(interfaceC4794dA1, "requires_charging");
            int iD28 = h3.k.d(interfaceC4794dA1, "requires_device_idle");
            int iD29 = h3.k.d(interfaceC4794dA1, "requires_battery_not_low");
            int iD30 = h3.k.d(interfaceC4794dA1, "requires_storage_not_low");
            int iD31 = h3.k.d(interfaceC4794dA1, "trigger_content_update_delay");
            int iD32 = h3.k.d(interfaceC4794dA1, "trigger_max_content_delay");
            int iD33 = h3.k.d(interfaceC4794dA1, "content_uri_triggers");
            I i10 = null;
            Boolean boolValueOf = null;
            if (interfaceC4794dA1.X0()) {
                String strK0 = interfaceC4794dA1.K0(iD);
                L.c cVarG = w0.g((int) interfaceC4794dA1.getLong(iD2));
                String strK02 = interfaceC4794dA1.K0(iD3);
                String strK03 = interfaceC4794dA1.K0(iD4);
                byte[] blob = interfaceC4794dA1.getBlob(iD5);
                b.C0319b c0319b = androidx.work.b.f24768b;
                androidx.work.b bVarA = c0319b.a(blob);
                androidx.work.b bVarA2 = c0319b.a(interfaceC4794dA1.getBlob(iD6));
                long j10 = interfaceC4794dA1.getLong(iD7);
                long j11 = interfaceC4794dA1.getLong(iD8);
                long j12 = interfaceC4794dA1.getLong(iD9);
                int i11 = (int) interfaceC4794dA1.getLong(iD10);
                EnumC0871a enumC0871aD = w0.d((int) interfaceC4794dA1.getLong(iD11));
                long j13 = interfaceC4794dA1.getLong(iD12);
                long j14 = interfaceC4794dA1.getLong(iD13);
                long j15 = interfaceC4794dA1.getLong(iD14);
                long j16 = interfaceC4794dA1.getLong(iD15);
                boolean z10 = ((int) interfaceC4794dA1.getLong(iD16)) != 0;
                I3.D dF = w0.f((int) interfaceC4794dA1.getLong(iD17));
                int i12 = (int) interfaceC4794dA1.getLong(iD18);
                int i13 = (int) interfaceC4794dA1.getLong(iD19);
                long j17 = interfaceC4794dA1.getLong(iD20);
                int i14 = (int) interfaceC4794dA1.getLong(iD21);
                int i15 = (int) interfaceC4794dA1.getLong(iD22);
                String strK04 = interfaceC4794dA1.isNull(iD23) ? null : interfaceC4794dA1.K0(iD23);
                Integer numValueOf = interfaceC4794dA1.isNull(iD24) ? null : Integer.valueOf((int) interfaceC4794dA1.getLong(iD24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                i10 = new I(strK0, cVarG, strK02, strK03, bVarA, bVarA2, j10, j11, j12, new C0874d(w0.l(interfaceC4794dA1.getBlob(iD26)), w0.e((int) interfaceC4794dA1.getLong(iD25)), ((int) interfaceC4794dA1.getLong(iD27)) != 0, ((int) interfaceC4794dA1.getLong(iD28)) != 0, ((int) interfaceC4794dA1.getLong(iD29)) != 0, ((int) interfaceC4794dA1.getLong(iD30)) != 0, interfaceC4794dA1.getLong(iD31), interfaceC4794dA1.getLong(iD32), w0.b(interfaceC4794dA1.getBlob(iD33))), i11, enumC0871aD, j13, j14, j15, j16, z10, dF, i12, i13, j17, i14, i15, strK04, boolValueOf);
            }
            interfaceC4794dA1.close();
            return i10;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final List x0(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                arrayList.add(new I.b(interfaceC4794dA1.K0(0), w0.g((int) interfaceC4794dA1.getLong(1))));
            }
            return arrayList;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final List y0(String str, String str2, p0 p0Var, InterfaceC4792b _connection) {
        int i10;
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        int i11 = 1;
        try {
            interfaceC4794dA1.N(1, str2);
            C2777a c2777a = new C2777a();
            C2777a c2777a2 = new C2777a();
            while (true) {
                i10 = 0;
                if (!interfaceC4794dA1.X0()) {
                    break;
                }
                String strK0 = interfaceC4794dA1.K0(0);
                if (!c2777a.containsKey(strK0)) {
                    c2777a.put(strK0, new ArrayList());
                }
                String strK02 = interfaceC4794dA1.K0(0);
                if (!c2777a2.containsKey(strK02)) {
                    c2777a2.put(strK02, new ArrayList());
                }
            }
            interfaceC4794dA1.reset();
            p0Var.i0(_connection, c2777a);
            p0Var.g0(_connection, c2777a2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                String strK03 = interfaceC4794dA1.K0(i10);
                L.c cVarG = w0.g((int) interfaceC4794dA1.getLong(i11));
                androidx.work.b bVarA = androidx.work.b.f24768b.a(interfaceC4794dA1.getBlob(2));
                int i12 = (int) interfaceC4794dA1.getLong(3);
                int i13 = (int) interfaceC4794dA1.getLong(4);
                long j10 = interfaceC4794dA1.getLong(14);
                long j11 = interfaceC4794dA1.getLong(15);
                long j12 = interfaceC4794dA1.getLong(16);
                C2777a c2777a3 = c2777a;
                EnumC0871a enumC0871aD = w0.d((int) interfaceC4794dA1.getLong(17));
                long j13 = interfaceC4794dA1.getLong(18);
                long j14 = interfaceC4794dA1.getLong(19);
                int i14 = (int) interfaceC4794dA1.getLong(20);
                long j15 = interfaceC4794dA1.getLong(21);
                int i15 = (int) interfaceC4794dA1.getLong(22);
                C0874d c0874d = new C0874d(w0.l(interfaceC4794dA1.getBlob(6)), w0.e((int) interfaceC4794dA1.getLong(5)), ((int) interfaceC4794dA1.getLong(7)) != 0, ((int) interfaceC4794dA1.getLong(8)) != 0, ((int) interfaceC4794dA1.getLong(9)) != 0, ((int) interfaceC4794dA1.getLong(10)) != 0, interfaceC4794dA1.getLong(11), interfaceC4794dA1.getLong(12), w0.b(interfaceC4794dA1.getBlob(13)));
                Object objJ = gc.Q.j(c2777a3, interfaceC4794dA1.K0(0));
                AbstractC4862t.d(objJ, "getValue(...)");
                Object objJ2 = gc.Q.j(c2777a2, interfaceC4794dA1.K0(0));
                AbstractC4862t.d(objJ2, "getValue(...)");
                arrayList.add(new I.c(strK03, cVarG, bVarA, j10, j11, j12, c0874d, i12, enumC0871aD, j13, j14, i14, i13, j15, i15, (List) objJ, (List) objJ2));
                c2777a = c2777a3;
                i10 = 0;
                i11 = 1;
            }
            interfaceC4794dA1.close();
            return arrayList;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    public static final boolean z0(String str, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            boolean z10 = false;
            if (interfaceC4794dA1.X0()) {
                if (((int) interfaceC4794dA1.getLong(0)) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    @Override // Q3.J
    public int A() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.j0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(p0.k0(str, (InterfaceC4792b) obj));
            }
        })).intValue();
    }

    @Override // Q3.J
    public void B(final String id2, final int i10) {
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.a0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.F0(str, id2, i10, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public void a(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "DELETE FROM workspec WHERE id=?";
        AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.k0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.l0(str, id2, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public int b(final L.c state, final String id2) {
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.Q
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(p0.K0(str, state, id2, (InterfaceC4792b) obj));
            }
        })).intValue();
    }

    @Override // Q3.J
    public void c(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.c0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.A0(str, id2, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public List d(final long j10) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.f0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.q0(str, j10, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public void e(final String id2, final int i10) {
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.i0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.L0(str, i10, id2, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public List f() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.M
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.s0(str, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public List g(final String name) {
        AbstractC4862t.e(name, "name");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.T
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.u0(str, name, (InterfaceC4792b) obj);
            }
        });
    }

    public final void g0(final InterfaceC4792b interfaceC4792b, C2777a c2777a) {
        Set setKeySet = c2777a.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (c2777a.size() > 999) {
            h3.h.a(c2777a, true, new vc.l() { // from class: Q3.V
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return p0.h0(this.f13653a, interfaceC4792b, (C2777a) obj);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        h3.o.a(sb2, setKeySet.size());
        sb2.append(")");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1(string);
        Iterator it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            interfaceC4794dA1.N(i10, (String) it.next());
            i10++;
        }
        try {
            int iC = h3.k.c(interfaceC4794dA1, "work_spec_id");
            if (iC == -1) {
                return;
            }
            while (interfaceC4794dA1.X0()) {
                List list = (List) c2777a.get(interfaceC4794dA1.K0(iC));
                if (list != null) {
                    list.add(androidx.work.b.f24768b.a(interfaceC4794dA1.getBlob(0)));
                }
            }
        } finally {
            interfaceC4794dA1.close();
        }
    }

    @Override // Q3.J
    public L.c h(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (L.c) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.S
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.t0(str, id2, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public I i(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (I) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.K
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.w0(str, id2, (InterfaceC4792b) obj);
            }
        });
    }

    public final void i0(final InterfaceC4792b interfaceC4792b, C2777a c2777a) {
        Set setKeySet = c2777a.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (c2777a.size() > 999) {
            h3.h.a(c2777a, true, new vc.l() { // from class: Q3.X
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return p0.j0(this.f13657a, interfaceC4792b, (C2777a) obj);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        h3.o.a(sb2, setKeySet.size());
        sb2.append(")");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1(string);
        Iterator it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            interfaceC4794dA1.N(i10, (String) it.next());
            i10++;
        }
        try {
            int iC = h3.k.c(interfaceC4794dA1, "work_spec_id");
            if (iC == -1) {
                return;
            }
            while (interfaceC4794dA1.X0()) {
                List list = (List) c2777a.get(interfaceC4794dA1.K0(iC));
                if (list != null) {
                    list.add(interfaceC4794dA1.K0(0));
                }
            }
        } finally {
            interfaceC4794dA1.close();
        }
    }

    @Override // Q3.J
    public int j(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.U
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(p0.H0(str, id2, (InterfaceC4792b) obj));
            }
        })).intValue();
    }

    @Override // Q3.J
    public List k(final String tag) {
        AbstractC4862t.e(tag, "tag");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.e0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.v0(str, tag, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public List l(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.d0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.p0(str, id2, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public List m(final int i10) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.m0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.m0(str, i10, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public int n() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.n0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(p0.E0(str, (InterfaceC4792b) obj));
            }
        })).intValue();
    }

    @Override // Q3.J
    public int o(final String id2, final long j10) {
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.O
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(p0.D0(str, j10, id2, (InterfaceC4792b) obj));
            }
        })).intValue();
    }

    @Override // Q3.J
    public List p(final String name) {
        AbstractC4862t.e(name, "name");
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.o0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.x0(str, name, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public InterfaceC2313e q() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return d3.m.a(this.f13721a, false, new String[]{"workspec"}, new vc.l() { // from class: Q3.l0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(p0.z0(str, (InterfaceC4792b) obj));
            }
        });
    }

    @Override // Q3.J
    public List r(final int i10) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.N
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.n0(str, i10, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public void s(final String id2, final androidx.work.b output) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(output, "output");
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.Y
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.J0(str, output, id2, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public void t(final String id2, final long j10) {
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.Z
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.I0(str, j10, id2, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public List u() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.P
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.r0(str, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public List v() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) AbstractC4270a.c(this.f13721a, true, false, new vc.l() { // from class: Q3.h0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.o0(str, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public void w(final I workSpec) {
        AbstractC4862t.e(workSpec, "workSpec");
        AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.W
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.C0(this.f13655a, workSpec, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public int x(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.b0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(p0.G0(str, id2, (InterfaceC4792b) obj));
            }
        })).intValue();
    }

    @Override // Q3.J
    public List y(final String tag) {
        AbstractC4862t.e(tag, "tag");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) AbstractC4270a.c(this.f13721a, true, true, new vc.l() { // from class: Q3.L
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p0.y0(str, tag, this, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.J
    public int z(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) AbstractC4270a.c(this.f13721a, false, true, new vc.l() { // from class: Q3.g0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(p0.B0(str, id2, (InterfaceC4792b) obj));
            }
        })).intValue();
    }
}
