package Jd;

import Jd.a;
import kotlin.jvm.internal.AbstractC4862t;
import yc.InterfaceC6461c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends a.AbstractC0110a implements InterfaceC6461c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Cc.d key, int i10) {
        super(key, i10);
        AbstractC4862t.e(key, "key");
    }

    @Override // yc.InterfaceC6461c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object getValue(a thisRef, Cc.l property) {
        AbstractC4862t.e(thisRef, "thisRef");
        AbstractC4862t.e(property, "property");
        return a(thisRef);
    }
}
