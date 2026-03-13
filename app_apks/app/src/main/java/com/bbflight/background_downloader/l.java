package com.bbflight.background_downloader;

import I3.y;
import Od.C1823c;
import Od.C1829i;
import Q4.C1887g;
import Q4.EnumC1903x;
import Q4.NotificationConfig;
import Q4.ResumeData;
import Q4.Task;
import Q4.TaskProgressUpdate;
import Q4.TaskStatusUpdate;
import Q4.Y;
import Q4.b0;
import Q4.g0;
import Rd.AbstractC2128g;
import Rd.C2123d0;
import Rd.InterfaceC2157v;
import Rd.M;
import Rd.N;
import Rd.X;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bbflight.background_downloader.a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import gc.P;
import ge.w0;
import he.AbstractC4304b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileSystemException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.T;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import sc.o;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f27291t = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f27292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f27298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Y f27301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f27303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f27304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f27305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f27308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SharedPreferences f27310s;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: com.bbflight.background_downloader.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final /* synthetic */ class C0352a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27311a;

            static {
                int[] iArr = new int[g0.values().length];
                try {
                    iArr[g0.complete.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g0.failed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g0.canceled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[g0.notFound.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[g0.paused.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f27311a = iArr;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends nc.m implements vc.l {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27312j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Task f27313k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ double f27314l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f27315m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ SharedPreferences f27316n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Task task, double d10, long j10, SharedPreferences sharedPreferences, InterfaceC4988e interfaceC4988e) {
                super(1, interfaceC4988e);
                this.f27313k = task;
                this.f27314l = d10;
                this.f27315m = j10;
                this.f27316n = sharedPreferences;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
                return new b(this.f27313k, this.f27314l, this.f27315m, this.f27316n, interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f27312j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                Log.d("TaskRunner", "Could not post progress update -> storing locally");
                a aVar = l.f27291t;
                String taskId = this.f27313k.getTaskId();
                AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                TaskProgressUpdate taskProgressUpdate = new TaskProgressUpdate(this.f27313k, this.f27314l, this.f27315m);
                aVar2.d();
                aVar.k("com.bbflight.background_downloader.progressUpdateMap.v2", taskId, aVar2.b(TaskProgressUpdate.INSTANCE.serializer(), taskProgressUpdate), this.f27316n);
                return C4015H.f34254a;
            }

            @Override // vc.l
            public final Object invoke(InterfaceC4988e interfaceC4988e) {
                return ((b) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends nc.m implements vc.l {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27317j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ ResumeData f27318k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SharedPreferences f27319l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ResumeData resumeData, SharedPreferences sharedPreferences, InterfaceC4988e interfaceC4988e) {
                super(1, interfaceC4988e);
                this.f27318k = resumeData;
                this.f27319l = sharedPreferences;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
                return new c(this.f27318k, this.f27319l, interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f27317j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                Log.d("TaskRunner", "Could not post resume data -> storing locally");
                a aVar = l.f27291t;
                String taskId = this.f27318k.getTask().getTaskId();
                AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                ResumeData resumeData = this.f27318k;
                aVar2.d();
                aVar.k("com.bbflight.background_downloader.resumeDataMap.v2", taskId, aVar2.b(ResumeData.INSTANCE.serializer(), resumeData), this.f27319l);
                return C4015H.f34254a;
            }

            @Override // vc.l
            public final Object invoke(InterfaceC4988e interfaceC4988e) {
                return ((c) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends AbstractC5160d {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            public /* synthetic */ Object f27320A;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public int f27322C;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f27323j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f27324k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Object f27325l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f27326m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f27327n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Object f27328o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f27329p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public Object f27330q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public Object f27331r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Object f27332s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f27333t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f27334u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f27335v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f27336w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f27337x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f27338y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public boolean f27339z;

            public d(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f27320A = obj;
                this.f27322C |= Integer.MIN_VALUE;
                return a.this.i(null, null, null, null, null, null, null, null, null, null, this);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends nc.m implements vc.l {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27340j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Task f27341k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ TaskStatusUpdate f27342l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ SharedPreferences f27343m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Task task, TaskStatusUpdate taskStatusUpdate, SharedPreferences sharedPreferences, InterfaceC4988e interfaceC4988e) {
                super(1, interfaceC4988e);
                this.f27341k = task;
                this.f27342l = taskStatusUpdate;
                this.f27343m = sharedPreferences;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
                return new e(this.f27341k, this.f27342l, this.f27343m, interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f27340j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                Log.d("TaskRunner", "Could not post status update -> storing locally");
                a aVar = l.f27291t;
                String taskId = this.f27341k.getTaskId();
                AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                TaskStatusUpdate taskStatusUpdate = this.f27342l;
                aVar2.d();
                aVar.k("com.bbflight.background_downloader.statusUpdateMap.v2", taskId, aVar2.b(TaskStatusUpdate.INSTANCE.serializer(), taskStatusUpdate), this.f27343m);
                return C4015H.f34254a;
            }

            @Override // vc.l
            public final Object invoke(InterfaceC4988e interfaceC4988e) {
                return ((e) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class f extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27344j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ y f27345k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(y yVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27345k = yVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new f(this.f27345k, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f27344j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return this.f27345k.a().get();
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ Object d(a aVar, String str, Task task, Object obj, vc.l lVar, InterfaceC4988e interfaceC4988e, int i10, Object obj2) {
            if ((i10 & 8) != 0) {
                lVar = null;
            }
            return aVar.c(str, task, obj, lVar, interfaceC4988e);
        }

        public static /* synthetic */ Object g(a aVar, Task task, double d10, SharedPreferences sharedPreferences, long j10, double d11, long j11, InterfaceC4988e interfaceC4988e, int i10, Object obj) {
            return aVar.f(task, d10, sharedPreferences, (i10 & 8) != 0 ? -1L : j10, (i10 & 16) != 0 ? -1.0d : d11, (i10 & 32) != 0 ? -1000L : j11, interfaceC4988e);
        }

        public static /* synthetic */ Object j(a aVar, Task task, g0 g0Var, SharedPreferences sharedPreferences, Y y10, String str, Map map, Integer num, String str2, String str3, Context context, InterfaceC4988e interfaceC4988e, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                y10 = null;
            }
            if ((i10 & 16) != 0) {
                str = null;
            }
            if ((i10 & 32) != 0) {
                map = null;
            }
            if ((i10 & 64) != 0) {
                num = null;
            }
            if ((i10 & 128) != 0) {
                str2 = null;
            }
            if ((i10 & 256) != 0) {
                str3 = null;
            }
            return aVar.i(task, g0Var, sharedPreferences, y10, str, map, num, str2, str3, context, interfaceC4988e);
        }

        public final boolean b(Task task) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            a.Companion companion = com.bbflight.background_downloader.a.INSTANCE;
            Map mapJ = companion.j();
            AbstractC4862t.d(mapJ, "<get-cancelUpdateSentForTaskId>(...)");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapJ.entrySet()) {
                Object value = entry.getValue();
                AbstractC4862t.d(value, "<get-value>(...)");
                if (jCurrentTimeMillis - ((Number) value).longValue() < 3000) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            companion.B(T.c(linkedHashMap));
            return com.bbflight.background_downloader.a.INSTANCE.j().get(task.getTaskId()) == null;
        }

        public final Object c(String str, Task task, Object obj, vc.l lVar, InterfaceC4988e interfaceC4988e) {
            Object objE = j.f27257a.e(new C1887g(task, str, obj, lVar), interfaceC4988e);
            return objE == C5046c.f() ? objE : C4015H.f34254a;
        }

        public final Object e(Task task, boolean z10, InterfaceC4988e interfaceC4988e) {
            Object objD = d(this, "canResume", task, AbstractC5158b.a(z10), null, interfaceC4988e, 8, null);
            return objD == C5046c.f() ? objD : C4015H.f34254a;
        }

        public final Object f(Task task, double d10, SharedPreferences sharedPreferences, long j10, double d11, long j11, InterfaceC4988e interfaceC4988e) {
            if (!task.V()) {
                return C4015H.f34254a;
            }
            Object objC = c("progressUpdate", task, C4206t.q(AbstractC5158b.b(d10), AbstractC5158b.d(j10), AbstractC5158b.b(d11), AbstractC5158b.d(j11)), new b(task, d10, j10, sharedPreferences, null), interfaceC4988e);
            return objC == C5046c.f() ? objC : C4015H.f34254a;
        }

        public final Object h(ResumeData resumeData, SharedPreferences sharedPreferences, InterfaceC4988e interfaceC4988e) {
            Map mapQ = com.bbflight.background_downloader.a.INSTANCE.q();
            AbstractC4862t.d(mapQ, "<get-localResumeData>(...)");
            mapQ.put(resumeData.getTask().getTaskId(), resumeData);
            Object objC = c("resumeData", resumeData.getTask(), C4206t.q(resumeData.getData(), AbstractC5158b.d(resumeData.getRequiredStartByte()), resumeData.getETag()), new c(resumeData, sharedPreferences, null), interfaceC4988e);
            return objC == C5046c.f() ? objC : C4015H.f34254a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:186:0x0b8a, code lost:
        
            if (r0.l(r5, r3, r11) == r14) goto L187;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0416, code lost:
        
            if (r1.d(null, r11) == r14) goto L187;
         */
        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0747  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x07db  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0888  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x08b8  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x094e  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0a55  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0a5e  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0a66 A[LOOP:0: B:170:0x0a64->B:171:0x0a66, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0ab3 A[LOOP:1: B:175:0x0ab1->B:176:0x0ab3, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0b13  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0b29  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x03d0  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x043c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0444  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x045a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Type inference failed for: r0v145 */
        /* JADX WARN: Type inference failed for: r0v146 */
        /* JADX WARN: Type inference failed for: r0v147 */
        /* JADX WARN: Type inference failed for: r0v148 */
        /* JADX WARN: Type inference failed for: r0v149 */
        /* JADX WARN: Type inference failed for: r0v150 */
        /* JADX WARN: Type inference failed for: r0v69 */
        /* JADX WARN: Type inference failed for: r0v71 */
        /* JADX WARN: Type inference failed for: r0v72 */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v16 */
        /* JADX WARN: Type inference failed for: r12v33 */
        /* JADX WARN: Type inference failed for: r12v37 */
        /* JADX WARN: Type inference failed for: r12v39 */
        /* JADX WARN: Type inference failed for: r12v42 */
        /* JADX WARN: Type inference failed for: r12v44 */
        /* JADX WARN: Type inference failed for: r12v47 */
        /* JADX WARN: Type inference failed for: r12v48 */
        /* JADX WARN: Type inference failed for: r12v51 */
        /* JADX WARN: Type inference failed for: r12v52 */
        /* JADX WARN: Type inference failed for: r12v53 */
        /* JADX WARN: Type inference failed for: r12v54 */
        /* JADX WARN: Type inference failed for: r12v57 */
        /* JADX WARN: Type inference failed for: r12v58 */
        /* JADX WARN: Type inference failed for: r12v59, types: [int] */
        /* JADX WARN: Type inference failed for: r12v62 */
        /* JADX WARN: Type inference failed for: r12v66 */
        /* JADX WARN: Type inference failed for: r12v67 */
        /* JADX WARN: Type inference failed for: r12v68 */
        /* JADX WARN: Type inference failed for: r12v69 */
        /* JADX WARN: Type inference failed for: r12v70 */
        /* JADX WARN: Type inference failed for: r12v71 */
        /* JADX WARN: Type inference failed for: r12v72 */
        /* JADX WARN: Type inference failed for: r12v73 */
        /* JADX WARN: Type inference failed for: r12v74 */
        /* JADX WARN: Type inference failed for: r12v75 */
        /* JADX WARN: Type inference failed for: r57v0, types: [com.bbflight.background_downloader.l$a] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object i(Q4.Task r58, Q4.g0 r59, android.content.SharedPreferences r60, Q4.Y r61, java.lang.String r62, java.util.Map r63, java.lang.Integer r64, java.lang.String r65, java.lang.String r66, android.content.Context r67, lc.InterfaceC4988e r68) {
            /*
                Method dump skipped, instruction units count: 3008
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.a.i(Q4.X, Q4.g0, android.content.SharedPreferences, Q4.Y, java.lang.String, java.util.Map, java.lang.Integer, java.lang.String, java.lang.String, android.content.Context, lc.e):java.lang.Object");
        }

        public final void k(String str, String str2, String str3, SharedPreferences sharedPreferences) {
            ReentrantReadWriteLock reentrantReadWriteLockV = com.bbflight.background_downloader.a.INSTANCE.v();
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLockV.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLockV.getWriteHoldCount() == 0 ? reentrantReadWriteLockV.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLockV.writeLock();
            writeLock.lock();
            try {
                String string = sharedPreferences.getString(str, "{}");
                AbstractC4862t.c(string, "null cannot be cast to non-null type kotlin.String");
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                w0 w0Var = w0.f35762a;
                Map map = (Map) aVar.a(new ge.M(w0Var, w0Var), string);
                map.put(str2, str3);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                aVar.d();
                editorEdit.putString(str, aVar.b(new ge.M(w0Var, w0Var), map));
                editorEdit.apply();
                C4015H c4015h = C4015H.f34254a;
            } finally {
                while (i10 < readHoldCount) {
                    lock.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        }

        public final String l(Task task) {
            AbstractC4862t.e(task, "task");
            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
            aVar.d();
            return aVar.b(Task.INSTANCE.serializer(), task);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27346j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27347k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f27348l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f27350n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27348l = obj;
            this.f27350n |= Integer.MIN_VALUE;
            return l.j(l.this, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27351j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27352k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27353l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27354m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27355n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f27356o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f27357p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f27358q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27359r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27361t;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27359r = obj;
            this.f27361t |= Integer.MIN_VALUE;
            return l.this.m(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27362j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ URL f27363k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Proxy f27364l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(URL url, Proxy proxy, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27363k = url;
            this.f27364l = proxy;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new d(this.f27363k, this.f27364l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f27362j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            URL url = this.f27363k;
            Proxy proxy = this.f27364l;
            if (proxy == null) {
                proxy = Proxy.NO_PROXY;
            }
            return (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f27366k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f27368m;

        public e(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27366k = obj;
            this.f27368m |= Integer.MIN_VALUE;
            return l.G(l.this, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27369j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27370k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f27371l;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27373j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ l f27374k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27374k = lVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f27374k, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f27373j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    this.f27373j = 1;
                    if (X.a(540000L, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                this.f27374k.f27300i = true;
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27375j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ l f27376k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ L f27377l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar, L l10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27376k = lVar;
                this.f27377l = l10;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new b(this.f27376k, this.f27377l, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
            
                if (r0.A(r1, r7) != r12) goto L29;
             */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 220
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public f(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return l.this.new f(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:171|58|(1:60)(1:62)|63|(10:65|(1:67)(1:69)|(0)|73|(1:75)(1:77)|78|79|167|80|(8:83|173|84|(4:86|87|88|(8:91|92|169|102|103|165|104|(4:107|157|108|(4:111|163|112|113))))(7:101|169|102|103|165|104|(0))|140|(2:142|(1:144))|145|146))|72|73|(0)(0)|78|79|167|80|(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x031e, code lost:
        
            if (Rd.AbstractC2128g.g(r0, r1, r11) != r14) goto L149;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x03b7, code lost:
        
            if (Rd.AbstractC2128g.g(r0, r2, r11) != r14) goto L149;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x017d, code lost:
        
            if (r1.A(r2, r11) == r14) goto L153;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x02b4, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x02b9, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02c8  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x02ef  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0302  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x037a A[Catch: all -> 0x0329, TryCatch #5 {all -> 0x0329, blocks: (B:140:0x034e, B:142:0x037a, B:144:0x0395, B:145:0x0399, B:108:0x02f0), top: B:157:0x02f0 }] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x03d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01c6 A[Catch: all -> 0x0081, Exception -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x007a, B:60:0x01c6, B:65:0x01ed, B:67:0x01f5, B:55:0x018d), top: B:155:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01ed A[Catch: all -> 0x0081, Exception -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x007a, B:60:0x01c6, B:65:0x01ed, B:67:0x01f5, B:55:0x018d), top: B:155:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x027d  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0287 A[Catch: all -> 0x02be, Exception -> 0x02c3, TRY_LEAVE, TryCatch #13 {Exception -> 0x02c3, all -> 0x02be, blocks: (B:84:0x027f, B:86:0x0287), top: B:173:0x027f }] */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r17v0 */
        /* JADX WARN: Type inference failed for: r17v1 */
        /* JADX WARN: Type inference failed for: r17v10 */
        /* JADX WARN: Type inference failed for: r17v2 */
        /* JADX WARN: Type inference failed for: r17v3 */
        /* JADX WARN: Type inference failed for: r17v4 */
        /* JADX WARN: Type inference failed for: r17v5 */
        /* JADX WARN: Type inference failed for: r17v6 */
        /* JADX WARN: Type inference failed for: r17v7 */
        /* JADX WARN: Type inference failed for: r17v8 */
        /* JADX WARN: Type inference failed for: r17v9 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.L] */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v35 */
        /* JADX WARN: Type inference failed for: r1v38 */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v45, types: [kotlin.jvm.internal.L] */
        /* JADX WARN: Type inference failed for: r1v46 */
        /* JADX WARN: Type inference failed for: r1v47 */
        /* JADX WARN: Type inference failed for: r1v51 */
        /* JADX WARN: Type inference failed for: r1v54 */
        /* JADX WARN: Type inference failed for: r1v56 */
        /* JADX WARN: Type inference failed for: r1v57 */
        /* JADX WARN: Type inference failed for: r1v58 */
        /* JADX WARN: Type inference failed for: r1v59 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.jvm.internal.L] */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.jvm.internal.L] */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1014
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27378j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27379k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27380l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27381m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27382n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f27383o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f27384p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Task f27385q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l f27386r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InputStream f27387s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ byte[] f27388t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ J f27389u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ OutputStream f27390v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f27391w;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public long f27392j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public double f27393k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f27394l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public /* synthetic */ Object f27395m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ InputStream f27396n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ byte[] f27397o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2157v f27398p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public final /* synthetic */ J f27399q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ OutputStream f27400r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l f27401s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Task f27402t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ long f27403u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InputStream inputStream, byte[] bArr, InterfaceC2157v interfaceC2157v, J j10, OutputStream outputStream, l lVar, Task task, long j11, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27396n = inputStream;
                this.f27397o = bArr;
                this.f27398p = interfaceC2157v;
                this.f27399q = j10;
                this.f27400r = outputStream;
                this.f27401s = lVar;
                this.f27402t = task;
                this.f27403u = j11;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                a aVar = new a(this.f27396n, this.f27397o, this.f27398p, this.f27399q, this.f27400r, this.f27401s, this.f27402t, this.f27403u, interfaceC4988e);
                aVar.f27395m = obj;
                return aVar;
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
            
                r14.f27398p.C(Q4.g0.complete);
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
            
                return fc.C4015H.f34254a;
             */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 226
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27404j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f27405k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ l f27406l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Task f27407m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2157v f27408n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar, Task task, InterfaceC2157v interfaceC2157v, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27406l = lVar;
                this.f27407m = task;
                this.f27408n = interfaceC2157v;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                b bVar = new b(this.f27406l, this.f27407m, this.f27408n, interfaceC4988e);
                bVar.f27405k = obj;
                return bVar;
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                M m10 = (M) this.f27405k;
                Object objF = C5046c.f();
                int i10 = this.f27404j;
                if (i10 != 0 && i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                do {
                    if (N.f(m10)) {
                        if (this.f27406l.q().h()) {
                            Log.w("TaskRunner", "Task " + this.f27407m.getTaskId() + " stopped");
                            this.f27408n.C(g0.failed);
                        } else if (com.bbflight.background_downloader.a.INSTANCE.u().contains(this.f27407m.getTaskId())) {
                            this.f27408n.C(g0.paused);
                        } else if (!this.f27406l.f27300i || this.f27406l.x()) {
                            this.f27405k = m10;
                            this.f27404j = 1;
                        } else {
                            this.f27408n.C(g0.enqueued);
                        }
                    }
                    return C4015H.f34254a;
                } while (X.a(100L, this) != objF);
                return objF;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Task task, l lVar, InputStream inputStream, byte[] bArr, J j10, OutputStream outputStream, long j11, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27385q = task;
            this.f27386r = lVar;
            this.f27387s = inputStream;
            this.f27388t = bArr;
            this.f27389u = j10;
            this.f27390v = outputStream;
            this.f27391w = j11;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            g gVar = new g(this.f27385q, this.f27386r, this.f27387s, this.f27388t, this.f27389u, this.f27390v, this.f27391w, interfaceC4988e);
            gVar.f27384p = obj;
            return gVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((g) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x013b A[PHI: r0 r3 r4 r5
          0x013b: PHI (r0v32 java.lang.Object) = (r0v25 java.lang.Object), (r0v25 java.lang.Object), (r0v33 java.lang.Object) binds: [B:31:0x0118, B:33:0x0137, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]
          0x013b: PHI (r3v16 Rd.v) = (r3v13 Rd.v), (r3v13 Rd.v), (r3v18 Rd.v) binds: [B:31:0x0118, B:33:0x0137, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]
          0x013b: PHI (r4v21 Rd.z0) = (r4v17 Rd.z0), (r4v17 Rd.z0), (r4v23 Rd.z0) binds: [B:31:0x0118, B:33:0x0137, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]
          0x013b: PHI (r5v19 Rd.z0) = (r5v15 Rd.z0), (r5v15 Rd.z0), (r5v21 Rd.z0) binds: [B:31:0x0118, B:33:0x0137, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01e4 A[PHI: r0 r3 r4 r5 r6
          0x01e4: PHI (r0v35 Q4.g0) = (r0v23 Q4.g0), (r0v23 Q4.g0), (r0v37 Q4.g0) binds: [B:65:0x01bb, B:67:0x01e0, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r3v19 java.lang.Exception) = (r3v10 java.lang.Exception), (r3v10 java.lang.Exception), (r3v21 java.lang.Exception) binds: [B:65:0x01bb, B:67:0x01e0, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r4v24 Rd.v) = (r4v14 Rd.v), (r4v14 Rd.v), (r4v26 Rd.v) binds: [B:65:0x01bb, B:67:0x01e0, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r5v22 Rd.z0) = (r5v12 Rd.z0), (r5v12 Rd.z0), (r5v24 Rd.z0) binds: [B:65:0x01bb, B:67:0x01e0, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r6v20 Rd.z0) = (r6v12 Rd.z0), (r6v12 Rd.z0), (r6v22 Rd.z0) binds: [B:65:0x01bb, B:67:0x01e0, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0237 A[PHI: r0 r3 r4 r5
          0x0237: PHI (r0v40 'th' java.lang.Throwable) = (r0v19 'th' java.lang.Throwable), (r0v19 'th' java.lang.Throwable), (r0v42 'th' java.lang.Throwable) binds: [B:76:0x0215, B:78:0x0234, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0237: PHI (r3v22 Rd.v) = (r3v9 Rd.v), (r3v9 Rd.v), (r3v24 Rd.v) binds: [B:76:0x0215, B:78:0x0234, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0237: PHI (r4v27 Rd.z0) = (r4v13 Rd.z0), (r4v13 Rd.z0), (r4v29 Rd.z0) binds: [B:76:0x0215, B:78:0x0234, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0237: PHI (r5v25 Rd.z0) = (r5v11 Rd.z0), (r5v11 Rd.z0), (r5v27 Rd.z0) binds: [B:76:0x0215, B:78:0x0234, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x025c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 626
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f27409j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f27410k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f27411l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f27412m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f27413n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f27414o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f27415p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f27416q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f27417r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f27418s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f27420u;

        public h(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27418s = obj;
            this.f27420u |= Integer.MIN_VALUE;
            return l.this.Y(0.0d, 0L, null, this);
        }
    }

    public l(b0 context) {
        AbstractC4862t.e(context, "context");
        this.f27292a = context;
        this.f27307p = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object G(com.bbflight.background_downloader.l r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.bbflight.background_downloader.l.e
            if (r0 == 0) goto L13
            r0 = r6
            com.bbflight.background_downloader.l$e r0 = (com.bbflight.background_downloader.l.e) r0
            int r1 = r0.f27368m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27368m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.l$e r0 = new com.bbflight.background_downloader.l$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27366k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f27368m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f27365j
            com.bbflight.background_downloader.l r5 = (com.bbflight.background_downloader.l) r5
            fc.AbstractC4036s.b(r6)
            goto L6c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            fc.AbstractC4036s.b(r6)
            Q4.b0 r6 = r5.f27292a
            android.content.Context r6 = r6.t()
            android.content.SharedPreferences r6 = T2.b.a(r6)
            java.lang.String r2 = "getDefaultSharedPreferences(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r6, r2)
            r5.M(r6)
            android.content.SharedPreferences r6 = r5.u()
            java.lang.String r2 = "com.bbflight.background_downloader.config.foregroundFileSize"
            r4 = -1
            int r6 = r6.getInt(r2, r4)
            r5.f27307p = r6
            Rd.I r6 = Rd.C2123d0.b()
            com.bbflight.background_downloader.l$f r2 = new com.bbflight.background_downloader.l$f
            r4 = 0
            r2.<init>(r4)
            r0.f27365j = r5
            r0.f27368m = r3
            java.lang.Object r6 = Rd.AbstractC2128g.g(r6, r2, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            r5.f27309r = r3
            fc.H r5 = fc.C4015H.f34254a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.G(com.bbflight.background_downloader.l, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object j(com.bbflight.background_downloader.l r8, java.net.HttpURLConnection r9, lc.InterfaceC4988e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.j(com.bbflight.background_downloader.l, java.net.HttpURLConnection, lc.e):java.lang.Object");
    }

    public final boolean A() {
        return this.f27292a.getTaskCanResume();
    }

    public final Y B() {
        return this.f27301j;
    }

    public final boolean C() {
        return this.f27295d;
    }

    public abstract Object D(HttpURLConnection httpURLConnection, InterfaceC4988e interfaceC4988e);

    public final String E(HttpURLConnection connection) throws IOException {
        AbstractC4862t.e(connection, "connection");
        try {
            InputStream errorStream = connection.getErrorStream();
            AbstractC4862t.d(errorStream, "getErrorStream(...)");
            return o.d(new BufferedReader(new InputStreamReader(errorStream, C1823c.f12394b), 8192));
        } catch (Exception e10) {
            Log.i("TaskRunner", "Could not read response error content from httpResponseCode " + connection.getResponseCode() + ": " + e10);
            return null;
        }
    }

    public Object F(InterfaceC4988e interfaceC4988e) {
        return G(this, interfaceC4988e);
    }

    public final void H(long j10) {
        this.f27294c = j10;
    }

    public final void I(boolean z10) {
        this.f27308q = z10;
    }

    public final void J(double d10) {
        this.f27292a.j(d10);
    }

    public final void K(NotificationConfig notificationConfig) {
        this.f27292a.u(notificationConfig);
    }

    public final void L(String str) {
        this.f27292a.m(str);
    }

    public final void M(SharedPreferences sharedPreferences) {
        AbstractC4862t.e(sharedPreferences, "<set-?>");
        this.f27310s = sharedPreferences;
    }

    public final void N(String str) {
        this.f27302k = str;
    }

    public final void O(Integer num) {
        this.f27304m = num;
    }

    public final void P(boolean z10) {
        this.f27295d = z10;
    }

    public final void Q(boolean z10) {
        this.f27292a.k(z10);
    }

    public final void R(long j10) {
        this.f27293b = j10;
    }

    public final void S(Task value) {
        AbstractC4862t.e(value, "value");
        this.f27292a.v(value);
    }

    public final void T(boolean z10) {
        this.f27292a.i(z10);
    }

    public final void U(Y y10) {
        this.f27301j = y10;
    }

    public final void V(Object obj) {
        EnumC1903x enumC1903x = EnumC1903x.general;
        if ((obj instanceof FileSystemException) || (obj instanceof IOException)) {
            enumC1903x = EnumC1903x.fileSystem;
        }
        if (obj instanceof SocketException) {
            enumC1903x = EnumC1903x.connection;
        }
        this.f27301j = new Y(enumC1903x, 0, obj.toString(), 2, null);
    }

    public boolean W(double d10, long j10) {
        double d11 = this.f27298g;
        if (d10 - d11 <= 0.02d || j10 <= this.f27299h) {
            return d10 > d11 && j10 > this.f27299h + ((long) 2000);
        }
        return true;
    }

    public final Object X(InputStream inputStream, OutputStream outputStream, long j10, Task task, InterfaceC4988e interfaceC4988e) {
        return AbstractC2128g.g(C2123d0.a(), new g(task, this, inputStream, new byte[8192], new J(), outputStream, j10, null), interfaceC4988e);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y(double r30, long r32, Q4.Task r34, lc.InterfaceC4988e r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.Y(double, long, Q4.X, lc.e):java.lang.Object");
    }

    public Object i(HttpURLConnection httpURLConnection, InterfaceC4988e interfaceC4988e) {
        return j(this, httpURLConnection, interfaceC4988e);
    }

    public boolean k() {
        return false;
    }

    public final void l(Task task, long j10) {
        AbstractC4862t.e(task, "task");
        Q(this.f27308q && j10 > (((long) this.f27307p) << 20));
        if (x()) {
            Log.i("TaskRunner", "TaskId " + task.getTaskId() + " will run in foreground");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(lc.InterfaceC4988e r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.l.m(lc.e):java.lang.Object");
    }

    public final void n(Map headers) {
        AbstractC4862t.e(headers, "headers");
        List list = (List) headers.get("content-type");
        String str = list != null ? (String) C4179C.h0(list) : null;
        if (str != null) {
            Od.k kVarD = Od.o.d(new Od.o("(.*);\\s*charset\\s*=(.*)"), str, 0, 2, null);
            if (kVarD == null) {
                this.f27305n = str;
                return;
            }
            C1829i c1829i = kVarD.d().get(1);
            this.f27305n = c1829i != null ? c1829i.a() : null;
            C1829i c1829i2 = kVarD.d().get(2);
            this.f27306o = c1829i2 != null ? c1829i2.a() : null;
        }
    }

    public final void o(Map headers) {
        AbstractC4862t.e(headers, "headers");
        LinkedHashMap linkedHashMap = new LinkedHashMap(P.e(headers.size()));
        for (Map.Entry entry : headers.entrySet()) {
            linkedHashMap.put(entry.getKey(), C4179C.q0((Iterable) entry.getValue(), null, null, null, 0, null, null, 63, null));
        }
        this.f27303l = linkedHashMap;
    }

    public final long p() {
        return this.f27294c;
    }

    public final b0 q() {
        return this.f27292a;
    }

    public final double r() {
        return this.f27292a.getNetworkSpeed();
    }

    public final NotificationConfig s() {
        return this.f27292a.getNotificationConfig();
    }

    public final String t() {
        return this.f27292a.getNotificationConfigJsonString();
    }

    public final SharedPreferences u() {
        SharedPreferences sharedPreferences = this.f27310s;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        AbstractC4862t.p("prefs");
        return null;
    }

    public final String v() {
        return this.f27302k;
    }

    public final Integer w() {
        return this.f27304m;
    }

    public final boolean x() {
        return this.f27292a.getRunInForeground();
    }

    public final long y() {
        return this.f27293b;
    }

    public final Task z() {
        return this.f27292a.p();
    }
}
