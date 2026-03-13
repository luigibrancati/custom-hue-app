package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.webrtc.DataPacketCryptor;
import org.webrtc.DataPacketCryptorFactory;
import org.webrtc.FrameCryptorKeyProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class FlutterDataPacketCryptor {
    private static final String TAG = "FlutterDataPacketCryptor";
    private final Map<String, DataPacketCryptor> dataCryptos = new HashMap();
    private final FlutterRTCFrameCryptor frameCryptor;

    public FlutterDataPacketCryptor(FlutterRTCFrameCryptor flutterRTCFrameCryptor) {
        this.frameCryptor = flutterRTCFrameCryptor;
    }

    private void createDataPacketCryptor(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider keyProvider = this.frameCryptor.getKeyProvider((String) map.get("keyProviderId"));
        if (keyProvider == null) {
            result.error("createDataPacketCryptorFailed", "keyProvider not found", null);
            return;
        }
        if (map.get("algorithm") == null) {
            result.error("createDataPacketCryptorFailed", "algorithm is null", null);
            return;
        }
        DataPacketCryptor dataPacketCryptorCreateDataPacketCryptor = DataPacketCryptorFactory.createDataPacketCryptor(this.frameCryptor.frameCryptorAlgorithmFromInt(((Integer) map.get("algorithm")).intValue()), keyProvider);
        if (dataPacketCryptorCreateDataPacketCryptor == null) {
            result.error("createDataPacketCryptorFailed", "createDataPacketCryptor failed", null);
            return;
        }
        String string = UUID.randomUUID().toString();
        this.dataCryptos.put(string, dataPacketCryptorCreateDataPacketCryptor);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("dataCryptorId", string);
        result.success(constraintsMap.toMap());
    }

    private void dataPacketCryptorDecrypt(Map<String, Object> map, MethodChannel.Result result) {
        String str = (String) map.get("dataCryptorId");
        if (str == null) {
            result.error("dataPacketCryptorEncryptFailed", "dataCryptorId is null", null);
            return;
        }
        DataPacketCryptor dataPacketCryptor = this.dataCryptos.get(str);
        if (dataPacketCryptor == null) {
            result.error("dataPacketCryptorEncryptFailed", "dataPacketCryptor not found", null);
            return;
        }
        String str2 = (String) map.get("participantId");
        if (str2 == null) {
            result.error("dataPacketCryptorEncryptFailed", "participantId is null", null);
            return;
        }
        byte[] bArr = (byte[]) map.get("data");
        if (bArr == null) {
            result.error("dataPacketCryptorEncryptFailed", "data is null", null);
            return;
        }
        byte[] bArr2 = (byte[]) map.get("iv");
        if (bArr2 == null) {
            result.error("dataPacketCryptorEncryptFailed", "iv is null", null);
            return;
        }
        int iIntValue = ((Integer) map.get("keyIndex")).intValue();
        if (iIntValue < 0) {
            result.error("dataPacketCryptorEncryptFailed", "keyIndex is invalid", null);
            return;
        }
        byte[] bArrDecrypt = dataPacketCryptor.decrypt(str2, new DataPacketCryptor.EncryptedPacket(bArr, bArr2, iIntValue));
        if (bArrDecrypt == null) {
            result.error("dataPacketCryptorDecryptFailed", "decrypt failed", null);
            return;
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte("data", bArrDecrypt);
        result.success(constraintsMap.toMap());
    }

    private void dataPacketCryptorDispose(Map<String, Object> map, MethodChannel.Result result) {
        String str = (String) map.get("dataCryptorId");
        if (str == null) {
            result.error("dataPacketCryptorDisposeFailed", "dataCryptorId is null", null);
            return;
        }
        DataPacketCryptor dataPacketCryptorRemove = this.dataCryptos.remove(str);
        if (dataPacketCryptorRemove == null) {
            result.error("dataPacketCryptorDisposeFailed", "dataPacketCryptor not found", null);
        } else {
            dataPacketCryptorRemove.dispose();
            result.success(null);
        }
    }

    private void dataPacketCryptorEncrypt(Map<String, Object> map, MethodChannel.Result result) {
        String str = (String) map.get("dataCryptorId");
        if (str == null) {
            result.error("dataPacketCryptorEncryptFailed", "dataCryptorId is null", null);
            return;
        }
        DataPacketCryptor dataPacketCryptor = this.dataCryptos.get(str);
        if (dataPacketCryptor == null) {
            result.error("dataPacketCryptorEncryptFailed", "dataPacketCryptor not found", null);
            return;
        }
        String str2 = (String) map.get("participantId");
        if (str2 == null) {
            result.error("dataPacketCryptorEncryptFailed", "participantId is null", null);
            return;
        }
        byte[] bArr = (byte[]) map.get("data");
        if (bArr == null) {
            result.error("dataPacketCryptorEncryptFailed", "data is null", null);
            return;
        }
        int iIntValue = ((Integer) map.get("keyIndex")).intValue();
        if (iIntValue < 0) {
            result.error("dataPacketCryptorEncryptFailed", "keyIndex is invalid", null);
            return;
        }
        DataPacketCryptor.EncryptedPacket encryptedPacketEncrypt = dataPacketCryptor.encrypt(str2, iIntValue, bArr);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putInt("keyIndex", encryptedPacketEncrypt.keyIndex);
        constraintsMap.putByte("data", encryptedPacketEncrypt.payload);
        constraintsMap.putByte("iv", encryptedPacketEncrypt.iv);
        result.success(constraintsMap.toMap());
    }

    public boolean handleMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        Map<String, Object> map = (Map) methodCall.arguments;
        if (str.equals("createDataPacketCryptor")) {
            createDataPacketCryptor(map, result);
            return true;
        }
        if (str.equals("dataPacketCryptorEncrypt")) {
            dataPacketCryptorEncrypt(map, result);
            return true;
        }
        if (str.equals("dataPacketCryptorDecrypt")) {
            dataPacketCryptorDecrypt(map, result);
            return true;
        }
        if (!str.equals("dataPacketCryptorDispose")) {
            return false;
        }
        dataPacketCryptorDispose(map, result);
        return true;
    }
}
