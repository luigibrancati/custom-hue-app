package J3;

import I3.AbstractC0890u;
import android.content.Context;
import fc.AbstractC4040w;
import fc.C4034q;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f5970a = new I();

    public static final void c(Context context) {
        AbstractC4862t.e(context, "context");
        I i10 = f5970a;
        if (i10.b(context).exists()) {
            AbstractC0890u.e().a(J.f5971a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : i10.d(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        AbstractC0890u.e().k(J.f5971a, "Over-writing contents of " + file2);
                    }
                    AbstractC0890u.e().a(J.f5971a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public final File a(Context context) {
        AbstractC4862t.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC4862t.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
        return noBackupFilesDir;
    }

    public final File b(Context context) {
        AbstractC4862t.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        AbstractC4862t.d(databasePath, "getDatabasePath(...)");
        return databasePath;
    }

    public final Map d(Context context) {
        AbstractC4862t.e(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = J.f5972b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(gc.P.e(strArr.length), 16));
        for (String str : strArr) {
            C4034q c4034qA = AbstractC4040w.a(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(c4034qA.e(), c4034qA.f());
        }
        return gc.Q.o(linkedHashMap, AbstractC4040w.a(fileB, fileA));
    }
}
