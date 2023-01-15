package org.apache.rpc;

import java.io.IOException;

public class DemoServiceImpl implements DemoService {

    public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
        return 1;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

}
