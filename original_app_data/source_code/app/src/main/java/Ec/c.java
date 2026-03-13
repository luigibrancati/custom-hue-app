package Ec;

import Cc.h;
import Cc.i;
import Cc.l;
import Cc.p;
import Cc.w;
import Fc.A;
import Fc.AbstractC0835j;
import Fc.L;
import Fc.y;
import Gc.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final Constructor a(h hVar) {
        e eVarV;
        AbstractC4862t.e(hVar, "<this>");
        AbstractC0835j abstractC0835jB = L.b(hVar);
        Member member = (abstractC0835jB == null || (eVarV = abstractC0835jB.v()) == null) ? null : eVarV.getMember();
        if (member instanceof Constructor) {
            return (Constructor) member;
        }
        return null;
    }

    public static final Field b(l lVar) {
        AbstractC4862t.e(lVar, "<this>");
        y yVarD = L.d(lVar);
        if (yVarD != null) {
            return yVarD.G();
        }
        return null;
    }

    public static final Method c(l lVar) {
        AbstractC4862t.e(lVar, "<this>");
        return d(lVar.g());
    }

    public static final Method d(h hVar) {
        e eVarV;
        AbstractC4862t.e(hVar, "<this>");
        AbstractC0835j abstractC0835jB = L.b(hVar);
        Member member = (abstractC0835jB == null || (eVarV = abstractC0835jB.v()) == null) ? null : eVarV.getMember();
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }

    public static final Method e(i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return d(iVar.h());
    }

    public static final Type f(p pVar) {
        AbstractC4862t.e(pVar, "<this>");
        Type typeC = ((A) pVar).c();
        return typeC == null ? w.f(pVar) : typeC;
    }
}
