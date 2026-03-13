package x9;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import u9.w;
import u9.x;

/* JADX INFO: renamed from: x9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6332d extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f47948d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f47949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f47950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f47951c;

    /* JADX INFO: renamed from: x9.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements x {
        @Override // u9.x
        public w create(u9.e eVar, B9.a aVar) {
            Class clsC = aVar.c();
            a aVar2 = null;
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new C6332d(clsC, aVar2);
        }
    }

    public /* synthetic */ C6332d(Class cls, a aVar) {
        this(cls);
    }

    @Override // u9.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Enum c(C9.a aVar) throws IOException {
        if (aVar.C() == C9.b.NULL) {
            aVar.nextNull();
            return null;
        }
        String strNextString = aVar.nextString();
        Enum r02 = (Enum) this.f47949a.get(strNextString);
        return r02 == null ? (Enum) this.f47950b.get(strNextString) : r02;
    }

    @Override // u9.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(C9.c cVar, Enum r22) throws IOException {
        cVar.C0(r22 == null ? null : (String) this.f47951c.get(r22));
    }

    public C6332d(Class cls) {
        this.f47949a = new HashMap();
        this.f47950b = new HashMap();
        this.f47951c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                v9.c cVar = (v9.c) field2.getAnnotation(v9.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f47949a.put(str, r42);
                    }
                }
                this.f47949a.put(strName, r42);
                this.f47950b.put(string, r42);
                this.f47951c.put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
