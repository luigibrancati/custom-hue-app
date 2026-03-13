package J4;

import Od.C;
import Od.C1823c;
import Od.F;
import Rd.AbstractC2130h;
import Rd.M;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4034q;
import gc.C4179C;
import gc.C4204q;
import gc.C4207u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f6111l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f6112m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ConcurrentHashMap f6113n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f6114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N4.b f6116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A4.a f6117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J4.c f6118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f6121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f6122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2687a f6123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC2687a f6124k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6125j;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return g.this.new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f6125j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                g gVar = g.this;
                this.f6125j = 1;
                if (gVar.l(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f6127j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f6128k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f6129l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f6130m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f6132o;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f6130m = obj;
            this.f6132o |= Integer.MIN_VALUE;
            return g.this.j(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f6133j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f6134k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f6135l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6137n;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f6135l = obj;
            this.f6137n |= Integer.MIN_VALUE;
            return g.this.l(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements Comparator {
        public e() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String strT0;
            String strT02;
            File file = (File) obj;
            AbstractC4862t.b(file);
            String strL = C.L(sc.l.p(file), g.this.f6115b + '-', "", false, 4, null);
            int iH0 = F.h0(strL, '-', 0, false, 6, null);
            if (iH0 >= 0) {
                StringBuilder sb2 = new StringBuilder();
                String strSubstring = strL.substring(0, iH0);
                AbstractC4862t.d(strSubstring, "substring(...)");
                sb2.append(F.t0(strSubstring, 10, '0'));
                String strSubstring2 = strL.substring(iH0);
                AbstractC4862t.d(strSubstring2, "substring(...)");
                sb2.append(strSubstring2);
                strT0 = sb2.toString();
            } else {
                strT0 = F.t0(strL, 10, '0');
            }
            File file2 = (File) obj2;
            AbstractC4862t.b(file2);
            String strL2 = C.L(sc.l.p(file2), g.this.f6115b + '-', "", false, 4, null);
            int iH02 = F.h0(strL2, '-', 0, false, 6, null);
            if (iH02 >= 0) {
                StringBuilder sb3 = new StringBuilder();
                String strSubstring3 = strL2.substring(0, iH02);
                AbstractC4862t.d(strSubstring3, "substring(...)");
                sb3.append(F.t0(strSubstring3, 10, '0'));
                String strSubstring4 = strL2.substring(iH02);
                AbstractC4862t.d(strSubstring4, "substring(...)");
                sb3.append(strSubstring4);
                strT02 = sb3.toString();
            } else {
                strT02 = F.t0(strL2, 10, '0');
            }
            return C4757a.a(strT0, strT02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f6139j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f6140k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f6141l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6143n;

        public f(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f6141l = obj;
            this.f6143n |= Integer.MIN_VALUE;
            return g.this.u(this);
        }
    }

    /* JADX INFO: renamed from: J4.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0102g extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f6144j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f6145k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f6146l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f6147m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f6149o;

        public C0102g(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f6147m = obj;
            this.f6149o |= Integer.MIN_VALUE;
            return g.this.w(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f6150a = new h();

        public h() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(JSONObject it) {
            AbstractC4862t.e(it, "it");
            String string = it.toString();
            AbstractC4862t.d(string, "toString(...)");
            return C.L(string, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", false, 4, null);
        }
    }

    public g(File directory, String storageKey, N4.b kvs, A4.a logger, J4.c diagnostics) {
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        AbstractC4862t.e(directory, "directory");
        AbstractC4862t.e(storageKey, "storageKey");
        AbstractC4862t.e(kvs, "kvs");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(diagnostics, "diagnostics");
        this.f6114a = directory;
        this.f6115b = storageKey;
        this.f6116c = kvs;
        this.f6117d = logger;
        this.f6118e = diagnostics;
        this.f6119f = "amplitude.events.file.index." + storageKey;
        this.f6120g = "amplitude.events.file.version." + storageKey;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        AbstractC4862t.d(setNewSetFromMap, "newSetFromMap(...)");
        this.f6121h = setNewSetFromMap;
        this.f6122i = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = f6112m;
        Object objB = concurrentHashMap.get(storageKey);
        if (objB == null && (objPutIfAbsent2 = concurrentHashMap.putIfAbsent(storageKey, (objB = AbstractC2693g.b(false, 1, null)))) != null) {
            objB = objPutIfAbsent2;
        }
        this.f6123j = (InterfaceC2687a) objB;
        ConcurrentHashMap concurrentHashMap2 = f6113n;
        Object objB2 = concurrentHashMap2.get(storageKey);
        if (objB2 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(storageKey, (objB2 = AbstractC2693g.b(false, 1, null)))) != null) {
            objB2 = objPutIfAbsent;
        }
        this.f6124k = (InterfaceC2687a) objB2;
        k();
        AbstractC2130h.b(null, new a(null), 1, null);
    }

    public static final boolean h(g this_run, File file, String str) {
        AbstractC4862t.e(this_run, "$this_run");
        AbstractC4862t.b(str);
        return F.V(str, this_run.f6115b, false, 2, null) && C.D(str, ".tmp", false, 2, null);
    }

    public static final boolean m(g this$0, File file, String str) {
        AbstractC4862t.e(this$0, "this$0");
        AbstractC4862t.b(str);
        return F.V(str, this$0.f6115b, false, 2, null) && !C.D(str, ".properties", false, 2, null);
    }

    public static final boolean p(g this$0, File file, String str) {
        AbstractC4862t.e(this$0, "this$0");
        AbstractC4862t.b(str);
        return (!F.V(str, this$0.f6115b, false, 2, null) || C.D(str, ".tmp", false, 2, null) || C.D(str, ".properties", false, 2, null)) ? false : true;
    }

    public static /* synthetic */ void y(g gVar, List list, File file, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        gVar.x(list, file, z10);
    }

    public final void f() {
        this.f6116c.a(this.f6119f);
        this.f6116c.a(this.f6120g);
    }

    public final File g() {
        File file = (File) this.f6122i.get(this.f6115b);
        if (file == null) {
            File[] fileArrListFiles = this.f6114a.listFiles(new FilenameFilter() { // from class: J4.e
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return g.h(this.f6109a, file2, str);
                }
            });
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            file = (File) C4204q.d0(fileArrListFiles, 0);
        }
        long j10 = this.f6116c.getLong(this.f6119f, 0L);
        Map map = this.f6122i;
        String str = this.f6115b;
        if (file == null) {
            file = new File(this.f6114a, this.f6115b + '-' + j10 + ".tmp");
        }
        map.put(str, file);
        Object obj = this.f6122i.get(this.f6115b);
        AbstractC4862t.b(obj);
        return (File) obj;
    }

    public final void i(File file) {
        if (file == null) {
            return;
        }
        s(file);
        n();
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r13, lc.InterfaceC4988e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.g.j(java.lang.String, lc.e):java.lang.Object");
    }

    public final boolean k() {
        try {
            N4.a.a(this.f6114a);
            return true;
        } catch (IOException e10) {
            this.f6118e.a("Failed to create directory: " + e10.getMessage());
            this.f6117d.d("Failed to create directory for events storage: " + this.f6114a.getPath());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(lc.InterfaceC4988e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.g.l(lc.e):java.lang.Object");
    }

    public final boolean n() {
        return this.f6116c.putLong(this.f6119f, this.f6116c.getLong(this.f6119f, 0L) + 1);
    }

    public final List o() {
        File[] fileArrListFiles = this.f6114a.listFiles(new FilenameFilter() { // from class: J4.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return g.p(this.f6108a, file, str);
            }
        });
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        List listD0 = C4204q.D0(fileArrListFiles, new e());
        ArrayList arrayList = new ArrayList(C4207u.v(listD0, 10));
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    public final void q(String filePath) {
        AbstractC4862t.e(filePath, "filePath");
        this.f6121h.remove(filePath);
    }

    public final boolean r(String filePath) {
        AbstractC4862t.e(filePath, "filePath");
        this.f6121h.remove(filePath);
        return new File(filePath).delete();
    }

    public final void s(File file) {
        if (!file.exists() || sc.l.o(file).length() == 0) {
            return;
        }
        String strP = sc.l.p(file);
        File file2 = new File(this.f6114a, strP);
        if (!file2.exists()) {
            file.renameTo(new File(this.f6114a, sc.l.p(file)));
            return;
        }
        this.f6117d.a("File already exists: " + file2 + ", handle gracefully.");
        file.renameTo(new File(this.f6114a, strP + '-' + System.currentTimeMillis() + '-' + new Random().nextInt(1000)));
    }

    public final void t() {
        this.f6122i.remove(this.f6115b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(lc.InterfaceC4988e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof J4.g.f
            if (r0 == 0) goto L13
            r0 = r8
            J4.g$f r0 = (J4.g.f) r0
            int r1 = r0.f6143n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6143n = r1
            goto L18
        L13:
            J4.g$f r0 = new J4.g$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6141l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f6143n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f6140k
            ae.a r7 = (ae.InterfaceC2687a) r7
            java.lang.Object r0 = r0.f6139j
            J4.g r0 = (J4.g) r0
            fc.AbstractC4036s.b(r8)
            r8 = r7
            r7 = r0
            goto L53
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            fc.AbstractC4036s.b(r8)
            ae.a r8 = r7.f6123j
            java.lang.String r2 = "writeMutex"
            kotlin.jvm.internal.AbstractC4862t.d(r8, r2)
            r0.f6139j = r7
            r0.f6140k = r8
            r0.f6143n = r3
            java.lang.Object r0 = r8.a(r4, r0)
            if (r0 != r1) goto L53
            return r1
        L53:
            java.io.File r0 = r7.g()     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6d
            long r1 = r0.length()     // Catch: java.lang.Throwable -> L6b
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L6d
            r7.i(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r7 = move-exception
            goto L73
        L6d:
            fc.H r7 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L6b
            r8.h(r4)
            return r7
        L73:
            r8.h(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.g.u(lc.e):java.lang.Object");
    }

    public final void v(String filePath, JSONArray events) {
        AbstractC4862t.e(filePath, "filePath");
        AbstractC4862t.e(events, "events");
        File file = new File(filePath);
        if (file.exists()) {
            String name = file.getName();
            File file2 = new File(this.f6114a, name + "-1.tmp");
            File file3 = new File(this.f6114a, name + "-2.tmp");
            C4034q c4034qF = p.f(events);
            y(this, (List) c4034qF.e(), file2, false, 4, null);
            y(this, (List) c4034qF.f(), file3, false, 4, null);
            r(filePath);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:18:0x005a, B:39:0x0120, B:21:0x0062, B:24:0x006e, B:30:0x00a9, B:32:0x00b4, B:34:0x00c1, B:37:0x00c6, B:38:0x00f7, B:29:0x0077), top: B:44:0x005a, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(java.lang.String r12, lc.InterfaceC4988e r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.g.w(java.lang.String, lc.e):java.lang.Object");
    }

    public final void x(List list, File file, boolean z10) {
        try {
            String strQ0 = C4179C.q0(list, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, null, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 0, null, h.f6150a, 26, null);
            file.createNewFile();
            byte[] bytes = strQ0.getBytes(C1823c.f12394b);
            AbstractC4862t.d(bytes, "getBytes(...)");
            z(bytes, file, z10);
            s(file);
        } catch (IOException e10) {
            this.f6118e.a("Failed to create or write to split file: " + e10.getMessage());
            this.f6117d.d("Failed to create or write to split file: " + file.getPath());
        } catch (Exception e11) {
            this.f6118e.a("Failed to write to split file: " + e11.getMessage());
            this.f6117d.d("Failed to write to split file: " + file.getPath() + " for error: " + e11.getMessage());
        }
    }

    public final void z(byte[] bArr, File file, boolean z10) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z10);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(fileOutputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    sc.c.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException e10) {
            this.f6118e.a("Error writing to file: " + e10.getMessage());
            this.f6117d.d("File not found: " + file.getPath());
        } catch (IOException e11) {
            this.f6118e.a("Error writing to file: " + e11.getMessage());
            this.f6117d.d("Failed to write to file: " + file.getPath());
        } catch (SecurityException e12) {
            this.f6118e.a("Error writing to file: " + e12.getMessage());
            this.f6117d.d("Security exception when saving event: " + e12.getMessage());
        } catch (Exception e13) {
            this.f6118e.a("Error writing to file: " + e13.getMessage());
            this.f6117d.d("Failed to write to file: " + file.getPath());
        }
    }
}
