package X6;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2499u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2515w f19236c;

    public C2499u(C2515w c2515w, String str) {
        Objects.requireNonNull(c2515w);
        this.f19236c = c2515w;
        AbstractC6056k.f(str);
        this.f19234a = str;
        this.f19235b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f19236c.u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f19234a, String.valueOf(this.f19235b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.f19235b) {
                            this.f19235b = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.M2 m22 = (com.google.android.gms.internal.measurement.M2) V6.W(com.google.android.gms.internal.measurement.N2.N(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            m22.K(string);
                            m22.N(cursorQuery.getLong(2));
                            arrayList.add(new C2491t(j10, j11, z10, (com.google.android.gms.internal.measurement.N2) m22.w()));
                        } catch (IOException e10) {
                            this.f19236c.f18400a.a().o().c("Data loss. Failed to merge raw event. appId", C2542z2.x(this.f19234a), e10);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.f19236c.f18400a.a().o().c("Data loss. Error querying raw events batch. appId", C2542z2.x(this.f19234a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public C2499u(C2515w c2515w, String str, long j10) {
        Objects.requireNonNull(c2515w);
        this.f19236c = c2515w;
        AbstractC6056k.f(str);
        this.f19234a = str;
        this.f19235b = c2515w.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
