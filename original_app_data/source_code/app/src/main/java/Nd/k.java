package Nd;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import mc.C5045b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vc.p f10660a;

        public a(vc.p pVar) {
            this.f10660a = pVar;
        }

        @Override // Nd.h
        public Iterator iterator() {
            return k.a(this.f10660a);
        }
    }

    public static Iterator a(vc.p block) {
        AbstractC4862t.e(block, "block");
        i iVar = new i();
        iVar.f(C5045b.a(block, iVar, iVar));
        return iVar;
    }

    public static h b(vc.p block) {
        AbstractC4862t.e(block, "block");
        return new a(block);
    }
}
