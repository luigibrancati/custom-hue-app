package Fc;

import Fc.AbstractC0833h;
import Lc.AbstractC1191t;
import Lc.InterfaceC1185m;
import Lc.U;
import dd.C3907l;
import id.AbstractC4376a;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jd.AbstractC4763d;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import md.i;

/* JADX INFO: renamed from: Fc.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0834i {

    /* JADX INFO: renamed from: Fc.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC0834i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f3880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            AbstractC4862t.e(field, "field");
            this.f3880a = field;
        }

        @Override // Fc.AbstractC0834i
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f3880a.getName();
            AbstractC4862t.d(name, "field.name");
            sb2.append(Uc.A.b(name));
            sb2.append("()");
            Class<?> type = this.f3880a.getType();
            AbstractC4862t.d(type, "field.type");
            sb2.append(Rc.d.b(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f3880a;
        }
    }

    /* JADX INFO: renamed from: Fc.i$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC0834i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f3881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f3882b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method getterMethod, Method method) {
            super(null);
            AbstractC4862t.e(getterMethod, "getterMethod");
            this.f3881a = getterMethod;
            this.f3882b = method;
        }

        @Override // Fc.AbstractC0834i
        public String a() {
            return J.b(this.f3881a);
        }

        public final Method b() {
            return this.f3881a;
        }

        public final Method c() {
            return this.f3882b;
        }
    }

    /* JADX INFO: renamed from: Fc.i$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC0834i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U f3883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final fd.n f3884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC4376a.d f3885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final hd.c f3886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final hd.g f3887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f3888f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(U descriptor, fd.n proto, AbstractC4376a.d signature, hd.c nameResolver, hd.g typeTable) {
            String str;
            super(null);
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(proto, "proto");
            AbstractC4862t.e(signature, "signature");
            AbstractC4862t.e(nameResolver, "nameResolver");
            AbstractC4862t.e(typeTable, "typeTable");
            this.f3883a = descriptor;
            this.f3884b = proto;
            this.f3885c = signature;
            this.f3886d = nameResolver;
            this.f3887e = typeTable;
            if (signature.A()) {
                str = nameResolver.getString(signature.v().r()) + nameResolver.getString(signature.v().q());
            } else {
                AbstractC4763d.a aVarD = C4768i.d(C4768i.f39178a, proto, nameResolver, typeTable, false, 8, null);
                if (aVarD == null) {
                    throw new D("No field signature for property: " + descriptor);
                }
                String strD = aVarD.d();
                str = Uc.A.b(strD) + c() + "()" + aVarD.e();
            }
            this.f3888f = str;
        }

        @Override // Fc.AbstractC0834i
        public String a() {
            return this.f3888f;
        }

        public final U b() {
            return this.f3883a;
        }

        public final String c() {
            String string;
            InterfaceC1185m interfaceC1185mB = this.f3883a.b();
            AbstractC4862t.d(interfaceC1185mB, "descriptor.containingDeclaration");
            if (AbstractC4862t.a(this.f3883a.getVisibility(), AbstractC1191t.f8774d) && (interfaceC1185mB instanceof Ad.d)) {
                fd.c cVarB1 = ((Ad.d) interfaceC1185mB).b1();
                i.f classModuleName = AbstractC4376a.f37386i;
                AbstractC4862t.d(classModuleName, "classModuleName");
                Integer num = (Integer) hd.e.a(cVarB1, classModuleName);
                if (num == null || (string = this.f3886d.getString(num.intValue())) == null) {
                    string = SentryThread.JsonKeys.MAIN;
                }
                return '$' + kd.g.a(string);
            }
            if (!AbstractC4862t.a(this.f3883a.getVisibility(), AbstractC1191t.f8771a) || !(interfaceC1185mB instanceof Lc.K)) {
                return "";
            }
            U u10 = this.f3883a;
            AbstractC4862t.c(u10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            Ad.f fVarI = ((Ad.j) u10).I();
            if (!(fVarI instanceof C3907l)) {
                return "";
            }
            C3907l c3907l = (C3907l) fVarI;
            if (c3907l.f() == null) {
                return "";
            }
            return '$' + c3907l.h().b();
        }

        public final hd.c d() {
            return this.f3886d;
        }

        public final fd.n e() {
            return this.f3884b;
        }

        public final AbstractC4376a.d f() {
            return this.f3885c;
        }

        public final hd.g g() {
            return this.f3887e;
        }
    }

    /* JADX INFO: renamed from: Fc.i$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC0834i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC0833h.e f3889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC0833h.e f3890b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC0833h.e getterSignature, AbstractC0833h.e eVar) {
            super(null);
            AbstractC4862t.e(getterSignature, "getterSignature");
            this.f3889a = getterSignature;
            this.f3890b = eVar;
        }

        @Override // Fc.AbstractC0834i
        public String a() {
            return this.f3889a.a();
        }

        public final AbstractC0833h.e b() {
            return this.f3889a;
        }

        public final AbstractC0833h.e c() {
            return this.f3890b;
        }
    }

    public /* synthetic */ AbstractC0834i(AbstractC4854k abstractC4854k) {
        this();
    }

    public abstract String a();

    public AbstractC0834i() {
    }
}
