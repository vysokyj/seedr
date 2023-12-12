package cz.jezry.seedr;

import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;

public class Seedr {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("t", false, "display current time");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
    }

}
