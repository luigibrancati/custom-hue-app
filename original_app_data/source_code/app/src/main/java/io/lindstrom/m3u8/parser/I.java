package io.lindstrom.m3u8.parser;

import Db.J;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class I implements InterfaceC4574d {
    public static final I URI = new a("URI", 0);
    public static final I BYTERANGE = new I("BYTERANGE", 1) { // from class: io.lindstrom.m3u8.parser.I.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(J.a aVar, String str) {
            aVar.d(AbstractC4588s.a(str));
        }
    };
    private static final /* synthetic */ I[] $VALUES = j();
    static final Map<String, I> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.H
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((I) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends I {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(J.a aVar, String str) {
            aVar.f(str);
        }
    }

    public I(String str, int i10) {
    }

    public static /* synthetic */ I[] j() {
        return new I[]{URI, BYTERANGE};
    }

    public static Db.J p(String str, C4589t c4589t) throws y {
        J.a aVarBuilder = Db.J.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.c();
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }

    public /* synthetic */ I(String str, int i10, a aVar) {
        this(str, i10);
    }
}
