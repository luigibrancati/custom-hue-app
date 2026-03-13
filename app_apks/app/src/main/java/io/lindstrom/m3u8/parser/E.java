package io.lindstrom.m3u8.parser;

import Db.D;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class E implements InterfaceC4574d {
    public static final E URI = new a("URI", 0);
    public static final E LAST_MSN = new E("LAST_MSN", 1) { // from class: io.lindstrom.m3u8.parser.E.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(D.a aVar, String str) {
            aVar.f(Long.parseLong(str));
        }
    };
    public static final E LAST_PART = new E("LAST_PART", 2) { // from class: io.lindstrom.m3u8.parser.E.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(D.a aVar, String str) {
            aVar.g(Long.parseLong(str));
        }
    };
    private static final /* synthetic */ E[] $VALUES = j();
    static final Map<String, E> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.D
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((E) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends E {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(D.a aVar, String str) {
            aVar.h(str);
        }
    }

    public E(String str, int i10) {
    }

    public static /* synthetic */ E[] j() {
        return new E[]{URI, LAST_MSN, LAST_PART};
    }

    public static Db.D p(String str, C4589t c4589t) throws y {
        D.a aVarBuilder = Db.D.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.d();
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) $VALUES.clone();
    }

    public /* synthetic */ E(String str, int i10, a aVar) {
        this(str, i10);
    }
}
