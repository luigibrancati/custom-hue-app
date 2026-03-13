package yd;

import Lc.G;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import qd.C5516b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends C5516b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cd.E f48599c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Cd.E f48600a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Cd.E e10) {
            super(1);
            this.f48600a = e10;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cd.E invoke(G it) {
            AbstractC4862t.e(it, "it");
            return this.f48600a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List value, Cd.E type) {
        super(value, new a(type));
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(type, "type");
        this.f48599c = type;
    }

    public final Cd.E c() {
        return this.f48599c;
    }
}
