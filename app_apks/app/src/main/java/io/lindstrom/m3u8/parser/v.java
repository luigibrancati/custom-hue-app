package io.lindstrom.m3u8.parser;

import Db.InterfaceC0771s;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements InterfaceC4574d {
    public static final v URI = new a("URI", 0);
    public static final v DURATION = new v("DURATION", 1) { // from class: io.lindstrom.m3u8.parser.v.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0771s.a aVar, String str) {
            aVar.j(Double.parseDouble(str));
        }
    };
    public static final v INDEPENDENT = new v("INDEPENDENT", 2) { // from class: io.lindstrom.m3u8.parser.v.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0771s.a aVar, String str) {
            aVar.n(AbstractC4588s.g(str));
        }
    };
    public static final v BYTERANGE = new v("BYTERANGE", 3) { // from class: io.lindstrom.m3u8.parser.v.d
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0771s.a aVar, String str) {
            aVar.i(AbstractC4588s.a(str));
        }
    };
    public static final v GAP = new v("GAP", 4) { // from class: io.lindstrom.m3u8.parser.v.e
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0771s.a aVar, String str) {
            aVar.l(AbstractC4588s.g(str));
        }
    };
    private static final /* synthetic */ v[] $VALUES = j();
    static final Map<String, v> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.u
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((v) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends v {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0771s.a aVar, String str) {
            aVar.p(str);
        }
    }

    public v(String str, int i10) {
    }

    public static /* synthetic */ v[] j() {
        return new v[]{URI, DURATION, INDEPENDENT, BYTERANGE, GAP};
    }

    public static InterfaceC0771s p(String str, C4589t c4589t) throws y {
        InterfaceC0771s.a aVarBuilder = InterfaceC0771s.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.h();
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    public /* synthetic */ v(String str, int i10, a aVar) {
        this(str, i10);
    }
}
