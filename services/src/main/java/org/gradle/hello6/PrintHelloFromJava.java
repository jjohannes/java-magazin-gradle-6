package org.gradle.hello6;

import org.apache.commons.lang3.ObjectUtils;

public class PrintHelloFromJava {

    public String print(HelloMessage message) {
        var printed = ObjectUtils.defaultIfNull(message.getMessage() + " from Gradle 6!", "");
        System.out.println(printed);
        return printed;
    }
}
