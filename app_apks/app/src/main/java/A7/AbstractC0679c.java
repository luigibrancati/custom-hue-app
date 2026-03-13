package A7;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: A7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0679c {
    public static AbstractC0679c j(Bundle bundle) {
        return new C0681e(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    public abstract int b();

    public abstract PendingIntent c();

    public abstract int d();

    public abstract int e();

    public abstract long f();

    public abstract List g();

    public abstract List h();

    public abstract List i();
}
