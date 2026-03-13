package Q4;

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

/* JADX INFO: renamed from: Q4.q, reason: case insensitive filesystem and from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0014 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"LQ4/q;", "", "", "parentTaskId", "", "from", "to", "<init>", "(Ljava/lang/String;JJ)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/String;JJLge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "a", "(LQ4/q;Lfe/d;Lee/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getParentTaskId", "b", "J", "getFrom", "()J", "c", "getTo", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChunkTaskMetaData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String parentTaskId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final long from;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long to;

    /* JADX INFO: renamed from: Q4.q$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13893a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13893a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.ChunkTaskMetaData", aVar, 3);
            c4240i0.o("parentTaskId", false);
            c4240i0.o("from", false);
            c4240i0.o("to", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ChunkTaskMetaData deserialize(InterfaceC4049e decoder) {
            String strV;
            int i10;
            long jE;
            long jE2;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            if (interfaceC4047cA.q()) {
                strV = interfaceC4047cA.v(eVar, 0);
                i10 = 7;
                jE = interfaceC4047cA.e(eVar, 1);
                jE2 = interfaceC4047cA.e(eVar, 2);
            } else {
                strV = null;
                boolean z10 = true;
                long jE3 = 0;
                int i11 = 0;
                long jE4 = 0;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        strV = interfaceC4047cA.v(eVar, 0);
                        i11 |= 1;
                    } else if (iJ == 1) {
                        jE4 = interfaceC4047cA.e(eVar, 1);
                        i11 |= 2;
                    } else {
                        if (iJ != 2) {
                            throw new ce.h(iJ);
                        }
                        jE3 = interfaceC4047cA.e(eVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                jE = jE4;
                jE2 = jE3;
            }
            String str = strV;
            interfaceC4047cA.c(eVar);
            return new ChunkTaskMetaData(i10, str, jE, jE2, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            ge.Q q10 = ge.Q.f35675a;
            return new ce.b[]{w0.f35762a, q10, q10};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, ChunkTaskMetaData value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            ChunkTaskMetaData.a(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.q$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13893a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ ChunkTaskMetaData(int i10, String str, long j10, long j11, ge.s0 s0Var) {
        if (7 != (i10 & 7)) {
            AbstractC4232e0.a(i10, 7, a.f13893a.getDescriptor());
        }
        this.parentTaskId = str;
        this.from = j10;
        this.to = j11;
    }

    public static final /* synthetic */ void a(ChunkTaskMetaData self, InterfaceC4048d output, ee.e serialDesc) {
        output.e(serialDesc, 0, self.parentTaskId);
        output.t(serialDesc, 1, self.from);
        output.t(serialDesc, 2, self.to);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChunkTaskMetaData)) {
            return false;
        }
        ChunkTaskMetaData chunkTaskMetaData = (ChunkTaskMetaData) other;
        return AbstractC4862t.a(this.parentTaskId, chunkTaskMetaData.parentTaskId) && this.from == chunkTaskMetaData.from && this.to == chunkTaskMetaData.to;
    }

    public int hashCode() {
        return (((this.parentTaskId.hashCode() * 31) + Long.hashCode(this.from)) * 31) + Long.hashCode(this.to);
    }

    public String toString() {
        return "ChunkTaskMetaData(parentTaskId=" + this.parentTaskId + ", from=" + this.from + ", to=" + this.to + ")";
    }

    public ChunkTaskMetaData(String parentTaskId, long j10, long j11) {
        AbstractC4862t.e(parentTaskId, "parentTaskId");
        this.parentTaskId = parentTaskId;
        this.from = j10;
        this.to = j11;
    }
}
