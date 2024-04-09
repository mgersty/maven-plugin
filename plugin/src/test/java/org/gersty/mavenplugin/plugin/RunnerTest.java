package org.gersty.mavenplugin.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunnerTest {

    @Test
    public void test() throws MojoExecutionException, MojoFailureException {

        MavenS3Mojo mojo = new MavenS3Mojo();
        mojo.execute();
    }
}
