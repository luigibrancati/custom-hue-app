package p9;

import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4221J;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.s0;
import ge.w0;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p9.v, reason: case insensitive filesystem and from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001c\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0015¨\u0006!"}, d2 = {"Lp9/v;", "", "", "pid", "", DebugImage.JsonKeys.UUID, "<init>", "(ILjava/lang/String;)V", "seen0", "Lge/s0;", "serializationConstructorMarker", "(IILjava/lang/String;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "c", "(Lp9/v;Lfe/d;Lee/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProcessData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final int pid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String uuid;

    /* JADX INFO: renamed from: p9.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42500a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f42500a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.google.firebase.sessions.ProcessData", aVar, 2);
            c4240i0.o("pid", false);
            c4240i0.o(DebugImage.JsonKeys.UUID, false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return InterfaceC4215D.a.a(this);
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ProcessData deserialize(InterfaceC4049e decoder) {
            int I10;
            String strV;
            int i10;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            s0 s0Var = null;
            if (interfaceC4047cA.q()) {
                I10 = interfaceC4047cA.I(eVar, 0);
                strV = interfaceC4047cA.v(eVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                I10 = 0;
                int i11 = 0;
                String strV2 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        I10 = interfaceC4047cA.I(eVar, 0);
                        i11 |= 1;
                    } else {
                        if (iJ != 1) {
                            throw new ce.h(iJ);
                        }
                        strV2 = interfaceC4047cA.v(eVar, 1);
                        i11 |= 2;
                    }
                }
                strV = strV2;
                i10 = i11;
            }
            interfaceC4047cA.c(eVar);
            return new ProcessData(i10, I10, strV, s0Var);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            return new ce.b[]{C4221J.f35658a, w0.f35762a};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, ProcessData value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            ProcessData.c(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: p9.v$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f42500a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ ProcessData(int i10, int i11, String str, s0 s0Var) {
        if (3 != (i10 & 3)) {
            AbstractC4232e0.a(i10, 3, a.f42500a.getDescriptor());
        }
        this.pid = i11;
        this.uuid = str;
    }

    public static final /* synthetic */ void c(ProcessData self, InterfaceC4048d output, ee.e serialDesc) {
        output.F(serialDesc, 0, self.pid);
        output.e(serialDesc, 1, self.uuid);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) other;
        return this.pid == processData.pid && AbstractC4862t.a(this.uuid, processData.uuid);
    }

    public int hashCode() {
        return (Integer.hashCode(this.pid) * 31) + this.uuid.hashCode();
    }

    public String toString() {
        return "ProcessData(pid=" + this.pid + ", uuid=" + this.uuid + ')';
    }

    public ProcessData(int i10, String uuid) {
        AbstractC4862t.e(uuid, "uuid");
        this.pid = i10;
        this.uuid = uuid;
    }
}
