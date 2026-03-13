package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkConnectionInfo extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final NetworkConnectionInfo DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile t0 PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31877a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31877a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31877a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31877a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31877a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31877a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31877a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31877a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(NetworkConnectionInfo.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements N.c {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        public static final int CDMA_VALUE = 4;
        public static final int COMBINED_VALUE = 100;
        public static final int EDGE_VALUE = 2;
        public static final int EHRPD_VALUE = 14;
        public static final int EVDO_0_VALUE = 5;
        public static final int EVDO_A_VALUE = 6;
        public static final int EVDO_B_VALUE = 12;
        public static final int GPRS_VALUE = 1;
        public static final int GSM_VALUE = 16;
        public static final int HSDPA_VALUE = 8;
        public static final int HSPAP_VALUE = 15;
        public static final int HSPA_VALUE = 10;
        public static final int HSUPA_VALUE = 9;
        public static final int IDEN_VALUE = 11;
        public static final int IWLAN_VALUE = 18;
        public static final int LTE_CA_VALUE = 19;
        public static final int LTE_VALUE = 13;
        public static final int RTT_VALUE = 7;
        public static final int TD_SCDMA_VALUE = 17;
        public static final int UMTS_VALUE = 3;
        public static final int UNKNOWN_MOBILE_SUBTYPE_VALUE = 0;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c findValueByNumber(int i10) {
                return c.b(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f31878a = new b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return c.b(i10) != null;
            }
        }

        c(int i10) {
            this.value = i10;
        }

        public static c b(int i10) {
            if (i10 == 100) {
                return COMBINED;
            }
            switch (i10) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static N.e j() {
            return b.f31878a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d implements N.c {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);

        public static final int BLUETOOTH_VALUE = 7;
        public static final int DUMMY_VALUE = 8;
        public static final int ETHERNET_VALUE = 9;
        public static final int MOBILE_CBS_VALUE = 12;
        public static final int MOBILE_DUN_VALUE = 4;
        public static final int MOBILE_EMERGENCY_VALUE = 15;
        public static final int MOBILE_FOTA_VALUE = 10;
        public static final int MOBILE_HIPRI_VALUE = 5;
        public static final int MOBILE_IA_VALUE = 14;
        public static final int MOBILE_IMS_VALUE = 11;
        public static final int MOBILE_MMS_VALUE = 2;
        public static final int MOBILE_SUPL_VALUE = 3;
        public static final int MOBILE_VALUE = 0;
        public static final int NONE_VALUE = -1;
        public static final int PROXY_VALUE = 16;
        public static final int VPN_VALUE = 17;
        public static final int WIFI_P2P_VALUE = 13;
        public static final int WIFI_VALUE = 1;
        public static final int WIMAX_VALUE = 6;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d findValueByNumber(int i10) {
                return d.b(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f31879a = new b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return d.b(i10) != null;
            }
        }

        d(int i10) {
            this.value = i10;
        }

        public static d b(int i10) {
            switch (i10) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static N.e j() {
            return b.f31879a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        NetworkConnectionInfo networkConnectionInfo = new NetworkConnectionInfo();
        DEFAULT_INSTANCE = networkConnectionInfo;
        GeneratedMessageLite.registerDefaultInstance(NetworkConnectionInfo.class, networkConnectionInfo);
    }

    private NetworkConnectionInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileSubtype() {
        this.bitField0_ &= -3;
        this.mobileSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkType() {
        this.bitField0_ &= -2;
        this.networkType_ = -1;
    }

    public static NetworkConnectionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileSubtype(c cVar) {
        this.mobileSubtype_ = cVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkType(d dVar) {
        this.networkType_ = dVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31877a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new NetworkConnectionInfo();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "networkType_", d.j(), "mobileSubtype_", c.j()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (NetworkConnectionInfo.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c getMobileSubtype() {
        c cVarB = c.b(this.mobileSubtype_);
        return cVarB == null ? c.UNKNOWN_MOBILE_SUBTYPE : cVarB;
    }

    public d getNetworkType() {
        d dVarB = d.b(this.networkType_);
        return dVarB == null ? d.NONE : dVarB;
    }

    public boolean hasMobileSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNetworkType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(NetworkConnectionInfo networkConnectionInfo) {
        return (b) DEFAULT_INSTANCE.createBuilder(networkConnectionInfo);
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream, D d10) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer, D d10) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static NetworkConnectionInfo parseFrom(AbstractC3722j abstractC3722j) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static NetworkConnectionInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr, D d10) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream, D d10) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static NetworkConnectionInfo parseFrom(AbstractC3724k abstractC3724k) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static NetworkConnectionInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
