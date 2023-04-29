package org.gersty.maven_s3_plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="upload")
public class MavenS3Mojo extends AbstractMojo {
    @Parameter(property="location")
    private String location;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println(this.location);
    }
}
