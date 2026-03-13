package Q4;

import Q4.Task;
import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.w0;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.O, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002 $B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b$\u0010\u0019¨\u0006*"}, d2 = {"LQ4/O;", "", "LQ4/X;", "task", "", "data", "", "requiredStartByte", "eTag", "<init>", "(LQ4/X;Ljava/lang/String;JLjava/lang/String;)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILQ4/X;Ljava/lang/String;JLjava/lang/String;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "e", "(LQ4/O;Lfe/d;Lee/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "LQ4/X;", "d", "()LQ4/X;", "b", "Ljava/lang/String;", "c", "J", "()J", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResumeData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Task task;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long requiredStartByte;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String eTag;

    /* JADX INFO: renamed from: Q4.O$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13794a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13794a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.ResumeData", aVar, 4);
            c4240i0.o("task", false);
            c4240i0.o("data", false);
            c4240i0.o("requiredStartByte", false);
            c4240i0.o("eTag", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ResumeData deserialize(InterfaceC4049e decoder) {
            int i10;
            Task task;
            String str;
            String str2;
            long j10;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            Task task2 = null;
            if (interfaceC4047cA.q()) {
                Task task3 = (Task) interfaceC4047cA.H(eVar, 0, Task.a.f13827a, null);
                String strV = interfaceC4047cA.v(eVar, 1);
                long jE = interfaceC4047cA.e(eVar, 2);
                task = task3;
                str2 = (String) interfaceC4047cA.A(eVar, 3, w0.f35762a, null);
                i10 = 15;
                str = strV;
                j10 = jE;
            } else {
                boolean z10 = true;
                int i11 = 0;
                long jE2 = 0;
                String strV2 = null;
                String str3 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        task2 = (Task) interfaceC4047cA.H(eVar, 0, Task.a.f13827a, task2);
                        i11 |= 1;
                    } else if (iJ == 1) {
                        strV2 = interfaceC4047cA.v(eVar, 1);
                        i11 |= 2;
                    } else if (iJ == 2) {
                        jE2 = interfaceC4047cA.e(eVar, 2);
                        i11 |= 4;
                    } else {
                        if (iJ != 3) {
                            throw new ce.h(iJ);
                        }
                        str3 = (String) interfaceC4047cA.A(eVar, 3, w0.f35762a, str3);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                task = task2;
                str = strV2;
                str2 = str3;
                j10 = jE2;
            }
            interfaceC4047cA.c(eVar);
            return new ResumeData(i10, task, str, j10, str2, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            w0 w0Var = w0.f35762a;
            return new ce.b[]{Task.a.f13827a, w0Var, ge.Q.f35675a, AbstractC3918a.p(w0Var)};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, ResumeData value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            ResumeData.e(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.O$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13794a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ ResumeData(int i10, Task task, String str, long j10, String str2, ge.s0 s0Var) {
        if (15 != (i10 & 15)) {
            AbstractC4232e0.a(i10, 15, a.f13794a.getDescriptor());
        }
        this.task = task;
        this.data = str;
        this.requiredStartByte = j10;
        this.eTag = str2;
    }

    public static final /* synthetic */ void e(ResumeData self, InterfaceC4048d output, ee.e serialDesc) {
        output.E(serialDesc, 0, Task.a.f13827a, self.task);
        output.e(serialDesc, 1, self.data);
        output.t(serialDesc, 2, self.requiredStartByte);
        output.l(serialDesc, 3, w0.f35762a, self.eTag);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getETag() {
        return this.eTag;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getRequiredStartByte() {
        return this.requiredStartByte;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Task getTask() {
        return this.task;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumeData)) {
            return false;
        }
        ResumeData resumeData = (ResumeData) other;
        return AbstractC4862t.a(this.task, resumeData.task) && AbstractC4862t.a(this.data, resumeData.data) && this.requiredStartByte == resumeData.requiredStartByte && AbstractC4862t.a(this.eTag, resumeData.eTag);
    }

    public int hashCode() {
        int iHashCode = ((((this.task.hashCode() * 31) + this.data.hashCode()) * 31) + Long.hashCode(this.requiredStartByte)) * 31;
        String str = this.eTag;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ResumeData(task=" + this.task + ", data=" + this.data + ", requiredStartByte=" + this.requiredStartByte + ", eTag=" + this.eTag + ")";
    }

    public ResumeData(Task task, String data, long j10, String str) {
        AbstractC4862t.e(task, "task");
        AbstractC4862t.e(data, "data");
        this.task = task;
        this.data = data;
        this.requiredStartByte = j10;
        this.eTag = str;
    }
}
