package c2;

import D1.o;
import F2.l;
import F2.s;
import java.util.Objects;

/* JADX INFO: renamed from: c2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2936g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2936g f25558a = new a();

    /* JADX INFO: renamed from: c2.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC2936g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final F2.h f25559b = new F2.h();

        @Override // c2.InterfaceC2936g
        public boolean a(o oVar) {
            String str = oVar.f1805o;
            return this.f25559b.a(oVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // c2.InterfaceC2936g
        public l b(o oVar) {
            String str = oVar.f1805o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new G2.a(str, oVar.f1785L, 16000L);
                    case "application/cea-708":
                        return new G2.c(oVar.f1785L, oVar.f1808r);
                }
            }
            if (!this.f25559b.a(oVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            s sVarB = this.f25559b.b(oVar);
            return new C2931b(sVarB.getClass().getSimpleName() + "Decoder", sVarB);
        }
    }

    boolean a(o oVar);

    l b(o oVar);
}
