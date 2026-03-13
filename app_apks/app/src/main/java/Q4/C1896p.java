package Q4;

import Q4.Task;
import ce.InterfaceC3118a;
import fc.AbstractC4040w;
import fc.C4029l;
import fc.C4032o;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4240i0;
import ge.C4255t;
import ge.InterfaceC4215D;
import ge.w0;
import he.AbstractC4304b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: Q4.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 72\u00020\u0001:\u0002$\"BM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0014Be\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000f\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010/\u001a\u0004\b-\u00100\"\u0004\b1\u00102R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u00103\u001a\u0004\b*\u00104\"\u0004\b5\u00106¨\u00068"}, d2 = {"LQ4/p;", "", "", "parentTaskId", "url", "filename", "LQ4/X;", "task", "", "fromByte", "toByte", "LQ4/g0;", "status", "", "progress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LQ4/X;JJLQ4/g0;D)V", "parentTask", "from", "to", "(LQ4/X;Ljava/lang/String;Ljava/lang/String;JJ)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LQ4/X;JJLQ4/g0;DLge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "k", "(LQ4/p;Lfe/d;Lee/e;)V", "a", "Ljava/lang/String;", "b", "c", "d", "LQ4/X;", "g", "()LQ4/X;", "e", "J", "()J", "f", "h", "LQ4/g0;", "()LQ4/g0;", "j", "(LQ4/g0;)V", "D", "()D", "i", "(D)V", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C1896p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC4028k[] f13879i = {null, null, null, null, null, null, C4029l.a(EnumC4031n.PUBLICATION, new InterfaceC6082a() { // from class: Q4.o
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return C1896p.b();
        }
    }), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String parentTaskId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String filename;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Task task;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long fromByte;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long toByte;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public g0 status;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public double progress;

    /* JADX INFO: renamed from: Q4.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13888a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13888a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.Chunk", aVar, 8);
            c4240i0.o("parentTaskId", false);
            c4240i0.o("url", false);
            c4240i0.o("filename", false);
            c4240i0.o("task", false);
            c4240i0.o("fromByte", false);
            c4240i0.o("toByte", false);
            c4240i0.o("status", true);
            c4240i0.o("progress", true);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C1896p deserialize(InterfaceC4049e decoder) {
            int i10;
            g0 g0Var;
            Task task;
            String str;
            String str2;
            String str3;
            double dB;
            long j10;
            long j11;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            InterfaceC4028k[] interfaceC4028kArr = C1896p.f13879i;
            String strV = null;
            if (interfaceC4047cA.q()) {
                String strV2 = interfaceC4047cA.v(eVar, 0);
                String strV3 = interfaceC4047cA.v(eVar, 1);
                String strV4 = interfaceC4047cA.v(eVar, 2);
                Task task2 = (Task) interfaceC4047cA.H(eVar, 3, Task.a.f13827a, null);
                long jE = interfaceC4047cA.e(eVar, 4);
                long jE2 = interfaceC4047cA.e(eVar, 5);
                g0Var = (g0) interfaceC4047cA.H(eVar, 6, (InterfaceC3118a) interfaceC4028kArr[6].getValue(), null);
                str = strV2;
                dB = interfaceC4047cA.B(eVar, 7);
                task = task2;
                i10 = 255;
                str3 = strV4;
                str2 = strV3;
                j10 = jE;
                j11 = jE2;
            } else {
                double dB2 = 0.0d;
                boolean z10 = true;
                int i11 = 0;
                g0 g0Var2 = null;
                Task task3 = null;
                long jE3 = 0;
                long jE4 = 0;
                String strV5 = null;
                String strV6 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    switch (iJ) {
                        case -1:
                            z10 = false;
                            break;
                        case 0:
                            i11 |= 1;
                            strV = interfaceC4047cA.v(eVar, 0);
                            continue;
                        case 1:
                            i11 |= 2;
                            strV5 = interfaceC4047cA.v(eVar, 1);
                            continue;
                        case 2:
                            strV6 = interfaceC4047cA.v(eVar, 2);
                            i11 |= 4;
                            continue;
                        case 3:
                            task3 = (Task) interfaceC4047cA.H(eVar, 3, Task.a.f13827a, task3);
                            i11 |= 8;
                            break;
                        case 4:
                            jE3 = interfaceC4047cA.e(eVar, 4);
                            i11 |= 16;
                            break;
                        case 5:
                            jE4 = interfaceC4047cA.e(eVar, 5);
                            i11 |= 32;
                            break;
                        case 6:
                            g0Var2 = (g0) interfaceC4047cA.H(eVar, 6, (InterfaceC3118a) interfaceC4028kArr[6].getValue(), g0Var2);
                            i11 |= 64;
                            break;
                        case 7:
                            dB2 = interfaceC4047cA.B(eVar, 7);
                            i11 |= 128;
                            break;
                        default:
                            throw new ce.h(iJ);
                    }
                }
                i10 = i11;
                g0Var = g0Var2;
                task = task3;
                str = strV;
                str2 = strV5;
                str3 = strV6;
                dB = dB2;
                j10 = jE3;
                j11 = jE4;
            }
            interfaceC4047cA.c(eVar);
            return new C1896p(i10, str, str2, str3, task, j10, j11, g0Var, dB, (ge.s0) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            InterfaceC4028k[] interfaceC4028kArr = C1896p.f13879i;
            w0 w0Var = w0.f35762a;
            ge.Q q10 = ge.Q.f35675a;
            return new ce.b[]{w0Var, w0Var, w0Var, Task.a.f13827a, q10, q10, interfaceC4028kArr[6].getValue(), C4255t.f35744a};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, C1896p value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            C1896p.k(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.p$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {

        /* JADX INFO: renamed from: Q4.p$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13889a;

            static {
                int[] iArr = new int[o0.values().length];
                try {
                    iArr[o0.none.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o0.status.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[o0.progress.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[o0.statusAndProgress.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f13889a = iArr;
            }
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final o0 a(Task parentTask) {
            AbstractC4862t.e(parentTask, "parentTask");
            int i10 = a.f13889a[parentTask.getUpdates().ordinal()];
            if (i10 == 1 || i10 == 2) {
                return o0.status;
            }
            if (i10 == 3 || i10 == 4) {
                return o0.statusAndProgress;
            }
            throw new C4032o();
        }

        public final ce.b serializer() {
            return a.f13888a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ C1896p(int i10, String str, String str2, String str3, Task task, long j10, long j11, g0 g0Var, double d10, ge.s0 s0Var) {
        if (63 != (i10 & 63)) {
            AbstractC4232e0.a(i10, 63, a.f13888a.getDescriptor());
        }
        this.parentTaskId = str;
        this.url = str2;
        this.filename = str3;
        this.task = task;
        this.fromByte = j10;
        this.toByte = j11;
        if ((i10 & 64) == 0) {
            this.status = g0.enqueued;
        } else {
            this.status = g0Var;
        }
        if ((i10 & 128) == 0) {
            this.progress = 0.0d;
        } else {
            this.progress = d10;
        }
    }

    public static final /* synthetic */ ce.b b() {
        return g0.INSTANCE.serializer();
    }

    public static final /* synthetic */ void k(C1896p self, InterfaceC4048d output, ee.e serialDesc) {
        InterfaceC4028k[] interfaceC4028kArr = f13879i;
        output.e(serialDesc, 0, self.parentTaskId);
        output.e(serialDesc, 1, self.url);
        output.e(serialDesc, 2, self.filename);
        output.E(serialDesc, 3, Task.a.f13827a, self.task);
        output.t(serialDesc, 4, self.fromByte);
        output.t(serialDesc, 5, self.toByte);
        if (output.i(serialDesc, 6) || self.status != g0.enqueued) {
            output.E(serialDesc, 6, (ce.g) interfaceC4028kArr[6].getValue(), self.status);
        }
        if (!output.i(serialDesc, 7) && Double.compare(self.progress, 0.0d) == 0) {
            return;
        }
        output.v(serialDesc, 7, self.progress);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getFromByte() {
        return this.fromByte;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g0 getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Task getTask() {
        return this.task;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getToByte() {
        return this.toByte;
    }

    public final void i(double d10) {
        this.progress = d10;
    }

    public final void j(g0 g0Var) {
        AbstractC4862t.e(g0Var, "<set-?>");
        this.status = g0Var;
    }

    public C1896p(String str, String str2, String str3, Task task, long j10, long j11, g0 g0Var, double d10) {
        this.parentTaskId = str;
        this.url = str2;
        this.filename = str3;
        this.task = task;
        this.fromByte = j10;
        this.toByte = j11;
        this.status = g0Var;
        this.progress = d10;
    }

    public /* synthetic */ C1896p(String str, String str2, String str3, Task task, long j10, long j11, g0 g0Var, double d10, int i10, AbstractC4854k abstractC4854k) {
        this(str, str2, str3, task, j10, j11, (i10 & 64) != 0 ? g0.enqueued : g0Var, (i10 & 128) != 0 ? 0.0d : d10);
    }

    public C1896p(Task parentTask, String url, String filename, long j10, long j11) {
        AbstractC4862t.e(parentTask, "parentTask");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(filename, "filename");
        String taskId = parentTask.getTaskId();
        Map mapP = gc.Q.p(parentTask.getHeaders(), gc.P.f(AbstractC4040w.a("Range", "bytes=" + j10 + "-" + j11)));
        EnumC1889i enumC1889i = EnumC1889i.applicationDocuments;
        o0 o0VarA = INSTANCE.a(parentTask);
        int retries = parentTask.getRetries();
        int retries2 = parentTask.getRetries();
        boolean requiresWiFi = parentTask.getRequiresWiFi();
        boolean allowPause = parentTask.getAllowPause();
        int priority = parentTask.getPriority();
        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
        ChunkTaskMetaData chunkTaskMetaData = new ChunkTaskMetaData(parentTask.getTaskId(), j10, j11);
        aVar.d();
        this(taskId, url, filename, new Task((String) null, url, (List) null, filename, mapP, "GET", 1, (String) null, "", "", (Map) null, (String) null, enumC1889i, "chunk", o0VarA, requiresWiFi, retries, retries2, allowPause, priority, aVar.b(ChunkTaskMetaData.INSTANCE.serializer(), chunkTaskMetaData), (String) null, 0L, (d0) null, "DownloadTask", 14683141, (AbstractC4854k) null), j10, j11, (g0) null, 0.0d, 192, (AbstractC4854k) null);
    }
}
