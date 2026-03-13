package sc;

import fc.C4032o;
import gc.AbstractC4190c;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Nd.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f44438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f44439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.l f44440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.l f44441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f44442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44443f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            AbstractC4862t.e(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b extends AbstractC4190c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayDeque f44444c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f44446b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f44447c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f44448d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f44449e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f44450f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                AbstractC4862t.e(rootDir, "rootDir");
                this.f44450f = bVar;
            }

            @Override // sc.g.c
            public File b() {
                if (!this.f44449e && this.f44447c == null) {
                    vc.l lVar = g.this.f44440c;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f44447c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        p pVar = g.this.f44442e;
                        if (pVar != null) {
                            pVar.invoke(a(), new C5820a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f44449e = true;
                    }
                }
                File[] fileArr = this.f44447c;
                if (fileArr != null) {
                    int i10 = this.f44448d;
                    AbstractC4862t.b(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f44447c;
                        AbstractC4862t.b(fileArr2);
                        int i11 = this.f44448d;
                        this.f44448d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f44446b) {
                    this.f44446b = true;
                    return a();
                }
                vc.l lVar2 = g.this.f44441d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: sc.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class C0598b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f44451b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f44452c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0598b(b bVar, File rootFile) {
                super(rootFile);
                AbstractC4862t.e(rootFile, "rootFile");
                this.f44452c = bVar;
            }

            @Override // sc.g.c
            public File b() {
                if (this.f44451b) {
                    return null;
                }
                this.f44451b = true;
                return a();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f44453b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f44454c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f44455d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f44456e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                AbstractC4862t.e(rootDir, "rootDir");
                this.f44456e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // sc.g.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f44453b
                    r1 = 0
                    if (r0 != 0) goto L28
                    sc.g$b r0 = r9.f44456e
                    sc.g r0 = sc.g.this
                    vc.l r0 = sc.g.d(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f44453b = r0
                    java.io.File r9 = r9.a()
                    return r9
                L28:
                    java.io.File[] r0 = r9.f44454c
                    if (r0 == 0) goto L47
                    int r2 = r9.f44455d
                    kotlin.jvm.internal.AbstractC4862t.b(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    sc.g$b r0 = r9.f44456e
                    sc.g r0 = sc.g.this
                    vc.l r0 = sc.g.f(r0)
                    if (r0 == 0) goto L46
                    java.io.File r9 = r9.a()
                    r0.invoke(r9)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f44454c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f44454c = r0
                    if (r0 != 0) goto L76
                    sc.g$b r0 = r9.f44456e
                    sc.g r0 = sc.g.this
                    vc.p r0 = sc.g.e(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    sc.a r3 = new sc.a
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f44454c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.AbstractC4862t.b(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    sc.g$b r0 = r9.f44456e
                    sc.g r0 = sc.g.this
                    vc.l r0 = sc.g.f(r0)
                    if (r0 == 0) goto L91
                    java.io.File r9 = r9.a()
                    r0.invoke(r9)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f44454c
                    kotlin.jvm.internal.AbstractC4862t.b(r0)
                    int r1 = r9.f44455d
                    int r2 = r1 + 1
                    r9.f44455d = r2
                    r9 = r0[r1]
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: sc.g.b.c.b():java.io.File");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44457a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f44457a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f44444c = arrayDeque;
            if (g.this.f44438a.isDirectory()) {
                arrayDeque.push(e(g.this.f44438a));
            } else if (g.this.f44438a.isFile()) {
                arrayDeque.push(new C0598b(this, g.this.f44438a));
            } else {
                b();
            }
        }

        @Override // gc.AbstractC4190c
        public void a() {
            File fileF = f();
            if (fileF != null) {
                c(fileF);
            } else {
                b();
            }
        }

        public final a e(File file) {
            int i10 = d.f44457a[g.this.f44439b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new C4032o();
        }

        public final File f() {
            File fileB;
            while (true) {
                c cVar = (c) this.f44444c.peek();
                if (cVar == null) {
                    return null;
                }
                fileB = cVar.b();
                if (fileB == null) {
                    this.f44444c.pop();
                } else {
                    if (AbstractC4862t.a(fileB, cVar.a()) || !fileB.isDirectory() || this.f44444c.size() >= g.this.f44443f) {
                        break;
                    }
                    this.f44444c.push(e(fileB));
                }
            }
            return fileB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f44458a;

        public c(File root) {
            AbstractC4862t.e(root, "root");
            this.f44458a = root;
        }

        public final File a() {
            return this.f44458a;
        }

        public abstract File b();
    }

    public g(File file, h hVar, vc.l lVar, vc.l lVar2, p pVar, int i10) {
        this.f44438a = file;
        this.f44439b = hVar;
        this.f44440c = lVar;
        this.f44441d = lVar2;
        this.f44442e = pVar;
        this.f44443f = i10;
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new b();
    }

    public /* synthetic */ g(File file, h hVar, vc.l lVar, vc.l lVar2, p pVar, int i10, int i11, AbstractC4854k abstractC4854k) {
        this(file, (i11 & 2) != 0 ? h.TOP_DOWN : hVar, lVar, lVar2, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(File start, h direction) {
        this(start, direction, null, null, null, 0, 32, null);
        AbstractC4862t.e(start, "start");
        AbstractC4862t.e(direction, "direction");
    }
}
