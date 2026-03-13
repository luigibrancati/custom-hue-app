package Gc;

import Fc.L;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4719c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bc.f f4720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method[] f4721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f4722c;

        public a(Bc.f argumentRange, Method[] unbox, Method method) {
            AbstractC4862t.e(argumentRange, "argumentRange");
            AbstractC4862t.e(unbox, "unbox");
            this.f4720a = argumentRange;
            this.f4721b = unbox;
            this.f4722c = method;
        }

        public final Bc.f a() {
            return this.f4720a;
        }

        public final Method[] b() {
            return this.f4721b;
        }

        public final Method c() {
            return this.f4722c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(Lc.InterfaceC1174b r9, Gc.e r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Gc.h.<init>(Lc.b, Gc.e, boolean):void");
    }

    @Override // Gc.e
    public List a() {
        return this.f4717a.a();
    }

    @Override // Gc.e
    public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        AbstractC4862t.e(args, "args");
        a aVar = this.f4719c;
        Bc.f fVarA = aVar.a();
        Method[] methodArrB = aVar.b();
        Method methodC = aVar.c();
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        AbstractC4862t.d(objArrCopyOf, "copyOf(this, size)");
        int iC = fVarA.c();
        int iD = fVarA.d();
        if (iC <= iD) {
            while (true) {
                Method method = methodArrB[iC];
                Object objG = args[iC];
                if (method != null) {
                    if (objG != null) {
                        objG = method.invoke(objG, null);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        AbstractC4862t.d(returnType, "method.returnType");
                        objG = L.g(returnType);
                    }
                }
                objArrCopyOf[iC] = objG;
                if (iC == iD) {
                    break;
                }
                iC++;
            }
        }
        Object objCall = this.f4717a.call(objArrCopyOf);
        return (methodC == null || (objInvoke = methodC.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // Gc.e
    public Member getMember() {
        return this.f4717a.getMember();
    }

    @Override // Gc.e
    public Type getReturnType() {
        return this.f4717a.getReturnType();
    }
}
