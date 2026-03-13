package io.sentry.android.replay.util;

import Od.F;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import l0.InterfaceC4869e;
import n0.AbstractC5066d;
import n0.AbstractC5067e;
import n0.C5068f;
import o0.AbstractC5188e;
import s0.AbstractC5703a;
import u0.AbstractC5896e;
import u0.C5904m;
import u0.InterfaceC5895d;
import z0.AbstractC6495i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a0\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0010\u001a$\u0010\u0014\u001a\u00020\n*\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\n*\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0018\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001d\u0010\u001c\u001a\u00020\u001b*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/b;", "Ls0/a;", "findPainter", "(Landroidx/compose/ui/node/b;)Ls0/a;", "", "isMaskable", "(Ls0/a;)Z", "Lio/sentry/android/replay/util/TextAttributes;", "findTextAttributes", "(Landroidx/compose/ui/node/b;)Lio/sentry/android/replay/util/TextAttributes;", "", "a", "b", "c", "d", "fastMinOf", "(FFFF)F", "fastMaxOf", "minimumValue", "maximumValue", "fastCoerceIn", "(FFF)F", "fastCoerceAtLeast", "(FF)F", "fastCoerceAtMost", "Lu0/d;", "rootCoordinates", "Landroid/graphics/Rect;", "boundsInWindow", "(Lu0/d;Lu0/d;)Landroid/graphics/Rect;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NodesKt {
    public static final Rect boundsInWindow(InterfaceC5895d interfaceC5895d, InterfaceC5895d interfaceC5895d2) {
        AbstractC4862t.e(interfaceC5895d, "<this>");
        if (interfaceC5895d2 == null) {
            interfaceC5895d2 = AbstractC5896e.a(interfaceC5895d);
        }
        float fE = AbstractC6495i.e(interfaceC5895d2.f());
        float fD = AbstractC6495i.d(interfaceC5895d2.f());
        C5068f c5068fE = InterfaceC5895d.e(interfaceC5895d2, interfaceC5895d, false, 2, null);
        float fC = c5068fE.c();
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        if (fC > fE) {
            fC = fE;
        }
        float fE2 = c5068fE.e();
        if (fE2 < 0.0f) {
            fE2 = 0.0f;
        }
        if (fE2 > fD) {
            fE2 = fD;
        }
        float fD2 = c5068fE.d();
        if (fD2 < 0.0f) {
            fD2 = 0.0f;
        }
        if (fD2 <= fE) {
            fE = fD2;
        }
        float fB = c5068fE.b();
        float f10 = fB >= 0.0f ? fB : 0.0f;
        if (f10 <= fD) {
            fD = f10;
        }
        if (fC == fE || fE2 == fD) {
            return new Rect();
        }
        long jL = interfaceC5895d2.l(AbstractC5067e.a(fC, fE2));
        long jL2 = interfaceC5895d2.l(AbstractC5067e.a(fE, fE2));
        long jL3 = interfaceC5895d2.l(AbstractC5067e.a(fE, fD));
        long jL4 = interfaceC5895d2.l(AbstractC5067e.a(fC, fD));
        float fC2 = AbstractC5066d.c(jL);
        float fC3 = AbstractC5066d.c(jL2);
        float fC4 = AbstractC5066d.c(jL4);
        float fC5 = AbstractC5066d.c(jL3);
        float fMin = Math.min(fC2, Math.min(fC3, Math.min(fC4, fC5)));
        float fMax = Math.max(fC2, Math.max(fC3, Math.max(fC4, fC5)));
        float fD3 = AbstractC5066d.d(jL);
        float fD4 = AbstractC5066d.d(jL2);
        float fD5 = AbstractC5066d.d(jL4);
        float fD6 = AbstractC5066d.d(jL3);
        return new Rect((int) fMin, (int) Math.min(fD3, Math.min(fD4, Math.min(fD5, fD6))), (int) fMax, (int) Math.max(fD3, Math.max(fD4, Math.max(fD5, fD6))));
    }

    private static final float fastCoerceAtLeast(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    private static final float fastCoerceAtMost(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    private static final float fastCoerceIn(float f10, float f11, float f12) {
        if (f10 < f11) {
            f10 = f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    private static final float fastMaxOf(float f10, float f11, float f12, float f13) {
        return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
    }

    private static final float fastMinOf(float f10, float f11, float f12, float f13) {
        return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
    }

    public static final AbstractC5703a findPainter(androidx.compose.ui.node.b bVar) {
        AbstractC4862t.e(bVar, "<this>");
        List listE = bVar.E();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4869e interfaceC4869eA = ((C5904m) listE.get(i10)).a();
            String name = interfaceC4869eA.getClass().getName();
            AbstractC4862t.d(name, "getName(...)");
            if (F.V(name, "Painter", false, 2, null)) {
                try {
                    Field declaredField = interfaceC4869eA.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(interfaceC4869eA);
                    if (obj instanceof AbstractC5703a) {
                        return (AbstractC5703a) obj;
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        }
        return null;
    }

    public static final TextAttributes findTextAttributes(androidx.compose.ui.node.b bVar) {
        AbstractC4862t.e(bVar, "<this>");
        List listE = bVar.E();
        int size = listE.size();
        AbstractC5188e abstractC5188e = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4869e interfaceC4869eA = ((C5904m) listE.get(i10)).a();
            String name = interfaceC4869eA.getClass().getName();
            AbstractC4862t.b(name);
            if (F.V(name, "Text", false, 2, null)) {
                try {
                    Field declaredField = interfaceC4869eA.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    declaredField.get(interfaceC4869eA);
                } catch (Throwable unused) {
                }
                abstractC5188e = null;
            } else if (F.V(name, "Fill", false, 2, null)) {
                z10 = true;
            }
        }
        return new TextAttributes(abstractC5188e, z10, null);
    }

    public static final boolean isMaskable(AbstractC5703a abstractC5703a) {
        AbstractC4862t.e(abstractC5703a, "<this>");
        String name = abstractC5703a.getClass().getName();
        AbstractC4862t.b(name);
        return (F.V(name, "Vector", false, 2, null) || F.V(name, "Color", false, 2, null) || F.V(name, "Brush", false, 2, null)) ? false : true;
    }
}
