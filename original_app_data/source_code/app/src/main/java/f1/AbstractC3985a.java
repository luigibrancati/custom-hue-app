package f1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: f1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3985a {
    public static final File a(Context context, String fileName) {
        AbstractC4862t.e(context, "<this>");
        AbstractC4862t.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
