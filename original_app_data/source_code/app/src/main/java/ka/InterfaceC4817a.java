package ka;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import bc.AbstractC2904a;
import cc.AbstractC3096a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ra.InterfaceC5683A;

/* JADX INFO: renamed from: ka.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4817a {

    /* JADX INFO: renamed from: ka.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0513a {
        InterfaceC0513a a(Context context);

        InterfaceC4817a build();
    }

    /* JADX INFO: renamed from: ka.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: ka.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {

        /* JADX INFO: renamed from: ka.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0514a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ExecutorService f39480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Eb.q f39481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExecutorService f39482c;

            public C0514a(ExecutorService executorService, Eb.q qVar, ExecutorService executorService2) {
                this.f39480a = executorService;
                this.f39481b = qVar;
                this.f39482c = executorService2;
            }

            @Override // ka.InterfaceC4817a.b
            public void a() {
                this.f39480a.shutdown();
                this.f39481b.f();
                this.f39482c.shutdown();
            }
        }

        public static BluetoothAdapter a() {
            return BluetoothAdapter.getDefaultAdapter();
        }

        public static Eb.q b() {
            return AbstractC2904a.d(new sa.k());
        }

        public static ExecutorService c() {
            return Executors.newSingleThreadExecutor();
        }

        public static Eb.q d(ExecutorService executorService) {
            return AbstractC3096a.b(executorService);
        }

        public static BluetoothManager e(Context context) {
            return (BluetoothManager) context.getSystemService("bluetooth");
        }

        public static Eb.q f() {
            return AbstractC3096a.a();
        }

        public static ExecutorService g() {
            return Executors.newCachedThreadPool();
        }

        public static ContentResolver h(Context context) {
            return context.getContentResolver();
        }

        public static int i() {
            return Build.VERSION.SDK_INT;
        }

        public static byte[] j() {
            return BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
        }

        public static byte[] k() {
            return BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        }

        public static byte[] l() {
            return BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        }

        public static b m(ExecutorService executorService, Eb.q qVar, ExecutorService executorService2) {
            return new C0514a(executorService, qVar, executorService2);
        }

        public static boolean n(Context context, int i10) {
            return i10 >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        }

        public static ra.j o(int i10, X3.a aVar, X3.a aVar2) {
            return i10 < 26 ? (ra.j) aVar.get() : (ra.j) aVar2.get();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            if ((r4.requestedPermissionsFlags[r1] & com.google.ar.core.ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean p(android.content.Context r4) {
            /*
                r0 = 0
                android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                r2 = 4096(0x1000, float:5.74E-42)
                android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                r1 = r0
            L10:
                java.lang.String[] r2 = r4.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                int r3 = r2.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                if (r1 >= r3) goto L36
                java.lang.String r3 = "android.permission.BLUETOOTH_SCAN"
                r2 = r2[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                boolean r2 = r3.equals(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                if (r2 != 0) goto L22
                int r1 = r1 + 1
                goto L10
            L22:
                int[] r4 = r4.requestedPermissionsFlags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                r4 = r4[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                r1 = 65536(0x10000, float:9.1835E-41)
                r4 = r4 & r1
                if (r4 == 0) goto L2d
                r4 = 1
                return r4
            L2d:
                return r0
            L2e:
                r4 = move-exception
                java.lang.String r1 = "Could not find application PackageInfo"
                java.lang.Object[] r2 = new java.lang.Object[r0]
                ma.q.e(r4, r1, r2)
            L36:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.InterfaceC4817a.c.p(android.content.Context):boolean");
        }

        public static LocationManager q(Context context) {
            return (LocationManager) context.getSystemService("location");
        }

        public static Eb.k r(int i10, ta.u uVar) {
            return i10 < 23 ? ta.D.b(Boolean.TRUE) : uVar.a();
        }

        public static ta.w s(int i10, X3.a aVar, X3.a aVar2, X3.a aVar3) {
            return i10 < 23 ? (ta.w) aVar.get() : i10 < 31 ? (ta.w) aVar2.get() : (ta.w) aVar3.get();
        }

        public static String[][] t(int i10, int i11) {
            return Math.min(i10, i11) < 31 ? new String[0][] : new String[][]{new String[]{"android.permission.BLUETOOTH_CONNECT"}};
        }

        public static String[][] u(int i10, int i11, boolean z10) {
            int iMin = Math.min(i10, i11);
            return iMin < 23 ? new String[0][] : iMin < 29 ? new String[][]{new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}} : iMin < 31 ? new String[][]{new String[]{"android.permission.ACCESS_FINE_LOCATION"}} : z10 ? new String[][]{new String[]{"android.permission.BLUETOOTH_SCAN"}} : new String[][]{new String[]{"android.permission.BLUETOOTH_SCAN"}, new String[]{"android.permission.ACCESS_FINE_LOCATION"}};
        }

        public static ra.q v(int i10, X3.a aVar, X3.a aVar2) {
            return i10 < 24 ? (ra.q) aVar.get() : (ra.q) aVar2.get();
        }

        public static InterfaceC5683A w(int i10, X3.a aVar, X3.a aVar2, X3.a aVar3) {
            return i10 < 21 ? (InterfaceC5683A) aVar.get() : i10 < 23 ? (InterfaceC5683A) aVar2.get() : (InterfaceC5683A) aVar3.get();
        }

        public static int x(Context context) {
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
            } catch (Throwable unused) {
                return Integer.MAX_VALUE;
            }
        }
    }

    G a();
}
