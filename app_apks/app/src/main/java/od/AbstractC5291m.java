package od;

import Lc.InterfaceC1173a;
import fc.C4015H;
import gc.C4179C;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;

/* JADX INFO: renamed from: od.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5291m {

    /* JADX INFO: renamed from: od.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Md.f f41566a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Md.f fVar) {
            super(1);
            this.f41566a = fVar;
        }

        public final void a(Object it) {
            Md.f fVar = this.f41566a;
            AbstractC4862t.d(it, "it");
            fVar.add(it);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C4015H.f34254a;
        }
    }

    public static final Collection a(Collection collection, vc.l descriptorByHandle) {
        AbstractC4862t.e(collection, "<this>");
        AbstractC4862t.e(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        Md.f fVarA = Md.f.f9471c.a();
        while (!linkedList.isEmpty()) {
            Object objH0 = C4179C.h0(linkedList);
            Md.f fVarA2 = Md.f.f9471c.a();
            Collection collectionQ = C5289k.q(objH0, linkedList, descriptorByHandle, new a(fVarA2));
            AbstractC4862t.d(collectionQ, "conflictedHandles = Smar…nflictedHandles.add(it) }");
            if (collectionQ.size() == 1 && fVarA2.isEmpty()) {
                Object objE0 = C4179C.E0(collectionQ);
                AbstractC4862t.d(objE0, "overridableGroup.single()");
                fVarA.add(objE0);
            } else {
                Object objL = C5289k.L(collectionQ, descriptorByHandle);
                AbstractC4862t.d(objL, "selectMostSpecificMember…roup, descriptorByHandle)");
                InterfaceC1173a interfaceC1173a = (InterfaceC1173a) descriptorByHandle.invoke(objL);
                for (Object it : collectionQ) {
                    AbstractC4862t.d(it, "it");
                    if (!C5289k.B(interfaceC1173a, (InterfaceC1173a) descriptorByHandle.invoke(it))) {
                        fVarA2.add(it);
                    }
                }
                if (!fVarA2.isEmpty()) {
                    fVarA.addAll(fVarA2);
                }
                fVarA.add(objL);
            }
        }
        return fVarA;
    }
}
