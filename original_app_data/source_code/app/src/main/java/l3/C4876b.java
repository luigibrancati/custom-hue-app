package l3;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: l3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4876b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4876b f39839a = new C4876b();

    public static final File a(Context context) {
        AbstractC4862t.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC4862t.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
        return noBackupFilesDir;
    }
}
