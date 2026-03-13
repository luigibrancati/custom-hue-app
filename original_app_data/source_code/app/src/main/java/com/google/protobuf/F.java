package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3717g0;
import com.google.protobuf.Q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends E {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32082a;

        static {
            int[] iArr = new int[Q0.b.values().length];
            f32082a = iArr;
            try {
                iArr[Q0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32082a[Q0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32082a[Q0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32082a[Q0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32082a[Q0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32082a[Q0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32082a[Q0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32082a[Q0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32082a[Q0.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32082a[Q0.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32082a[Q0.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32082a[Q0.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32082a[Q0.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32082a[Q0.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32082a[Q0.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32082a[Q0.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32082a[Q0.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32082a[Q0.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.E
    public int a(Map.Entry entry) {
        return ((GeneratedMessageLite.e) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.E
    public Object b(D d10, InterfaceC3717g0 interfaceC3717g0, int i10) {
        return d10.a(interfaceC3717g0, i10);
    }

    @Override // com.google.protobuf.E
    public I c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.E
    public I d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.E
    public boolean e(InterfaceC3717g0 interfaceC3717g0) {
        return interfaceC3717g0 instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.E
    public void f(Object obj) {
        c(obj).x();
    }

    @Override // com.google.protobuf.E
    public Object g(Object obj, z0 z0Var, Object obj2, D d10, I i10, Object obj3, J0 j02) {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        GeneratedMessageLite.f fVar = (GeneratedMessageLite.f) obj2;
        int iF = fVar.f();
        if (fVar.f32103d.f() && fVar.f32103d.h()) {
            switch (a.f32082a[fVar.d().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    z0Var.F(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    z0Var.B(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    z0Var.h(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    z0Var.f(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    z0Var.v(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    z0Var.p(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    z0Var.w(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    z0Var.l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    z0Var.s(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    z0Var.b(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    z0Var.u(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    z0Var.q(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    z0Var.c(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    z0Var.i(arrayList);
                    obj3 = C0.z(obj, iF, arrayList, fVar.f32103d.b(), obj3, j02);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + fVar.f32103d.g());
            }
            i10.C(fVar.f32103d, arrayList);
            return obj3;
        }
        if (fVar.d() != Q0.b.ENUM) {
            switch (a.f32082a[fVar.d().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(z0Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(z0Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(z0Var.G());
                    break;
                case 4:
                    objValueOf = Long.valueOf(z0Var.r());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(z0Var.o());
                    break;
                case 6:
                    objValueOf = Long.valueOf(z0Var.a());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(z0Var.t());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(z0Var.d());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(z0Var.g());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(z0Var.D());
                    break;
                case 11:
                    objValueOf = Long.valueOf(z0Var.e());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(z0Var.k());
                    break;
                case 13:
                    objValueOf = Long.valueOf(z0Var.x());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = z0Var.n();
                    break;
                case 16:
                    objValueOf = z0Var.y();
                    break;
                case 17:
                    if (!fVar.g()) {
                        Object objI2 = i10.i(fVar.f32103d);
                        if (objI2 instanceof GeneratedMessageLite) {
                            A0 a0D = w0.a().d(objI2);
                            if (!((GeneratedMessageLite) objI2).isMutable()) {
                                Object objNewInstance = a0D.newInstance();
                                a0D.a(objNewInstance, objI2);
                                i10.C(fVar.f32103d, objNewInstance);
                                objI2 = objNewInstance;
                            }
                            z0Var.N(objI2, a0D, d10);
                            return obj3;
                        }
                    }
                    objValueOf = z0Var.K(fVar.e().getClass(), d10);
                    break;
                case 18:
                    if (!fVar.g()) {
                        Object objI3 = i10.i(fVar.f32103d);
                        if (objI3 instanceof GeneratedMessageLite) {
                            A0 a0D2 = w0.a().d(objI3);
                            if (!((GeneratedMessageLite) objI3).isMutable()) {
                                Object objNewInstance2 = a0D2.newInstance();
                                a0D2.a(objNewInstance2, objI3);
                                i10.C(fVar.f32103d, objNewInstance2);
                                objI3 = objNewInstance2;
                            }
                            z0Var.O(objI3, a0D2, d10);
                            return obj3;
                        }
                    }
                    objValueOf = z0Var.M(fVar.e().getClass(), d10);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iO = z0Var.o();
            if (fVar.f32103d.b().findValueByNumber(iO) == null) {
                return C0.J(obj, iF, iO, obj3, j02);
            }
            objValueOf = Integer.valueOf(iO);
        }
        if (fVar.g()) {
            i10.a(fVar.f32103d, objValueOf);
            return obj3;
        }
        int i11 = a.f32082a[fVar.d().ordinal()];
        if ((i11 == 17 || i11 == 18) && (objI = i10.i(fVar.f32103d)) != null) {
            objValueOf = N.h(objI, objValueOf);
        }
        i10.C(fVar.f32103d, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.E
    public void h(z0 z0Var, Object obj, D d10, I i10) {
        GeneratedMessageLite.f fVar = (GeneratedMessageLite.f) obj;
        i10.C(fVar.f32103d, z0Var.M(fVar.e().getClass(), d10));
    }

    @Override // com.google.protobuf.E
    public void i(AbstractC3722j abstractC3722j, Object obj, D d10, I i10) {
        GeneratedMessageLite.f fVar = (GeneratedMessageLite.f) obj;
        InterfaceC3717g0.a aVarNewBuilderForType = fVar.e().newBuilderForType();
        AbstractC3724k abstractC3724kW = abstractC3722j.w();
        aVarNewBuilderForType.mergeFrom(abstractC3724kW, d10);
        i10.C(fVar.f32103d, aVarNewBuilderForType.buildPartial());
        abstractC3724kW.a(0);
    }

    @Override // com.google.protobuf.E
    public void j(R0 r02, Map.Entry entry) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) entry.getKey();
        if (!eVar.f()) {
            switch (a.f32082a[eVar.g().ordinal()]) {
                case 1:
                    r02.p(eVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    r02.B(eVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    r02.u(eVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    r02.f(eVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    r02.h(eVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    r02.s(eVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    r02.c(eVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    r02.v(eVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    r02.o(eVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    r02.w(eVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    r02.i(eVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    r02.H(eVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    r02.m(eVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    r02.h(eVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    r02.L(eVar.getNumber(), (AbstractC3722j) entry.getValue());
                    break;
                case 16:
                    r02.e(eVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    r02.K(eVar.getNumber(), entry.getValue(), w0.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    r02.N(eVar.getNumber(), entry.getValue(), w0.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f32082a[eVar.g().ordinal()]) {
            case 1:
                C0.O(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 2:
                C0.S(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 3:
                C0.V(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 4:
                C0.d0(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 5:
                C0.U(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 6:
                C0.R(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 7:
                C0.Q(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 8:
                C0.M(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 9:
                C0.c0(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 10:
                C0.X(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 11:
                C0.Y(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 12:
                C0.Z(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 13:
                C0.a0(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 14:
                C0.U(eVar.getNumber(), (List) entry.getValue(), r02, eVar.h());
                break;
            case 15:
                C0.N(eVar.getNumber(), (List) entry.getValue(), r02);
                break;
            case 16:
                C0.b0(eVar.getNumber(), (List) entry.getValue(), r02);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    C0.T(eVar.getNumber(), (List) entry.getValue(), r02, w0.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    C0.W(eVar.getNumber(), (List) entry.getValue(), r02, w0.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
