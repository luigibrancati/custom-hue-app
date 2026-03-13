package yc;

import Cc.l;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: yc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6460b implements InterfaceC6462d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f48512a;

    public AbstractC6460b(Object obj) {
        this.f48512a = obj;
    }

    public void a(l property, Object obj, Object obj2) {
        AbstractC4862t.e(property, "property");
    }

    public abstract boolean b(l lVar, Object obj, Object obj2);

    @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
    public Object getValue(Object obj, l property) {
        AbstractC4862t.e(property, "property");
        return this.f48512a;
    }

    @Override // yc.InterfaceC6462d
    public void setValue(Object obj, l property, Object obj2) {
        AbstractC4862t.e(property, "property");
        Object obj3 = this.f48512a;
        if (b(property, obj3, obj2)) {
            this.f48512a = obj2;
            a(property, obj3, obj2);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f48512a + ')';
    }
}
