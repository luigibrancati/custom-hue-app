package Mc;

import Cd.E;
import Cd.M;
import Lc.a0;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ic.g f9439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd.c f9440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f9441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f9442d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return j.this.f9439a.o(j.this.e()).p();
        }
    }

    public j(Ic.g builtIns, kd.c fqName, Map allValueArguments) {
        AbstractC4862t.e(builtIns, "builtIns");
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(allValueArguments, "allValueArguments");
        this.f9439a = builtIns;
        this.f9440b = fqName;
        this.f9441c = allValueArguments;
        this.f9442d = C4029l.a(EnumC4031n.PUBLICATION, new a());
    }

    @Override // Mc.c
    public Map a() {
        return this.f9441c;
    }

    @Override // Mc.c
    public kd.c e() {
        return this.f9440b;
    }

    @Override // Mc.c
    public E getType() {
        Object value = this.f9442d.getValue();
        AbstractC4862t.d(value, "<get-type>(...)");
        return (E) value;
    }

    @Override // Mc.c
    public a0 j() {
        a0 NO_SOURCE = a0.f8746a;
        AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }
}
