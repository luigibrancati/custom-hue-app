package io.lindstrom.m3u8.parser;

import Db.U;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class U implements InterfaceC4574d {
    public static final U BANDWIDTH = new g("BANDWIDTH", 0);
    public static final U AVERAGE_BANDWIDTH = new U("AVERAGE_BANDWIDTH", 1) { // from class: io.lindstrom.m3u8.parser.U.h
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.w(Long.parseLong(str));
        }
    };
    public static final U SCORE = new U("SCORE", 2) { // from class: io.lindstrom.m3u8.parser.U.i
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.I(Double.parseDouble(str));
        }
    };
    public static final U CODECS = new U("CODECS", 3) { // from class: io.lindstrom.m3u8.parser.U.j
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.B(AbstractC4588s.e(str, ","));
        }
    };
    public static final U RESOLUTION = new U("RESOLUTION", 4) { // from class: io.lindstrom.m3u8.parser.U.k
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.H(AbstractC4588s.c(str));
        }
    };
    public static final U FRAME_RATE = new U("FRAME_RATE", 5) { // from class: io.lindstrom.m3u8.parser.U.l
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.E(Double.parseDouble(str));
        }
    };
    public static final U HDCP_LEVEL = new U("HDCP_LEVEL", 6) { // from class: io.lindstrom.m3u8.parser.U.m
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.F(str);
        }
    };
    public static final U ALLOWED_CPC = new U("ALLOWED_CPC", 7) { // from class: io.lindstrom.m3u8.parser.U.n
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.u(AbstractC4588s.e(str, ","));
        }
    };
    public static final U STABLE_VARIANT_ID = new U("STABLE_VARIANT_ID", 8) { // from class: io.lindstrom.m3u8.parser.U.o
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.J(str);
        }
    };
    public static final U AUDIO = new U("AUDIO", 9) { // from class: io.lindstrom.m3u8.parser.U.a
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.v(str);
        }
    };
    public static final U VIDEO = new U("VIDEO", 10) { // from class: io.lindstrom.m3u8.parser.U.b
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.M(str);
        }
    };
    public static final U SUBTITLES = new U("SUBTITLES", 11) { // from class: io.lindstrom.m3u8.parser.U.c
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.K(str);
        }
    };
    public static final U CLOSED_CAPTIONS = new U("CLOSED_CAPTIONS", 12) { // from class: io.lindstrom.m3u8.parser.U.d
        private static final String NONE = "NONE";

        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            if (str.equals(NONE)) {
                aVar.A(true);
            } else {
                aVar.z(str);
            }
        }
    };
    public static final U PROGRAM_ID = new U("PROGRAM_ID", 13) { // from class: io.lindstrom.m3u8.parser.U.e
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.G(Integer.parseInt(str));
        }
    };
    public static final U VIDEO_RANGE = new U("VIDEO_RANGE", 14) { // from class: io.lindstrom.m3u8.parser.U.f
        {
            g gVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.O(str);
        }
    };
    private static final /* synthetic */ U[] $VALUES = j();
    static final Map<String, U> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.T
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((U) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum g extends U {
        public g(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(U.a aVar, String str) {
            aVar.x(Long.parseLong(str));
        }
    }

    public U(String str, int i10) {
    }

    public static /* synthetic */ U[] j() {
        return new U[]{BANDWIDTH, AVERAGE_BANDWIDTH, SCORE, CODECS, RESOLUTION, FRAME_RATE, HDCP_LEVEL, ALLOWED_CPC, STABLE_VARIANT_ID, AUDIO, VIDEO, SUBTITLES, CLOSED_CAPTIONS, PROGRAM_ID, VIDEO_RANGE};
    }

    public static Db.U p(String str, String str2, C4589t c4589t) throws y {
        U.a aVarBuilder = Db.U.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        aVarBuilder.L(str2);
        return aVarBuilder.y();
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) $VALUES.clone();
    }

    public /* synthetic */ U(String str, int i10, g gVar) {
        this(str, i10);
    }
}
