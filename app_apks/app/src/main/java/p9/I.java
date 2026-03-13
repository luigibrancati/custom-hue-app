package p9;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC5434j f42328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f42329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5426b f42330c;

    public I(EnumC5434j eventType, P sessionData, C5426b applicationInfo) {
        AbstractC4862t.e(eventType, "eventType");
        AbstractC4862t.e(sessionData, "sessionData");
        AbstractC4862t.e(applicationInfo, "applicationInfo");
        this.f42328a = eventType;
        this.f42329b = sessionData;
        this.f42330c = applicationInfo;
    }

    public final C5426b a() {
        return this.f42330c;
    }

    public final EnumC5434j b() {
        return this.f42328a;
    }

    public final P c() {
        return this.f42329b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return this.f42328a == i10.f42328a && AbstractC4862t.a(this.f42329b, i10.f42329b) && AbstractC4862t.a(this.f42330c, i10.f42330c);
    }

    public int hashCode() {
        return (((this.f42328a.hashCode() * 31) + this.f42329b.hashCode()) * 31) + this.f42330c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f42328a + ", sessionData=" + this.f42329b + ", applicationInfo=" + this.f42330c + ')';
    }
}
