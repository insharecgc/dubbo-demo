package com.inshare.dubbo.consumer.thrift;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.ArrayList;

public class ThriftTestClient {
    public static final int SERVER_PORT = 9090;
    public static final String SERVER_IP = "localhost";

    public void startClient() {
        TTransport tTransport = null;
        try {
            tTransport = new TSocket(SERVER_IP, SERVER_PORT);
            // 协议要和服务端一致
            TProtocol protocol = new TBinaryProtocol(tTransport);
            ThriftTestService.Client client = new ThriftTestService.Client(
                    protocol);
            tTransport.open();

            DataInStruct data = new DataInStruct();
            data.a = 123.898;
            data.c = 88;
            data.b = new ArrayList<>();
            BaseStruct bb1 = new BaseStruct();
            bb1.a = "strbase1";
            bb1.b = 16;
            bb1.c = 44.5;
            BaseStruct bb2 = new BaseStruct();
            bb2.a = "strbase2";
            bb2.b = 11;
            bb2.c = 31.1;
            data.b.add(bb1);
            data.b.add(bb2);

            DataOutStruct result = client.getDateOut(data);
            System.out.println("Thrift client result=" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThriftTestClient client = new ThriftTestClient();
        client.startClient();
    }
}
