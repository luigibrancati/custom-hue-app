package ie;

import ce.InterfaceC3118a;
import ee.k;
import ee.l;
import fc.C4025h;
import fe.InterfaceC4047c;
import fe.InterfaceC4049e;
import ge.AbstractC4225b;
import ge.U;
import he.AbstractC4300C;
import he.AbstractC4304b;
import he.C4298A;
import he.C4305c;
import je.AbstractC4771b;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4381c extends U implements he.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC4304b f37522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final he.h f37523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final he.f f37525g;

    public /* synthetic */ AbstractC4381c(AbstractC4304b abstractC4304b, he.h hVar, String str, AbstractC4854k abstractC4854k) {
        this(abstractC4304b, hVar, str);
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public short Y(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (hVarO0 instanceof AbstractC4300C) {
            AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
            try {
                long jI = he.i.i(abstractC4300C);
                Short shValueOf = (-32768 > jI || jI > 32767) ? null : Short.valueOf((short) jI);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                F0(abstractC4300C, "short", tag);
                throw new C4025h();
            } catch (IllegalArgumentException unused) {
                F0(abstractC4300C, "short", tag);
                throw new C4025h();
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of short at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public String Z(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (!(hVarO0 instanceof AbstractC4300C)) {
            throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of string at element: " + E0(tag), hVarO0.toString());
        }
        AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
        if (!(abstractC4300C instanceof he.t)) {
            throw u.e(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + E0(tag), p0().toString());
        }
        he.t tVar = (he.t) abstractC4300C;
        if (tVar.e() || d().c().q()) {
            return tVar.c();
        }
        throw u.e(-1, "String literal for key '" + tag + "' should be quoted at element: " + E0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", p0().toString());
    }

    public final String C0() {
        return this.f37524f;
    }

    public abstract he.h D0();

    public final String E0(String currentTag) {
        AbstractC4862t.e(currentTag, "currentTag");
        return l0() + '.' + currentTag;
    }

    @Override // ge.z0, fe.InterfaceC4049e
    public boolean F() {
        return !(p0() instanceof he.x);
    }

    public final Void F0(AbstractC4300C abstractC4300C, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (Od.C.P(str, "i", false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw u.e(-1, "Failed to parse literal '" + abstractC4300C + "' as " + sb2.toString() + " value at element: " + E0(str2), p0().toString());
    }

    @Override // ge.z0, fe.InterfaceC4049e
    public InterfaceC4047c a(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        he.h hVarP0 = p0();
        ee.k kVarF = descriptor.f();
        if (AbstractC4862t.a(kVarF, l.b.f33972a) || (kVarF instanceof ee.c)) {
            AbstractC4304b abstractC4304bD = d();
            String strI = descriptor.i();
            if (hVarP0 instanceof C4305c) {
                return new C(abstractC4304bD, (C4305c) hVarP0);
            }
            throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(C4305c.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarP0.getClass()).l() + " as the serialized body of " + strI + " at element: " + l0(), hVarP0.toString());
        }
        if (!AbstractC4862t.a(kVarF, l.c.f33973a)) {
            AbstractC4304b abstractC4304bD2 = d();
            String strI2 = descriptor.i();
            if (hVarP0 instanceof C4298A) {
                return new C4378B(abstractC4304bD2, (C4298A) hVarP0, this.f37524f, null, 8, null);
            }
            throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(C4298A.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarP0.getClass()).l() + " as the serialized body of " + strI2 + " at element: " + l0(), hVarP0.toString());
        }
        AbstractC4304b abstractC4304bD3 = d();
        ee.e eVarA = P.a(descriptor.h(0), abstractC4304bD3.d());
        ee.k kVarF2 = eVarA.f();
        if ((kVarF2 instanceof ee.d) || AbstractC4862t.a(kVarF2, k.b.f33970a)) {
            AbstractC4304b abstractC4304bD4 = d();
            String strI3 = descriptor.i();
            if (hVarP0 instanceof C4298A) {
                return new D(abstractC4304bD4, (C4298A) hVarP0);
            }
            throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(C4298A.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarP0.getClass()).l() + " as the serialized body of " + strI3 + " at element: " + l0(), hVarP0.toString());
        }
        if (!abstractC4304bD3.c().c()) {
            throw u.c(eVarA);
        }
        AbstractC4304b abstractC4304bD5 = d();
        String strI4 = descriptor.i();
        if (hVarP0 instanceof C4305c) {
            return new C(abstractC4304bD5, (C4305c) hVarP0);
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(C4305c.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarP0.getClass()).l() + " as the serialized body of " + strI4 + " at element: " + l0(), hVarP0.toString());
    }

    @Override // ge.z0, fe.InterfaceC4047c
    public AbstractC4771b b() {
        return d().d();
    }

    @Override // ge.z0, fe.InterfaceC4047c
    public void c(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
    }

    @Override // he.g
    public AbstractC4304b d() {
        return this.f37522d;
    }

    @Override // he.g
    public he.h g() {
        return p0();
    }

    @Override // ge.U
    public String h0(String parentName, String childName) {
        AbstractC4862t.e(parentName, "parentName");
        AbstractC4862t.e(childName, "childName");
        return childName;
    }

    @Override // ge.z0, fe.InterfaceC4049e
    public Object n(InterfaceC3118a deserializer) {
        AbstractC4300C abstractC4300CG;
        AbstractC4862t.e(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC4225b) || d().c().p()) {
            return deserializer.deserialize(this);
        }
        AbstractC4225b abstractC4225b = (AbstractC4225b) deserializer;
        String strC = F.c(abstractC4225b.getDescriptor(), d());
        he.h hVarG = g();
        String strI = abstractC4225b.getDescriptor().i();
        if (hVarG instanceof C4298A) {
            C4298A c4298a = (C4298A) hVarG;
            he.h hVar = (he.h) c4298a.get(strC);
            try {
                InterfaceC3118a interfaceC3118aA = ce.d.a((AbstractC4225b) deserializer, this, (hVar == null || (abstractC4300CG = he.i.g(hVar)) == null) ? null : he.i.d(abstractC4300CG));
                AbstractC4862t.c(interfaceC3118aA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return N.a(d(), strC, c4298a, interfaceC3118aA);
            } catch (ce.f e10) {
                String message = e10.getMessage();
                AbstractC4862t.b(message);
                throw u.e(-1, message, c4298a.toString());
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(C4298A.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarG.getClass()).l() + " as the serialized body of " + strI + " at element: " + l0(), hVarG.toString());
    }

    public abstract he.h o0(String str);

    public final he.h p0() {
        he.h hVarO0;
        String str = (String) b0();
        return (str == null || (hVarO0 = o0(str)) == null) ? D0() : hVarO0;
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public boolean O(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (hVarO0 instanceof AbstractC4300C) {
            AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
            try {
                Boolean boolC = he.i.c(abstractC4300C);
                if (boolC != null) {
                    return boolC.booleanValue();
                }
                F0(abstractC4300C, "boolean", tag);
                throw new C4025h();
            } catch (IllegalArgumentException unused) {
                F0(abstractC4300C, "boolean", tag);
                throw new C4025h();
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of boolean at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public byte P(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (hVarO0 instanceof AbstractC4300C) {
            AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
            try {
                long jI = he.i.i(abstractC4300C);
                Byte bValueOf = (-128 > jI || jI > 127) ? null : Byte.valueOf((byte) jI);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                F0(abstractC4300C, "byte", tag);
                throw new C4025h();
            } catch (IllegalArgumentException unused) {
                F0(abstractC4300C, "byte", tag);
                throw new C4025h();
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of byte at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public char Q(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (hVarO0 instanceof AbstractC4300C) {
            AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
            try {
                return Od.H.l1(abstractC4300C.c());
            } catch (IllegalArgumentException unused) {
                this.F0(abstractC4300C, "char", tag);
                throw new C4025h();
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of char at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public double R(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (hVarO0 instanceof AbstractC4300C) {
            AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
            try {
                double dE = he.i.e(abstractC4300C);
                if (d().c().b() || Math.abs(dE) <= Double.MAX_VALUE) {
                    return dE;
                }
                throw u.a(Double.valueOf(dE), tag, p0().toString());
            } catch (IllegalArgumentException unused) {
                F0(abstractC4300C, "double", tag);
                throw new C4025h();
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of double at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public int S(String tag, ee.e enumDescriptor) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(enumDescriptor, "enumDescriptor");
        AbstractC4304b abstractC4304bD = d();
        he.h hVarO0 = o0(tag);
        String strI = enumDescriptor.i();
        if (hVarO0 instanceof AbstractC4300C) {
            return w.k(enumDescriptor, abstractC4304bD, ((AbstractC4300C) hVarO0).c(), null, 4, null);
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of " + strI + " at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public float T(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (hVarO0 instanceof AbstractC4300C) {
            AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
            try {
                float f10 = he.i.f(abstractC4300C);
                if (d().c().b() || Math.abs(f10) <= Float.MAX_VALUE) {
                    return f10;
                }
                throw u.a(Float.valueOf(f10), tag, p0().toString());
            } catch (IllegalArgumentException unused) {
                F0(abstractC4300C, "float", tag);
                throw new C4025h();
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of float at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4049e U(String tag, ee.e inlineDescriptor) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(inlineDescriptor, "inlineDescriptor");
        if (!I.b(inlineDescriptor)) {
            return super.U(tag, inlineDescriptor);
        }
        AbstractC4304b abstractC4304bD = d();
        he.h hVarO0 = o0(tag);
        String strI = inlineDescriptor.i();
        if (hVarO0 instanceof AbstractC4300C) {
            return new C4394p(K.a(abstractC4304bD, ((AbstractC4300C) hVarO0).c()), d());
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of " + strI + " at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0, fe.InterfaceC4049e
    public InterfaceC4049e x(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return b0() != null ? super.x(descriptor) : new y(d(), D0(), this.f37524f).x(descriptor);
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public int V(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (hVarO0 instanceof AbstractC4300C) {
            AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
            try {
                long jI = he.i.i(abstractC4300C);
                Integer numValueOf = (-2147483648L > jI || jI > 2147483647L) ? null : Integer.valueOf((int) jI);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                F0(abstractC4300C, "int", tag);
                throw new C4025h();
            } catch (IllegalArgumentException unused) {
                F0(abstractC4300C, "int", tag);
                throw new C4025h();
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of int at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public long W(String tag) {
        AbstractC4862t.e(tag, "tag");
        he.h hVarO0 = o0(tag);
        if (hVarO0 instanceof AbstractC4300C) {
            AbstractC4300C abstractC4300C = (AbstractC4300C) hVarO0;
            try {
                return he.i.i(abstractC4300C);
            } catch (IllegalArgumentException unused) {
                this.F0(abstractC4300C, "long", tag);
                throw new C4025h();
            }
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(AbstractC4300C.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarO0.getClass()).l() + " as the serialized body of long at element: " + E0(tag), hVarO0.toString());
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean X(String tag) {
        AbstractC4862t.e(tag, "tag");
        return o0(tag) != he.x.INSTANCE;
    }

    public /* synthetic */ AbstractC4381c(AbstractC4304b abstractC4304b, he.h hVar, String str, int i10, AbstractC4854k abstractC4854k) {
        this(abstractC4304b, hVar, (i10 & 4) != 0 ? null : str, null);
    }

    public AbstractC4381c(AbstractC4304b abstractC4304b, he.h hVar, String str) {
        this.f37522d = abstractC4304b;
        this.f37523e = hVar;
        this.f37524f = str;
        this.f37525g = d().c();
    }
}
