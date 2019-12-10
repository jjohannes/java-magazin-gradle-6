package org.gradle.hello6;

import com.google.common.base.Strings;

public class PrintLoudHelloFromJava {

    public String print(HelloMessage message) {
        var printed = Strings.nullToEmpty(message.getMessage() + " from Gradle 6!");
        printed = Strings.padEnd(printed.toUpperCase(), 100, '!');
        System.out.println(printed);
        return printed;
    }
}
