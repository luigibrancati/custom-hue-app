package androidx.profileinstaller;

import B0.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f24002a = f.I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f24003b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f24004c = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f24007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f24008d;

        public b(int i10, int i11, long j10, long j11) {
            this.f24005a = i10;
            this.f24006b = i11;
            this.f24007c = j10;
            this.f24008d = j11;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f24005a);
                dataOutputStream.writeInt(this.f24006b);
                dataOutputStream.writeLong(this.f24007c);
                dataOutputStream.writeLong(this.f24008d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f24006b == bVar.f24006b && this.f24007c == bVar.f24007c && this.f24005a == bVar.f24005a && this.f24008d == bVar.f24008d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f24006b), Long.valueOf(this.f24007c), Integer.valueOf(this.f24005a), Long.valueOf(this.f24008d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f24011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f24012d;

        public c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f24009a = i10;
            this.f24011c = z11;
            this.f24010b = z10;
            this.f24012d = z12;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f24004c = cVar;
        f24002a.E(cVar);
        return f24004c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.profileinstaller.d.c c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.d.c(android.content.Context, boolean):androidx.profileinstaller.d$c");
    }
}
