package Q4;

import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.w0;
import io.sentry.SentryLogEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.c0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0015\u0017B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, d2 = {"LQ4/c0;", "", "", "seen0", "", "title", SentryLogEvent.JsonKeys.BODY, "Lge/s0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "c", "(LQ4/c0;Lfe/d;Lee/e;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Notification {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String body;

    /* JADX INFO: renamed from: Q4.c0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13836a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13836a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.TaskNotification", aVar, 2);
            c4240i0.o("title", false);
            c4240i0.o(SentryLogEvent.JsonKeys.BODY, false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Notification deserialize(InterfaceC4049e decoder) {
            String strV;
            String strV2;
            int i10;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            ge.s0 s0Var = null;
            if (interfaceC4047cA.q()) {
                strV = interfaceC4047cA.v(eVar, 0);
                strV2 = interfaceC4047cA.v(eVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strV = null;
                String strV3 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        strV = interfaceC4047cA.v(eVar, 0);
                        i11 |= 1;
                    } else {
                        if (iJ != 1) {
                            throw new ce.h(iJ);
                        }
                        strV3 = interfaceC4047cA.v(eVar, 1);
                        i11 |= 2;
                    }
                }
                strV2 = strV3;
                i10 = i11;
            }
            interfaceC4047cA.c(eVar);
            return new Notification(i10, strV, strV2, s0Var);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            w0 w0Var = w0.f35762a;
            return new ce.b[]{w0Var, w0Var};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, Notification value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            Notification.c(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.c0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13836a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ Notification(int i10, String str, String str2, ge.s0 s0Var) {
        if (3 != (i10 & 3)) {
            AbstractC4232e0.a(i10, 3, a.f13836a.getDescriptor());
        }
        this.title = str;
        this.body = str2;
    }

    public static final /* synthetic */ void c(Notification self, InterfaceC4048d output, ee.e serialDesc) {
        output.e(serialDesc, 0, self.title);
        output.e(serialDesc, 1, self.body);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return "Notification(title='" + this.title + "', body='" + this.body + "')";
    }
}
