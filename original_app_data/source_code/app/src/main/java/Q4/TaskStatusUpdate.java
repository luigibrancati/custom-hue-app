package Q4;

import Q4.Task;
import ce.InterfaceC3118a;
import de.AbstractC3918a;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import gc.C4206t;
import ge.AbstractC4232e0;
import ge.C4221J;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.w0;
import io.sentry.protocol.Request;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: Q4.m0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002&*B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011Bw\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b=\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b>\u0010\u001fR\u001b\u0010A\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010?8F¢\u0006\u0006\u001a\u0004\b9\u0010@¨\u0006C"}, d2 = {"LQ4/m0;", "", "LQ4/X;", "task", "LQ4/g0;", "taskStatus", "LQ4/Y;", "exception", "", "responseBody", "", "responseStatusCode", "", "responseHeaders", "mimeType", "charSet", "<init>", "(LQ4/X;LQ4/g0;LQ4/Y;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILQ4/X;LQ4/g0;LQ4/Y;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "l", "(LQ4/m0;Lfe/d;Lee/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "LQ4/X;", "getTask", "()LQ4/X;", "b", "LQ4/g0;", "k", "()LQ4/g0;", "c", "LQ4/Y;", "g", "()LQ4/Y;", "d", "Ljava/lang/String;", "h", "e", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "f", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "getMimeType", "getCharSet", "", "()Ljava/util/List;", "argList", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaskStatusUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC4028k[] f13867i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Task task;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final g0 taskStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Y exception;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String responseBody;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer responseStatusCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map responseHeaders;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final String mimeType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final String charSet;

    /* JADX INFO: renamed from: Q4.m0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13876a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13876a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.TaskStatusUpdate", aVar, 8);
            c4240i0.o("task", false);
            c4240i0.o("taskStatus", false);
            c4240i0.o("exception", false);
            c4240i0.o("responseBody", false);
            c4240i0.o("responseStatusCode", false);
            c4240i0.o("responseHeaders", false);
            c4240i0.o("mimeType", false);
            c4240i0.o("charSet", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final TaskStatusUpdate deserialize(InterfaceC4049e decoder) {
            int i10;
            String str;
            String str2;
            Map map;
            Integer num;
            Task task;
            g0 g0Var;
            Y y10;
            String str3;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            InterfaceC4028k[] interfaceC4028kArr = TaskStatusUpdate.f13867i;
            int i11 = 7;
            Task task2 = null;
            if (interfaceC4047cA.q()) {
                Task task3 = (Task) interfaceC4047cA.H(eVar, 0, Task.a.f13827a, null);
                g0 g0Var2 = (g0) interfaceC4047cA.H(eVar, 1, (InterfaceC3118a) interfaceC4028kArr[1].getValue(), null);
                Y y11 = (Y) interfaceC4047cA.A(eVar, 2, a0.f13831a, null);
                w0 w0Var = w0.f35762a;
                String str4 = (String) interfaceC4047cA.A(eVar, 3, w0Var, null);
                Integer num2 = (Integer) interfaceC4047cA.A(eVar, 4, C4221J.f35658a, null);
                Map map2 = (Map) interfaceC4047cA.A(eVar, 5, (InterfaceC3118a) interfaceC4028kArr[5].getValue(), null);
                String str5 = (String) interfaceC4047cA.A(eVar, 6, w0Var, null);
                map = map2;
                task = task3;
                str = (String) interfaceC4047cA.A(eVar, 7, w0Var, null);
                str2 = str5;
                str3 = str4;
                num = num2;
                y10 = y11;
                i10 = 255;
                g0Var = g0Var2;
            } else {
                int i12 = 1;
                boolean z10 = true;
                int i13 = 0;
                String str6 = null;
                String str7 = null;
                Map map3 = null;
                Integer num3 = null;
                g0 g0Var3 = null;
                Y y12 = null;
                String str8 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    switch (iJ) {
                        case -1:
                            z10 = false;
                            i12 = 1;
                            i11 = 7;
                            break;
                        case 0:
                            task2 = (Task) interfaceC4047cA.H(eVar, 0, Task.a.f13827a, task2);
                            i13 |= 1;
                            i12 = 1;
                            i11 = 7;
                            break;
                        case 1:
                            g0Var3 = (g0) interfaceC4047cA.H(eVar, i12, (InterfaceC3118a) interfaceC4028kArr[i12].getValue(), g0Var3);
                            i13 |= 2;
                            i11 = 7;
                            break;
                        case 2:
                            y12 = (Y) interfaceC4047cA.A(eVar, 2, a0.f13831a, y12);
                            i13 |= 4;
                            i11 = 7;
                            break;
                        case 3:
                            str8 = (String) interfaceC4047cA.A(eVar, 3, w0.f35762a, str8);
                            i13 |= 8;
                            i11 = 7;
                            break;
                        case 4:
                            num3 = (Integer) interfaceC4047cA.A(eVar, 4, C4221J.f35658a, num3);
                            i13 |= 16;
                            i11 = 7;
                            break;
                        case 5:
                            map3 = (Map) interfaceC4047cA.A(eVar, 5, (InterfaceC3118a) interfaceC4028kArr[5].getValue(), map3);
                            i13 |= 32;
                            break;
                        case 6:
                            str7 = (String) interfaceC4047cA.A(eVar, 6, w0.f35762a, str7);
                            i13 |= 64;
                            break;
                        case 7:
                            str6 = (String) interfaceC4047cA.A(eVar, i11, w0.f35762a, str6);
                            i13 |= 128;
                            break;
                        default:
                            throw new ce.h(iJ);
                    }
                }
                i10 = i13;
                str = str6;
                str2 = str7;
                map = map3;
                num = num3;
                task = task2;
                g0Var = g0Var3;
                y10 = y12;
                str3 = str8;
            }
            interfaceC4047cA.c(eVar);
            return new TaskStatusUpdate(i10, task, g0Var, y10, str3, num, map, str2, str, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            InterfaceC4028k[] interfaceC4028kArr = TaskStatusUpdate.f13867i;
            w0 w0Var = w0.f35762a;
            return new ce.b[]{Task.a.f13827a, interfaceC4028kArr[1].getValue(), AbstractC3918a.p(a0.f13831a), AbstractC3918a.p(w0Var), AbstractC3918a.p(C4221J.f35658a), AbstractC3918a.p((ce.b) interfaceC4028kArr[5].getValue()), AbstractC3918a.p(w0Var), AbstractC3918a.p(w0Var)};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, TaskStatusUpdate value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            TaskStatusUpdate.l(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.m0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13876a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    static {
        EnumC4031n enumC4031n = EnumC4031n.PUBLICATION;
        f13867i = new InterfaceC4028k[]{null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.k0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return TaskStatusUpdate.c();
            }
        }), null, null, null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.l0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return TaskStatusUpdate.d();
            }
        }), null, null};
    }

    public /* synthetic */ TaskStatusUpdate(int i10, Task task, g0 g0Var, Y y10, String str, Integer num, Map map, String str2, String str3, ge.s0 s0Var) {
        if (255 != (i10 & 255)) {
            AbstractC4232e0.a(i10, 255, a.f13876a.getDescriptor());
        }
        this.task = task;
        this.taskStatus = g0Var;
        this.exception = y10;
        this.responseBody = str;
        this.responseStatusCode = num;
        this.responseHeaders = map;
        this.mimeType = str2;
        this.charSet = str3;
    }

    public static final /* synthetic */ ce.b c() {
        return g0.INSTANCE.serializer();
    }

    public static final /* synthetic */ ce.b d() {
        w0 w0Var = w0.f35762a;
        return new ge.M(w0Var, w0Var);
    }

    public static final /* synthetic */ void l(TaskStatusUpdate self, InterfaceC4048d output, ee.e serialDesc) {
        InterfaceC4028k[] interfaceC4028kArr = f13867i;
        output.E(serialDesc, 0, Task.a.f13827a, self.task);
        output.E(serialDesc, 1, (ce.g) interfaceC4028kArr[1].getValue(), self.taskStatus);
        output.l(serialDesc, 2, a0.f13831a, self.exception);
        w0 w0Var = w0.f35762a;
        output.l(serialDesc, 3, w0Var, self.responseBody);
        output.l(serialDesc, 4, C4221J.f35658a, self.responseStatusCode);
        output.l(serialDesc, 5, (ce.g) interfaceC4028kArr[5].getValue(), self.responseHeaders);
        output.l(serialDesc, 6, w0Var, self.mimeType);
        output.l(serialDesc, 7, w0Var, self.charSet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskStatusUpdate)) {
            return false;
        }
        TaskStatusUpdate taskStatusUpdate = (TaskStatusUpdate) other;
        return AbstractC4862t.a(this.task, taskStatusUpdate.task) && this.taskStatus == taskStatusUpdate.taskStatus && AbstractC4862t.a(this.exception, taskStatusUpdate.exception) && AbstractC4862t.a(this.responseBody, taskStatusUpdate.responseBody) && AbstractC4862t.a(this.responseStatusCode, taskStatusUpdate.responseStatusCode) && AbstractC4862t.a(this.responseHeaders, taskStatusUpdate.responseHeaders) && AbstractC4862t.a(this.mimeType, taskStatusUpdate.mimeType) && AbstractC4862t.a(this.charSet, taskStatusUpdate.charSet);
    }

    public final List f() {
        EnumC1903x type;
        g0 g0Var = this.taskStatus;
        if (g0Var != g0.failed) {
            Integer numValueOf = Integer.valueOf(g0Var.ordinal());
            String str = this.taskStatus.s() ? this.responseBody : null;
            Map map = this.taskStatus.s() ? this.responseHeaders : null;
            g0 g0Var2 = this.taskStatus;
            return C4206t.q(numValueOf, str, map, (g0Var2 == g0.complete || g0Var2 == g0.notFound) ? this.responseStatusCode : null, g0Var2.s() ? this.mimeType : null, this.taskStatus.s() ? this.charSet : null);
        }
        Integer numValueOf2 = Integer.valueOf(g0Var.ordinal());
        Y y10 = this.exception;
        String strB = (y10 == null || (type = y10.getType()) == null) ? null : type.b();
        Y y11 = this.exception;
        String description = y11 != null ? y11.getDescription() : null;
        Y y12 = this.exception;
        return C4206t.q(numValueOf2, strB, description, y12 != null ? Integer.valueOf(y12.getHttpResponseCode()) : null, this.responseBody);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Y getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getResponseBody() {
        return this.responseBody;
    }

    public int hashCode() {
        int iHashCode = ((this.task.hashCode() * 31) + this.taskStatus.hashCode()) * 31;
        Y y10 = this.exception;
        int iHashCode2 = (iHashCode + (y10 == null ? 0 : y10.hashCode())) * 31;
        String str = this.responseBody;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.responseStatusCode;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.responseHeaders;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.mimeType;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.charSet;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Map getResponseHeaders() {
        return this.responseHeaders;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getResponseStatusCode() {
        return this.responseStatusCode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final g0 getTaskStatus() {
        return this.taskStatus;
    }

    public String toString() {
        return "TaskStatusUpdate(task=" + this.task + ", taskStatus=" + this.taskStatus + ", exception=" + this.exception + ", responseBody=" + this.responseBody + ", responseStatusCode=" + this.responseStatusCode + ", responseHeaders=" + this.responseHeaders + ", mimeType=" + this.mimeType + ", charSet=" + this.charSet + ")";
    }

    public TaskStatusUpdate(Task task, g0 taskStatus, Y y10, String str, Integer num, Map map, String str2, String str3) {
        AbstractC4862t.e(task, "task");
        AbstractC4862t.e(taskStatus, "taskStatus");
        this.task = task;
        this.taskStatus = taskStatus;
        this.exception = y10;
        this.responseBody = str;
        this.responseStatusCode = num;
        this.responseHeaders = map;
        this.mimeType = str2;
        this.charSet = str3;
    }
}
