package g1;

import Rd.InterfaceC2127f0;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import android.os.FileObserver;
import fc.C4015H;
import g1.FileObserverC4082Q;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: g1.Q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC4082Q extends FileObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34864c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f34865d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f34866e = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f34868b;

    /* JADX INFO: renamed from: g1.Q$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: g1.Q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0453a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f34869j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f34870k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f34871l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ File f34872m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0453a(File file, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f34872m = file;
            }

            public static final C4015H j(File file, Td.v vVar, String str) {
                if (AbstractC4862t.a(str, file.getName())) {
                    Td.n.b(vVar, C4015H.f34254a);
                }
                return C4015H.f34254a;
            }

            public static final C4015H k(InterfaceC2127f0 interfaceC2127f0) {
                interfaceC2127f0.dispose();
                return C4015H.f34254a;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C0453a c0453a = new C0453a(this.f34872m, interfaceC4988e);
                c0453a.f34871l = obj;
                return c0453a;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Td.v vVar, InterfaceC4988e interfaceC4988e) {
                return ((C0453a) create(vVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
            
                if (Td.t.a(r3, r7, r6) == r0) goto L16;
             */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    java.lang.Object r0 = mc.C5046c.f()
                    int r1 = r6.f34870k
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    fc.AbstractC4036s.b(r7)
                    goto L66
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1a:
                    java.lang.Object r1 = r6.f34869j
                    Rd.f0 r1 = (Rd.InterfaceC2127f0) r1
                    java.lang.Object r3 = r6.f34871l
                    Td.v r3 = (Td.v) r3
                    fc.AbstractC4036s.b(r7)
                    goto L53
                L26:
                    fc.AbstractC4036s.b(r7)
                    java.lang.Object r7 = r6.f34871l
                    Td.v r7 = (Td.v) r7
                    java.io.File r1 = r6.f34872m
                    g1.O r4 = new g1.O
                    r4.<init>()
                    g1.Q$a r1 = g1.FileObserverC4082Q.f34864c
                    java.io.File r5 = r6.f34872m
                    java.io.File r5 = r5.getParentFile()
                    kotlin.jvm.internal.AbstractC4862t.b(r5)
                    Rd.f0 r1 = g1.FileObserverC4082Q.a.b(r1, r5, r4)
                    fc.H r4 = fc.C4015H.f34254a
                    r6.f34871l = r7
                    r6.f34869j = r1
                    r6.f34870k = r3
                    java.lang.Object r3 = r7.p(r4, r6)
                    if (r3 != r0) goto L52
                    goto L65
                L52:
                    r3 = r7
                L53:
                    g1.P r7 = new g1.P
                    r7.<init>()
                    r1 = 0
                    r6.f34871l = r1
                    r6.f34869j = r1
                    r6.f34870k = r2
                    java.lang.Object r6 = Td.t.a(r3, r7, r6)
                    if (r6 != r0) goto L66
                L65:
                    return r0
                L66:
                    fc.H r6 = fc.C4015H.f34254a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: g1.FileObserverC4082Q.a.C0453a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final void f(String str, vc.l lVar) {
            synchronized (FileObserverC4082Q.f34865d) {
                try {
                    a aVar = FileObserverC4082Q.f34864c;
                    FileObserverC4082Q fileObserverC4082Q = (FileObserverC4082Q) aVar.c().get(str);
                    if (fileObserverC4082Q != null) {
                        fileObserverC4082Q.f34868b.remove(lVar);
                        if (fileObserverC4082Q.f34868b.isEmpty()) {
                            aVar.c().remove(str);
                            fileObserverC4082Q.stopWatching();
                        }
                    }
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final Map c() {
            return FileObserverC4082Q.f34866e;
        }

        public final InterfaceC2127f0 d(File file, final vc.l lVar) {
            final String path = file.getCanonicalFile().getPath();
            synchronized (FileObserverC4082Q.f34865d) {
                try {
                    Map mapC = FileObserverC4082Q.f34864c.c();
                    Object fileObserverC4082Q = mapC.get(path);
                    if (fileObserverC4082Q == null) {
                        AbstractC4862t.b(path);
                        fileObserverC4082Q = new FileObserverC4082Q(path, null);
                        mapC.put(path, fileObserverC4082Q);
                    }
                    FileObserverC4082Q fileObserverC4082Q2 = (FileObserverC4082Q) fileObserverC4082Q;
                    fileObserverC4082Q2.f34868b.add(lVar);
                    if (fileObserverC4082Q2.f34868b.size() == 1) {
                        fileObserverC4082Q2.startWatching();
                    }
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new InterfaceC2127f0() { // from class: g1.N
                @Override // Rd.InterfaceC2127f0
                public final void dispose() {
                    FileObserverC4082Q.a.f(path, lVar);
                }
            };
        }

        public final InterfaceC2313e e(File file) {
            AbstractC4862t.e(file, "file");
            return AbstractC2315g.h(new C0453a(file, null));
        }

        public a() {
        }
    }

    public /* synthetic */ FileObserverC4082Q(String str, AbstractC4854k abstractC4854k) {
        this(str);
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        Iterator it = this.f34868b.iterator();
        while (it.hasNext()) {
            ((vc.l) it.next()).invoke(str);
        }
    }

    public FileObserverC4082Q(String str) {
        super(str, 128);
        this.f34867a = str;
        this.f34868b = new CopyOnWriteArrayList();
    }
}
