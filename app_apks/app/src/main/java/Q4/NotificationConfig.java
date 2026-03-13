package Q4;

import Q4.Notification;
import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4237h;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.E, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002\u001d!Bg\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b(\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010\u001c¨\u0006+"}, d2 = {"LQ4/E;", "", "", "seen0", "LQ4/c0;", "running", "complete", "error", "paused", "canceled", "", "progressBar", "tapOpensFile", "", "groupNotificationId", "Lge/s0;", "serializationConstructorMarker", "<init>", "(ILQ4/c0;LQ4/c0;LQ4/c0;LQ4/c0;LQ4/c0;ZZLjava/lang/String;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "i", "(LQ4/E;Lfe/d;Lee/e;)V", "toString", "()Ljava/lang/String;", "a", "LQ4/c0;", "g", "()LQ4/c0;", "b", "c", "d", "e", "f", "Z", "()Z", "h", "Ljava/lang/String;", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Notification running;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final Notification complete;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Notification error;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final Notification paused;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Notification canceled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean progressBar;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean tapOpensFile;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final String groupNotificationId;

    /* JADX INFO: renamed from: Q4.E$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13773a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13773a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.NotificationConfig", aVar, 8);
            c4240i0.o("running", false);
            c4240i0.o("complete", false);
            c4240i0.o("error", false);
            c4240i0.o("paused", false);
            c4240i0.o("canceled", false);
            c4240i0.o("progressBar", false);
            c4240i0.o("tapOpensFile", false);
            c4240i0.o("groupNotificationId", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NotificationConfig deserialize(InterfaceC4049e decoder) {
            boolean z10;
            Notification c0Var;
            Notification c0Var2;
            boolean z11;
            int i10;
            Notification c0Var3;
            Notification c0Var4;
            Notification c0Var5;
            String strV;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            int i11 = 7;
            if (interfaceC4047cA.q()) {
                Notification.a aVar = Notification.a.f13836a;
                Notification c0Var6 = (Notification) interfaceC4047cA.A(eVar, 0, aVar, null);
                Notification c0Var7 = (Notification) interfaceC4047cA.A(eVar, 1, aVar, null);
                Notification c0Var8 = (Notification) interfaceC4047cA.A(eVar, 2, aVar, null);
                Notification c0Var9 = (Notification) interfaceC4047cA.A(eVar, 3, aVar, null);
                Notification c0Var10 = (Notification) interfaceC4047cA.A(eVar, 4, aVar, null);
                boolean zL = interfaceC4047cA.l(eVar, 5);
                boolean zL2 = interfaceC4047cA.l(eVar, 6);
                c0Var = c0Var10;
                strV = interfaceC4047cA.v(eVar, 7);
                z10 = zL2;
                z11 = zL;
                c0Var2 = c0Var9;
                i10 = 255;
                c0Var5 = c0Var8;
                c0Var4 = c0Var7;
                c0Var3 = c0Var6;
            } else {
                boolean z12 = true;
                boolean zL3 = false;
                int i12 = 0;
                Notification c0Var11 = null;
                Notification c0Var12 = null;
                Notification c0Var13 = null;
                Notification c0Var14 = null;
                String strV2 = null;
                boolean zL4 = false;
                Notification c0Var15 = null;
                while (z12) {
                    int iJ = interfaceC4047cA.j(eVar);
                    switch (iJ) {
                        case -1:
                            z12 = false;
                            i11 = 7;
                            break;
                        case 0:
                            c0Var12 = (Notification) interfaceC4047cA.A(eVar, 0, Notification.a.f13836a, c0Var12);
                            i12 |= 1;
                            i11 = 7;
                            break;
                        case 1:
                            c0Var13 = (Notification) interfaceC4047cA.A(eVar, 1, Notification.a.f13836a, c0Var13);
                            i12 |= 2;
                            i11 = 7;
                            break;
                        case 2:
                            c0Var14 = (Notification) interfaceC4047cA.A(eVar, 2, Notification.a.f13836a, c0Var14);
                            i12 |= 4;
                            i11 = 7;
                            break;
                        case 3:
                            c0Var15 = (Notification) interfaceC4047cA.A(eVar, 3, Notification.a.f13836a, c0Var15);
                            i12 |= 8;
                            break;
                        case 4:
                            c0Var11 = (Notification) interfaceC4047cA.A(eVar, 4, Notification.a.f13836a, c0Var11);
                            i12 |= 16;
                            break;
                        case 5:
                            zL4 = interfaceC4047cA.l(eVar, 5);
                            i12 |= 32;
                            break;
                        case 6:
                            zL3 = interfaceC4047cA.l(eVar, 6);
                            i12 |= 64;
                            break;
                        case 7:
                            strV2 = interfaceC4047cA.v(eVar, i11);
                            i12 |= 128;
                            break;
                        default:
                            throw new ce.h(iJ);
                    }
                }
                z10 = zL3;
                c0Var = c0Var11;
                c0Var2 = c0Var15;
                z11 = zL4;
                i10 = i12;
                c0Var3 = c0Var12;
                c0Var4 = c0Var13;
                c0Var5 = c0Var14;
                strV = strV2;
            }
            interfaceC4047cA.c(eVar);
            return new NotificationConfig(i10, c0Var3, c0Var4, c0Var5, c0Var2, c0Var, z11, z10, strV, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            Notification.a aVar = Notification.a.f13836a;
            ce.b bVarP = AbstractC3918a.p(aVar);
            ce.b bVarP2 = AbstractC3918a.p(aVar);
            ce.b bVarP3 = AbstractC3918a.p(aVar);
            ce.b bVarP4 = AbstractC3918a.p(aVar);
            ce.b bVarP5 = AbstractC3918a.p(aVar);
            C4237h c4237h = C4237h.f35705a;
            return new ce.b[]{bVarP, bVarP2, bVarP3, bVarP4, bVarP5, c4237h, c4237h, w0.f35762a};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, NotificationConfig value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            NotificationConfig.i(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.E$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13773a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ NotificationConfig(int i10, Notification c0Var, Notification c0Var2, Notification c0Var3, Notification c0Var4, Notification c0Var5, boolean z10, boolean z11, String str, ge.s0 s0Var) {
        if (255 != (i10 & 255)) {
            AbstractC4232e0.a(i10, 255, a.f13773a.getDescriptor());
        }
        this.running = c0Var;
        this.complete = c0Var2;
        this.error = c0Var3;
        this.paused = c0Var4;
        this.canceled = c0Var5;
        this.progressBar = z10;
        this.tapOpensFile = z11;
        this.groupNotificationId = str;
    }

    public static final /* synthetic */ void i(NotificationConfig self, InterfaceC4048d output, ee.e serialDesc) {
        Notification.a aVar = Notification.a.f13836a;
        output.l(serialDesc, 0, aVar, self.running);
        output.l(serialDesc, 1, aVar, self.complete);
        output.l(serialDesc, 2, aVar, self.error);
        output.l(serialDesc, 3, aVar, self.paused);
        output.l(serialDesc, 4, aVar, self.canceled);
        output.n(serialDesc, 5, self.progressBar);
        output.n(serialDesc, 6, self.tapOpensFile);
        output.e(serialDesc, 7, self.groupNotificationId);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Notification getCanceled() {
        return this.canceled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Notification getComplete() {
        return this.complete;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Notification getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGroupNotificationId() {
        return this.groupNotificationId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Notification getPaused() {
        return this.paused;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Notification getRunning() {
        return this.running;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getTapOpensFile() {
        return this.tapOpensFile;
    }

    public String toString() {
        return "NotificationConfig(running=" + this.running + ", complete=" + this.complete + ", error=" + this.error + ", paused=" + this.paused + ", progressBar=" + this.progressBar + ", tapOpensFile=" + this.tapOpensFile + ", groupNotificationId=" + this.groupNotificationId + ")";
    }
}
