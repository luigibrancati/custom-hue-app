package com.google.android.gms.dynamite;

import B6.l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import v6.AbstractC6055j;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f29117h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f29118i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f29119j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f29120k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Boolean f29121l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static F6.e f29127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static F6.f f29128s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29129a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ThreadLocal f29122m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f29123n = new F6.c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b.a f29124o = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f29111b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f29112c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f29113d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f29114e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f29115f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f29116g = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f29125p = new i();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f29126q = new com.google.android.gms.dynamite.a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends Exception {
        public /* synthetic */ a(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        public /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0357b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f29130a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f29131b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f29132c = 0;
        }

        C0357b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        AbstractC6056k.l(context);
        this.f29129a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC6055j.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #3 {all -> 0x00c3, blocks: (B:5:0x0045, B:9:0x00bc, B:16:0x00c8, B:19:0x00ce, B:32:0x00ec, B:109:0x027d, B:110:0x0288, B:118:0x0298, B:120:0x02c0, B:122:0x02cf, B:132:0x02ef, B:133:0x02f7, B:113:0x028b, B:114:0x028c, B:115:0x0294, B:134:0x02f8, B:135:0x0319, B:136:0x031a, B:137:0x036c), top: B:151:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.dynamite.DynamiteModule$b] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r30, com.google.android.gms.dynamite.DynamiteModule.b r31, java.lang.String r32) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0173 A[Catch: all -> 0x00d8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00d8, blocks: (B:4:0x0006, B:58:0x00cd, B:60:0x00d3, B:68:0x0101, B:96:0x0165, B:100:0x0173, B:118:0x01d0, B:119:0x01d3, B:113:0x01c7, B:66:0x00de, B:121:0x01d5, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:56:0x00ca, B:22:0x004c, B:43:0x008d, B:46:0x0090, B:53:0x00a8, B:57:0x00cc, B:55:0x00aa), top: B:127:0x0006, inners: #0, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c A[Catch: all -> 0x003a, TryCatch #3 {, blocks: (B:10:0x002a, B:12:0x0036, B:50:0x00a5, B:17:0x003f, B:19:0x0045, B:21:0x004b, B:26:0x0052, B:28:0x0056, B:32:0x0060, B:34:0x0068, B:37:0x006f, B:41:0x0084, B:42:0x008c, B:40:0x0076, B:45:0x008f, B:48:0x0092, B:49:0x009c, B:18:0x0042), top: B:128:0x002a, inners: #6 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x01c5 -> B:131:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x01c7 -> B:131:0x01ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f29121l)) {
            return true;
        }
        boolean z10 = false;
        if (f29121l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != l.g() ? 0 : 268435456);
            if (com.google.android.gms.common.a.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f29121l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f29119j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:328), block:B:92:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.h(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static boolean i(Cursor cursor) {
        F6.d dVar = (F6.d) f29122m.get();
        if (dVar == null || dVar.f3762a != null) {
            return false;
        }
        dVar.f3762a = cursor;
        return true;
    }

    public static DynamiteModule j(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    public static void k(ClassLoader classLoader) throws a {
        F6.f fVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                fVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                fVar = iInterfaceQueryLocalInterface instanceof F6.f ? (F6.f) iInterfaceQueryLocalInterface : new F6.f(iBinder);
            }
            f29128s = fVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, bArr);
        }
    }

    public static F6.e l(Context context) {
        F6.e eVar;
        synchronized (DynamiteModule.class) {
            F6.e eVar2 = f29127r;
            if (eVar2 != null) {
                return eVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    eVar = iInterfaceQueryLocalInterface instanceof F6.e ? (F6.e) iInterfaceQueryLocalInterface : new F6.e(iBinder);
                }
                if (eVar != null) {
                    f29127r = eVar;
                    return eVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public Context b() {
        return this.f29129a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.f29129a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
