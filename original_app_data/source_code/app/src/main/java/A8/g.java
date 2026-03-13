package A8;

import android.content.Context;
import io.sentry.protocol.SentryStackFrame;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import r8.i;
import u8.C5992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f248g;

    public g(Context context) {
        String str;
        String strD = i.f43833a.e(context).d();
        this.f242a = strD;
        File filesDir = context.getFilesDir();
        this.f243b = filesDir;
        if (x()) {
            str = ".crashlytics.v3" + File.separator + w(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileS = s(new File(filesDir, str));
        this.f244c = fileS;
        this.f245d = s(new File(fileS, "open-sessions"));
        this.f246e = s(new File(fileS, "reports"));
        this.f247f = s(new File(fileS, "priority-reports"));
        this.f248g = s(new File(fileS, "native-reports"));
    }

    public static synchronized File s(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                r8.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                r8.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static File t(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean u(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                u(file2);
            }
        }
        return file.delete();
    }

    public static List v(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public static String w(String str) {
        return str.length() > 40 ? C5992i.A(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public final void b(String str) {
        File file = new File(this.f243b, str);
        if (file.exists() && u(file)) {
            r8.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public final void c(final String str) {
        String[] list;
        if (!this.f243b.exists() || (list = this.f243b.list(new FilenameFilter() { // from class: A8.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (x()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return u(new File(this.f245d, str));
    }

    public List f() {
        return v(this.f245d.list());
    }

    public File g(String str) {
        return new File(this.f244c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return v(this.f244c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f248g, str);
    }

    public List j() {
        return v(this.f248g.listFiles());
    }

    public File k(String str) {
        return t(new File(p(str), SentryStackFrame.JsonKeys.NATIVE));
    }

    public File l(String str) {
        return new File(this.f247f, str);
    }

    public List m() {
        return v(this.f247f.listFiles());
    }

    public File n(String str) {
        return new File(this.f246e, str);
    }

    public List o() {
        return v(this.f246e.listFiles());
    }

    public final File p(String str) {
        return t(new File(this.f245d, str));
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return v(p(str).listFiles(filenameFilter));
    }

    public final boolean x() {
        return !this.f242a.isEmpty();
    }
}
