package io.lindstrom.m3u8.parser;

import Db.InterfaceC0773u;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x implements InterfaceC4574d {
    public static final x PART_TARGET = new a("PART_TARGET", 0);
    private static final /* synthetic */ x[] $VALUES = j();
    static final Map<String, x> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.w
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((x) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends x {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0773u.a aVar, String str) {
            aVar.d(Double.parseDouble(str));
        }
    }

    public x(String str, int i10) {
    }

    public static /* synthetic */ x[] j() {
        return new x[]{PART_TARGET};
    }

    public static InterfaceC0773u p(String str, C4589t c4589t) throws y {
        InterfaceC0773u.a aVarBuilder = InterfaceC0773u.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.b();
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    public /* synthetic */ x(String str, int i10, a aVar) {
        this(str, i10);
    }
}
