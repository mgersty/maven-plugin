package org.gersty.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Mojo(name = "generate")
public class ModelGeneratorMojo extends AbstractMojo {
        Logger logger = LoggerFactory.getLogger(ModelGeneratorMojo.class);

        @Parameter(property = "sourcePath")
        private String sourcePath;

        @Override
        public void execute() throws MojoExecutionException, MojoFailureException {
                logger.info("********* Hello World ************");
        }
}
