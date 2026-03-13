package va;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: va.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6076a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f45905a;

    static {
        HashMap map = new HashMap();
        map.put(0, "GATT_SUCCESS");
        map.put(1, "GATT_INVALID_HANDLE");
        map.put(2, "GATT_READ_NOT_PERMIT");
        map.put(3, "GATT_WRITE_NOT_PERMIT");
        map.put(4, "GATT_INVALID_PDU");
        map.put(5, "GATT_INSUF_AUTHENTICATION");
        map.put(6, "GATT_REQ_NOT_SUPPORTED");
        map.put(7, "GATT_INVALID_OFFSET");
        map.put(8, "GATT_INSUF_AUTHORIZATION or GATT_CONN_TIMEOUT");
        map.put(9, "GATT_PREPARE_Q_FULL");
        map.put(10, "GATT_NOT_FOUND");
        map.put(11, "GATT_NOT_LONG");
        map.put(12, "GATT_INSUF_KEY_SIZE");
        map.put(13, "GATT_INVALID_ATTR_LEN");
        map.put(14, "GATT_ERR_UNLIKELY");
        map.put(15, "GATT_INSUF_ENCRYPTION");
        map.put(16, "GATT_UNSUPPORT_GRP_TYPE");
        map.put(17, "GATT_INSUF_RESOURCE");
        map.put(19, "GATT_CONN_TERMINATE_PEER_USER");
        map.put(22, "GATT_CONN_TERMINATE_LOCAL_HOST");
        map.put(34, "GATT_CONN_LMP_TIMEOUT");
        map.put(62, "GATT_CONN_FAIL_ESTABLISH");
        map.put(135, "GATT_ILLEGAL_PARAMETER");
        map.put(128, "GATT_NO_RESOURCES");
        map.put(129, "GATT_INTERNAL_ERROR");
        map.put(130, "GATT_WRONG_STATE");
        map.put(131, "GATT_DB_FULL");
        map.put(132, "GATT_BUSY");
        map.put(133, "GATT_ERROR");
        map.put(134, "GATT_CMD_STARTED");
        map.put(136, "GATT_PENDING");
        map.put(137, "GATT_AUTH_FAIL");
        map.put(138, "GATT_MORE");
        map.put(139, "GATT_INVALID_CFG");
        map.put(140, "GATT_SERVICE_STARTED");
        map.put(141, "GATT_ENCRYPED_NO_MITM");
        map.put(142, "GATT_NOT_ENCRYPTED");
        map.put(143, "GATT_CONGESTED");
        map.put(253, "GATT_CCC_CFG_ERR");
        map.put(254, "GATT_PRC_IN_PROGRESS");
        map.put(255, "GATT_OUT_OF_RANGE");
        map.put(256, "GATT_CONN_CANCEL");
        f45905a = Collections.unmodifiableMap(map);
    }

    public static String a(int i10) {
        String str = (String) f45905a.get(Integer.valueOf(i10));
        return str == null ? "UNKNOWN" : str;
    }
}
