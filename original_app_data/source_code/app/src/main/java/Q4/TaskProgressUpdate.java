package Q4;

import Q4.Task;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4240i0;
import ge.C4255t;
import ge.InterfaceC4215D;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.e0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002\u0015#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"LQ4/e0;", "", "LQ4/X;", "task", "", "progress", "", "expectedFileSize", "<init>", "(LQ4/X;DJ)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILQ4/X;DJLge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "a", "(LQ4/e0;Lfe/d;Lee/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "LQ4/X;", "getTask", "()LQ4/X;", "b", "D", "getProgress", "()D", "c", "J", "getExpectedFileSize", "()J", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaskProgressUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Task task;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final double progress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long expectedFileSize;

    /* JADX INFO: renamed from: Q4.e0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13856a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13856a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.TaskProgressUpdate", aVar, 3);
            c4240i0.o("task", false);
            c4240i0.o("progress", false);
            c4240i0.o("expectedFileSize", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final TaskProgressUpdate deserialize(InterfaceC4049e decoder) {
            int i10;
            Task task;
            double dB;
            long jE;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            Task task2 = null;
            if (interfaceC4047cA.q()) {
                task = (Task) interfaceC4047cA.H(eVar, 0, Task.a.f13827a, null);
                i10 = 7;
                dB = interfaceC4047cA.B(eVar, 1);
                jE = interfaceC4047cA.e(eVar, 2);
            } else {
                double dB2 = 0.0d;
                long jE2 = 0;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        task2 = (Task) interfaceC4047cA.H(eVar, 0, Task.a.f13827a, task2);
                        i11 |= 1;
                    } else if (iJ == 1) {
                        dB2 = interfaceC4047cA.B(eVar, 1);
                        i11 |= 2;
                    } else {
                        if (iJ != 2) {
                            throw new ce.h(iJ);
                        }
                        jE2 = interfaceC4047cA.e(eVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                task = task2;
                dB = dB2;
                jE = jE2;
            }
            interfaceC4047cA.c(eVar);
            return new TaskProgressUpdate(i10, task, dB, jE, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            return new ce.b[]{Task.a.f13827a, C4255t.f35744a, ge.Q.f35675a};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, TaskProgressUpdate value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            TaskProgressUpdate.a(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.e0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13856a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ TaskProgressUpdate(int i10, Task task, double d10, long j10, ge.s0 s0Var) {
        if (7 != (i10 & 7)) {
            AbstractC4232e0.a(i10, 7, a.f13856a.getDescriptor());
        }
        this.task = task;
        this.progress = d10;
        this.expectedFileSize = j10;
    }

    public static final /* synthetic */ void a(TaskProgressUpdate self, InterfaceC4048d output, ee.e serialDesc) {
        output.E(serialDesc, 0, Task.a.f13827a, self.task);
        output.v(serialDesc, 1, self.progress);
        output.t(serialDesc, 2, self.expectedFileSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskProgressUpdate)) {
            return false;
        }
        TaskProgressUpdate taskProgressUpdate = (TaskProgressUpdate) other;
        return AbstractC4862t.a(this.task, taskProgressUpdate.task) && Double.compare(this.progress, taskProgressUpdate.progress) == 0 && this.expectedFileSize == taskProgressUpdate.expectedFileSize;
    }

    public int hashCode() {
        return (((this.task.hashCode() * 31) + Double.hashCode(this.progress)) * 31) + Long.hashCode(this.expectedFileSize);
    }

    public String toString() {
        return "TaskProgressUpdate(task=" + this.task + ", progress=" + this.progress + ", expectedFileSize=" + this.expectedFileSize + ")";
    }

    public TaskProgressUpdate(Task task, double d10, long j10) {
        AbstractC4862t.e(task, "task");
        this.task = task;
        this.progress = d10;
        this.expectedFileSize = j10;
    }
}
