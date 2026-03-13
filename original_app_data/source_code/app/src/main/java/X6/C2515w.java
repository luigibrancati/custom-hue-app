package X6;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3213h7;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.App;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2515w extends C6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f19262f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f19263g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f19264h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f19265i = {App.JsonKeys.APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", MetricsUnit.Duration.DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f19266j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f19267k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f19268l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f19269m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f19270n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f19271o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f19272p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2507v f19273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2475q6 f19274e;

    public C2515w(R6 r62) {
        super(r62);
        this.f19274e = new C2475q6(this.f18400a.e());
        this.f18400a.w();
        this.f19273d = new C2507v(this, this.f18400a.d(), "google_app_measurement.db");
    }

    public static final String T(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    public static final void o0(ContentValues contentValues, String str, Object obj) {
        AbstractC6056k.f("value");
        AbstractC6056k.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final long A() {
        return q0("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean A0(Y6 y62) {
        AbstractC6056k.l(y62);
        h();
        j();
        String str = y62.f18659a;
        String str2 = y62.f18661c;
        if (B0(str, str2) == null) {
            if (a7.r0(str2)) {
                if (p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f18400a.w().F(str, AbstractC2383f2.f18861W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jP0 = p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, y62.f18660b});
                this.f18400a.w();
                if (jP0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", y62.f18660b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(y62.f18662d));
        o0(contentValues, "value", y62.f18663e);
        try {
            if (u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f18400a.a().o().b("Failed to insert/update user property (got -1). appId", C2542z2.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f18400a.a().o().c("Error storing user property. appId", C2542z2.x(y62.f18659a), e10);
            return true;
        }
    }

    public final boolean B() {
        return p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.Y6 B0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            v6.AbstractC6056k.f(r11)
            v6.AbstractC6056k.f(r12)
            r10.h()
            r10.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.u0()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r0 != 0) goto L32
            goto L99
        L32:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r0 = 1
            java.lang.Object r9 = r10.x(r2, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r9 != 0) goto L40
            goto L99
        L40:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            X6.Y6 r3 = new X6.Y6     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            if (r11 == 0) goto L6c
            X6.j3 r11 = r10.f18400a     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            X6.z2 r11 = r11.a()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            X6.x2 r11 = r11.o()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r0 = X6.C2542z2.x(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            r11.b(r12, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            goto L6c
        L66:
            r0 = move-exception
            r10 = r0
            goto L74
        L69:
            r0 = move-exception
        L6a:
            r11 = r0
            goto L7e
        L6c:
            r2.close()
            return r3
        L70:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L6a
        L74:
            r1 = r2
            goto L9f
        L76:
            r0 = move-exception
            r10 = r0
            goto L9f
        L79:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L7e:
            X6.j3 r10 = r10.f18400a     // Catch: java.lang.Throwable -> L66
            X6.z2 r12 = r10.a()     // Catch: java.lang.Throwable -> L66
            X6.x2 r12 = r12.o()     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "Error querying user property. appId"
            java.lang.Object r3 = X6.C2542z2.x(r4)     // Catch: java.lang.Throwable -> L66
            X6.s2 r10 = r10.D()     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = r10.c(r6)     // Catch: java.lang.Throwable -> L66
            r12.d(r0, r3, r10, r11)     // Catch: java.lang.Throwable -> L66
        L99:
            if (r2 == 0) goto L9e
            r2.close()
        L9e:
            return r1
        L9f:
            if (r1 == 0) goto La4
            r1.close()
        La4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.B0(java.lang.String, java.lang.String):X6.Y6");
    }

    public final boolean C(String str, String str2) {
        return p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final List C0(String str) {
        String str2;
        AbstractC6056k.f(str);
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                C2416j3 c2416j3 = this.f18400a;
                c2416j3.w();
                cursorQuery = u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j10 = cursorQuery.getLong(2);
                            Object objX = x(cursorQuery, 3);
                            if (objX == null) {
                                c2416j3.a().o().b("Read invalid user property value, ignoring it. appId", C2542z2.x(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new Y6(str2, str3, string, j10, objX));
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    this.f18400a.a().o().c("Error querying user properties. appId", C2542z2.x(str2), e);
                                    arrayList = Collections.EMPTY_LIST;
                                }
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e12) {
            e = e12;
            str2 = str;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean D() {
        return p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        r0 = r8.a().o();
        r8.w();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List D0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.D0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long E(String str) {
        AbstractC6056k.f(str);
        return q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean E0(C2404i c2404i) {
        AbstractC6056k.l(c2404i);
        h();
        j();
        String str = c2404i.f18977a;
        AbstractC6056k.l(str);
        if (B0(str, c2404i.f18979c.f18640b) == null) {
            long jP0 = p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f18400a.w();
            if (jP0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c2404i.f18978b);
        contentValues.put("name", c2404i.f18979c.f18640b);
        o0(contentValues, "value", AbstractC6056k.l(c2404i.f18979c.d()));
        contentValues.put("active", Boolean.valueOf(c2404i.f18981e));
        contentValues.put("trigger_event_name", c2404i.f18982f);
        contentValues.put("trigger_timeout", Long.valueOf(c2404i.f18984h));
        C2416j3 c2416j3 = this.f18400a;
        contentValues.put("timed_out_event", c2416j3.C().T(c2404i.f18983g));
        contentValues.put("creation_timestamp", Long.valueOf(c2404i.f18980d));
        contentValues.put("triggered_event", c2416j3.C().T(c2404i.f18985i));
        contentValues.put("triggered_timestamp", Long.valueOf(c2404i.f18979c.f18641c));
        contentValues.put("time_to_live", Long.valueOf(c2404i.f18986j));
        contentValues.put("expired_event", c2416j3.C().T(c2404i.f18987k));
        try {
            if (u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            c2416j3.a().o().b("Failed to insert/update conditional user property (got -1)", C2542z2.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f18400a.a().o().c("Error storing conditional user property", C2542z2.x(str), e10);
            return true;
        }
    }

    public final boolean F(String str, Long l10, long j10, com.google.android.gms.internal.measurement.N2 n22) {
        h();
        j();
        AbstractC6056k.l(n22);
        AbstractC6056k.f(str);
        AbstractC6056k.l(l10);
        C2416j3 c2416j3 = this.f18400a;
        byte[] bArrB = n22.b();
        c2416j3.a().w().c("Saving complex main event, appId, data size", c2416j3.D().a(str), Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrB);
        try {
            if (u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            c2416j3.a().o().b("Failed to insert complex main event (got -1). appId", C2542z2.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f18400a.a().o().c("Error storing complex main event. appId", C2542z2.x(str), e10);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.C2404i F0(java.lang.String r26, java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.F0(java.lang.String, java.lang.String):X6.i");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:19:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle G(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.h()
            r5.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.u0()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            if (r2 != 0) goto L2f
            X6.j3 r6 = r5.f18400a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            X6.z2 r6 = r6.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            X6.x2 r6 = r6.w()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L2b:
            r5 = move-exception
            goto L6a
        L2d:
            r6 = move-exception
            goto L70
        L2f:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.internal.measurement.M2 r3 = com.google.android.gms.internal.measurement.N2.N()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.B5 r2 = X6.V6.W(r3, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.M2 r2 = (com.google.android.gms.internal.measurement.M2) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.a5 r2 = r2.w()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.N2 r2 = (com.google.android.gms.internal.measurement.N2) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            X6.R6 r6 = r5.f19261b     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r6.K0()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.util.List r6 = r2.D()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            android.os.Bundle r5 = X6.V6.q(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r1.close()
            return r5
        L55:
            r2 = move-exception
            X6.j3 r3 = r5.f18400a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            X6.z2 r3 = r3.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            X6.x2 r3 = r3.o()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = X6.C2542z2.x(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L6a:
            r0 = r1
            goto L85
        L6c:
            r5 = move-exception
            goto L85
        L6e:
            r6 = move-exception
            r1 = r0
        L70:
            X6.j3 r5 = r5.f18400a     // Catch: java.lang.Throwable -> L2b
            X6.z2 r5 = r5.a()     // Catch: java.lang.Throwable -> L2b
            X6.x2 r5 = r5.o()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "Error selecting default event parameters"
            r5.b(r2, r6)     // Catch: java.lang.Throwable -> L2b
        L7f:
            if (r1 == 0) goto L84
            r1.close()
        L84:
            return r0
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.G(java.lang.String):android.os.Bundle");
    }

    public final int G0(String str, String str2) {
        AbstractC6056k.f(str);
        AbstractC6056k.f(str2);
        h();
        j();
        try {
            return u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C2416j3 c2416j3 = this.f18400a;
            c2416j3.a().o().d("Error deleting conditional property", C2542z2.x(str), c2416j3.D().c(str2), e10);
            return 0;
        }
    }

    public final boolean H(String str, long j10) {
        try {
            if (q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0) {
                return false;
            }
            return q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.f18400a.a().o().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    public final List H0(String str, String str2, String str3) {
        AbstractC6056k.f(str);
        h();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return I0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r25, java.lang.Long r26, java.lang.String r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.I(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r2 = r12.a().o();
        r12.w();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List I0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.I0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.S3 J(java.lang.String r4) {
        /*
            r3 = this;
            v6.AbstractC6056k.l(r4)
            r3.h()
            r3.j()
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r3.u0()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            android.database.Cursor r4 = r2.rawQuery(r0, r4)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            if (r0 != 0) goto L35
            X6.j3 r0 = r3.f18400a     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            X6.z2 r0 = r0.a()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            X6.x2 r0 = r0.w()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r2 = "No data found"
            r0.a(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
        L2d:
            r4.close()
            goto L5d
        L31:
            r3 = move-exception
            goto L44
        L33:
            r0 = move-exception
            goto L4b
        L35:
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            r2 = 1
            int r2 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            X6.S3 r1 = X6.S3.f(r0, r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            goto L2d
        L44:
            r1 = r4
            goto L63
        L46:
            r3 = move-exception
            goto L63
        L48:
            r4 = move-exception
            r0 = r4
            r4 = r1
        L4b:
            X6.j3 r3 = r3.f18400a     // Catch: java.lang.Throwable -> L31
            X6.z2 r3 = r3.a()     // Catch: java.lang.Throwable -> L31
            X6.x2 r3 = r3.o()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Error querying database."
            r3.b(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L5d
            goto L2d
        L5d:
            if (r1 != 0) goto L62
            X6.S3 r3 = X6.S3.f18556c
            return r3
        L62:
            return r1
        L63:
            if (r1 == 0) goto L68
            r1.close()
        L68:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.J(java.lang.String):X6.S3");
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.F2 J0(java.lang.String r52) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.J0(java.lang.String):X6.F2");
    }

    public final boolean K(String str, C2482r6 c2482r6) {
        h();
        j();
        AbstractC6056k.l(c2482r6);
        AbstractC6056k.f(str);
        C2416j3 c2416j3 = this.f18400a;
        long jA = c2416j3.e().a();
        C2375e2 c2375e2 = AbstractC2383f2.f18926w0;
        long jLongValue = jA - ((Long) c2375e2.b(null)).longValue();
        long j10 = c2482r6.f19193b;
        if (j10 < jLongValue || j10 > ((Long) c2375e2.b(null)).longValue() + jA) {
            c2416j3.a().r().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C2542z2.x(str), Long.valueOf(jA), Long.valueOf(j10));
        }
        c2416j3.a().w().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c2482r6.f19192a);
        contentValues.put("source", Integer.valueOf(c2482r6.f19194c));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            c2416j3.a().o().b("Failed to insert trigger URI (got -1). appId", C2542z2.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f18400a.a().o().c("Error storing trigger URI. appId", C2542z2.x(str), e10);
            return false;
        }
    }

    public final void K0(F2 f22, boolean z10, boolean z11) {
        AbstractC6056k.l(f22);
        h();
        j();
        String strO0 = f22.o0();
        AbstractC6056k.l(strO0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strO0);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f19261b.g(strO0).o(R3.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", f22.p0());
        }
        contentValues.put("gmp_app_id", f22.r0());
        R6 r62 = this.f19261b;
        if (r62.g(strO0).o(R3.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", f22.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(f22.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f22.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f22.B0()));
        contentValues.put(App.JsonKeys.APP_VERSION, f22.D0());
        contentValues.put("app_store", f22.H0());
        contentValues.put("gmp_version", Long.valueOf(f22.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(f22.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f22.d()));
        contentValues.put(MetricsUnit.Duration.DAY, Long.valueOf(f22.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(f22.p()));
        contentValues.put("daily_events_count", Long.valueOf(f22.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(f22.t()));
        contentValues.put("config_fetched_time", Long.valueOf(f22.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f22.j()));
        contentValues.put("app_version_int", Long.valueOf(f22.F0()));
        contentValues.put("firebase_instance_id", f22.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(f22.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f22.v()));
        contentValues.put("health_monitor_sample", f22.z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f22.P()));
        contentValues.put("dynamite_version", Long.valueOf(f22.b()));
        if (r62.g(strO0).o(R3.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", f22.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(f22.V()));
        contentValues.put("target_os_version", Long.valueOf(f22.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(f22.Z()));
        C3213h7.a();
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.w().H(strO0, AbstractC2383f2.f18850Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(f22.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(f22.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(f22.d0()));
        contentValues.put("npa_metadata_value", f22.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(f22.G()));
        contentValues.put("sgtm_preview_key", f22.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(f22.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(f22.D()));
        contentValues.put("serialized_npa_metadata", f22.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(f22.M()));
        List listT = f22.T();
        if (listT != null) {
            if (listT.isEmpty()) {
                c2416j3.a().r().b("Safelisted events should not be an empty list. appId", strO0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listT));
            }
        }
        com.google.android.gms.internal.measurement.I6.a();
        if (c2416j3.w().H(null, AbstractC2383f2.f18840L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", f22.f0());
        contentValues.put("unmatched_uwa", f22.h0());
        contentValues.put("ad_campaign_info", f22.K());
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            if (sQLiteDatabaseU0.update("apps", contentValues, "app_id = ?", new String[]{strO0}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                c2416j3.a().o().b("Failed to insert/update app (got -1). appId", C2542z2.x(strO0));
            }
        } catch (SQLiteException e10) {
            this.f18400a.a().o().c("Error storing app. appId", C2542z2.x(strO0), e10);
        }
    }

    public final void L(String str, S3 s32) {
        AbstractC6056k.l(str);
        AbstractC6056k.l(s32);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", s32.l());
        contentValues.put("consent_source", Integer.valueOf(s32.b()));
        N("consent_settings", "app_id", contentValues);
    }

    public final C2483s L0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return M0(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String M(java.lang.String r2, java.lang.String[] r3, java.lang.String r4) {
        /*
            r1 = this;
            android.database.sqlite.SQLiteDatabase r4 = r1.u0()
            r0 = 0
            android.database.Cursor r0 = r4.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r3 == 0) goto L18
            r3 = 0
            java.lang.String r1 = r0.getString(r3)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r0.close()
            return r1
        L18:
            r0.close()
            java.lang.String r1 = ""
            return r1
        L1e:
            r1 = move-exception
            goto L31
        L20:
            r3 = move-exception
            X6.j3 r1 = r1.f18400a     // Catch: java.lang.Throwable -> L1e
            X6.z2 r1 = r1.a()     // Catch: java.lang.Throwable -> L1e
            X6.x2 r1 = r1.o()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "Database error"
            r1.c(r4, r2, r3)     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L31:
            if (r0 == 0) goto L36
            r0.close()
        L36:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.M(java.lang.String, java.lang.String[], java.lang.String):java.lang.String");
    }

    public final C2483s M0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        AbstractC6056k.f(str);
        h();
        j();
        String[] strArr = {str};
        C2483s c2483s = new C2483s();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                cursorQuery = sQLiteDatabaseU0.query("apps", new String[]{MetricsUnit.Duration.DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        c2483s.f19196b = cursorQuery.getLong(1);
                        c2483s.f19195a = cursorQuery.getLong(2);
                        c2483s.f19197c = cursorQuery.getLong(3);
                        c2483s.f19198d = cursorQuery.getLong(4);
                        c2483s.f19199e = cursorQuery.getLong(5);
                        c2483s.f19200f = cursorQuery.getLong(6);
                        c2483s.f19201g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        c2483s.f19196b += j11;
                    }
                    if (z11) {
                        c2483s.f19195a += j11;
                    }
                    if (z12) {
                        c2483s.f19197c += j11;
                    }
                    if (z13) {
                        c2483s.f19198d += j11;
                    }
                    if (z14) {
                        c2483s.f19199e += j11;
                    }
                    if (z15) {
                        c2483s.f19200f += j11;
                    }
                    if (z16) {
                        c2483s.f19201g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MetricsUnit.Duration.DAY, Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(c2483s.f19195a));
                    contentValues.put("daily_events_count", Long.valueOf(c2483s.f19196b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c2483s.f19197c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c2483s.f19198d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c2483s.f19199e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c2483s.f19200f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c2483s.f19201g));
                    sQLiteDatabaseU0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f18400a.a().r().b("Not updating daily counts, app is not known. appId", C2542z2.x(str));
                }
            } catch (SQLiteException e10) {
                this.f18400a.a().o().c("Error updating daily counts. appId", C2542z2.x(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c2483s;
        } finally {
        }
    }

    public final void N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            if (contentValues.getAsString("app_id") == null) {
                this.f18400a.a().q().b("Value of the primary key is not set.", C2542z2.x("app_id"));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id");
            sb2.append(" = ?");
            if (sQLiteDatabaseU0.update("consent_settings", contentValues, sb2.toString(), new String[]{r2}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f18400a.a().o().c("Failed to insert/update table (got -1). key", C2542z2.x("consent_settings"), C2542z2.x("app_id"));
            }
        } catch (SQLiteException e10) {
            this.f18400a.a().o().d("Error storing into table. key", C2542z2.x("consent_settings"), C2542z2.x("app_id"), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.r N0(java.lang.String r11) {
        /*
            r10 = this;
            v6.AbstractC6056k.f(r11)
            r10.h()
            r10.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.u0()     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r3 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r0 != 0) goto L2e
            goto L82
        L2e:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r4 = 2
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r5 == 0) goto L5c
            X6.j3 r5 = r10.f18400a     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            X6.z2 r5 = r5.a()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            X6.x2 r5 = r5.o()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = X6.C2542z2.x(r11)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            goto L5c
        L57:
            r0 = move-exception
            r10 = r0
            goto L68
        L5a:
            r0 = move-exception
            goto L6f
        L5c:
            if (r0 != 0) goto L5f
            goto L82
        L5f:
            X6.r r5 = new X6.r     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r2.close()
            return r5
        L68:
            r1 = r2
            goto L88
        L6a:
            r0 = move-exception
            r10 = r0
            goto L88
        L6d:
            r0 = move-exception
            r2 = r1
        L6f:
            X6.j3 r10 = r10.f18400a     // Catch: java.lang.Throwable -> L57
            X6.z2 r10 = r10.a()     // Catch: java.lang.Throwable -> L57
            X6.x2 r10 = r10.o()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "Error querying remote config. appId"
            java.lang.Object r11 = X6.C2542z2.x(r11)     // Catch: java.lang.Throwable -> L57
            r10.c(r3, r11, r0)     // Catch: java.lang.Throwable -> L57
        L82:
            if (r2 == 0) goto L87
            r2.close()
        L87:
            return r1
        L88:
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.N0(java.lang.String):X6.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.E O(java.lang.String r30, java.lang.String r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.O(java.lang.String, java.lang.String, java.lang.String):X6.E");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O0(com.google.android.gms.internal.measurement.Z2 r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.O0(com.google.android.gms.internal.measurement.Z2, boolean):boolean");
    }

    public final void P(String str, E e10) {
        AbstractC6056k.l(e10);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        String str2 = e10.f18221a;
        contentValues.put("app_id", str2);
        contentValues.put("name", e10.f18222b);
        contentValues.put("lifetime_count", Long.valueOf(e10.f18223c));
        contentValues.put("current_bundle_count", Long.valueOf(e10.f18224d));
        contentValues.put("last_fire_timestamp", Long.valueOf(e10.f18226f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(e10.f18227g));
        contentValues.put("last_bundled_day", e10.f18228h);
        contentValues.put("last_sampled_complex_event_id", e10.f18229i);
        contentValues.put("last_sampling_rate", e10.f18230j);
        contentValues.put("current_session_count", Long.valueOf(e10.f18225e));
        Boolean bool = e10.f18231k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f18400a.a().o().b("Failed to insert/update event aggregates (got -1). appId", C2542z2.x(str2));
            }
        } catch (SQLiteException e11) {
            this.f18400a.a().o().c("Error storing event aggregates. appId", C2542z2.x(e10.f18221a), e11);
        }
    }

    public final void Q(String str, String str2) {
        AbstractC6056k.f(str2);
        h();
        j();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.f18400a.a().o().c("Error deleting snapshot. appId", C2542z2.x(str2), e10);
        }
    }

    public final U6 R(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.f18400a.a().v().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.U2 u22 = (com.google.android.gms.internal.measurement.U2) V6.W(com.google.android.gms.internal.measurement.X2.K(), bArr);
            EnumC2346a5 enumC2346a5A = EnumC2346a5.a(i10);
            if (enumC2346a5A != EnumC2346a5.GOOGLE_SIGNAL && enumC2346a5A != EnumC2346a5.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = u22.z().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.Y2 y22 = (com.google.android.gms.internal.measurement.Y2) ((com.google.android.gms.internal.measurement.Z2) it.next()).q();
                    y22.I0(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.Z2) y22.w());
                }
                u22.F();
                u22.E(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length = strArrSplit.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    String str4 = strArrSplit[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        this.f18400a.a().o().b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i12++;
                }
            }
            T6 t62 = new T6();
            t62.b(j10);
            t62.c((com.google.android.gms.internal.measurement.X2) u22.w());
            t62.d(str2);
            t62.e(map);
            t62.f(enumC2346a5A);
            t62.g(j11);
            t62.h(j12);
            t62.i(j13);
            t62.j(i11);
            return t62.a();
        } catch (IOException e10) {
            this.f18400a.a().o().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    public final String S() {
        C2416j3 c2416j3 = this.f18400a;
        long jA = c2416j3.e().a();
        Locale locale = Locale.US;
        EnumC2346a5 enumC2346a5 = EnumC2346a5.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(enumC2346a5.zza());
        Long lValueOf = Long.valueOf(jA);
        c2416j3.w();
        Long l10 = (Long) AbstractC2383f2.f18855T.b(null);
        l10.longValue();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l10);
        Integer numValueOf2 = Integer.valueOf(enumC2346a5.zza());
        c2416j3.w();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf2, lValueOf, Long.valueOf(C2436m.q()));
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb2.append("(");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    public final A U(String str) {
        AbstractC6056k.l(str);
        h();
        j();
        return A.g(M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void V(String str, A a10) {
        AbstractC6056k.l(str);
        AbstractC6056k.l(a10);
        h();
        j();
        S3 s3J = J(str);
        S3 s32 = S3.f18556c;
        if (s3J == s32) {
            L(str, s32);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", a10.e());
        N("consent_settings", "app_id", contentValues);
    }

    public final void W(String str, S3 s32) {
        AbstractC6056k.l(str);
        AbstractC6056k.l(s32);
        h();
        j();
        L(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", s32.l());
        N("consent_settings", "app_id", contentValues);
    }

    public final S3 X(String str) {
        AbstractC6056k.l(str);
        h();
        j();
        return S3.f(M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x032f, code lost:
    
        if (r7.J() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0331, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.K());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x033a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x033b, code lost:
    
        r12.put("session_scoped", r0);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034d, code lost:
    
        if (u0().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x034f, code lost:
    
        r22.f18400a.a().o().b("Failed to insert property filter (got -1). appId", X6.C2542z2.x(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x036b, code lost:
    
        r22.f18400a.a().o().c("Error storing property filter. appId", X6.C2542z2.x(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x037e, code lost:
    
        j();
        h();
        v6.AbstractC6056k.f(r23);
        r0 = u0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0494, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0497, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0176, code lost:
    
        r11 = r0.F().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.G1) r11.next()).D() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        r22.f18400a.a().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", X6.C2542z2.x(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:
    
        r11 = r0.I().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.C3355y1) r11.next();
        j();
        h();
        v6.AbstractC6056k.f(r23);
        v6.AbstractC6056k.l(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01df, code lost:
    
        if (r12.F().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e1, code lost:
    
        r0 = r22.f18400a.a().r();
        r11 = X6.C2542z2.x(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f9, code lost:
    
        if (r12.D() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0213, code lost:
    
        r3 = r12.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022c, code lost:
    
        if (r12.D() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024b, code lost:
    
        if (r12.N() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.O());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0269, code lost:
    
        if (u0().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026b, code lost:
    
        r22.f18400a.a().o().b("Failed to insert event filter (got -1). appId", X6.C2542z2.x(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0286, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0287, code lost:
    
        r22.f18400a.a().o().c("Error storing event filter. appId", X6.C2542z2.x(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.F().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.G1) r3.next();
        j();
        h();
        v6.AbstractC6056k.f(r23);
        v6.AbstractC6056k.l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c6, code lost:
    
        if (r7.F().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c8, code lost:
    
        r0 = r22.f18400a.a().r();
        r9 = X6.C2542z2.x(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e0, code lost:
    
        if (r7.D() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ef, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f8, code lost:
    
        r11 = r7.b();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0311, code lost:
    
        if (r7.D() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.E());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.Y(java.lang.String, java.util.List):void");
    }

    public final E Z(String str, com.google.android.gms.internal.measurement.N2 n22, String str2) throws Throwable {
        E eO = O("events", str, n22.G());
        if (eO == null) {
            C2416j3 c2416j3 = this.f18400a;
            c2416j3.a().r().c("Event aggregate wasn't created during raw event logging. appId, event", C2542z2.x(str), c2416j3.D().a(str2));
            return new E(str, n22.G(), 1L, 1L, 1L, n22.I(), 0L, null, null, null, null);
        }
        long j10 = eO.f18225e + 1;
        long j11 = eO.f18224d + 1;
        return new E(eO.f18221a, eO.f18222b, eO.f18223c + 1, j11, j10, eO.f18226f, eO.f18227g, eO.f18228h, eO.f18229i, eO.f18230j, eO.f18231k);
    }

    public final boolean a0() {
        C2416j3 c2416j3 = this.f18400a;
        Context contextD = c2416j3.d();
        c2416j3.w();
        return contextD.getDatabasePath("google_app_measurement.db").exists();
    }

    public final /* synthetic */ long b0(String str, String[] strArr, long j10) {
        return q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // X6.C6
    public final boolean l() {
        return false;
    }

    public final long m(String str, com.google.android.gms.internal.measurement.X2 x22, String str2, Map map, EnumC2346a5 enumC2346a5, Long l10) {
        int iDelete;
        h();
        j();
        AbstractC6056k.l(x22);
        AbstractC6056k.f(str);
        h();
        j();
        if (a0()) {
            R6 r62 = this.f19261b;
            long jA = r62.L0().f18634f.a();
            C2416j3 c2416j3 = this.f18400a;
            long jC = c2416j3.e().c();
            long jAbs = Math.abs(jC - jA);
            c2416j3.w();
            if (jAbs > C2436m.r()) {
                r62.L0().f18634f.b(jC);
                h();
                j();
                if (a0() && (iDelete = u0().delete("upload_queue", S(), new String[0])) > 0) {
                    c2416j3.a().w().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                AbstractC6056k.f(str);
                h();
                j();
                try {
                    int iE = c2416j3.w().E(str, AbstractC2383f2.f18817A);
                    if (iE > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iE)});
                    }
                } catch (SQLiteException e10) {
                    this.f18400a.a().o().c("Error deleting over the limit queued batches. appId", C2542z2.x(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrB = x22.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrB);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(enumC2346a5.zza()));
        C2416j3 c2416j32 = this.f18400a;
        contentValues.put("creation_timestamp", Long.valueOf(c2416j32.e().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = u0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            c2416j32.a().o().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.f18400a.a().o().c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    public final /* synthetic */ C2475q6 m0() {
        return this.f19274e;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0085: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:134), block:B:14:0x0085 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.U6 n(long r19) {
        /*
            r18 = this;
            r18.h()
            r18.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.u0()     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String r13 = "last_upload_timestamp"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8a android.database.sqlite.SQLiteException -> L8c
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            if (r0 != 0) goto L3f
            goto La2
        L3f:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            java.lang.Object r0 = v6.AbstractC6056k.l(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 9
            long r16 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r3 = r18
            r5 = r19
            X6.U6 r0 = r3.R(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r2.close()
            return r0
        L81:
            r0 = move-exception
            goto L85
        L83:
            r0 = move-exception
            goto L87
        L85:
            r1 = r2
            goto La8
        L87:
            r3 = r18
            goto L8f
        L8a:
            r0 = move-exception
            goto La8
        L8c:
            r0 = move-exception
            r2 = r1
            goto L87
        L8f:
            X6.j3 r3 = r3.f18400a     // Catch: java.lang.Throwable -> L81
            X6.z2 r3 = r3.a()     // Catch: java.lang.Throwable -> L81
            X6.x2 r3 = r3.o()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r5 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> L81
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L81
        La2:
            if (r2 == 0) goto La7
            r2.close()
        La7:
            return r1
        La8:
            if (r1 == 0) goto Lad
            r1.close()
        Lad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.n(long):X6.U6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0(java.lang.String r20, long r21, long r23, X6.N6 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.n0(java.lang.String, long, long, X6.N6):void");
    }

    public final List o(String str, C2538y6 c2538y6, int i10) {
        List arrayList;
        AbstractC6056k.f(str);
        h();
        j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
                String strT = T(c2538y6.f19324a);
                String strS = S();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 17 + strS.length());
                sb2.append("app_id=?");
                sb2.append(strT);
                sb2.append(" AND NOT ");
                sb2.append(strS);
                cursorQuery = sQLiteDatabaseU0.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
                arrayList = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    U6 u6R = R(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    if (u6R != null) {
                        arrayList.add(u6R);
                    }
                }
            } catch (SQLiteException e10) {
                this.f18400a.a().o().c("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final boolean p(String str) {
        EnumC2346a5[] enumC2346a5Arr = {EnumC2346a5.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC2346a5Arr[0].zza()));
        String strT = T(arrayList);
        String strS = S();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 61 + strS.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strT);
        sb2.append(" AND NOT ");
        sb2.append(strS);
        return p0(sb2.toString(), new String[]{str}) != 0;
    }

    public final long p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f18400a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void q(Long l10) {
        h();
        j();
        AbstractC6056k.l(l10);
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                this.f18400a.a().r().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f18400a.a().o().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    public final long q0(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f18400a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r() throws java.lang.Throwable {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.u0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L34
            r2 = 0
            java.lang.String r4 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r4
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L25
        L1e:
            r1 = r0
            goto L3a
        L20:
            r4 = move-exception
            goto L3a
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            X6.j3 r4 = r4.f18400a     // Catch: java.lang.Throwable -> L1a
            X6.z2 r4 = r4.a()     // Catch: java.lang.Throwable -> L1a
            X6.x2 r4 = r4.o()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Database error getting next bundle app id"
            r4.b(r3, r2)     // Catch: java.lang.Throwable -> L1a
        L34:
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r1 == 0) goto L3f
            r1.close()
        L3f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.r():java.lang.String");
    }

    public final void r0() {
        j();
        u0().beginTransaction();
    }

    public final boolean s() {
        return p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void s0() {
        j();
        u0().setTransactionSuccessful();
    }

    public final void t(long j10) {
        h();
        j();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f18400a.a().o().b("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    public final void t0() {
        j();
        u0().endTransaction();
    }

    public final void u() {
        h();
        j();
        if (a0()) {
            R6 r62 = this.f19261b;
            long jA = r62.L0().f18633e.a();
            C2416j3 c2416j3 = this.f18400a;
            long jC = c2416j3.e().c();
            long jAbs = Math.abs(jC - jA);
            c2416j3.w();
            if (jAbs > C2436m.r()) {
                r62.L0().f18633e.b(jC);
                h();
                j();
                if (a0()) {
                    SQLiteDatabase sQLiteDatabaseU0 = u0();
                    String strValueOf = String.valueOf(c2416j3.e().a());
                    c2416j3.w();
                    int iDelete = sQLiteDatabaseU0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(C2436m.q())});
                    if (iDelete > 0) {
                        c2416j3.a().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final SQLiteDatabase u0() {
        h();
        try {
            return this.f19273d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f18400a.a().r().b("Error opening database", e10);
            throw e10;
        }
    }

    public final void v(List list) {
        h();
        j();
        AbstractC6056k.l(list);
        AbstractC6056k.n(list.size());
        if (a0()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb2.append("(");
            sb2.append(strJoin);
            sb2.append(")");
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(string);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb3.toString(), null) > 0) {
                this.f18400a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                StringBuilder sb4 = new StringBuilder(string.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(string);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f18400a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final E v0(String str, String str2) {
        return O("events", str, str2);
    }

    public final void w(Long l10) {
        h();
        j();
        AbstractC6056k.l(l10);
        if (a0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb2.toString(), null) > 0) {
                this.f18400a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                long jA = this.f18400a.e().a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jA).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jA);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f18400a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void w0(E e10) {
        P("events", e10);
    }

    public final Object x(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f18400a.a().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f18400a.a().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f18400a.a().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void x0(String str) {
        E eO;
        Q("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (eO = O("events", str, string)) != null) {
                            P("events_snapshot", eO);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f18400a.a().o().c("Error creating snapshot. appId", C2542z2.x(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    public final long y() {
        return q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.y0(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0 A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long z(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2515w.z(java.lang.String, java.lang.String):long");
    }

    public final void z0(String str, String str2) {
        AbstractC6056k.f(str);
        AbstractC6056k.f(str2);
        h();
        j();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C2416j3 c2416j3 = this.f18400a;
            c2416j3.a().o().d("Error deleting user property. appId", C2542z2.x(str), c2416j3.D().c(str2), e10);
        }
    }
}
