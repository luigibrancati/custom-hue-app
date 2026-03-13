package androidx.work.impl;

import J3.K;
import J3.L;
import J3.M;
import J3.N;
import J3.O;
import J3.P;
import J3.Q;
import J3.S;
import J3.T;
import Q3.B;
import Q3.C1862g;
import Q3.C1867l;
import Q3.C1869n;
import Q3.C1875u;
import Q3.D;
import Q3.G;
import Q3.InterfaceC1857b;
import Q3.InterfaceC1864i;
import Q3.InterfaceC1868m;
import Q3.InterfaceC1871p;
import Q3.InterfaceC1879y;
import Q3.J;
import Q3.p0;
import Q3.s0;
import Q3.v0;
import androidx.work.impl.WorkDatabase_Impl;
import b3.x;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4205s;
import h3.AbstractC4270a;
import h3.p;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.AbstractC4791a;
import k3.InterfaceC4792b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.webrtc.WebrtcBuildVersion;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020&0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020)0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010.¨\u0006?"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "Lb3/x;", "p0", "()Lb3/x;", "Landroidx/room/a;", "m", "()Landroidx/room/a;", "", "LCc/d;", "", "z", "()Ljava/util/Map;", "", "Lf3/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lf3/b;", "j", "(Ljava/util/Map;)Ljava/util/List;", "LQ3/J;", "W", "()LQ3/J;", "LQ3/b;", "R", "()LQ3/b;", "LQ3/s0;", "X", "()LQ3/s0;", "LQ3/p;", "T", "()LQ3/p;", "LQ3/y;", "U", "()LQ3/y;", "LQ3/D;", "V", "()LQ3/D;", "LQ3/i;", "S", "()LQ3/i;", "Lfc/k;", "o", "Lfc/k;", "_workSpecDao", "p", "_dependencyDao", "q", "_workTagDao", "r", "_systemIdInfoDao", "s", "_workNameDao", "t", "_workProgressDao", "u", "_preferenceDao", "LQ3/m;", "v", "_rawWorkInfoDao", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k _workSpecDao = C4029l.b(new InterfaceC6082a() { // from class: J3.U
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WorkDatabase_Impl.m0(this.f5975a);
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k _dependencyDao = C4029l.b(new InterfaceC6082a() { // from class: J3.V
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WorkDatabase_Impl.g0(this.f5976a);
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k _workTagDao = C4029l.b(new InterfaceC6082a() { // from class: J3.W
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WorkDatabase_Impl.n0(this.f5977a);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k _systemIdInfoDao = C4029l.b(new InterfaceC6082a() { // from class: J3.X
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WorkDatabase_Impl.j0(this.f5978a);
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k _workNameDao = C4029l.b(new InterfaceC6082a() { // from class: J3.Y
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WorkDatabase_Impl.k0(this.f5979a);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k _workProgressDao = C4029l.b(new InterfaceC6082a() { // from class: J3.Z
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WorkDatabase_Impl.l0(this.f5980a);
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k _preferenceDao = C4029l.b(new InterfaceC6082a() { // from class: J3.a0
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WorkDatabase_Impl.h0(this.f5981a);
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4028k _rawWorkInfoDao = C4029l.b(new InterfaceC6082a() { // from class: J3.b0
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WorkDatabase_Impl.i0(this.f5982a);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends x {
        public a() {
            super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        }

        @Override // b3.x
        public void a(InterfaceC4792b connection) throws Exception {
            AbstractC4862t.e(connection, "connection");
            AbstractC4791a.a(connection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            AbstractC4791a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            AbstractC4791a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            AbstractC4791a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            AbstractC4791a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            AbstractC4791a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            AbstractC4791a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            AbstractC4791a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            AbstractC4791a.a(connection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            AbstractC4791a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            AbstractC4791a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            AbstractC4791a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            AbstractC4791a.a(connection, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            AbstractC4791a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            AbstractC4791a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
        }

        @Override // b3.x
        public void b(InterfaceC4792b connection) throws Exception {
            AbstractC4862t.e(connection, "connection");
            AbstractC4791a.a(connection, "DROP TABLE IF EXISTS `Dependency`");
            AbstractC4791a.a(connection, "DROP TABLE IF EXISTS `WorkSpec`");
            AbstractC4791a.a(connection, "DROP TABLE IF EXISTS `WorkTag`");
            AbstractC4791a.a(connection, "DROP TABLE IF EXISTS `SystemIdInfo`");
            AbstractC4791a.a(connection, "DROP TABLE IF EXISTS `WorkName`");
            AbstractC4791a.a(connection, "DROP TABLE IF EXISTS `WorkProgress`");
            AbstractC4791a.a(connection, "DROP TABLE IF EXISTS `Preference`");
        }

        @Override // b3.x
        public void f(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
        }

        @Override // b3.x
        public void g(InterfaceC4792b connection) throws Exception {
            AbstractC4862t.e(connection, "connection");
            AbstractC4791a.a(connection, "PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.J(connection);
        }

        @Override // b3.x
        public void h(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
        }

        @Override // b3.x
        public void i(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            AbstractC4270a.a(connection);
        }

        @Override // b3.x
        public x.a j(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap.put("prerequisite_id", new p.a("prerequisite_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new p.c("WorkSpec", "CASCADE", "CASCADE", C4205s.d("work_spec_id"), C4205s.d("id")));
            linkedHashSet.add(new p.c("WorkSpec", "CASCADE", "CASCADE", C4205s.d("prerequisite_id"), C4205s.d("id")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new p.d("index_Dependency_work_spec_id", false, C4205s.d("work_spec_id"), C4205s.d("ASC")));
            linkedHashSet2.add(new p.d("index_Dependency_prerequisite_id", false, C4205s.d("prerequisite_id"), C4205s.d("ASC")));
            p pVar = new p("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
            p.b bVar = p.f36223e;
            p pVarA = bVar.a(connection, "Dependency");
            if (!pVar.equals(pVarA)) {
                return new x.a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + pVar + "\n Found:\n" + pVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new p.a("id", "TEXT", true, 1, null, 1));
            linkedHashMap2.put(SentryThread.JsonKeys.STATE, new p.a(SentryThread.JsonKeys.STATE, "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("worker_class_name", new p.a("worker_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input_merger_class_name", new p.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input", new p.a("input", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("output", new p.a("output", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("initial_delay", new p.a("initial_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("interval_duration", new p.a("interval_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("flex_duration", new p.a("flex_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_attempt_count", new p.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_policy", new p.a("backoff_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_delay_duration", new p.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("last_enqueue_time", new p.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            linkedHashMap2.put("minimum_retention_duration", new p.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("schedule_requested_at", new p.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_in_foreground", new p.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("out_of_quota_policy", new p.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("period_count", new p.a("period_count", "INTEGER", true, 0, WebrtcBuildVersion.maint_version, 1));
            linkedHashMap2.put("generation", new p.a("generation", "INTEGER", true, 0, WebrtcBuildVersion.maint_version, 1));
            linkedHashMap2.put("next_schedule_time_override", new p.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            linkedHashMap2.put("next_schedule_time_override_generation", new p.a("next_schedule_time_override_generation", "INTEGER", true, 0, WebrtcBuildVersion.maint_version, 1));
            linkedHashMap2.put("stop_reason", new p.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            linkedHashMap2.put("trace_tag", new p.a("trace_tag", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("backoff_on_system_interruptions", new p.a("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("required_network_type", new p.a("required_network_type", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("required_network_request", new p.a("required_network_request", "BLOB", true, 0, "x''", 1));
            linkedHashMap2.put("requires_charging", new p.a("requires_charging", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_device_idle", new p.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_battery_not_low", new p.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_storage_not_low", new p.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_content_update_delay", new p.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_max_content_delay", new p.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("content_uri_triggers", new p.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new p.d("index_WorkSpec_schedule_requested_at", false, C4205s.d("schedule_requested_at"), C4205s.d("ASC")));
            linkedHashSet4.add(new p.d("index_WorkSpec_last_enqueue_time", false, C4205s.d("last_enqueue_time"), C4205s.d("ASC")));
            p pVar2 = new p("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            p pVarA2 = bVar.a(connection, "WorkSpec");
            if (!pVar2.equals(pVarA2)) {
                return new x.a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + pVar2 + "\n Found:\n" + pVarA2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("tag", new p.a("tag", "TEXT", true, 1, null, 1));
            linkedHashMap3.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            linkedHashSet5.add(new p.c("WorkSpec", "CASCADE", "CASCADE", C4205s.d("work_spec_id"), C4205s.d("id")));
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            linkedHashSet6.add(new p.d("index_WorkTag_work_spec_id", false, C4205s.d("work_spec_id"), C4205s.d("ASC")));
            p pVar3 = new p("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
            p pVarA3 = bVar.a(connection, "WorkTag");
            if (!pVar3.equals(pVarA3)) {
                return new x.a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + pVar3 + "\n Found:\n" + pVarA3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap4.put("generation", new p.a("generation", "INTEGER", true, 2, WebrtcBuildVersion.maint_version, 1));
            linkedHashMap4.put("system_id", new p.a("system_id", "INTEGER", true, 0, null, 1));
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            linkedHashSet7.add(new p.c("WorkSpec", "CASCADE", "CASCADE", C4205s.d("work_spec_id"), C4205s.d("id")));
            p pVar4 = new p("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
            p pVarA4 = bVar.a(connection, "SystemIdInfo");
            if (!pVar4.equals(pVarA4)) {
                return new x.a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + pVar4 + "\n Found:\n" + pVarA4);
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.put("name", new p.a("name", "TEXT", true, 1, null, 1));
            linkedHashMap5.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            linkedHashSet8.add(new p.c("WorkSpec", "CASCADE", "CASCADE", C4205s.d("work_spec_id"), C4205s.d("id")));
            LinkedHashSet linkedHashSet9 = new LinkedHashSet();
            linkedHashSet9.add(new p.d("index_WorkName_work_spec_id", false, C4205s.d("work_spec_id"), C4205s.d("ASC")));
            p pVar5 = new p("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
            p pVarA5 = bVar.a(connection, "WorkName");
            if (!pVar5.equals(pVarA5)) {
                return new x.a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + pVar5 + "\n Found:\n" + pVarA5);
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            linkedHashMap6.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap6.put("progress", new p.a("progress", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet10 = new LinkedHashSet();
            linkedHashSet10.add(new p.c("WorkSpec", "CASCADE", "CASCADE", C4205s.d("work_spec_id"), C4205s.d("id")));
            p pVar6 = new p("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
            p pVarA6 = bVar.a(connection, "WorkProgress");
            if (!pVar6.equals(pVarA6)) {
                return new x.a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + pVar6 + "\n Found:\n" + pVarA6);
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            linkedHashMap7.put("key", new p.a("key", "TEXT", true, 1, null, 1));
            linkedHashMap7.put("long_value", new p.a("long_value", "INTEGER", false, 0, null, 1));
            p pVar7 = new p("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
            p pVarA7 = bVar.a(connection, "Preference");
            if (pVar7.equals(pVarA7)) {
                return new x.a(true, null);
            }
            return new x.a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + pVar7 + "\n Found:\n" + pVarA7);
        }
    }

    public static final C1862g g0(WorkDatabase_Impl workDatabase_Impl) {
        return new C1862g(workDatabase_Impl);
    }

    public static final C1867l h0(WorkDatabase_Impl workDatabase_Impl) {
        return new C1867l(workDatabase_Impl);
    }

    public static final C1869n i0(WorkDatabase_Impl workDatabase_Impl) {
        return new C1869n(workDatabase_Impl);
    }

    public static final C1875u j0(WorkDatabase_Impl workDatabase_Impl) {
        return new C1875u(workDatabase_Impl);
    }

    public static final B k0(WorkDatabase_Impl workDatabase_Impl) {
        return new B(workDatabase_Impl);
    }

    public static final G l0(WorkDatabase_Impl workDatabase_Impl) {
        return new G(workDatabase_Impl);
    }

    public static final p0 m0(WorkDatabase_Impl workDatabase_Impl) {
        return new p0(workDatabase_Impl);
    }

    public static final v0 n0(WorkDatabase_Impl workDatabase_Impl) {
        return new v0(workDatabase_Impl);
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC1857b R() {
        return (InterfaceC1857b) this._dependencyDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC1864i S() {
        return (InterfaceC1864i) this._preferenceDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC1871p T() {
        return (InterfaceC1871p) this._systemIdInfoDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC1879y U() {
        return (InterfaceC1879y) this._workNameDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public D V() {
        return (D) this._workProgressDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public J W() {
        return (J) this._workSpecDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public s0 X() {
        return (s0) this._workTagDao.getValue();
    }

    @Override // b3.t
    public List j(Map autoMigrationSpecs) {
        AbstractC4862t.e(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new K());
        arrayList.add(new L());
        arrayList.add(new M());
        arrayList.add(new N());
        arrayList.add(new O());
        arrayList.add(new P());
        arrayList.add(new Q());
        arrayList.add(new S());
        arrayList.add(new T());
        return arrayList;
    }

    @Override // b3.t
    public androidx.room.a m() {
        return new androidx.room.a(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // b3.t
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public x n() {
        return new a();
    }

    @Override // b3.t
    public Set x() {
        return new LinkedHashSet();
    }

    @Override // b3.t
    public Map z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.M.b(J.class), p0.f13720d.a());
        linkedHashMap.put(kotlin.jvm.internal.M.b(InterfaceC1857b.class), C1862g.f13688c.a());
        linkedHashMap.put(kotlin.jvm.internal.M.b(s0.class), v0.f13741c.a());
        linkedHashMap.put(kotlin.jvm.internal.M.b(InterfaceC1871p.class), C1875u.f13736c.a());
        linkedHashMap.put(kotlin.jvm.internal.M.b(InterfaceC1879y.class), B.f13576c.a());
        linkedHashMap.put(kotlin.jvm.internal.M.b(D.class), G.f13582c.a());
        linkedHashMap.put(kotlin.jvm.internal.M.b(InterfaceC1864i.class), C1867l.f13706c.a());
        linkedHashMap.put(kotlin.jvm.internal.M.b(InterfaceC1868m.class), C1869n.f13712b.a());
        return linkedHashMap;
    }
}
