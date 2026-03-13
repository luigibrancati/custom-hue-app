package N4;

import Od.B;
import fc.C4015H;
import fc.C4022e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A4.a f9609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Properties f9610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f9612d;

    public c(File directory, String fileNameWithoutExtension, A4.a aVar) {
        AbstractC4862t.e(directory, "directory");
        AbstractC4862t.e(fileNameWithoutExtension, "fileNameWithoutExtension");
        this.f9609a = aVar;
        this.f9610b = new Properties();
        String str = fileNameWithoutExtension + ".properties";
        this.f9611c = str;
        this.f9612d = new File(directory, str);
    }

    @Override // N4.b
    public void a(String key) {
        AbstractC4862t.e(key, "key");
        this.f9610b.remove(key);
        g();
    }

    public final void b() throws IOException {
        this.f9612d.getParentFile().mkdirs();
        this.f9612d.createNewFile();
    }

    public final String c(String key, String str) {
        AbstractC4862t.e(key, "key");
        return this.f9610b.getProperty(key, str);
    }

    public final void d() throws IOException {
        if (this.f9612d.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f9612d);
                try {
                    this.f9610b.load(fileInputStream);
                    C4015H c4015h = C4015H.f34254a;
                    sc.c.a(fileInputStream, null);
                    return;
                } finally {
                }
            } catch (Throwable th) {
                this.f9612d.delete();
                A4.a aVar = this.f9609a;
                if (aVar != null) {
                    aVar.d("Failed to load property file with path " + this.f9612d.getAbsolutePath() + ", error stacktrace: " + C4022e.b(th));
                }
            }
        }
        b();
    }

    public final boolean e(String key, String value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        this.f9610b.setProperty(key, value);
        g();
        return true;
    }

    public final boolean f(List keys) {
        AbstractC4862t.e(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            this.f9610b.remove((String) it.next());
        }
        g();
        return true;
    }

    public final void g() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f9612d);
            try {
                this.f9610b.store(fileOutputStream, (String) null);
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            A4.a aVar = this.f9609a;
            if (aVar != null) {
                aVar.d("Failed to save property file with path " + this.f9612d.getAbsolutePath() + ", error stacktrace: " + C4022e.b(th));
            }
        }
    }

    @Override // N4.b
    public long getLong(String key, long j10) {
        AbstractC4862t.e(key, "key");
        String property = this.f9610b.getProperty(key, "");
        AbstractC4862t.d(property, "getProperty(...)");
        Long lW = B.w(property);
        return lW != null ? lW.longValue() : j10;
    }

    @Override // N4.b
    public boolean putLong(String key, long j10) {
        AbstractC4862t.e(key, "key");
        this.f9610b.setProperty(key, String.valueOf(j10));
        g();
        return true;
    }
}
