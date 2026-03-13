package o3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: o3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5203a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0548a f41149e = new C0548a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f41150f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f41152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f41153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f41154d;

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0548a {
        public /* synthetic */ C0548a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Lock b(String str) {
            Lock lock;
            synchronized (C5203a.f41150f) {
                try {
                    Map map = C5203a.f41150f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public C0548a() {
        }
    }

    public C5203a(String name, File file, boolean z10) {
        File file2;
        AbstractC4862t.e(name, "name");
        this.f41151a = z10;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f41152b = file2;
        this.f41153c = f41149e.b(name);
    }

    public static /* synthetic */ void c(C5203a c5203a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c5203a.f41151a;
        }
        c5203a.b(z10);
    }

    public final void b(boolean z10) {
        this.f41153c.lock();
        if (z10) {
            try {
                File file = this.f41152b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f41152b).getChannel();
                channel.lock();
                this.f41154d = channel;
            } catch (IOException e10) {
                this.f41154d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f41154d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f41153c.unlock();
    }
}
