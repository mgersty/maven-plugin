package org.gersty.mavenplugin.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Mojo(name = "upload")
public class MavenS3Mojo extends AbstractMojo {
        Logger logger = LoggerFactory.getLogger(MavenS3Mojo.class);
        @Parameter(property = "location")
        private String location;
        public void execute() throws MojoExecutionException, MojoFailureException {
           logger.info("********* Hello World ************");
        }
}
