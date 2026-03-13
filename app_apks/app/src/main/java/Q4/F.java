package Q4;

import androidx.core.app.m;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f13774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f13775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.e f13776c;

    public F(b0 taskWorker, G g10, m.e eVar) {
        AbstractC4862t.e(taskWorker, "taskWorker");
        this.f13774a = taskWorker;
        this.f13775b = g10;
        this.f13776c = eVar;
    }

    public final m.e a() {
        return this.f13776c;
    }

    public final G b() {
        return this.f13775b;
    }

    public final b0 c() {
        return this.f13774a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return AbstractC4862t.a(this.f13774a, f10.f13774a) && this.f13775b == f10.f13775b && AbstractC4862t.a(this.f13776c, f10.f13776c);
    }

    public int hashCode() {
        int iHashCode = this.f13774a.hashCode() * 31;
        G g10 = this.f13775b;
        int iHashCode2 = (iHashCode + (g10 == null ? 0 : g10.hashCode())) * 31;
        m.e eVar = this.f13776c;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "NotificationData(taskWorker=" + this.f13774a + ", notificationType=" + this.f13775b + ", builder=" + this.f13776c + ")";
    }
}
