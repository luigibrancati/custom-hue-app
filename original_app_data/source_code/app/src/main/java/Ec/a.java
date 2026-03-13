package Ec;

import Cc.h;
import Cc.i;
import Cc.l;
import Fc.AbstractC0835j;
import Fc.L;
import Gc.e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(Cc.c cVar) {
        e eVarX;
        AbstractC4862t.e(cVar, "<this>");
        if (cVar instanceof i) {
            l lVar = (l) cVar;
            Field fieldB = c.b(lVar);
            if (fieldB != null ? fieldB.isAccessible() : true) {
                Method methodC = c.c(lVar);
                if (methodC != null ? methodC.isAccessible() : true) {
                    Method methodE = c.e((i) cVar);
                    if (methodE != null ? methodE.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (cVar instanceof l) {
            l lVar2 = (l) cVar;
            Field fieldB2 = c.b(lVar2);
            if (fieldB2 != null ? fieldB2.isAccessible() : true) {
                Method methodC2 = c.c(lVar2);
                if (methodC2 != null ? methodC2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (cVar instanceof l.b) {
            Field fieldB3 = c.b(((l.b) cVar).i());
            if (fieldB3 != null ? fieldB3.isAccessible() : true) {
                Method methodD = c.d((h) cVar);
                if (methodD != null ? methodD.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (cVar instanceof i.a) {
            Field fieldB4 = c.b(((i.a) cVar).i());
            if (fieldB4 != null ? fieldB4.isAccessible() : true) {
                Method methodD2 = c.d((h) cVar);
                if (methodD2 != null ? methodD2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(cVar instanceof h)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        h hVar = (h) cVar;
        Method methodD3 = c.d(hVar);
        if (methodD3 != null ? methodD3.isAccessible() : true) {
            AbstractC0835j abstractC0835jB = L.b(cVar);
            Member member = (abstractC0835jB == null || (eVarX = abstractC0835jB.x()) == null) ? null : eVarX.getMember();
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorA = c.a(hVar);
                if (constructorA != null ? constructorA.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }
}
