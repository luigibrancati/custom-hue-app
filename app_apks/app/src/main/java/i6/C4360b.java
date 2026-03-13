package i6;

import java.util.Map;
import l6.InterfaceC4957a;

/* JADX INFO: renamed from: i6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4360b extends AbstractC4364f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4957a f37242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f37243b;

    public C4360b(InterfaceC4957a interfaceC4957a, Map map) {
        if (interfaceC4957a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f37242a = interfaceC4957a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f37243b = map;
    }

    @Override // i6.AbstractC4364f
    public InterfaceC4957a e() {
        return this.f37242a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4364f) {
            AbstractC4364f abstractC4364f = (AbstractC4364f) obj;
            if (this.f37242a.equals(abstractC4364f.e()) && this.f37243b.equals(abstractC4364f.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // i6.AbstractC4364f
    public Map h() {
        return this.f37243b;
    }

    public int hashCode() {
        return this.f37243b.hashCode() ^ ((this.f37242a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f37242a + ", values=" + this.f37243b + "}";
    }
}
